package app;

class C {
	int num = 10;
	String msg = "msg...";

	public C() {
		System.out.println("C");
	}

	public void method() {
		System.out.println("method " + num);
	}

	public void method_C() {
		System.out.println("method_C " + num);
	}
}

class B extends C {
	public B() {
		super();
		System.out.println("B");
	}

	int num = 50;
	@Override
	public void method() {
		super.method_C();
		this.method_C();
		System.out.println("method " + num);
	}
	
	public void method_B() {
		System.out.println("method_B " + msg);
	}
}

class AA extends B {
	public AA() {
		
		//super().super();
		System.out.println("A ");
	}
	public void method_A() {
		System.out.println("method_A "+msg);
	}
	@Override
	public void method() {
		//System.out.println("method_A"+msg);
	}

}

public class InherEx2 {

	public static void main(String[] args) {
		AA a = new AA();
		B b = a;
		C c = b;
		a.method();
		//a.method 아무것도 안나옴
		a.method_A();
		a.method_C();
		System.out.println(a.num);
		System.out.println(c.num);
		
		//강제 형변환(reference에서의 강제 형변환)
		AA z = (AA)c;
		AA y = (AA)b;
		B h = (B)c;
		
		Object o = a;
		Object o2 = a;
		Object o3 = a;
		
		//기본형(정수만 넣을 수 있음)
		int[] abc = new int[2];
		//참조형(다양하게 넣을 수 있음, 클래스도 넣을 수 있음)
		Object[] obj = new Object[2];
		
		abc[0] = 10;
		obj[0] = c;
		
		//불 가능: A k = obj[0];
		//가능: Object k = obj[0];
		//가능: A k = (A)obj[0];
	}

}
