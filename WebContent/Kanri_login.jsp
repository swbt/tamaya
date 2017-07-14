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

<title><s:text name="lang.kanri_login.title"/></title>

<%--検索エンジンによるインデックス拒否 --%>
<meta name="ROBOTS" content="NOINDEX.NOFOLLOW">
<meta name="viewport" content="width=device initial-scale=1.0">
<link rel="stylesheet" href="css/AdminLoginPageOnly.css">
</head>

<body>
	<caption><h1><s:text name="lang.kanri_login.title"/></h1></caption>

	<!--必要であれば表示してね
           <div class="logout-button">
            <input type="submit" class="button" value="logout" />
        </div>-->

</body>
<s:form action="AdminLoginAction">
	<div class="container">
		<div class="box">
			<s:textfield type="text" name="email" required="required"
				placeholder="email" autocomplete="off" maxlength='30'/>
		</div>
		<div class="box">
			<s:password type="password" name="password" required="required"
				placeholder="Password" autocomplete="off" maxlength='30'/>
		</div>
		<div class="box">
			<s:submit value="login" class="btn btn-info" title="Register" />
		</div>
	</div>
</s:form>


</body>

</html>