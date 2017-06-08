<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>

<!DOCTYPE html>
<html>
  <head>
    <meta charset="utf-8">
    <title>種類別(噴出)</title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <!-- Stylesheet
    ==================================================
    -->
    <link rel="stylesheet" type="text/css"  href="css/bootstrap.min.css">
    <!--

    <link rel="stylesheet" type="text/css" href="css/＠＠＠.css">
    <link rel="stylesheet" type="text/css" href="">
    -->
    <!-- Javascripts
    ================================================== -->
    <script src="js/jquery-3.2.1.min.js"></script>
    <script src="js/bootstrap.min.js"></script>
    <s:if test="#session.loginFlg == true">
      <script>
        $(function(){
          $("#header").load("login_header.jsp");
        });
      </script>
    </s:if>
    <s:else>
      <script>
        $(function(){
          $("#header").load("header.jsp");
        });
      </script>
    </s:else>
<link rel="stylesheet" type="text/css" href="./css/kakaku0000.css" media="all">

  </head>
  <body>
    <div id="header"></div>
    <ul class="nav">
    <li class="nav__item1"><a href="hunsyutu.jsp">噴出</a></li>
    <li class="nav__item"><a href="temoti.jsp">手持ち</a></li>
    <li class="nav__item"><a href="utiage.jsp">打ち上げ</a></li>
    <li class="nav__item"><a href="sonota.jsp">その他</a></li>
	</ul>

<ul style="list-style:none;">
     <li class="test">
      <img src="img/image.jpg" width=200 data-toggle="modal" data-target="#syousai">
      <img src="img/image.jpg" width=200 data-toggle="modal" data-target="#syousai">
      <img src="img/image.jpg" width=200 data-toggle="modal" data-target="#syousai">
      <br>
      <img src="img/image.jpg" width=200 data-toggle="modal" data-target="#syousai">
      <img src="img/image.jpg" width=200 data-toggle="modal" data-target="#syousai">
      <img src="img/image.jpg" width=200 data-toggle="modal" data-target="#syousai">
      <br>
      <img src="img/image.jpg" width=200 data-toggle="modal" data-target="#syousai">
      <img src="img/image.jpg" width=200 data-toggle="modal" data-target="#syousai">
      <img src="img/image.jpg" width=200 data-toggle="modal" data-target="#syousai">

</li>
</ul>


    ※モーダル画面で商品詳細

      <!-- モーダルの中身 -->
      <div class="modal" id="syousai" tabindex="-1" role="dialog" aria-labelledby="modalLabel" aria-hidden="true">
        <div class="modal-dialog" role="document">
          <div class="modal-content">
            <div class="modal-header">
              <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                <span aria-hidden="true">&times;</span>
              </button>
              <h4 class="modal-title" id="modalLabel">手持ち花火１</h4>
            </div>
            <div class="modal-body">
              <!-- ここにモーダルの中身を記述します -->
              <img src="img/test01_.jpg" align="left">
              手持ち花火１<br>
              商品説明<br>
              値段<br>
            </div>
            <div class="modal-footer">
              <button type="button" class="btn btn-secondary" data-dismiss="modal">閉じる</button>
            </div>
          </div>
        </div>
      </div>


  </body>
</html>