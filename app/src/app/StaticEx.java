package app;


/* ��Ÿ������(������)
 final:
 	- class: ����� �ȵ�
 	- method: ������ �ȵ�
 	- variable ���ȭ
 	
 static: 
 	- ��ü ���� ���� ��밡��(���� �޸𸮿� ����)
 abstract:
 	- class: �߻�޼ҵ�
 	- method: �߻�޼ҵ� 
 	
 	[������][����������]...
 * */
public class StaticEx {
	//��� (�Ϲ������� ����� �빮�ڷθ�) 
	public final int A = 10;
	public static int B = 20;
	public final static int C = 30;
	public static void method() {
		System.out.println("method");
	}
	public static void main(String[] args) {
		StaticEx se = new StaticEx();
		System.out.println(se.C);
		//System.out.println(new StaticEx().C);
		//�����Ͱ� ���� (but ��ȸ�뼺��)
		
		//�̰͵� ����
		//�⺻�� Ŭ������ �̸����� ã�� �� �ִ�
		System.out.println(StaticEx.B);
		StaticEx.method();
	}

}
