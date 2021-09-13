package db;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

/*
 JOIN
 JOIN�� DB���� ���� ���̺��� ������ ���ڵ带 �����Ͽ�
 �ϳ��� ���̺��̳� ��� �������� ǥ���� �ݴϴ�.
 �̷��� join�� ���� select ���� �Բ� ���� ���˴ϴ�.
 ǥ�� sql������ ���ڵ带 �����ϴ� ��Ŀ� ���� join�� ������ ���� �����մϴ�.
 (����� ǥ��, �Ͻ��� ǥ��)
 1. cross join 
 2. equi join
 3. left join
 4. right join
 
 1. CROSS JOIN�� Cartesian Product(ī��� ��) �̶�� �ϸ� ���εǴ� �� ���̺���
 	�������� ��ȯ�Ѵ�.
 	ũ�ν� ������ ���� �����ϰ� ������ �⺻
 	��� ���� �� �������� ������ ����ȭ�� �����ͺ��̽����� ������ �ʴ´�.
 	ù��° ���̺��� ����� �� ��° ���̺��� ����� ���� �� ��ŭ�� ���� ��ȯ
 	(����� ǥ��, �Ͻ��� ǥ��)
 	
 2. Equi join(Inner equi join)
 	WHERE ���� ���� ������ "="�� ����Ͽ� �ߺ���(������) ���� ����� ������
 	(����� ǥ��, �Ͻ��� ǥ��)
 	
 3. LEFT OUTER JOIN (LEFT JOIN) 
 	left��� ���� from������ ������ ���� �Ǵ� ù��° ���̺��� ����.
 	���� ���̺��� �� + ���̺�� ���� ���̺��� �ߺ��� ���� �����ݴϴ�.
 	���� ���̺��� �������� join, ������� A���̺��� ��� �����Ϳ� A���̺�� B���̺��� �ߺ��Ǵ� ���� ���� 
 */
public class DBEx20 {
	public static void main(String[] args) {

		Connection conn = DBAction.getInstance().getConnection();
		//String sql = select();
		Statement stmt = null;
		try {
			stmt = conn.createStatement();
			String sql = select();
			//String sql = "CREATE TABLE LSTEST(PHONE VARCHAR(15),NAME VARCHAR(10))";
			//String sql = "CREATE TABLE JNTEST1( ID INT primary key auto_increment, PHONE VARCHAR(15), NAME VARCHAR(10))";
			//String sql = "CREATE TABLE JNTEST2(ID INT, MDATE DATE, NAME VARCHAR(10))";
			//String sql = insert();
			//int result = stmt.executeUpdate(sql);
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
	
	public static String insert() {
		//String sql = "INSERT INTO JNTEST1(PHONE, NAME) VALUES('011-1234-5678','ȫ�浿')";
		//String sql = "INSERT INTO JNTEST1(PHONE, NAME) VALUES('011-1234-5678','�̼���')";
		//String sql = "INSERT INTO JNTEST1(PHONE, NAME) VALUES('010-1234-5678','������')";
		//String sql = "INSERT INTO JNTEST1(PHONE, NAME) VALUES('010-1234-5678','������')";
		//String sql = "INSERT INTO JNTEST1(PHONE, NAME) VALUES('011-1234-5678','ĥ����')";
		//String sql = "INSERT INTO JNTEST1(PHONE, NAME) VALUES('070-1234-5678','������')";
		
		//String sql = "INSERT INTO JNTEST2 VALUES(1, '2001-01-01','�౸����')";
		//String sql = "INSERT INTO JNTEST2 VALUES(2, '2001-01-02','�󱸼���')";
		//String sql = "INSERT INTO JNTEST2 VALUES(3, '2001-01-03','�豸����')";
		String sql = "INSERT INTO JNTEST2 VALUES(7, '2001-01-01','�豸����2')";
		
		return sql;
	}
	
	public static String select() {
		//�����
		//String sql = "SELECT * FROM JNTEST1 CROSS JOIN JNTEST2 ";
		//������
		//String sql = "SELECT * FROM JNTEST1, JNTEST2";
		
		//���� �κ�ã��
		//String sql = "SELECT * FROM JNTEST1 T1 INNER JOIN JNTEST2 T2 ON T1.ID = T2.ID";
		//������
		//String sql = "select * from JNTEST1 T1, JNTEST2 T2 WHERE T1.ID = T2.ID";
		
		//left join
		//String sql = "SELECT * FROM JNTEST1 T1 LEFT OUTER JOIN JNTEST2 T2 ON T1.ID = T2.ID IS NULL";
		
		//right join
		String sql = "SELECT * FROM JNTEST1 T1 RIGHT OUTER JOIN JNTEST2 T2 ON T1.ID = T2.ID IS NOT NULL";
		return sql;
	}
}
