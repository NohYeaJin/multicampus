<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
 - 내장 객체의 영역
  	내장 객체의 영역은 객체의 유효기간이라고도 불립니다.
  	즉 해당 객체가 얼마 동안이나 살아 있는가를 지정해주는 것을 영역이라고 합니다.
  	영역은 총 4개로 page, request, session, application이 있습니다. (scope)
  	
 - 액션 태그
 액션 태그는 xml문법을 따릅니다. 즉 시작 태그와 함께 반드시 종료 태그를 포함해야 합니다.
 다음은 액션태그의 기본 형식입니다.
 [표현]
 <%--
 	<jsp : . . . 속성 = "값"> 내용 < /jsp: . . .>
 	
  --%>
  액션태그에 속성값만 지정하고 내용이 없을 경우에는 XML 규칙에 의해 끝나는 태그를 따로 하지 않고
  시작 태그의 마지막 부분을 "/">로 마무리합니다.
  내용이 없는 액션 태그의 형식입니다.
  [표현]
  <%--
  	<jsp: . . . 속성 = "값" />
   --%>
   <%--
   		<jsp:forward> 액션태그
   		<jsp: forward> 태그는 현재 JSP 페이지에서 URL로 지정한 특정 페이지로 넘어갈 때 사용하는 태그입니다.
   		형식은 다음과 같습니다. 
    --%>
</body>
</html>