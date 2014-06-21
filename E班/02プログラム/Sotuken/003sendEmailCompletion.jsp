<%@page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<!--00X送信完了画面-->
<html>
	<head>
		<meta charset="UTF-8">
		<meta name="keywords" content="">
 		<meta name="description" content="">
 		<link rel="stylesheet" href="stylesheet/template/styleSheet.css" type="text/css"/>
 		<link rel="stylesheet" href="stylesheet/template/footer.css" type="text/css"/>
  		<link rel="stylesheet" href="stylesheet/003sendEmailCompletion.css" type="text/css"/>

		<title>003送信完了画面</title>
		<SCRIPT language="JavaScript">
		<!--
		// 一定時間経過後に指定ページにジャンプする
		mnt = 5; // 何秒後に移動するか？
		url = "http://localhost:8080/Sotuken/"; // 移動するアドレス
		function jumpPage() {
		   location.href = url;
		}
		 setTimeout("jumpPage()",mnt*1000)
		 //-->
		 </SCRIPT>
	</head>

	<body>
		<!--　ヘッダー　-->
		<div id="header">
			<div id="wrap_header">
				<img id="logo" src="img/logo.png" />
			</div>
		</div>

		<!--メイン-->
		<div id="main">
			<div id="message">
				<h3>
					送信が完了致しました。<br />
					メールアドレスにメールを送信致しましたので、ご確認下さい。
				</h3>
			</div>
		</div>

		<!-- フッター -->
		<div id="footer">

			<div id="wrap_footer">
				<!-- フッターはここに書く　 -->

			</div>
		</div>
	</body>
</html>
