package userinfo;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import db.DBAction;

/**
 * Servlet implementation class UserInfoDeleteServlet
 */
@WebServlet("/UserInfoDeleteServlet")
public class UserInfoDeleteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public UserInfoDeleteServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		Connection conn = DBAction.getInstance().getConnection();
		response.setContentType("text/html; charset = UTF-8");
		PrintWriter out = response.getWriter();
		PreparedStatement pstmt = null;
		PreparedStatement pstmt2 = null;
		ResultSet rs = null;
		// List<UserInfo> users = new ArrayList();
		out.println("<html><body>");
		out.println("<h1>회원정보</h1>");
		try {
			pstmt2 = conn.prepareStatement("DELETE FROM USERINFO WHERE ID = ?");
			pstmt = conn.prepareStatement("SELECT * FROM USERINFO WHERE ID = ?");
			// String sql = "SELECT ID, PW, NAME FROM USERINFO WHERE ID = ?";
			pstmt.setString(1, request.getParameter("id"));
			pstmt2.setString(1, request.getParameter("id"));
			pstmt2.executeUpdate();
			rs = pstmt.executeQuery();
			if (rs.next()) {
				out.println("<b>회원 삭제 실패</b>");
			} else {
				out.println("<b>회원 삭제 성공</b>");
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
		out.println("</body></html>");
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
