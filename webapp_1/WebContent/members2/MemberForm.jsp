<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<jsp:include page = "../include/Header.jsp"/>
<h1>회원등록</h1>
<form action='add.do' method = 'post'>
	<table>
		<tr>
			<td>이메일</td>
			<td><input type="text" name="email"/>
		</tr>
		<tr>
			<td>비밀번호</td>
			<td><input type="password" name="pwd"/>			
		</tr>
		<tr>
			<td>이름</td>
			<td><input type="text" name="name"/>			
		</tr>	
	</table>
	<input type='submit' value='추가'/>
		<input type='reset' value='취소'/>
</form>
</body>
</html>