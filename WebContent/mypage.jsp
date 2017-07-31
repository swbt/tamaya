<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%--国際化用 --%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">

<%--国際化用 --%>
<fmt:setLocale value="${pageContext.request.locale.language}" />
<fmt:setBundle basename="com.internousdev.tamaya.property.top" var="lang" />
<title><s:text name="lang.mypage.title" /></title>
<meta name="viewport" content="width=device-width,user-scalable=no,maximum-scale=1" />
<!-- ▼▼StyleSheet -->
<link rel="stylesheet" href="css/normalize.css">
<link rel="stylesheet" href="css/style.css">
<link rel="stylesheet" href="css/mypage.css">

<!-- ▼▼JavaScript -->
<script src="js/jquery-3.2.1.min.js"></script>

</head>
<body>
  <!-- ▼▼ヘッダーのjspファイルを読み込む -->
  <s:include value="header.jsp" />

<h1>マイページ</h1>
<table class="type07">
  <thead>
    <tr>
      <th scope="col">アカウント情報</th>
      <th scope="col"></th>
    </tr>
  </thead>
  <tbody>
    <tr>
      <th scope="row">氏名</th>
      <td><s:property value="user.familyNameKanji" /> <s:property value="user.givenNameKanji" /></td>
    </tr>
    <tr>
      <th scope="row">住所</th>
      <td>〒<s:property value="user.postal" /> <s:property value="user.address" /></td>
    </tr>
    <tr>
      <th scope="row">email</th>
      <td><s:property value="user.email" /></td>
    </tr>
  </tbody>
</table>





<table class="type07">


  <thead>
    <tr>
      <th scope="col">購入履歴</th>
      <th scope="col"></th>
      <th scope="col"></th>
      <th scope="col"></th>
      <th scope="col"></th>
    </tr>
  </thead>
  <tbody>
    <s:iterator value="orderList">
      <tr>
        <th scope="row">商品画像</th>
        <th scope="row">商品名</th>
        <th scope="row">価格</th>
        <th scope="row">個数</th>
        <th scope="row">小計</th>
      </tr>
      <tr id="apple">
        <td><img class="shohin" src="<s:property value="imgPath"/>" height="180"></td>
        <td><s:property value="itemName" /></td>
        <td><s:property value="price" />円</td>
        <td><s:property value="quantity" />個</td>
        <td><s:property value="total" />円</td>
      </tr>
    </s:iterator>
  </tbody>
</table>
<p id="pageTop">
  <a href="#">page top</a>
</p>