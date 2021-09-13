package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/*
 - FOREIGN KEY: �ܷ�Ű
 	FOREIGN KEY ���� ������ ������ �ʵ�� �ܷ�Ű��� �θ���,
 	�� ���̺��� �ٸ� ���̺�� �������ִ� ������ �մϴ�.
 	�ܷ�Ű�� ������ ���̺� ���ڵ带 �Է��ϸ�, ������ �Ǵ� ���̺��� ������
 	�����ؼ� ���ڵ尡 �Էµ˴ϴ�.
 	��, FOREIGN KEY ���� ������ �ϳ��� ���̺��� �ٸ� ���̺� �����ϰ� ����ϴ�.
 	FOREIGN KEY ���� ������ ������ �� �����Ǵ� ���̺��� �ʵ�� �ݵ��
 	UNIQUE�� PRIMARY KEY ���� ������ �����Ǿ� �־�� �մϴ�. 
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
			System.out.println("�ε�����");
			conn = DriverManager.getConnection(url, "root", "kiosk1234");
			// oracle conn = DriverManager.getConnection(url,"hr","hr");
			System.out.println("���Ἲ��");
			//String sql = "CREATE TABLE TEST4(CODE INT PRIMARY KEY, ITEM VARCHAR(30), RDate DATE)";
			//String sql2 = "CREATE TABLE TEST5(NUM INT PRIMARY KEY auto_increment, CODE INT, FOREIGN KEY(CODE) REFERENCES TEST4(CODE) ON UPDATE CASCADE)";
			String sql = insert();
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			//stmt.executeUpdate(sql2);
		} catch (Exception e) {
			System.out.println("����");
			System.out.println(e);
		}
	}
	
	public static String insert() {
		String sql = "INSERT INTO TEST5(CODE) VALUES(2)";
		return sql;
	}

}
