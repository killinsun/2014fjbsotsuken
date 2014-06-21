<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml">
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page pageEncoding="UTF-8" %>
<head>
    <meta charset="utf-8" />
    <title>日報送信</title>
<link rel="stylesheet" type="text/css" href="/sotukenD/css/style.css" />
</head>
<body><form id="form">
	<div class="frm">
		<!--header部分-->
		<header id="header">
			<div id="title">トップページ</div>
			<div id="account" align="right">
				<div id="name">苗字 名前</div>
				<!--ログアウトボタン-->
				<button type="button" id="logout">ログアウト</button>
			</div>
			<div>　
			</div>
		</header>

		<!--ページ移動、ナビゲーション部分-->
		<nav id="nav">

			<iframe src="/sotukenD/mainMenu.jsp" name="mainMenu" Align="left"
				Frameborder="no" Marginheight="0" Width="200"> </iframe>

		</nav>


		<!--作業画面-->
	<section id="mainContent">
		件名<br>
		<INPUT size="50" type="text" value="" name="subject"><br>
		本文<br>
		<TEXTAREA cols="75" rows="20" name="maneText"></TEXTAREA><br>
		<INPUT type="button" name="confirmation" value="送信" style="WIDTH: 50px; HEIGHT: 30px">
	</section>
	</div>
</form>
</body>
</html>
