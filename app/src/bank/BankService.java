package bank;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import java.util.regex.Pattern;

public class BankService {
	// private ArrayList<MemberInfo> memberinfos = new ArrayList<>(10);
	Scanner scanner = new Scanner(System.in);
	private int user_index = 0;
	private Boolean loginSuccess = false;
	private boolean pwd_check = true;
	private String current_login_id = null;

	public int getUser_index() {
		return user_index;
	}

	public void setUser_index(int user_index) {
		this.user_index = user_index;
	}

	public Boolean getLoginSuccess() {
		return loginSuccess;
	}

	public void setLoginSuccess(Boolean loginSuccess) {
		this.loginSuccess = loginSuccess;
	}

	public boolean isPwd_check() {
		return pwd_check;
	}

	public void setPwd_check(boolean pwd_check) {
		this.pwd_check = pwd_check;
	}

	public String getCurrent_login_id() {
		return current_login_id;
	}

	public void setCurrent_login_id(String current_login_id) {
		this.current_login_id = current_login_id;
	}

	// regex for signup
	String email_regex = "^[_a-zA-Z0-9-\\.]+@[\\.a-zA-Z0-9-]+\\.[a-zA-Z]+$";
	String pwd_regex = "^[a-zA-Z]{1}[a-zA-Z0-9_]{4,11}$";
	String id_regex = "^[a-zA-Z]{1}[a-zA-Z0-9_]{4,11}$";
	String phone_regex = "(02|010)-\\d{3,4}-\\d{4}";

	// update address
	public void updateAddress(String user_id) {
		System.out.print("동 주소를 입력해주세요: ");
		String input_address = scanner.next();
		System.out.println();
		if (dbservice.showAddress(input_address) == 1) {
			System.out.println();
			System.out.print("해당하는 주소의 번호를 입력해주세요: ");
			int seq = scanner.nextInt();
			String basic_address = dbservice.selectAddress(user_id, input_address, seq);
			System.out.println();
			System.out.print("상세주소를 입력해주세요: ");
			scanner.nextLine();
			String detail = scanner.nextLine();
			dbservice.updateDetailAddress(user_id, basic_address + " " + detail);
			System.out.println("성공적으로 저장되었습니다.");
		}
	}

	// DB save
	BankDBService dbservice = new BankDBService();

	void signup() {
		Boolean check1 = false;
		Boolean check2 = false;
		Boolean check3 = false;
		Boolean check4 = false;

		String id = null;
		String pwd = null;
		String phone_num = null;
		String user_email = null;
		System.out.println("[회원가입]");

		while (!check1) {
			System.out.print("아이디를 입력해주세요(영문, 숫자로만  5자 이상, 12자 이하): ");
			id = scanner.next();
			check1 = Pattern.matches(id_regex, id);
			if (check1 == false) {
				System.out.println("아이디 형식에 맞지 않습니다.");
			}
		}
		while (!check2) {
			System.out.print("비밀번호를 입력해주세요 (영문, 숫자로만  5자 이상, 12자 이하): ");
			pwd = scanner.next();
			check2 = Pattern.matches(pwd_regex, pwd);
			if (check2 == false) {
				System.out.println("비밀번호 형식에 맞지 않습니다.");
			}
		}
		while (!check3) {
			System.out.print("휴대폰 번호를 입력해주세요 (예시: 010-1234-5678): ");
			phone_num = scanner.next();
			check3 = Pattern.matches(phone_regex, phone_num);
			if (check3 == false) {
				System.out.println("전화번호 형식에 맞지 않습니다.");
			}
		}
		while (!check4) {
			System.out.print("이메일 입력해주세요: ");
			user_email = scanner.next();
			check4 = Pattern.matches(email_regex, user_email);
			if (check4 == false) {
				System.out.println("이메일 형식에 맞지 않습니다.");
			}

		}
		System.out.println("1.세모은행     2.네모 은행     3.동그라미 은행 ");
		System.out.print("계좌 개설을 원하는 은행 번호를 입력해주세요: ");
		int brand_num = scanner.nextInt();
		AccountInfo account = new AccountInfo();
		switch (brand_num) {
		case 1:
			account = new AccountInfo(id, null, "semo", 0, "silver");
			break;
		case 2:
			account = new AccountInfo(id, null, "nemo", 0, "silver");
			break;
		case 3:
			account = new AccountInfo(id, null, "circle", 0, "silver");
			break;

		}

		// MemberInfo member = new MemberInfo(id, pwd, user_email, phone_num, null,
		// null);
		// memberinfos.add(member);
		MemberEntity entity = new MemberEntity(id, pwd, user_email, phone_num, null, null);
		dbservice.saveMemberInfo(entity, account);

		System.out.println("성공적으로 가입되었습니다.");
	}

