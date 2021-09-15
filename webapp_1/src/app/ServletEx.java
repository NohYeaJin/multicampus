package app;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServletEx
 */
@WebServlet("/ServletEx")
public class ServletEx extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	Connection conn = null;
	Statement stmt = null;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ServletEx() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public void init() throws ServletException {
		String url = "jdbc:mysql://localhost:3306/app?characterEncoding=UTF-8&serverTimezone=Asia/Seoul";
		String driver = "com.mysql.cj.jdbc.Driver";
		// Connection conn = null;
		// Statement stmt = null;
		try {
			Class.forName(driver);
			conn = DriverManager.getConnection(url, "root", "kiosk1234");
			// System.out.println("DB연결");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void destroy() {
		try {
			if (stmt != null)
				stmt.close();

			if (conn != null)
				conn.close();

		} catch (

		SQLException e) {

		}
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// response.getWriter().append("Served at: ").append(request.getContextPath());
		// response.setContentType("text/html euc-kr, ksc5601");
		// response.setContentType("text/html;charset=utf-8");
		response.setContentType("text/html");
		response.setCharacterEncoding("UTF-8");
		init();
		// Statement stmt = null;

		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<body>");
		out.println("<table border='1'>");
		out.println("<tr><td colspan = '8'>회원 정보: " + "</td></tr>");

		try {
			stmt = conn.createStatement();
			String sql = "SELECT * FROM MEMBERS";
			ResultSet rs = stmt.executeQuery(sql);
			ResultSetMetaData rsmd = rs.getMetaData();
			int column = rsmd.getColumnCount();

			while (rs.next()) {
				out.println("<tr>");
				for (int i = 1; i <= column; i++) {
					out.println("<td>" + rs.getString(i) + "</td>");
				}
				out.println("</tr>");

			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		out.println("</table>");
		out.println("</body>");
		out.println("</html>");
		out.close();
		destroy();
		
		
		
		/*
		 * String dan = "2 ~ 9"; PrintWriter out = response.getWriter();
		 * out.println("<html>"); out.println("<body>");
		 * out.println("<table border='1'>"); out.println("<tr><td colspan = '9'>단: " +
		 * dan + "</td></tr>"); for (int j = 2; j < 10; j++) { out.println("<tr>"); for
		 * (int i = 1; i < 10; i++) { out.println("<td>" + j + "*" + i + "=" + (i * j) +
		 * "</td>"); } out.println("</tr>"); } out.println("</table>");
		 * out.println("</body>"); out.println("</html>"); out.close();
		 */
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
