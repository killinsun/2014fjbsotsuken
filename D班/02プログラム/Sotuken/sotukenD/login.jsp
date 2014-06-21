<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>

<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <meta charset="utf-8" />
    <title>レイアウトテスト</title>
    <link rel="stylesheet" type="text/css" href="/sotukenD/css/style.css" />
    <link rel="stylesheet" type="text/css" href="/sotukenD/css/login.css" />
</head>
<body>
<div class="frm">
	<section id="loginTop">
		<div id="topImg">
			<img src="/sotukenD/img/photo_image1.gif">
		</div>

		<form id="loginForm" action="/sotukenD/LoginServlet">
			<p>
			UserID:<input type="text" name="userID">
			Password:<input type="password" name="userPass">
			</p>
			<p>
			<input type="submit"  value="ログイン"/>
			<input type="reset" value="リセット">
			</p>
		</form>

	</section>
</div>
</body>
</html>
