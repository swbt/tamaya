<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%--国際化用 --%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<%--国際化用 --%>
<fmt:setLocale value="${pageContext.request.locale.language}" />
<fmt:setBundle basename="com.internousdev.tamaya.property.tokusyu" var="lang" />
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<title><s:text name="lang.tokusyu.title" /></title>
<meta name="description"
	content="An interactive getting started guide for Brackets.">
<link rel="stylesheet" href="./css/tokusyu.css">
<link rel="stylesheet" type="text/css" href="./css/cart.css">
<link rel="stylesheet" type="text/css" href="css/btn.css">
<link rel="stylesheet" type="text/css" href="css/move.css">
<script src="js/move.js"></script>
<!-- jQuery -->
<script src="http://ajax.googleapis.com/ajax/libs/jquery/1.9.1/jquery.min.js"></script>
</head>
<body>

	<p style="color: #FF55FF"><s:text name="lang.tokusyu.page" /></p>
	<h2 style="color: #668ad8"><s:text name="lang.tokusyu.h2-family" /></h2>
	<h3 style="color: #00FF00"><s:text name="lang.tokusyu.h3-item1" /></h3>
	<a href="GoItemListAction"><img src="img/gold_spark.jpg" width=150 alt="画像の説明文"></a>


	<p>金色の光が力強く降り注ぎ、いくつもの火花が舞い散ります。</p>
	<p>持続時間も３０秒と長く、満足して頂ける一品です。</p>
	<h4 style="color:red;"><s:text name="lang.tokusyu.h4" /></h4>
	<p>子供と一緒に楽しみました。</p>
	<p>すぐに終わらないので子供も喜んでいました。</p>

	<h3 style="color: #00FF00"><s:text name="lang.tokusyu.h3-item2" /></h3>
	<a href="GoItemListAction"><img src="img/powerful_sanhenge.jpg" width=150 alt="画像の説明文"></a>

	<p>赤・青・黄色の火花が力強く噴き出します。</p>
	<p>持ちも良く、長時間花火を楽しめます。</p>
	<h4 style="color:red;"><s:text name="lang.tokusyu.h4" /></h4>
	<p>途中から色が２回も変わりとてもキレイでみとれてしまいました。</p>
	<p>子供も喜んでいました。</p>

	<h3 style="color: #00FF00"><s:text name="lang.tokusyu.h3-item3" /></h3>
	<a href="GoItemListAction"><img src="img/baribar_3susuki.jpg" width=150 alt="画像の説明文"></a>
	<p>パチパチと音を立てながら緑・赤・黄色に三変化をします。</p>
	<p>簡単に点火することができる手持ち花火です。</p>
	<h4 style="color:red;"><s:text name="lang.tokusyu.h4" /></h4>
	<p>音も楽しむことができる花火だと記載されていたので</p>
	<p>思わず購入しました。いい音させながらキレイな花火でした。</p>

	<h2 style="color: #668ad8"><s:text name="lang.tokusyu.h2-couple" /></h2>
	<div class="box">
		<h3 style="color: #00FF00"><s:text name="lang.tokusyu.h3-item4" /></h3>
		<a href="GoItemListAction"><img src="img/hanahana.png" width=150 alt="画像の説明文"></a>
		<p>職人が腕によりをかけた高級線香花火です。</p>
		<p>力強く燃えた後儚く散っていく様子は一見の価値ありです。</p>
		<h4 style="color:red;"><s:text name="lang.tokusyu.h4" /></h4>
		<p>高級な線香花火なので彼女に喜んでもらえるかなと</p>
		<p>奮発して購入。期待を裏切らない一品でした。</p>

		<h3 style="color: #00FF00"><s:text name="lang.tokusyu.h3-item5" /></h3>
		<a href="GoItemListAction"><img src="img/kirameki_botanbana.jpg" width=150 alt="画像の説明文"></a>
		<p>日本伝統の線香花火です。</p>
		<p>儚くも切ない灯火は最後の締めにヒッタリです。</p>
		<h4 style="color:red;"><s:text name="lang.tokusyu.h4" /></h4>
		<p>花火の〆といったらやっぱり線香花火ですよね。</p>
		<p>二人でどっちがながくできるか勝負なんて楽しい花火です♪</p>

		<h3 style="color: #00FF00"><s:text name="lang.tokusyu.h3-item6" /></h3>
		<a href="GoItemListAction"><img src="img/omikuzi.jpg" width=150 alt="画像の説明文"></a>
		<p>花火の色で運勢が占えるおみくじ式花火です。</p>
		<p>大吉がオレンジ、中吉が白、小吉が緑、吉が赤になります。</p>
		<h4 style="color:red;"><s:text name="lang.tokusyu.h4" /></h4>
		<p>最初に花火の色がわからなく何がでるのかワクワクします！</p>
		<p>大吉がでても他のもやってしまうんですけどね！笑</p>

		<h2 style="color: #668ad8"><s:text name="lang.tokusyu.h2-people" /></h2>
	</div>
	<div class="box">
		<h3 style="color: #00FF00"><s:text name="lang.tokusyu.h3-item7" /></h3>
		<a href="GoItemListAction"><img src="img/megaton_bag.jpg" width=150 alt="画像の説明文"></a>
		<p>５１ℓの最大級花火をご用意いたしました。</p>
		<p>厳選した１４４本の花火をお楽しみください。</p>
		<h4 style="color:red;"><s:text name="lang.tokusyu.h4" /></h4>
		<p>大人数ならとりあえずコイツを買っておけば安心！</p>
		<p>たくさんの種類がはいっていて楽しめました！</p>
		<p></p>
		<h3 style="color: #00FF00"><s:text name="lang.tokusyu.h3-item8" /></h3>
		<a href="GoItemListAction"><img src="img/yamato_damashi.jpg" width=150 alt="画像の説明文"></a>
		<p>赤・青・黄色の大きな丸玉が空高く打ち上がります。</p>
		<p>太鼓のような音を上げ、舞い上がる様子は大和魂そのものです。</p>
		<h4 style="color:red;"><s:text name="lang.tokusyu.h4" /></h4>
		<p>打ち上げ花火がみたいと思ったらおススメです！</p>
		<p>身体まで音が感じれます！</p>

		<h3 style="color: #00FF00"><s:text name="lang.tokusyu.h3-item9" /></h3>
		<a href="GoItemListAction"><img src="img/ganbaro_noppon.jpg" width=150 alt="画像の説明文"></a>
		<p>青・赤・黄色・白・銀の５色の光が交互に噴出します。</p>
		<p>徐々に大きくなっていく復興祈願の花火です。</p>
		<h4 style="color:red;"><s:text name="lang.tokusyu.h4" /></h4>
		<p>復興祈願の花火ということもあって買ってみました</p>
		<p>勢いよく噴出される花火に元気づけされます！</p>
</div>
		<div class="button2"><a href="top.jsp"><s:text name="lang.tokusyu.top-return" /></a></div>
		<p id="pageTop"><a href="#"><s:text name="lang.tokusyu.move" /></a></p>
</body>
</html>