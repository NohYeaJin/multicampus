package app;

public class BreakEx {

	public static void main(String[] args) {
		int i = 0;
		boolean result = true;
		do {
			i++;
			if (result) {
				System.out.println("���౸��");
				if (i == 5) {
					result = false;
				}
				if (!result) {
					System.out.println("���� ���� �����մϴ�.");
					break;
				}
			} else {
				//break���� ������ ���������� ������ else�� ���� ������ ������� �ʴ´�. 
				System.out.println("i = " + i);
			}
		} while (i < 10);
	}
}
