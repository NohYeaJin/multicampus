package assignment;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Calendar;

//insertStudents�Լ��� printallbooks �Լ��� static �Լ��� �����߽��ϴ�

//primary key�� isbn���� �����߱� ������ db��½�, �䱸���׿� ���� ������� ������ �ʽ��ϴ�...��
//��� �ؾ����� ���� �ϴ� resultset���� �����ͼ� ���� print�� �߽��ϴ�

//**��緹�ڵ�**�� ��ȸ�ؾ��Ѵٰ� ���ִµ� bookdto�� publish_date�� ����
//���� �ٸ� ��޵� ��� �ϴ� calendar�Ἥ ���翬���� �޸� �־�����ϴ�

public class BookTest {

	static Connection conn = null;

	public static void main(String[] args) {
		
		// ==================����1================================
		BookDTO book1 = new BookDTO(21424, "Java Basic", "���ϳ�", "Jaen.kr", 15000, "Java �⺻����");
		BookDTO book2 = new BookDTO(33455, "JDBC Pro", "��ö��", "Jaen.kr", 23000, "");
		BookDTO book3 = new BookDTO(55355, "Servlet/JSP", "���ڹ�", "Jaen.kr", 41000, "Model2 ���");
		BookDTO book4 = new BookDTO(35332, "Android App", "ȫ�浿", "Jaen.kr", 25000, "Lightweight Framework");
		BookDTO book5 = new BookDTO(35355, "OOAD �м�,����", "�ҳ���", "Jaen.kr", 30000, "");
		/*
		System.out.println("******************** ���� ��� *****************************");

		System.out.println(book1.toString());
		System.out.println(book2.toString());
		System.out.println(book3.toString());
		System.out.println(book4.toString());
		System.out.println(book5.toString());
		*/
		// ==================����2================================

		// CREATE TABLE SQL
		createTable();

		// insert Data
		insertStudent(book1);
		insertStudent(book2);
		insertStudent(book3);
		insertStudent(book4);
		insertStudent(book5);
		// print data
		System.out.println("******************** ���� ��� *****************************");
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

	// �ǽ� 1�� ���̺� ���ڵ尡 insert �ǵ��� ������ JDBC �ڵ�� ä�켼��.
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

	// �ǽ� 1�� ���̺��� ��� ���ڵ尡 ��ȸ�ǰ� ��µǵ��� ������ JDBC �ڵ�� ä�켼��.
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
