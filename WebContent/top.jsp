<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
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
<fmt:setBundle basename="com.internousdev.tamaya.property.top"
	var="lang" />
<title><s:text name="lang.top.title" /></title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<!-- Stylesheet
    ================================================== -->
<link rel="stylesheet" href="css/reset.css">
<link rel="stylesheet" type="text/css" href="slick.css" media="screen" />
<link rel="stylesheet" type="text/css" href="slick-theme.css"
	media="screen" />
<link rel="stylesheet" href="css/bootstrap.min.css">
<link href="css/top.css" rel="stylesheet" type="text/css">
<link rel="stylesheet" href="css/style.css">
<script src="slick.min.js"></script>
<!-- Javascripts
    ================================================== -->
<script src="js/jquery-3.2.1.min.js"></script>
<script src="js/bootstrap.min.js"></script>
</head>
<body>

	<!-- ▼▼ログイン判定し、それに応じたヘッダーのjspファイルを読み込む -->
	<s:if test="#session.userId != null && #session.userId > 0 ">
		<s:include value="login_header.jsp" />
	</s:if>
	<s:else>
		<s:include value="header.jsp" />
	</s:else>
	<!-- ▼▼モーダル画面のjspファイルを読み込む -->
	<s:include value="modal.jsp" />

	<div class="main_img"></div>
	<div class="main1">
		<h2>
			<font color="white"><s:text name="lang.top.main1_h2" /></font>
		</h2>
		<div class="main-category1">
			<table>
				<tr>
					<td>
						<div class="main-category-list1">
							<s:form action="GoItemListAction">
								<s:hidden name="priceRange" value="1" />
								<s:submit class="button"
									value="499" />
							</s:form>
						</div>
					</td>
					<td>
						<div class="main-category-list2">
							<s:form action="GoItemListAction">
								<s:hidden name="priceRange" value="2" />
								<s:submit class="button"
									value="500～999円" />
							</s:form>
						</div>
					</td>
					<td>
						<div class="main-category-list3">
							<s:form action="GoItemListAction">
								<s:hidden name="priceRange" value="3" />
								<s:submit class="button"
									value="1000円～4999円" />
							</s:form>
						</div>
					</td>
					<td>
						<div class="main-category-list4">
							<s:form action="GoItemListAction">
								<s:hidden name="priceRange" value="4" />
								<s:submit class="button"
									value="5000円以上" />
							</s:form>
						</div>
					</td>
				</tr>
			</table>
		</div>
	</div>

	<div class="main2">
		<div class="main-category2">
			<table>
				<tr>
					<td>
						<div class="main-subcategory-list1">
							<s:form action="GoItemListAction">
								<s:hidden name="category" value="temoti" />
								<s:submit class="button"
									value="手持ち花火" />
							</s:form>
						</div>
					</td>
					<td><div class="main-subcategory-list2">
							<s:form action="GoItemListAction">
								<s:hidden name="category" value="hunsyutu" />
								<s:submit class="button"
									value="噴出花火" />
							</s:form>
						</div></td>
					<td><div class="main-subcategory-list3">
							<s:form action="GoItemListAction">
								<s:hidden name="category" value="utiage" />
								<s:submit class="button"
									value="打上げ花火" />
							</s:form>
						</div></td>
					<td><div class="main-subcategory-list4">
							<s:form action="GoItemListAction">
								<s:hidden name="category" value="sonota" />
								<s:submit class="button"
									value="その他花火" />
							</s:form>
						</div></td>
				</tr>
			</table>
		</div>
	</div>

	<div class="main3">
		<div class="title-ranking">
			<h2>
				<font color="white"><s:text name="lang.top.title-ranking" /></font>
			</h2>
		</div>

		<table>

			<tr>
				<td><div class="ranking-main">
						<h3 style="color: red;">
							<s:text name="lang.top.first-place" />
						</h3>
						<br> <a href="GoItemListAction"><img
							src="img/megaton_bag.jpg" width=150 alt="画像の説明文"></a>
					</div></td>
				<td><div class="ranking-secondary">
						<h3 style="color: red;">
							<s:text name="lang.top.second-place" />
						</h3>
						<br> <a href="GoItemListAction"><img
							src="img/yamato_damashi.jpg" width=150 alt="画像の説明文"></a>
					</div></td>

				<td><div class="ranking-tertiary">
						<h3 style="color: red;">
							<s:text name="lang.top.third-place" />
						</h3>
						<br> <a href="GoItemListAction"><img
							src="img/powerful_sanhenge.jpg" width=150 alt="画像の説明文"></a>
					</div></td>
			</tr>
		</table>
	</div>
	<div class="main4">
		<div class="title-special">

			<a href="./tokusyu.jsp"><s:text
					name="lang.top.special-collection" /></a>

		</div>


	</div>

</body>
</html>

















<%--
<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
国際化用
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
国際化用
<fmt:setLocale value="${pageContext.request.locale.language}" />
<fmt:setBundle basename="com.internousdev.tamaya.property.top"
	var="lang" />
