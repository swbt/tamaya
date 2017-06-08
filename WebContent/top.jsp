<%@ page language="java" contentType="text/html; charset=utf-8"
pageEncoding="utf-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8">
		<title>花火なら『tamaya』</title>
		<!-- Stylesheet
		================================================== -->
		<lINK href="css/top.css"rel="stylesheet" type="text/css">
		<link rel="stylesheet" type="text/css" href="slick.css" media="screen" />
		<link rel="stylesheet" type="text/css" href="slick-theme.css" media="screen" />
		<script src="slick.min.js"></script>
		<!-- Javascripts
		================================================== -->
		<script src="js/jquery-3.2.1.min.js"></script>
		<script>
			$(document).ready(function(){
				$("#header").load("login_header.jsp")
			});
		</script>
	</head>
	<body>
		<div id="header">
		</div>
		<div class="container">
			<div class=photo-show>
				<img src="img/hanabi2.jpg" class="aaa" alt="手持ち花火">
				<img src="img/hanabi3.jpg" class="bbb" alt="手持ち花火">
				<img src="img/hanabi4.jpg" class="ccc" alt="手持ち花火">
				<img src="img/hanabi5.jpg" class="aaa1" alt="手持ち花火">
				<img src="img/hanabi6.jpg" class="aaa2" alt="手持ち花火">
				<img src="img/hanabi7.jpg" class="aaa3" alt="手持ち花火">
				<img src="img/hanabi8.jpg" class="aaa4" alt="手持ち花火">
				<img src="img/hanabi9.jpg" class="aaa5" alt="手持ち花火">
				<img src="img/hanabi10.jpg" class="aaa6" alt="手持ち花火">
				<img src="img/hanabi11.jpg" class="aaa7" alt="手持ち花火">
			</div>
			<div class=syurui>

			</div>

			<div class=kakaku>
			<div class=hbox2>
			<h3>花火の価格別</h3>
			<div class=box2>
					<a href="kakaku0000.jsp" class="button1">499円以下</a>
					<a href="kakaku0500.jsp" class="button2">500円～999円</a>
					<a href="kakaku1000.jsp" class="button3">1000円～4999円</a>

				</div>
				<h3>花火の価格別</h3>
			</div>
				<div class=box2>
					<a href="kakaku0000.jsp" class="button1">499円以下</a>
					<a href="kakaku0500.jsp" class="button2">500円～999円</a>
					<a href="kakaku1000.jsp" class="button3">1000円～4999円</a>
					<a href="kakaku5000.jsp" class="button4">5000円以上</a>
				</div>
			</div>
			<div class=ranking>
			<div class=h3>
				<h3>花火の売り上げランキングトップ3</h3>
			</div>
			<div class=box3>
				<div class=icon1><a href="./"><img src=""  alt="1位(アイコン)"></a><p>商品名<br>価格</p></div>
				<div class=icon2><a href="./"><img src=""  alt="2位(アイコン)"></a><p>商品名<br>価格</p></div>
				<div class=icon3><a href="./"><img src=""  alt="3位(アイコン)"></a><p>商品名<br>価格</p></div>
			</div>
			</div>
			<div class=tokusyu>
				<div class=hbox4>
					<h3>花火特集</h3>
				</div>
				<div class=box4>
					<a href="./tokusyu.jsp"><img src="img/kazokuphoto.jpg" class="ttt1" alt="家族特集"></a>
					<a href="./tokusyu.jsp">家族特集</a>
					<a href="./tokusyu.jsp"><img src="img/couplephoto.jpg" class="ttt2" alt="カップル特集"></a>
					<a href="./tokusyu.jsp">カップル特集</a>
					<a href="./tokusyu.jsp"><img src="img/daikazokuphoto.jpg"class="ttt3" alt="大人数特集"></a>
					<a href="./tokusyu.jsp">大人数特集</a>
				</div>
			</div>
		</div>
	</body>
</html>