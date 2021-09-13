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
			System.out.println("=======================�ȳ��ϼ��� �ڹ� �����Դϴ�==================================");
			System.out.println("===========1.ȸ������|2.�α���|3.����|4.���|5.�ܾ���ȸ|6.�α׾ƿ�|7.ȸ������ ���========");
			System.out.println("=========================================================================");
			System.out.println("===========8.ȸ������ ����|9.ȸ�� Ż��|10.�۱�|11.�ּ� �Է� |12.���� ����|13.����========");
			System.out.println("=========================================================================");
			System.out.println("���Ͻô� ���񽺿� �ش��ϴ� ��ȣ�� �Է����ּ���");
			num = scanner.nextInt();
			switch (num) {
			case 1:
				if (bankservice.getLoginSuccess() == false) {
					bankservice.signup();
					break;
				} else {
					System.out.println("ȸ�������� �α׾ƿ� ���¿����� �����մϴ�.");
					break;
				}

			case 2:
				if (bankservice.getLoginSuccess() == true) {
					System.out.println("�α׾ƿ��ؾ� �α��� �� �� �ֽ��ϴ�.");
				} else {
					System.out.println("[�α���]");
					System.out.print("���̵� �Է����ּ���: ");
					String login_id = scanner.next();
					System.out.print("��й�ȣ�� �Է����ּ���: ");
					String login_pwd = scanner.next();
					bankservice.login(login_id, login_pwd);
					// user_index = bankservice.user_index;
				}
				System.out.println();
				break;
			case 3:
				if (bankservice.getLoginSuccess() == false) {
					System.out.println("�α��� �ؾ� �̿밡���� �����Դϴ�.");
				} else {

					System.out.print("������ ���¹�ȣ:");
					String account = scanner.next();

					System.out.print("����:");
					money = scanner.nextInt();

					bankservice.inputmoney(money, account, bankservice.getCurrent_login_id());
				}

				break;
			case 4:
				if (bankservice.getLoginSuccess() == false) {
					System.out.println("�α��� �ؾ� �̿밡���� �����Դϴ�.");
				} else {
					System.out.print("����� ���� ��ȣ:");
					String account = scanner.next();

					System.out.print("���:");
					money = scanner.nextInt();

					bankservice.outputmoney(money, account, bankservice.getCurrent_login_id());

				}
				break;
			case 5:
				if (bankservice.getLoginSuccess() == false) {
					System.out.println("�α��� �ؾ� �̿밡���� �����Դϴ�.");
				} else {
					System.out.println("[�ܾ���ȸ]");
					bankservice.showmoney(bankservice.getCurrent_login_id());
				}
				break;
			case 6:
				bankservice.setLoginSuccess(false);
				bankservice.setUser_index(-1);
				System.out.println("���������� �α׾ƿ��Ǿ����ϴ�.");
				break;
			case 7:
				if (bankservice.getLoginSuccess() == false) {
					System.out.println("�α��� �ؾ� �̿밡���� �����Դϴ�.");
				} else {
					System.out.println("[ȸ������ ���]");
					// bankservice.printmemberinfo(user_index);
					bankservice.printmemberinfo(bankservice.getCurrent_login_id());
				}
				break;
			case 8:
				if (bankservice.getLoginSuccess() == false) {
					System.out.println("�α��� �ؾ� �̿밡���� �����Դϴ�.");
				} else {
					System.out.println("[ȸ������ ����]");
					bankservice.editMemberinfo(bankservice.getCurrent_login_id());
				}
				break;
			case 9:
				if (bankservice.getLoginSuccess() == false) {
					System.out.println("�α��� �ؾ� �̿밡���� �����Դϴ�.");
				} else {
					System.out.println("[ȸ�� Ż��]");
					System.out.println("������ Ż���Ͻðڽ��ϱ�? 1.Ȯ��   2.���");
					int drop_num = scanner.nextInt();
					if (drop_num == 1) {
						bankdbservice.dropoutMember(bankservice.getCurrent_login_id());
						bankservice.setLoginSuccess(false);
					} else {
						System.out.println("��ҵǾ����ϴ�.");
					}

				}
				break;
			case 10:
				if (bankservice.getLoginSuccess() == false) {
					System.out.println("�α��� �ؾ� �̿밡���� �����Դϴ�.");
				} else {
					System.out.println("[�۱�]");
					System.out.print("�۱��� ���¹�ȣ�� �Է��ϼ��� (***-***-****)���·� �Է�: ");
					String send_account = scanner.next();
					System.out.println();
					System.out.print("����� ���¹�ȣ�� �Է��ϼ��� (***-***-****)���·� �Է�: ");
					String my_account = scanner.next();
					System.out.println();
					System.out.print("�۱��� �ݾ��� �Է��ϼ���: ");
					money = scanner.nextInt();
					bankservice.sendMoney(bankservice.getCurrent_login_id(), money, my_account, send_account);
				}
				break;
			case 11:
				if (bankservice.getLoginSuccess() == false) {
					System.out.println("�α��� �ؾ� �̿밡���� �����Դϴ�.");
				} else {
					System.out.println("[�ּ� �Է�]");
					bankservice.updateAddress(bankservice.getCurrent_login_id());

				}
				break;
			case 12:
				System.out.println("[���� ����]");
				if (bankservice.getLoginSuccess() == false) {
					System.out.println("�α��� �ؾ� �̿밡���� �����Դϴ�.");
				} else {
					bankservice.openNewAccount(bankservice.getCurrent_login_id());
				}
				break;
			case 13:
				run = false;
				break;
			default:
				System.out.println("�ٽ� �Է��ϼ���");
			}

		} while (run);
		System.out.println("�̿����ּż� �����մϴ�");

	}

}
