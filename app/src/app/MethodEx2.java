package app;

public class MethodEx2 {

	// ���� 1~10���� �� ���� ����� ���

	static int add() {
		int total = 0;
		for (int i = 1; i <= 10; i++) {
			total += i;
		}
		return total;
	}

	static void add2() {
		int total = 0;

		for (int i = 1; i <= 10; i++) {
			total += i;
		}
		System.out.println(total);
	}

	public static void main(String[] args) {
		// ���� 1~10���� �� ���� ����� ���
		int result2 = add();
		System.out.println(result2);
		add2();
	}

}
