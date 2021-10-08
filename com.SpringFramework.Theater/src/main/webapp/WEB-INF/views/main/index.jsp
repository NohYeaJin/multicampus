<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
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
	<div id="trending">
		<div id="movie_head">Trending Movies</div>
		<ul>
			<li>
				<img src="/resources/image/movie_poster1.jpeg"/>
				<div class="movie_name"><a href="#">기생충</a>(15세 이용가)</div>
			</li>
		</ul>
	</div>
	<div id="ad">
		<ul>
			<li><img src="/resources/image/advertiese_1.jpg"/></li>
			<li><img src="/resources/image/advertise_2.jpeg"/></li>
		</ul>
	</div>
	<div id="newly">
		<div id="movie_head2">Newly Arrivals</div>
		<ul>
			<li>
				<img src="/resources/image/movie_poster1.jpeg"/>
				<div class="movie_name"><a href="#">기생충</a>(15세 이용가)</div>
			</li>
		</ul>
	</div>
</body>
</html>