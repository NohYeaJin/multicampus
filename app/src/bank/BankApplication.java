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
			System.out.println("============�ȳ��ϼ��� @@�����Դϴ�============");
			System.out.println("1.ȸ������|2.�α���|3.����|4.���|5.�ܾ���ȸ|6.�α׾ƿ�|7.����");
			System.out.println("========================================");
			System.out.println("���Ͻô� ���񽺿� �ش��ϴ� ��ȣ�� �Է����ּ���");
			num = scanner.nextInt();
			switch (num) {
			case 1:
				System.out.println("ȸ������");
				bankService.signup("user1", "1234");
				System.out.println("ȸ������ �Ϸ�Ǿ����ϴ�.");
				break;
			case 2:
				System.out.println("�α���");
				String id = "user1";
				String pw = "1234";
				if (bankService.login(id, pw) == true) {
					loginSuccess = true;
				}
				break;
			case 3:
				if (loginSuccess == false) {
					System.out.println("�α��� �ؾ� �̿밡���� �����Դϴ�.");
					break;
				} else {
					System.out.print("����:");
					money = scanner.nextInt();
					bankService.insertMoney(money);
					break;
				}
			case 4:
				if (loginSuccess == false) {
					System.out.println("�α��� �ؾ� �̿밡���� �����Դϴ�.");
					break;
				} else {
					System.out.print("���:");
					money = scanner.nextInt();
					bankService.deleteMoney(money);
					break;
				}
			case 5:
				if (loginSuccess == false) {
					System.out.println("�α��� �ؾ� �̿밡���� �����Դϴ�.");
					break;
				} else {
					System.out.println("�ܾ���ȸ");
					balance = bankService.showMoney();
					System.out.println("�ܰ�:" + balance);
					break;
				}
			case 6:
				loginSuccess = false;
				System.out.println("���������� �α׾ƿ��Ǿ����ϴ�.");
				break;
				
			case 7:
				run = false;
				break;
			default:
				System.out.println("�ٽ� �Է��ϼ���");
			}

		} while (run);
		System.out.println("�̿����ּż� �����մϴ�");

	}

}
