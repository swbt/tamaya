<%@ page language="java" contentType="text/html; charset=UTF-8"
  pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<!-- ★★商品が見つからなかったときの動作は未定（とりあえずTopに飛ばしてます）★★ -->

<!DOCTYPE html>
<html>
<head>
<meta charset=UTF-8>
<title>たまや</title>
<meta name="viewport"
  content="width=device-width, initial-scale=1.0, minimum-scale=1.0">
<!-- ▼▼Stylesheet -->
<link rel="stylesheet" href="css/reset.css">
<link rel="stylesheet" href="css/bootstrap.min.css">
<link rel="stylesheet" href="css/style.css">
<link rel="stylesheet" type="text/css" href="css/siharai.css">
<!-- ▼▼jQuery -->
<script src="js/jquery-3.2.1.min.js"></script>
<!-- ▼▼他のjavascript -->
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
  <s:set name="priceRange" value="priceRange" />
  <s:set name="category" value="category" />

  <div class="item_list">


    <!-- ▼▼itemList<ItemDTO> の中の ItemDTO オブジェクトを順番に全て取り出す。ループ変数は i -->
    <s:iterator value="itemList" status="i">
        <div class="item">
          <!-- ▼▼この画像をクリックすると #item_detail_modal のモーダルを開く（modal.jsp内にある） -->
          <!-- ▼▼モーダル周りの動作はbootstrap.jsで定義されています -->


          <!--       indexは0からスタート
        countは1からスタート
        stepを入れると例step=2だと2ずつ増えていく
        変数iに入る数字を指定するためのパラメータ -->

          <s:form action="GoItemDetailAction" target="item_detail">
            <s:hidden name="itemId" value="%{itemList.get(#i.index).itemId}" />
            <s:submit class="img_path" type="image" src="%{itemList.get(#i.index).imgPath}"
              data-toggle="modal" data-target="#item_detail_modal" />
          </s:form>
          <table>
            <tr>
              <td>商品名</td>
              <td><s:property value="itemList.get(#i.index).itemName" /></td>
            </tr>
            <tr>
              <td>値段</td>
              <td><s:property value="itemList.get(#i.index).price" />円（税込）</td>
            </tr>
          </table>
          <s:form action="AddToCartAction">
			<input type="text" name="orderCount" size="5">
			<div id ="countError"></div>
            <s:hidden name="userId" value="%{userId}" />
            <s:hidden name="itemId" value="%{itemId}" />
            <s:hidden name="priceRange" value="%{#priceRange}" />
            <s:hidden name="category" value="%{#category}" />
            <s:submit class="btn btn-primary" value="カートに入れる" />
          </s:form>
        </div>
    </s:iterator>
  </div>
</body>
</html>