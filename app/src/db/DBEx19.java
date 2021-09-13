package db;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

/*
 - LIKE 검색: 문자열 부분 일치 검색(LIKE)
 	Equal 연산자 (=)의 경우 비교 대상값과 정확히 일치하는 값을 대상으로 검색합니다.
 	반면에, 문자값이 부분적으로만 일치해도 데이터 검색을 하고자 하는 경우에 LIKE 명령어를 사용합니다.
 	문자열컬럼 내에 검색 문자값이 부분이라도 일치하는 데이터를 조회대상으로 잡을 때 사용합니다.
 	부분 일치 검색을 위해서 특정 문자값 이외의 위치에는 **('_','%')**를 사용합니다.
 - 와일드 카드 종류('_','%')
 	의미)
 		1. % : 0개 이상의 자리수를 갖는 문자열.
 		2. _ : 1자리수 문자.
 		[형식]			[설명]
 		컬럼명 LIKE '%CD%' 컬럼값 중 CD가 포함된 문자열이 모두 대상
 		컬럼명 LIKE 'CD%'  컬럼값 중 CD로 시작하는 문자열이 대상
 		컬럼명 LIKE 'C%D'  컬럼값 중 C로 시작하고 중간 값들은 무엇이든 상관없이
 						(자리수도 상관없이) 끝자리 값이 D인 문자열이 대상
 		컬럼명 LIKE '_CD_' 컬럼값 자리수가 4자리이고, 1번째, 4번째 자리값은
 						무엇이든 상관없고 2~3번째에 CD가 들어간 문자열
 		컬렴명 LIKE 'CD_'  컬럼값이 3자리이고, CD로 시작하고 3번째 값은
 						무엇이든 상관없는 문자열이 대상
 		컬럼명 LIKE 'C_D'  컬럼값이 3자리이고 1번째 값이 C, 3번째 값이 D이고
 						중간값이 1자리는 무엇이든 상관없는 문자열이 대상
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
		//String sql = "SELECT PHONE, NAME FROM LSTEST WHERE NAME LIKE '_순_'";
		//String sql = "SELECT PHONE, NAME FROM LSTEST WHERE NAME LIKE '칠_'";
		//String sql = "SELECT PHONE, NAME FROM LSTEST WHERE NAME LIKE '__이'";
		//String sql = "SELECT PHONE, NAME FROM LSTEST WHERE NAME LIKE '갑_이'";
		return sql;
	}
	
	public static String insert() {
		//String sql = "INSERT INTO LSTEST VALUES('011-1234-5678', '홍길동')";
		//String sql = "INSERT INTO LSTEST VALUES('011-1234-5678', '이순신')";
		//String sql = "INSERT INTO LSTEST VALUES('010-1234-5678', '만득이')";
		//String sql = "INSERT INTO LSTEST VALUES('010-1234-5678', '개똥이')";
		//String sql = "INSERT INTO LSTEST VALUES('010-1234-5678', '칠득이')";
		String sql = "INSERT INTO LSTEST VALUES('070-1234-5678', '갑돌이')";
		return sql;
	}

}
