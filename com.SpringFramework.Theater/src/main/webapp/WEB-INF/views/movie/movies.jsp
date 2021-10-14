<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@include file="/WEB-INF/views/include/header.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="style.css">
</head>
<body>
    <div id="movies">
        <div id="movies_head">
           상영중인 영화
        </div>
        <ul>
            <c:forEach var="row" items="${movies}"  varStatus="varstatus">
            <li>
                <img id = "movies_poster" src="/resources/image/${row.movie_poster}"/>
                <div id="movie_info"><a href="/movieDetail/${row.movie_id}">${row.movie_name}(${row.age_limit})</a><br>
                <a href="/fastReserve" id="goto">예매하러 가기</a>
                </div>
            </li>
            </c:forEach>
        </ul>
    </div>
    
    </body>
</html>