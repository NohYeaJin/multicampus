package app;

import java.util.Scanner;

//�ݺ���(do~while��)
/*
 do {
 	���౸��;
 }while(���ǽ�);
 */

public class DoWhileEx {

	public static void main(String[] args) {
		/*
		 * int cnt = 0; do { cnt++; System.out.println(cnt + "\"");
		 * System.out.println(cnt + "\t");
		 * 
		 * } while (cnt < 10);
		 */

		int cnt = 1;
		int result = 0;
		while (cnt <= 9) {
			result = cnt * 7;
			System.out.println("7 X " + cnt + " = " + result);
			cnt++;
		}

		int dan;
		int cnt2 = 1;
		int result2 = 0;
		System.out.println("����� ���ϴ� ������ �� ���ڸ� �Է��ϼ���: ");
		dan = new Scanner(System.in).nextInt();
		while (cnt2 <= 9) {
			result2 = dan * cnt2;
			System.out.println(dan + " X " + cnt2 + " = " + result2);
			cnt2++;
		}

	}
}
