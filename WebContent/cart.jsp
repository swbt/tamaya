<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
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
    <!-- Stylesheet
    ==================================================

    <link rel="stylesheet" type="text/css"  href="css/siharai_kakunin.css">

    <!-- Javascripts
    ================================================== -->
    <script src="js/jquery-3.2.1.min.js"></script>
    <script>
        $(document).ready(function(){
   			 $('#top-menu').prmenu();
        });
	</script>
  	</head>

    <!-- メインページ -->
 	<body>
    <div id="header"></div><br>

    <img src="img/cart_shohin.png" alt="カートに入っている商品">


	<div class="a">
		<table>
			<s:iterator value="cartList" status="rs">
				<tr height="60">
					<td align="center" width="100"><img src="<s:property value="imgPath"/>" <s:property value="itemName" /> align="center"></td>
					<td align="center" width="250">
						<!--商品名-->
						<s:property value="itemName" />
						<!-- 商品名 -->：<s:property value="itemName" />
					</td>
					<td align="center" width="100">
						<!-- 個数が変更されたとき、小計なども自動的に変更される -->
						<s:form action="CartUpdateAction">
							<label for="exampleInputOrderCount"></label>
							<input type="hidden" name="itemId"
								value="<s:property value="itemId"/>" />

							<!-- 普通データをPOSTするためにはsubmitボタンを用意してあげるが、たまにはsubmitもせずに選択した時点で自動的にsubmitして欲しい事もある。
								そんなときはonChangeでsubmitさせる。
								でもこの方法だと変えなかった時はそのまま〜になるので、その当たりはかってに調整を(´･ω･｀) -->

							<s:text name="lang.cart.itemCount" />
							<!-- 個数 -->：<select name="orderCount"
								onChange="this.form.submit()">
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
						</s:form>
					</td>
					<td align="center" width="100">
						<!--小計 -->
						<s:text name="lang.cart.subTotal" /> <br> <fmt:formatNumber
							value="${price * orderCount}" />
						<!-- 円 -->
						<s:text name="lang.cart.yen" />
					</td>

					<!-- キャンセルボタンが押されたとき、商品をカートから消去する -->

					<td align="center" width="100"><s:form
							action="CartDeleteAction">
							<input type="hidden" name="cartId"
								value="<s:property value="cartId"/>" />
							<!-- 削除ボタン -->
							<s:submit label="%{getText('lang.cart.delete')}" type="button"
								name="del" />
						</s:form></td>
				</tr>

			</s:iterator>
		</table>

	</div>











	<%-- <table align="center">
      	<thead>


            <tr>
              <th>商品名</th>
              <th>価格</th>
              <th>個数</th>
              <th>小計</th>
              <th>削除</th>
            </tr>
          </thead>

    	<tbody>
          <s:iterator value = "cartList"><!-- デザインが崩れてしまうため保留 -->
            <tr>
              <td><img src="<s:property value="imgPath"/>" <s:property value="itemName" /> align="center"> </td>
              <td align="center">￥<fmt:formatNumber value="${price}" />（税込）</td>
              <td align="center">
                      <select name="orderCount" onChange="this.form.submit()" style="width: 50px">
                        <option value="<s:property value="orderCount"/>" selected><s:property value="orderCount"/></option>
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
                      </select></td>   <!-- orderCount新設の必要あり？ -->
              <td align="center">￥<fmt:formatNumber value="${subTotal}" /></td>
              <td align="center">
                <!--<s:form action="CartDeleteAction">-->   <!-- sタグがデザインを崩す原因になっている -->
                    <button type="submit" class="btn btn-default"><s:text name="×" /></button>
                <!-- </s:form> -->
              </td>
            </tr>
          </s:iterator><!-- デザインが崩れてしまうため保留 -->
        </tbody>

    	<tfoot>
          <tr>
            <td class="souryo" colspan="2">送料（国内）</td>
            <td align="center" colspan="3">無料</td>
          </tr>

          <tr>
            <td class="gokei" colspan="2">合計（税込）</td>
            <td align="center">1個</td>  <!-- 合計個数方法不明 -->
            <td align="center" colspan="2">￥<fmt:formatNumber value="${total}" /></td>
          </tr>
        </tfoot>
    </table>
 --%>
	<div>
    <a href="./siharai.jsp"> <s:form action="GoPaymentAction"></s:form>
    	<img src="img/shiharai_nyuryoku.png" alt="支払い情報入力画面" align="right">
    </a>
    </div>
  </body>
</html>