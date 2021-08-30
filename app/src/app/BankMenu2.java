package app;

public class BankMenu2 {

	public static void main(String[] args) {

		// do while�� flag
		boolean run = true;

		// input scanner
		java.util.Scanner scanner = new java.util.Scanner(System.in);

		// ��� �Է°�(1~6)
		int num;

		// �Է°�
		int input_money;
		int userNum = 0;

		// �α����� ȸ���� index��
		int user_index = 0;

		// �α��ν� ȸ�� ���� ����
		boolean exist = false;

		// ���� ���̵�� ȸ����ȣ
		// ����� ȸ����ȣ�� �α��� �ϴ� ����
		String[] users = { "kim", "Lee", "Park" };
		int[] userNumbers = { 13542, 34999, 91329 };
		
		//bankaccount ��ü 
		bankAccount a = new bankAccount();


		do {
			System.out.println("============�ȳ��ϼ��� @@�����Դϴ�============");
			System.out.println("1.ȸ������|2.�α���|3.����|4.���|5.�ܾ���ȸ|6.����|7.�ֽ�����");
			System.out.println("========================================");
			System.out.println("���Ͻô� ���񽺿� �ش��ϴ� ��ȣ�� �Է����ּ���");
			num = scanner.nextInt();
			switch (num) {
			case 1:
				System.out.println("ȸ������");
				System.out.println("ȸ�� ������ ���� ���� �߿� �ֽ��ϴ�.");
				break;
			case 2:
				System.out.println("�α���");
				System.out.print("ȸ����ȣ�� �Է����ּ���: ");
				// ȸ����ȣ �Է�
				userNum = scanner.nextInt();

				// for���� ���鼭 ��ġ�ϴ� ȸ����ȣ �ִ��� Ȯ��
				// �ִٸ� user_index ����
				for (int i = 0; i < userNumbers.length; i++) {
					if (userNum == userNumbers[i]) {
						user_index = i;
						exist = true;
						break;
					}
				}

				// �������� �ʴ´ٸ� ��ɾ� ���
				// �����Ѵٸ� userid �ʱ�ȭ �� ȯ���޽��� ���
				if (exist == false) {
					System.out.println("ȸ����ȣ�� �������� �ʽ��ϴ�.");
				} else {
					a.userId = users[user_index];
					System.out.println(a.userId + "�� ȯ���մϴ�.");
				}

				break;
			case 3:
				if (a.userId == null) {
					System.out.println("�α��� �� �̿� �����մϴ�.");
				} else {
					System.out.print("������ �ݾ�: ");
					input_money = scanner.nextInt();
					a.add(input_money);
				}
				break;
			case 4:

				if (a.userId == null) {
					System.out.println("�α��� �� �̿� �����մϴ�.");
				} else {
					System.out.print("����� �ݾ�: ");
					input_money = scanner.nextInt();
					if (input_money > a.balance) {
						System.out.println("�ܾ��� �����մϴ�.");
					} else {
						a.subtract(input_money);
					}
				}

				break;

			case 5:
				if (a.userId == null) {
					System.out.println("�α��� �� �̿� �����մϴ�.");
				} else {
					a.leftMoney();
				}
				break;
			case 6:
				run = false;
				break;
			default:
				System.out.println("�ٽ� �Է��ϼ���");
			}

		} while (run);
		System.out.println("�ý����� �����մϴ�.");
		System.out.println(a.userId + "�� �̿����ּż� �����մϴ�.");

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
		System.out.println("���� �ܾ��� " + balance + "�� �Դϴ�.");

	}
	
class stockMarket{
	int[] yesterday_price = {1333,30,2500,15000,33,120};
	int[] stock_price = {1333,24,3000,10000,30,111};
	String[] company_name = {"Aȸ��","Bȸ��","Cȸ��","Dȸ��","Eȸ��"};
	
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
