<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="login.css">
<title>Insert title here</title>
<script type="text/javascript">
function post_open(){
	var frmMember = document.signup;
	var dong = frmMember.dong.value.trim();
	if(dong.length==0 || dong=""){
		alert("~동을 입력해 주세요");
	}else{
		window.open('/webapp_1/PostServlet?dong='+dong, 'pop','width=300,height=300');
	}
}
</script>
</head>
<body>
	<h1>회원 가입 페이지</h1>
	<form name="signup">
		<table border="2">
		<tr>
			<td>이메일</td>
			<td><input name="email" type="email"/></td>
		</tr>
		<tr>
			<td>아이디</td>
			<td><input type="text" name="id"/></td>
		</tr>
		<tr>
			<td>비밀번호</td>
			<td><input type="password" name="pwd"/></td>
		</tr>
		<tr>
			<td>이름</td>
			<td><input type="text" name="name"/></td>
		</tr>
		<tr>
			<td>우편번호</td>
			<td><input type="text" name="dong"/> <input type="button" value="우편번호 찾기" class="btn" onclick='post_open()'/></td>
		</tr>
		<tr>
			<td>상세주소</td>
			<td><input type="text"/></td>
		</tr>
		</table>
		<br>
		<center>
		<input type="button" value="확인" class="btn"/>
		<input type="reset" value="초기화" class="btn"/><br>
		</center>
	</form>
</body>
</html>