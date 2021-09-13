package bank;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;

import com.mysql.cj.jdbc.result.ResultSetMetaData;

public class BankDBService {
	//BankService bankservice = new BankService();
	String driver = "com.mysql.cj.jdbc.Driver";
	Connection conn = null;
	Statement stmt = null;
	String url = "jdbc:mysql://localhost:3306/app?characterEncoding=UTF-8&serverTimezone=Asia/Seoul";
	PreparedStatement pstmt = null;
	Random random = new Random();

	public BankDBService() {
		String driver = "com.mysql.cj.jdbc.Driver";
		Connection conn = null;
		Statement stmt = null;
		String url = "jdbc:mysql://localhost:3306/app?characterEncoding=UTF-8&serverTimezone=Asia/Seoul";
		PreparedStatement pstmt = null;

	}

	public void closeConnection() {
		try {

			if (stmt != null)
				stmt.close();
			if (conn != null)
				conn.close();
		} catch (SQLException e) {

		}
	}

	public Connection getConnection() {
		try {
			try {
				Class.forName(driver);
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
			conn = DriverManager.getConnection(url, "root", "kiosk1234");
			// System.out.println("connection");

		} catch (Exception e) {
			e.printStackTrace();
		}
		return conn;
	}

	// update, insert, delete = executeUpdate | select = executeQuery
	public ResultSet executeSelect(String sql) {
		ResultSet rs = null;
		try {

			stmt = getConnection().createStatement();
			rs = stmt.executeQuery(sql);

		} catch (Exception e) {
			e.printStackTrace();
		}
		return rs;
	}

	public int executeOthers(String sql) {
		int result = -1;
		try {
			stmt = getConnection().createStatement();
			result = stmt.executeUpdate(sql);
			System.out.println();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}

	public void changeGrade(String user_id, String grade) {
		String sql = "UPDATE MEMBERS SET grade ='" + grade + "' WHERE user_id='" + user_id + "'";
		executeOthers(sql);
	}

	// return 1 = 로그인 성공, return 0 = 비밀번호 불일치, return -1 = 아이디 존재X
	public int MemberLogin(String id, String pw) {
		String sql = "SELECT COUNT(*) FROM MEMBERS WHERE user_id='" + id + "'";
		String sql2 = "SELECT * FROM MEMBERS WHERE user_id='" + id + "'";
		int result = -2;

		ResultSet rs = executeSelect(sql);
		try {
			if (rs.next()) {
				if (rs.getInt(1) == 0) {
					result = -1;
				} else {
					rs = stmt.executeQuery(sql2);
					if (rs.next()) {
						if (rs.getString(2).equals(pw)) {
							result = 1;
						} else {
							result = 0;
						}
					}
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return result;
	}

	// 회원정보 조회
	public void ReadMemberInfo(String user_id) {

		String sql = "SELECT * FROM MEMBERS WHERE user_id ='" + user_id + "'";

		ResultSet rs = executeSelect(sql);
		try {
			if (rs.next()) {
				for (int i = 1; i < 9; i++) {
					System.out.print(rs.getString(i) + " | ");
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		System.out.println();
	}

	// 계좌번호로 아이디 조회
	public String ReadMemberInfoByAccount(String account) {
		String return_id = null;
		String sql = "SELECT user_id FROM MEMBER_ACCOUNTS WHERE account_num='" + account + "'";
		ResultSet rs = executeSelect(sql);
		try {
			if (rs.next()) {
				return_id = rs.getString(1);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return return_id;
	}

	// 잔액조회
	public int readBalance(String my_account) {
		String sql = "SELECT * FROM MEMBER_ACCOUNTS WHERE account_num='" + my_account + "'";
		ResultSet rs = null;
		int balance = -1;
		try {
			rs = executeSelect(sql);
			if (rs.next())
				balance = rs.getInt(4);
		} catch (SQLException e) {
			System.out.println(e);
		}
		return balance;
	}

	public int openAccount(AccountInfo account) {
		String sql = "SELECT COUNT(*) FROM MEMBER_ACCOUNTS WHERE user_id = '" + account.getUser_id()
				+ "' AND bank_brand='" + account.getBank_brand() + "'";
		int result = -1;
		ResultSet rs = null;
		try {
			rs = executeSelect(sql);
			if (rs.next())
				if (rs.getInt(1) == 1) {
					result = 1;
					return result;
				} else {

					String random_account = makeRandomAccount(account.getBank_brand());
					String sql2 = "insert into member_accounts values(?,?,?,?,?)";
					pstmt = getConnection().prepareStatement(sql2);
					pstmt.setString(1, account.getUser_id());
					pstmt.setString(2, random_account);
					pstmt.setString(3, account.getBank_brand());
					pstmt.setInt(4, account.getBalance());
					pstmt.setString(5, account.getGrade());
					pstmt.executeUpdate();
					result = 0;

				}
		} catch (SQLException e) {
			System.out.println(e);
		}
		return result;
	}

	// 입금, 출금 (flag가 true면 입금, false면 출금)
	public int changeBalance(int amount, Boolean flag, String my_account) {
		int current = readBalance(my_account);
		int result = 0;

		String sql = "";
		// if input money
		if (flag == true) {
			result = current + amount;
			sql = "UPDATE MEMBER_ACCOUNTS SET balance =" + result + " WHERE account_num='" + my_account + "'";
			executeOthers(sql);
			// if output money
		} else {
			// if current is less than output money
			if (current < amount) {
				System.out.println("잔액이 부족합니다");
				result = -1;
				// current is more than output money
			} else {
				result = current - amount;
				sql = "UPDATE MEMBER_ACCOUNTS SET balance =" + result + " WHERE account_num='" + my_account + "'";
				executeOthers(sql);
			}
		}
		return result;
	}

	// 회원탈퇴
	public void dropoutMember(String user_id) {

		String sql = "DELETE FROM MEMBERS WHERE user_id='" + user_id + "'";
		executeOthers(sql);
		String sql2 = "DELETE FROM MEMBER_ACCOUNTS WHERE user_id='" + user_id + "'";
		executeOthers(sql2);
		System.out.println("탈퇴되었습니다");

	}

	public int showAddress(String data) {
		String sql = "SELECT sido,gugun,dong,ri,bldg,bunji FROM ZIPCODE WHERE DONG LIKE '%" + data + "%' ORDER BY seq";
		ResultSet rs = executeSelect(sql);
		ResultSetMetaData rsmd = null;
		try {
			rsmd = (ResultSetMetaData) rs.getMetaData();
		} catch (SQLException e1) {
			e1.printStackTrace();
		}

		try {
			if (rsmd.getColumnCount() == 0) {
				return 0;
			}
			System.out.print("  번호  " + " | ");
			System.out.print("시도" + " | ");
			System.out.print(" 군구   " + "| ");
			System.out.print("  동   " + " | ");
			System.out.print("리 " + " | ");
			System.out.print("  건물   " + " | ");
			System.out.print("  번지   " + " | ");
			System.out.println();
			System.out.println("-----------------------------------------------");
			int j = 1;

			while (rs.next()) {
				System.out.print(j + ". ");
				j++;
				for (int i = 1; i <= 6; i++) {
					System.out.print(rs.getString(i) + " | ");
				}
				System.out.println();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return 1;
	}

	// 동 검색으로 여러 선택지 나열 후 업데이트 => 상세 주소 필요
	public String selectAddress(String user_id, String dong_data, int index) {
		String sql = "SELECT zipcode,sido,gugun,dong,ri,bldg,bunji FROM ZIPCODE WHERE DONG LIKE '%" + dong_data
				+ "%' ORDER BY seq";
		ResultSet rs = executeSelect(sql);
		String return_address = "";
		int j = 1;
		String zipcode = null;

		try {
			while (rs.next()) {
				j++;
				if ((j + 1) == index) {
					rs.next();
					zipcode = rs.getString(1);
					for (int i = 2; i < 7; i++) {

						if (rs.getString(i) != "") {
							return_address += rs.getString(i);
							return_address += " ";
						}
					}
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		String sql2 = "UPDATE MEMBERS SET ZIPCODE_SEQ = '" + zipcode + "' WHERE user_id = '" + user_id + "'";
		executeOthers(sql2);
		return return_address;

	}

	public void updateDetailAddress(String user_id, String address) {
		String sql = "UPDATE MEMBERS SET DETAIL_ADDRESS = '" + address + "' WHERE user_id = '" + user_id + "'";
		executeOthers(sql);
	}

	// 회원 정보 수정
	public void modifyInfo(String data, int index, String user_id) {
		String sql = "";
		if (index == 1) {
			sql = "UPDATE MEMBERS SET user_pw ='" + data + "' WHERE user_id='" + user_id + "'";
		}
		if (index == 2) {
			sql = "UPDATE MEMBERS SET user_email ='" + data + "' WHERE user_id='" + user_id + "'";
		}
		if (index == 3) {
			sql = "UPDATE MEMBERS SET phone_num ='" + data + "' WHERE user_id='" + user_id + "'";
		}
		executeOthers(sql);
		System.out.println("성공적으로 수정되었습니다.");

	}

	// 가진 계좌 보여주기
	public void showAccounts(String user_id) {
		String sql = "SELECT ACCOUNT_NUM, BANK_BRAND,BALANCE FROM MEMBER_ACCOUNTS WHERE user_id='" + user_id + "'";
		ResultSet rs = executeSelect(sql);
		int j = 1;
		System.out.println("================================");
		System.out.println("     계좌번호                | 은행    | 잔액  |");
		try {
			while (rs.next()) {
				System.out.print(j + ". ");
				j++;
				for (int i = 1; i < 4; i++) {
					System.out.print(rs.getString(i) + " | ");
				}
				System.out.println();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public String makeRandomAccount(String bank_brand) {
		Random random = new Random();
		// seed is current time
		random.setSeed(System.currentTimeMillis());

		// make random account
		String random_account = null;
		if (bank_brand == "semo") {
			random_account = "030-";
		}
		if (bank_brand == "nemo") {
			random_account = "080-";
		}
		if (bank_brand == "circle") {
			random_account = "070-";
		}

		Integer int_object = new Integer(1);
		for (int i = 0; i < 3; i++) {
			int_object = random.nextInt(9);
			random_account += int_object.toString();
		}
		random_account += "-";
		for (int i = 0; i < 4; i++) {
			int_object = random.nextInt(9);
			random_account += int_object.toString();
		}
		return random_account;
	}
	
	// 회원가입(랜덤 계좌번호 생성, 첫 등급은 silver, 가입시간 현재시간으로)
	public void saveMemberInfo(MemberEntity entity, AccountInfo account) {

		String random_account = makeRandomAccount(account.getBank_brand());
		// insert member data into member table and account table
		String sql = "insert into members values(?,?,?,?,?,?,?,?)";
		String sql2 = "insert into member_accounts values(?,?,?,?,?)";
		try {

			try {
				Class.forName(driver);
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}

			// current date
			Calendar cal = Calendar.getInstance();

			Date date = new Date();
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd a HH:mm:ss");
			String current_date = sdf.format(date);

			conn = DriverManager.getConnection(url, "root", "kiosk1234");

			// insert member info
			pstmt = getConnection().prepareStatement(sql);

			pstmt.setString(1, entity.getUser_id());
			pstmt.setString(2, entity.getUser_pw());
			pstmt.setString(3, entity.getUser_email());
			pstmt.setString(4, entity.getPhone_num());
			pstmt.setString(5, current_date);
			pstmt.setString(6, "role_member");
			pstmt.setString(7, null);
			pstmt.setString(8, null);
			pstmt.executeUpdate();

			// insert account
			pstmt = getConnection().prepareStatement(sql2);
			pstmt.setString(1, account.getUser_id());
			pstmt.setString(2, random_account);
			pstmt.setString(3, account.getBank_brand());
			pstmt.setInt(4, account.getBalance());
			pstmt.setString(5, account.getGrade());
			pstmt.executeUpdate();
			// String msg = result > -1 ? "성공" : "실패";

		} catch (SQLException e2) {
			e2.printStackTrace();
		} finally {
			try {
				if (pstmt != null)
					pstmt.close();

				if (conn != null)
					conn.close();

			} catch (SQLException e) {

			}
		}

	}

}
