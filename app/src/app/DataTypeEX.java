package app;
/*
 �ڷ��� (data type)
 - ���� �Ǵ� ����� �����ϴ� �޸��� ��(byte)�� ������ �ǹ��Ѵ�.
 - �ڹ��� �ڷ����� ũ�� �⺻ �ڷ����� ���������� ���� �� �ִ�.
 	1) �⺻��
 	- boolean(true, false): 8 bit(1����Ʈ)
 	- byte: 8��Ʈ(1����Ʈ)
 	- short : 16��Ʈ 
 	- char: 16��Ʈ
 	- int: 32��Ʈ
 	- long: 64��Ʈ
 	- float: 32��Ʈ
 	- double : 64��Ʈ
 	
 	2) ������
 	- Ŭ����(class)
 	- �迭(array)
 	- �������̽�(interface)
 	- ����(enum)
 */

public class DataTypeEX {
	public static void main(String[] args) {
		
		//boolean Ÿ��
		boolean bool = false;
		System.out.println(bool);
		
		//byte
		byte byte1 = 1;
		System.out.println(byte1);
		
		//float
		float float1 = 1.1f;
		System.out.println(float1);
		
		//double ��ҹ���
		double double1 = 1.1D;
		double double2 = 1.1d;
		System.out.println(double1);
		System.out.println(double2);
		
		//char��, string��
		char char1 = 'a';
		String string1 = "Hello String";
		System.out.println(char1);
		System.out.println(string1);
		
		//String�� �Ѱ�?
		String string2 = "dddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddd";
		System.out.println(string2);
		
		//short��, int��(0000�� �����Ѱ�)
		//���: 0���� ����
		short short1 = 10000;
		int int1 = 0000;
		System.out.println(short1);
		System.out.println(int1);
		
		//long, double�� �Ѱ�
		//�ϴ��� ���ڿ��� 0 �� ���ø�
		long long1 = 1000000;
		double double3 = 1000000000;
		System.out.println(long1);
		System.out.println(double3);
		
		

	}

}
