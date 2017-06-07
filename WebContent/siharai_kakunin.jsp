<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
	<html>
  	<head>
    <meta charset="utf-8">
    <title>支払い確認画面</title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <!-- Stylesheet
    ==================================================
    <!--
    <link rel="stylesheet" type="text/css"  href="css/＠＠＠.css">
    <link rel="stylesheet" type="text/css"  href="css/＠＠＠.css">
    <link rel="stylesheet" type="text/css"  href="">
    -->
    <link rel="stylesheet" type="text/css"  href="css/siharai_kakunin.css">
    <!-- Javascripts
    ================================================== -->
    <script src="js/jquery-3.2.1.min.js"></script>
    <script>
        $(document).ready(function(){
   			 $('#top-menu').prmenu();
        });
	</script>
  	</head>
 	<body>
    <body>
    <div id="header"></div><br>

    <img src="img/siharai_kakunin.png" alt="お支払い確認">
	<table align="center">
	<thead>
    <tr>
    <th>商品名</th>
    <th>価格</th>
    <th>個数</th>
    <th>小計</th>
    </tr>
    </thead>

	<tbody>
    <tr>
    <td><img src="img/honkidama.jpg" alt="商品画像　商品名" align="center"> 　　本気玉</td>
    <td align="center">2,500円（税込）</td>
    <td align="center">1</td>
    <td align="center">2,500円（税込）</td>
    </tr>
    </tbody>

	<tfoot>
    <tr>
    <td class="souryo" colspan="2">送料（国内）</td>
    <td align="center" colspan="2">無料</td>
    </tr>
    <tr>
    <td class="gokei" colspan="2">合計（税込）</td>
    <td align="center">1個</td>
    <td align="center">2,500円</td>
    </tr>
    </tfoot>
    </table>

    <table align="center">
	<thead>
    <tr>
    <th colspan="2">お支払い方法</th>
    </tr>
    </thead>

    <tbody>
    <tr>
    <td>カードの種類</td><td align="center">VISA</td>
    </tr>
    <tr>
    <td>カード番号</td><td align="center">000000000000</td>
    </tr>
    <tr>
    <td>セキュリティーコード</td><td align="center">123</td>
    </tr>
    <tr>
    <td>有効期限</td><td align="center">2018年　5月</td>
    </tr>
    <tr>
    <td>カード名義人</td><td align="center">白石　遼</td>
    </tr>
    </tbody>
    </table>

    <table align="center">
    <thead>
    <tr>
    <th colspan="2">お届け先</th>
    </tr>
    </thead>


    <tbody>
    <tr>
    <td>氏名</td><td align="center">白石　遼</td>
    </tr>
    <tr>
    <td>お届け先住所</td><td align="center">東京都○○区</td>
    </tr>
    </tbody>
    </table>

	<div>
    <a href="./siharai.html">
    	<img src="img/chumon_kanryo.png" alt="注文確定" align="right">
    </a>
    </div>
  </body>
</html>