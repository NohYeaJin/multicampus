package app;
/* �������̽�(interface)
 - ��ü�� ������ �� ����
 - class���� ��ӽ� implements Ű���� ��� 
 - ���� ����� ������
 - interface���� ����� �߻�޼ҵ常 ����
 - interface���� ��ӽÿ��� extends ���
 - �Ϲ����� �޼ҵ带 ���� �� ���� 
 - ��ӽ� interface�� �ִ� ��� �޼ҵ带 �������Ͽ� ���
 - interface�� ���ǵ� �޼ҵ� �� �ϳ��� ���������� �ʴ´ٸ� abstract class�� ������ �� ����
 */

/*	interface A{
 		����: [final][static] -> �����Ǿ� ����.
 		ex) int A = 10;
 		
 		�޼ҵ�: [public][abstract] -> �����Ǿ� ����.
 		ex) void method();
 		}
 		
 	��� 1)
 	abstract class A implements B{
 		�߻� �޼��� ����...
 		�Ϲ� �޼��� ����...
 	}
 	
 	���2)
 	class C implements A{
 	 	�������̽��� �����ϴ� �޼��带 ����...
 	 	�׷��� �� ���, �������̽��� �ִ� �� ���� override
 	 }
 	 
 	 ���3)
 	 class D extends C implements A{}
 	 class D extends C implements A, B, C... {}
 	 
 	 ���4)
 	 interface A extends B (�������̽��� ����� ���� extends ���)
 */

public class InterfaceEx extends AbstractC implements InterfaceA,InterfaceB{
	//,��� ���߻���� �ȴ�
	
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
		//obj.A = 20; => ��� �����̶� ������ ����, ���� �Ұ���
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
