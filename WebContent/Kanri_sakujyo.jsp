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
<fmt:setBundle basename="com.internousdev.tamaya.property.kanri_sakujyo"
	var="lang" />
<title><s:text name="lang.kanri_sakujyo.title" /></title>

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
	<header>
		<s:include value="kanri_header.jsp" />
	</header>
	<div class="panel panel-default">
		<div class="panel-body">
			<h2>
				<s:text name="lang.kanri_sakujyo.title" />
			</h2>
		</div>

		<s:iterator value="itemList">

			<div class="container">
				<div class="row">
					<div class="col-lg-offset-3">

						<div style="border: solid; border-radius: 5px; margin: 5px; padding: 5px;">
							<div class="form-group">
								<s:text name="lang.kanri_sakujyo.itemId" />
								<s:property value="itemId" />
							</div>

							<div class="form-group">
								<s:text name="lang.kanri_sakujyo.itemName" />
								<s:property value="itemList[0].itemName" />
							</div>

							<div class="form-group">
								<s:text name="lang.kanri_sakujyo.price" />
								<fmt:formatNumber value="${price}" pattern="###,###,###" />
							</div>

							<div class="form-group">
								<s:text name="lang.kanri_sakujyo.stocks" />
								<s:property value="itemList[0].stocks" />
							</div>

							<div class="form-group">
								<s:text name="lang.kanri_sakujyo.sales" />
								<s:property value="itemList[0].sales" />
							</div>

							<div class="form-group">
								<s:text name="lang.kanri_sakujyo.itemDetail" />
								<s:property value="itemList[0].itemDetail" />
							</div>

							<div class="form-group">
								<s:text name="lang.kanri_sakujyo.category" />
								<s:property value="itemList[0].sortId" />
								,
								<s:property value="itemList[0].itemGenre" />
							</div>

							<div class="form-group">
								<s:text name="lang.kanri_sakujyo.image" />
								<s:property value="itemList[0].imgPath" />
								<img src="<s:property value="itemList[0].imgPath"/>" height="50" width="50">
							</div>
						</div>
						<h4>
							<s:text name="lang.kanri_sakujyo.keyon" />
						</h4>
						<s:form action="AdminDeleteAction">
							<s:hidden name="itemId"></s:hidden>
							<s:hidden name="delete" value="1" />
							<s:submit value="Yes" name="submit" />
						</s:form>
						<br>
						<s:form action="AdminDeleteAction">
							<s:hidden name="delete" value="0" />
							<s:submit value="No  " name="submit" />
						</s:form>
					</div>
				</div>
			</div>
		</s:iterator>

		<div id="page-top" class="page-top">
			<p>
				<a id="move-page-top" class="move-page-top">▲</a>
			</p>
		</div>
		<div class="panel-footer">
			<s:text name="lang.kanri_sakujyo.footer" />
		</div>
	</div>

</body>

</html>