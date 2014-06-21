<%@page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8" %>
<%@page import="java.util.ArrayList"
		import="jp.ac.fjb.sns.bean.OutputSearchResultBean"
		import="jp.ac.fjb.sns.bean.RoomBean"
		import="jp.ac.fjb.sns.bean.UserBean"%>
<%
	// ログインユーザの情報
	UserBean loginUser = (UserBean)session.getAttribute("LOGIN_USER");
	String userPosition = (String)loginUser.getPositionId();
	// 検索結果ユーザのリスト
	@SuppressWarnings("unchecked")
	ArrayList<OutputSearchResultBean> resultList = (ArrayList<OutputSearchResultBean>)session.getAttribute("RESULT_USER_LIST");
	// 選択中ユーザのリスト
	@SuppressWarnings("unchecked")
	ArrayList<OutputSearchResultBean> selectedList = (ArrayList<OutputSearchResultBean>)session.getAttribute("SELECTED_USER_LIST");
	// DBに存在するチャットルームのリスト
	@SuppressWarnings("unchecked")
	ArrayList<RoomBean> roomList = (ArrayList<RoomBean>)session.getAttribute("HAVING_ROOM_LIST");
%>

<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml">

<head>
	<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
	<link rel="StyleSheet" type="text/css" href="css/search.css" />
	<script type="text/javascript" src="js/screenTransition.js"></script>
	<script type="text/javascript" src="js/selecterClick.js"></script>
	<title>ConVertion</title>
</head>

