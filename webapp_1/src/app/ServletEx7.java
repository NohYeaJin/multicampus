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

import dto.UserInfo;

/**
 * Servlet implementation class ServletEx7
 */
@WebServlet("/ServletEx7")
public class ServletEx7 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */

	Connection conn = null;

	public ServletEx7() {
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

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		// doGet(request, response);
		response.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=UTF-8");
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		// Member member = null; //DTO
		Statement stmt = null;
		ResultSet rs = null;
		
		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println();
		out.println("<body>");

		try {
			stmt = conn.createStatement();
			//String sql = "SELECT * FROM USERINFO WHERE ID = '" + id + "'";
			String sql = "SELECT user_pw FROM MEMBERS WHERE user_id = '" + id + "'";
			rs = stmt.executeQuery(sql);

			if (rs.next()) {
				if (pw.equals(rs.getString(1))) {
					out.println("로그인 성공!");
					//new UserInfo().setId(rs.getNString("ID")).setPw(rs.getString("PW")).setName(rs.getNString("Name"));
				} else {
					out.println("PW X");

				}

			} else {
				out.println("ID X");
			}
		} catch (SQLException e) {

			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Override
	public void destroy() {
		try {

			if (conn != null)
				conn.close();

		} catch (

		SQLException e) {

		}
	}
}
