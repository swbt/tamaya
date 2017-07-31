
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!-- ここから国際化 -->
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!-- ここまで国際化 -->

<!DOCTYPE html>
<html lang="ja">
<head>
<!-- ここから国際化 -->
<fmt:setBundle basename="com.internousdev.legmina.property.paymentConfirm" var="lang" />
<!-- ここまで国際化 -->
<meta charset="utf-8">

<title>カート</title>

<meta name="viewport" content="width=device-width, initial-scale=1.0">


<link rel="stylesheet" type="text/css" href="./css/cart.css">
<link rel="stylesheet" type="text/css" href="css/btn.css">
<link rel="stylesheet" type="text/css" href="css/move.css">



<script src="js/jquery-3.2.1.min.js"></script>
<script src="js/move.js"></script>
<script>
	$(document).ready(function() {
		$('#top-menu').prmenu();
	});
</script>
</head>

<!-- メインページ -->
<body>

  <!-- ▼▼ヘッダーのjspファイルを読み込む -->
  <s:include value="header.jsp" />
  <br>
  <div class="container">
    <!-- 全体を囲むコンテナ -->


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
          <s:iterator value="cart.itemList">
            <!-- デザインが崩れてしまうため保留 -->
            <tr>
              <td><img class="img_item" src="<s:property value="imgPath"/>" width="200" height="180" align="center"></td>
              <td><s:property value="itemName" /></td>
              <td align="center">￥<fmt:formatNumber value="${price}" />（税込）
              </td>
              <td align="center"><s:property value="quantity" />個 <s:form action="UpdateCartAction">
                  <input type="number" name="quantity" max="<s:property value="stocks" />" style="width: 50px;">
                  <s:hidden name="itemId" value="%{itemId}" />
                  <button type="submit" class="btn btn-default">変更</button>
                  残り<s:property value="stocks" />点
                </s:form></td>



              <td align="center">￥ <s:property value="total" />（税込）
              </td>
              <td align="center"><s:form action="RemoveFromCartAction">
                  <s:hidden name="itemId" value="%{itemId}" />
                  <button type="submit" class="btn btn-default">削除</button>
                </s:form></td>
            </tr>
          </s:iterator>

        </tbody>

        <tfoot>
          <tr>
            <td class="td_01" colspan="2">送料（国内）</td>
            <td align="center" colspan="4">￥ <s:property value="cart.shippingCost" />（税込）</td>
          </tr>

          <tr>
            <td class="td_02" colspan="2">合計(個数)（税込）</td>
            <td align="center"><s:property value="cart.totalQuantity" />個</td>

            <td align="center" colspan="3">￥ <s:property value="cart.grandTotal" />（税込）
            </td>
          </tr>
        </tfoot>
      </table>


      <div class="button1">
        <ul>
          <li>
            <div class="button2">
              <a href="siharai.jsp">支払い入力画面へ</a>
            </div>
          </li>
        </ul>
      </div>

    </div>
  </div>
  <p id="pageTop">
    <a href="#">page top</a>
  </p>
</body>
</html>


