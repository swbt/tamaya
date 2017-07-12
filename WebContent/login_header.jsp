<%@ page language="java" contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%--国際化用 --%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
  <head>
    <meta charset="utf-8">
    <title>ログイン後ヘッダー</title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <!-- Stylesheet
    ==================================================
    -->
    <link rel="stylesheet" type="text/css" href="./css/login_header.css">
    <!-- Javascripts
    ================================================== -->
    <script src="js/jquery-3.2.1.min.js"></script>





  </head>
  <body>
      <div class="trim">
        <img src="./img/tamaya22.png" class="bb">
    <div class="example">
    <div id="menu">
		<ul>
			<li><a href="toiawase.jsp">お問い合わせ</a></li>
			<li><a href="<s:url action="LogoutAction"/>"><i class="button" ></i> ログアウト</a></li>
			<li><a href="mypage.jsp">マイページ</a></li>
			<li><a href="cart.jsp">マイカート</a></li>
			<li><a href="top.jsp">トップ</a></li>

		</ul>
		</div>

    </div>
      </div>

  </body>
</html>