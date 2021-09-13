package db;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

/*
 - LIKE �˻�: ���ڿ� �κ� ��ġ �˻�(LIKE)
 	Equal ������ (=)�� ��� �� ��󰪰� ��Ȯ�� ��ġ�ϴ� ���� ������� �˻��մϴ�.
 	�ݸ鿡, ���ڰ��� �κ������θ� ��ġ�ص� ������ �˻��� �ϰ��� �ϴ� ��쿡 LIKE ��ɾ ����մϴ�.
 	���ڿ��÷� ���� �˻� ���ڰ��� �κ��̶� ��ġ�ϴ� �����͸� ��ȸ������� ���� �� ����մϴ�.
 	�κ� ��ġ �˻��� ���ؼ� Ư�� ���ڰ� �̿��� ��ġ���� **('_','%')**�� ����մϴ�.
 - ���ϵ� ī�� ����('_','%')
 	�ǹ�)
 		1. % : 0�� �̻��� �ڸ����� ���� ���ڿ�.
 		2. _ : 1�ڸ��� ����.
 		[����]			[����]
 		�÷��� LIKE '%CD%' �÷��� �� CD�� ���Ե� ���ڿ��� ��� ���
 		�÷��� LIKE 'CD%'  �÷��� �� CD�� �����ϴ� ���ڿ��� ���
 		�÷��� LIKE 'C%D'  �÷��� �� C�� �����ϰ� �߰� ������ �����̵� �������
 						(�ڸ����� �������) ���ڸ� ���� D�� ���ڿ��� ���
 		�÷��� LIKE '_CD_' �÷��� �ڸ����� 4�ڸ��̰�, 1��°, 4��° �ڸ�����
 						�����̵� ������� 2~3��°�� CD�� �� ���ڿ�
 		�÷Ÿ� LIKE 'CD_'  �÷����� 3�ڸ��̰�, CD�� �����ϰ� 3��° ����
 						�����̵� ������� ���ڿ��� ���
 		�÷��� LIKE 'C_D'  �÷����� 3�ڸ��̰� 1��° ���� C, 3��° ���� D�̰�
 						�߰����� 1�ڸ��� �����̵� ������� ���ڿ��� ���
 */

public class DBEx19 {
	
	public static void main(String[] args) {

		Connection conn = DBAction.getInstance().getConnection();
		//String sql = select();
		Statement stmt = null;
		try {
			stmt = conn.createStatement();
			//String sql = select();
			//String sql = "CREATE TABLE LSTEST(PHONE VARCHAR(15),NAME VARCHAR(10))";
			String sql = "CREATE TABLE ZIPCODE( ZIPCODE VARCHAR(7), SIDO VARCHAR(4), GUGUN VARCHAR(17), DONG VARCHAR(26), RI VARCHAR(15), BLDG VARCHAR(42), BUNJI VARCHAR(17), SEQ VARCHAR(5), PRIMARY KEY (SEQ))";
			int result = stmt.executeUpdate(sql);
			//ResultSet rs = stmt.executeQuery(sql);
			 
			/*
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
			*/
			

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
		String sql = "SELECT PHONE, NAME FROM LSTEST WHERE PHONE LIKE '%011'";
		//String sql = "SELECT PHONE, NAME FROM LSTEST WHERE PHONE LIKE '011%'";
		//String sql = "SELECT PHONE, NAME FROM LSTEST WHERE PHONE LIKE '%070%'";
		//String sql = "SELECT PHONE, NAME FROM LSTEST WHERE PHONE LIKE '0%8'";
		//String sql = "SELECT PHONE, NAME FROM LSTEST WHERE NAME LIKE '_��_'";
		//String sql = "SELECT PHONE, NAME FROM LSTEST WHERE NAME LIKE 'ĥ_'";
		//String sql = "SELECT PHONE, NAME FROM LSTEST WHERE NAME LIKE '__��'";
		//String sql = "SELECT PHONE, NAME FROM LSTEST WHERE NAME LIKE '��_��'";
		return sql;
	}
	
	public static String insert() {
		//String sql = "INSERT INTO LSTEST VALUES('011-1234-5678', 'ȫ�浿')";
		//String sql = "INSERT INTO LSTEST VALUES('011-1234-5678', '�̼���')";
		//String sql = "INSERT INTO LSTEST VALUES('010-1234-5678', '������')";
		//String sql = "INSERT INTO LSTEST VALUES('010-1234-5678', '������')";
		//String sql = "INSERT INTO LSTEST VALUES('010-1234-5678', 'ĥ����')";
		String sql = "INSERT INTO LSTEST VALUES('070-1234-5678', '������')";
		return sql;
	}

}
