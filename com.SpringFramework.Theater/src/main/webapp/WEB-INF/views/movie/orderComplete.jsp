<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@include file="/WEB-INF/views/include/header.jsp" %>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="/resources/css/style.css">
<link href="http://fonts.googleapis.com/earlyaccess/nanumgothiccoding.css" rel="stylesheet">
</head>
<body>
    <div id="signup">
        <form method="post" action="/ready">
            <div id="signup_head">
                예약 확인
            </div>
            <div id="signup_content">
                <table>
                    <tr>
                        <td class="tr_name">영화명: </td>
                        <td>${info.movie_name}</td>
                    </tr>
                    <tr>
                        <td class="tr_name">날짜 및 시간: </td>
                        <td>${info.printTime}</td>
                    </tr>
                    <tr>
                        <td class="tr_name">극장위치 및 영화관: </td>
                        <td>${info.theater_name}점 ${info.theater_room_name}</td>
                    </tr>
                    <tr>
                        <td class="tr_name">좌석 및 결제 가격: </td>
                        <td>${info.seatchosen} ${info.price}원</td>
                    </tr>
                </table>
                <input type="hidden" name="price" value="${info.price}"/>
                <input type="hidden" name="theater_name" value="${info.theater_name}"/>
                <input type="hidden" name="seatchosen" value="${info.seatchosen}"/>
                <input type="hidden" name="theater_room_name" value="${info.theater_room_name}"/>
                 <input type="hidden" name="movie_name" value="${info.movie_name}"/>
                  <input type="hidden" name="printTime" value="${info.printTime}"/>
                  <input type="hidden" name="time_id" value="${info.time_id}"/>
                <input type="submit" id="confirm2" value="결제하기"/>
            </div>
        </form>
    </div>
    
    </body>
    </html>