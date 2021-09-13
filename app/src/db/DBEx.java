package db;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBEx {

	public static void main(String[] args) {
		String driver = "com.mysql.cj.jdbc.Driver";
		//String driver = "oracle.jdbc.driver.OracleDriver";
		Connection conn = null;
		String url = "jdbc:mysql://localhost:3306/app?characterEncoding=UTF-8&serverTimezone=Asia/Seoul";
		//String url = "jdbc:oracle:thin:@localhost:1521:xe"; oracle 
		try {
			Class.forName(driver);
			conn = DriverManager.getConnection(url,"root","kiosk1234");
			//oracle conn = DriverManager.getConnection(url,"hr","hr");
			System.out.println("성공");
		}catch(Exception e) {
			System.out.println("실패");
			
		}
	}

}
