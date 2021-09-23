<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<%!int a;
	int b;%>

	<%
		a = 10;
	b = 20;
	if (b / a < 10) {
	%>

	<p style="color: blue;">
		양의 값(첫번째)<br>
		<%="양의 값(두번째)"%><br>
		<%
			out.println("다시 양의 값(세번째)");
		%>
		<%
			} else {
		%>
		음의 값
		<%
			}
		%>
</body>
</html>