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
<fmt:setBundle basename="com.internousdev.tamaya.property.kanri_rireki"
	var="lang" />
<title><s:text name="lang.kanri_rireki.title" /></title>

<%--検索エンジンによるインデックス拒否 --%>
<meta name="ROBOTS" content="NOINDEX.NOFOLLOW">
<meta name="viewport" content="width=device initial-scale=1.0">
<link rel="stylesheet" type="text/css" href="css/bootstrap.css">
<link rel="stylesheet" href="css/AdminLogin.css">
<link rel="stylesheet" href="css/bootstrapTWBScolor.css">
<script src="js/to-top.js"></script>
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<script src="https://code.jquery.com/jquery-1.11.2.min.js "></script>
<link
	　href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css"
	　rel="stylesheet"
	integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u"
	crossorigin="anonymous">
</head>

<body>
<!-- ヘッダー部分の挿入 -->
	<header>
		<s:include value="kanri_header.jsp" />
	</header>

	<div class="panel panel-default">
		<div class="panel-body">
			<h2><s:text name="lang.kanri_rireki.title" /></h2>
		</div>

		<p>
			<s:text name="lang.kanri_rireki.search" />
		</p>
		<s:form action="AdminHistoryAction">
			<input type="number" name="itemId" size="50" placeholder="itemId"
				min="0" max="100">
			<input type="submit" value="Search">
		</s:form>

		<table>
			<tr align="center">
				<th><s:text name="lang.kanri_rireki.itemId" /></th>
				<th><s:text name="lang.kanri_rireki.itemName" /></th>
				<th><s:text name="lang.kanri_rireki.purchaseId" /></th>
				<th><s:text name="lang.kanri_rireki.price" /></th>
				<th><s:text name="lang.kanri_rireki.quantities" /></th>
				<th><s:text name="lang.kanri_rireki.subtotal" /></th>
				<th><s:text name="lang.kanri_rireki.purchaseDate" /></th>
			</tr>


			<s:iterator value="adminHistoryList">
				<s:iterator>
					<tr class="bg-info">
						<td><s:property value="itemId" /></td>
						<td><s:property value="itemsName" /></td>
						<td><s:property value="purchaseId" /></td>
						<td>&yen;<fmt:formatNumber value="${price}" /></td>
						<td><s:property value="quantities" /></td>
						<td>&yen;<fmt:formatNumber value="${subtotal}" /></td>
						<td><s:property value="createdAt" /></td>
					</tr>
				</s:iterator>
			</s:iterator>
		</table>
		<div id="page-top" class="page-top">
			<p>
				<a id="move-page-top" class="move-page-top">▲</a>
			</p>
		</div>
		<div class="panel-footer">
			<s:text name="lang.kanri_rireki.footer" />
		</div>
	</div>
</body>
</html>