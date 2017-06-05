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
    <h2>カートに入っている商品</h2><br>
    <p>商品名　(税込)　個数　小計(税込)　削除</p>
    <p>合計　　　　円</p>
    <a href="./siharai.html">購入／支払い情報入力</a>
  </body>
</html>
