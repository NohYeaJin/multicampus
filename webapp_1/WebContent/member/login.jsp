<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="style.css">
<title>Insert title here</title>
</head>
<body>
<jsp:include page="header.jsp"/>
<table>
	<tr>
		<td><h2>회원가입</h2></td>
	</tr>
	<tr>
		<td>이메일: <input type="text" name="email"></td>
	</tr>
	<tr>
		<td>아이디: <input type="text" name="id"></td>
	</tr>
	<tr>
		<td>비밀번호: <input type="text" name="pwd"></td>
	</tr>
	<tr>
		<td>비밀번호 확인: <input type="text" name="pwdcheck"></td>
	</tr>
	<tr>
		<td>주소: <input type="text" name="address"/></td>
	</tr>
</table>
</body>
</html>