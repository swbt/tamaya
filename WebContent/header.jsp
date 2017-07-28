<%@ page language="java" contentType="text/html;charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

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
<title>ログインヘッダー</title>
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<!-- Stylesheet
    ==================================================
    -->
<link rel="stylesheet" type="text/css" href="./css/header.css">
<!-- Javascripts
    ================================================== -->
<script src="js/jquery-3.2.1.min.js"></script>

</head>
<body>
	<div class="container">
			<img src="./img/tamaya22.png" class="header-img">
			<div class="box">
				<div class="sub-container">
					<s:form action="LoginAction" class="sform_01" style="color:white;">
						<s:textfield name="email" label="email"/>
						<s:password name="password" label="password" size="20"/>
						<s:submit value="ログイン" class="submit" />
					</s:form>
				</div>
				<div class="contents">
					<ul>
						<li><a href="toiawase.jsp" class="form">お問い合わせ</a></li>
						<li><a href="<s:url action="GoTopAction" class="top" />">トップ</a></li>
					</ul>
				</div>
			</div>

	</div>
</body>
</html>