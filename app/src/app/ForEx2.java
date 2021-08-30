package app;

/*
 for(변수선언(초기화); 조건식; 증가 혹은 감소 수식){
 	실행구문1;
 	for(변수선언(초기화); 조건식; 증가 혹은 감소 수식){
 		실행 구문;
 }
 }
 */
//구구단 출력, 세로로, 가로로
public class ForEx2 {
	/*
	 * public static void main(String[] args) { int result; for (int i = 1; i < 10;
	 * i++) { for (int j = 2; j < 10; j++) { result = i * j;
	 * System.out.print(j+" X "+i+" = "+result+"\t"); } System.out.println(); }
	 * 
	 * }
	 */

	// 숙제 = 할 수 있는 것들 해보기
	// 밑에건 별 반대로 찍기
	// 마름모 만들기?
	/*
	 * public static void main(String[] args) { for (int i = 5; i > 0; i--) { for
	 * (int j = 1; j <= i; j++) { System.out.print("*"); } System.out.println(); } }
	 */

	// 마름모
	/*
	public static void main(String[] args) {
		int length = 3;
		int k;
		for (int i = 0; i < (length + 1); i++) {
			for (int j = length; j > i; j--) {
				System.out.print(" ");
			}
			k = i * 2 + 1;
			for (int m = 1; m <= k; m++) {
				System.out.print("*");
			}
			System.out.println();
		}

		for (int i = 0; i < (length + 1); i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print(" ");
			}
			k = (length - i) * 2 - 1;
			for (int m = 0; m < k; m++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
	*/
	
	//평행사변형
	public static void main(String[] args) {
		for(int i = 0;i<4;i++) {
			for(int j = 0;j<=i;j++) {
				System.out.print(" ");
			}
			for(int k = 0;k<5;k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
