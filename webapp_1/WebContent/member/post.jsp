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
	<table id="zipcode" border="2">
		<tr>
			<th>우편번호</th>
			<th>주소</th>
		</tr>
		<c:foreach items="${addressList}" varStatus="address">
		<td><a href="#">${addressList.zipcode}</a></td>
		<td>${addressList.sido}, ${addressList.gugun}, ${addressList.dong}, ${addressList.ri}, ${addressList.bldg}</td>
		</c:foreach>


	</table>
</body>
</html>