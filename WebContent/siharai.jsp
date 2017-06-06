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
    <link rel="stylesheet" href="main.css">
  </head>

  <body>
  <h2>カード情報入力</h2>
   <table border="1" cellspacing="0" cellpadding="0">
    <tr>
	 <th>ご利用可能な
	 <br>クレジットカード</th>
     <td>
     <input type="image" src="img/visa.png"width=50>
     <input type="image" src="img/master.png"width=50>
     <input type="image"  src="img/jcb.png"width=50>
     </td>
    </tr>
    <tr>
   </table>
   <br>●クレジットカード情報の入力の間違い等にご注意いただき、下記項目をすべて入力し「支払い確認へ(仮)」を押してください。
   <br>●本人名義以外のカード（家族名義のカード含む）、盗難カード等での不正使用は重大な犯罪です。
   <br>●弊社ではデジタルIDを使用したSSL暗号化技術により、カード情報を暗号化しています。ご安心ください。
       <!--↑文字を小さく↑）-->
   <table border="1" cellspacing="0" cellpadding="0">
    <tr>
     <th>カード番号</th>
     <td><input type="text" name="card number" size="20">
	 <br>※ご本人名義のカードのみご利用いただけます。
     <br>※半角入力（ハイフンなし）　例：1234123412341234 </td>
    </tr>
	<tr>
     <th>有効期限</th>
      <td>
      <select name="moon">
       <option value="moon">1</option>
       <option value="moon">2</option>
       <option value="moon">3</option>
       <option value="moon">4</option>
       <option value="moon">5</option>
       <option value="moon">6</option>
       <option value="moon">7</option>
       <option value="moon">8</option>
       <option value="moon">9</option>
       <option value="moon">10</option>
       <option value="moon">11</option>
       <option value="moon">12</option>
      </select>
       /20
      <select name="year">
       <option value="year">17</option>
       <option value="year">18</option>
       <option value="year">19</option>
       <option value="year">20</option>
       <option value="year">21</option>
       <option value="year">22</option>
       <option value="year">23</option>
       <option value="year">24</option>
       <option value="year">25</option>
       <option value="year">26</option>
       <option value="year">27</option>
       <option value="year">28</option>
       <option value="year">29</option>
       <option value="year">30</option>
       <option value="year">31</option>
       <option value="year">32</option>
       <option value="year">33</option>
       <option value="year">34</option>
       <option value="year">35</option>
       <option value="year">36</option>
       <option value="year">37</option>
      </select>
      <br>カードの有効期限は通常「月／年（西暦下2桁）」で刻印されています。
      </td>
     </tr>
     <tr>
      <th>カード名義人</th>
      <td>
      <input type="text" name="card number" size="20">
      <br>※半角英数字（例：TARO YAMADA）
      </td>
     </tr>
     <tr>
      <th>支払い回数</th>
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
      <th>セキュリティーコード</th>
      <td><input type="text" name="security code" size="3">
      <br>
      <input type="image" src="img/security_code.png"width=50>
      主にカード裏面のご署名欄に印刷されている末尾3桁～4桁の数字です。
      </td>
     </tr>
    </table>
   <a href="./cart.jsp">戻る</a>
   <a href="./siharai_kakunin.jsp">次へ</a>
  </body>
</html>