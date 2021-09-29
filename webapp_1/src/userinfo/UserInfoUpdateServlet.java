package userinfo;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
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
 * Servlet implementation class UserInfoUpdateServlet
 */
@WebServlet("/UserInfoUpdateServlet")
public class UserInfoUpdateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	Connection conn = null;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public UserInfoUpdateServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		/*
		 * conn = DBAction.getInstance().getConnection();
		 * response.setContentType("text/html; charset = UTF-8"); PrintWriter out =
		 * response.getWriter(); PreparedStatement pstmt = null; ResultSet rs = null;
		 * ResultSetMetaData rsmd = null; // List<UserInfo> users = new ArrayList();
		 * out.println("<html><body>"); out.println("<h1>ȸ������</h1>"); try { pstmt =
		 * conn.prepareStatement("SELECT ID, PW, NAME FROM USERINFO WHERE ID = ?");
		 * //String sql = "SELECT ID, PW, NAME FROM USERINFO WHERE ID = ?";
		 * pstmt.setString(1,request.getParameter("id")); rs = pstmt.executeQuery();
		 * if(rs.next()) {
		 * out.println("<form action='/webapp_1/UserInfoUpdateServlet' method = 'post'>"
		 * ); out.println("���̵�: <input type='text' name='id' value='"+rs.getString("ID")
		 * +"' readonly><br>");
		 * out.println("��й�ȣ: <input type='text' name='pw' value='"+rs.getString("PW")+
		 * "'><br>");
		 * out.println("�̸�: <input type='text' name='name' value='"+rs.getString("NAME")
		 * +"'><br>"); out.println("<input type='submit' value='����'>"); out.
		 * println("<input type='button' value='���' onclick='location.href=\"/webapp_1/UserInfoListServlet\"'>"
		 * ); out.
		 * println("<input type='button' value='����' onclick='location.href=\"UserInfoDeleteServlet?id="
		 * +rs.getString("ID")+"\"'>"); out.println("</from>"); }else {
		 * out.println("<b>ȸ������ ����</b>"); }
		 * 
		 * } catch (SQLException e) { e.printStackTrace(); }
		 * out.println("</body></html>");
		 */
		
		try {
			UserInfoDao userinfoDao = new UserInfoDao();
			userinfoDao.updateUserInfo(new UserInfo().setId(request.getParameter("id"))
					.setName(request.getParameter("name")).setPw(request.getParameter("pwd")));
			response.sendRedirect("UserInfoListServlet");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		/*
		 * conn = DBAction.getInstance().getConnection();
		 * response.setContentType("text/html; charset = UTF-8"); PreparedStatement
		 * pstmt = null;
		 */
		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF-8");
		try {
			UserInfoDao userinfoDao = new UserInfoDao();
			UserInfo userinfo = userinfoDao.selectOne(request.getParameter("id"));
			request.setAttribute("userinfo", userinfo);
			RequestDispatcher rd = request.getRequestDispatcher("/jspEx/userinfo/UserInfoUpdateForm.jsp");
			rd.include(request, response);
		} catch (Exception e) {
			e.printStackTrace();
			/*
			 * try { pstmt =
			 * conn.prepareStatement("UPDATE USERINFO SET PW = ?, NAME = ? WHERE ID = ?");
			 * pstmt.setString(1, request.getParameter("pw")); pstmt.setString(2,
			 * request.getParameter("name")); pstmt.setString(3,
			 * request.getParameter("id")); int result = pstmt.executeUpdate();
			 * 
			 * PrintWriter out = response.getWriter();
			 * 
			 * out.println("<html><head><title>ȸ������</title></head><body>");
			 * out.println(result > -1 ?
			 * "<a href = '/webapp_1/UserInfoListServlet'>ȸ������ ����</a>" : "ȸ�� ���� ����");
			 * out.println("</body></html>"); out.close(); } catch (SQLException e) {
			 * e.printStackTrace(); } finally { try { if (pstmt != null) pstmt.close(); }
			 * catch (Exception e) { }
			 */
		}
	}

}
