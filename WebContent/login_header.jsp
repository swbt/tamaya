<%@ page language="java" contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%--国際化用 --%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
  <head>
    <meta charset="utf-8">
    <meta name="viewport"
	content="width=device-width,user-scalable=no,maximum-scale=1" />
<link rel="stylesheet" media="all" type="text/css" href="style.css" />
<!-- ※デフォルトのスタイル（style.css） -->
<link rel="stylesheet" media="all" type="text/css" href="tablet.css" />
<!-- ※タブレット用のスタイル（tablet.css） -->
<link rel="stylesheet" media="all" type="text/css" href="smart.css" />
<!-- ※スマートフォン用のスタイル（smart.css） -->
    <title>ログイン後ヘッダー</title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <!-- Stylesheet
    ==================================================
    -->
    <link rel="stylesheet" type="text/css" href="./css/login_header.css">
    <!-- Javascripts
    ================================================== -->
    <script src="js/jquery-3.2.1.min.js"></script>





  </head>
  <body>
      <div class="container">
        <img src="./img/tamaya22.png" class="header-img">
    <div class="box">
		<ul>
			<li><a href="toiawase.jsp">お問い合わせ</a></li>
			<li><a href="<s:url action="LogoutAction"/>"><i class="button1" ></i> ログアウト</a></li>
			<li><a href="<s:url action="GoMyPageAction" />">マイページ</a></li>
			<li><a href="<s:url action="GoCartAction"/>">マイカート</a></li>
			<li><a href="<s:url action="GoTopAction" />">トップ</a></li>
		</ul>
		</div>
    </div>
  </body>
</html>