<body>
	<form id="form" name="action" action="">
		<div id="logo">
			<img src="img/logo/logo.png" height="100" width="200" alt="タイトルロゴ" />
		</div>

		<div id="subMenu">
			<ul id="menu">
				<li id="m"><input type="submit" id="subm" value="LogOut" onClick="goMainServlet('-1');" /></li>
				<li id="m"><input type="submit" id="subm" value="Profile" onClick="goProfileServlet();" /></li>
				<li id="m"><input type="submit" id="subm" value="Help" disabled /></li>
				<li id="m"><input type="submit" id="subm" value="Home" onClick="goMainServlet('0');" /></li>
				<li id="m">
					<%if (userPosition.equals("Y00") || userPosition.equals("Y01") || userPosition.equals("Y02") || userPosition.equals("Y03") || userPosition.equals("Y04")) { %>
					<input type="submit" id="subm" value="Admin" onClick="goMasterMaintenanceServlet();" />
					<%} else { %>
					<input type="submit" id="subm" value="Admin" disabled />
					<%} %>
				</li>
			</ul>
		</div>

		<div id="loginName">
			<div id="xLogo" align="center">
				<img src="<%=loginUser.getSectionImg()%>.png" alt="<%=loginUser.getSectionName()%>" /><br />
				<img src="<%=loginUser.getPositionImg()%>"  alt="<%=loginUser.getPositionName()%>" />
			</div>
			<div id="yLogo">
				<img src="<%=loginUser.getLevelImg()%>.png" alt="<%=loginUser.getLevelName()%>" />
			</div>
			<div id="zLogo">
				<font size="4">いらっしゃいませ。</font><br />
				<h3 align="right" ><%=loginUser.getUserName() %>　様</h3>
			</div>
		</div>

		<div id="userMenu">
			<input type="submit" id="mainMenu" value="ユーザー検索" disabled />
			<input type="submit" id="mainMenu" value="アドバイス" onClick="goAdviceServlet();" />
			<input type="submit" id="mainMenu" value="イベントカレンダースケジュール" onClick="goEventServlet();" />
		</div>

		<div id="searchArea">
			<p>
				ユーザ名で検索：<br />
				<input type="text" id="nameSearch" name="nameSearch" size="30" autofocus />
			</p>
			<p>
				性別：<br />
				<select id="selectGender" name="selectGender">
					<option value="" selected>特に絞らない</option>
					<option value="男">男</option>
					<option value="女">女</option>
				</select>
			</p>
			<p>
				年齢：<br />
				<select id="selectAge" name="selectAge">
					<option value="10" selected>特に絞らない</option>
					<option value="20">20代以上</option>
					<option value="30">30代以上</option>
					<option value="40">40代以上</option>
					<option value="50">50代以上</option>
				</select>
			</p>
			<p>
				所属部署：<br />
				<select id="selectSection" name="selectSection">
					<option value="" selected>特に絞らない</option>
					<option value="B00">代表取締役</option>
					<option value="B01">事業部</option>
					<option value="B02">開発部</option>
					<option value="B03">営業部</option>
					<option value="B04">経理部</option>
					<option value="B05">人事部</option>
					<option value="B06">総務部</option>
				</select>
			</p>
			<p>
				在社歴：<br />
				<input type="number" id="numCarrier" name="numCarrier" />年以上
			</p>
			<p>
				フリーワード：<br />
				<input type="text" id="freeWordSearch" name="freeWordSearch" />
			</p>
				所持資格：
			<table>
				<tr>
					<td colspan="2"><input type="checkbox" id="checkLisence" name="checkLisence" value="S00" />ITパスポート</td>
					<td colspan="2"><input type="checkbox" id="checkLisence" name="checkLisence" value="S01" />基本情報技術者</td>
				</tr>
				<tr>
					<td colspan="2"><input type="checkbox" id="checkLisence" name="checkLisence" value="S02" />応用情報技術者</td>
					<td colspan="2"><input type="checkbox" id="checkLisence" name="checkLisence" value="S06" />プロジェクトマネージャ</td>
				</tr>
			</table>
			<input type="submit" id="searchButton" name="searchButton" value="検索" onClick="goSearchServlet('1')" />
		</div>

		<div id="resultArea">
			<div id="resultHeader">
				<b>検索結果</b>
				<hr />
			</div>
				<table id="table">
					<tr>
						<th width="35px">選択</th>
						<th width="158px">名前</th>
						<th width="35px">性別</th>
						<th width="64px">部署</th>
						<th width="92px">在社暦</th>
						<th width="70px">レベル</th>
					</tr>
				</table>
			<div id="resultList">
				<table id="table">
					<%
					if(resultList != null) {
						for (int i=0; i<resultList.size(); i++) {
							OutputSearchResultBean osfb = resultList.get(i);
					%>
					<tr background="img/style/sash.gif" height="32">
						<td width="35px"><input type="image" src="img/style/plus.gif" id="addButton" onmousedown="pMouseDown('<%=osfb.getResultUserId()%>', this)" onmouseup="pMouseUp('<%=osfb.getResultUserId()%>', this)" /></td>
						<td width="158px"><%=osfb.getResultUserName()%></td>
						<td width="35px"><%=osfb.getResultGender()%></td>
						<td width="64px"><img src="<%= osfb.getResultSectionImg()%>_2.png" height="24" width="32" alt="<%=osfb.getSectionName()%>" /></td>
						<td width="92px"><%=osfb.getResultCarrier()%>年</td>
						<td width="72px"><img src="<%=osfb.getResultLevelImg()%>_2.png" height="22" alt="<%=osfb.getLevelName()%>" /></td>
					</tr>
					<%
						}
					}
					%>
				</table>
			</div>
		</div>

		<div id="selectedArea">
			<div id="selectedHeader">
				<b>選択中のユーザ</b>
				<hr />
			</div>
			<div id="selectedList">
				<table id="table">
					<%
					if(selectedList != null) {
						for (int i=0; i<selectedList.size(); i++) {
							OutputSearchResultBean osfb2 = selectedList.get(i);
					%>
					<tr background="img/style/sash.gif" height="32">
						<td width="45"><input type="image" src="img/style/minus.gif" id="delButton" onmousedown="mMouseDown('<%=osfb2.getResultUserId()%>', this)" onmouseup="mMouseUp('<%=osfb2.getResultUserId()%>', this)" value="d0" /></td>
						<td><%=osfb2.getResultUserName()%></td>
					</tr>
					<%
						}
					}
					%>
				</table>
			</div>
		</div>

		<div id="roomArea">
			<div id="roomHeader">
				<b>ルーム</b>
				<input type="text" id="newRoomName" name="newRoomName" size="14" placeholder="新規ルーム名を入力" />
				<input type="submit" id="newRoom" value="新しく部屋を作成" onClick="goSearchServlet('3')" />
				<input type="submit" id="addUser" name="addUser" onClick="goSearchServlet('4')" value="追加" />
				<hr />
			</div>
			<table id="table">
				<tr>
					<th>　</th>
					<th>ルーム名</th>
					<th>人数</th>
				</tr>
			</table>
			<div id="roomList">
				<table id="table">
					<%
					if(roomList != null) {
						for (int i=0; i<roomList.size(); i++) {
							RoomBean rb = roomList.get(i);
					%>
					<tr background="img/style/sash.gif" height="32">
						<td><input type="radio" id="selectRoom" name="selectRoom" value="<%=rb.getRoomId()%>" /></td>
						<td><%=rb.getRoomName()%></td>
						<td><%=rb.getCountId()%>人</td>
					</tr>
					<%
						}
					}
					%>
				</table>
			</div>
		</div>
		<input type="hidden" id="pid" name="pid" value="1" />
		<input type="hidden" id="uid" name="uid" value="" />
	</form>
</body>

</html>