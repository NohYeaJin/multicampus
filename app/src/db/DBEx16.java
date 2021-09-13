package db;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

/*
 BETWEEN (����): a AND b���� a�� b�� ������(inclusive)
 				�� ������ ��� ���� �ش��ϴ��� ���θ� �������� �Ѵ�.			
 */

public class DBEx16 {

	public static void main(String[] args) {

		Connection conn = DBAction.getInstance().getConnection();
		//String sql = insert();
		Statement stmt = null;
		try {
			stmt = conn.createStatement();
			//String sql = "CREATE TABLE BWTEST(IDX INT, BIRTH DATE, NAME VARCHAR(10))";
			String sql = select();
			//int result = stmt.executeUpdate(sql);
			ResultSet rs = stmt.executeQuery(sql);
			ResultSetMetaData rsmd = rs.getMetaData();
			int column = rsmd.getColumnCount();
			for (int i = 1; i <= column; i++) {
				String column_name = rsmd.getColumnName(i);
				System.out.print(column_name+" | ");
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
		//String sql = "INSERT INTO BWTEST VALUES(1,'2021-01-01','ȫ�浿')";
		//String sql = "INSERT INTO BWTEST VALUES(2,'2021-01-02','�̼���')";
		//String sql = "INSERT INTO BWTEST VALUES(3,'2021-01-03','������')";
		//String sql = "INSERT INTO BWTEST VALUES(4,'2021-02-01','������')";
		//String sql = "INSERT INTO BWTEST VALUES(5,'2021-02-02','ĥ����')";
		//String sql = "INSERT INTO BWTEST VALUES(6,'2021-03-01','������')";
		//String sql = "INSERT INTO BWTEST VALUES(7,'2021-03-02','������')";
		//String sql = "SELECT * FROM BWTEST WHERE BIRTH BETWEEN '2021-01-02' AND '2021-01-08'";
		//sql = "SELECT * FROM BWTEST WHERE IDX >= 2 AND IDX <= 5";
		//sql = "SELECT * FROM BWTEST WHERE IDX BETWEEN 2 AND 5";
		String sql = "SELECT * FROM BWTEST LIMIT 2";
		//������������ (5���� 2����) 
		sql = "SELECT * FROM BWTEST ORDER BY idx desc LIMIT 5,2";
		return sql;
	}

}
