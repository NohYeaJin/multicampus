<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="/resources/css/style.css">
<link href="http://fonts.googleapis.com/earlyaccess/nanumgothiccoding.css" rel="stylesheet">
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
    <div id="signup">
        <form>
            <div id="signup_head">
                회원 가입
            </div>
            <div id="signup_content">
                <table>
                    <tr>
                        <td class="tr_name">이메일:</td>
                        <td><input type="text" name="email" size=40></td>
                    </tr>
                    <tr>
                        <td class="tr_name">아이디: </td>
                        <td><input type="text" name="id" size=20><input type="button" id="idcheck" value="중복확인"/></td>
                    </tr>
                    <tr>
                        <td class="tr_name">이름: </td>
                        <td><input type="text" name="name" size=20></td>
                    </tr>
                    <tr>
                        <td class="tr_name">비밀번호: </td>
                        <td><input type="password" name="pwd" size=30></td>
                    </tr>
                    <tr>
                        <td class="tr_name">비밀번호 확인: </td>
                        <td><input type="password" name="pwdcheck" size=30></td>
                    </tr>
                    <tr>
                        <td class="tr_name">전화번호: </td>
                        <td><input type="text" name="phone" size = 6/> - <input type="text" name="phone" size = 10/> - <input type="text" name="phone" size = 10/></td>
                    </tr>
                </table>
                <input type="button" id="confirm" value="확 인"/>
            </div>
        </form>
    </div>
    </body>
    </html>