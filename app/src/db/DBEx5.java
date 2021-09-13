package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class DBEx5 {

	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306/app?characterEncoding=UTF-8&serverTimezone=Asia/Seoul";
		String driver = "com.mysql.cj.jdbc.Driver";
		Connection conn = null;
		Statement stmt = null;
		try {
			Class.forName(driver);
			conn = DriverManager.getConnection(url, "root", "kiosk1234");
			System.out.println("DB연결");
			stmt = conn.createStatement();
			// update문
			String sql = update();
			int result = stmt.executeUpdate(sql);
			String msg = result > -1 ? "성공" : "실패";
			System.out.println(msg);
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if (stmt != null)
					stmt.close();

				if (conn != null)
					conn.close();

			} catch (SQLException e) {

			}
		}
	}

	public static String update() {
		Scanner scan = new Scanner(System.in);
		System.out.print("ID: ");
		String id = scan.next();
		System.out.print("PW: ");
		String pw = scan.next();
		// 정수 실수도 작은 따옴표 괜찮다
		// 반대는 안된다 , 문자열은 무조건 따옴표
		String sql = "UPDATE DBTEST2 SET PW='"+pw+"',AGE = 1000, CRE_DATE = NOW() WHERE ID='"+id+"'";
		return sql;
	}

}
