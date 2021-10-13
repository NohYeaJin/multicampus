<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@include file="/WEB-INF/views/include/header.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="style.css">
</head>
<body>
        <fieldset class="seatform">
            <legend>좌석 선택</legend>
            <div class="screen">스크린</div>
            A
            <input type="button" class="seats" value="A1" id="A1" onclick="selectseat('A1')"/>
            <input type="button" class="seats" value="A2" id="A2" onclick="selectseat('A2')"/>
            <input type="button" class="seats" value="A3" id="A3" onclick="selectseat('A3')"/>
            <input type="button" class="seats" value="A4" id="A4" onclick="selectseat('A4')"/>
            <input type="button" class="seats" value="A5" id="A5" onclick="selectseat('A5')"/>
            <input type="button" class="seats" value="A6" id="A6" onclick="selectseat('A6')"/>
            <input type="button" class="seats" value="A7" id="A7" onclick="selectseat('A7')"/>
            <input type="button" class="seats" value="A8" id="A8" onclick="selectseat('A8')"/>
            <input type="button" class="seats" value="A9" id="A9" onclick="selectseat('A9')"/>
            <br>
            B
            <input type="button" class="seats" value="B1" id="B1" onclick="selectseat('B1')"/>
            <input type="button" class="seats" value="B2" id="B2" onclick="selectseat('B2')"/>
            <input type="button" class="seats" value="B3" id="B3" onclick="selectseat('B3')"/>
            <input type="button" class="seats" value="B4" id="B4" onclick="selectseat('B4')"/>
            <input type="button" class="seats" value="B5" id="B5" onclick="selectseat('B5')"/>
            <input type="button" class="seats" value="B6" id="B6" onclick="selectseat('B6')"/>
            <input type="button" class="seats" value="B7" id="B7" onclick="selectseat('B7')"/>
            <input type="button" class="seats" value="B8" id="B8" onclick="selectseat('B8')"/>
            <input type="button" class="seats" value="B9" id="B9" onclick="selectseat('B9')"/>
            <br>
            C
            <input type="button" class="seats" value="C1" id="C1" onclick="selectseat('C1')"/>
            <input type="button" class="seats" value="C2" id="C2" onclick="selectseat('C2')"/>
            <input type="button" class="seats" value="C3" id="C3" onclick="selectseat('C3')"/>
            <input type="button" class="seats" value="C4" id="C4" onclick="selectseat('C4')"/>
            <input type="button" class="seats" value="C5" id="C5" onclick="selectseat('C5')"/>
            <input type="button" class="seats" value="C6" id="C6" onclick="selectseat('C6')"/>
            <input type="button" class="seats" value="C7" id="C7" onclick="selectseat('C7')"/>
            <input type="button" class="seats" value="C8" id="C8" onclick="selectseat('C8')"/>
            <input type="button" class="seats" value="C9" id="C9" onclick="selectseat('C9')"/>
            <br>
            D
            <input type="button" class="seats" value="D1" id="D1" onclick="selectseat('D1')"/>
            <input type="button" class="seats" value="D2" id="D2" onclick="selectseat('D2')"/>
            <input type="button" class="seats" value="D3" id="D3" onclick="selectseat('D3')"/>
            <input type="button" class="seats" value="D4" id="D4" onclick="selectseat('D4')"/>
            <input type="button" class="seats" value="D5" id="D5" onclick="selectseat('D5')"/>
            <input type="button" class="seats" value="D6" id="D6" onclick="selectseat('D6')"/>
            <input type="button" class="seats" value="D7" id="D7" onclick="selectseat('D7')"/>
            <input type="button" class="seats" value="D8" id="D8" onclick="selectseat('D8')"/>
            <input type="button" class="seats" value="D9" id="D9" onclick="selectseat('D9')"/>

        </fieldset>
        <form method="post" action="/ordercomplete" id="submitform">
        <input type="hidden" value = "${time_id}" name = "time_id"/>
        <div class="show_seat">
            선택 자리:
            <input type="hidden" id="hiddenseat" name="seatchosen" value=""/>
            <input id="seatchosen" value = "" type="text" disabled>
        </div>
        <div class="seat_price">
            결제 금액: 
            <input type="hidden" id="hiddenprice" name="price" value=""/>
            <input id="seat_price" value="" type="text" disabled>
        </div>
        <div class="goto">
            <input type="button" onclick="checkvalue()" class="reserve" value="결제하기"/>
        </div>
        </form>
<c:forEach var="row" items="${takenseats}"  varStatus="varstatus">
	<script>
		document.getElementById('${row.seat}').classList.add('selected');
		document.getElementById('${row.seat}').removeAttribute('onclick');
	</script>
</c:forEach>
<script>	
    var seatarray = [];
    var seattext = "";
    var price = 0;
    document.getElementById("seat_price").value = price + "원";
    function selectseat(seat){
        seattext="";
        if(document.getElementById(seat).classList.length>=2){
            document.getElementById(seat).classList.remove('selected');
            const idx = seatarray.indexOf(seat)
            seatarray.splice(idx,1);
            for(var i = 0;i<seatarray.length;i++){
                seattext = seattext + seatarray[i] + " ";
        }
            document.getElementById("seatchosen").value = seattext; 
            document.getElementById("seat_price").value = (seatarray.length * 7000) + "원"
            document.getElementById("hiddenseat").value = seattext; 
            document.getElementById("hiddenprice").value = (seatarray.length * 7000);
        }
        else{
        document.getElementById(seat).classList.add('selected');  
        seatarray.push(seat);
        for(var i = 0;i<seatarray.length;i++){
            seattext = seattext + seatarray[i] + " ";
        }
        document.getElementById('seatchosen').value = seattext; 
        document.getElementById("seat_price").value = (seatarray.length * 7000) + "원";
        document.getElementById('hiddenseat').value = seattext; 
        document.getElementById("hiddenprice").value = (seatarray.length * 7000);
        }
    }
    
    function checkvalue(){
		if(document.getElementById("seat_price").value==0 || document.getElementById("seatchosen").value == ""){
			alert("적어도 하나의 자리를 선택해야 합니다");
		}else{
			document.getElementById('submitform').submit();
		}
	}
    
    
    
</script>
</body>

</html>