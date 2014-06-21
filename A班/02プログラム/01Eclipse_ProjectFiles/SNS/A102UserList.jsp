<%@page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8" %>
<%@page import="jp.ac.fjb.sns.bean.UserBean"%>

<%
	// ログインユーザの情報
	UserBean loginUser = (UserBean)session.getAttribute("LOGIN_USER");
%>
<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml">

<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
<link rel="StyleSheet" type="text/css" href="css/userList.css" />
<script type="text/javascript" src="js/screenTransition.js"></script>
    <title>ConVertion</title>
</head>

<body style="background:#FFE4E1">
<form id="form" name="form" action="">
<div id="Logo"><img src="img/logo/logo.png" height="100" width="200" alt="タイトルロゴ"></div>


<div ul="SubMenu" style="list-style:none" id="SubMenu">
<li style="float:right"><input type="submit"  id="Button" style="WIDTH: 70px; HEIGHT: 30px" value="LogOut" onClick="goMainServlet('-1');"></li>
<li style="float:right"><input type="submit"  id="Button" style="WIDTH: 70px; HEIGHT: 30px" value="Profile" onClick="goProfileServlet();"></li>
<li style="float:right"><input type="submit"  id="Button" style="WIDTH: 70px; HEIGHT: 30px" value="Help"  disabled></li>
<li style="float:right"><input type="submit"  id="Button" style="WIDTH: 70px; HEIGHT: 30px" value="Home" onClick="goMainServlet();"></li>
<li style="float:right"><input type="submit"  id="Button" style="WIDTH: 70px; HEIGHT: 30px" value="Admin" disabled></li>
</div>

	<div id="LoginName">
		<div id="xLogo" align="center">
			<img src="<%=loginUser.getSectionImg()%>.png"><br />
			<img src="<%=loginUser.getPositionImg()%>">
		</div>
		<div id="yLogo"><img src="<%=loginUser.getLevelImg()%>.png"></div>
		<div id="zLogo"><font size="4">いらっしゃいませ。</font><br/><h3 align="right" ><%=loginUser.getUserName() %> 　様</h3></div>
		<div id="Name"></div>
	</div>

