package app;

/* ������
 ���: +, -, /, %, *
 ����: ++, --
 ��: <, <=, >, >=, ==, !=, instance of
 ��Ʈ: &,, |
 ��: &&, ||
 ����: expr? expr:expr
 */
/*������ ������
 ������ (���)������ ǥ��
 + => ���ϱ�
 - => ���̳ʽ�
 * => ���ϱ�
 / => ������
 % => ������
 */

public class OperEX {

	public static void main(String[] args) {
		
//���� ������ ( ����� <- ���⿡��)
		 int su = 10;
		 System.out.println("su = "+su);
		 
		 //�̷� ���µ� ����
		 int su1 = 10, su2 = 20;
		 int result = 0;
		 
		 //���ϰ� �����ϰ�
		 result = su1 + su2;
		 System.out.println("result = "+result);
		 
		 //���� ���ϱ�
		 int result3 = su1 - su2;
		 System.out.println("result3 = "+ result3);
		 
		 int result4 = su1 * su2;
		 System.out.println("result4 = " + result4);
		 
		 //�Ǽ� ��� ������
		 double a = 10.3;
		 double b = 1.2;
		 double result1;
		 double result2;
		 result1 = a/b;
		 result2 = a%b;
		 System.out.println("result1 = "+result1);
		 System.out.println("result2 = "+result2);
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 

	}

}
