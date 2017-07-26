<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
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
<fmt:setBundle basename="com.internousdev.tamaya.property.top" var="lang" />
<title><s:text name="lang.top.title"/></title>
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
			<h2><font color="white">花火の価格別と種類別</font></h2>
		<div class="main-category1">
			<table>
				<tr>
					<td>
						<div class="main-category-list1">
							<s:form action="GoItemListAction">
								<s:hidden name="priceRange" value="1" />
								<s:submit class="button" value="499円以下" />
							</s:form>
						</div>
					</td>
					<td>
						<div class="main-category-list2">
							<s:form action="GoItemListAction">
								<s:hidden name="priceRange" value="2" />
								<s:submit class="button" value="500円～999円"/>
							</s:form>
						</div>
					</td>
					<td>
						<div class="main-category-list3">
							<s:form action="GoItemListAction">
								<s:hidden name="priceRange" value="3" />
								<s:submit class="button" value="1000円～4999円"  />
							</s:form>
						</div>
					</td>
					<td>
						<div class="main-category-list4">
							<s:form action="GoItemListAction">
								<s:hidden name="priceRange" value="4" />
								<s:submit class="button" value="5000円以上" />
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
								<s:submit class="button" value="手持ち花火"/>
							</s:form>
						</div>
					</td>
					<td><div class="main-subcategory-list2">
							<s:form action="GoItemListAction">
								<s:hidden name="category" value="hunsyutu" />
								<s:submit class="button" value="噴出花火" />
							</s:form>
						</div></td>
					<td><div class="main-subcategory-list3">
							<s:form action="GoItemListAction">
								<s:hidden name="category" value="utiage" />
								<s:submit class="button" value="打上げ花火"/>
							</s:form>
						</div></td>
					<td><div class="main-subcategory-list4">
							<s:form action="GoItemListAction">
								<s:hidden name="category" value="sonota" />
								<s:submit class="button" value="その他花火"/>
							</s:form>
						</div></td>
				</tr>
			</table>
		</div>
	</div>

	<div class="main3">
		<div class="title-ranking">
			<h2><font color="white">花火の売り上げランキングトップ3</font></h2>
		</div>

		<table>

			<tr>
				<td><div class="ranking-main">
					<h3 style="color:red;">1位 メガトンバッグ</h3>
					<br>
					<a href="GoItemListAction"><img src="img/megaton_bag.jpg" width=150 alt="画像の説明文"></a></div></td>
				<td><div class="ranking-secondary">
					<h3 style="color:red;">2位 大和魂</h3>
					<br>
					<a href="GoItemListAction"><img src="img/yamato_damashi.jpg" width=150 alt="画像の説明文"></a></div></td>

				<td><div class="ranking-tertiary">
					<h3 style="color:red;">3位 パワフル三変化</h3>
					<br>
					<a href="GoItemListAction"><img src="img/powerful_sanhenge.jpg" width=150 alt="画像の説明文"></a></div></td>
			</tr>
		</table>
	</div>
	<div class="main4">
		<div class="title-special">

			<a href="./tokusyu.jsp">花火特集ページ</a>

		</div>


	</div>

</body>
</html>


















<%-- <div class="container">
	<div class="dbox1">
		<div class="h1title1"></div>
		<div class="pbox1"></div>
	</div>
</div>

