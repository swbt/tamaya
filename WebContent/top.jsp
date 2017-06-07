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

    <LINK href="css/top.css"rel="stylesheet" type="text/css">

	<link rel="stylesheet" href="./slick-theme.css" />
	<link rel="stylesheet" href="./css/bootstrap-top.css" />


    <!-- Javascripts
    ================================================== -->
    <script src="js/jquery-3.2.1.min.js"></script>
    <script>
      $(document).ready(function(){
        $("#header").load("login_header.jsp");
      });


    </script>

  	</head>
  	<body>

 <div id="header"></div>
	<div class="container">


	<div class=gazoubox><img src="img/visa.png"width=900 height=900 alt="手持ち花火">
	</div>








	<div class=syurui>
	<div class="hbox1">
	<h3>花火の種類別</h3></div>
  	<div class="box1">

	  	<a href="./temoti.jsp"><img src="img/temotiphoto.png" width=150 height=100 alt="手持ち"></a>
	  	<a href="./temoti.jsp">手持ち</a>
	  	<a href="./hunsyutu.jsp"><img src="img/hunsyutuphoto.jpg" width=150 height=100 alt="噴出"></a>
	  	<a href="./hunsyutu.jsp">噴出</a>
	  	<a href="./utiage.jsp"><img src="img/utiagephoto.jpg" width=150 height=100 alt="打上げ"></a>
	  	<a href="./utiage.jsp">打上げ</a>
	  	<a href="./sonota.jsp"><img src="img/sonotaphoto.jpeg" width=150 height=100 alt="その他"></a>
		<a href="./sonota.jsp">その他</a>

	</div>
</div>


	<div class=kakaku>
	<div class=hbox2>

                    <h3>花火の価格別</h3></div>




	<div class=box2>

	<a href="kakaku0000.jsp"><button type="button" class="btn btn-primary btn-lg">499円以下</button></a>
    <div class=button2><a href="kakaku0500.jsp" id="button">500円～999円</a></div>
     <div class=button3><a href="kakaku1000.jsp" id="button">1000円～4999円</a></div>
    <div class=button4><a href="kakaku5000.jsp" id="button">5000円～</a></div>
	</div>
	</div>


	<div class=ranking>
	<div class=h3>

                    <h3>花火の売り上げランキングトップ3</h3></div>
	<div class=box3>
	<div class=icon1><a href="./"><img src=""  alt="1位(アイコン)"></a><p>商品名<br>価格</p></div>
	<div class=icon2><a href="./"><img src=""  alt="2位(アイコン)"></a><p>商品名<br>価格</p></div>
	<div class=icon3><a href="./"><img src=""  alt="3位(アイコン)"></a><p>商品名<br>価格</p></div>

	</div>
	</div>
	<div class=tokusyu>
	<div class=hbox4>
                     <h3>花火特集</h3></div>


	<div class=box4>
    <a href="./tokusyu.jsp"><img src="img/kazokuphoto.jpg" width=220 height=270 alt="家族特集"></a>
    <a href="./tokusyu.jsp">家族特集</a>
     <a href="./tokusyu.jsp"><img src="img/couplephoto.jpg" width=220 height=270 alt="カップル特集"></a>
     <a href="./tokusyu.jsp">カップル特集</a>
     <a href="./tokusyu.jsp"><img src="img/daikazokuphoto.jpg" width=220 height=270 alt="大人数特集"></a>
     <a href="./tokusyu.jsp">大人数特集</a>

	</div>

	</div>

</div>












  	</body>
	</html>