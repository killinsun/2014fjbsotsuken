<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml">
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page pageEncoding="UTF-8" %>
<%@ page import="jp.ac.fjb.sotukenD.bean.MailSFormBeans"%>
<%@ page import="java.util.ArrayList" %>
<%ArrayList<MailSFormBeans> userSize = (ArrayList)session.getAttribute("USER_LIST"); %>
<head>
    <meta charset="utf-8" />
    <title>受信箱</title>
    <link rel="stylesheet" type="text/css" href="./css/style.css" />
</head>
<body>
<form action="/sotukenD/MailSendServlet">
<div class="frm">
	<!--header部分-->
	<header id="header">
		<div id="title">
			メール送信
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
		宛先<br>
		<select name="sendAddress" size="1">
			<%for(int i = 0 ; i < userSize.size() ; i++){
					MailSFormBeans xx = userSize.get(i);%>
			<option value="<%=xx.getMailAddress() %>"><%=xx.getUserName() %></option>
			<%
			}
			%>
		</select>
		<br>
		件名<br>
		<INPUT size="50" type="text" name="title"><br>
		本文<br>
		<TEXTAREA cols="75" rows="18" name="mainText" ></TEXTAREA><br>
		<INPUT type="button" name="answer" value="戻る" style="WIDTH: 50px; HEIGHT: 30px; float:left;"
		onclick="location.href='/sotukenD/main.jsp'">
		<INPUT type="submit" name="answer" value="送信" style="WIDTH: 50px; HEIGHT: 30px; float:right;
		margin-right:20px;">

	</section>
</div>
</form>
</body>
</html>
