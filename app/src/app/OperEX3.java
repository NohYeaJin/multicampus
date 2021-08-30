package app;

/*
 삼항연산자 - 형식
 데이터형 변수 = 조건식? 값1: 값2;
 참일 때 값1 실행, 거짓일 때 값2 실행
 */
public class OperEX3 {

	public static void main(String[] args) {
		int c = 8;
		int b = 4;
		//값1과 값 2는 데이터 타입에 맞는 값이 와야 한다
		int a = 3 > 5 ? 10 : 20;
		char d = 3 < 5 ? 'C':'A';
		a = b < c ? c : b;
		boolean result = 3 > 5 ? true : false;

	}

}
