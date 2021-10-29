package ai;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;

import net.minidev.json.JSONObject;
import net.minidev.json.parser.JSONParser;

public class Main {

	public static String loginAudio() {
        String clientId = "rhlar1oiwe";//애플리케이션 클라이언트 아이디값";
        String clientSecret = "6WBUM2qu9o4qceTPETjJBVrum5DIgjmTQygc7Zm4";//애플리케이션 클라이언트 시크릿값";
        String result = null;
        try {
            String imgFile = "C:\\work2\\sba\\login2.mp3";
            File voiceFile = new File(imgFile);

            String language = "Kor";        // 언어 코드 ( Kor, Jpn, Eng, Chn )
            String apiURL = "https://naveropenapi.apigw.ntruss.com/recog/v1/stt?lang=" + language;
            URL url = new URL(apiURL);

            HttpURLConnection conn = (HttpURLConnection)url.openConnection();
            conn.setUseCaches(false);
            conn.setDoOutput(true);
            conn.setDoInput(true);
            conn.setRequestProperty("Content-Type", "application/octet-stream");
            conn.setRequestProperty("X-NCP-APIGW-API-KEY-ID", clientId);
            conn.setRequestProperty("X-NCP-APIGW-API-KEY", clientSecret);

            OutputStream outputStream = conn.getOutputStream();
            FileInputStream inputStream = new FileInputStream(voiceFile);
            byte[] buffer = new byte[4096];
            int bytesRead = -1;
            while ((bytesRead = inputStream.read(buffer)) != -1) {
                outputStream.write(buffer, 0, bytesRead);
            }
            outputStream.flush();
            inputStream.close();
            BufferedReader br = null;
            int responseCode = conn.getResponseCode();
            if(responseCode == 200) { // 정상 호출
                br = new BufferedReader(new InputStreamReader(conn.getInputStream()));
            } else {  // 오류 발생
                System.out.println("error!!!!!!! responseCode= " + responseCode);
                br = new BufferedReader(new InputStreamReader(conn.getInputStream()));
            }
            String inputLine;

            if(br != null) {
                StringBuffer response = new StringBuffer();
                while ((inputLine = br.readLine()) != null) {
                    response.append(inputLine);
                }
                br.close();
                
                System.out.println(response.toString());
                JSONParser parser = new JSONParser();
                Object obj = parser.parse( response.toString() );
                JSONObject jsonObj = (JSONObject) obj;
                String code = (String) jsonObj.get("text");
                String[] tokens = code.split(" ");
                result =  tokens[0];
            } else {
                System.out.println("error !!!");
            }
        } catch (Exception e) {
            System.out.println(e);
        }
		return result;
    }
		
	
    public static void main(String[] args) {
    	loginAudio();
    }
}
