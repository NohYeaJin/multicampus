<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
<style type="text/css">
body{
	font-size:small;
}
table{
	border: thin solid gray;
	border-collapse: collapse;
}

td,th{
	border: this dotted gray;
	padding 2px;
}

th{
	background-color: lightgray;
}

pre{
	font-size: 90%;
}
</style>
</head>
<body>
<p><a href="ex2.jsp">[다음]</a></p>
<h2>EL - 리터럴 표현식</h2>
<table>
	<tr><th>데이터형</th><th>EL 코드</th><th>실행결과</th></tr>
	<tr><td>문자열</td><td>\${"test"}</td><td>${"test"}</td></tr>
	<tr><td>문자열</td><td>\${'test'}</td><td>${'test'}</td></tr>
	<tr><td>정수</td><td>\${20}</td><td>${20}</td></tr>
	<tr><td>정수</td><td>\${3.14}</td><td>${3.14}</td></tr>
	<tr><td>정수</td><td>\${true}</td><td>${true}</td></tr>
	<tr><td>정수</td><td>\${null}</td><td>${null}</td></tr>
</table>
<p><a href="ex2.jsp">[다음]</a></p>
</body>
</html>