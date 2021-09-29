package userinfo;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.UserInfoDao;
import db.DBAction;
import dto.UserInfo;

/*
 학습 주제
 페이지 이동, 페이지 병합, 정보 저장
 - forward
 - include 
 - scope(page, request,session, application)
 ex)
 RequestDispatcher rd = request.getRequestDispatcher("페이지 경로")
 HttpSession session = request.getSession();
 */

/**
 * Servlet implementation class UserInfoLoginServlet
 */
/*
@WebServlet("/UserInfoLoginServlet")
public class UserInfoLoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
/*
    public UserInfoLoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }
*/
/**
 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
 */

/*
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		RequestDispatcher rd = request.getRequestDispatcher("loginAssignment.html");
		rd.forward(request, response);
		response.sendRedirect("loginAssignment.html");
	}
*/
/**
 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
 *      response)
 */
/*
 * protected void doPost(HttpServletRequest request, HttpServletResponse
 * response) throws ServletException, IOException { Connection conn = null;
 * Statement stmt = null; PreparedStatement pstmt = null; ResultSet rs = null;
 * RequestDispatcher rd1 = request.getRequestDispatcher("headerServlet");
 * RequestDispatcher rd2 =
 * request.getRequestDispatcher("/error/LoginFail.html"); //String ID =
 * request.getParameter("ID"); try { conn =
 * DBAction.getInstance().getConnection(); conn.createStatement(); pstmt =
 * conn.prepareStatement("SELECT * FROM USERINFO WHERE ID=?");
 * pstmt.setString(1, request.getParameter("ID")); rs = pstmt.executeQuery();
 * if(rs.next()) { if(request.getParameter("PW").equals(rs.getString("PW"))){
 * UserInfo userinfo = new
 * UserInfo().setId(rs.getString("ID")).setName(rs.getString("NAME")).setPw(rs.
 * getString("PW")); response.setContentType("text/html;charset=UTF-8");
 * PrintWriter out = response.getWriter();
 * out.println("<html><head><title>LoginSuccessFully></title></head>");
 */
// ex1
/*
 * UserInfo userinfo = new
 * UserInfo().setId(rs.getString("ID")).setName(rs.getString("NAME")).setPw(rs.
 * getString("PW")); response.setContentType("text/html;charset=UTF-8");
 * PrintWriter out = response.getWriter();
 * out.println("<html><head><title>LoginSuccessFully></title></head>");
 * out.println("<body>로그인 성공!<br>");
 * out.println(rs.getString("ID")+"님이 로그인되었습니다"); out.println("</body></html>");
 */
// ex2
/*
 * HttpSession session = request.getSession(); session.setAttribute("userinfo",
 * userinfo); rd1.include(request, response); out.println("</body></html>");
 * 
 * //response.sendRedirect("UserInfoListServlet"); }else { rd2.forward(request,
 * response); }
 * 
 * }else { rd2.forward(request, response); }
 * 
 * //rs = stmt.executeQuery("SELECT * FROM USERINFO WHERE ID='"+id+"'");
 * }catch(Exception e) { e.printStackTrace(); } }
 * 
 * }
 */
@WebServlet("/UserInfoLoginServlet")
public class UserInfoLoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		try {
			UserInfoDao userinfoDao = new UserInfoDao();
			UserInfo userinfo = userinfoDao.exist(request.getParameter("ID"), request.getParameter("PW"));
			if(userinfo != null) {
				HttpSession session = request.getSession();
				session.setAttribute("userinfo", userinfo);
				response.sendRedirect("UserInfoListServlet");
			}else {
				RequestDispatcher rd = request.getRequestDispatcher("/error/LoginFail.html");
				rd.forward(request, response);
			}
		} catch (Exception e) {
			e.printStackTrace();

		}
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doGet(request, response);
	}

}