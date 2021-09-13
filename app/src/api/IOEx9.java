package api;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;

public class IOEx9 {
	/*
	 * public static void main(String[] args) throws IOException{ File file = new
	 * File("C:/work/IOtest.txt"); FileWriter fwriter = new FileWriter(file);
	 * BufferedWriter bw = new BufferedWriter(fwriter); //buffer를 좀 자유롭게 쓰고 싶을 때
	 * //printwriter안에 autoflush가 있음 PrintWriter pw = new PrintWriter(bw,true);
	 * InputStream is = System.in; InputStreamReader isr = new
	 * InputStreamReader(is); BufferedReader br = new BufferedReader(isr);
	 * System.out.print("입력: "); String str = ""; while(!str.equals("end")) { str =
	 * br.readLine(); pw.println(str);
	 * 
	 * } br.close(); pw.close();
	 */
	// 연습문제:파일에 기록된 문자데이터를 화면에 출력하시오.
	//활용문제: 뱅크에 사용자 데이터를 파일로 기록하는 프로그램 작성
	public static void main(String[] args) throws IOException {
		File file = new File("C:/work/IOtest.txt");

		FileReader fr = new FileReader(file);

		String c = " ";
		BufferedReader br = new BufferedReader(fr);
		String str = "";
		while(!str.equals("end")) {
			str = br.readLine();
			System.out.println(str);
		}
		br.close();
	}

}
