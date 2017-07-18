<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%--国際化用 --%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">

<%--国際化用 --%>
<fmt:setLocale value="${pageContext.request.locale.language}" />
<fmt:setBundle basename="com.internousdev.tamaya.property.kanri_kakunin"
	var="lang" />
<title><s:text name="lang.kanri_kakunin.title" /></title>

<%--検索エンジンによるインデックスを拒否 --%>
<meta name="ROBOTS" content="NOINDEX.NOFOLLOW">
<meta name="viewport" content="width=device initial-scale=1.0">
<link rel="stylesheet" href="css/AdminLogin.css">
<link rel="stylesheet" href="css/bootstrapTWBScolor.css">
<script src="js/to-top.js"></script>
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<script src="https://code.jquery.com/jquery-1.11.2.min.js"></script>
<link href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css"
	rel="stylesheet"
	　integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u"
	　crossorigin="anonymous">
</head>

<body>

	<!-- ヘッダー部分の挿入 -->
	<header>
		<s:include value="kanri_header.jsp" />
	</header>









</body>
</html>