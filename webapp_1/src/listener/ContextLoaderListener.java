package listener;

import javax.naming.InitialContext;
import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;
import javax.sql.DataSource;

import controller.src.LogInController;
import controller.src.MemberAddController;
import controller.src.MemberDeleteController;
import controller.src.MemberListController;
import controller.src.MemberLogoutController;
import controller.src.MemberUpdateController;
import dao.MemberDAOImpl;

@WebListener
public class ContextLoaderListener implements ServletContextListener{
	static ApplicationContext applicationContext;
	public static ApplicationContext getApplicationContext() {
		return applicationContext;
	}
	@Override
	public void contextInitialized(ServletContextEvent event) {
		try {
			ServletContext sc = event.getServletContext();
			/*
			InitialContext initialContext = new InitialContext();
		    DataSource ds = (DataSource)initialContext.lookup("java:comp/env/jdbc/oracle");
		    MemberDAOImpl memberDao = new MemberDAOImpl();
			memberDao.setDataSource(ds);
			*/
			/*
			sc.setAttribute("/auth/login.do",  new LogInController().setMemberDao(memberDao));
			sc.setAttribute("/members/list.do", new MemberListController().setMemberDao(memberDao));
			sc.setAttribute("/members/add.do", new MemberAddController().setMemberDAO(memberDao));
			sc.setAttribute("/members/update.do", new MemberUpdateController().setMemberDao(memberDao));
			sc.setAttribute("/members/delete.do", new MemberDeleteController().setMemberDao(memberDao));
			sc.setAttribute("/auth/logout.do", new MemberLogoutController().setMemberDao(memberDao));
			*/
			String propertiesPath = sc.getRealPath(sc.getInitParameter("contextConfigLocation"));
			applicationContext = new ApplicationContext(propertiesPath);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
