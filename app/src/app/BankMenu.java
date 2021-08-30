package app;

import java.util.Scanner;

//메뉴만들기
//dan = new Scanner(System.in).nextInt();
//char c = (char)System.in.read();
//적어도 한번 메뉴를 띄워야 한다 -> do while

//bank 향상
//balance array만들고 유저가 여러명이라고 가정
//함수로 기능들 구현
public class BankMenu {

	public static void main(String[] args) {
		boolean run = true;
		java.util.Scanner scanner = new java.util.Scanner(System.in);
		int balance = 0;
		int num = 1;
		do {
			System.out.println("============안녕하세요 @@은행입니다============");
			System.out.println("1.회원가입|2.로그인|3.예금|4.출금|5.잔액조회|6.종료");
			System.out.println("========================================");
			System.out.println("원하시는 서비스에 해당하는 번호를 입력해주세요");
			num = scanner.nextInt();
			switch (num) {
			case 1:
				System.out.println("회원가입");
				break;
			case 2:
				System.out.println("로그인");
				break;
			case 3:
				System.out.print("예금:");
				balance += scanner.nextInt();
				break;
			case 4:
				System.out.print("출금:");
				int money = scanner.nextInt();
				if(money>balance) {
					System.out.println("잔고가 부족합니다");
					break;
				}else {
					balance -= money;
					break;				
				}
			case 5:
				System.out.println("잔액조회");
				System.out.println("잔고:"+balance);
				break;
			case 6:
				run = false;
				break;
			default:
				System.out.println("다시 입력하세요");
			}

		} while (run);
		System.out.println("이용해주셔서 감사합니다");

	}

}
