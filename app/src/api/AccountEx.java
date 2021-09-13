package api;

public class AccountEx {

	public static void main(String[] args) {
		Account account = new Account();
		
		account.deposit(1000);
		System.out.println(account.getBalance());
		//����ó���� ����� �Ѵ�. 
		//runtime�� ����ó�� �����൵ ������, �Ϲ��� syntax������ ����ó���� �����
		//�������� �ִ�. 
		try {
			account.withdraw(1001);
		} catch (BalanceInsufficientException e) {
			String message = e.getMessage();
			System.out.println(message);
		}
	}

}
