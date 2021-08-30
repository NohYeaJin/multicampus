package app;

/*
 for(변수선언:값들){
 	실행구문;
 }
 */

public class ForEx3 {

	public static void main(String[] args) {

		// 가지고 있는 개수만큼 반복
		for (String s : args) {
			System.out.println(s);
		}
		// 출력결과:
		// A
		// B

	}

}
