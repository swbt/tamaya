<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
   <!-- ここから国際化 -->
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!-- ここまで国際化 -->

<!DOCTYPE html>
<html>
<head>
<!-- 国際化ここから -->
<fmt:setLocale value="${pageContext.request.locale.language}" />
<fmt:setBundle basename="com.internousdev.tamaya.property.toiawase" var="lang" />
<!-- 国際化ここまで -->


  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

  <title><s:text name = "lang.toiawase.inquiry" /></title>

  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <script type="text/javascript">js/toiawase.js</script>
  <link href="css/bootstrap.min.css" rel="stylesheet">
 </head>
 <body>
  <div style="text-align : center">
 <h1>お問い合わせフォーム</h1>
  </div>
  <br>
  <br>
  <div class="container">
  <div class="row">
  <div class="col-sm-offset-3 col-sm-8">

 <s:form method="post" action="ContactConfirmAction" class="autoConfirm">

	<div class="row">
    	<div class="col-sm-2">お名前</div>
    	<div class="col-sm-10 form-inline" style="padding: 3px;">
        <input type="text" name="userName" class="form-control" required="required" size="24" value = "<s:property value='#session.userName' />"placeholder="お名前">
    </div>
	</div>
    <div class="row">
        <div class="col-sm-2">電話番号</div>
        <div class="col-sm-10 form-inline" style="padding: 3px;">
        <input type="tel" class="form-control input-sm" name="postalCode" value = "<s:property value='#session.postalCode' />"placeholder="電話番号" size="30">
    </div>
    </div>
    <div class="row">
    	<div class="col-sm-2">Email</div>
        <div class="col-sm-10 form-inline" style="padding: 3px;">
        <input type="email" class="form-control input-sm" name="email" value = "<s:property value='#session.email' />"placeholder="email" size="30">
        </div>
    </div>
    <div class="row">
    	<div class="col-sm-2">お問い合わせ内容</div>
        <div class="col-sm-10" style="padding: 3px;">
        <textarea class="form-control  input-sm" rows="3" name="comment" placeholder="お問い合わせ内容"><s:property value='#session.comment' /></textarea>
 		<input type="submit" value="送信内容確認">
        </div>
	</div>

</s:form>
 </div>
 </div>
 </div>

</body>

  <script type="text/javascript" src="js/main.js"></script>
    <script type="text/javascript"></script>
</html>