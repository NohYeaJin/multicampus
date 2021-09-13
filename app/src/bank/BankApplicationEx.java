package bank;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class BankApplicationEx {

	public static void main(String[] args) {

		boolean run = true;
		Scanner scanner = new Scanner(System.in);

		// switch case function number
		int num = 1;

		// input or output i/o money
		int money = 0;

		// arraylist index (used for login)
		int user_index = -1;

		// login_id
		String user_id = null;

		// Service
		BankService bankservice = new BankService();
		BankDBService bankdbservice = new BankDBService();

		do {
			System.out.println();
			System.out.println(
					"    /$$$$$  /$$$$$$  /$$    /$$  /$$$$$$        /$$$$$$$                      /$$      \r\n"
							+ "   |__  $$ /$$__  $$| $$   | $$ /$$__  $$      | $$__  $$                    | $$      \r\n"
							+ "      | $$| $$  \\ $$| $$   | $$| $$  \\ $$      | $$  \\ $$  /$$$$$$  /$$$$$$$ | $$   /$$\r\n"
							+ "      | $$| $$$$$$$$|  $$ / $$/| $$$$$$$$      | $$$$$$$  |____  $$| $$__  $$| $$  /$$/\r\n"
							+ " /$$  | $$| $$__  $$ \\  $$ $$/ | $$__  $$      | $$__  $$  /$$$$$$$| $$  \\ $$| $$$$$$/ \r\n"
							+ "| $$  | $$| $$  | $$  \\  $$$/  | $$  | $$      | $$  \\ $$ /$$__  $$| $$  | $$| $$_  $$ \r\n"
							+ "|  $$$$$$/| $$  | $$   \\  $/   | $$  | $$      | $$$$$$$/|  $$$$$$$| $$  | $$| $$ \\  $$\r\n"
							+ " \\______/ |__/  |__/    \\_/    |__/  |__/      |_______/  \\_______/|__/  |__/|__/  \\__/\r\n"
							+ "                                                                                       \r\n");
			System.out.println("=======================안녕하세요 자바 은행입니다==================================");
			System.out.println("===========1.회원가입|2.로그인|3.예금|4.출금|5.잔액조회|6.로그아웃|7.회원정보 출력========");
			System.out.println("=========================================================================");
			System.out.println("===========8.회원정보 수정|9.회원 탈퇴|10.송금|11.주소 입력 |12.계좌 개설|13.종료========");
			System.out.println("=========================================================================");
			System.out.println("원하시는 서비스에 해당하는 번호를 입력해주세요");
			num = scanner.nextInt();
			switch (num) {
			case 1:
				if (bankservice.getLoginSuccess() == false) {
					bankservice.signup();
					break;
				} else {
					System.out.println("회원가입은 로그아웃 상태에서만 가능합니다.");
					break;
				}

			case 2:
				if (bankservice.getLoginSuccess() == true) {
					System.out.println("로그아웃해야 로그인 할 수 있습니다.");
				} else {
					System.out.println("[로그인]");
					System.out.print("아이디를 입력해주세요: ");
					String login_id = scanner.next();
					System.out.print("비밀번호를 입력해주세요: ");
					String login_pwd = scanner.next();
					bankservice.login(login_id, login_pwd);
					// user_index = bankservice.user_index;
				}
				System.out.println();
				break;
			case 3:
				if (bankservice.getLoginSuccess() == false) {
					System.out.println("로그인 해야 이용가능한 서비스입니다.");
				} else {

					System.out.print("예금할 계좌번호:");
					String account = scanner.next();

					System.out.print("예금:");
					money = scanner.nextInt();

					bankservice.inputmoney(money, account, bankservice.getCurrent_login_id());
				}

				break;
			case 4:
				if (bankservice.getLoginSuccess() == false) {
					System.out.println("로그인 해야 이용가능한 서비스입니다.");
				} else {
					System.out.print("출금할 계좌 번호:");
					String account = scanner.next();

					System.out.print("출금:");
					money = scanner.nextInt();

					bankservice.outputmoney(money, account, bankservice.getCurrent_login_id());

				}
				break;
			case 5:
				if (bankservice.getLoginSuccess() == false) {
					System.out.println("로그인 해야 이용가능한 서비스입니다.");
				} else {
					System.out.println("[잔액조회]");
					bankservice.showmoney(bankservice.getCurrent_login_id());
				}
				break;
			case 6:
				bankservice.setLoginSuccess(false);
				bankservice.setUser_index(-1);
				System.out.println("성공적으로 로그아웃되었습니다.");
				break;
			case 7:
				if (bankservice.getLoginSuccess() == false) {
					System.out.println("로그인 해야 이용가능한 서비스입니다.");
				} else {
					System.out.println("[회원정보 출력]");
					// bankservice.printmemberinfo(user_index);
					bankservice.printmemberinfo(bankservice.getCurrent_login_id());
				}
				break;
			case 8:
				if (bankservice.getLoginSuccess() == false) {
					System.out.println("로그인 해야 이용가능한 서비스입니다.");
				} else {
					System.out.println("[회원정보 수정]");
					bankservice.editMemberinfo(bankservice.getCurrent_login_id());
				}
				break;
			case 9:
				if (bankservice.getLoginSuccess() == false) {
					System.out.println("로그인 해야 이용가능한 서비스입니다.");
				} else {
					System.out.println("[회원 탈퇴]");
					System.out.println("정말로 탈퇴하시겠습니까? 1.확인   2.취소");
					int drop_num = scanner.nextInt();
					if (drop_num == 1) {
						bankdbservice.dropoutMember(bankservice.getCurrent_login_id());
						bankservice.setLoginSuccess(false);
					} else {
						System.out.println("취소되었습니다.");
					}

				}
				break;
			case 10:
				if (bankservice.getLoginSuccess() == false) {
					System.out.println("로그인 해야 이용가능한 서비스입니다.");
				} else {
					System.out.println("[송금]");
					System.out.print("송금할 계좌번호를 입력하세요 (***-***-****)형태로 입력: ");
					String send_account = scanner.next();
					System.out.println();
					System.out.print("출금할 계좌번호를 입력하세요 (***-***-****)형태로 입력: ");
					String my_account = scanner.next();
					System.out.println();
					System.out.print("송금할 금액을 입력하세요: ");
					money = scanner.nextInt();
					bankservice.sendMoney(bankservice.getCurrent_login_id(), money, my_account, send_account);
				}
				break;
			case 11:
				if (bankservice.getLoginSuccess() == false) {
					System.out.println("로그인 해야 이용가능한 서비스입니다.");
				} else {
					System.out.println("[주소 입력]");
					bankservice.updateAddress(bankservice.getCurrent_login_id());

				}
				break;
			case 12:
				System.out.println("[계좌 개설]");
				if (bankservice.getLoginSuccess() == false) {
					System.out.println("로그인 해야 이용가능한 서비스입니다.");
				} else {
					bankservice.openNewAccount(bankservice.getCurrent_login_id());
				}
				break;
			case 13:
				run = false;
				break;
			default:
				System.out.println("다시 입력하세요");
			}

		} while (run);
		System.out.println("이용해주셔서 감사합니다");

	}

}
