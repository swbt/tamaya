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
<fmt:setBundle basename="com.internousdev.tamaya.property.kanri_henko"
	var="lang" />
<title><s:text name="lang.kanri_henko.title" /></title>

<%--検索エンジンによるインデックスを拒否 --%>
<meta name="ROBOTS" content="NOINDEX.NOFOLLOW">
<meta name="viewport" content="width=device initial-scale=1.0">
<link rel="stylesheet" href="css/AdminLogin.css">
<link rel="stylesheet" href="css/bootstrapTWBScolor.css">
<script src="js/to-top.js"></script>
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<script src="https://code.jquery.com/jquery-1.11.2.min.js"></script>
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
			<h2>
				<s:text name="lang.kanri_henko.title" />
			</h2>
		</div>

		<s:iterator value="itemList">
			<div class="container">
				<div class="row">
					<div class="col-lg-offset-3">
						<div>
							<s:text name="lang.kanri_henko.itemId" />
							<s:property value="itemId" />
							<br>
							<br>
						</div>
						<s:form method="post" action="AdminUpdateAction"
							class="autoConfirm">

							<s:hidden name="itemId"></s:hidden>
							<div class="form-group">
								<s:text name="lang.kanri_henko.itemName" />
								<font color="red"><s:text
										name="lang.kanri_henko.required" /></font><br> <input
									type="text" maxlength="50" name="itemName"
									class="form-control"
									value="<s:property value="itemList[0].itemName"/>"
									required="required">
							</div>

							<div class="form-group">
								<s:text name="lang.kanri_henko.price" />
								<font color="red"><s:text
										name="lang.kanri_henko.required" /></font><br> <input
									type="number" max="9999999" min="1" name="price"
									class="form-control"
									value="<fmt:formatNumber value="${price}" pattern="#########"/>"
									required="required">
							</div>

							<div class="form-group">
								<s:text name="lang.admin_update.stock" />
								<br> <input type="number" max="999" min="0" name="stock"
									class="form-control"
									value="<s:property value="itemList[0].stocks"/>">
							</div>

							<div class="form-group">
								<s:text name="lang.kanri_henko.sales" />
								<br> <input type="number" max="999" min="0" name="sales"
									class="form-control"
									value="<s:property value="itemList[0].sales"/>">
							</div>

							<div class="form-group">
								<s:text name="lang.kanri_henko.detail" />
								<br>
								<textarea name="itemDetail" class="form-control" rows="10"
									cols="60" maxlength="500"><s:property
										value="itemList[0].itemDetail" /></textarea>
							</div>

							<div class="form-group">
								<s:text name="lang.kanri_henko.category" />
								<br> <select name="sort" class="form-control"
									required="required" id="select_sort">
									<s:if test="i=2"></s:if>
									<s:if test="itemList[0].sortId == 1">
										<option value="1" selected><s:text
												name="lang.kanri_henko.temoti" /></option>
									</s:if>
									<s:if test="itemList[0].sortId == 2">
										<option value="2" selected><s:text
												name="lang.kanri_henko.utiage" /></option>
									</s:if>
									<s:if test="itemList[0].sortId == 3">
										<option value="3" selected><s:text
												name="lang.kanri_henko.funsyutu" /></option>
									</s:if>
									<s:if test="itemList[0].sortId == 4">
										<option value="4" selected><s:text
												name="lang.kanri_henko.others" /></option>
									</s:if>

									<s:if test="itemList[0].sortId != 1">
										<option value="1"><s:text
												name="lang.kanri_henko.temoti" /></option>
									</s:if>
									<s:if test="itemList[0].sortId != 2">
										<option value="2"><s:text
												name="lang.kanri_henko.utiage" /></option>
									</s:if>
									<s:if test="itemList[0].sortId != 3">
										<option value="3"><s:text
												name="lang.kanri_henko.funsyutu" /></option>
									</s:if>
									<s:if test="itemList[0].sortId != 4">
										<option value="4"><s:text
												name="lang.kanri_henko.others" /></option>
									</s:if>

								</select>
							</div>

							<div class="form-group">
								<s:text name="lang.kanri_henko.image" />
								<s:property value="itemList[0].imgPath" />
								→<br> <select name="imgDel" class="form-control"
									required="required" size="3" id="select_sort">
									<option value="1" selected><s:text
											name="lang.kanri_henko.no" /></option>
									<option value="2"><s:text
											name="lang.kanri_henko.change" /></option>
									<option value="3"><s:text
											name="lang.kanri_henko.erase" /></option>
								</select> <input type="file" name="imgPath" size="60" multiple="multiple" />

							</div>

							<div>
								<input type="submit">
							</div>
							<br>
							<div>
								<input type="button"
									value="<s:text name = 'lang.kanri_henko.return'/>">
							</div>

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
			<s:text name="lang.kanri_henko.footer" />
		</div>
	</div>
</body>
</html>