<title><s:text name="lang.top.title" /></title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<!-- Stylesheet
    ================================================== -->
<link rel="stylesheet" href="css/reset.css">
<link rel="stylesheet" type="text/css" href="slick.css" media="screen" />
<link rel="stylesheet" type="text/css" href="slick-theme.css"
	media="screen" />
<link rel="stylesheet" href="css/bootstrap.min.css">
<link href="css/top.css" rel="stylesheet" type="text/css">
<link rel="stylesheet" href="css/style.css">
<script src="slick.min.js"></script>
<!-- Javascripts
    ================================================== -->
<script src="js/jquery-3.2.1.min.js"></script>
<script src="js/bootstrap.min.js"></script>
</head>
<body>

	<!-- ▼▼ログイン判定し、それに応じたヘッダーのjspファイルを読み込む -->
	<s:if test="#session.userId != null && #session.userId > 0 ">
		<s:include value="login_header.jsp" />
	</s:if>
	<s:else>
		<s:include value="header.jsp" />
	</s:else>
	<!-- ▼▼モーダル画面のjspファイルを読み込む -->
	<s:include value="modal.jsp" />

	<div class="main_img"></div>
	<div class="main1">
		<h2>
			<font color="white"><s:text name="lang.top.main1_h2" /></font>
		</h2>
		<div class="main-category1">
			<table>
				<tr>
					<td>
						<div class="main-category-list1">
							<s:form action="GoItemListAction">
								<s:hidden name="priceRange" value="1" />
								<s:submit class="button"
									value="<s:text name="lang.top.category-price1"/>" />
							</s:form>
						</div>
					</td>
					<td>
						<div class="main-category-list2">
							<s:form action="GoItemListAction">
								<s:hidden name="priceRange" value="2" />
								<s:submit class="button"
									value="<s:text name="lang.top.category-price2"/>" />
							</s:form>
						</div>
					</td>
					<td>
						<div class="main-category-list3">
							<s:form action="GoItemListAction">
								<s:hidden name="priceRange" value="3" />
								<s:submit class="button"
									value="<s:text name="lang.top.category-price3"/>" />
							</s:form>
						</div>
					</td>
					<td>
						<div class="main-category-list4">
							<s:form action="GoItemListAction">
								<s:hidden name="priceRange" value="4" />
								<s:submit class="button"
									value="<s:text name="lang.top.category-price4"/>" />
							</s:form>
						</div>
					</td>
				</tr>
			</table>
		</div>
	</div>

	<div class="main2">
		<div class="main-category2">
			<table>
				<tr>
					<td>
						<div class="main-subcategory-list1">
							<s:form action="GoItemListAction">
								<s:hidden name="category" value="temoti" />
								<s:submit class="button"
									value="<s:text name="lang.top.subcategory-temoti"/>" />
							</s:form>
						</div>
					</td>
					<td><div class="main-subcategory-list2">
							<s:form action="GoItemListAction">
								<s:hidden name="category" value="hunsyutu" />
								<s:submit class="button"
									value="<s:text name="lang.top.hunsyutu"/>" />
							</s:form>
						</div></td>
					<td><div class="main-subcategory-list3">
							<s:form action="GoItemListAction">
								<s:hidden name="category" value="utiage" />
								<s:submit class="button"
									value="<s:text name="lang.top.utiage"/>" />
							</s:form>
						</div></td>
					<td><div class="main-subcategory-list4">
							<s:form action="GoItemListAction">
								<s:hidden name="category" value="sonota" />
								<s:submit class="button"
									value="<s:text name="lang.top.sonota"/>" />
							</s:form>
						</div></td>
				</tr>
			</table>
		</div>
	</div>

	<div class="main3">
		<div class="title-ranking">
			<h2>
				<font color="white"><s:text name="lang.top.title-ranking" /></font>
			</h2>
		</div>

		<table>

			<tr>
				<td><div class="ranking-main">
						<h3 style="color: red;">
							<s:text name="lang.top.first-place" />
						</h3>
						<br> <a href="GoItemListAction"><img
							src="img/megaton_bag.jpg" width=150 alt="画像の説明文"></a>
					</div></td>
				<td><div class="ranking-secondary">
						<h3 style="color: red;">
							<s:text name="lang.top.second-place" />
						</h3>
						<br> <a href="GoItemListAction"><img
							src="img/yamato_damashi.jpg" width=150 alt="画像の説明文"></a>
					</div></td>

				<td><div class="ranking-tertiary">
						<h3 style="color: red;">
							<s:text name="lang.top.third-place" />
						</h3>
						<br> <a href="GoItemListAction"><img
							src="img/powerful_sanhenge.jpg" width=150 alt="画像の説明文"></a>
					</div></td>
			</tr>
		</table>
	</div>
	<div class="main4">
		<div class="title-special">

			<a href="./tokusyu.jsp"><s:text
					name="lang.top.special-collection" /></a>

		</div>


	</div>

</body>
</html> --%>
