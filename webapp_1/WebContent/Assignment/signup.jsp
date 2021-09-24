<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="login.css">
<title>Insert title here</title>
</head>
<body>
	<h1>회원 가입 페이지</h1>
	<form method="post" action="">
		<table border="2">
		<tr>
			<td>이메일</td>
			<td><input type="email"/></td>
		</tr>
		<tr>
			<td>아이디</td>
			<td><input type="text"/></td>
		</tr>
		<tr>
			<td>비밀번호</td>
			<td><input type="password"/></td>
		</tr>
		<tr>
			<td>이름</td>
			<td><input type="text"/></td>
		</tr>
		<tr>
			<td>우편번호</td>
			<td><input type="text"/> <input type="button" value="우편번호 찾기" class="btn"/></td>
		</tr>
		<tr>
			<td>상세주소</td>
			<td><input type="text"/></td>
		</tr>
		</table>
		<br>
		<input type="button" value="확인" class="btn"/>
		<input type="reset" value="초기화" class="btn"/><br>
	</form>
</body>
</html>