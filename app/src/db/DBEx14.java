package db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;


/* Alter문
 - table 변경
 [테이블 생성]:ATTEST
 
 */
//실습 1: 컬럼추가
//실습 2: 컬럼타입 변경
//실습3: 컬럼명 변경
//member테이블에 primary key 추가


public class DBEx14 {

	public static void main(String[] args) {
		String sql = "CREATE TABLE ATTEST(ID VARCHAR(10) NOT NULL, PW VARCHAR(10))";
		Connection conn = DBAction.getInstance().getConnection();
		PreparedStatement pstmt = null;
		sql = alter();
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.executeUpdate();
		} catch (SQLException e) {

			e.printStackTrace();
		}

	}
	
	public static String alter() {
		//String sql = "ALTER TABLE ATTEST MODIFY COLUMN AGE INT";
		//String sql = "ALTER TABLE ATTEST CHANGE COLUMN PW PASSWORD VARCHAR(30) NOT NULL";
		//String sql = "ALTER TABLE ATTEST DROP COLUMN AGE";
		String sql = "ALTER TABLE ATTEST ADD PRIMARY KEY(ID)";
		return sql;
	}

}
