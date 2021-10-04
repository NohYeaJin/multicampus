<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
  <%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<h1>회원 등록</h1>
<form action='update.do' method='post'>
	번호: <input type='text' name='no' value="${member.getNo()}" readonly><br>
	이름: <input type='text' name='name' value="${member.getName()}"><br>
	이메일: <input type='text' name='email' value="${member.getEmail()}"><br>
	암호: <input type='text' name='password' value=""><br>
</form>


</body>
</html>