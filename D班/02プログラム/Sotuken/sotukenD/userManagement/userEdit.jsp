<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml">
<%@ page contentType="text/html; charset=UTF-8"%>
<%@ page pageEncoding="UTF-8"%>
<%@ page import="jp.ac.fjb.sotukenD.bean.UserEditBean"%>
<%@ page import="jp.ac.fjb.sotukenD.bean.LoginFormBeans"%>
<%
	LoginFormBeans loginBean = (LoginFormBeans) session
			.getAttribute("LOGIN_USER");
%>
<%
	UserEditBean listBean = (UserEditBean) session
			.getAttribute("LOGIN_EDIT");
	String kengen = (String) listBean.getEditUserKenE();
	String seibetu = (String) listBean.getEditUserSexE();
%>

<head>
<meta charset="utf-8" />
<title>レイアウトテスト</title>
<link rel="stylesheet" type="text/css" href="/sotukenD/css/style.css" />
<link rel="stylesheet" type="text/css" href="renraku.css" />
<script src="/sotukenD/js/UserSign.js"></script>
</head>
<body>
	<div class="frm">
		<!--header部分-->
		<header id="header">
			<div id="title">ユーザー情報編集</div>
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
						<tr bgcolor="#FFFFFF">
							<td width="13%" rowspan="10"><%=listBean.getEditUserIdE()%>
							</td>
							<td width="18%" rowspan="10"><%=listBean.getEditUserNameE()%>
							</td>
							<td width="18%"><font size="2">ユーザーID</font></td>
							<td><input type="text" name="editIdJ" size="15" id="editIdJ"
								"
								value="<%=listBean.getEditUserIdE()%>" /></td>
						</tr>

						<tr bgcolor="#FFFFFF">

							<td width="18%"><font size="2">パスワード</font></td>
							<td><input type="text" name="editPassJ" size="15"
								id="editPassJ" value="<%=listBean.getEditUserPassE()%>" />
							</td>
						</tr>
						<tr bgcolor="#FFFFFF">

							<td width="18%"><font size="2">氏名</font></td>
							<td><input type="text" name="editNameJ" size="15"
								id="editNameJ" value="<%=listBean.getEditUserNameE()%>" />
							</td>
						</tr>
						<tr bgcolor="#FFFFFF">

							<td width="18%"><font size="2">フリガナ</font></td>
							<td><input type="text" name="editHuriJ" size="15"
								id="editHuriJ" value="<%=listBean.getEditUserHuriE()%>" />
							</td>
						</tr>
						<tr bgcolor="#FFFFFF">

							<td width="18%"><font size="2">性別</font></td>
							<td><select name="editSexJ" id="editSexJ">
									<option value="男性" <%if (seibetu.equals("男性")) {%> selected
										<%}%>>男</option>
									<option value="女性" <%if (seibetu.equals("女性")) {%> selected
										<%}%>>女</option>
							</select></td>
						</tr>
						<tr bgcolor="#FFFFFF">

							<td width="18%"><font size="2">生年月日</font></td>
							<td><input type="text" name="editBirthJ" size="15"
								id="editBirthJ"
								value="<%=listBean.getEditUserBirthE().substring(0, 10)%>" />
							</td>
						</tr>
						<tr bgcolor="#FFFFFF">

							<td width="18%"><font size="2">住所</font></td>
							<td><input type="text" name="editHomeJ" size="30"
								id="editHomeJ" value="<%=listBean.getEditUserHomeE()%>" />
							</td>
						</tr>
						<tr bgcolor="#FFFFFF">

							<td width="18%"><font size="2">電話番号</font></td>
							<td><input type="text" name="editTellJ" id="editTellJ"
								size="15" value="<%=listBean.getEditUserTellE()%>" />
							</td>
						</tr>
						<tr bgcolor="#FFFFFF">

							<td width="18%"><font size="2">メールアドレス</font></td>
							<td><input type="text" name="editMailJ" id="editMailJ"
								value="<%=listBean.getEditUserAddressE()%>" />
							</td>
						</tr>
						<tr bgcolor="#FFFFFF">

							<td width="18%"><font size="2">権限</font></td>
							<td><select name="editKenJ" id="editKenJ">
									<option value="0" <%if (kengen.equals("0")) {%> selected <%}%>>
										一般</option>
									<option value="1" <%if (kengen.equals("1")) {%> selected <%}%>>
										管理者</option>
							</select></td>
						</tr>
					</table>
					<input type="button" value="戻る" style="WIDTH: 100px; HEIGHT: 35px;"
						onClick="goUserListServlet();"> <input type="submit"
						style="WIDTH: 100px; HEIGHT: 35px;" value="保存" name="commitButton"
						id="commitButton" onClick="goUserListServletP();"> <input
						type="hidden" id="beforeId" name="beforeId"
						value="<%=listBean.getEditUserIdE()%>"> <input
						type="hidden" id="progId" name="progId" value="">
				</form>
			</div>
	</div>
</body>
</html>
