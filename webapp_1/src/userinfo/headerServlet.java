package userinfo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dto.UserInfo;

/**
 * Servlet implementation class headerServlet
 */
@WebServlet("/headerServlet")
public class headerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public headerServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();
		HttpSession session = request.getSession();
		//header = ���� �������� �Ӹ� �κ�,
		//�ٸ� �������� �̵��Ѵٰ� �ϴ��� ��� ��������
		//���� ������ ���⿡�� ������ �� �ִ� 
		//���� ���� ���� => ���� �̿밡��
		//���� ���� ���� => �α����� �ȵǾ� �ֳ� => ȸ������ ���� ���� ����ϴ� �������� �̵� 
		//session.setMaxInactiveInterval(3*60);
		//3������ �ð����� ���� ����
		
		//include�� ���� ����� �Ẹ�� ���ؼ� 
		//header�� �α��� ���� ����� �Ѵ� 
		//���ǿ� ����� ������ �����ؾ��ϴµ� 
		//include�� �Ẹ�� ���ؼ� ����Ǿ��ٴ� ���� ������ �ϰ� �����Ѵ�
		//�α����� �ߴٸ�, ������ ���ƴٸ� null�� �ƴ� ���̴�
		UserInfo userinfo = (UserInfo)session.getAttribute("userinfo");
		
		//�α��� 
		if(userinfo != null) {
			out.println(userinfo.getName()+"�� �α��� ���Դϴ�.");
			out.println("<input type = 'button' value='�α׾ƿ�'"+" onclick='location.href=\"/webapp_1/UserInfoLogOutServlet\"'>");
			
		}else {
			out.println("session���� ����");
			out.println("<input type='button' value='�α���'" +" onclick='location.href=\"/webapp_1/loginAssignment.html\"'>");
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
