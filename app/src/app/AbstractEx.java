package app;

/* �߻�(abstract)(��ɸ� ���� ����)
 * �� ���� ���� ���� bark();, �ڼ��� ������ ���� ���� bark(){~~}
 *  *��ü�� ��ȣ���� Ŭ������ ǥ���ϱ� ����
 * Ư¡
 	- class�� ���� �߻� class�� �ǹ�(ex: abstract class)
 	- �Ϲ� �޼���� �߻� �޼��� ��� ������
 	- ��ü�� ������ �� ����
 	- ��� ���迡�� ������ �� 
 	- ���� �͸� Ŭ���� (���� anonymous class) �� ��ü ������ ���� ���� 
 	- �߻� �޼���� �������� �ʴ´�.
 	- �߻� �޼���� �ݵ�� ������(override)�ؼ� �����(interface�� ����)
 	- ��ӽ� extends keyword�� �����
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
		
		//���� �͸� Ŭ���� (��ӵ��� �ʰ� ���̷�Ʈ�� ����)
		new abs() {
			public void methodB() {
			}
		};
		
	}

	@Override
	public void methodB() {
		
	}

	// override�� �ؾ߸� ������ �ȳ���(��ȣ�� ������ ���ǵǾ�� �Ѵ�)
	/*
	@Override
	public void methodB() {
		System.out.println("�߻� �޼ҵ� ������");
	}
	*/

}

abstract class abs {
	int a = 10;

	public void methodA() {
		System.out.println("�Ϲ� �޼ҵ� ����");
	}

	public abstract void methodB();
	
}
