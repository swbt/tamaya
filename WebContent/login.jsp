<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html lang="ja">
<head>
<meta charset="UTF-8">
<title>ログイン情報入力画面</title>
<meta name="viewport"
	content="width=device-width, initial-scale=1.0, user-scalable=0">


<!-- Stylesheet （css呼び込みはここに記入）
    ================================================== -->
<!-- cssのデータ元を記入する必要あり -->
<link rel="stylesheet" href="css/bootstrap.min.css">
<link rel="stylesheet" type="text/css" href="css/login.css">
<!--
    <link rel="stylesheet" type="text/css" href="css/＠＠＠.css">
    <link rel="stylesheet" type="text/css" href="">

    <!-- Javascripts
    ================================================== -->
<script src="js/jquery-3.2.1.min.js"></script>
<script src="js/bootstrap.min.js"></script>


</head>

<body>


	<div class="login">
		<s:form action="LoginAction">
			<h1>ログイン</h1>
			<h4>MAILADDRESS</h4>
			<s:textfield name="email" placeholder="メールアドレス" size="30" />
			<h4>PASSWORD</h4>
			<s:password name="userPass" placeholder="パスワード" size="30" />

			<div class=log_button align="center">
				<a href=""><button type="submit"
						class="btn btn-primary btn-black btn-large">Log in</button></a>
			</div>
		</s:form>

		<div>
			<!--         <a href="GoFacebookAction">
          <img src="img/sign_facebook.png" alt="sign in with Facebook" width="250" height="40"><br>
        </a>
        <a href="GoGoogleAction">
          <img src="img/sign_google.png" alt="sign in with Google" width="250" height="40"><br>
        </a>
        <a href="GoTwitterAction">
        <img src="img/sign_Twitter.png" alt="sign in with Twitter" width="250" height="40"><br>
        </a> -->
		</div>
		<%--ログイン画面参考サイト→https://codepen.io/arthitst/pen/lrEAf --%>
	</div>
</body>
</html>