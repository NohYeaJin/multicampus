package api;

public class ExceptionEx2 {

	public static void main(String[] args) {
		try {
			login("abc", "1234");
		} catch (NotExistIDException e) {

			e.printStackTrace();

		} catch (WrongPasswordException ex) {

			ex.printStackTrace();
		}

	}
	/*
	public static void main(String[] args)throws Exception {
	//����ӽſ��� ���� 

	}
	*/

	public static void login(String id, String pw) throws NotExistIDException, WrongPasswordException {
		if (!id.equals("aaa")) {
			throw new NotExistIDException("���̵� �������� �ʽ��ϴ�.");
		}

		if (!pw.equals("111")) {
			throw new WrongPasswordException("��й�ȣ�� ���� �ʽ��ϴ�.");
		}
	}

}
