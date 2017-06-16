
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
<fmt:setBundle basename="com.internousdev.tamaya.property.kanri_henko" var="lang" />
<title>商品変更<s:text name="lang.admin_update.title"/></title>

<%--検索エンジンによるインデックスを拒否 --%>
<meta name="ROBOTS" content="NOINDEX.NOFOLLOW">

<meta name="viewport" content="width=device">
<link rel="stylesheet" type="text/css"  href="css/bootstrap.css">
<link rel="stylesheet" href="css/AdminLogin.css">
<script src="//code.jquery.com/jquery-1.11.2.min.js"></script>
<link　href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css"　rel="stylesheet"
	integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u"
	crossorigin="anonymous">


<div class="kannri_header">
	<h1>管理者ページ</h1>
	<br>
	<ul class="nav nav-tabs">
		<li><a href="kanri_login.jsp">top</a></li>
		<li><a href="kanri_rireki.jsp">販売履歴</a></li>
		<li><a href="kanri_tuika.jsp">商品追加</a></li>
		<li><a href="kanri_sakujyo.jsp">商品削除</a></li>
		<li><a href="kanri_henko.jsp">商品変更</a></li>
		<li><a href="kanri_kakunin.jsp">問い合わせ確認</a></li>
		<li><a href="kanri_login.jsp">ログアウト</a></li>
	</ul>
</div>

<div class="panel panel-default ">
	<div class="panel-heading ">
		<h2 class="well well-lg">商品変更</h2>
	</div>
	<table class="example ">
		<thead>
			<tr>
				<th>商品ID</th>
				<th>カテゴリー</th>
				<th>商品画像</th>
				<th>商品名</th>
				<th>価格</th>
				<th>説明</th>
				<th>在庫数</th>
			</tr>
		</thead>


		<tbody>
			<tr>
				<td></td>
				<td></td>
				<td><a href=" " src=></td>
				<td></td>
				<td></td>
				<td></td>
				<td></td>

			</tr>
			<tr>
				<td></td>
				<td></td>
				<td><a href=" " src=></td>
				<td></td>
				<td></td>
				<td></td>
				<td></td>

			</tr>
			<tr>
				<td></td>
				<td></td>
				<td><a href=" " src=></td>
				<td></td>
				<td></td>
				<td></td>
				<td></td>

			</tr>
			<tr>
				<td></td>
				<td></td>
				<td><a href=" " src=></td>
				<td></td>
				<td></td>
				<td></td>
				<td></td>

			</tr>
		</tbody>

	</table>
</head>

</html>

