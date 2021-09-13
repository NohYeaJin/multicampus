package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

/*
 ���� ����(constraint)
 ��������(constraint)�̶� �������� ���Ἲ�� ��Ű�� ����, �����͸� �Է¹��� �� ����Ǵ� �˻� ��Ģ�� �ǹ��մϴ�.
 �̷��� ���� ������ create������ ���̺��� ������ ���� alter������ �ʵ带 �߰��� ���� ����� �� �ֽ��ϴ�.
 - mysql���� ����� �� �ִ� ���� ������ ������ �����ϴ�.
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
			System.out.println("DB����");
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
		// ���� �����ʹ� null�� ����(not null�� �ƴϴϱ�, null ����ϴϱ�)
		String sql = "INSERT INTO TEST2(ID,PW) VALUES('efg','123')";
		return sql;
	}

	public static String select() {
		String sql = "SELECT * FROM TEST2";
		return sql;
	}

}
