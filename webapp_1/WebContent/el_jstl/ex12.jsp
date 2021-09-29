<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ taglib uri ="http://java.sun.com/jsp/jstl/core" prefix="c" %>
 <%@ page import="java.util.*" %>
  <%@ taglib uri ="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSTL</title>
</head>
<body>
<p><a href="ex11.jsp">[이전]</a></p>
<h2>날짜 다루기</h2>
<h3>fmt:parseDate 태그</h3>
<code>
	&lt;fmt:parseDate var="date1" value="2021-09-03" pattern="yyyy-MM-dd"/>
</code>
<h3>포맷 데이터 </h3>
<fmt:formatDate var="date1" value="2021-09-03" pattern="yyyy-MM-dd"/>
<p><a href="ex13.jsp">[다음]</a></p>
</body>
</html>