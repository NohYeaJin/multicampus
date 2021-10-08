<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="/resources/css/style.css">
</head>
<body>
	<header>
			<ul>
				<li>login</li>
				<li>signup</li>
				<li>logout</li>
				<li>mypage</li>
			</ul>
	</header>
	<div id="main_bar">
		YJ Theater
	</div>
	<nav>
		<ul>
			<li id="home">Home</li>
			<li><a href="#">About</a></li>
			<li><a href="#">Movies</a></li>
			<li><a href="#">Reservation</a></li>
			<li><a href="#">Facilities</a></li>
			<li id="payment"><a href="#">Payments & discount</a></li>
			<li><a href="#">Contact</a></li>
		</ul>  
	</nav>
    <div id="login">
        <div id="login_head">로그인</div>
        <div id="login_content">
            <input type="text" value="id"/><br>
            <input type="password" value="pw"/>
            <input type="button" id="confirm" value="확 인"/>
            <div id="idfind"><a href="#">아이디 찾기</a></div>
            <div id="pwfind"><a href="#">비밀번호 찾기</a></div>
        </div>
    </div>
    </body>
    </html>