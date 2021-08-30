package app;

public class BankMenu2 {

	public static void main(String[] args) {

		// do while문 flag
		boolean run = true;

		// input scanner
		java.util.Scanner scanner = new java.util.Scanner(System.in);

		// 기능 입력값(1~6)
		int num;

		// 입력값
		int input_money;
		int userNum = 0;

		// 로그인한 회원의 index값
		int user_index = 0;

		// 로그인시 회원 존재 유무
		boolean exist = false;

		// 유저 아이디와 회원번호
		// 현재는 회원번호로 로그인 하는 구조
		String[] users = { "kim", "Lee", "Park" };
		int[] userNumbers = { 13542, 34999, 91329 };
		
		//bankaccount 객체 
		bankAccount a = new bankAccount();


		do {
			System.out.println("============안녕하세요 @@은행입니다============");
			System.out.println("1.회원가입|2.로그인|3.예금|4.출금|5.잔액조회|6.종료|7.주식투자");
			System.out.println("========================================");
			System.out.println("원하시는 서비스에 해당하는 번호를 입력해주세요");
			num = scanner.nextInt();
			switch (num) {
			case 1:
				System.out.println("회원가입");
				System.out.println("회원 가입은 아직 개발 중에 있습니다.");
				break;
			case 2:
				System.out.println("로그인");
				System.out.print("회원번호를 입력해주세요: ");
				// 회원번호 입력
				userNum = scanner.nextInt();

				// for문을 돌면서 일치하는 회원번호 있는지 확인
				// 있다면 user_index 저장
				for (int i = 0; i < userNumbers.length; i++) {
					if (userNum == userNumbers[i]) {
						user_index = i;
						exist = true;
						break;
					}
				}

				// 존재하지 않는다면 명령어 출력
				// 존재한다면 userid 초기화 후 환영메시지 출력
				if (exist == false) {
					System.out.println("회원번호가 존재하지 않습니다.");
				} else {
					a.userId = users[user_index];
					System.out.println(a.userId + "님 환영합니다.");
				}

				break;
			case 3:
				if (a.userId == null) {
					System.out.println("로그인 후 이용 가능합니다.");
				} else {
					System.out.print("예금할 금액: ");
					input_money = scanner.nextInt();
					a.add(input_money);
				}
				break;
			case 4:

				if (a.userId == null) {
					System.out.println("로그인 후 이용 가능합니다.");
				} else {
					System.out.print("출금할 금액: ");
					input_money = scanner.nextInt();
					if (input_money > a.balance) {
						System.out.println("잔액이 부족합니다.");
					} else {
						a.subtract(input_money);
					}
				}

				break;

			case 5:
				if (a.userId == null) {
					System.out.println("로그인 후 이용 가능합니다.");
				} else {
					a.leftMoney();
				}
				break;
			case 6:
				run = false;
				break;
			default:
				System.out.println("다시 입력하세요");
			}

		} while (run);
		System.out.println("시스템을 종료합니다.");
		System.out.println(a.userId + "님 이용해주셔서 감사합니다.");

	}

}

class bankAccount {

	int balance;
	String userId;
	String bankCompany;

	public void subtract(int num) {
		balance -= num;
	}

	public void add(int num) {
		balance += num;

	}

	public void leftMoney() {
		System.out.println("현재 잔액은 " + balance + "원 입니다.");

	}
	
class stockMarket{
	int[] yesterday_price = {1333,30,2500,15000,33,120};
	int[] stock_price = {1333,24,3000,10000,30,111};
	String[] company_name = {"A회사","B회사","C회사","D회사","E회사"};
	
	public int findExpensive() {
		int result_index = 0;
		int result = 0;
		for(int i = 0;i<stock_price.length;i++) {
			if(result<stock_price[i]) {
				result = stock_price[i];
				result_index = i;
			}		
		}
		return result_index;
	}
}

}
