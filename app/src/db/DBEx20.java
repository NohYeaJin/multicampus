package db;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

/*
 JOIN
 JOIN은 DB내의 여러 테이블에서 가져온 레코드를 조합하여
 하나의 테이블이나 결과 집합으로 표현해 줍니다.
 이러한 join은 보통 select 문과 함께 자주 사용됩니다.
 표준 sql에서는 레코드를 조합하는 방식에 따라 join을 다음과 같이 구분합니다.
 (명시적 표현, 암시적 표현)
 1. cross join 
 2. equi join
 3. left join
 4. right join
 
 1. CROSS JOIN은 Cartesian Product(카디션 곱) 이라고도 하며 조인되는 두 테이블에서
 	곱집합을 반환한다.
 	크로스 조인은 가장 간단하고 조인의 기본
 	모든 행을 다 가져오기 때문에 정규화된 데이터베이스에는 사용되지 않는다.
 	첫번째 테이블의 행수를 두 번째 테이블의 행수로 곱한 것 만큼의 행을 반환
 	(명시적 표현, 암시적 표현)
 	
 2. Equi join(Inner equi join)
 	WHERE 절에 조건 연산자 "="를 사용하여 중복된(교집합) 값을 결과로 추출함
 	(명시적 표현, 암시적 표현)
 	
 3. LEFT OUTER JOIN (LEFT JOIN) 
 	left라는 것을 from절에서 지정된 왼쪽 또는 첫번째 테이블을 참조.
 	기존 테이블의 값 + 테이블과 기준 테이블의 중복된 값을 보여줍니다.
 	왼쪽 테이블을 기준으로 join, 결과값은 A테이블의 모든 데이터와 A테이블과 B테이블의 중복되는 값이 선택 
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
		//String sql = "INSERT INTO JNTEST1(PHONE, NAME) VALUES('011-1234-5678','홍길동')";
		//String sql = "INSERT INTO JNTEST1(PHONE, NAME) VALUES('011-1234-5678','이순신')";
		//String sql = "INSERT INTO JNTEST1(PHONE, NAME) VALUES('010-1234-5678','만득이')";
		//String sql = "INSERT INTO JNTEST1(PHONE, NAME) VALUES('010-1234-5678','개똥이')";
		//String sql = "INSERT INTO JNTEST1(PHONE, NAME) VALUES('011-1234-5678','칠득이')";
		//String sql = "INSERT INTO JNTEST1(PHONE, NAME) VALUES('070-1234-5678','갑돌이')";
		
		//String sql = "INSERT INTO JNTEST2 VALUES(1, '2001-01-01','축구선수')";
		//String sql = "INSERT INTO JNTEST2 VALUES(2, '2001-01-02','농구선수')";
		//String sql = "INSERT INTO JNTEST2 VALUES(3, '2001-01-03','배구선수')";
		String sql = "INSERT INTO JNTEST2 VALUES(7, '2001-01-01','배구선수2')";
		
		return sql;
	}
	
	public static String select() {
		//명시적
		//String sql = "SELECT * FROM JNTEST1 CROSS JOIN JNTEST2 ";
		//묵시적
		//String sql = "SELECT * FROM JNTEST1, JNTEST2";
		
		//공통 부분찾기
		//String sql = "SELECT * FROM JNTEST1 T1 INNER JOIN JNTEST2 T2 ON T1.ID = T2.ID";
		//묵시적
		//String sql = "select * from JNTEST1 T1, JNTEST2 T2 WHERE T1.ID = T2.ID";
		
		//left join
		//String sql = "SELECT * FROM JNTEST1 T1 LEFT OUTER JOIN JNTEST2 T2 ON T1.ID = T2.ID IS NULL";
		
		//right join
		String sql = "SELECT * FROM JNTEST1 T1 RIGHT OUTER JOIN JNTEST2 T2 ON T1.ID = T2.ID IS NOT NULL";
		return sql;
	}
}
