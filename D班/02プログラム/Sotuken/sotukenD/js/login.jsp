<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta charset="utf-8" />
<title>レイアウトテスト</title>
<link rel="stylesheet" type="text/css" href="style.css" />
<link rel="stylesheet" type="text/css" href="login.css" />
</head>
<body>
	<div class="frm">
		<section id="loginTop">
			<div id="topImg">
				<img src="photo_image1.gif">
			</div>

			<form id="loginForm">
				<p>
					UserID:<input type="text" id="userID"> Password:<input
						type="password" id="userPass">
				</p>
				<p>

					<button type="button"
						onclick="location.href='/sotukenD/LoginServlet'">ログイン</button>
					</a> <input type="reset" value="リセット">
				</p>
			</form>

		</section>
	</div>
</body>
</html>
