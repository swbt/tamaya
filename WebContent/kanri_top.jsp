<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>管理者TOPログイン画面</title>
</head>
<body>
	<body id="login">

    <caption>
        <h1 style="text-align:center">管理者専用TOP画面</h1>
    </caption>
    <form action="AdminLoginAction">
        <table class="table">
            <tr>
                <th>
                    <font size="5"><b>管理者ID</b></font>
                </th>
                <td>
                    <input type="text" name="id" size="50" placeholder="ID"><br>
                    <font size="2" color="#ff0000"></font>

                </td>
            </tr>

            <tr>
                <th>
                    <font size="5"><b>管理者パスワード</b></font>
                </th>
                <td>
                    <input type="password" name="password" size="50" placeholder="password">
                    <font size="2" color="#ff0000"></font>

                </td>
            </tr>
        </table>
    </form>


    <div class="kanri" style="text-align:center">
        <div class="login-button">
            <input type="submit" class="button" value="管理者ログイン" />
        </div>
        <div class="logout-button">
            <input type="submit" class="button" value="管理者ログアウト" />
        </div>
    </div>

</body>
</html>