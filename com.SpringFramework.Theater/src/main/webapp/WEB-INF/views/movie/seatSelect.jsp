<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="/resources/css/style.css">
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
        <li><a href="#">Today Tickets</a></li>
        <li><a href="#">Facilities</a></li>
        <li id="payment"><a href="#">Payments & discount</a></li>
        <li><a href="#">Contact</a></li>
    </ul>
</nav>
        <fieldset class="seatform">
            <legend>좌석 선택</legend>
            <div class="screen">스크린</div>
            A
            <input type="button" class="seats" value="A1" />
            <input type="button" class="seats" value="A2" />
            <input type="button" class="seats" value="A3" />
            <input type="button" class="seats" value="A4" />
            <input type="button" class="seats" value="A5" />
            <input type="button" class="seats" value="A6" />
            <input type="button" class="seats" value="A7" />
            <input type="button" class="seats" value="A8" />
            <input type="button" class="seats" value="A9" />
            <br>
            B
            <input type="button" class="seats" value="B1" />
            <input type="button" class="seats" value="B2" />
            <input type="button" class="seats" value="B3" />
            <input type="button" class="seats" value="B4" />
            <input type="button" class="seats" value="B5" />
            <input type="button" class="seats" value="B6" />
            <input type="button" class="seats" value="B7" />
            <input type="button" class="seats" value="B8" />
            <input type="button" class="seats" value="B9" />
            <br>
            C
            <input type="button" class="seats" value="C1" />
            <input type="button" class="seats" value="C2" />
            <input type="button" class="seats" value="C3" />
            <input type="button" class="seats" value="C4" />
            <input type="button" class="seats" value="C5" />
            <input type="button" class="seats" value="C6" />
            <input type="button" class="seats" value="C7" />
            <input type="button" class="seats" value="C8" />
            <input type="button" class="seats" value="C9" />
            <br>
            D
            <input type="button" class="seats" value="D1" />
            <input type="button" class="seats" value="D2" />
            <input type="button" class="seats" value="D3" />
            <input type="button" class="seats" value="D4" />
            <input type="button" class="seats" value="D5" />
            <input type="button" class="seats" value="D6" />
            <input type="button" class="seats" value="D7" />
            <input type="button" class="seats" value="D8" />
            <input type="button" class="seats" value="D9" />
            <br>
            E
            <input type="button" class="seats" value="E1" />
            <input type="button" class="seats" value="E2" />
            <input type="button" class="seats" value="E3" />
            <input type="button" class="seats" value="E4" />
            <input type="button" class="seats" value="E5" />
            <input type="button" class="seats" value="E6" />
            <input type="button" class="seats" value="E7" />
            <input type="button" class="seats" value="E8" />
            <input type="button" class="seats" value="E9" />
        </fieldset>
        <div class="show_seat">
            선택 자리:
            <input value="선택 자리" id="seatchosen" disabled>
        </div>
        <div class="seat_price">
            결제 금액: 
            <input value="" id="seatchosen" disabled>
        </div>
        <div class="goto">
            <input type="submit" class="reserve"value="결제하기"/>
        </div>
</body>
<script>
    function selectseat(){

    }
</script>
</html>