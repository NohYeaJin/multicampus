<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@include file="/WEB-INF/views/include/header.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="/resources/css/style.css">
</head>
<body>
    <div id="reserve_tables">
    <div id="date">
        <table>
            <tr>
                <th>날짜</th>
            </tr>
            <c:forEach var="row" items="${dates}"  varStatus="varstatus">
            <tr>
                <td><a href="#" id="${row}" onclick="addDates('${row}')">${row}</a></td>
            </tr>
            </c:forEach>
        </table>
    </div>
    <div id="movie">
        <table >
            <tr>
                <th>영화</th>
            </tr>
            <c:forEach var="row2" items="${movies}"  varStatus="varstatus">
            <tr>
                <td><a href="#" id="movie${row2.movie_id}" onclick="addMovie(${row2.movie_id})">${row2.movie_name}(${row2.age_limit})</a></td>
            </tr>
            </c:forEach>
        </table>
    </div>
    <div id="theater">
        <table>
            <tr>
                <th>극장</th>
            </tr>
            <c:forEach var="row3" items="${theaters}"  varStatus="varstatus">
            <tr>
                <td><a href="#" id="theater${row3.theater_id}" onclick="addTheater(${row3.theater_id})">${row3.theater_name}</a></td>
            </tr>
            </c:forEach>
        </table>
    </div>
    <div id="time">
        <table id="timetable">
            <tr>
                <th>시간</th>
            </tr>
            <tbody id="timetable_body">
            <tr id="times_list">
                <td id="basic_time">날짜와 영화, 영화관을<br>
                     선택해주세요</td>
            </tr> 
            </tbody>        
        </table>
    </div>
</div>
<form id="searchform" method="get" action="/optioncomplete">
	<input type="hidden" id="movie_id">
	<input type="hidden" id="movie_date">
	<input type="hidden" id="theater_id">
	<input type="hidden" id="movie_time" name="time_id">
	<input type="button" class="fast_btn" id="send_btn" onclick="sendform()" value="좌석 선택 ▷"/>
</form>

<script>
var theater_val = "";
var movie_val = "";
var date_val = "";
var time_val = "";

function sendform(){
	if(theater_val != "" && date_val != "" && movie_val !="" && time_val !=""){
		document.getElementById("searchform").submit();
	}else{
		alert("모든 옵션을 선택해주세요");
	}
}

function sendform2(){
	if(theater_val != "" && date_val != "" && movie_val !="" && time_val !=""){
		document.getElementById("send_btn").style.backgroundColor = "#f6b569";
	}
}

function submitform(theater_val,movie_val,date_val){
	if(theater_val != "" && date_val != "" && movie_val !=""){
			$.ajax({
				type:"post",
				async: false,
				url: "/movietime",
				dataType : 'json',
				data: {movie_id: movie_val, theater_id: theater_val, date: date_val},
				success: function(data,textStatus){
					$("#basic_time").html("");
					$("#timetable_body").html("");
					var tbody = $("#timetable_body");
					$.each(data.timelist, function (i, movietime) {
						console.log(movietime.movie_id);
						console.log(movietime.room_id);
						console.log(movietime.start_time);
						
						tbody.append("<tr><td>"+"<a href='#' id='"+"time"+movietime.time_id+"' onclick='addTime("+movietime.time_id+")'>"+movietime.printTime+"("+movietime.left_seat_num+"석)"+"</a></td></tr>");
					
					})
					},
				error: function(data,textStatus){
					alert("에러 발생");
				},
				complete:function(data,textStatus){
				}
				});
	}
}

function addTheater(theater_id){
	document.getElementById("theater_id").value = theater_id;
	document.getElementById("theater"+theater_id).parentNode.classList.add('selected2');  
	if(theater_val != ""){
		document.getElementById("theater"+theater_val).parentNode.classList.remove('selected2');
	}
	theater_val = theater_id
	
	submitform(theater_val,movie_val,date_val);
}
function addMovie(movie_id){
	document.getElementById("movie_id").value = movie_id;
	document.getElementById("movie"+movie_id).parentNode.classList.add('selected2');  	
	if(movie_val != ""){
		document.getElementById("movie"+movie_val).parentNode.classList.remove('selected2');
	}
	movie_val = movie_id;
	submitform(theater_val,movie_val,date_val)
}
function addDates(date){
	document.getElementById("movie_date").value = date;
	document.getElementById(date).parentNode.classList.add('selected2');  
	if(date_val != ""){
		document.getElementById(date_val).parentNode.classList.remove('selected2');
	}
	date_val = date;
	submitform(theater_val,movie_val,date_val);
}

function addTime(time_id){
	document.getElementById("movie_time").value = time_id;
	document.getElementById("time"+time_id).parentNode.classList.add('selected2');  
	if(time_val != ""){
		document.getElementById("time"+time_val).parentNode.classList.remove('selected2');
	}
	time_val = time_id;
	sendform2();
}
</script>
</body>
</html>


    