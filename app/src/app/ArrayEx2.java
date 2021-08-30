package app;

public class ArrayEx2 {

	public static void main(String[] args) {

		// 점수의 총합과 평균 출력
		/*
		 * int total = 0; int[] scores = { 83, 90, 87 }; for (int num : scores) { total
		 * += num; } System.out.print("총점: "+total+"\n");
		 * System.out.print("평균: "+total/scores.length+"\n");
		 */

		// 짝수만 출력하기
		int[] num = { 3, 6, 4, 7, 10 };
		for (int i : num) {
			if (i % 2 == 0) {
				System.out.println(i);
			}

		}

		// 구구단중 3단과 7단의 합을 배열에 저장하기
		// 3단끼리, 7단끼리, 배열에는 두개의 공간 필요
		int[] result = new int[2];
		for (int i = 1; i <= 9; i++) {
			result[0] += i * 3;
			result[1] += i * 7;
		}
		System.out.print("3단 합: " + result[0] + "\n");
		System.out.print("7단 합: " + result[1] + "\n");
	}

}
