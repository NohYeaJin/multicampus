<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ taglib uri ="http://java.sun.com/jsp/jstl/core" prefix="c" %>
 <%@ page import="java.util.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSTL</title>
</head>
<body>
	<p><a href="ex8.jsp">[이전]</a><a href="ex10.jsp">다음</a></p>
	<h2>c:forEach 태그</h2>
	<h3>반복문 - 배열</h3>
	<% pageContext.setAttribute("nameList",new String[]{"홍길동","임꺽정","일지매"}); %>
	<ul>
		<c:forEach var="name" items="${nameList}" begin="2" end="3">
			<li>${name}</li>
		</c:forEach>
	</ul>
	<h3> 반복문 - ArrayList 객체</h3>
	<%
		ArrayList<String> nameList3 = new ArrayList<String>();
		nameList3.add("홍길동");
		nameList3.add("임꺽정");
		nameList3.add("일지매");
		pageContext.setAttribute("nameList3",nameList3);
	%>
	<c:forEach var="name" items="${nameList3}">
			<li>${name}</li>
		</c:forEach>
	<h3>반복문 - 특정 횟수 만큼 반복</h3>
	<c:forEach var="no" begin="1" end="6">
		<li><a href="ex${no}.jsp">예제${no}</a></li>
	</c:forEach>
	<h3>반복문 - 콤마로 구분된 문자열</h3>
	<%pageContext.setAttribute("nameList4","홍길동,임꺽정,일지매"); %>
	<ul>
		<c:forEach var="name" items="${nameList4}">
			<li>${name}</li>
		</c:forEach>
	</ul>
</body>
</html>