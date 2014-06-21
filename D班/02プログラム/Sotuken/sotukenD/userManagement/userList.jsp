<!DOCTYPE html>
<%@ page contentType="text/html; charset=UTF-8"%>
<%@ page pageEncoding="UTF-8"%>
<%@ page import="java.util.ArrayList"%>
<%@ page import="jp.ac.fjb.sotukenD.bean.UserListBean"%>
<%@ page import="jp.ac.fjb.sotukenD.bean.LoginFormBeans"%>
<%
	LoginFormBeans loginBean = (LoginFormBeans) session
			.getAttribute("LOGIN_USER");
%>
<%
	ArrayList<UserListBean> list = (ArrayList) session
			.getAttribute("USER_LIST");
%>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<script src="/sotukenD/js/UserSign.js"></script>
<meta charset="utf-8" />
<title>レイアウトテスト</title>
<link rel="stylesheet" type="text/css" href="/sotukenD/css/style.css" />
<link rel="stylesheet" type="text/css" href="renraku.css" />

</head>
<body>
	<div class="frm">
		<!--header部分-->
		<header id="header">
			<div id="title">ユーザー管理画面</div>
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
				<form action="" id="ListForm">
					<!--ここから-->
					<table border="0" width="100%" cellpadding="2" cellspacing="1"
						bgcolor="#002047">
						<%
							for (int i = 0; i < list.size(); i++) {
								UserListBean listBean = list.get(i);
						%>
						<tr bgcolor="#FFFFFF" id="<%=i%>">

							<td width="13%"><font size="2"> <%=listBean.getListUserId()%></font>
							</td>
							<td width="30%"><font size="3"><%=listBean.getListUserName()%></font>
							</td>
							<td>
								<button type="submit" style="WIDTH: 80px; HEIGHT: 23px;"
									id="editButton" name="editButton" onClick="goEditServlet(0);"
									value="<%=listBean.getListUserId()%>">編集</button>
								<button type="submit" style="WIDTH: 80px; HEIGHT: 23px;"
									id="deleteButton" name="deleteButton"
									onClick="goListServlet('2');"
									value="<%=listBean.getListUserId()%>">削除</button></td>
						</tr>
						<%
							}
						%>
					</table>

					<input type="hidden" id="progId" name="progId" value="">
					<button type="submit" id="signButton" onClick="goSignServlet();"
						style="WIDTH: 100px; HEIGHT: 35px;">新規登録</button>
				</form>
			</div>
	</div>

</body>
</html>
