<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>花火なら『tamaya』</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<!-- Javascripts -->
<script src="js/jquery-3.2.1.min.js"></script>
<script>
	function get() {
		$.ajax({
			url : 'TestAction.action',
			type : 'GET',
			dataType : 'json',
			success : function(json) {
				var test = document.createElement('div');
				test.innerText = json.method;
				document.body.appendChild(test);
			}
		})
	}
	var data = {
		msg : ""
	}
	function post() {
		var msg = document.getElementById("msg");
		data.msg = msg.value;
		$.ajax({
			url : 'TestAction.action',
			type : 'POST',
			data : data,
			dataType : 'json',
			success : function(json) {
				var test = document.createElement('div');
				test.innerText = json.method;
				document.body.appendChild(test);
			}
		})
	}
</script>
</head>
<body>
  <input type="button" onclick="get();" value="Ajax(GET通信)" style="margin-left: 220px;">
  <br>
  msg：<input type="text" id="msg" name="msg" value="POSTだよ" form="post_form">
  <input type="button" onclick="post();" value="Ajax(POST通信)">
  <br>
  <form action="TestAction" method="post" id="post_form"></form>
  <br>
  <a href='<s:url action="TestAction" />'>
    <button>TestAction から受け取った hash（ json ファイル）を見る（GET通信）</button>
  </a>
  <br>
  <button type="submit" form="post_form">TestAction から受け取った hash（ json ファイル） を見る（POST通信）</button>
</body>
</html>