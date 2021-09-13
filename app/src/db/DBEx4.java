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
			System.out.println("�ε�����");
			conn = DriverManager.getConnection(url, "root", "kiosk1234");
			// oracle conn = DriverManager.getConnection(url,"hr","hr");
			System.out.println("���Ἲ��");
			stmt = conn.createStatement();
			String sql = insert();
			int result = stmt.executeUpdate(sql);
			String msg = result > -1 ? "����" : "����";
			System.out.println("�Է�" + msg);
			// String msg TODO: result msg
		} catch (SQLException e) {
			System.out.println(e);
			System.out.println("�ε� ����");
		} finally {
			// db�� �����ְų� ������ ���� ��츦 ���� ����ó��
			try {
				if (stmt != null)
					stmt.close();

				if (conn != null)
					conn.close();

			} catch (SQLException e) {

			}
		}
	}

	// db�� id pw ����
	public static String insert() {
		Scanner scan = new Scanner(System.in);
		System.out.println("DBTEST ���̺� �� �Է��ϱ�");
		//System.out.print("ID: ");
		//String id = scan.next();
		//System.out.print("PW: ");
		//String pw = scan.next();
		String sql = "insert into DBTEST2 values('user34','pw12',23,NOW())";
		return sql;
	}

}
