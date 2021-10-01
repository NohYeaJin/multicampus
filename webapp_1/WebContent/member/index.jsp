<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ taglib uri ="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>

<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="${pageContext.request.contextPath}/member/style2.css"/>
</head>
<body>
<%@ include file="header.jsp" %>
<ul id="bestItems">
<c:forEach  items="${bestProductList}" var="product">
    <li class="itemlist">
    <img src="${pageContext.request.contextPath}/member/product_images/product_images/${product.image}"/>
    	<div class="name">${product.name}</div>
    	<div class="price">${product.price2}</div> 
    	<p>dd</p>
    </li>
</c:forEach>
</ul>
<br>

<ul id="newItems">
<c:forEach  items="${newProductList}" var="product">
   <li class="itemlist">
   		<img src="${pageContext.request.contextPath}/member/product_images/product_images/${product.image}"/>
    	<div class="name">${product.name}</div>
    	<div class="price">${product.price2}</div> 
    </li>
</c:forEach>
</ul>
</body>
</html>