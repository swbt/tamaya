<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>


<head>
 <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
 <title>お問い合わせ入力画面</title>
 <meta name="viewport" content="width=device-width, initial-scale=1.0">
 <script type="text/javascript">js/toiawase.js</script>
</head>
<body>

<link href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">

<div>
<div style="text-align : center">
            <h1 class="contact-title">お問い合わせ内容確認画面</h1>
            <p>お問い合わせ内容はこちらで宜しいでしょうか？<br>よろしければ「送信する」ボタンを押して下さい。</p>

                <div>
                    <label>お名前</label>
                    <br>
                <a href = "JavaScrpt:answer()"></a>
                </div>
                <div>
                    <label>ふりがな</label>
                    <br>
                <input type="text" size="20">
                </div>
                <div>
                    <label>メールアドレス</label>
                    <br>
                <input type="text" size="20">
                </div>
                <div>
                    <label>電話番号</label>
                    <br>
                <input type="text" size="20">
                </div>



                <div>
                    <label>お問い合わせ内容</label>
                    <br>
                <input type="text" size="50">
                </div>
            </div>
            <br>

            <div style="text-align : center">

        <a href="toiawase.jsp"><input type="button" value="内容を修正する" ></input></a>
        <a href="./toiawase_kanryo.jsp"><button type="submit" name="submit">お問い合わせ完了画面へ</button></a>
</div>
</div>
</body>



</html>