package app;


/*
 ����)
 - [���� ������,���� ������][������][��ȯ��]�޼ҵ��(���ڵ�){
 		���� ����(����);
 	}
 	����������(Modifiers): private, default(friendly), protected, public
 	������: static, final, abstract, native . . .
 	��ȯ���� �ʼ�!
 	void�� ���� void�� �´� �޼ҵ�� �ν� (��ȯŸ���� �ְų� , ��ȯŸ���� ���ų�)
 	��ȯ��(return type): 
 			- �ڹ� ������ �ڷ���(�⺻��, ������) ���� ����� �� �ִ�
 			- void: ��ȯ���� ���� �޼ҵ� ���ǽ� ��� 
 	�޼ҵ��: �ĺ��ڷ� ������ �̸� ���� 
 	�Ű�����(arguments): �Ű� ������� �ϸ� �޼ҵ� ȣ��� �����͸� �����ϱ� ���� �뵵�� ����� 
 	�޼ҵ� ȣ�� = �޼ҵ带 ����Ѵ� (������� �޼ҵ尡 ������ �ǰ� �Ѵ�)
 	ex)
 	public int method1(){
 		int su;
 		return su;
 	}
 	=> ���� ���� �޼ҵ带 '����� ���� �޼ҵ�' ��� �Ѵ� 
 	=> �� ��� int�� ���Ͼ��ϸ� ������ ���
 	void main(){}�� ���� 
 	return�� ������ �Լ��� �� �������� ���´�
 	
 	ex1)
 	int method1(){
 		���౸��;
 		return �� (int);
 	}
 	
 	ex2) void method(int d){
 		���౸��;
 		int dan = d;
 	}
 	
 	void method2(int a){
 		���� ����;
 	}
 	
 	�Լ��ȿ� �Լ� ���� �Ұ�
 	���� �޼ҵ�� ���� �θ��� ���� �ƴ� 
 	�Ȱ��� ���� ���� �Լ��� ��谡 �θ��� 
 */
public class MethodEx {
	//static�� ��谡 ã�� �� �ִ� ��(���� �޸� ����)
	static int method() {
		return 10;
	}
	
	static void method2() {
		System.out.println("���౸��");
	}
	
	static void method3(int a,String s) {
		System.out.println("���౸��" + a+s);
	}
	
	public static void main(String[] args) {
		int result = method();
		method2();
		method3(40,"dd");
		System.out.println(result);

	}

}
