package userinfo;

import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import db.DBAction;

/**
 * Servlet implementation class LoginAssignment
 */
@WebServlet("/LoginAssignment")
public class LoginAssignment extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public LoginAssignment() {
		super();
		// TODO Auto-generated constructor stub
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
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println();
		response.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=UTF-8");
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		// Member member = null; //DTO
		Statement stmt = null;
		ResultSet rs = null;
		Connection conn = DBAction.getInstance().getConnection();
		String sql = "SELECT * FROM USERINFO WHERE ID = '"+id+"'";
		
		try {
			rs = stmt.executeQuery(sql);
			if(rs.next()) {
				//check if pw is right
				sql = "SELECT * FROM USERINFO WHERE PW = '"+pw+"' AND ID ='"+id+"'";
				rs = stmt.executeQuery(sql);
				if(rs.next()) {
					
				}
			}
			else {
				//if id doesn't exist, 
				 RequestDispatcher rd = request.getRequestDispatcher("/loginAssignment.html");
				 
			}
		} catch (SQLException e) {

			e.printStackTrace();
		}
		
		
	}

}
