<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="style.css">
<link href="http://fonts.googleapis.com/earlyaccess/nanumgothiccoding.css" rel="stylesheet">
</head>
<body>
	<header>
			<ul>
				<li>login</li>
				<li>signup</li>
				<li>logout</li>
				<li>mypage</li>
			</ul>
	</header>
	<div id="main_bar">
		YJ Theater
	</div>
	<nav>
		<ul>
			<li id="home">Home</li>
			<li><a href="#">About</a></li>
			<li><a href="#">Movies</a></li>
			<li><a href="#">Reservation</a></li>
			<li><a href="#">Facilities</a></li>
			<li id="payment"><a href="#">Payments & discount</a></li>
			<li><a href="#">Contact</a></li>
		</ul>
	</nav>
    <div id="mypage_content">
        <div id="mypage_head">
            관리자페이지
        </div>
        <div class="tabs">
            <input id="member_manage" type="radio" name="tab_item" checked>
            <label class="tab_item" for="member_manage">회원관리</label>
            <input id="movie_manage" type="radio" name="tab_item">
            <label class="tab_item" for="movie_manage">영화관리</label>
            <input id="design_manage" type="radio" name="tab_item">
            <label class="tab_item" for="design_manage">영화시간 관리</label>
            <div class="tabs_content2" id="member_manage_content">
                <input type="button" value="입력" id="confirm"/>
                <table>
                    <tr>
                        <th>일련번호</th>
                        <th>아이디</th>
                        <th>비밀번호</th>
                        <th>회원이름</th>
                        <th>이메일</th>
                        <th>전화번호</th>
                        <th>수정</th>
                        <th>삭제</th>
                    </tr>
                    <tr>
                        <td>1</td>
                        <td>user_id</td>
                        <td>user_pw</td>
                        <td>노예진</td>
                        <td>yeajinny@naver.com</td>
                        <td>010-1111-1111</td>  
                        <td>수정</td>            
                        <td>삭제</td>        
                    </tr>
                </table>
            </div>
            <div class="tabs_content2" id="movie_manage_content">
                <input type="button" value="입력" id="confirm"/>
                <table>
                    <tr>
                        <th>일련번호</th>
                        <th>영화명</th>
                        <th>영화설명</th>
                        <th>연령제한</th>
                        <th>감독이름</th>
                        <th>개봉날짜</th>
                        <th>러닝타임</th>
                        <th>총 상영수</th>
                        <th>수정</th>
                        <th>삭제</th>
                    </tr>
                    <tr>
                        <td>1</td>
                        <td>기생충</td>
                        <td id="mov_des">전원백수로 살 길 막막하지만 사이는 좋은 기택(송강호) 가족.장남 기우(최우식)에게 명문대생 친구가 연결시켜 준 고액 과외 자리는모처럼 싹튼 고정수입의 희망이다.온 가족의 도움과 기대 속에 박사장(이선균) 집으로 향하는 기우.글로벌 IT기업 CEO인 박사장의 저택에 도착하자젊고 아름다운 사모님 연교(조여정)가 기우를 맞이한다.그러나 이렇게 시작된 두 가족의 만남 뒤로, 걷잡을 수 없는 사건이 기다리고 있었으니…</td>
                        <td>15</td>
                        <td>봉준호</td>
                        <td>2021-10-06 15:39:12</td>
                        <td>130</td>
                        <td>1000</td>
                        <td>수정</td>
                        <td>삭제</td>
                    </tr>
                </table>
        </div>
            <div class="tabs_content2" id="design_manage_content">
                <input type="button" value="입력" id="confirm"/>
                <table>
                    <tr>
                        <th>일련번호</th>
                        <th>극장명</th>
                        <th>상영관</th>
                        <th>시작시간</th>
                        <th>영화명</th>
                        <th>남은자리</th>
                        <th>수정</th>
                        <th>삭제</th>
                    </tr>
                    <tr>
                        <td>1</td>
                        <td>기생충</td>
                        <td id="mov_des">전원백수로 살 길 막막하지만 사이는 좋은 기택(송강호) 가족.장남 기우(최우식)에게 명문대생 친구가 연결시켜 준 고액 과외 자리는모처럼 싹튼 고정수입의 희망이다.온 가족의 도움과 기대 속에 박사장(이선균) 집으로 향하는 기우.글로벌 IT기업 CEO인 박사장의 저택에 도착하자젊고 아름다운 사모님 연교(조여정)가 기우를 맞이한다.그러나 이렇게 시작된 두 가족의 만남 뒤로, 걷잡을 수 없는 사건이 기다리고 있었으니…</td>
                        <td>15</td>
                        <td>봉준호</td>
                        <td>2021-10-06 15:39:12</td>
                        <td>수정</td>
                        <td>삭제</td>
                    </tr>
                </table>
        </div>
    </div>

    </body>
</html>