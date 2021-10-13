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
            <label class="tab_item" for="all">회원정보 수정</label>
            <input id="programming" type="radio" name="tab_item">
            <label class="tab_item" for="programming">예매 확인</label>
            <input id="design" type="radio" name="tab_item">
            <label class="tab_item" for="design">작성한 댓글</label>
            <div class="tab_content" id="all_content">
                <table id="update">
                    <tr>
                        <td class="tr_name">이메일:</td>
                        <td><input type="text" name="email" size=30></td>
                    </tr>
                    <tr>
                        <td class="tr_name">이름: </td>
                        <td><input type="text" name="user_name" size=20></td>
                    </tr>
					<tr>
                        <td class="tr_name">비밀번호: </td>
                        <td><input type="password" name="user_pw" size=30></td>
                    </tr>
                    <tr>
                        <td class="tr_name">전화번호: </td>
                        <td><input type="text" name="phonenum" size = 6/> - <input type="text" name="phone" size = 10/> - <input type="text" name="phone" size = 10/></td>
                    </tr>
                </table>
                <input type="submit" id="confirm" value="변경하기"/>
            </div>
            <div class="tab_content" id="programming_content">
                <table>
                    <tr>
                        <td><div id="mypage_movie_name">기생충</div></td>
                    </tr>
                    <tr>
                        <td><img id="mypage_movie_img" src = "movie_poster1.jpeg"/>
                            <div id="mypage_movie_name">예매된 영화: 기생충</div>
                            <div id="mypage_movie_datetime">예매 날짜 및 시간: 2021-10-11 13:00</div>
                            <div id="mypage_movie_place">극장 및 상영관: 건대점 2관</div>
                            <div id="mypage_movie_ppl">예매 인원 및 좌석: 2명(A3,A4)</div>
                            <input type="button" id="mypage_movie_undo" value="예매 취소하기"/>
                        </td>
                    </tr>
                </table>
        </div>
            <div class="tab_content" id="design_content">
                Thanks a lot
        </div>
        </div>
    </div>
    </body>
</html>