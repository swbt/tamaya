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
<script src="js/bootstrap-modal.min.js"></script>

<script>
function logout() {
  $.ajax({
    url : 'LogoutAction.action',
    type : 'GET',
    dataType : 'json',
    success : function() {
      var header = document.getElementsByTagName('header');
      header[0].textContent = null;
      $('header').load('header.jsp');
    }
  })
}
</script>
</head>
<body>
  <header class="header">
    <a class="logo" href="<s:url action='GoTopAction'/>"><img alt="<s:text name='lang.header.tamaya' />" src="img/logo3.png"></a>
    <div class="spacer"></div>
    <nav class="navi">
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
        <a class="navi_box" onclick="logout();">
          <span class="glyphicon glyphicon-log-out"></span>
          <span class="navi_box_title"><s:text name='lang.header.logout' /></span>
        </a>
      </s:if>
      <s:else>
        <a class="navi_box" href="toiawase.jsp">
          <span class="glyphicon glyphicon-envelope"></span>
          <span class="navi_box_title"><s:text name='lang.header.contact' /></span>
        </a>
        <s:form class="navi_box login_box" action="LoginAction">
          <div class="login_label"><s:text name='lang.header.email' /></div>
          <div class="login_label"><s:text name='lang.header.password' /></div>
          <s:textfield class="login_input" name="email"/>
          <s:password class="login_input" name="password" size="20"/>
          <s:submit class="login_submit" value="%{getText('lang.header.login')}" />
        </s:form>
      </s:else>
    </nav>
  </header><!-- .header -->
</body>
</html>