<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

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
<!--     <script>
      $(document).ready(function(){
        $("#header").load("login_header.html");
      });
    </script> -->
<link rel="stylesheet" type="text/css" href="./css/mypage.css"
	media="all">
</head>

<s:include value="login_header.jsp" />


<h1>マイページ</h1>
<table class="type07">
	<thead>
		<tr>

			<th scope="col">アカウント情報</th>
			<th scope="col"></th>
		</tr>
	</thead>
	<tbody>
		<s:iterator value="userList">
			<tr>
				<th scope="row">氏名</th>
				<td><s:property value="familyNameKanji" /> <s:property
						value="familyNameKana" /></td>
			</tr>
			<tr>
				<th scope="row">住所</th>
				<td>〒<s:property value="postal" /> <s:property value="address" /></td>
			</tr>
			<tr>
				<th scope="row">email</th>

				<td><s:property value="email" /></td>

			</tr>
			</s:iterator>
	</tbody>
</table>





<table class="type07">
	<thead>
		<tr>

			<th scope="col">購入履歴</th>
			<th scope="col"></th>
		</tr>
	</thead>
	<tbody>
		<s:iterator value="cartList">
			<tr>
				<th scope="row">商品画像</th>
				<td><img class="shohin" src="<s:property value="imgPath"/>"
					width="200" height="180" ></td>
			</tr>
			<tr>
				<th scope="row">商品名</th>
				<td><s:property value="itemName" /></td>
			</tr>
			<tr>
				<th scope="row">価格</th>

				<td><s:property value="price" />円</td>

			</tr>
			<tr>
				<th scope="row">数量</th>
				<td><s:property value="quantity" /></td>
			<tr>
				<th scope="row">小計</th>

				<td><s:property value="%{price * quantity}" />円</td>

			</tr>
		</s:iterator>
	</tbody>

</table>