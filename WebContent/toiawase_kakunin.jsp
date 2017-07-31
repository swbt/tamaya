<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
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
	basename="com.internousdev.tamaya.property.toiawase_kakunin" var="lang" />
<title><s:text name="lang.toiawase_kakunin.title" /></title>
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<script type="text/javascript">
	js / toiawase.js
</script>
<link href="css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
<!-- ▼▼ヘッダーのjspファイルを読み込む -->
  <s:include value="header.jsp" />
	<s:form method="post" action="ContactAction" class="autoConfirm">
		<div style="text-align: center">
			<h1 class="contact-title.h1"></h1>
			<p>
				<s:text name="lang.toiawase_kakunin.p" />
				<br>
				<s:text name="lang.toiawase_kakunin.br" />
			</p>
			<br>
			<br>
		</div>
		<div class="container">


			<div style="text-align: center">
				<div class="row">
					<div class="col-sm-2">
						<s:text name="lang.toiawase_kakunin.name" />
					</div>
					<div class="col-sm-10 form-inline" style="padding: 10px;">
						<s:property value='#session.userName' />
					</div>
				</div>
				<div class="row">
					<div class="col-sm-2">
						<s:text name="lang.toiawase_kakunin.phone" />
					</div>
					<div class="col-sm-10 form-inline" style="padding: 10px;">
						<s:property value='#session.phoneNumber' />
					</div>
				</div>
				<div class="row">
					<div class="col-sm-2">
						<s:text name="lang.toiawase_kakunin.Email" />
					</div>
					<div class="col-sm-10 form-inline" style="padding: 10px;">
						<s:property value='#session.email' />
					</div>
				</div>
				<div class="row">
					<div class="col-sm-2">
						<s:text name="lang.toiawase_kakunin.form" />
					</div>
					<div class="col-sm-10" style="padding: 10px;">
						<s:property value='#session.comment' />
					</div>
				</div>
			</div>
		</div>


	</s:form>

	<div style="text-align: center">
		<br> <br> <br>
		<s:form action="BackContactAction">
			<input type="submit" class="btn btn-default" value="　送信内容編集　">
		</s:form>
		<br> <br>
		<s:form action="ContactAction">
			<input type="submit" class="btn btn-default" value="お問い合わせ完了">
		</s:form>
	</div>

</body>
<script type="text/javascript" src="js/main.js"></script>
<script type="text/javascript"></script>


</html>