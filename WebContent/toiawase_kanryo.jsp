<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
 <%@ taglib prefix="s" uri="/struts-tags" %>
 <%--国際化用 --%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
  <head>
    <meta charset="utf-8">
    <%--国際化用 --%>
<fmt:setLocale value="${pageContext.request.locale.language}" />
<fmt:setBundle
	basename="com.internousdev.tamaya.property.toiawase_kanryo" var="lang" />
    <title>問い合わせ完了画面</title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link href="css/bootstrap.min.css" rel="stylesheet">
    <script src="js/jquery-3.2.1.min.js"></script>


 <meta http-equiv="refresh" content="2;URL=./top.jsp">
</head>
<body>
<!-- ▼▼ヘッダーのjspファイルを読み込む -->
  <s:include value="header.jsp" />
<br>
<br>
<div style="text-align: center">
<h1><s:text name="lang.toiawase_kanryo.h1" /></h1>
<br>
<p><s:text name="lang.toiawase_kanryo.p" /></p>
</div>
</body>
</html>