<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">

<title>Insert title here</title>
</head>
<script type="text/javascript">
	function fn_sendMember(){
		var frmMember = document.frmMember;
		var id = frmMember.id.value;
		var pwd = frmMember.pwd.value;
		var name = frmMember.name.value;
		var email = frmMember.email.value;
		if(id.length==0 || id == ''){
			alert('아이디는 필수입니다.');
		}else if(pwd.length ==0 || pwd==''){
			alert("비밀번호는 필수입니다.");
		}else if(name.length ==0 || name==''){
			alert("이름은 필수입니다.");
		}else if(email.length ==0 || email==''){
			alert("이메일은 필수입니다.");
		}else{
			frmMember.method="post";
			frmMember.action="UserInfoAddServlet";
			frmMember.submit();
		}
	}
	
	function idCheck(){
		var frmMember = document.frmMember;
		var id = frmMember.id.value;
		if(id.length==0||id==''){
			alert("아이디는 필수입니다.");
		}else{
			window.open('/webapp_1/CheckIdServlet?id=' + id, 'pop','width=300,height=300');
		}
	}
</script>
<body>
	<jsp:include page="../include/Header.jsp" /> 
	<form name="frmMember">
	<table>
		<th>회원 가입창</th>
		<tr>
			<td>아이디</td>
			<td><input type="text" name = "id"><input type="button" value="아이디 중복" onclick="idCheck()"></td>
		</tr>
		<tr>
			<td>비밀번호</td>
			<td><input type="password" name="pwd"></td>
		</tr>
		<tr>
			<td>이름</td>
			<td><input type="text" name="name"></td>
		</tr>
		<tr>
			<td>이메일</td>
			<td><input type="text" name="email"></td>
		</tr>
	</table>
	<input type="button" value="확인" onclick="fn_sendMember()">
	<input type="reset" value="취소">
	<input type="button" value="">
	</form>
<jsp:include page="../include/Tail.jsp" /> 
</body>
</html>