<div id="manage">
	<hr>
	<b>ユーザ一覧</b><input type="submit" id="createUser" style="WIDTH: 110px; HEIGHT: 30px" value="ユーザ新規登録 " onClick="goCreateUserServlet();"><input type="button" id="usersearch" style="WIDTH: 110px; HEIGHT: 30px" value="ユーザ検索"><input type="button" id="useredit" style="WIDTH: 110px; HEIGHT: 30px" value="ユーザ情報変更"><input type="button" id="userdel" style="WIDTH: 110px; HEIGHT: 30px" value="ユーザ消去">
	<div id="list">
		<table id="userList" border="1" bgcolor="white">
			<tr>
				<th>選択</th>
				<th>ユーザID</th>
				<th>ユーザ名</th>
				<th>権限</th>
				<th>部署</th>
				<th>役職</th>
				<th>勤務地</th>
				<th>連絡先</th>
				<th>Eメール</th>
				<th>住所</th>
			</tr>
			<tr>
				<td><input type="checkbox" id="select" value="0"></td>
				<td>x11g031</td>
				<td>吉田 優徳</td>
				<td>ADMIN.</td>
				<td>代表取締役</td>
				<td>社長</td>
				<td>本社</td>
				<td></td>
				<td></td>
				<td></td>
			</tr>
			<tr>
				<td><input type="checkbox" id="select" value="1"></td>
				<td>x11g023</td>
				<td>奈須 健太</td>
				<td>USER</td>
				<td>総務部</td>
				<td>部長</td>
				<td>本社</td>
				<td></td>
				<td></td>
				<td></td>
			</tr>
			<tr>
				<td><input type="checkbox" id="select" value="2"></td>
				<td>x11g005</td>
				<td>石橋 太樹</td>
				<td>USER</td>
				<td>総務部</td>
				<td>部長</td>
				<td>支社</td>
				<td></td>
				<td></td>
				<td></td>
			</tr>
			<tr>
				<td><input type="checkbox" id="select" value="3"></td>
				<td>x11g029</td>
				<td>山本 樹</td>
				<td>USER</td>
				<td>総務部</td>
				<td>部長</td>
				<td>支社</td>
				<td></td>
				<td></td>
				<td></td>
			</tr>
			<tr>
				<td><input type="checkbox" id="select" value="4"></td>
				<td>x11g017</td>
				<td>鈴木 健太</td>
				<td>USER</td>
				<td>総務部</td>
				<td>部長</td>
				<td>支社</td>
				<td></td>
				<td></td>
				<td></td>
			</tr>
			<tr>
				<td><input type="checkbox" id="select" value="5"></td>
				<td>x11g000</td>
				<td>船橋 太郎</td>
				<td>ADMIN.</td>
				<td>開発部</td>
				<td>執行役員</td>
				<td>本社</td>
				<td></td>
				<td></td>
				<td></td>
			</tr>
			<tr>
				<td><input type="checkbox" id="select" value="6"></td>
				<td>x11g---</td>
				<td>-----</td>
				<td>---</td>
				<td>-----</td>
				<td>---</td>
				<td>--</td>
				<td></td>
				<td></td>
				<td></td>
			</tr>
			<tr>
				<td><input type="checkbox" id="select" value="7"></td>
				<td>x11g---</td>
				<td>-----</td>
				<td>---</td>
				<td>-----</td>
				<td>---</td>
				<td>--</td>
				<td></td>
				<td></td>
				<td></td>
			</tr>
			<tr>
				<td><input type="checkbox" id="select" value="8"></td>
				<td>x11g---</td>
				<td>-----</td>
				<td>---</td>
				<td>-----</td>
				<td>---</td>
				<td>--</td>
				<td></td>
				<td></td>
				<td></td>
			</tr>
			<tr>
				<td><input type="checkbox" id="select" value="9"></td>
				<td>x11g---</td>
				<td>-----</td>
				<td>---</td>
				<td>-----</td>
				<td>---</td>
				<td>--</td>
				<td></td>
				<td></td>
				<td></td>
			</tr>
			<tr>
				<td><input type="checkbox" id="select" value="10"></td>
				<td>x11g---</td>
				<td>-----</td>
				<td>---</td>
				<td>-----</td>
				<td>---</td>
				<td>--</td>
				<td></td>
				<td></td>
				<td></td>
			</tr>
			<tr>
				<td><input type="checkbox" id="select" value="11"></td>
				<td>x11g---</td>
				<td>-----</td>
				<td>---</td>
				<td>-----</td>
				<td>---</td>
				<td>--</td>
				<td></td>
				<td></td>
				<td></td>
			</tr>
			<tr>
				<td><input type="checkbox" id="select" value="12"></td>
				<td>x11g---</td>
				<td>-----</td>
				<td>---</td>
				<td>-----</td>
				<td>---</td>
				<td>--</td>
				<td></td>
				<td></td>
				<td></td>
			</tr>
			<tr>
				<td><input type="checkbox" id="select" value="13"></td>
				<td>x11g---</td>
				<td>-----</td>
				<td>---</td>
				<td>-----</td>
				<td>---</td>
				<td>--</td>
				<td></td>
				<td></td>
				<td></td>
			</tr>
			<tr>
				<td><input type="checkbox" id="select" value="14"></td>
				<td>x11g---</td>
				<td>-----</td>
				<td>---</td>
				<td>-----</td>
				<td>---</td>
				<td>--</td>
				<td></td>
				<td></td>
				<td></td>
			</tr>
			<tr>
				<td><input type="checkbox" id="select" value="15"></td>
				<td>x11g---</td>
				<td>-----</td>
				<td>---</td>
				<td>-----</td>
				<td>---</td>
				<td>--</td>
				<td></td>
				<td></td>
				<td></td>
			</tr>
			<tr>
				<td><input type="checkbox" id="select" value="16"></td>
				<td>x11g---</td>
				<td>-----</td>
				<td>---</td>
				<td>-----</td>
				<td>---</td>
				<td>--</td>
				<td></td>
				<td></td>
				<td></td>
			</tr>
		</table>
	</div>
</div>
</form>

</body>
</html>
