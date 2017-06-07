<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
	<html>
	<head>
	<meta charset="utf-8">
    <title>カート</title>
    <meta name="description" content="An interactive getting started guide for Brackets.">
    <!--
    <link rel="stylesheet" href="main.css">
     -->
      <link rel="stylesheet" type="text/css" href="css/cart.css">
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
	<table align="center">
	<thead>
    <tr>
    <th>商品名</th>
    <th>価格</th>
    <th>個数</th>
    <th>小計</th>
    <th>削除</th>
    </tr>
    	</thead>

	<tbody>
    <tr>
    <td><img src="img/honkidama.jpg" alt="商品画像　商品名" align="middle"> 　　本気玉</td>
    <td align="center">2,500円（税込）</td>
    <td>
    <select name="number" >
    	<option value="selected">選択してください</open>
    	<option value="1">1</option>
    	<option value="2">2</option>
    	<option value="3">3</option>
    	<option value="4">4</option>
    	<option value="5">5</option>
    	<option value="6">6</option>
    	<option value="7">7</option>
    	<option value="8">8</option>
    	<option value="9">9</option>
    	<option value="10">10</option>
    	</select>
    </td>
    <td align="center">2,500円（税込）</td>
    <td><img src="img/shut.gif" alt="×"></td>
    </tr>
    </tbody>

	<tfoot>
    <tr>
    <td colspan="2">送料（国内）</td>
    <td colspan="3">無料</td>
    </tr>
    </tfoot>
    </table>

	<table align="center">
	<tr>
    <td>合計（税込）</td>
    <td align="center">1個</td>
    <td align="center">2,500円</td>
    </table>

	<div>
    <a href="./siharai.html">
    	<img src="img/shiharai_nyuryoku.png" alt="支払い情報入力画面" align="right">
    </a>
    </div>
  </body>
</html>
