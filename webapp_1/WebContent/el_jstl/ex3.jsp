<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>EL(Expression Language)</title>
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
<p><a href="ex2.jsp">이전</a></p>
<h2>연산자</h2>
<table>
	<tr><th>분류</th><th>연산자</th><th>EL 코드 = 실행 결과</th></tr>
	<tr><td>산술</td><td>+, -, *, /(div), %(mod)</td>
		<td>
			<pre>
			\${10 + 20} = ${10 + 20}
			\${10 - 20} = ${10 - 20}
			\${10 * 20} = ${10 * 20}
			\${10 / 20} = ${10 / 20}
			\${10 % 20} = ${10 % 20}
			\${10 mod 20} = ${10 mod 20}
			</pre>
		</td>
		<tr><td>관계</td><td>==(eq), !=(ne), &lt;(lt), &gt(gt), <br>
		&lt;=(le), &gt;=(ge)</td><td><pre>
		\${10 == 11} = ${10 == 11}
		\${10  eq 11} = ${10 eq 11}
		\${10 != 11} = ${10 != 11}
		\${10 < 11} = ${10 < 11}
		\${10 lt 11} = ${10 lt 11}
		\${10 > 11} = ${10 > 11}
		\${10 gt 11} = ${10 gt 11}
		\${10 <= 11} = ${10 <= 11}
		\${10 le 11} = ${10 le 11}
		\${10 >= 11} = ${10 >= 11}
		\${10 ge 11} = ${10 ge 11}
		</pre></td></tr>
		<tr><td>Empty 검사</td><td>empty</td>
		<td><pre>
		\${empty title} = ${empty title}
		\${empty title2} = ${empty title2}
		</pre>
</table>
</body>
</html>