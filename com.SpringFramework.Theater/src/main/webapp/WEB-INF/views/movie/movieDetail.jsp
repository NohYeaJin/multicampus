<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@include file="/WEB-INF/views/include/header.jsp" %>
<%
	session = request.getSession();
	session.getAttribute("member");
%>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="/resources/css/style.css">
<link href="http://fonts.googleapis.com/earlyaccess/nanumgothiccoding.css" rel="stylesheet">
</head>
<body>
    <div id="detail">
        <img src="/resources/image/${movieinfo.movie_poster}" id="detail_img"/>
        <input type="hidden" value="${movieinfo.movie_id}" id="hidden_id"/>
        <table id="detail_table">
            <tr id="movie_name">
                <td>${movieinfo.movie_name}(${movieinfo.time_duration}분)(${movieinfo.age_limit}세)</td>
            </tr>
            <tr>
                <td>감독: ${movieinfo.director_name}</td>
            </tr>
            <tr>
                <td>개봉일: 2021-10-13 </td>
            </tr>
            <tr>
                <td rowspan="2">${movieinfo.movie_info}</td>
            </tr>
        </table>
        <div id="comments">
			<form id="commentForm" name="commentForm" method="post">
    <br><br>
        <div>
            <div>
                <span><strong>Comments</strong></span> <span id="Cnt"></span>
            </div>
            <div>
                <table class="table">                    
                    <tr>
                        <td>
                            <textarea style="width: 800px" rows="3" cols="30" id="comment" name="comment" placeholder="댓글을 입력하세요"></textarea>
                            <input type="button" id="comment_btn" class="btn pull-right btn-success" value="등록"/>
                        </td>
                    </tr>
                </table>
            </div>
        </div>
        <input type="hidden" id="b_code" name="b_code" value="${result.code}" />        
    </form>
    <div class="container">
    <form id="commentListForm" name="commentListForm" method="post">
        <table id="commentList">
        </table>
    </form>
</div>
        </div>
    </div>
    </body>
    <script>
	function showReplyList(){
		var url = "/getReplyList";
		var movie_id2 = $("#hidden_id").val();
		$.ajax({
            type: 'POST',
            url: url,
            data: {movie_id: movie_id2},
            dataType: 'json',
            success: function(result) {
            	var tbody = $("#commentList");
			if(result.length < 1){
				tbody.append("<tr><td>등록된 댓글이 없습니다.</td></tr>");
			} else {
	                $(result).each(function(){
	                	tbody.append("<tr><td>"+this.user_id+": "+this.content_text+" ("+this.printTime+")<input type='button' id='cmt' value='수정'/><input type='button' id='cmt' value='삭제'/></td></tr>");
	                });	//each end
			}
            }	   // Ajax success end

		});	// Ajax end

	}
	showReplyList();
	
	$(document).on('click', '#comment_btn', function(){
		var movie_id2 = $("#hidden_id").val();
		console.log(movie_id2);
		var replyContent = $('#comment').val();
		console.log(replyContent);
		$.ajax({
			url: "/insertReply"
			, data : {content_text: replyContent, movie_id:movie_id2}
			, type : 'POST'
			, dataType : 'text'
			, success: function(result){
				$('#comment').val('');
				var tbody = $("#commentList");
				tbody.html(" ");
				showReplyList();
			}
			, error: function(error){
				console.log("에러 : " + error);
				$('#comment').val('');
				showReplyList();

			}

		});

	});


	
</script>  
</html>