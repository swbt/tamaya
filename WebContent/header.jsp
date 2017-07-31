<%@ page language="java" contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!-- ▼▼国際化 -->
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<!-- ▼▼国際化 -->
<fmt:setLocale value="${pageContext.request.locale.language}" />
<fmt:setBundle basename="com.internousdev.tamaya.property.header" var="lang" />
<meta charset="utf-8">
<!-- ▼▼StyleSheet -->
<link rel="stylesheet" href="css/bootstrap-glyphicon.min.css">
<link rel="stylesheet" href="css/header.css" />
<!-- ▼▼JavaScript -->
<script src="js/jquery-3.2.1.min.js"></script>
<script src="js/header.js"></script>
</head>
<body>
  <header id="header">
    <a class="logo" href="<s:url action='GoTopAction'/>"><img alt="<s:text name='lang.header.tamaya' />"
      src="img/logo3.png"></a>
    <div class="spacer"></div>
    <div class="navi">
      <s:if test="#session.userId > 0">
        <a class="navi_box" href="toiawase.jsp">
          <span class="glyphicon glyphicon-envelope"></span>
          <span class="navi_box_title"><s:text name='lang.header.contact' /></span>
        </a>
        <a class="navi_box" href="<s:url action='GoCartAction'/>">
          <span class="glyphicon glyphicon-shopping-cart"></span>
          <span class="navi_box_title"><s:text name='lang.header.cart' /></span>
        </a>
        <a class="navi_box" href="<s:url action='GoMyPageAction'/>">
          <span class="glyphicon glyphicon-home"></span>
          <span class="navi_box_title"><s:text name='lang.header.myPage' /></span>
        </a>
        <a class="navi_box" href="<s:url action='LogoutAction'/>">
          <span class="glyphicon glyphicon-log-out"></span>
          <span class="navi_box_title"><s:text name='lang.header.logout' /></span>
        </a>
      </s:if>
      <s:else>
        <a class="navi_box login_box">
          <span class="login_label">
            <s:text name='lang.header.email' />
          </span>
          <span class="login_label">
            <s:text name='lang.header.password' />
          </span>
          <input type="text" class="login_input" id="login_email" name="email" />
          <input type="password" class="login_input" id="login_password" name="password" size="20" />
          <input type="button"  class="login_submit" value="<s:text name='lang.header.login' />" onclick="login();"/>
        </a>
        <a class="navi_box" href="toiawase.jsp">
          <span class="glyphicon glyphicon-envelope"></span>
          <span class="navi_box_title"><s:text name='lang.header.contact' /></span>
        </a>
      </s:else>
    </div>
  </header>
  <!-- .header -->
</body>
</html>