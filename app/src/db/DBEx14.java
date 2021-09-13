package db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;


/* Alter��
 - table ����
 [���̺� ����]:ATTEST
 
 */
//�ǽ� 1: �÷��߰�
//�ǽ� 2: �÷�Ÿ�� ����
//�ǽ�3: �÷��� ����
//member���̺� primary key �߰�


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