	public void openNewAccount(String id) {
		System.out.println("1.세모은행     2.네모 은행     3.동그라미 은행 ");
		System.out.print("계좌 개설을 원하는 은행 번호를 입력해주세요: ");
		int brand_num = scanner.nextInt();
		AccountInfo account = new AccountInfo();
		switch (brand_num) {
		case 1:
			account = new AccountInfo(id, null, "semo", 0, "silver");
			if (dbservice.openAccount(account) == 1) {
				System.out.println("이미 해당 은행 계좌는 존재합니다.");
			} else {
				System.out.println("성공적으로 개설되었습니다.");
			}
			break;
		case 2:
			account = new AccountInfo(id, null, "nemo", 0, "silver");
			if (dbservice.openAccount(account) == 1) {
				System.out.println("이미 해당 은행 계좌는 존재합니다.");
			} else {
				System.out.println("성공적으로 개설되었습니다.");
			}
			break;
		case 3:
			account = new AccountInfo(id, null, "circle", 0, "silver");
			if (dbservice.openAccount(account) == 1) {
				System.out.println("이미 해당 은행 계좌는 존재합니다.");
			} else {
				System.out.println("성공적으로 개설되었습니다.");
			}
			break;
		}
	}

	void login(String login_id, String login_pwd) {
		int result = dbservice.MemberLogin(login_id, login_pwd);
		if (result == -1)
			System.out.println("아이디가 존재하지 않습니다.");
		if (result == 0) {
			System.out.println("비밀번호가 맞지 않습니다.");
		}
		if (result == 1) {
			System.out.println("성공적으로 로그인 되었습니다.");
			current_login_id = login_id;
			loginSuccess = true;
		}

	}

	public int inputmoney(int money, String account, String user_id) {
		int result = -1;
		String readed_account = dbservice.ReadMemberInfoByAccount(account);
		if (readed_account != null && readed_account.equals(user_id)) {
			if (dbservice.changeBalance(money, true, account) != -1) {
				System.out.println("성공적으로 입금되었습니다");
				result = 1;
				return result;
			}
		} else {
			System.out.println("계좌번호가 올바르지 않습니다.");
			return result;
		}
		return result;

	}

	public int outputmoney(int money, String account, String user_id) {
		int result = -1;
		String readed_account = dbservice.ReadMemberInfoByAccount(account);
		if (readed_account != null && readed_account.equals(user_id)) {
			if (dbservice.changeBalance(money, false, account) != -1) {
				System.out.println("성공적으로 출금되었습니다");
				result = 1;
				return result;
			}
		} else {
			System.out.println("계좌번호가 올바르지 않습니다.");
			return result;
		}
		return result;
	}

	void showmoney(String user_id) {
		dbservice.showAccounts(user_id);
	}

	void printmemberinfo(String user_id) {
		dbservice.ReadMemberInfo(user_id);
	}

	/*
	 * void saveMemberinfo() throws IOException { File file = new
	 * File("C:/work/BankMemberInfo.txt"); FileWriter fwriter = new
	 * FileWriter(file); BufferedWriter bw = new BufferedWriter(fwriter);
	 * PrintWriter pw = new PrintWriter(bw, true); InputStream is = System.in;
	 * InputStreamReader isr = new InputStreamReader(is); for (MemberInfo memberinfo
	 * : memberinfos) { StringBuilder sb = new StringBuilder();
	 * sb.append(memberinfo.getUser_id().toString() + "|");
	 * sb.append(memberinfo.getUser_pw().toString() + "|");
	 * sb.append(memberinfo.getUser_email().toString() + "|");
	 * sb.append(memberinfo.getPhone_num().toString() + "|"); pw.println(sb); }
	 * 
	 * pw.close(); }
	 */
	void editMemberinfo(String user_id) {
		System.out.println("수정하길 원하는 회원정보 번호를 입력해주세요.");
		System.out.println("=============================");
		System.out.println("1.비밀번호 | 2. 이메일 | 3. 핸드폰 번호");
		System.out.println("=============================");
		System.out.print("번호 입력: ");
		int info_num = scanner.nextInt();
		System.out.println();
		System.out.print("수정 데이터: ");
		String edit_info = scanner.next();
		dbservice.modifyInfo(edit_info, info_num, user_id);

	}

	public int sendMoney(String user_id, int money, String my_account, String send_account) {
		// String send_account = dbservice.ReadMemberInfoByAccount(send_account);
		if ((dbservice.ReadMemberInfoByAccount(my_account) == null)
				|| (!dbservice.ReadMemberInfoByAccount(my_account).equals(user_id))) {
			System.out.println("보내는 계좌가 올바르지 않습니다");
			return -1;
		}
		if (dbservice.ReadMemberInfoByAccount(send_account) == null) {
			System.out.println("받는 계좌가 올바르지 않습니다");
			return -1;
		} else {
			if (money > dbservice.readBalance(my_account)) {
				System.out.println("잔액이 부족합니다");
				return -1;
			} else {
				dbservice.changeBalance(money, true, send_account);
				dbservice.changeBalance(money, false, my_account);
				System.out.println("성공적으로 송금되었습니다.");
				return -1;
			}

		}

	}

}
