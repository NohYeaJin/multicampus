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
	<%@ include file="header.jsp" %>
	<article>
		<h2>Join Us</h2>
		<form id="join" action="../NonageServlet?command=join" method="post" name="formm">
			<table>
				<tr>
				<td colspan="2">회원가입</td>
				</tr>
				<tr>
					<td>이메일</td>
					<td><input type="text" name="email"></td>
				</tr>
				<tr>
					<td>아이디</td>
					<td><input type="text" name="id"></td>
				</tr>
				<tr>
					<td>이름</td>
					<td><input type="text" name="name"></td>
				</tr>
				<tr>
					<td>비밀번호</td>
					<td><input type="password" name="pwd"></td>
				</tr>
				<tr>
					<td>비밀번호 확인</td>
					<td><input type="password" name="pwdcheck"></td>
				</tr>
				<tr>
					<td>우편번호</td>
					<td><input type="text" name="zip_num"/><button onclick="post_open()">우편번호 검색</button></td>
				</tr>
				<tr>
					<td>주소</td>
					<td><input type="text" name="address"/></td>
				</tr>
				<tr>
					<td>상세주소</td>
					<td><input type="text" name="address"/></td>
				</tr>
				<tr>
					<td>전화번호</td>
					<td><input type="text" name="phone"/></td>
				</tr>
			</table>
			<input type="submit" value="확인">
		</form>
	</article>
</body>
</html>