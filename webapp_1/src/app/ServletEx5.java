package app;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServletEx5
 */
@WebServlet("/ServletEx5")
public class ServletEx5 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ServletEx5() {
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
		// response.getWriter().append("Served at: ").append(request.getContextPath());
		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF-8");
		StringBuilder sb = new StringBuilder();
		response.setContentType("text/html");
		String[] fruit = request.getParameterValues("fruit");
		String color = request.getParameter("color");
		if (fruit != null) {

			for (String fru : fruit) {
				sb.append(fru + " ");
			}

		}

		//color은 무조건 값 들어감, null 들어갈 수 없음 
		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<body>");

		out.println("과일 :" + sb.toString() + ", 색깔 : " + color);

		out.println("</body>");
		out.println("</html>");
		out.close();
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
