package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

/*
 - PRIMARY KEY
 PRIMARY KEY 제약 조건을 설정하면, 해당 필드는 NOT NULL과 UNIQUE
 제약 조건의 특징을 모두 가집니다.
 따라서 이 제약 조건이 설정된 필드는 NULL 값을 가질 수 없으며,
 또한 중복된 값을 가져서도 안됩니다.
 이러한 PRIMARY KEY 제약 조건을 기본 키라고 합니다.
 UNIQUE는 한 테이블의 여러 필드에 설정할 수 있지만, PRIMARY KEY는 테이블당
 오직 하나의 필드에만 설정할 수 있습니다.
 이러한 PRIMARY KEY의 제약 조건은 테이블의 데이터를 쉽고 빠르게 찾도록 도와주는 역할을 합니다.
 */

public class DBEx10 {

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
			//String sql = "CREATE TABLE TEST3(ID VARCHAR(10) PRIMARY KEY, PW VARCHAR(30), NAME VARCHAR(30), MDate DATE, AGE INT)";
			String sql2 = "INSERT INTO TEST3 VALUES('user','pwpw12','홍길동','2021-09-08',20)";
			stmt = conn.createStatement();
			//stmt.executeUpdate(sql);
			stmt.executeUpdate(sql2);
		} catch (Exception e) {
			System.out.println("실패");
			System.out.println(e);
		}
	}
}
