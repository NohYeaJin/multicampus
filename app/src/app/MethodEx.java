package app;


/*
 형식)
 - [접근 제어자,접근 지정자][수정자][반환명]메소드명(인자들){
 		실행 구문(구현);
 	}
 	접근제어자(Modifiers): private, default(friendly), protected, public
 	수정자: static, final, abstract, native . . .
 	반환형은 필수!
 	void로 오면 void에 맞는 메소드로 인식 (반환타입이 있거나 , 반환타입이 없거나)
 	반환형(return type): 
 			- 자바 데이터 자료형(기본형, 참조형) 전부 사용할 수 있다
 			- void: 반환형이 없는 메소드 정의시 사용 
 	메소드명: 식별자로 임의의 이름 정의 
 	매개변수(arguments): 매개 변수라고도 하며 메소드 호출시 데이터를 전달하기 위한 용도로 사용함 
 	메소드 호출 = 메소드를 사용한다 (만들어진 메소드가 실행이 되게 한다)
 	ex)
 	public int method1(){
 		int su;
 		return su;
 	}
 	=> 직접 만든 메소드를 '사용자 정의 메소드' 라고 한다 
 	=> 이 경우 int값 리턴안하면 에러가 뜬다
 	void main(){}도 가능 
 	return은 무조건 함수의 맨 마지막에 나온다
 	
 	ex1)
 	int method1(){
 		실행구문;
 		return 값 (int);
 	}
 	
 	ex2) void method(int d){
 		실행구문;
 		int dan = d;
 	}
 	
 	void method2(int a){
 		실행 구문;
 	}
 	
 	함수안에 함수 선언 불가
 	메인 메소드는 내가 부르는 것이 아님 
 	똑같이 생긴 메인 함수를 기계가 부른다 
 */
public class MethodEx {
	//static은 기계가 찾을 수 있는 곳(같은 메모리 공간)
	static int method() {
		return 10;
	}
	
	static void method2() {
		System.out.println("실행구문");
	}
	
	static void method3(int a,String s) {
		System.out.println("실행구문" + a+s);
	}
	
	public static void main(String[] args) {
		int result = method();
		method2();
		method3(40,"dd");
		System.out.println(result);

	}

}
