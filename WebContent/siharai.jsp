<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<title>支払い確認</title>
<meta name="description"
	content="An interactive getting started guide for Brackets.">
<!-- Stylesheet
    ==================================================-->

<link rel="stylesheet" href="main.css">
<link rel="stylesheet" type="text/css" href="css/siharai.css">
<!-- Javascripts
    ================================================== -->

<!--     ログインヘッダー読み込む -->
         <s:include value="login_header.jsp" />

</head>

<body>
	<h2>カード情報入力</h2>




	<s:form action="VerifyCreditCardAction">
		<table class="table" border="">
			<tr>
				<td bgcolor="#d3d3d3" rowspan="2">ご利用可能な <br>クレジットカード
				</td>

				<td><img src="img/visa.png" width=50></td>
				<td><img src="img/master.png" width=50></td>
				<td><img src="img/jcb.png" width=50></td>
			</tr>
			<tr>
				<td><input type="radio" name="creditBrand" value="1" required></td>
				<td><input type="radio" name="creditBrand" value="2"></td>
				<td><input type="radio" name="creditBrand" value="3"></td>
			</tr>
		</table>
		<br>●クレジットカード情報の入力の間違い等にご注意いただき、下記項目をすべて入力し「支払い確認へ(仮)」を押してください。
     <br>●本人名義以外のカード（家族名義のカード含む）、盗難カード等での不正使用は重大な犯罪です。
     <br>●弊社ではデジタルIDを使用したSSL暗号化技術により、カード情報を暗号化しています。ご安心ください。
         <!--↑文字を小さく↑）-->
		<table class="table2" border="">
			<tr>
				<th bgcolor="#d3d3d3">カード番号</th>
				<td><input type="text" name="creditNumber"
					size="20"> <br>※ご本人名義のカードのみご利用いただけます。 <br>※半角入力（ハイフンなし）
					例：1234123412341234</td>
			</tr>
			<tr>
				<th bgcolor="#d3d3d3">有効期限</th>
				<td><select name="expirationMonth">
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
						<option value="11">11</option>
						<option value="12">12</option>
				</select> /20 <select name="expirationYear">
						<option value="2017">17</option>
						<option value="2018">18</option>
						<option value="2019">19</option>
						<option value="2020">20</option>
						<option value="2021">21</option>
						<option value="2022">22</option>
						<option value="2023">23</option>
						<option value="2024">24</option>
						<option value="2025">25</option>
						<option value="2026">26</option>
						<option value="2027">27</option>
						<option value="2028">28</option>
						<option value="2029">29</option>
						<option value="2030">30</option>
						<option value="2031">31</option>
						<option value="2032">32</option>
						<option value="2033">33</option>
						<option value="2034">34</option>
						<option value="2035">35</option>
						<option value="2036">36</option>
						<option value="2037">37</option>
				</select> <br>カードの有効期限は通常「月／年（西暦下2桁）」で刻印されています。</td>
			</tr>
			<tr>
				<th bgcolor="#d3d3d3">カード名義人</th>
				<td><input type="text" name="nameE" size="20"> <br>※半角英数字（例：TARO
					YAMADA）</td>
			</tr>
			<tr>
				<th bgcolor="#d3d3d3">セキュリティーコード</th>
				<td><input type="text" name="securityCode" size="3"> <br>
					<input type="image" src="img/security_code.png" width=50>
					主にカード裏面のご署名欄に印刷されている末尾3桁～4桁の数字です。</td>
			</tr>
		</table>

<div class="center">

	 <s:submit value="次へ" theme="simple" class="Button01" />
	</div>
</s:form>


	<s:form action ="GoCartAction"><s:submit value="戻る" /></s:form>


</body>
</html>