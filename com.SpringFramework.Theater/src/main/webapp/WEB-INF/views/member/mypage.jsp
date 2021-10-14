<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@include file="/WEB-INF/views/include/header.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="/resources/css/style.css">
<link href="http://fonts.googleapis.com/earlyaccess/nanumgothiccoding.css" rel="stylesheet">
</head>
<body>
    <div id="mypage_content">
        <div id="mypage_head">
            마이페이지
        </div>
        <div class="tabs">
            <input id="all" type="radio" name="tab_item" checked>
            <label class="tab_item" for="all">예매 확인</label>
            <input id="programming" type="radio" name="tab_item">
            <label class="tab_item" for="programming">회원정보 수정</label>
            <input id="design" type="radio" name="tab_item">
            <label class="tab_item" for="design">작성한 댓글</label>
            <div class="tab_content" id="programming_content">
                <table id="update">
                    <tr>
                        <td class="tr_name">이메일:</td>
                        <td><input type="text" name="email" value="${userinfo.email}"></td>
                    </tr>
                    <tr>
                        <td class="tr_name">이름: </td>
                        <td><input type="text" name="user_name" size=20 value="${userinfo.user_name}"></td>
                    </tr>
					<tr>
                        <td class="tr_name">비밀번호: </td>
                        <td><input type="password" name="user_pw" size=30 value="${userinfo.user_pw}"></td>
                    </tr>
                    <tr>
                        <td class="tr_name">전화번호: </td>
                        <td><input type="text" name="phonenum" size = 6 value="${userinfo.phonenum1}"/> - <input type="text" name="phone" size = 10 value="${userinfo.phonenum2}"/> - <input type="text" name="phone" size = 10 value="${userinfo.phonenum3}"/></td>
                    </tr>
                </table>
                <input type="submit" id="confirm" value="변경하기"/>
            </div>
            <div class="tab_content" id="all_content">
                <table>
                    <c:forEach var="list" items="${list}"  varStatus="varstatus">
                    <tr>
                        <td><img id="mypage_movie_img" src = "/resources/image/refund_img2.jpg"/>
                            <div id="mypage_movie_name">예매된 영화: ${list.movie_name}</div>
                            <div id="mypage_movie_datetime">예매 날짜 및 시간: ${list.printTime}</div>
                            <div id="mypage_movie_place">극장 및 상영관: ${list.theater_name}점 ${list.theater_room_name}</div>
                            <div id="mypage_movie_ppl">좌석 및 금액:${list.seatchosen}(${list.price}원)</div>
                            <input type="button" id="mypage_movie_undo" value="예매 취소하기"/>
                        </td>
                    </tr>
                    </c:forEach>
                </table>
        </div>
            <div class="tab_content" id="design_content">
            <table>
            <c:forEach var="var2" items="${commentlist}"  varStatus="varstatus">
            <tr>
                <td style="width: 800px; height: 100px;">
                     <div id="mypage_movie_name">${var2.content_text}</div>
                      <div id="mypage_movie_datetime">${var2.reg_date}</div><br>
                      <a href="/movieDetail/${var2.movie_id}">원본글 보기</a>
                </td>
                </tr>
                </c:forEach>
                </table>
        </div>
        </div>
    </div>
    </body>
</html>