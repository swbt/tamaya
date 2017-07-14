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
<fmt:setBundle basename="com.internousdev.tamaya.property.kanri_tuika"
	var="lang" />
<title><s:text name="lang.kanri_tuika.title" /></title>

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
				<s:text name="lang.kanri_tuika.title" />
			</h2>
		</div>
		<div class="container">
			<div class="row">
				<div class="col-lg-offset-3">
					<div>
						<s:text name="lang.kanri_tuika.itemId" />
						<s:property value="newItemId" />
						<br>
						<br>
					</div>
					<s:form method="post" action="AdminAddAction" class="autoConfirm">


						<div class="form-group">
							<s:text name="lang.kanri_tuika.itemName" />
							<font color="red"><s:text name="lang.kanri_tuika.must" /></font><br>
							<input type="text" maxlength="50" name="itemName"
								class="form-control" required="required" />
						</div>

						<div class="form-group">
							<s:text name="lang.kanri_tuika.price" />
							<font color="red"><s:text name="lang.kanri_tuika.must" /></font><br>
							<input type="number" max="999999" min="1" name="price"
								class="form-control" required="required">
						</div>

						<div class="form-group">
							<s:text name="lang.kanri_tuika.stock" />
							<font color="gray"><s:text name="lang.kanri_tuika.default" /></font><br>
							<input type="number" max="999" min="0" name="stock"
								class="form-control">
						</div>

						<div>
							<s:text name="lang.kanri_tuika.sales" />
							<br>
							<br>
						</div>

						<div class="form-group">
							<s:text name="lang.kanri_tuika.itemDetail" />
							<br>
							<textarea name="itemDetail" class="form-control" rows="10"
								cols="60" maxlength="500" /></textarea>
						</div>

						<div class="form-group">
							<s:text name="lang.kanri_tuika.category" />
							<font color="red"><s:text name="lang.kanri_tuika.must" /></font><br>
							<select name="sort" class="form-control" required="required">
								<option value="1"><s:text
										name="lang.kanri_tuika.temoti" /></option>
								<option value="2"><s:text
										name="lang.kanri_tuika.utiage" /></option>
								<option value="3"><s:text
										name="lang.kanri_tuika.funsyutu" /></option>
								<option value="4"><s:text
										name="lang.kanri_tuika.others" /></option>
							</select>
						</div>

						<div class="form-group">
							<s:text name="lang.kanri_tuika.image" />
							<br> <input type="file" name="imgPath" size="60"
								multiple="multiple" />
						</div>
						<div>
							<input type="submit">
						</div>
						<br>
						<div>
							<input type="button"
								value="<s:text name = 'lang.kanri_tuika.toinput'/>"
								class="autoConfirmBack">
						</div>

					</s:form>
				</div>
			</div>
		</div>
		<div id="page-top" class="page-top">
			<p>
				<a id="move-page-top" class="move-page-top">▲</a>
			</p>
		</div>
		<div class="panel-footer">
			<s:text name="lang.kanri_tuika.footer" />
		</div>
	</div>

</body>
</html>
