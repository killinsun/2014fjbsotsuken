<!DOCTYPE html>
<%@ page contentType="text/html; charset=UTF-8"%>
<%@ page pageEncoding="UTF-8"%>
<%@ page import="jp.ac.fjb.sotukenD.bean.MainFormBeans"%>
<%@ page import="java.util.ArrayList" %>
<% ArrayList<MainFormBeans> userMail = (ArrayList)session.getAttribute("USER_MAIL"); %>

<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta charset="utf-8" />
<title>レイアウトテスト</title>
<link rel="stylesheet" type="text/css" href="/sotukenD/css/style.css" />
<link rel="stylesheet" type="text/css" href="/sotukenD/css/main.css" />
<script src="/sotukenD/js/main.js"></script>
</head>
<body>
<form id="form">
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

			<iframe src="./mainMenu.jsp" name="mainMenu" Align="left"
				Frameborder="no" Marginheight="0" Width="200"> </iframe>

		</nav>


		<!--作業画面-->
		<section id="mainContent">
			<br />
			<button type="button" onclick="location.href='/sotukenD/MailSServlet'">新規メール</button>
			<br />
			<h2>受信メール</h2>
			<table id="mail" cellspacing="0" frame="box" border="1">
				<tr>
					<th width="5%"><input type="checkbox"></th>
					<th width="20%">送信者</th>
					<th width="10%"></th>
					<th width="65%">タイトル</th>
				</tr>
				<%for (int i = 0; i < userMail.size(); i++) {
					MainFormBeans xx = userMail.get(i); %>
				<tr>
					<td><input type="checkbox"></td>
					<td><%=xx.getUserName() %></td>
					<td></td>
					<td><a href="/sotukenD/MailServlet?mailId=<%=xx.getMailId() %>"  onclick="test('<%=xx.getMailId() %>')"><%=xx.getTitle() %></a>

					</td>
				</tr>
				<%
				}
				%>
			</table>
			<input type="submit" value="選択を削除">
			<input type ="hidden" value=" " id="mailId" name="mailId" >
		</section>
	</div>
</form>
</body>
</html>
