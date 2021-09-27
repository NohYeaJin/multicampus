<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import = "dto.UserInfo" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<%-- <jsp:useBean id="userinfo" scope="session" class="dto.UserInfo"/>--%>
<%
	UserInfo userinfoss = (UserInfo)session.getAttribute("userinfo");
%>
<body>
<div style="background-color:#00008b; color:#ffffff; height: 20px; padding 5px;">
	UserInfoSystem Header Page
	<% if(userinfoss != null && userinfoss.getId()!= null) {%>
		<span style="float:right;">
		<%= userinfoss.getName() %>
		<a style="color: white; href="UserInfoLogOutServlet">로그아웃</a>
	<%
	} else{
		response.sendRedirect("/webapp_1/LoginFrom.jsp");
	}
	%>
</div>
</body>
</html>