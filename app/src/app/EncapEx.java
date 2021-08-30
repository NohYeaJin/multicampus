package app;

/*
 ����������(Access Modifiers)
 -��ü�� ����� �����ϱ� ���� ������
 ����) 
 - private, public, protected, default(friendly)
 - private �� ���� ���� ö��
 - Ŭ���� ǥ��
 	[����������] class Ŭ������
 - �޼ҵ� ǥ��
 	[���� ������] [�ڷ���] ����Ÿ�� �޼ҵ��(���ڵ�)
 - ���� ǥ��
 	[���� ������] [�ڷ���] ������;
 - ������ ǥ��
 	[���� ������] Ŭ������(���ڵ�) 
 */


//���� ��Ű�� �ֱ� ������ a,b,c�� ���� ���� 
public class EncapEx {

	public static void main(String[] args) {
		Encap encap = new Encap();
		
		System.out.println(encap.a);
		System.out.println(encap.b);
		System.out.println(encap.c);
		//System.out.println(encap.d);
		
		//�Լ��� ���ؼ� �޽��� ���� (��ȣ interaction)
		encap.setD(10);
		System.out.println(encap.getD());


	}

}

class Encap {
	public int a = 10;
	protected int b = 20;
	int c = 30;
	private int d = 40;
	
	public void setD(int d) {
		this.d = d;
		
	}
	public int getD() {
		return this.d;
	}
}
