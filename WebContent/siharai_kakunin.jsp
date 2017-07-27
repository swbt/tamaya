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

<title>支払い確認画面</title>

<meta name="viewport" content="width=device-width, initial-scale=1.0">
<!-- Stylesheet
    ================================================== -->
<link rel="stylesheet" type="text/css" href="css/siharai.css">

<!-- Javascripts
    ================================================== -->
<script src="js/jquery-3.2.1.min.js"></script>
<script>
	$(document).ready(function() {
		$('#top-menu').prmenu();
	});
</script>
</head>

<!-- メインページ -->
<body>
  <div id="header"></div>
  <br>

  <img src="img/siharai_kakunin.png" alt="お支払い確認">

  <div class="center">
    <table>
      <thead>
        <tr>
          <th>商品名</th>
          <th>価格</th>
          <th>個数</th>
          <th>小計</th>
        </tr>
      </thead>

      <tbody>
        <s:iterator value="cart">
          <tr>
            <td><img src="<s:property value="imgPath"/>" <s:property value="itemName" /> align="center"></td>
            <td align="center">￥<fmt:formatNumber value="${price}" />（税込）
            </td>
            <td align="center"><s:property value="orderCount" /></td>
            <!-- orderCount新設の必要あり？ -->
            <td align="center">￥<fmt:formatNumber value="${subTotal}" /></td>
          </tr>
        </s:iterator>
      </tbody>

      <tfoot>
        <tr>
          <td class="td_postage" colspan="2">送料（国内）</td>
          <td align="center" colspan="2">無料</td>
        </tr>

        <tr>
          <td class="td_total" colspan="2">合計（税込）</td>
          <td align="center"><s:property value="quantity" /></td>
          <td align="center">￥<fmt:formatNumber value="${total}" /></td>
        </tr>
      </tfoot>
    </table>
  </div>


  <div class="center">
    <table>
      <thead>
        <tr>
          <th colspan="2">お支払い方法</th>
        </tr>
      </thead>

      <s:iterator value="creditList">
        <tbody>
          <tr>
            <td>カードの種類</td>
            <td align="center"></td>
          </tr>
          <tr>
            <td>カード番号</td>
            <td align="center"><s:property value="creditId" /></td>
          </tr>
          <tr>
            <td>セキュリティーコード</td>
            <td align="center"><s:property value="securityCode" /></td>
          </tr>
          <tr>
            <td>有効期限</td>
            <td align="center"><s:property value="expirationYear" /> <s:property value="expirationMonth" /></td>
          </tr>
          <tr>
            <td>カード名義人</td>
            <td align="center"><s:property value="nameE" /></td>
          </tr>
        </tbody>
      </s:iterator>
    </table>
  </div>

  <div class="center">
    <table>
      <thead>
        <tr>
          <th colspan="2">お届け先</th>
        </tr>
      </thead>


      <tbody>
        <tr>
          <td>氏名</td>
          <td align="center"><s:property value="userName" /></td>
        </tr>
        <tr>
          <td>お届け先住所</td>
          <td align="center"><s:property value="userAddress" /></td>
        </tr>
      </tbody>
    </table>
  </div>

  <div>
    <s:form action="ConfirmOrderAction">
      <s:token />
      <s:submit type="image" src="img/chumon_kanryo.png" value="注文確定"/>
    </s:form>
  </div>
</body>
</html>