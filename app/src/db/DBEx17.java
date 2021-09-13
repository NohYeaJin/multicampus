package db;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

// Ex1) NOW, SYSDATE : ���� �ð�, ��¥ ���� ���
// Ex2) CURDATE, CURRENTDATE : ���� ��¥ ���� ��� 
// Ex3) CURTIME, CURRENTTIME : ���� �ð� ���� ���


public class DBEx17 {

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
		String sql = "SELECT SYSDATE() SYSDATE, NOW() NOW";
		//sql = "SELECT CURDATE() CURDATE, CURRENT_DATE() CURRENTDATE";
		sql = "SELECT CURTIME() CURTIME, CURRENT_TIME() CURRENTTIME";
		
		return sql;
	}

}
