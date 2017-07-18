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

<script>
	var actionUrl; //アクションのURL
	var actionUrlWithParam; //アクションのパラメータ付きURL
	function imgClick(itemId) { //onclick="imgClick(this.name);"の属性がついた画像をクリックした時に実行される
		actionUrl = '<s:url action="GoItemDetailAction"></s:url>'; //例：/kagiya/GoItemDetailAction.action
		actionUrlWithParam = actionUrl + "?itemId=" + itemId; //例：/kagiya/GoItemDetailAction.action?itemId=2
		$('#item_detail').attr('src', actionUrlWithParam); //#item_detailを持つ要素の'src'属性にactionUrlWithParamを代入
	};
</script>
</head>

<body>
  <!-- ▼▼ログイン判定し、それに応じたヘッダーのjspファイルを読み込む -->
  <s:if test="#session.loginFlg == true">
    <s:include value="login_header.jsp" />
  </s:if>
  <s:else>
    <s:include value="header.jsp" />
  </s:else>
  <!-- ▼▼モーダル画面のjspファイルを読み込む -->
  <s:include value="modal.jsp" />


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


        <img src="<s:property value="itemList.get(#i.index).imgPath"/>"
          width="180" height="180" data-toggle="modal"
          data-target="#item_detail_modal"
          onclick="imgClick(this.name);"
          name="<s:property value='itemList.get(#i.index).itemId'/>">
        <table>
          <tr>
            <td>商品名</td>
            <td><s:property value="itemList.get(#i.index).itemName" /></td>
          </tr>
          <tr>
            <td>値段</td>
            <td><s:property
                value="itemList.get(#i.index).priceWithTax" />円（税込）</td>
          </tr>
        </table>
      </div>


      <!-- 普通データをPOSTするためにはsubmitボタンを用意してあげるが、たまにはsubmitもせずに選択した時点で自動的にsubmitして欲しい事もある。
        そんなときはonChangeでsubmitさせる。
        でもこの方法だと変えなかった時はそのまま〜になるので、その当たりは調整を(´･ω･｀) -->


      <s:form action="AddToCartAction">
        <select name="orderCount">
          <option value="<s:property value="orderCount"/>" selected>
            <s:property value="orderCount" /></option>
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
        <s:hidden name="userId" value="%{userId}" />
        <s:hidden name="itemId" value="%{itemId}" />
        <s:hidden name="priceRange" value="%{priceRange}" />
        <s:hidden name="category" value="%{category}" />
        <s:submit class="Button01" value="カートに入れる" />
        <%--         <s:submit name="itemList.get(#i.index).itemId" value="カートに追加"
          class="Button01" /> --%>
      </s:form>
    </s:iterator>

  </div>

</body>
</html>