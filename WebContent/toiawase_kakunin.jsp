
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>

<html>
<head>
 <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
 <title>お問い合わせ入力画面</title>
 <meta name="viewport" content="width=device-width, initial-scale=1.0">
 <script type="text/javascript">js/toiawase.js</script>
   <link href="css/bootstrap.min.css" rel="stylesheet">
</head>
<body>

<s:form method="post" action="ContactAction" class="autoConfirm">
<div style="text-align : center">
            <h1 class="contact-title">お問い合わせ内容確認画面</h1>
            <p>お問い合わせ内容はこちらで宜しいでしょうか？<br>よろしければ「お問い合わせ完了」ボタンを押して下さい。</p>
</div>
  <div class="container">
  <div class="row">
  <div class="col-sm-offset-3 col-sm-8">

	<div class="row">
    	<div class="col-sm-2">お名前</div>
    	<div class="col-sm-10 form-inline" style="padding: 3px;">
        <input type="text" name="userName" class="form-control" value ="<s:property value='#session.userName' />" required="required" maxlength="30"placeholder="お名前">
    </div>
	</div>
    <div class="row">
        <div class="col-sm-2">電話番号</div>
        <div class="col-sm-10 form-inline" style="padding: 3px;">
        <input type="tel" class="form-control input-sm" name="postalCode" value =" <s:property value='#session.postalCode' />" placeholder="電話番号" size="30">
    </div>
    </div>
    <div class="row">
    	<div class="col-sm-2">Email</div>
        <div class="col-sm-10 form-inline" style="padding: 3px;">
        <input type="email" class="form-control input-sm" name="email" value="<s:property value='#session.email'/>" placeholder="email" size="30">
        </div>
    </div>
    <div class="row">
    	<div class="col-sm-2">お問い合わせ内容</div>
        <div class="col-sm-10" style="padding: 3px;">
        <textarea class="form-control  input-sm" rows="3" name="comment" value="<s:property value='#session.comment'/>" placeholder="お問い合わせ内容"></textarea>
 		<input type="submit" class="btn btn-default" value="送信内容編集" >
 		 <input type="submit" class="btn btn-default" value="お問い合わせ完了" >
        </div>
	</div>
	</div>
    </div>
  	</div>

			<button type ="submit" class="btn btn-default" style="float:right;" value="{%('lang_confirm.send')}" ><text name='送る'/></button>
        </s:form>


<s:form action="BackContactAction">
     	<button type = "submit" class="btn btn-default" style="float:right;" value="%{get('lang_confirm.backToInput')}" ><text name='戻る'/></button>
     </s:form>


</body>
 <script type="text/javascript" src="js/main.js"></script>
    <script type="text/javascript"></script>


</html>