<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
  <head>
    <meta charset="utf-8">
    <title></title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <!-- ▼▼Stylesheet -->
    <link rel="stylesheet" type="text/css"  href="css/login_header.css">
    <!-- ▼▼JQuery -->
    <script src="js/jquery-3.2.1.min.js"></script>
  </head>
  <body>
    <div id="menu">
      <ul>
        <li><a href="./top.jsp">ロゴ画像</a></li>
        <li><a href="./cart.jsp">マイカート</a></li>
        <li><a href="./mypage.jsp">マイページ</a></li>
        <li><a href="./toiawase.jsp">お問合わせ</a></li>
        <li><a href='<s:url action="LogoutAction"></s:url>'>ログアウト</a></li>
      </ul>
    </div>
  </body>
</html>