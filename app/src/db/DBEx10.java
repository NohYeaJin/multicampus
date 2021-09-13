package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

/*
 - PRIMARY KEY
 PRIMARY KEY ���� ������ �����ϸ�, �ش� �ʵ�� NOT NULL�� UNIQUE
 ���� ������ Ư¡�� ��� �����ϴ�.
 ���� �� ���� ������ ������ �ʵ�� NULL ���� ���� �� ������,
 ���� �ߺ��� ���� �������� �ȵ˴ϴ�.
 �̷��� PRIMARY KEY ���� ������ �⺻ Ű��� �մϴ�.
 UNIQUE�� �� ���̺��� ���� �ʵ忡 ������ �� ������, PRIMARY KEY�� ���̺��
 ���� �ϳ��� �ʵ忡�� ������ �� �ֽ��ϴ�.
 �̷��� PRIMARY KEY�� ���� ������ ���̺��� �����͸� ���� ������ ã���� �����ִ� ������ �մϴ�.
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
			System.out.println("�ε�����");
			conn = DriverManager.getConnection(url, "root", "kiosk1234");
			// oracle conn = DriverManager.getConnection(url,"hr","hr");
			System.out.println("���Ἲ��");
			//String sql = "CREATE TABLE TEST3(ID VARCHAR(10) PRIMARY KEY, PW VARCHAR(30), NAME VARCHAR(30), MDate DATE, AGE INT)";
			String sql2 = "INSERT INTO TEST3 VALUES('user','pwpw12','ȫ�浿','2021-09-08',20)";
			stmt = conn.createStatement();
			//stmt.executeUpdate(sql);
			stmt.executeUpdate(sql2);
		} catch (Exception e) {
			System.out.println("����");
			System.out.println(e);
		}
	}
}
