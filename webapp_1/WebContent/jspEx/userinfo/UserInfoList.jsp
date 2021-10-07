<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ page import = "com.example.sba.domain.UserInfo, java.util.*, java.sql.*,db.DBAction" %>  
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<table>
	<tr>
		<td>아이디</td>
		<td>비밀번호</td>
		<td>이름</td>
		<td>삭제</td>
	</tr>
	
	 <% List<UserInfo> userinfooss = (ArrayList<UserInfo>)request.getAttribute("userinfos");
	 	for(UserInfo userInfo: userinfooss){
			%>
			<tr>
				<td><a href = 'UserInfoUpdateServlet?id=<%= userInfo.getId() %>'><%=userInfo.getId()%></a></td>
				<td><%= userInfo.getPw() %></td>
				<td><%= userInfo.getName() %></td>
				<td><a href='UserInfoDeleteServlet?id=<%=userInfo.getId()%>'>삭제</a></td>
			</tr>
			<%
	 	}

	%>			
</table>
</body>
</html>