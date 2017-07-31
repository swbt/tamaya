<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
  <head>
    <meta charset="utf-8">
    <title>花火なら『tamaya』</title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <!-- Stylesheet
    ==================================================
    <!--
    <link rel="stylesheet" type="text/css"  href="css/＠＠＠.css">
    <link rel="stylesheet" type="text/css" href="css/＠＠＠.css">
    <link rel="stylesheet" type="text/css" href="">
    -->
    <!-- Javascripts
    ================================================== -->
    <script src="js/jquery-3.2.1.min.js"></script>
    <script>
        $(document).ready(function(){
    $('#top-menu').prmenu();
        });
	</script>

	<meta http-equiv="refresh" content="5;<s:url action="GoTopAction" />">
  </head>
  <body>
 <BODY>
  <!-- ▼▼ヘッダーのjspファイルを読み込む -->
  <s:include value="header.jsp" />
<h1>ご注文ありがとうございました。</h1>
５秒後にジャンプします。<br>
ジャンプしない場合は、下記のTOPボタンをクリックしてください。<br>
<br>
<a href="<s:url action="GoTopAction" />"><button type="button" class="btn btn-success">TOPページ</button></a>

</BODY>
  </body>
</html>