<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>販売履歴</title>
</head>
<body>
	 <script src="//code.jquery.com/jquery-1.11.2.min.js"></script>
   	 <link href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">


    <script src="chart.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/Chart.js/2.1.4/Chart.min.js"></script>

    <div class="kannri_header">
        <h1>管理画面</h1><br>
        <ul class="nav nav-tabs">
            <li class="active"><a href="#">top</a></li>
            <li><a href="#">販売履歴</a></li>
            <li><a href="#">商品追加・変更</a></li>
            <li><a href="#">問い合わせ確認</a></li>
            <li><a href="#">ログアウト</a></li>
        </ul>
    </div>
    <table class="kounyuu_rireki">

        <caption>販売履歴</caption>

        <thead>
            <tr>
                <th width="80px">商品画像</th>
                <th width="80px">商品名</th>
                <th width="80px">価格</th>
                <th width="80px">販売個数</th>
                <th width="80px">購入金額</th>
                <th width="80px">購入日</th>
            </tr>
        </thead>

        <tbody>
            <tr>
                <td width="80px">画像</td>
                <td width="80px">打ち上げ</td>
                <td width="80px">400円</td>
                <td width="80px">200個</td>
                <td width="80px">6000円</td>
                <td width="80px">2017.2/3</td>
            </tr>
            <tr>
                <td width="80px">画像</td>
                <td width="80px">打ち上げ</td>
                <td width="80px">400円</td>
                <td width="80px">200個</td>
                <td width="80px">6000円</td>
                <td width="80px">2017.2/3</td>
            </tr>
            <tr>
                <td width="80px">画像</td>
                <td width="80px">打ち上げ</td>
                <td width="80px">400円</td>
                <td width="80px">200個</td>
                <td width="80px">6000円</td>
                <td width="80px">2017.2/3</td>
            </tr>
            <tr>
                <td width="80px">画像</td>
                <td width="80px">打ち上げ</td>
                <td width="80px">400円</td>
                <td width="80px">200個</td>
                <td width="80px">6000円</td>
                <td width="80px">2017.2/3</td>
            </tr>
        </tbody>

        <tfoot>
            <tr>
                <td width="80px">画像</td>
                <td width="80px">打ち上げ</td>
                <td width="80px">400円</td>
                <td width="80px">200個</td>
                <td width="80px">6000円</td>
                <td width="80px">2017.2/3</td>
            </tr>
        </tfoot>

    </table>
    <canvas id="mycanvas" height="450" width="800"></canvas>

</body>
</html>