package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class DBEx4 {

	public static void main(String[] args) {

		String driver = "com.mysql.cj.jdbc.Driver";
		// String driver = "oracle.jdbc.driver.OracleDriver";
		Connection conn = null;
		Statement stmt = null;
		String url = "jdbc:mysql://localhost:3306/app?characterEncoding=UTF-8&serverTimezone=Asia/Seoul";
		// String url = "jdbc:oracle:thin:@localhost:1521:xe"; oracle
		try {
			try {
				Class.forName(driver);
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
			System.out.println("로딩성공");
			conn = DriverManager.getConnection(url, "root", "kiosk1234");
			// oracle conn = DriverManager.getConnection(url,"hr","hr");
			System.out.println("연결성공");
			stmt = conn.createStatement();
			String sql = insert();
			int result = stmt.executeUpdate(sql);
			String msg = result > -1 ? "성공" : "실패";
			System.out.println("입력" + msg);
			// String msg TODO: result msg
		} catch (SQLException e) {
			System.out.println(e);
			System.out.println("로딩 실패");
		} finally {
			// db가 꺼져있거나 에러가 있을 경우를 위해 예외처리
			try {
				if (stmt != null)
					stmt.close();

				if (conn != null)
					conn.close();

			} catch (SQLException e) {

			}
		}
	}

	// db에 id pw 저장
	public static String insert() {
		Scanner scan = new Scanner(System.in);
		System.out.println("DBTEST 테이블에 값 입력하기");
		//System.out.print("ID: ");
		//String id = scan.next();
		//System.out.print("PW: ");
		//String pw = scan.next();
		String sql = "insert into DBTEST2 values('user34','pw12',23,NOW())";
		return sql;
	}

}
