package app;

public class ArrayEx2 {

	public static void main(String[] args) {

		// ������ ���հ� ��� ���
		/*
		 * int total = 0; int[] scores = { 83, 90, 87 }; for (int num : scores) { total
		 * += num; } System.out.print("����: "+total+"\n");
		 * System.out.print("���: "+total/scores.length+"\n");
		 */

		// ¦���� ����ϱ�
		int[] num = { 3, 6, 4, 7, 10 };
		for (int i : num) {
			if (i % 2 == 0) {
				System.out.println(i);
			}

		}

		// �������� 3�ܰ� 7���� ���� �迭�� �����ϱ�
		// 3�ܳ���, 7�ܳ���, �迭���� �ΰ��� ���� �ʿ�
		int[] result = new int[2];
		for (int i = 1; i <= 9; i++) {
			result[0] += i * 3;
			result[1] += i * 7;
		}
		System.out.print("3�� ��: " + result[0] + "\n");
		System.out.print("7�� ��: " + result[1] + "\n");
	}

}
