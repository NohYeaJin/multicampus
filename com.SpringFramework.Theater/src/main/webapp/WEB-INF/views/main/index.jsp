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
	<div id="trending">
		<div id="movie_head">Trending Movies</div>
		<ul>
			<c:forEach var="row" items="${bestmovies}"  varStatus="varstatus">
			<li>
				<img src="/resources/image/${row.movie_poster}"/>
				<div class="movie_name"><a href="#">${row.movie_name}</a>(${row.age_limit})</div>
			</li>
			</c:forEach>
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
			<c:forEach var="row" items="${recentmovies}"  varStatus="varstatus">
			<li>
				<img src="/resources/image/${row.movie_poster}"/>
				<div class="movie_name"><a href="#">${row.movie_name}</a>(${row.age_limit})</div>
			</li>
			</c:forEach>
		</ul>
	</div>
</body>
</html>