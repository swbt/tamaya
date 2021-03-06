<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<!-- ★★商品が見つからなかったときの動作は未定（とりあえずTopに飛ばしてます）★★ -->

<!DOCTYPE html>
<html>
<head>
<meta charset=UTF-8>
<title>たまや</title>
<meta name="viewport" content="width=device-width, initial-scale=1.0, minimum-scale=1.0">
<!-- ▼▼Stylesheet -->
<link rel="stylesheet" href="css/reset.css">
<link rel="stylesheet" href="css/bootstrap.min.css">
<link rel="stylesheet" href="css/style.css">
<link rel="stylesheet" type="text/css" href="css/siharai.css">
<link href="css/item_list.css" rel="stylesheet" type="text/css">
<!-- ▼▼jQuery -->
<script src="js/jquery-3.2.1.min.js"></script>
<!-- ▼▼他のjavascript -->
<script src="js/bootstrap.min.js"></script>

</head>
<body>

  <!-- ▼▼ヘッダーのjspファイルを読み込む -->
  <s:include value="header.jsp" />
  <!-- ▼▼モーダル画面のjspファイルを読み込む -->
  <s:include value="modal.jsp" />
  <s:set name="priceRange" value="priceRange" />
  <s:set name="category" value="category" />

  <div class="container">
    <div class="item_list">


      <!-- ▼▼itemList<ItemDTO> の中の ItemDTO オブジェクトを順番に全て取り出す。ループ変数は i -->
      <s:iterator value="itemList" status="i">
        <div class="item">
          <!-- ▼▼この画像をクリックすると #item_detail_modal のモーダルを開く（modal.jsp内にある） -->
          <s:form action="GoItemDetailAction" target="item_detail">
            <s:hidden name="itemId" value="%{itemList.get(#i.index).itemId}" />
            <s:submit class="item_img" type="image" src="%{itemList.get(#i.index).imgPath}" data-toggle="modal"
              data-target="#item_detail_modal" />
          </s:form>
            <s:property value="itemList.get(#i.index).itemName" />
            <br>
            <s:property value="itemList.get(#i.index).price" />円（税込）
          <s:form action="AddToCartAction">
            <input type="number" name="quantity" size="5">
            <div id="countError"></div>
            <s:hidden name="itemId" value="%{itemId}" />
            <s:hidden name="priceRange" value="%{#priceRange}" />
            <s:hidden name="category" value="%{#category}" />
            <s:submit class="btn btn-primary" value="カートに入れる" />
          </s:form>
        </div>
      </s:iterator>
    </div>
  </div>
</body>
</html>