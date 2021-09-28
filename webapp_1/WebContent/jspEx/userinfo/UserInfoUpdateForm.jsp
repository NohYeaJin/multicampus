<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
   <%@ page import="dto.UserInfo" %>
   <%@ taglib uri ="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<% UserInfo userinfo = (UserInfo)request.getAttribute("userinfo"); %>
<body>
<jsp:include page="/include/Header.jsp"/>
<form name="updateFrm" action="UserInfoUpdateServlet" method="post">
	<table>
		<tr>
			<td>아이디</td>
			<td>비밀번호</td>
			<td>이름</td>
		</tr>
		<tr>
			<td><input type="text" name="id" value="${userinfo.id}" readonly></td>
			<td><input type="text" name="pwd" value="${userinfo.pw}"></td>
			<td><input type="text" name="name" value="${userinfo.name}"></td>
		</tr>
		<tr>
			<td><input type="submit" value="확인"></td>
			<td><input type="button" value="삭제" onclick='location.href="UserInfoDeleteServlet?id=<%=userinfo.getId()%>";'>
		</tr>
	</table>
</form>
<jsp:include page="/include/Tail.jsp"/>
</body>
</html>