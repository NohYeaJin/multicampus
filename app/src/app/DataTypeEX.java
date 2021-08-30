package app;
/*
 자료형 (data type)
 - 변수 또는 상수가 차지하는 메모리의 양(byte)과 종류를 의미한다.
 - 자바의 자료형은 크게 기본 자료형과 참조형으로 나눌 수 있다.
 	1) 기본형
 	- boolean(true, false): 8 bit(1바이트)
 	- byte: 8비트(1바이트)
 	- short : 16비트 
 	- char: 16비트
 	- int: 32비트
 	- long: 64비트
 	- float: 32비트
 	- double : 64비트
 	
 	2) 참조형
 	- 클래스(class)
 	- 배열(array)
 	- 인터페이스(interface)
 	- 열거(enum)
 */

public class DataTypeEX {
	public static void main(String[] args) {
		
		//boolean 타입
		boolean bool = false;
		System.out.println(bool);
		
		//byte
		byte byte1 = 1;
		System.out.println(byte1);
		
		//float
		float float1 = 1.1f;
		System.out.println(float1);
		
		//double 대소문자
		double double1 = 1.1D;
		double double2 = 1.1d;
		System.out.println(double1);
		System.out.println(double2);
		
		//char형, string형
		char char1 = 'a';
		String string1 = "Hello String";
		System.out.println(char1);
		System.out.println(string1);
		
		//String의 한계?
		String string2 = "dddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddd";
		System.out.println(string2);
		
		//short형, int형(0000이 가능한가)
		//결과: 0으로 나옴
		short short1 = 10000;
		int int1 = 0000;
		System.out.println(short1);
		System.out.println(int1);
		
		//long, double의 한계
		//하단의 숫자에서 0 더 못늘림
		long long1 = 1000000;
		double double3 = 1000000000;
		System.out.println(long1);
		System.out.println(double3);
		
		

	}

}
