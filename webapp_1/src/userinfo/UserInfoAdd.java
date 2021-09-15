package userinfo;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dto.UserInfo;

/**
 * Servlet implementation class UserInfoAdd
 */
@WebServlet("/UserInfoAdd")
public class UserInfoAdd extends HttpServlet {
	private static final long serialVersionUID = 1L;
	Connection conn = null;

	// Statement stmt = null;
	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public UserInfoAdd() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
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

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		String name = request.getParameter("name");
		UserInfo user = new UserInfo().setId(id).setPw(pw).setName(name);
		Statement stmt = null;
		
		try {
			PreparedStatement pstmt = conn.prepareStatement("INSERT INTO USERINFO VALUES(?,?,?)");
			String sql = "INSERT INTO USERINFO VALUES('"+user.getId()+"','"+user.getPw()+"','"+user.getName()+"')";
			stmt = conn.createStatement();
			int result = stmt.executeUpdate(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (stmt != null) {
					stmt.close();

				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<body>");
		out.println("<form method='post' action='/webapp_1/UserInfoAdd'>");
		out.println("아이디: <input type='text' name='id'>");
		out.println("비밀번호: <input type='text' name='pw'>");
		out.println("이름: <input type='text' name='name'>");
		out.println("</form>");
		out.println("</body>");
		out.println("</html>");
		out.close();
	}

}
