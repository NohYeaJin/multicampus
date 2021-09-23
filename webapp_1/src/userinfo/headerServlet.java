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
		//header = 서비스 페이지의 머리 부분,
		//다른 페이지로 이동한다고 하더라도 계속 가져간다
		//세션 정보는 여기에서 관리할 수 있다 
		//세션 정보 있음 => 서비스 이용가능
		//세션 정보 없음 => 로그인이 안되어 있네 => 회원정보 인증 없이 사용하는 페이지로 이동 
		//session.setMaxInactiveInterval(3*60);
		//3분으로 시간정보 수정 가능
		
		//include에 대한 기능을 써보기 위해서 
		//header가 로그인 인증 기능을 한다 
		//세션에 사용자 정보를 저장해야하는데 
		//include를 써보기 위해서 저장되었다는 것을 전제로 하고 진행한다
		//로그인을 했다면, 인증을 거쳤다면 null이 아닐 것이다
		UserInfo userinfo = (UserInfo)session.getAttribute("userinfo");
		
		//로그인 
		if(userinfo != null) {
			out.println(userinfo.getName()+"님 로그인 중입니다.");
			out.println("<input type = 'button' value='로그아웃'"+" onclick='location.href=\"/webapp_1/UserInfoLogOutServlet\"'>");
			
		}else {
			out.println("session정보 없음");
			out.println("<input type='button' value='로그인'" +" onclick='location.href=\"/webapp_1/loginAssignment.html\"'>");
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
