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
<h1>ȸ�����</h1>
<p><a href='add.do'>�ű� ȸ��</a></p>

<c:forEach var="member" items="${members}">
${member.no}
<a href='update.do?no=${member.no}'>����</a><br>
#{member.name}
<a href='delete.do?no=${member.no}'>����</a><br>
</c:forEach>
</body>
</html>