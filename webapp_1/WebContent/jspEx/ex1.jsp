<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<p>안녕하세요</p>
	<%
		int su1 = 20;
	int su2 = 10;
	int sum = su1 + su2;
	out.print(su1 + "+" + su2 + "=" + sum);
	%><br>
	[선언문(declaration)]: 변수 선언 및 메소드를 정의<br>
	<%!
		String str = "Hello JSP";
		int su1 = 5, su2 = 7;
		
		public int method(){
			return su1 + su2;
		}
	%>
	<%-- 
	<%= 변수%>
	<%= 수식%>
	<%= 메소드 호출%>
	 --%>
	[표현식(expression)]:문자열 출력합니다.<br> <% out.println("msg"); %><br>
	<% out.println(su1); %><br>
	<% out.println(su2); %><br>
	<% out.println(method()); %><br>
</body>
</html>