<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>

<head>
<meta charset="UTF-8">
<title>管理者TOPログイン画面</title>
<meta name="ROBOTS" content="NOINDEX.NOFOLLOW">
<meta name="viewport" content="width=device">
<link rel="stylesheet" type="text/css"  href="css/bootstrap.css">
<link rel="stylesheet" href="css/AdminLogin.css">

</head>


<body>

	<caption>
		<h1>管理者専用画面</h1>
	</caption>

	<form>
		<div class="kanri_id_pass">
			<div class="kannri_id-button">
				<input type="text" name="id" size="40" placeholder="ID">
			</div>

			<div class="kannri_pass-button">
				<input type="password" name="password" size="40"
					placeholder="PASSWORD">
			</div>
		</div>
	</form>

	<div class="kanri" style="text-align: center">
		<div class="login-button">
			<input type="submit" class="button" value="ログイン" />
		</div>

		<!--必要であれば表示
           <div class="logout-button">
            <input type="submit" class="button" value="ログアウト" />
        </div>-->
	</div>

</body>

</html>