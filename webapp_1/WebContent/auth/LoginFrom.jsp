<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="/webapp_1/UserInfoLoginServlet" method="post">
		ID : <input type="text" name="id" size = "10"><br>
		PW : <input type="text" name="pw" size = "10"><br>
		<input type="submit" value="확인">
	</form>
</body>
</html>