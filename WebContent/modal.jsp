<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>

<!DOCTYPE html>
<html>
  <head>
    <meta charset=UTF-8>
    <title>Insert title here</title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="css/modal.css">
     <script type="text/javascript">js/modal.js</script>
  </head>
  <body>
    <!-- モーダルの中身 -->
    <div class="modal fade" id="item_detail_modal" tabindex="-1" role="dialog" aria-labelledby="remoteModalLabel" aria-hidden="true" data-show="true" data-keyboard="false">
      <div class="modal-dialog">
        <div class="modal-content">
          <div class="modal-header">
            <button type="button" class="close" data-dismiss="modal" aria-label="Close">
              <span aria-hidden="true">&times;</span>
            </button>
            <h4 class="modal-title" id="modalLabel">商品詳細</h4>
          </div><!-- /.modal-header -->
          <div class="modal-body">
            <!-- ここにモーダルの中身を記述します -->
            <iframe id="item_detail" name="item_detail" src="">











            </iframe>
          </div><!-- /.modal-body -->
          <div class="modal-footer">
            <button type="button" class="btn btn-secondary" data-dismiss="modal">閉じる</button>
          </div><!-- /.modal-footer -->
        </div> <!-- /.modal-content -->
      </div> <!-- /.modal-dialog -->
    </div> <!-- /.modal -->

  </body>

</html>