<%@ page language="java" contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>

<!DOCTYPE html>
<html>
  <head>
    <meta charset="utf-8">
    <title>ログインヘッダー</title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <!-- Stylesheet
    ==================================================
    -->
    <link rel="stylesheet" type="text/css" href="./css/header.css">
    <!-- Javascripts
    ================================================== -->
    <script src="js/jquery-3.2.1.min.js"></script>





  </head>
  <body>
      <div class="trim">
        <img src="./img/tamaya22.png" class="bb">
    <div class="example">

      <s:form action="LoginAction" class="fm" style="color:white;">
          <s:textfield name="email" label="email"/>
          <s:password name="userPass" label="password" size="20" />
          <s:submit value="ログイン"/>
        </s:form>
         <a href="toiawase.jsp"><i class="button" ></i> お問い合わせ</a>
      <a href="cart.jsp"><i class="button" ></i> マイカート</a>
      <a href="top.jsp"><i class="button" ></i> トップ</a>
    </div>
      </div>

  </body>
</html>