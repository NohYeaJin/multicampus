package assignment;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Calendar;

//insertStudents함수와 printallbooks 함수를 static 함수로 변경했습니다

//primary key를 isbn으로 지정했기 때문에 db출력시, 요구사항에 나온 순서대로 나오지 않습니다...ㅠ
//어떻게 해야할지 몰라 일단 resultset으로 가져와서 전부 print만 했습니다

//**모든레코드**를 조회해야한다고 써있는데 bookdto에 publish_date도 없고
//딱히 다른 언급도 없어서 일단 calendar써서 현재연도랑 달만 넣어놨습니다

public class BookTest {

	static Connection conn = null;

	public static void main(String[] args) {
		
		// ==================과제1================================
		BookDTO book1 = new BookDTO(21424, "Java Basic", "김하나", "Jaen.kr", 15000, "Java 기본문법");
		BookDTO book2 = new BookDTO(33455, "JDBC Pro", "김철수", "Jaen.kr", 23000, "");
		BookDTO book3 = new BookDTO(55355, "Servlet/JSP", "박자바", "Jaen.kr", 41000, "Model2 기반");
		BookDTO book4 = new BookDTO(35332, "Android App", "홍길동", "Jaen.kr", 25000, "Lightweight Framework");
		BookDTO book5 = new BookDTO(35355, "OOAD 분석,설계", "소나무", "Jaen.kr", 30000, "");
		/*
		System.out.println("******************** 도서 목록 *****************************");

		System.out.println(book1.toString());
		System.out.println(book2.toString());
		System.out.println(book3.toString());
		System.out.println(book4.toString());
		System.out.println(book5.toString());
		*/
		// ==================과제2================================

		// CREATE TABLE SQL
		createTable();

		// insert Data
		insertStudent(book1);
		insertStudent(book2);
		insertStudent(book3);
		insertStudent(book4);
		insertStudent(book5);
		// print data
		System.out.println("******************** 도서 목록 *****************************");
		printAllBooks();
		
		
	}

	// DB Connection
	public static Connection DBConnection() {
		String driver = "com.mysql.cj.jdbc.Driver";
		// url local setting
		String url = "jdbc:mysql://localhost:3306/app?characterEncoding=UTF-8&serverTimezone=Asia/Seoul";
		try {
			Class.forName(driver);
			// user id and password
			conn = DriverManager.getConnection(url, "root", "kiosk1234");

		} catch (Exception e) {
			System.out.println(e);
		}
		return conn;
	}

	// close connection
	public static void close() {
		try {
			if (conn != null)
				conn.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	public static void createTable() {
		String createTable = "CREATE TABLE BOOKDTO(isbn INT PRIMARY KEY,title VARCHAR(50) NOT NULL, author VARCHAR(250) NOT NULL,"
				+ " publisher VARCHAR(50) NOT NULL, price INT NOT NULL, `desc` VARCHAR(200), publish_date VARCHAR(10))";
		conn = DBConnection();
		Statement stmt;
		try {
			stmt = conn.createStatement();
			stmt.executeUpdate(createTable);

		} catch (SQLException e) {

			e.printStackTrace();
		} finally {
			close();
		}

	}

	// 실습 1번 테이블에 레코드가 insert 되도록 적당한 JDBC 코드로 채우세요.
	public static void insertStudent(BookDTO book) {
		String sql = "INSERT INTO bookdto VALUES(?,?,?,?,?,?,?)";
		Calendar cal = Calendar.getInstance();
		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH) + 1;
		try {
			conn = DBConnection();
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, book.getIsbn());
			pstmt.setString(2, book.getTitle());
			pstmt.setString(3, book.getAuthor());
			pstmt.setString(4, book.getPublisher());
			pstmt.setInt(5, book.getPrice());
			pstmt.setString(6, book.getDesc());
			pstmt.setString(7, year + "." + month);
			pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		}

	}

	// 실습 1번 테이블의 모든 레코드가 조회되고 출력되도록 적당한 JDBC 코드로 채우세요.
	public static void printAllBooks() {
		String sql = "SELECT * FROM BOOKDTO";
		try {
			conn = DBConnection();
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			ResultSetMetaData rsmd = rs.getMetaData();
			int column = rsmd.getColumnCount();
			while (rs.next()) {
				String printSQL = "";
				for (int i = 1; i <= (column - 1); i++) {
					if (i == (column - 1))
						printSQL += (rs.getString(i));
					else
						printSQL += (rs.getString(i) + "	| ");
				}
				System.out.println(printSQL);
			}

		} catch (SQLException e) {

			e.printStackTrace();
		} finally {
			close();

		}

	}

}
