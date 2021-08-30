package app;

/* 추상(abstract)(기능만 명세해 놓자)
 * 얜 뭐가 올지 몰라 bark();, 자세히 구문들 명세할 수도 bark(){~~}
 *  *객체의 모호함을 클래스로 표현하기 위함
 * 특징
 	- class에 사용시 추상 class의 의미(ex: abstract class)
 	- 일반 메서드와 추상 메서드 사용 가능함
 	- 객체를 생성할 수 없음
 	- 상속 관계에서 재정의 함 
 	- 내부 익명 클래스 (무명 anonymous class) 로 객체 생성할 수는 있음 
 	- 추상 메서드는 구현하지 않는다.
 	- 추상 메서드는 반드시 재정의(override)해서 사용함(interface도 동일)
 	- 상속시 extends keyword를 사용함
 	abstract class A{
 	int a;
 		ex) abstract void setA();
 			void setB(){}
 		}
 
 */

public class AbstractEx extends abs {

	public static void main(String[] args) {
		AbstractEx obj = new AbstractEx();
		obj.methodA();
		obj.methodB();
		
		//내부 익명 클래스 (상속되지 않고 다이렉트로 쓴다)
		new abs() {
			public void methodB() {
			}
		};
		
	}

	@Override
	public void methodB() {
		
	}

	// override를 해야만 에러가 안난다(모호한 개념이 정의되어야 한다)
	/*
	@Override
	public void methodB() {
		System.out.println("추상 메소드 재정의");
	}
	*/

}

abstract class abs {
	int a = 10;

	public void methodA() {
		System.out.println("일반 메소드 실행");
	}

	public abstract void methodB();
	
}
