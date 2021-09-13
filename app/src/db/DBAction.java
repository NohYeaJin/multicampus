package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/*
 - DEFAULT
 DEFAULT 제약 조건은 해당 필드의 기본값을 설정할 수 있게 해줍니다.
 만약 레코드를 입력할 때 해당 필드 값을 전달하지 않으면,
 자동으로 설정된 기본값을 저장합니다.
 [테이블 생성]
 
 */
public class DBAction {

	private static DBAction instance = new DBAction();
	private Connection conn = null;
	//Connection conn = DBAction.getInstance().getConnection();
	
	public DBAction() {
		String driver = "com.mysql.cj.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/app?characterEncoding=UTF-8&serverTimezone=Asia/Seoul";
		try {
			Class.forName(driver);
			conn = DriverManager.getConnection(url, "root", "kiosk1234");

		} catch (Exception e) {
			System.out.println(e);
		}
	}

	public static DBAction getInstance() {
		if (instance == null) {
			instance = new DBAction();
		}
		return instance;
	}

	public static void main(String[] args) {
		String driver = "com.mysql.cj.jdbc.Driver";
		// String driver = "oracle.jdbc.driver.OracleDriver";
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		String url = "jdbc:mysql://localhost:3306/app?characterEncoding=UTF-8&serverTimezone=Asia/Seoul";
		// String url = "jdbc:oracle:thin:@localhost:1521:xe"; oracle
		try {
			Class.forName(driver);
			conn = DriverManager.getConnection(url, "root", "kiosk1234");
			stmt = conn.createStatement();
			// String sql = "CREATE TABLE TEST6(ID VARCHAR(10), PW VARCHAR(30), NAME
			// VARCHAR(30) DEFAULT 'Anonymous', MDate DATE, AGE INT)";
			String sql = insert();
			stmt.executeUpdate(sql);
		} catch (Exception e) {
			System.out.println("실패");
			System.out.println(e);
		}
	}

	public static String insert() {
		String sql = "INSERT INTO TEST6(ID, PW, MDATE, AGE) VALUES ('abc','123','2021-09-08',100)";
		return sql;
	}

	public Connection getConnection() {
		return conn;
	}

	public void close() {
		try {
			if (conn != null)
				conn.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
