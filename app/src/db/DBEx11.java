package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/*
 - FOREIGN KEY: 외래키
 	FOREIGN KEY 제약 조건을 설정한 필드는 외래키라고 부르며,
 	한 테이블을 다른 테이블과 연결해주는 역할을 합니다.
 	외래키가 설정된 테이블에 레코드를 입력하면, 기준이 되는 테이블의 내용을
 	참조해서 레코드가 입력됩니다.
 	즉, FOREIGN KEY 제약 조건은 하나의 테이블을 다른 테이블에 의존하게 만듭니다.
 	FOREIGN KEY 제약 조건을 설정할 때 참조되는 테이블의 필드는 반드시
 	UNIQUE나 PRIMARY KEY 제약 조건이 설정되어 있어야 합니다. 
 */

public class DBEx11 {

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
			System.out.println("로딩성공");
			conn = DriverManager.getConnection(url, "root", "kiosk1234");
			// oracle conn = DriverManager.getConnection(url,"hr","hr");
			System.out.println("연결성공");
			//String sql = "CREATE TABLE TEST4(CODE INT PRIMARY KEY, ITEM VARCHAR(30), RDate DATE)";
			//String sql2 = "CREATE TABLE TEST5(NUM INT PRIMARY KEY auto_increment, CODE INT, FOREIGN KEY(CODE) REFERENCES TEST4(CODE) ON UPDATE CASCADE)";
			String sql = insert();
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			//stmt.executeUpdate(sql2);
		} catch (Exception e) {
			System.out.println("실패");
			System.out.println(e);
		}
	}
	
	public static String insert() {
		String sql = "INSERT INTO TEST5(CODE) VALUES(2)";
		return sql;
	}

}
