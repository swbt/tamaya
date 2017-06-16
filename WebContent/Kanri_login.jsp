<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%--国際化用 --%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">

<%--国際化用 --%>
<fmt:setLocale value="${pageContext.request.locale.language}" />
<fmt:setBundle basename="com.internousdev.tamaya.property.kanri_login" var="lang" />
<title>管理者ログイン画面<s:text name="lang.admin_login.title" /></title>

<%--検索エンジンによるインデックス拒否 --%>
<meta name="ROBOTS" content="NOINDEX.NOFOLLOW">

<meta name="viewport" content="width=device">
<link rel="stylesheet" type="text/css" href="css/bootstrap.css">
<link rel="stylesheet" href="css/AdminLogin.css">

</head>


<body>
	<caption>
	<h1><s:text name="管理者専用画面"></s:text></h1>
	</caption>

	<div class="main">
<h2><s:text name="%{getText('lang.adminLogin.kanrisya')}"/></h2>
 <s:form action="AdminLoginAction">
 <s:textfield type="text" name="phoneEmail" placeholder="%{getText('lang.adminLogin.mailAddress')}" class="input" required="required" size="40"/>
 <s:password type="password" name="password" placeholder="%{getText('lang.adminLogin.password')}" class="input" required="required" size="40" />
 <s:submit value="ログイン" class="login-btn"  size="14" />

 </s:form>

		<!--必要であれば表示
           <div class="logout-button">
            <input type="submit" class="button" value="ログアウト" />
        </div>-->
	</div>

</body>

</html>