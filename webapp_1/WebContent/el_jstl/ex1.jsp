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
<p><a href="ex2.jsp">[����]</a></p>
<h2>EL - ���ͷ� ǥ����</h2>
<table>
	<tr><th>��������</th><th>EL �ڵ�</th><th>������</th></tr>
	<tr><td>���ڿ�</td><td>\${"test"}</td><td>${"test"}</td></tr>
	<tr><td>���ڿ�</td><td>\${'test'}</td><td>${'test'}</td></tr>
	<tr><td>����</td><td>\${20}</td><td>${20}</td></tr>
	<tr><td>����</td><td>\${3.14}</td><td>${3.14}</td></tr>
	<tr><td>����</td><td>\${true}</td><td>${true}</td></tr>
	<tr><td>����</td><td>\${null}</td><td>${null}</td></tr>
</table>
<p><a href="ex2.jsp">[����]</a></p>
</body>
</html>