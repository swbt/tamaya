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
      <a href="toiawase.jsp"><i class="button" ></i> お問い合わせ</a>
      <a href="<s:url action="LogoutAction"/>"><i class="button" ></i> ログアウト</a>
      <a href="mypage.jsp"><i class="button" ></i> マイページ</a>
      <a href="<s:url action="GoCartAction"></s:url>"><i class="button" ></i> マイカート</a>
      <a href="top.jsp"><i class="button" ></i> トップ</a>
    </div>
      </div>

  </body>
</html>