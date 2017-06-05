<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
  <title>お問い合わせ入力画面</title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">


</head>
<body>
 <h1 class="contact-title">お問い合わせ内容入力画面</h1>

<link href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">

  <div class="container">



  <div class="row">
    <div class="col-sm-2">お名前</div>
    <div class="col-sm-10 form-inline" style="padding: 3px;">
      <input type="text" class="form-control input-sm" id="name" placeholder="お名前" size="20">
    </div>
  </div>
  <div class="row">
    <div class="col-sm-2">フリガナ</div>
    <div class="col-sm-10 form-inline" style="padding: 3px;">
      <input type="text" class="form-control input-sm" id="kana" placeholder="フリガナ" size="20">
    </div>
  </div>
 <div class="row">
    <div class="col-sm-2">電話番号</div>
    <div class="col-sm-10 form-inline" style="padding: 3px;">
      <input type="text" class="form-control input-sm" id="email" placeholder="電話番号" size="30">
    </div>
    </div>



  <div class="row">
    <div class="col-sm-2">Email</div>
    <div class="col-sm-10 form-inline" style="padding: 3px;">
      <input type="text" class="form-control input-sm" id="email" placeholder="Email" size="30">
    </div>
  </div>
  <div class="row">
    <div class="col-sm-2">ご意見をどうぞ</div>
    <div class="col-sm-10" style="padding: 3px;">
      <textarea class="form-control  input-sm" rows="3" id="comment" placeholder="ご意見をどうぞ"></textarea>
    </div>
  </div>

  <div class="text-center" style="padding: 30px;">


      <a href="toiawase_kakunin.jsp"><button type="button" class="btn btn-success">送信内容の確認</button></a>


  </div>
  </div>

</body>
</html>
