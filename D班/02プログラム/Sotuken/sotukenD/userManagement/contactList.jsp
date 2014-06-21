<!DOCTYPE html>
<%@ page contentType="text/html; charset=UTF-8"%>
<%@ page pageEncoding="UTF-8"%>
<%@ page import="java.util.ArrayList"%>
<%@ page import="jp.ac.fjb.sotukenD.bean.UserContactBean"%>
<%@ page import="jp.ac.fjb.sotukenD.bean.LoginFormBeans"%>
<%
	ArrayList<UserContactBean> list = (ArrayList) session
			.getAttribute("USER_CONTACT");
%>
<%
	LoginFormBeans loginBean = (LoginFormBeans) session
			.getAttribute("LOGIN_USER");
%>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta charset="utf-8" />
<title>レイアウトテスト</title>
<link rel="stylesheet" type="text/css" href="/sotukenD/css/style.css" />
<link rel="stylesheet" type="text/css" href="renraku.css" />

</head>
<body>
	<div class="frm">
		<!--header部分-->
		<header id="header">
			<div id="title">連絡先一覧</div>
			<div id="account" align="right">
				<div id="name"><%=loginBean.getUserName()%></div>
				<!--ログアウトボタン-->
				<button type="submit" id="logout"
					onclick="location.href='/sotukenD/LogoutServlet'">ログアウト</button>
			</div>
			<div>　</div>

		</header>

		<!--ページ移動、ナビゲーション部分-->
		<nav id="nav">

			<iframe src="/sotukenD/mainMenu.jsp" name="mainMenu" Align="left"
				Frameborder="no" Marginheight="0" Width="200"> </iframe>

		</nav>
		<!--作業画面-->
		<section id="mainContent">
			<div id="zentai">
				<table border="0" width="100%" height="15" cellpadding="2"
					cellspacing="1" bgcolor="#002047">
				</table>

				<!--ここから-->
				<table border="0" width="100%" cellpadding="2" cellspacing="1"
					bgcolor="#002047">
					<%
						for (int i = 0; i < list.size(); i++) {
							UserContactBean contactBean = list.get(i);
					%>
					<tr bgcolor="#FFFFFF">

						<td width="13%" height="23"><font size="2"> <%=contactBean.getContactUserId()%></font>
						</td>
						<td width="30%" height="23"><font size="3"><%=contactBean.getContactUserName()%></font>
						</td>
						<td><font size="3" height="23"><%=contactBean.getContactUserTell()%></font>
						</td>
					</tr>
					<%
						}
					%>
				</table>
			</div>
	</div>

</body>
</html>
