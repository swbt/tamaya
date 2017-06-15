<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="s" uri="/struts-tags" %>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
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

 <!-- カートの中身をテーブルに格納して表示 -->


<s:set name="testName" value="'カートには何も入っていません'"></s:set>
    <s:if test = "listSize = 0">
        <s:property value="#testName" />
    </s:if>

<table>
  <thead>
    <tr align="center">
       <th>商品名</th>
       <th>価格</th>
       <th>個数</th>
       <th>小計</th>
       <th>削除</th>
    </tr>
  </thead>

  <tbody>
    <s:iterator value="1"><!-- 変数：cartlist新設する必要あり？ -->
    <tr>
      <td align="center"><img src= "<s:property value="imgPath"/>"<s:property value="orderCount"/> >
      </td>
      <td align="center"><fmt:formatNumber value="${price}" pattern="###,###,###"/></td>

          <s:hidden name="itemId" value="%{itemId}"/>
        <td>

        <!-- 個数が変更されたとき、小計なども自動的に変更される -->
        <s:form action="CartUpdateAction">
        <label for="exampleInputOrderCount"></label>
          <input type="hidden" name="itemId" value="<s:property value='itemId'/>"/>
          <select name="quantity" onChange="this.form.submit()">   <!-- 変数名：onChange -->
          <option value="<s:property value="orderCount"/>" selected><s:property value="orderCount"/></option>
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
          </s:form>
        </td>
      <fmt:formatNumber value="${price}" pattern="###,###,##"/>   <!-- 単体金額表示 --><!-- javaで書いたほうが良い -->
      <td><s:form action="CartDeleteAction">
          <s:hidden name="userId" value="%{userId}"/>
          <button type ="submit"> alt="×" align="middle" ><s:text name="delete"/></button>
          </s:form>
        </td>
        </tr>
      </s:iterator>
   </tbody>
<!-- カートの中身の処理ここまで -->

  <tfoot>
    <tr>
    <td class="souryo" colspan="2">送料（国内）</td>
    <td align="center" colspan="3">無料</td>
    </tr>
    <tr>
    <td class="gokei" colspan="2">合計（税込）</td>
    <td align="center"><s:property value = "totalorder"/><%="点"%></td>  <!--合計商品数--><!-- 変数：totalorderが必要では？ -->
    <td align="center" colspan="2"><s:text name="total"/><fmt:formatNumber value="${amountAll}" pattern="###,###,###"/></td>
    <tr>
    </tfoot>
</table>

  <div>
    <a href="./siharai.jsp">
        <s:form action="GoSettlementAction">
      <button type="submit"><img src="img/shiharai_nyuryoku.png" alt="支払い情報入力画面" align="right"/></button>
        </s:form>
    </a>
    </div>
  </body>
</html>
