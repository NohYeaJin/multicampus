package app;

/*
 논리연산자
 |
 &
 ||
 &&
 boolean result = 조건식1 | 조건식2;
 or연산자는 어느 한쪽이라도 참이 나온다면 참을 도출한다
 */

public class OperEX4 {

	public static void main(String[] args) {
		boolean a;
		boolean b;
		boolean result = 3<5 || 5<3;
		int sum = 0;
		
		// ||사용하기 때문에 sum연산 안함
		//sum = 0
		a = true;
		b = false;
		result = a || 10 > (sum = 3 + 5);
		System.out.println(sum);
		System.out.println(result);
		
		// | 사용하기 때문에 sum 연산함
		//sum = 8
		a = true;
		b = false;
		result = a | 10 > (sum = 3 + 5);
		System.out.println(sum);
		System.out.println(result);
		
		


	}

}
