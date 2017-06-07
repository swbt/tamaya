<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
  <head>
    <meta charset="utf-8">
    <title>支払い確認画面</title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <!-- Stylesheet
    ==================================================
    <!--
    <link rel="stylesheet" type="text/css"  href="css/＠＠＠.css">
    <link rel="stylesheet" type="text/css"  href="css/cart.css">
    <link rel="stylesheet" type="text/css"  href="css/＠＠＠.css">
    <link rel="stylesheet" type="text/css"  href="">
    -->
    <!-- Javascripts
    ================================================== -->
    <script src="js/jquery-3.2.1.min.js"></script>
    <script>
        $(document).ready(function(){
    $('#top-menu').prmenu();
        });
	</script>
  </head>
  <body>
    <body>
    <div id="header"></div><br>

    <img src="img/cart_shohin.png" alt="カートに入っている商品">
	<table>
		<thead>
    <tr>
    <th>商品名</th>
    <th>価格</th>
    <th>個数</th>
    <th>小計</th>
    <th>削除</th>
    </tr>
    	</thead>

	<tbody>
    <tr>
    <td><img src="img/honkidama.jpg" alt="商品画像　商品名" align="middle"> 　　本気玉</td>
    <td>2,500円（税込）</td>
    <td>
    <select name="number" >
    	<option value="selected">選択してください</open>
    	<option value="1">1</option>
    	<option value="2">2</option>
    	<option value="3">3</option>
    	<option value="4">4</option>
    	<option value="5">5</option>
    	<option value="6">6</option>
    	<option value="7">7</option>
    	<option value="8">8</option>
    	<option value="9">9</option>
    	<option value="10">10</option>
    	</select>
    </td>
    <td>2,500円（税込）</td>
    <td><img src="img/shut.gif" alt="×"></td>
    </tr>
    </tbody>

	<tfoot>
    <tr>
    <td colspan="2">送料（国内）</td>
    <td colspan="3">無料</td>
    </tr>
    </tfoot>
    </table>

	<table border="1" cellspacing="0">
	<tr>
    <td>合計（税込）</td>
    <td>1個</td>
    <td>2,500円</td>
    </table>

	<div>
    <a href="./siharai.html">
    	<img src="img/shiharai_nyuryoku.png" alt="支払い情報入力画面" align="right">
    </a>
    </div>
    <ul>
      <li><a href="./siharai_kanryo.jsp">決済完了画面</a></li>
    </ul>
  </body>
</html>