<div id="header"></div>
<div class="container">
	<div class=photo-show>
		<img src="img/hanabi2.jpg" class="aaa" alt="手持ち花火"> <img
			src="img/hanabi3.jpg" class="bbb" alt="手持ち花火"> <img
			src="img/hanabi4.jpg" class="ccc" alt="手持ち花火"> <img
			src="img/hanabi5.jpg" class="aaa1" alt="手持ち花火"> <img
			src="img/hanabi6.jpg" class="aaa2" alt="手持ち花火"> <img
			src="img/hanabi7.jpg" class="aaa3" alt="手持ち花火"> <img
			src="img/hanabi8.jpg" class="aaa4" alt="手持ち花火"> <img
			src="img/hanabi9.jpg" class="aaa5" alt="手持ち花火"> <img
			src="img/hanabi10.jpg" class="aaa6" alt="手持ち花火"> <img
			src="img/hanabi11.jpg" class="aaa7" alt="手持ち花火">
	</div>
	<div class=syurui></div>

	<div class=kakaku>
		<div class=hbox2>
			<h2>花火の価格別と種類別</h2>
			<div class=box2>
				<s:form action="GoItemListAction">
					<s:hidden name="priceRange" value="1" />
					<s:submit class="button1" value="499円以下" />
				</s:form>
				<s:form action="GoItemListAction">
					<s:hidden name="priceRange" value="2" />
					<s:submit class="button1" value="500円～999円" />
				</s:form>
				<s:form action="GoItemListAction">
					<s:hidden name="priceRange" value="3" />
					<s:submit class="button1" value="1000円～4999円" />
				</s:form>
				<s:form action="GoItemListAction">
					<s:hidden name="priceRange" value="4" />
					<s:submit class="button1" value="5000円以上" />
				</s:form>
			</div>
		</div>
		<div class=box2>
			<s:form action="GoItemListAction">
				<s:hidden name="category" value="'temoti'" />
				<s:submit class="button1" value="手持ち花火" />
			</s:form>
			<s:form action="GoItemListAction">
				<s:hidden name="category" value="'hunsyutu'" />
				<s:submit class="button1" value="噴出花火" />
			</s:form>
			<s:form action="GoItemListAction">
				<s:hidden name="category" value="'utiage'" />
				<s:submit class="button1" value="打上げ花火" />
			</s:form>
			<s:form action="GoItemListAction">
				<s:hidden name="category" value="'sonota'" />
				<s:submit class="button1" value="その他花火" />
			</s:form>
		</div>
	</div>
	<div class=ranking>
		<div class=h3>
			<h2>花火の売り上げランキングトップ3</h2>
		</div>
		<div class=box3>

			<div class="item_list">
				<s:iterator status="i" begin="1" end="3">
					<div class="item">
						<s:form action="GoItemDetailAction" target="item_detail">
							<s:hidden name="itemId" value="%{itemList.get(#i.index).itemId}" />
							<s:submit class="img_path" type="image"
								src="%{itemList.get(#i.index).imgPath}" data-toggle="modal"
								data-target="#item_detail_modal" />
						</s:form>
						<table>
							<tr>
								<td>商品名</td>
								<td><s:property value="itemList.get(#i.index).itemName" /></td>
							</tr>
							<tr>
								<td>値段</td>
								<td><s:property value="itemList.get(#i.index).priceWithTax" />円（税込）</td>
							</tr>
						</table>
					</div>
				</s:iterator>
			</div>
		</div>
	</div>
	<div class=tokusyu>
		<div class=hbox4>
			<h2>花火特集</h2>
			<a href="./tokusyu.jsp"><img src="img/hanabi2.jpg" alt="花火特集"></a>
					href="./tokusyu.jsp">花火特集</a>
		</div>
		<div class="pbox5">
			<table>
				<tr>
					<td><a href="./tokusyu.jsp">家族特集</a></td>
					<td><a href="./tokusyu.jsp">カップル特集</a></td>
					<td><a href="./tokusyu.jsp">大人数特集</a></td>
				</tr>
				<tr>
					<td><a href="./tokusyu.jsp"><img src="img/hanabi2.jpg"
							alt="家族特集"></a></td>
					<td><a href="./tokusyu.jsp"><img src="img/hanabi2.jpg"
							alt="カップル特集"></a></td>
					<td><a href="./tokusyu.jsp"><img src="img/hanabi2.jpg"
							alt="大人数特集"></a></td>
				</tr>
			</table>
		</div>
	</div>
	<a href="./kanri_login.jsp">管理者ログイン</a>
	<br>
	<br>

</body>
</html>

		</div>
	</div>
</div>
<a href="./Kanri_login.jsp">管理者ログイン</a>
<br>
<br> --%>