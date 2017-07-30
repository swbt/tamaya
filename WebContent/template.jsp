<%@ page language="java" contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!-- ▼▼国際化 -->
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<!-- ▼▼国際化 -->
<fmt:setLocale value="${pageContext.request.locale.language}" />
<fmt:setBundle basename="com.internousdev.tamaya.property.★★プロパティファイル名に書き換える★★" var="lang" />
<meta charset="utf-8">
<!-- ▼▼拡大縮小を禁止する -->
<meta name="viewport" content="width=device-width,initial-scale=1.0,minimum-scale=1.0,maximum-scale=1.0,user-scalable=0">
<title>★★ここにタイトルを入れる★★</title>
<!-- ▼▼StyleSheet -->
<link rel="stylesheet" href="css/normalize.css">
<link rel="stylesheet" href="css/bootstrap.min.css">
<link rel="stylesheet" href="css/style.css" />
<!-- ▼▼JavaScript -->
<script src="js/jquery-3.2.1.min.js"></script>
<script src="js/bootstrap.min.js"></script>
</head>
<body>
  <div class="container">
  </div><!-- .container -->
</body>
</html>