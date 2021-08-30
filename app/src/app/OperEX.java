package app;

/* 연산자
 산술: +, -, /, %, *
 가감: ++, --
 비교: <, <=, >, >=, ==, !=, instance of
 비트: &,, |
 논리: &&, ||
 상향: expr? expr:expr
 */
/*데이터 연산자
 수학적 (산술)연산자 표현
 + => 더하기
 - => 마이너스
 * => 곱하기
 / => 나누기
 % => 나머지
 */

public class OperEX {

	public static void main(String[] args) {
		
//대입 연산자 ( 여기로 <- 여기에서)
		 int su = 10;
		 System.out.println("su = "+su);
		 
		 //이런 형태도 가능
		 int su1 = 10, su2 = 20;
		 int result = 0;
		 
		 //더하고 대입하고
		 result = su1 + su2;
		 System.out.println("result = "+result);
		 
		 //빼기 곱하기
		 int result3 = su1 - su2;
		 System.out.println("result3 = "+ result3);
		 
		 int result4 = su1 * su2;
		 System.out.println("result4 = " + result4);
		 
		 //실수 몫과 나머지
		 double a = 10.3;
		 double b = 1.2;
		 double result1;
		 double result2;
		 result1 = a/b;
		 result2 = a%b;
		 System.out.println("result1 = "+result1);
		 System.out.println("result2 = "+result2);
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 

	}

}
