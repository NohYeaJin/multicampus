package bank;

public class BankApplication {

	public static void main(String[] args) {
		boolean run = true;
		java.util.Scanner scanner = new java.util.Scanner(System.in);
		int balance = 0;
		int num = 1;
		boolean loginSuccess = false;
		int money = 0;
		BankService bankService = new BankService();

		do {
			System.out.println("============안녕하세요 @@은행입니다============");
			System.out.println("1.회원가입|2.로그인|3.예금|4.출금|5.잔액조회|6.로그아웃|7.종료");
			System.out.println("========================================");
			System.out.println("원하시는 서비스에 해당하는 번호를 입력해주세요");
			num = scanner.nextInt();
			switch (num) {
			case 1:
				System.out.println("회원가입");
				bankService.signup("user1", "1234");
				System.out.println("회원가입 완료되었습니다.");
				break;
			case 2:
				System.out.println("로그인");
				String id = "user1";
				String pw = "1234";
				if (bankService.login(id, pw) == true) {
					loginSuccess = true;
				}
				break;
			case 3:
				if (loginSuccess == false) {
					System.out.println("로그인 해야 이용가능한 서비스입니다.");
					break;
				} else {
					System.out.print("예금:");
					money = scanner.nextInt();
					bankService.insertMoney(money);
					break;
				}
			case 4:
				if (loginSuccess == false) {
					System.out.println("로그인 해야 이용가능한 서비스입니다.");
					break;
				} else {
					System.out.print("출금:");
					money = scanner.nextInt();
					bankService.deleteMoney(money);
					break;
				}
			case 5:
				if (loginSuccess == false) {
					System.out.println("로그인 해야 이용가능한 서비스입니다.");
					break;
				} else {
					System.out.println("잔액조회");
					balance = bankService.showMoney();
					System.out.println("잔고:" + balance);
					break;
				}
			case 6:
				loginSuccess = false;
				System.out.println("성공적으로 로그아웃되었습니다.");
				break;
				
			case 7:
				run = false;
				break;
			default:
				System.out.println("다시 입력하세요");
			}

		} while (run);
		System.out.println("이용해주셔서 감사합니다");

	}

}
