
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!-- ここから国際化 -->
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!-- ここまで国際化 -->

<!DOCTYPE html>
<html lang="ja">
<head>
<!-- ここから国際化 -->
<fmt:setBundle
	basename="com.internousdev.legmina.property.paymentConfirm" var="lang" />
<!-- ここまで国際化 -->
<meta charset="utf-8">

<title>カート</title>

<meta name="viewport" content="width=device-width, initial-scale=1.0">


<link rel="stylesheet" type="text/css" href="./css/cart.css">
<link rel="stylesheet" type="text/css" href="css/btn.css">


<script src="js/jquery-3.2.1.min.js"></script>
<script>
        $(document).ready(function(){
   			 $('#top-menu').prmenu();
        });
	</script>
</head>

<!-- メインページ -->
<body>

	<!--     ログインヘッダー読み込む -->
	<s:include value="login_header.jsp" />
	<div id="header"></div>
	<br>
	<div class="container">        <!-- 全体を囲むコンテナ -->


	<img src="img/cart_shohin.png" alt="カートに入っている商品">

	<div class="container">

	<table align="center">
		<thead>


			<tr>
				<th>商品画像</th>
				<th>商品名</th>
				<th>価格</th>
				<th width="180">個数</th>
				<th>小計</th>
				<th>削除</th>
			</tr>
		</thead>

		<tbody>
			<s:iterator value="cartList">
				<!-- デザインが崩れてしまうため保留 -->
				<tr>
					<td><img class="shohin" src="<s:property value="imgPath"/>"
						width="200" height="180"
						align="center"></td>
					<td><s:property value="itemName" /></td>
					<td align="center">￥<fmt:formatNumber value="${price}" />（税込）
					</td>
					<td align="center"><s:property value="quantity" />個

					<s:form action="CartUpdateAction">
					<select name="orderCount">
							<option value="<s:property value="orderCount"/>" selected><s:property
									value="orderCount" /></option>
							<option value="1">1</option>
							<option value="2">2</option>
							<option value="3">3</option>
							<option value="4">4</option>
							<option value="5">5</option>
							<option value="6">6</option>
							<option value="7">7</option>
							<option value="8">8</option>
							<option value="9">9</option>
							<option value="10">10</option>
					</select>

					<%-- <s:hidden name="orderCount" value="%{orderCount}" /> --%>  <!-- ←※不要！！！あえて残しとく -->
					<s:hidden name="userId" value="%{userId}" />
					<s:hidden name="itemId" value="%{itemId}" />
					<%-- <s:hidden name="quantity" value="%{quantity}" /> --%>
					<button type="submit" class="btn btn-default">変更</button>
					</s:form>
					</td>



					<td align="center">￥ <s:property value="%{price * quantity}" />(税込)</td>
					<td align="center"><s:form action="CartDeleteAction">
							<s:hidden name="userId" value="%{userId}" />
							<s:hidden name="itemId" value="%{itemId}" />
							<button type="submit" class="btn btn-default">削除</button>
						</s:form></td>
				</tr>
			</s:iterator>

		</tbody>

		<tfoot>
			<tr>
				<td class="souryo" colspan="2">送料（国内）</td>
				<td align="center" colspan="4">無料</td>
			</tr>

			<tr>
				<td class="gokei" colspan="2">合計(個数)（税込）</td>
				<td align="center"><s:property value="kosu" />個</td>

				<td align="center" colspan="3">￥<s:property value="total" />(税込)</td>
			</tr>
		</tfoot>
	</table>


	<div class="button1">
		<ul>
		<li>
		<div class="button2"><a href="siharai.jsp">支払い入力画面へ</a></div></li>
		<li>
		<div class="button3"><a href="<s:url action="GoTopAction" />">トップ画面へ</a></div>
		</li>
		</ul>
	</div>

	</div>
	</div>
</body>
</html>


