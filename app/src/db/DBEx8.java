package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

/*
 제약 조건(constraint)
 제약조건(constraint)이란 데이터의 무결성을 지키기 위해, 데이터를 입력받을 때 실행되는 검사 규칙을 의미합니다.
 이러한 제약 조건은 create문으로 테이블을 생성할 때나 alter문으로 필드를 추가할 때도 사용할 수 있습니다.
 - mysql에서 사용할 수 있는 제약 조건은 다음과 같습니다.
 1.NOT NULL
 2. UNIQUE
 3. PRIMARY KEY
 4. FOREIGN KEY
 5. DEFAULT
 
 -NOT NULL
 
 CREATE TABLE TEST1(
 	ID VARCHAR(10) NOT NULL,
 	PW VARCHAR(30),
 	NAME VARCHAR(30),
 	MDate DATE,
 	AGE INT
 );
 */
public class DBEx8 {

	public static void main(String[] args) {
		
		String url = "jdbc:mysql://localhost:3306/app?characterEncoding=UTF-8&serverTimezone=Asia/Seoul";
		String driver = "com.mysql.cj.jdbc.Driver";
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		try {
			Class.forName(driver);
			conn = DriverManager.getConnection(url, "root", "kiosk1234");
			System.out.println("DB연결");
			stmt = conn.createStatement();
			String sql = insert();
			String sql2 = select();

			int result = stmt.executeUpdate(sql);
			rs= stmt.executeQuery(sql2);
			ResultSetMetaData rsmd = rs.getMetaData();
			int count = rsmd.getColumnCount();
			while(rs.next()) {
				for(int i = 1;i<=count;i++) {
					System.out.print(rs.getString(i)+" | ");
				}
				System.out.println();
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (stmt != null)
					stmt.close();

				if (conn != null)
					conn.close();

			} catch (SQLException e) {

			} finally {
				try {
					if (rs != null)
						rs.close();
					if (stmt != null)
						stmt.close();
					if (conn != null)
						conn.close();
				} catch (SQLException e) {

				}
			}
		}
	}

	public static String insert() {
		// 없는 데이터는 null로 들어간다(not null이 아니니까, null 허용하니까)
		String sql = "INSERT INTO TEST2(ID,PW) VALUES('efg','123')";
		return sql;
	}

	public static String select() {
		String sql = "SELECT * FROM TEST2";
		return sql;
	}

}
