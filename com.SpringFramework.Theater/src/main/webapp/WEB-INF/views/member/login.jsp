<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@include file="/WEB-INF/views/include/header.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="/resources/css/style.css">
</head>
<body>
	<form action="/login.do" method="post">
    <div id="login">
        <div id="login_head">로그인</div>
        <div id="login_content">
            <input type="text" value="id" name="user_id"/><br>
            <input type="password" value="pw" name="user_pw"/>
            <input type="submit" id="confirm" value="확 인"/>
            <div id="idfind"><a href="#">아이디 찾기</a></div>
            <div id="pwfind"><a href="#">비밀번호 찾기</a></div>
        </div>
    </div>
    </form>
    </body>
    <script>
    var msg="${loginmsg}";
    if(msg=="Success"){
    	alert("성공적으로 로그인되었습니다.");
    	}else if(msg=="Fail"){
    	alert("로그인 정보가 맞지 않습니다. 다시 확인해주세요");
    }
    </script>
    </html>