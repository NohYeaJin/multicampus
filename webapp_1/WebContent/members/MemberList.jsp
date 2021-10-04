<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
     <%@ taglib uri ="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<jsp:include page="/include/Header.jsp"/>
<h1>회원목록</h1>
<p><a href='add.do'>신규 회원</a></p>

<c:forEach var="member" items="${members}">
${member.no}
<a href='update.do?no=${member.no}'>수정</a><br>
#{member.name}
<a href='delete.do?no=${member.no}'>삭제</a><br>
</c:forEach>
</body>
</html>