package controller.action;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.MemberDAO;
import dao.MemberVO;

public class JoinAction implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=UTF-8");
		String url = "member/index.jsp";
		HttpSession session = request.getSession();
		MemberVO memberVO = new MemberVO();
		memberVO.setId(request.getParameter("id"));
		memberVO.setPwd(request.getParameter("pwd"));
		memberVO.setName(request.getParameter("name"));
		memberVO.setEmail(request.getParameter("email"));
		memberVO.setZip_um(request.getParameter("zip_num"));
		//System.out.println(request.getParameter("detail"));
		String fullAddress = request.getParameter("address") +" " + request.getParameter("detail");
		memberVO.setAddress(fullAddress);
		
		memberVO.setPhone(request.getParameter("phone"));
		//System.out.println(request.getParameter("address"));
		MemberDAO memberDAO = new MemberDAO().getInstance();
		try {
			memberDAO.JoinMember(memberVO);
			//session.setAttribute("loginUser", memberVO);
		} catch (Exception e) {
			e.printStackTrace();
		}
		RequestDispatcher dispatcher = request.getRequestDispatcher(url);
		dispatcher.forward(request, response);

	}

}
