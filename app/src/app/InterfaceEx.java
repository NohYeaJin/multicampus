package app;
/* 인터페이스(interface)
 - 객체를 생성할 수 없음
 - class에서 상속시 implements 키워드 사용 
 - 다중 상속이 가능함
 - interface에는 상수와 추상메소드만 존재
 - interface간의 상속시에는 extends 사용
 - 일반적인 메소드를 가질 수 없음 
 - 상속시 interface에 있는 모든 메소드를 재정의하여 사용
 - interface에 정의된 메소드 중 하나라도 재정의하지 않는다면 abstract class로 정의할 수 있음
 */

/*	interface A{
 		변수: [final][static] -> 생략되어 있음.
 		ex) int A = 10;
 		
 		메소드: [public][abstract] -> 생략되어 있음.
 		ex) void method();
 		}
 		
 	사용 1)
 	abstract class A implements B{
 		추상 메서드 정의...
 		일반 메서드 정의...
 	}
 	
 	사용2)
 	class C implements A{
 	 	인터페이스에 존재하는 메서드를 정의...
 	 	그러나 이 경우, 인터페이스에 있는 것 전부 override
 	 }
 	 
 	 사용3)
 	 class D extends C implements A{}
 	 class D extends C implements A, B, C... {}
 	 
 	 사용4)
 	 interface A extends B (인터페이스를 상속할 때는 extends 사용)
 */

public class InterfaceEx extends AbstractC implements InterfaceA,InterfaceB{
	//,찍고 다중상속이 된다
	
	@Override
	public String methodB() {
		return "methodB";
	}

	@Override
	public void methodA() {
		
	}
	
	public static void main(String[] args) {
		InterfaceEx obj = new InterfaceEx();
		obj.methodA();
		String msg = obj.methodB();
		System.out.println(msg);
		obj.methodC();
		//obj.A = 20; => 상수 개념이라서 에러가 난다, 변경 불가능
	}

}

interface InterfaceA{
	int A = 10;
	 void methodA();
}

interface InterfaceB{
	int B = 20;
	String methodB();
}

abstract class AbstractC{
	void methodC() {
		System.out.println("methodc");
	}
}
