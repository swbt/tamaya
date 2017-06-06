<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

    <title>カート</title>
    <meta name="description" content="An interactive getting started guide for Brackets.">
    <!--
    <link rel="stylesheet" href="main.css">
     -->
    <script src="js/jquery-3.2.1.min.js"></script>
    <script>
      $(document).ready(function(){
    	  $("#header").load("login_header.html");
      });
    </script>

  </head>
  <body>
    <div id="header"></div><br>

    <img src="img/cart_shohin.png" alt="カートに入っている商品">

    <table border="1" cellspacing="0">
    <tr>
    <th>商品名</th>
    <th>価格</th>
    <th>個数</th>
    <th>小計</th>
    <th>削除</th>
    </tr>

    <tr>
    <td>商品画像　商品名</td>
    <td>2,500円（税込）</td>
    <td>個数</td>
    <td>2,500円（税込）</td>
    <td>×</td>
    </tr>

    <tr>
    <td colspan="2">送料（国内）</td>
    <td colspan="3">無料</td>
    </table>

	<table border="1" cellspacing="0">
	<tr>
    <td>合計（税込）</td>
    <td>1個</td>
    <td>2,500円</td>
    </table>

	<div>
    <a href="./siharai.html">
    	<img src="img/shiharai_nyuryoku.png" alt="支払い情報入力画面">
    </a>
    </div>
  </body>
</html>
