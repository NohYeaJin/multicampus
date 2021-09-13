package api;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 용어:
 - 스트림: 일반적으로 데이터, 패킷 등의 일련의 연속성을 갖는 흐름을 말한다. (흐르는 데이터 - 물의 흐름)
 - 입출력 스트림: 데이터를 읽고 쓰는 구조를 프로그램의 구조로 모델링 해놓은 것
 - 버퍼: 데이터를 임시적으로 담아두는 공간 
 
 *문자 (character stream) 문자 최상위 스트림
 - Reader class
  입력 스트림: 문자 데이터를 읽어들이는 스트림
 - writer class
  출력 스트림: 문자 데이터를 출력하는 스트림
  
  * 바이트(byte) 바이트 최상위 스트림
  - InputStream Class
  입력 스트림: 바이트 데이터를 읽어오는 스트림
  (입력 최상위 스트림)
  - OutputStream Class
   출력 스트림: 바이트 데이터를 출력하기 위한 스트림
   (출력 최상위 스트림)
 
 */

public class IOEx {

	public static void main(String[] args) {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("입력:");
		char c = ' ';
		try {
			c = (char) System.in.read();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("출력: " + c);
	}

}
