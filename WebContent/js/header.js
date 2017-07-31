/**
 * ログイン時に画面遷移せずにヘッダーを切り替える JavaScript
 */
function login() {
  var data = {
    email : document.getElementById("login_email").value,
    password : document.getElementById("login_password").value
  }
  $.ajax({
    url : 'LoginAction.action',
    type : 'POST',
    data : data,
    dataType : 'html',
    success : function(data) {
      var out_html = $($.parseHTML(data));
      // ▼▼管理者のときの処理（分岐の条件が微妙）
      if (out_html.filter('#header')[0] == null) {
        $('body').empty().append(out_html);
      }
      $('#header').empty().append(out_html.filter('#header')[0].innerHTML);
    },
  })
}
