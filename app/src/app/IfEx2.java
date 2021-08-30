package app;

import java.util.Scanner;

/*다중 조건문
 if(조건문1){
 	구문1;
 else if(조건문){
 	구문2;
 }else{
 	구문3;
 }
 */

public class IfEx2 {

	public static void main(String[] args) {
		System.out.println("점수를 입력하시오");
		int score;
		score = new Scanner(System.in).nextInt();

		if (score <= 60 && score > 0) {
			System.out.println("C");
		} else if (score < 81) {
			System.out.println("B");
		} else if (score <= 100) {
			System.out.println("A");
		} else {
			System.out.println("잘못된 점수입니다.");
		}

	}

}
