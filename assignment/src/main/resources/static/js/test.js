$(function(){
	$("#login_btn").click(function(){
	var _id = $("#id").val();
	var _password = $("#pw").val();
		$.ajax({
			type:"post",
			async: false,
			url: "/login",
			data: {id: _id, password: _password},
			success: function(data,textStatus){
				var memberinfo = JSON.parse(data);
				alert("Data:" + memberinfo.name + "님 login ok\n" + "Status: success");
				},
			error: function(data,textStatus){
				alert("에러 발생");
			},
			complete:function(data,textStatus){
			}
			});
		});
	});
				