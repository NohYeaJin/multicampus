package app;

//반복문(for문)
/*
 for(변수선언(초기화); 조건식; 증가 혹은 감소 수식){
 	실행구문;
 }
 */

public class ForEx {
	//문제2 1~100까지 더하기, 짝수의 합 출력,홀수의 합 출력 
	public static void main(String[] args) {
		int zzaksutotal = 0;
		int holsutotal = 0;
		for (int i = 1; i <= 100; i++) {
			if(i%2==0) {
				zzaksutotal += i;
			}else {
				holsutotal += i;
			}

		}
		
		System.out.println("짝수 합:" + zzaksutotal);
		System.out.println("홀수 합:" + holsutotal);

	}

}
