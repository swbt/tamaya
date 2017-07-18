<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
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
<fmt:setBundle basename="com.internousdev.tamaya.property.kanri_header" var="lang" />

<title><s:text name="lang.kanri_header.title"/></title>

<%--検索エンジンによるインデックス拒否 --%>
<meta name="ROBOTS" content="NOINDEX.NOFOLLOW">
<meta name="viewport" content="width=device initial-scale=1.0">
<link rel="stylesheet" href="css/AdminLogin.css">
<link rel="stylesheet" href="css/bootstrapTWBScolor.css">
<script src="https://code.jquery.com/jquery-1.11.2.min.js"></script>
<link
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u"
	crossorigin="anonymous">
</head>
<header>

	<nav class="navbar navbar-default navbar-fixed-top">
		<div class="container-fluid">
			<div class="navbar-header">
				<button type="button" class="navbar-toggle collapsed"
					data-toggle="collapse" data-target="#navbarEexample5">
					<span class="sr-only">Toggle navigation</span> <span
						class="icon-bar"></span> <span class="icon-bar"></span> <span
						class="icon-bar"></span>
				</button>
				<a class="navbar-brand"><s:text name="lang.kanri_header.title"/></a>
			</div>

			<div class="collapse navbar-collapse" id="navbarEexample5">
				<ul class="nav navbar-nav">
					<li><a href="#"></a></li>
					<li><a href="#"></a></li>
					<li><a href="kanri_login.jsp"><s:text name="TOP"/></a></li>
					<li><a href="kanri_rireki.jsp"><s:text name="PURCHASE HISTORY"/></a></li>
					<li><a href="kanri_tuika.jsp"><s:text name="ADDITEMS"/></a></li>
					<li><a href="kanri_sakujyo.jsp"><s:text name="DELETEITEMS"/></a></li>
					<li><a href="kanri_henko.jsp"><s:text name=""/></a></li>
					<li><a href="<s:url action="AdminLogoutAction"/>"><s:text name="lang.kanri_header.logout"/></a></li>
				</ul>
				<p class="navbar-text"><s:text name="lang.kanri_header.welcome"/></p>
			</div>
		</div>
	</nav>
</header>
</html>
