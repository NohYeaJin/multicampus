<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="java.util.Calendar"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
table {
	width: 95%;
	text-align: center;
	margin: auto;
	border: 1px solid black;
	border-collapse: collapse;
}

th, td {
	padding: 10px;
}



th {
	background-color: skyblue;
}

p {
	text-align: center;
}

.jjaksu {
	background-color: orange;
}

.holsu {
	background-color: lightgreen;
}
</style>
</head>
<body>
	<table border="5">
		<tr>
			<%
				for (int k = 2; k <= 9; k++) {
			%>
			<th>
				<%
					out.print(k + " 단");
				%>
			</th>
			<%
				}
			%>
		</tr>
		<%
			for (int i = 1; i <= 9; i++) {
		%>
		<tr>
			<%
				for (int j = 2; j <= 9; j++) {
				if (j % 2 == 0) {
			%>
			<td class="jjaksu">
				<%
					out.println(j + " * " + i + " = " + i * j);
				%>
			</td>
			<%
				} else {
			%>
			<td class="holsu">
				<%
					out.println(j + " * " + i + " = " + i * j);
				%>
			</td>

			<%
				}
			}
			%>
		</tr>
		<%
			}
		%>
	</table>
	<br>
	<%
		Calendar cal = Calendar.getInstance();
	%>
	<p>
		오늘은
		<%=cal.get(Calendar.YEAR)%>년
		<%=cal.get(Calendar.MONTH) + 1%>월
		<%=cal.get(Calendar.DATE)%>일
		<%
		int calendar_date = cal.get(Calendar.DAY_OF_WEEK);
	String result = "";
	switch (calendar_date) {
	case 1:
		result = "일";
		break;
	case 2:
		result = "월";
		break;
	case 3:
		result = "화";
		break;
	case 4:
		result = "수";
		break;
	case 5:
		result = "목";
		break;
	case 6:
		result = "금";
		break;
	case 7:
		result = "토";
		break;
	}
	%>

		<%=result%>요일
		<%=cal.get(Calendar.HOUR)%>시
		<%=cal.get(Calendar.MINUTE)%>분
		<%=cal.get(Calendar.SECOND)%>초 입니다
	</p>
</body>
</html>