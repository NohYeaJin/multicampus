package app;

import java.util.Scanner;

//반복문(do~while문)
/*
 do {
 	실행구문;
 }while(조건식);
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
		System.out.println("출력을 원하는 구구단 단 숫자를 입력하세요: ");
		dan = new Scanner(System.in).nextInt();
		while (cnt2 <= 9) {
			result2 = dan * cnt2;
			System.out.println(dan + " X " + cnt2 + " = " + result2);
			cnt2++;
		}

	}
}
