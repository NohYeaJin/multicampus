package ajax;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class AjaxTest1
 */
@WebServlet("/AjaxTest1")
public class AjaxTest1 extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public AjaxTest1() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doHandle(request,response);
	}

	private void doHandle(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException{
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html; charset=utf-8");
		String param = (String)request.getParameter("param");
		System.out.println("param = "+param);
		PrintWriter writer = response.getWriter();
		writer.print("�ȳ��ϼ��� �����Դϴ�.");
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doHandle(request,response);
	}

}