<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
  <head>
    <meta charset="utf-8">
    <title>マイページ</title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <!-- Stylesheet
    ================================================== -->
    <!--
    <link rel="stylesheet" type="text/css"  href="css/＠＠＠.css">
    <link rel="stylesheet" type="text/css" href="css/＠＠＠.css">
    <link rel="stylesheet" type="text/css" href="">
    -->
    <!-- Javascripts
    ================================================== -->
    <script src="js/jquery-3.2.1.min.js"></script>
    <script>
      $(document).ready(function(){
        $("#header").load("login_header.html");
      });
    </script>
  </head>
  <body>
    <div id="header"></div>
    <h1>マイページ</h1>
    <h2>アカウント情報</h2>
    <table border="1">
      <tr>
        <td>名前</td><td>玉屋花子</td>
      </tr>
      <tr>
        <td>郵便番号</td><td>〒***-****</td>
      </tr>
    </table>
    <h2>注文履歴</h2>
    <table border="1">
      <tr>
        <th>商品画像</th><th>商品名</th><th>価格</th><th>個数</th><th>小計</th>
      </tr>
      <tr>
        <td></td><td>線香花火</td><td>***円（税込）</td><td>3</td><td>****円（税込）</td>
      </tr>
    </table>
  </body>
</html>