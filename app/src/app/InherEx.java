package app;

/* ���(inheritance)
	����̶� �ڽ��� �θ� ������ �ִ� ����̳� �Ƿ��� �����޴´ٴ� �ǹ�.
	- Ư��(�ڽ�) Ŭ������ �ٸ�(�θ�)Ŭ������ ������ �ִ� ��� ��� ������ ����޼ҵ带 ����� �� ����.
	- ��� ���迡�� �ڽ�Ŭ������ ��ü�� ���� �Ͽ��� �� �θ� Ŭ������ ��ü�� �����Ǿ� ��.
	- ��� ���� ǥ������ extends keyword�� �����.
	- ��� ���� �뿩�� super, ����, �θ� class�� sub, ����, �ڽ� class�� �����. 
	- ����� ���信�� super�� this�� ������.
	- �޼ҵ带 ������ �� ����(method override)
	- ���� ���(�ڹٿ����� ���� ���X)
	- extends�� implements�� �Բ� ����� �� ���� 
	class A extends B{
	����;
	}
	
 
 */

public class InherEx extends SuperClass{
	
	int c = 20;
	public InherEx() {
		super();
		System.out.println("inher"+this.a);
		//this.a ����, this.c����
		//super.c �Ұ���(�θ�Ŭ�����ϱ�)
		//super.a ����
		
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
