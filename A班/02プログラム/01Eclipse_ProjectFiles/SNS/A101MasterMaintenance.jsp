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
<link rel="StyleSheet" type="text/css" href="css/masterMaintenance.css" />
<script type="text/javascript" src="js/screenTransition.js"></script>
    <title>ConVertion</title>
</head>

<body style="background:#FFE4E1">
<form id="form" name="form" action="">
<div id="Logo"><img src="img/logo/logo.png" height="100" width="200" alt="タイトルロゴ"></div>

<div ul="SubMenu" style="list-style:none" id="SubMenu">
<li style="float:right"><input type="submit"  id="Button" style="WIDTH: 70px; HEIGHT: 30px" value="LogOut" onClick="goLoginServlet('-1');"></li>
<li style="float:right"><input type="submit"  id="Button" style="WIDTH: 70px; HEIGHT: 30px" value="Profile" onClick="goProfileServlet();"></li>

<li style="float:right"><input type="submit"  id="Button" style="WIDTH: 70px; HEIGHT: 30px" value="Help"  disabled></li>
<li style="float:right"><input type="submit"  id="Button" style="WIDTH: 70px; HEIGHT: 30px" value="Home" onClick="goMainServlet();">
</li>
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
	<h4>マスターメンテナンス</h4>
	<input type="submit" id="userList" style="WIDTH: 395px; HEIGHT: 80px"  value="ユーザ管理" onClick="goUserListServlet();">
	<input type="submit" id="userChangeInfo" style="WIDTH: 395px; HEIGHT: 80px" value="イベント管理" disabled>
	<input type="submit" id="userDelete" style="WIDTH: 395px; HEIGHT: 80px" value="お知らせ編集" disabled><br />
	<input type="submit" id="eventManage" style="WIDTH: 395px; HEIGHT: 80px" value="SNS設定" disabled>
	<input type="submit" id="editNotice" style="WIDTH: 395px; HEIGHT: 80px" value="管理ページ設定" disabled>
	<input type="button" id="userManage" style="WIDTH: 395px; HEIGHT: 80px" value="－" disabled><br />
	<input type="button" id="userManage" style="WIDTH: 395px; HEIGHT: 80px" value="－" disabled>
	<input type="button" id="userManage" style="WIDTH: 395px; HEIGHT: 80px" value="－" disabled>
	<input type="button" id="userManage" style="WIDTH: 395px; HEIGHT: 80px" value="－" disabled>
</div>

</form>

</body>
</html>
