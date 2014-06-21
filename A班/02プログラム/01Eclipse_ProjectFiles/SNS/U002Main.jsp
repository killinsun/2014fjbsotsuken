<%@page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8" %>
<%@page import="java.util.ArrayList"
		import="jp.ac.fjb.sns.bean.UserBean"
		import="jp.ac.fjb.sns.bean.RoomBean"%>
<%
	// ログインユーザの情報
	UserBean loginUser = (UserBean)session.getAttribute("LOGIN_USER");
	@SuppressWarnings("unchecked")
	ArrayList<RoomBean> list = (ArrayList<RoomBean>)session.getAttribute("HAVING_ROOM_LIST");
	String userPosition = (String)loginUser.getPositionId();
	System.out.println(userPosition);
	String roomCheck = (String)session.getAttribute("ROOM_ID");
%>
<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml">

<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
<link rel="StyleSheet" type="text/css" href="css/main.css" />
<link rel="stylesheet" type="text/css" href="css/calender.css" />
<script type="text/javascript" src="js/screenTransition.js"></script>
    <title>ConVertion</title>
</head>

<body style="background:#E0FFFF">
<form id="form" name="form" action="">
<div id="Logo"><img src="img/logo/logo.png" height="100" width="200" alt="タイトルロゴ"></div>

<div id="Kanri"></div>

<div ul="SubMenu" style="list-style:none" id="SubMenu">
<li style="float:right"><input type="submit"  id="Button" style="WIDTH: 70px; HEIGHT: 30px" value="LogOut" onClick="goMainServlet('-1');"></li>
<li style="float:right"><input type="submit"  id="Button" style="WIDTH: 70px; HEIGHT: 30px" value="Profile" onClick="goProfileServlet();"></li>
<li style="float:right"><input type="submit"  id="Button" style="WIDTH: 70px; HEIGHT: 30px" value="Help" disabled></li>
<li style="float:right"><input type="submit"  id="Button" style="WIDTH: 70px; HEIGHT: 30px" value="Home" disabled></li>
<li style="float:right">
	<%if (userPosition.equals("Y00") || userPosition.equals("Y01") || userPosition.equals("Y02") || userPosition.equals("Y03") || userPosition.equals("Y04")) { %>
	<input type="submit" id="admin" style="WIDTH: 70px; HEIGHT: 30px" value="Admin" onClick="goMasterMaintenanceServlet();">
	<%} else { %>
	<input type="submit" id="admin" style="WIDTH: 70px; HEIGHT: 30px" value="Admin" disabled>
	<%} %>
</li>

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

<div id="UserMenu">
<input type="submit"  id="Button" style="WIDTH: 395px; HEIGHT: 100px" value="ユーザー検索" onClick="goSearchServlet('0');">
<input type="submit"  id="Button" style="WIDTH: 395px; HEIGHT: 100px" value="アドバイス" onClick="goAdviceServlet();">
<input type="submit"  id="Button" style="WIDTH: 395px; HEIGHT: 100px" value="イベントカレンダースケジュール" onClick="goEventServlet();">
</div>

<!-- 部屋リスト -->

	<div id="RoomList" >
		<table id="Room" class="Room" >
			<%String cRoomId = roomCheck; %>
			<tr >
				<th>__</th>
				<th>ルーム名</th>
				<th width="55" >人数</th>
			</tr>
			<tr onClick="goMainServlet('E')" <%if (cRoomId.equals("E")){%>style="background:yellow"<%}%>>
				<td>☆</td>
				<td onclick="event()">お知らせ</td>
				<td align="center">∞</td>
			</tr>

<!-- DB:チャットルーム表参照 -->
			<%for(int i=0; i<list.size(); i++){
				RoomBean room = list.get(i);
			%>
				<%if(room.getUserId().equals(loginUser.getUserId())){%>
			<tr onClick="roomSelect('<%=room.getRoomId()%>')" <%if(cRoomId.equals(room.getRoomId())){%>style="background:yellow"<%}%>>
				<td>★</td>
				<td><%=room.getRoomName()%></td>
				<td align="right"><%=room.getCountId() %>人</td>
			</tr>
				<%} else {%>
			<tr onClick="roomSelect('<%=room.getRoomId()%>')" <%if(cRoomId.equals(room.getRoomId())){%>style="background:yellow"<%}%>>
				<td>☆</td>
				<td><%=room.getRoomName()%></td>
				<td align="right"><%=room.getCountId() %>人</td>
			</tr>
				<%}%>
			<%}%>
			<tr>
				<td></td>
				<td><input type="text" id="newRoomName" name="newRoomName" placeholder="部屋名を入力" ></td>

<!-- DB:チャットルーム表に格納 -->
				<td align="center" ><input type="submit" id="createNewRoom" name="createNewRoom"  value="作成" onClick="goMainServlet('1')"></td>
<!-- DB:チャットルーム表に格納 -->
			</tr>
		</table>
	</div>

<!-- チャット画面 -->

	<div id="chat" name="chat" >
		<div id="chatDis">
			<jsp:include page="U002Chat.jsp"></jsp:include>
		</div>

		<div id="chatText">
			<input type="text" name="message" id="message" size="77">
			<%if(roomCheck == null && (!userPosition.equals("Y00") || !userPosition.equals("Y01") || !userPosition.equals("Y02") || !userPosition.equals("Y03") || !userPosition.equals("Y04"))){ %>
				<input type="submit" value="送信" name="chatGo" id="chatGo" disabled>
			<%} else {%>
				<input type="submit" value="送信" name="chatGo" id="chatGo" onClick="goMainServlet('2')">
			<%}%>
		</div>
	</div>

	<div id="Calender">
		<script type="text/javascript" src="calender/calender.js"></script>
	</div>
	<input type="hidden" id="pid" name="pid" value="">
</form>

</body>
</html>
