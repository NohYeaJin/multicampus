package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/*
 - DEFAULT
 DEFAULT ���� ������ �ش� �ʵ��� �⺻���� ������ �� �ְ� ���ݴϴ�.
 ���� ���ڵ带 �Է��� �� �ش� �ʵ� ���� �������� ������,
 �ڵ����� ������ �⺻���� �����մϴ�.
 [���̺� ����]
 
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
			System.out.println("����");
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
