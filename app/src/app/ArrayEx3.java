package app;

//다차원 배열 행과 열
//int[] arr = new int[n][n];
//int[] arr = {{1,2}{3,4}};
//n이 행과 열의 개수
public class ArrayEx3 {

	public static void main(String[] args) {
		int[][] arr = new int[3][2];
		arr[0][0] = 1;
		arr[0][1] = 2;
		arr[1][0] = 3;
		arr[1][1] = 4;
		arr[2][0] = 5;
		arr[2][1] = 6;
		/*
		 * for (int i = 0; i < 3; i++) { for (int j = 0; j < 2; j++) {
		 * System.out.println(arr[i][j]); } }
		 */
		String[][] str = { { "A", "B", "C" }, { "D", "E", "F" }, { "G", "H", "I" } };

		int[][] array = { { 95, 86 }, { 83, 92, 96 }, { 78, 83, 93, 87, 88 } };

		// 문제 1 종합과 평균
		int total = 0;
		int num = 0;
		double average = 0;
		for (int j = 0; j < array.length; j++) {
			for (int i = 0; i < array[j].length; i++) {
				num += 1;
				total += array[j][i];
			}
		}
		average = (double)total / num;
		System.out.println("종합: " + total);
		System.out.println("평균: " + average);

		// 문제 2 최대값 출력하기
		int[] array2 = { 1, 5, 3, 8, 2, 13 };
		int max = array2[0];
		for (int val : array2) {
			if (val >= max) {
				max = val;
			}

		}
		System.out.println(max);
	}

}
