package userinfo;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.UserInfoDao;
import db.DBAction;
import dto.UserInfo;

/**
 * Servlet implementation class UserInfoListServlet
 */
@WebServlet("/UserInfoListServlet")
public class UserInfoListServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	Connection conn = null;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public UserInfoListServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	public void init() {
		DBAction db = DBAction.getInstance();
		conn = db.getConnection();
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF-8");
		try {
			UserInfoDao userinfoDao = new UserInfoDao();
			List<UserInfo> userinfos = userinfoDao.selectList();
			RequestDispatcher rd = request.getRequestDispatcher("/jspEx/userinfo/UserInfoList.jsp");
			request.setAttribute("userinfos", userinfos);
			rd.include(request, response);
		}catch(Exception e) {
			e.printStackTrace();
		}
		// 재귀적이어도 괜찮다, 어차피 init안에 getinstance로 인해 하나밖에 사용하지 않음
		/*
		response.setContentType("text/html; charset = UTF-8");
		PrintWriter out = response.getWriter();
		UserInfoDao userinfoDao = new UserInfoDao();
		List<UserInfo> list = null;
		try {
			list = userinfoDao.selectList();
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		
		*/
		/*
		Statement pstmt = null;
		ResultSet rs = null;
		ResultSetMetaData rsmd = null;
		List<UserInfo> users = new ArrayList();
		conn = DBAction.getInstance().getConnection();
		try {
			pstmt = conn.createStatement();
			rs = pstmt.executeQuery("SELECT * FROM USERINFO");
			rsmd = rs.getMetaData();
			int cols = rsmd.getColumnCount();
			out.println("<html><body>");
			out.println("<table border = '1'>");
			while (rs.next()) {
				out.println("<tr>");
				
				UserInfo user = new UserInfo().setId(rs.getString(1)).setPw(rs.getString(2)).setName(rs.getString(3));
				users.add(user);
				out.println("<td><b><a href='/webapp_1/UserInfoUpdateServlet?id=" + user.getId() + "'>" + user.getId()
						+ "</a></b></td>");
				out.println("<td><b>" + user.getPw() + "</b></td>");
				out.println("<td><b>" + user.getName() + "</b></td>");
				out.println("</tr>");

			}
			out.println("</table>");
			out.println("<a href = '/webapp_1/UserInfoAdd'>회원가입</a>");
			out.println("</body>");
			out.println("</html>");
			out.close();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (rs != null)
					rs.close();
			} catch (Exception e) {

			}
			try {
				if (pstmt != null)
					pstmt.close();
			} catch (Exception e) {

			}
		}
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
