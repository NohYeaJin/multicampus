package app;

/*
 비교 연산자
 <
 >
 <=
 >=
 ==
 !=
 !
 instanceof
 */

public class OperEX2 {

	public static void main(String[] args) {
		//우선순위 (true -> false)
		//조건문, 분기문 사용할 때 자주 사용
		System.out.println(!(3 > 2));
		
		boolean result,result1;
		result = (3==2);
		result1 = (2==2);
		System.out.println("result: " + result);
		System.out.println("result1: " + result1);
		
		result = !result;
		result = result != result1;
		
		
		System.out.println(3!=2);
		System.out.println(3>=2);
		System.out.println(2>=2);
		System.out.println(2<=2);
		System.out.println(2<2);
		

	}

}
