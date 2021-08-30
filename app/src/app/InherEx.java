package app;

/* 상속(inheritance)
	상속이란 자식이 부모가 가지고 있는 재산이나 권력을 물려받는다는 의미.
	- 특정(자식) 클래스는 다른(부모)클래스가 가지고 있는 모든 멤버 변수나 멤버메소드를 사용할 수 있음.
	- 상속 관계에서 자식클래스의 객체를 생성 하였을 때 부모 클래스의 객체도 생성되어 짐.
	- 상속 관계 표현으로 extends keyword를 사용함.
	- 상속 관계 용여로 super, 상위, 부모 class와 sub, 하위, 자식 class로 사용함. 
	- 상속의 개념에서 super와 this를 구분함.
	- 메소드를 재사용할 수 있음(method override)
	- 단일 상속(자바에서는 다중 상속X)
	- extends와 implements를 함께 사용할 수 있음 
	class A extends B{
	구문;
	}
	
 
 */

public class InherEx extends SuperClass{
	
	int c = 20;
	public InherEx() {
		super();
		System.out.println("inher"+this.a);
		//this.a 가능, this.c가능
		//super.c 불가능(부모클래스니까)
		//super.a 가능
		
	}
	@Override
	public void method(int b) {//public
		System.out.println(b);
	}
		
	public static void main(String[] args) {
		InherEx inher = new InherEx();
		System.out.println(inher.a);
		System.out.println(inher.b);
		System.out.println(inher.c);
		inher.method(3);
		//print inher
	}
}

class SuperClass{
	int a = 10;
	String b = "B";
	public SuperClass(){
		System.out.println("SuperClass");
	}
	
	public void method(int a) {
		System.out.println("this is method"+a);
	}
	
	
}
