package app;

import java.util.Scanner;

//�޴������
//dan = new Scanner(System.in).nextInt();
//char c = (char)System.in.read();
//��� �ѹ� �޴��� ����� �Ѵ� -> do while

//bank ���
//balance array����� ������ �������̶�� ����
//�Լ��� ��ɵ� ����
public class BankMenu {

	public static void main(String[] args) {
		boolean run = true;
		java.util.Scanner scanner = new java.util.Scanner(System.in);
		int balance = 0;
		int num = 1;
		do {
			System.out.println("============�ȳ��ϼ��� @@�����Դϴ�============");
			System.out.println("1.ȸ������|2.�α���|3.����|4.���|5.�ܾ���ȸ|6.����");
			System.out.println("========================================");
			System.out.println("���Ͻô� ���񽺿� �ش��ϴ� ��ȣ�� �Է����ּ���");
			num = scanner.nextInt();
			switch (num) {
			case 1:
				System.out.println("ȸ������");
				break;
			case 2:
				System.out.println("�α���");
				break;
			case 3:
				System.out.print("����:");
				balance += scanner.nextInt();
				break;
			case 4:
				System.out.print("���:");
				int money = scanner.nextInt();
				if(money>balance) {
					System.out.println("�ܰ� �����մϴ�");
					break;
				}else {
					balance -= money;
					break;				
				}
			case 5:
				System.out.println("�ܾ���ȸ");
				System.out.println("�ܰ�:"+balance);
				break;
			case 6:
				run = false;
				break;
			default:
				System.out.println("�ٽ� �Է��ϼ���");
			}

		} while (run);
		System.out.println("�̿����ּż� �����մϴ�");

	}

}
