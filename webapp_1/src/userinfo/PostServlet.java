package userinfo;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import db.DBAction;
import dto.AddressVo;

/**
 * Servlet implementation class PostServlet
 */
@WebServlet("/PostServlet")
public class PostServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public PostServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		//request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF-8");
		//RequestDispatcher rd = request.getRequestDispatcher("/Assignment/signup.jsp");
		//String url = "/Assignment/signup.jsp";
		//String url = "/Assignment/post2.jsp";
		String dong = request.getParameter("dong");
		
		
		
		//RequestDispatcher rd = request.getRequestDispatcher("/jspEx/MemberForm.jsp");
		//rd.include(request, response);
		
		if (dong != null) {
			ArrayList<AddressVo> list = new ArrayList<>();
			String sql = "SELECT * FROM ZIPCODE WHERE DONG LIKE '%" + dong.trim() + "%' ORDER BY seq";
			
			Statement stmt = null;
			ResultSet rs = null;
			Connection conn = DBAction.getInstance().getConnection();
			request.setCharacterEncoding("UTF-8");
			response.setCharacterEncoding("UTF-8");
			//PrintWriter out = response.getWriter();
			
			try {
				stmt = conn.createStatement();
				rs = stmt.executeQuery(sql);
				/*
				out.println("<html><body>");
				out.println("<h1>우편번호 검색 결과</h1>");
				out.println("<table border='1'>");
				*/
				while(rs.next()) {
					//out.println("<tr>");
					
					AddressVo addressVo = new AddressVo();
					addressVo.setSido(rs.getString("sido"));
					addressVo.setGugun(rs.getString("gugun"));
					addressVo.setDong(rs.getString("dong"));
					addressVo.setZipCode(rs.getString("zipcode"));
					addressVo.setBunji(rs.getString("bunji"));
					addressVo.setRi(rs.getString("ri"));
					addressVo.setBldg(rs.getString("bldg"));
					
					list.add(addressVo);
					/*
					out.println("<td>");
					out.println(rs.getString("sido"));
					out.println("</td>");
					out.println("<td>");
					out.println(rs.getString("gugun"));
					out.println("</td>");
					out.println("<td>");
					out.println(rs.getString("dong"));
					out.println("</td>");
					out.println("<td>");
					out.println(rs.getString("zipcode"));
					out.println("</td>");
					out.println("<td>");
					out.println(rs.getString("bunji"));
					out.println("</td>");
					out.println("<td>");
					out.println(rs.getString("ri"));
					out.println("</td>");
					out.println("<td>");
					out.println(rs.getString("bldg"));
					out.println("</td>");
					out.println("</tr>");
					*/
					
				}
				request.getRequestDispatcher("Assignment/post2.jsp").include(request, response);
			} catch (Exception e) {
				e.printStackTrace();
			} finally {
				try {/*
					if (rs != null)
						rs.close();
					if (stmt != null)
						stmt.close();
					if (conn != null)
						conn.close();
						*/
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			//request.setAttribute("addressList", list);
		}
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doGet(request, response);
	}

}
