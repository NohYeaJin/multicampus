<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import = "com.example.sba.domain.AddressVo, java.util.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>우편번호 검색</h1>
	<form action="/webapp_1/PostServlet" method="post">
		동이름: <input type="text" name="dong" /> <input type="submit"
			value="칮기" />
	</form>
	<br>
	<table id="zipcode" border="2">
		<tr>
			<th>우편번호</th>
			<th>주소</th>
		</tr>
		<%
			ArrayList<AddressVo> list = (ArrayList<AddressVo>)request.getAttribute("addressList");
			if(list==null)return;
			
		%>
		<%
			for(AddressVo data: list){
		%>
		<tr>
			<td><a href="#"><%=data.getZipCode() %></a></td>
			<td>
			<%= data.getSido() %>', '<%= data.getGugun() %>', '<%= data.getDong() %>, '<%= data.getRi() %>','<%=data.getBldg() %>
			<%= data.getBunji() %>
			</td>
		</tr>
		<%} %>
	</table>
</body>
</html>