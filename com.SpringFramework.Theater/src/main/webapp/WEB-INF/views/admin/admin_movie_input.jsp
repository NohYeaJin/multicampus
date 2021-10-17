<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="style.css">
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
<div class="container" style="text-align:left; margin-bottom: 20px; margin-top: 20px;">

    <div class="movie_option" style="text-align: left;">
        <table id="options">
            <tr>
                <td>영화명</td><td><input type="text"></td><td>영화포스터</td><td><input type="file"></td>
            </tr>
            <tr>
                <td>연령제한</td><td><select>
                    <option value="0">카테고리 선택</option>
                    <option value="1">영화1</option>
                    <option value="2">영화2</option>
                    <option value="3">영화3</option>
                </select></td><td>영화장르</td><td><select>
                    <option value="0">카테고리 선택</option>
                    <option value="1">영화1</option>
                    <option value="2">영화2</option>
                    <option value="3">영화3</option>
                </select></td>
            </tr>
            <tr>
                <td>감독이름</td><td><input type="text"/></td><td>개봉일</td><td><input type="date"></td>
            </tr>
            <tr>
                <td>상영 종료일</td><td><input type="date"></td><td>러닝타임</td><td><input type="number"></td>
            </tr>
            <tr>
                <td>러닝타임</td><td><input type="number"></td><td>상영일수</td><td><input type="number"></td>
            </tr>
            <tr>
                <td>영화 설명</td><td colspan="3"><textarea rows="10" style="width: 700px; font-size:20px;"></textarea></td>
            </tr>
            <tr><td><button id="admin_confirm">확인</button></td></tr>
        </table>
        <br>
    </div>
</div>