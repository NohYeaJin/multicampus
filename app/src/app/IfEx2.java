package app;

import java.util.Scanner;

/*���� ���ǹ�
 if(���ǹ�1){
 	����1;
 else if(���ǹ�){
 	����2;
 }else{
 	����3;
 }
 */

public class IfEx2 {

	public static void main(String[] args) {
		System.out.println("������ �Է��Ͻÿ�");
		int score;
		score = new Scanner(System.in).nextInt();

		if (score <= 60 && score > 0) {
			System.out.println("C");
		} else if (score < 81) {
			System.out.println("B");
		} else if (score <= 100) {
			System.out.println("A");
		} else {
			System.out.println("�߸��� �����Դϴ�.");
		}

	}

}
