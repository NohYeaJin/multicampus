<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="style.css">
<title>SignUp</title>
<script>
var openWin;
function post_open(){
	var frmMember = document.formm;
	var dong = frmMember.zip_num.value.trim();
	console.log(dong);
	if(dong.length==0 || dong==""){
		alert("~동을 입력해 주세요");
	}else{
		window.name = "parentForm";
		openWin = window.open('/webapp_1/PostServlet?dong='+dong, 'pop','width=300,height=300');
		
	}
}


</script>
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
					<td><input type="text" name="zip_num" id="zipcode" value=""/><input id="postopen" type="button" onclick="post_open()" value="우편번호 검색"/></td>
				</tr>
				<tr>
					<td>주소</td>
					<td><input type="text" name="address" id="basic_address" size="50"/></td>
				</tr>
				<tr>
					<td>상세주소</td>
					<td><input type="text" id="detail_address" name="detail"  value="" size="50"/></td>
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