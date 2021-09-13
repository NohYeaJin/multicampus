package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

//ORDER BY ¹®
//ORDER BY ( ASC(ascending], DESC[descending] ) Á¤·Ä 

public class DBEx15 {

	public static void main(String[] args) {

		Connection conn = DBAction.getInstance().getConnection();
		String sql = insert();
		Statement stmt = null;
		try {
			stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			ResultSetMetaData rsmd = rs.getMetaData();
			int column = rsmd.getColumnCount();
			while (rs.next()) {
				for (int i = 1; i <= column; i++) {
					System.out.print(rs.getString(i) + " | ");
					String column_name = rsmd.getColumnName(i);
					System.out.print(column_name+" | ");
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

	public static String insert() {
		String sql = "SELECT * FROM OBTEST ORDER BY NUM ASC";
		return sql;
	}

}
