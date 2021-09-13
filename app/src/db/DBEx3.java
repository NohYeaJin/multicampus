package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class DBEx3 {

	public static void main(String[] args) {
		String driver = "com.mysql.cj.jdbc.Driver";
		// String driver = "oracle.jdbc.driver.OracleDriver";
		Connection conn = null;
		Statement stmt = null;
		String url = "jdbc:mysql://localhost:3306/app?characterEncoding=UTF-8&serverTimezone=Asia/Seoul";
		// String url = "jdbc:oracle:thin:@localhost:1521:xe"; oracle
		try {
			Class.forName(driver);
			System.out.println("로딩성공");
			conn = DriverManager.getConnection(url, "root", "kiosk1234");
			// oracle conn = DriverManager.getConnection(url,"hr","hr");
			System.out.println("연결성공");
			String sql = "CREATE TABLE TEST2(ID VARCHAR(10) UNIQUE, PW VARCHAR(30), NAME VARCHAR(30), MDate DATE, AGE INT)" ;
			stmt = conn.createStatement();
			stmt.executeUpdate(sql);
		} catch (Exception e) {
			System.out.println("실패");
			System.out.println(e);
		}
	}

}
