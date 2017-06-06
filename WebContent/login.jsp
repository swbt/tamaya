<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
	<html>
	<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>ログイン情報入力画面</title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0, user-scalable=0">


        <!-- Stylesheet （css呼び込みはここに記入）
    ================================================== -->
    <link rel="stylesheet" type="text/css" href="css/login.css"><!-- cssのデータ元を記入する必要あり --!>
    <link rel="stylesheet" type="text/css" href="css/＠＠＠.css">
    <link rel="stylesheet" type="text/css" href="">

    <!-- Javascripts
    ================================================== -->
    <script type="text/javascript" src="js/"></script>
    <script src="js/jquery.@@@@.js"></script>
    <script>
        $(document).ready(function(){
    $('#top-menu').prmenu();
        });
</script>

	</head>
	<main>
	<body>

<div class="login">
<h1>ログイン</h1>
<form method="post">
<h4>MAILADDRESS</h4>
<input type = "text" name = "mailaddress" placeholder="メールアドレス" required="required"/>
<h4>PASSWORD</h4>
<input type = "password" name = "password" placeholder="パスワード" required="required"/>

<ul style="list-style:none;"><div>
  <li><a href=""><button type="submit" class="btn btn-primary btn-black btn-large">Log in</button>
  </form>
 	<div>
  <a href="">
  		<img src="img/sign_facebook.png" alt="sign in with Facebook" width="250" height="40"><br>
  </a>
  <a href="">
  		<img src="img/sign_google.png" alt="sign in with Google" width="250" height="40"><br>
  </a>
  <a href="">
  		<img src="img/sign_Twitter.png" alt="sign in with Twitter" width="250" height="40"><br>
  </a>
  </div>

</ul>
	</main>

<%--ログイン画面参考サイト→https://codepen.io/arthitst/pen/lrEAf --%>

</body>

</html>