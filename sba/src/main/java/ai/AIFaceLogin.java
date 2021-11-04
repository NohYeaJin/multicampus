package ai;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;

import com.google.gson.JsonObject;

import net.minidev.json.JSONArray;
import net.minidev.json.JSONObject;
import net.minidev.json.parser.JSONParser;

public class AIFaceLogin {

	public static String aiface(String img) {
		String result = null;
		StringBuffer reqStr = new StringBuffer();
		String clientId = "rhlar1oiwe";// 애플리케이션 클라이언트 아이디값";
		String clientSecret = "6WBUM2qu9o4qceTPETjJBVrum5DIgjmTQygc7Zm4";// 애플리케이션 클라이언트 시크릿값";

		try {
			String paramName = "image"; // 파라미터명은 image로 지정
			String imgFile = img;
			// String imgFile = "C:\\work2\\sba\\myphoto.jpg";
			File uploadFile = new File(imgFile);
			String apiURL = "https://naveropenapi.apigw.ntruss.com/vision/v1/celebrity"; // 유명인 얼굴 인식
			URL url = new URL(apiURL);
			HttpURLConnection con = (HttpURLConnection) url.openConnection();
			con.setUseCaches(false);
			con.setDoOutput(true);
			con.setDoInput(true);
			// multipart request
			String boundary = "---" + System.currentTimeMillis() + "---";
			con.setRequestProperty("Content-Type", "multipart/form-data; boundary=" + boundary);
			con.setRequestProperty("X-NCP-APIGW-API-KEY-ID", clientId);
			con.setRequestProperty("X-NCP-APIGW-API-KEY", clientSecret);
			OutputStream outputStream = con.getOutputStream();
			PrintWriter writer = new PrintWriter(new OutputStreamWriter(outputStream, "UTF-8"), true);
			String LINE_FEED = "\r\n";
			// file 추가
			String fileName = uploadFile.getName();
			writer.append("--" + boundary).append(LINE_FEED);
			writer.append("Content-Disposition: form-data; name=\"" + paramName + "\"; filename=\"" + fileName + "\"")
					.append(LINE_FEED);
			writer.append("Content-Type: " + URLConnection.guessContentTypeFromName(fileName)).append(LINE_FEED);
			writer.append(LINE_FEED);
			writer.flush();
			FileInputStream inputStream = new FileInputStream(uploadFile);
			byte[] buffer = new byte[4096];
			int bytesRead = -1;
			while ((bytesRead = inputStream.read(buffer)) != -1) {
				outputStream.write(buffer, 0, bytesRead);
			}
			outputStream.flush();
			inputStream.close();
			writer.append(LINE_FEED).flush();
			writer.append("--" + boundary + "--").append(LINE_FEED);
			writer.close();
			BufferedReader br = null;
			int responseCode = con.getResponseCode();
			if (responseCode == 200) { // 정상 호출
				br = new BufferedReader(new InputStreamReader(con.getInputStream()));
			} else { // 오류 발생
				System.out.println("error!!!!!!! responseCode= " + responseCode);
				br = new BufferedReader(new InputStreamReader(con.getInputStream()));
			}
			String inputLine;
			if (br != null) {
				StringBuffer response = new StringBuffer();
				while ((inputLine = br.readLine()) != null) {
					response.append(inputLine);
				}

				br.close();
				JSONParser jsonParse = new JSONParser(); // JSONParse에 json데이터를 넣어 파싱한 다음 JSONObject로 변환한다. JSONObject

				JSONObject jsonObj = (JSONObject) jsonParse.parse(response.toString());
				JSONArray personArray = (JSONArray) jsonObj.get("faces");
				String arr = "";
				for (int i = 0; i < personArray.size(); i++) {
					JSONObject personObject = (JSONObject) personArray.get(i);
					System.out.println(personObject.get("celebrity"));
					arr = personObject.get("celebrity").toString();
				}
				JSONObject jsonObj2 = (JSONObject) jsonParse.parse(arr);			
				
				//JSONArray personArray2 = (JSONArray) jsonObj.get("celebrity");
				String value = "";
				Number value2 = 0;

				
				value = jsonObj2.getAsString("value");
				value2 = jsonObj2.getAsNumber("confidence");
				int value3 = value2.intValue();
				if(value3>=0.5) {
					result = value;
				}else {
					result= "fail";
				}
			

			} else {
				System.out.println("error !!!");
			}
		} catch (Exception e) {
			System.out.println(e);
		}
		return result;
	}

}
