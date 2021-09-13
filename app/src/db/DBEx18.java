package db;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

/*
 - �׷�ȭ�Ͽ� ������ ��ȸ (GROUP BY)
 	: ��ǥ���� �׷� �Լ� COUNT() , AVG(), MIN(), MAX(), SUM() �Լ� ���,
 		HAVING ��(������)�� �����.
 		
 	ex1) ����(type) ���� ������ �������� ������, �ܼ��� COUNT �Լ��� �����͸� ��ȸ�ϸ� ��ü �������� �����´�
 	ex2) �÷� �׷�ȭ: type �׷�ȭ�Ͽ� name ���� ��ȸ( �÷� �׷�ȭ)
 	ex3) type 1 �ʰ���, type �׷�ȭ�Ͽ� name���� ��ȸ(���� ó�� �� �÷� �׷�ȭ)
 	ex4) type 1 �ʰ���, type �׷�ȭ�Ͽ� name ������ ������ ��, �� �߿� ������ 2��
 				�̻��� ������ ��ȸ(���� ó�� �Ŀ� �÷� �׷�ȭ �Ŀ� ���� ó��)
 	��������) type 1 �ʰ���, type �׷�ȭ�Ͽ� name������ ������ ��, 
 			�� �߿� ������ 2�� �̻��� �����͸� type �������� ���ķ� ��ȸ(�������� ����)
 			
 [���� ���̺� �����]: GBTEST
 */
public class DBEx18 {
	public static void main(String[] args) {

		Connection conn = DBAction.getInstance().getConnection();
		String sql = select();
		Statement stmt = null;
		try {
			stmt = conn.createStatement();
			// String sql = "CREATE TABLE GBTEST(IDX INT, TYPE INT, NAME VARCHAR(10))";

			// int result = stmt.executeUpdate(sql);
			ResultSet rs = stmt.executeQuery(sql);

			ResultSetMetaData rsmd = rs.getMetaData();
			int column = rsmd.getColumnCount();
			for (int i = 1; i <= column; i++) {
				String column_name = rsmd.getColumnName(i);
				System.out.print(column_name + " | ");
			}
			System.out.println();
			System.out.println("----------------------");
			while (rs.next()) {

				for (int i = 1; i <= column; i++) {
					System.out.print(rs.getString(i) + " | ");
				}
				System.out.println();
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (stmt != null)
					stmt.close();
				if (conn != null)
					conn.close();
			} catch (SQLException e) {

			}
		}

	}

	public static String select() {
		//String sql = "SELECT COUNT(TYPE) FROM GBTEST";
		//String sql = "SELECT TYPE, COUNT(NAME) AS CNT FROM GBTEST GROUP BY TYPE";
		//String sql = "SELECT TYPE, COUNT(NAME) AS CNT FROM GBTEST WHERE TYPE>1 GROUP BY TYPE";
		//��������: String sql = "SELECT TYPE, COUNT(NAME) AS CNT FROM GBTEST GROUP BY TYPE HAVING CNT>=2 ORDER BY IDX DESC";
		String sql = "";
		return sql;
	}

	public static String insert() {
		// String sql = "INSERT INTO GBTEST VALUES(1,1,'ȫ�浿')";
		// String sql = "INSERT INTO GBTEST VALUES(2,1,'�̼���')";
		// String sql = "INSERT INTO GBTEST VALUES(3,2,'������')";
		// String sql = "INSERT INTO GBTEST VALUES(4,2,'������')";
		// String sql = "INSERT INTO GBTEST VALUES(5,3,'ĥ����')";
		// String sql = "INSERT INTO GBTEST VALUES(6,3,'������')";
		//String sql = "INSERT INTO GBTEST VALUES(7,4,'������')";
		//Ÿ�Ժ��� �����ؼ� COUNT
		String sql = "";
		return sql;
	}
}
