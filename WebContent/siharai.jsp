<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
  <head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <title>支払い確認</title>
    <meta name="description" content="An interactive getting started guide for Brackets.">
        <!-- Stylesheet
    ==================================================-->
    <!--
    <link rel="stylesheet" type="text/css" href="css/＠＠＠.css">-->
    <link rel="stylesheet" href="main.css">
    <link rel="stylesheet" type="text/css" href="css/siharai.css">
    <!-- Javascripts
    ================================================== -->
  </head>

  <body>
  <h2>カード情報入力</h2>
   <table class="table" border="0" cellspacing="0" cellpadding="0">
    <tr>
	 <td bgcolor="#d3d3d3" rowspan="2">ご利用可能な
	 <br>クレジットカード</td>

     <td><img src="img/visa.png"width=50></td>
     <td><img src="img/master.png"width=50></td>
     <td><img src="img/jcb.png"width=50></td>
    </tr>
    <tr>
       <td><input type="radio" name="creditType" value="1" required></td>
         <td><input type="radio" name="creditType" value="2"></td>
       <td><input type="radio" name="creditType" value="3"></td>
    </tr>
   </table>
     <br>●クレジットカード情報の入力の間違い等にご注意いただき、下記項目をすべて入力し「支払い確認へ(仮)」を押してください。
     <br>●本人名義以外のカード（家族名義のカード含む）、盗難カード等での不正使用は重大な犯罪です。
     <br>●弊社ではデジタルIDを使用したSSL暗号化技術により、カード情報を暗号化しています。ご安心ください。
         <!--↑文字を小さく↑）-->
   <table class="table2" border="1" cellspacing="0" cellpadding="0">
    <tr>
     <th bgcolor="#d3d3d3">カード番号</th>
     <td><input type="text" name="card number" value="creditNumber" size="20">
	 <br>※ご本人名義のカードのみご利用いただけます。
     <br>※半角入力（ハイフンなし）　例：1234123412341234
     </td>
    </tr>
	<tr>
     <th bgcolor="#d3d3d3">有効期限</th>
      <td>
      <select name="expirationMonth">
       <option value="expirationMonth">1</option>
       <option value="expirationMonth">2</option>
       <option value="expirationMonth">3</option>
       <option value="expirationMonth">4</option>
       <option value="expirationMonth">5</option>
       <option value="expirationMonth">6</option>
       <option value="expirationMonth">7</option>
       <option value="expirationMonth">8</option>
       <option value="expirationMonth">9</option>
       <option value="expirationMonth">10</option>
       <option value="expirationMonth">11</option>
       <option value="expirationMonth">12</option>
      </select>
       /20
      <select name="expirationYear">
       <option value="expirationYear">17</option>
       <option value="expirationYear">18</option>
       <option value="expirationYear">19</option>
       <option value="expirationYear">20</option>
       <option value="expirationYear">21</option>
       <option value="expirationYear">22</option>
       <option value="expirationYear">23</option>
       <option value="expirationYear">24</option>
       <option value="expirationYear">25</option>
       <option value="expirationYear">26</option>
       <option value="expirationYear">27</option>
       <option value="expirationYear">28</option>
       <option value="expirationYear">29</option>
       <option value="expirationYear">30</option>
       <option value="expirationYear">31</option>
       <option value="expirationYear">32</option>
       <option value="expirationYear">33</option>
       <option value="expirationYear">34</option>
       <option value="expirationYear">35</option>
       <option value="expirationYear">36</option>
       <option value="expirationYear">37</option>
      </select>
      <br>カードの有効期限は通常「月／年（西暦下2桁）」で刻印されています。
      </td>
     </tr>
     <tr>
      <th bgcolor="#d3d3d3">カード名義人</th>
      <td>
      <input type="text" name="nameE" size="20">
      <br>※半角英数字（例：TARO YAMADA）
      </td>
     </tr>
     <tr>
      <th bgcolor="#d3d3d3">支払い回数</th>
      <td>
      <select name="int">
       <option value="int">一括</option>
       <option value="int">2回</option>
       <option value="int">3回</option>
      </select>
      <br>ご契約の関係で指定された分割回数をご利用になれないことがございます。
      </td>
     </tr>
     <tr>
      <th bgcolor="#d3d3d3">セキュリティーコード</th>
      <td><input type="text" name="security code" size="3">
      <br>
      <input type="image" src="img/security_code.png"width=50>
      主にカード裏面のご署名欄に印刷されている末尾3桁～4桁の数字です。
      </td>
     </tr>
    </table>
   <a class="Button01" href="./cart.jsp">戻る</a>
   <a class="Button02" href="./siharai_kakunin.jsp">次へ</a>
  </body>
</html>