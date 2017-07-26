
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>

<html>
<head>
 <meta charset="utf-8">
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


  <div style="text-align : center">
	<div class="row">
    	<div class="col-sm-2">お名前</div>
    	<div class="col-sm-10 form-inline" style="padding: 10px;">
       <s:property value='#session.userName' />
    </div>
	</div>
    <div class="row">
        <div class="col-sm-2">電話番号</div>
        <div class="col-sm-10 form-inline" style="padding: 10px;">
        <s:property value='#session.postalCode' />
    </div>
    </div>
    <div class="row">
    	<div class="col-sm-2">Email</div>
        <div class="col-sm-10 form-inline" style="padding: 10px;">
        <s:property value='#session.email'/>
        </div>
    </div>
    <div class="row">
    	<div class="col-sm-2">お問い合わせ内容</div>
        <div class="col-sm-10" style="padding: 10px;">
        <s:property value='#session.comment'/>
		</div>
	</div>
	</div>
    </div>


        </s:form>

  <div style="text-align : center">
	<br>
	<br>
	<br>
<s:form action="BackContactAction" >
<input type="submit" class="btn btn-default" value="　送信内容編集　">
</s:form>
	<br>
	<br>
<s:form action="ContactAction">
<input type="submit" class="btn btn-default" value="お問い合わせ完了">
</s:form>
	</div>

</body>
 <script type="text/javascript" src="js/main.js"></script>
    <script type="text/javascript"></script>


</html>