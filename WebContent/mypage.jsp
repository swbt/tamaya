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

    <link rel="stylesheet" type="text/css" href="./css/mypage.css" media="all">
  </head>

 <table class="type07">
    <thead>
    <tr>

        <th scope="cols">アカウント情報</th>
        <th scope="cols"></th>
    </tr>
    </thead>
    <tbody>
    <tr>
        <th scope="row">氏名</th>
        <td>山田花子</td>
    </tr>
    <tr>
        <th scope="row">住所</th>
        <td>〒○○○-○○○○　東京都○○区○○</td>
    </tr>
    <tr>
        <th scope="row">email</th>

        <td>○○○○@gmail.com</td>

    </tr>

</tbody>

</table>

<table class="type07">
    <thead>
    <tr>

        <th scope="cols">注文履歴</th>
        <th scope="cols"></th>
    </tr>
    </thead>
    <tbody>
    <tr>
        <th scope="row">商品画像</th>
        <td>画像</td>
    </tr>
    <tr>
        <th scope="row">商品名</th>
        <td>線香花火</td>
    </tr>
    <tr>
        <th scope="row">価格</th>

        <td>1000円(税込)</td>

    </tr>
    <tr>
        <th scope="row">数量</th>
        <td>3(個)</td>
    <tr>
        <th scope="row">小計</th>

        <td>3240円(税込)</td>

    </tr>
</tbody>

</table>