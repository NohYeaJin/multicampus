package app;

/*
 ��������
 |
 &
 ||
 &&
 boolean result = ���ǽ�1 | ���ǽ�2;
 or�����ڴ� ��� �����̶� ���� ���´ٸ� ���� �����Ѵ�
 */

public class OperEX4 {

	public static void main(String[] args) {
		boolean a;
		boolean b;
		boolean result = 3<5 || 5<3;
		int sum = 0;
		
		// ||����ϱ� ������ sum���� ����
		//sum = 0
		a = true;
		b = false;
		result = a || 10 > (sum = 3 + 5);
		System.out.println(sum);
		System.out.println(result);
		
		// | ����ϱ� ������ sum ������
		//sum = 8
		a = true;
		b = false;
		result = a | 10 > (sum = 3 + 5);
		System.out.println(sum);
		System.out.println(result);
		
		


	}

}
