<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<p>�ȳ��ϼ���</p>
	<%
		int su1 = 20;
	int su2 = 10;
	int sum = su1 + su2;
	out.print(su1 + "+" + su2 + "=" + sum);
	%><br>
	[����(declaration)]: ���� ���� �� �޼ҵ带 ����<br>
	<%!
		String str = "Hello JSP";
		int su1 = 5, su2 = 7;
		
		public int method(){
			return su1 + su2;
		}
	%>
	<%-- 
	<%= ����%>
	<%= ����%>
	<%= �޼ҵ� ȣ��%>
	 --%>
	[ǥ����(expression)]:���ڿ� ����մϴ�.<br> <% out.println("msg"); %><br>
	<% out.println(su1); %><br>
	<% out.println(su2); %><br>
	<% out.println(method()); %><br>
</body>
</html>