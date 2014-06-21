<%@ page language="java" contentType="text/html; charset=UTF-8" %>

<!DOCTYPE html>
<!--021ログイン画面 -->
<html>
	<head>
		<meta charset="UTF-8">
		<meta name="keywords" content="">
 		<meta name="description" content="">
 		<link rel="stylesheet" href="stylesheet/template/styleSheet.css" type="text/css"/>
 		<link rel="stylesheet" href="stylesheet/template/footer.css" type="text/css"/>
 		<link rel="stylesheet" href="stylesheet/template/form.css" type="text/css"/>
 		<link rel="stylesheet" href="stylesheet/021Login.css" type="text/css"/>

		<title>021ログイン画面</title>
	</head>

	<body>
		<!-- ヘッダー　-->
		<div id="header">
			<div id="wrap_header">

			</div>
		</div>
		<!--　メインコンテンツ　-->
		<div id="main">
			<!-- 右側の要素でここにはログインなどのコンテンツが含まれる -->
			<div id="right_contents">
				<!-- ただのスペース現在は何も置かない　 -->
				<div id="space">
					<!--　スペース　-->
				</div>
				<!--　ログイン 　-->
				<div id="login">
					■ID<br />
					<input class="frame" class="text" type="text" name="userid" autofocus /><br />
					■PASSWORD<br />
					<input class="frame" type="password" name="password" /><br />
					<input class="button" type="submit" value="ログイン" />
				</div>
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