<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import = "dto.AddressVo, java.util.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>우편번호 검색</h1>
	<br>
	<table id="zipcode" border="2">
		<tr>
			<th>우편번호</th>
			<th>주소</th>
			<th>text</th>
		</tr>
		<%
			ArrayList<AddressVo> list = (ArrayList<AddressVo>)request.getAttribute("addressList");
			if(list==null)return;
			
		%>
		<%
			for(AddressVo data: list){
		%>
		<tr>
			<td><a href="#" onclick="selectCode('<%=data.getZipCode() %>','<%= data.getSido() %> <%= data.getGugun() %> <%= data.getDong() %> <%= data.getRi() %> <%=data.getBldg() %> <%= data.getBunji() %>')"><%=data.getZipCode() %></a></td>
			<td>
			<%= data.getSido() %>', '<%= data.getGugun() %>', '<%= data.getDong() %>, '<%= data.getRi() %>','<%=data.getBldg() %>
			<%= data.getBunji() %>
			</td>
		</tr>
		<%} %>
	</table>
	<script>
	function selectCode(value,address){
		opener.document.getElementById("zipcode").value = value;
		opener.document.getElementById("basic_address").value = address;
		window.close();
	}

   </script>

</body>
</html>