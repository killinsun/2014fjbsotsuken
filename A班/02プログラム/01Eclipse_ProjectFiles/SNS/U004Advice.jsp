<%@page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8" %>
<%@page import="java.util.ArrayList" %>
<%@page import="jp.ac.fjb.sns.bean.PostBean"
		import="jp.ac.fjb.sns.bean.UserBean"%>
<%
	// ログインユーザの情報
	UserBean loginUser = (UserBean)session.getAttribute("LOGIN_USER");
	String userPosition = (String)loginUser.getPositionId();

	ArrayList<PostBean> list = (ArrayList)session.getAttribute("POST_LIST");
	ArrayList<PostBean> res = (ArrayList)session.getAttribute("RES_LIST");

	if (res == null) {
		res = new ArrayList();
	}

	PostBean selectPost = (PostBean)session.getAttribute("SELECT_BEAN");

	if (selectPost == null) {
		selectPost = new PostBean();
	}
%>

<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml">

<head>
	<meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
	<link rel="StyleSheet" type="text/css" href="css/advice.css" />
	<script type="text/javascript" src="js/screenTransition.js"></script>
    <title>AdviceSystem</title>
</head>

<body style="background:#E0FFFF">
<form id="form" name="form">
<input type="hidden" name="pid" id="pid">
<input type="hidden" name="contentId" id="contentId">


	<div id="Logo">
		<img src="img/logo/logo.png" height="100" width="200" alt="タイトルロゴ">
	</div>

	<div id="Kanri">
	</div>

	<div ul="SubMenu" style="list-style:none" id="SubMenu">
		<li style="float:right"><input type="submit"  id="Button" style="WIDTH: 70px; HEIGHT: 30px" value="LogOut" onClick="goMainServlet('-1');"></li>
		<li style="float:right"><input type="submit"  id="Button" style="WIDTH: 70px; HEIGHT: 30px" value="Profile" onClick="goProfileServlet();"></li>
		<li style="float:right"><input type="submit"  id="Button" style="WIDTH: 70px; HEIGHT: 30px" value="Help"  disabled></li>
		<li style="float:right"><input type="submit"  id="Button" style="WIDTH: 70px; HEIGHT: 30px" value="Home" onClick="goMainServlet();"></li>
		<li style="float:right">
			<%
				if (userPosition.equals("Y00") || userPosition.equals("Y01") || userPosition.equals("Y02") || userPosition.equals("Y03") || userPosition.equals("Y04")) {
			%>
			<input type="submit" id="admin" style="WIDTH: 70px; HEIGHT: 30px" value="Admin" onClick="goMasterMaintenanceServlet();">
			<%
				} else {
			%>
			<input type="submit" id="admin" style="WIDTH: 70px; HEIGHT: 30px" value="Admin" disabled>
			<%
				}
			%>
		</li>
	</div>

	<div id="LoginName">
		<div id="xLogo" align="center">
			<img src="<%=loginUser.getSectionImg()%>.png"><br />
			<img src="<%=loginUser.getPositionImg()%>">
		</div>
		<div id="yLogo"><img src="<%=loginUser.getLevelImg()%>.png"></div>
		<div id="zLogo"><font size="4">いらっしゃいませ。</font><br/><h3 align="right" ><%=loginUser.getUserName()%> 　様</h3></div>
		<div id="Name"></div>
	</div>

	<div id="UserMenu">
		<input type="submit"  id="Button" style="WIDTH: 395px; HEIGHT: 100px" value="ユーザー検索" onClick="goSearchServlet('0');">
		<input type="submit"  id="Button" style="WIDTH: 395px; HEIGHT: 100px" value="アドバイス" disabled>
		<input type="submit"  id="Button" style="WIDTH: 395px; HEIGHT: 100px" value="イベントカレンダースケジュール" onClick="goEventServlet();">
	</div>

	<div id="AdisQ">
		<div id="list">
			<table id="Koumoku" border="2" >
				<tr >
					<th width="50" align="center"><font size="5">項目</font></th>
					<th width="375"align="center"><font size="5">内容</font></th>
					<th width="130"align="center"><font size="5">返答数</font></th>
				</tr>
			</table>

			<div id="scr">
				<table id="Chat" border="1" >
					<%
						for(int i=0; i<list.size(); i++){
									PostBean bean = list.get(i);
					%>
					<tr onClick="contentList('<%=bean.getPostId()%>');">
						<th width="50" align="center"><%=bean.getItem()%></th>
						<th width="400"align="left"><%=bean.getContent()%></t>
						<td width="110"align="center"><%=bean.getCountRes()%></td>
					</tr>
					<%
						}
					%>
				</table>
			</div>
		</div>

			<select name="example" id="box">
				<option value="Z01">質問</option>
				<option value="Z02">情報</option>
			</select>

			<input type="text" name="text" id="text" size="68">
			<input type="submit" name="H" id="H"  value="送信" onClick="posting();">
	</div>

	<div id="AdisA">
		<div id="list">
			<table id="Koumoku" border="2">
				<tr >
					<th width="50" align="center"><font size="5">項目</font></th>
					<th width="510"align="center" ><font size="5"><%=selectPost.getContent()%><br /></font></th>
				</tr>
			</table>

			<div id="scr2">
				<table id="chat" border="1">
					<%
						for(int i=0; i<res.size(); i++){
																		PostBean bean = res.get(i);
					%>
					<tr>
						<th width="50" align="center"><%=bean.getItem()%></th>
						<th width="510"align="left"><%=bean.getContent()%></th>
					</tr>
					<%
					}
					%>
				</table>
			</div>
		</div>

			<select name="res" id="box">
				<option value="Z02">情報</option>
				<option value="Z03">返答</option>
			</select>

			<input type="text" name="resText" id="resText" size="68">
			<input type="submit" name="H" id="H" value="送信" onClick="sendRes();">
	</div>
</form>
</body>

</html>