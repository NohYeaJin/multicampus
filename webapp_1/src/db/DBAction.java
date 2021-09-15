package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

public class DBAction {

	private static DBAction instance = new DBAction();
	private Connection conn = null;
	private DataSource ds = null;

	// Connection conn = DBAction.getInstance().getConnection();

	public DBAction() {
		/*
		 * String driver = "com.mysql.cj.jdbc.Driver"; String url =
		 * "jdbc:mysql://localhost:3306/app?characterEncoding=UTF-8&serverTimezone=Asia/Seoul";
		 * try { Class.forName(driver); conn = DriverManager.getConnection(url, "root",
		 * "kiosk1234");
		 * 
		 * } catch (Exception e) { System.out.println(e); }
		 */

		try {
			// 초기작업 객체
			InitialContext initctx = new InitialContext();
			// 바인딩 된 곳을 찾아본다 - comp env까지는 자바 환경을 의미 => 고정임
			Context ctx = (Context) initctx.lookup("java:/comp/env");
			ds = (DataSource) ctx.lookup("jdbc/oracle");
			try {
				conn = ds.getConnection();
			} catch (SQLException e) {

				e.printStackTrace();
			}

			// System.out.println(ds);
		} catch (NamingException e) {
			e.printStackTrace();
		}
	}

	public static DBAction getInstance() {
		if (instance == null) {
			instance = new DBAction();
		}
		return instance;
	}

	public static void main(String[] args) {

	}

	public Connection getConnection() {
		return conn;
	}

	public void close() {
		try {
			if (conn != null)
				conn.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}