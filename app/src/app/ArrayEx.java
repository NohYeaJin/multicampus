package app;

/*
 �迭(array)
 - ���� �ڷ����� �����͸� ������ �����ϱ� ���� �޸� ������ ����.
 - ������ �޸� ������ index�� �̿��Ͽ� �� �����Ҹ� ������.
 - �迭 ũ��� length�� ����Ͽ� ����.
 	int[] arr -> int�� ���� ��� �迭
 	int[] arr = new int[length];
 	int[] arr = new int[2];
 	->������ 2�� ���� , �������� �� ������ ����, ������ ����
 	
 	�̋� arr�� ����ϸ� �迭�� �ּҰ� 
 	�����ϰ� �ִ�, ���� �迭�� ���� ����� �� �ִ�
 	
 	int []c = {10,20};
 	int []d = new int[]{10,20}
 	�������� ����
 	
 	int[0] = 10;
 	0��° index�� ����ִ� ���� 10
 	 
 */
public class ArrayEx {

	public static void main(String[] args) {

		
		/*
		// ex1
		int[] arr = new int[2];
		System.out.println(arr[0]);
		arr[0] = 10;
		arr[1] = 20;
		System.out.println(arr[0]);

		// ex2
		int[] b = { 20, 20 };
		System.out.println(b[0]);
		// arr[0] , arr[1] �Ѵ� 0��

		// ex3
		int[] c = new int[] { 10, 20 };
		System.out.println(c[0]);
		System.out.println(c[1]);

		// �ݺ��� ������� ����Ͻÿ�.
		int[] arr2 = new int[10];
		for (int i = 0; i < 10; i++) {
			arr2[i] = (i * 10) + 1;
		}
		
		//���� for������ ����ϴ� �迭 
		for(int v: arr2) {
			System.out.println(v);
		}
		
		//�迭�� ���� 
		int len = arr.length;
		*/
		//���� �迭����  �������� ��� int[] dan = {3,5,9};
		int[] dan = {3,5,9};
		for(int i = 0;i<dan.length;i++) {
			for(int j = 1;j<=9;j++) {
				System.out.print(dan[i]+" X "+j+" = "+dan[i]*j + "\t");
			}
			System.out.println();
		}
	}

}
