<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
  <head>
    <meta charset="utf-8">
    <title>花火なら『tamaya』</title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0, minimum-scale=1.0">
    <!-- ▼▼Stylesheet -->
    <link rel="stylesheet" href="css/reset.css">
    <link rel="stylesheet" href="css/bootstrap.min.css">
    <!-- ▼▼jQuery -->
    <script src="js/jquery-3.2.1.min.js"></script>
    <!-- ▼▼他のjavascript -->
    <script src="js/bootstrap.min.js"></script>
    
    <script>
    // 読み込みが完了してから処理を行う
    $(window).on('load resize',function(){
      // 親画面のiframe要素
      var elm = window.parent.document.getElementById("item_detail");
      // 子要素のコンテンツサイズに合わせて調整
      elm.style.height = document.body.clientHeight + "px";
    });
    </script>
  </head>
  <body>
    <img alt="商品画像" src="<s:property value="dto.getImgPath()"/>">
    <s:property value="itemId"/>
    <s:property value="dto.itemName"/>
    <s:property value="dto.detail"/>
    <s:property value="dto.priceWithTax"/>
    <s:property value="dto.stock"/>
  </body>
</html>