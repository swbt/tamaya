<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ja">
<head>
        <meta charset="utf-8">

    <title>カート</title>
    <meta name="description" content="An interactive getting started guide for Brackets.">

    <!-- Bootstrap -->
    <link rel="stylesheet" href="main.css">

    <!-- Stylesheet
    ================================================== -->
    <link rel="stylesheet" type="text/css" href="css/cart.css">

    <!-- Javascripts
    ================================================== -->
    <script src="js/jquery-3.2.1.min.js"></script>
      <script>
          $(document).ready(function(){
      	    $("#header").load("login_header.html");
          });
      </script>
</head>

<body>

  <header><s:include value="header.jsp"/></header>

    <div id="header"></div><br>

    <img src="img/cart_shohin.png" alt="カートに入っている商品">
      <table align="center">
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
    <!--  <s:iterator value="cartList"> -->
    <tr>
      <td><img src="<s:property value=imgPath/>
           <s:propety value=itemName/> align="center">
      </td>
      <td align="center"><fmt:formatNumber value="${price}" pattern="###,###,###"/></td>
          <s:form action="UpdateCartAction" id=""><!--  action="UpdateCartAction不明 id不明-->
          <!-- <s:hidden name="cartId" value="%{cartId}" /> -->
          <s:hidden name="itemId" value="%{itemId}"/>
        <td>
          <select name="number" >
            <option value="selected">選択してください</option>
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
        </td>
      <fmt:formatNumber value="${price }" pattern="###,###,##"/>
      <td><s:form action="CartDeleteAction">
          <s:hidden name="userId" value="%{userId}"/>
          <s:hidden name="cartId" value="%{cartId}"/>
          <img src="img/shut.gif" alt="×" align="middle" ></td>
         </s:form>
    </tr>
   </tbody>

	<tfoot>
    <tr>
    <td class="souryo" colspan="2">送料（国内）</td>
    <td align="center" colspan="3">無料</td>
    </tr>
    <tr>
    <td class="gokei" colspan="2">合計（税込）</td>
    <td align="center">1個</td>
    <td align="center" colspan="2">2,500円</td>
    <tr>
    </tfoot>
    </table>

	<div>
    <a href="./siharai.jsp">
    	<img src="img/shiharai_nyuryoku.png" alt="支払い情報入力画面" align="right">
    </a>
    </div>
  </body>
</html>
