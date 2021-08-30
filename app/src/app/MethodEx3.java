package app;

//���� 1 : dan1, dan2�� args�� ���� method ���� ��� 
//���� 2: �迭 ������ �� ��� (int array[] = {2,5,7,3} ) method�� ���ڷ� �����Ͽ� ��� 
public class MethodEx3 {

	static void method(int dan1, int dan2) {
		for (int i = dan1; i <= dan2; i++) {
			for (int j = 1; j <= 9; j++) {
				System.out.println(i + " X " + j + " = " + i * j);
			}
			System.out.println();
		}
	}

	static void method2(int array[]) {
		for (int i = 0; i < array.length; i++) {
			for (int j = 1; j <= 9; j++) {
				System.out.println(array[i] + " X " + j + " = " + array[i] * j);
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		int dan1 = Integer.parseInt(args[0]);
		int dan2 = Integer.parseInt(args[1]);
		
		method(3, 7);
		int array[]= {2,5,7,3};
		method2(array);
	}

}
