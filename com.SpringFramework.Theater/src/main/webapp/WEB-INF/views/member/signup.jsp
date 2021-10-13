<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@include file="/WEB-INF/views/include/header.jsp" %>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="/resources/css/style.css">
<link href="http://fonts.googleapis.com/earlyaccess/nanumgothiccoding.css" rel="stylesheet">
</head>
<body>
    <div id="signup">
        <form method="post" action="/register.do">
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
                        <td><input type="text" name="user_id" size=20><input type="button" id="idcheck" value="중복확인"/></td>
                    </tr>
                    <tr>
                        <td class="tr_name">이름: </td>
                        <td><input type="text" name="user_name" size=20></td>
                    </tr>
					<tr>
                        <td class="tr_name">비밀번호: </td>
                        <td><input type="password" name="user_pw" size=30></td>
                    </tr>
                    <tr>
                        <td class="tr_name">비밀번호 확인: </td>
                        <td><input type="password" name="pwdcheck" size=30></td>
                    </tr>
                    <tr>
                        <td class="tr_name">전화번호: </td>
                        <td><input type="text" name="phonenum" size = 6/> - <input type="text" name="phone" size = 10/> - <input type="text" name="phone" size = 10/></td>
                    </tr>
                </table>
                <input type="submit" id="confirm" value="확 인"/>
            </div>
        </form>
    </div>
    </body>
    </html>