package db;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

/*
 - 그룹화하여 데이터 조회 (GROUP BY)
 	: 대표적인 그룹 함수 COUNT() , AVG(), MIN(), MAX(), SUM() 함수 등과,
 		HAVING 절(조건절)을 사용함.
 		
 	ex1) 유형(type) 별로 갯수를 가져오고 싶은데, 단순히 COUNT 함수로 데이터를 조회하면 전체 갯수만을 가져온다
 	ex2) 컬럼 그룹화: type 그룹화하여 name 갯수 조회( 컬럼 그룹화)
 	ex3) type 1 초과인, type 그룹화하여 name개수 조회(조건 처리 후 컬럼 그룹화)
 	ex4) type 1 초과인, type 그룹화하여 name 갯수를 가져온 후, 그 중에 갯수가 2개
 				이상인 데이터 조회(조건 처리 후에 컬럼 그룹화 후에 조건 처리)
 	연습문제) type 1 초과인, type 그룹화하여 name갯수를 가져온 후, 
 			그 중에 갯수가 2개 이상인 데이터를 type 내림차순 정렬로 조회(내림차순 정렬)
 			
 [연습 테이블 만들기]: GBTEST
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
		//연습문제: String sql = "SELECT TYPE, COUNT(NAME) AS CNT FROM GBTEST GROUP BY TYPE HAVING CNT>=2 ORDER BY IDX DESC";
		String sql = "";
		return sql;
	}

	public static String insert() {
		// String sql = "INSERT INTO GBTEST VALUES(1,1,'홍길동')";
		// String sql = "INSERT INTO GBTEST VALUES(2,1,'이순신')";
		// String sql = "INSERT INTO GBTEST VALUES(3,2,'만득이')";
		// String sql = "INSERT INTO GBTEST VALUES(4,2,'개똥이')";
		// String sql = "INSERT INTO GBTEST VALUES(5,3,'칠득이')";
		// String sql = "INSERT INTO GBTEST VALUES(6,3,'갑돌이')";
		//String sql = "INSERT INTO GBTEST VALUES(7,4,'갑순이')";
		//타입별로 구별해서 COUNT
		String sql = "";
		return sql;
	}
}
