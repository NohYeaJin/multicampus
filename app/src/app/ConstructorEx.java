package app;

public class ConstructorEx {
	
	int i;
	
	public ConstructorEx() {
		this(100);
		//���� constructorEX(int a)�� �ǹ�
		//int a �ڸ��� 100�� ���� 
		//this.i�� �����Ǿ� ����
		i = 50;
	}
	
	public ConstructorEx(int a) {
		this("A");
		System.out.println("a:"+a);
	}
	
	public ConstructorEx(String s) {
		System.out.println("s = "+s);
	}
	
	//this is overloading
	//��ȣ�� int a �߰� 



	public static void main(String[] args) {
		//100�� int a�� ���� �ȴ�
		ConstructorEx c= new ConstructorEx();
		//���� ������ int a �ִ� ������ ȣ��Ǿ��� ������
		//i = 0���� ���´�
		System.out.println(c.i);
		
		//�Ѵ� ȣ���Ϸ��� this�� ����ؾ� 
		
		
		//���: �Ű����� ���� �����ϸ� �Ű����� ���� ������ �θ���
		//�Ű����� ������ �Ű� ���� �ִ°ɷ� �θ���
	}
}
