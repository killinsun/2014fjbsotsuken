<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml">
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page pageEncoding="UTF-8" %>
<%@ page import="jp.ac.fjb.sotukenD.bean.MailFormBeans"%>
<% MailFormBeans mail = (MailFormBeans)session.getAttribute("USER_MAILJ"); %>
<head>
    <meta charset="utf-8" />
    <title>受信箱</title>
    <link rel="stylesheet" type="text/css" href="./css/style.css" />
</head>
<body>
<div class="frm">
	<!--header部分-->
	<header id="header">
		<div id="title">
			受信メール
		</div>
		<div id="account" align="right">
			<div id="name"></div>
			<!--ログアウトボタン-->
				<button type="button" id="logout">ログアウト</button>
			</div>
			<div>　
			</div>

	</header>


	<!--ページ移動、ナビゲーション部分-->
	<nav id="nav">

			<iframe src="./mainMenu.jsp" name="mainMenu" Align="left" Frameborder="no" Marginheight="0" Width="200">

			</iframe>

	</nav>


	<!--作業画面-->
	<section id="mainContent">
		<% MailFormBeans mm = mail; %>
		送信者<br />
		<input type="text" value="<%=mm.getUserName() %>"><br />
		件名<br />
		<input type="text" value="<%=mm.getTitle() %>"><br />
		本文<br />
		<TEXTAREA cols="75" rows="18" name="maneText" ><%=mm.getMain() %></TEXTAREA><br />
		<INPUT type="button" name="answer" value="戻る" style="WIDTH: 50px; HEIGHT: 30px; float:left;"
		onclick="location.href='/sotukenD/main.jsp'"/>
		<INPUT type="button" name="answer" value="返信" style="WIDTH: 50px; HEIGHT: 30px; float:right;
		margin-right:20px;"onclick="location.href='/sotukenD/MailSServlet'"/>

	</section>
</div>

</body>
</html>
