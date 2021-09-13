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
	//가상머신에게 위임 

	}
	*/

	public static void login(String id, String pw) throws NotExistIDException, WrongPasswordException {
		if (!id.equals("aaa")) {
			throw new NotExistIDException("아이디가 존재하지 않습니다.");
		}

		if (!pw.equals("111")) {
			throw new WrongPasswordException("비밀번호가 맞지 않습니다.");
		}
	}

}
