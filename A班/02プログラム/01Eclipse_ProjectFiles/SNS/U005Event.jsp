<%@page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8" %>
<%@page import="java.util.ArrayList" %>
<%@page import="jp.ac.fjb.sns.bean.UserBean"
		import="jp.ac.fjb.sns.bean.EventBean"
		import="jp.ac.fjb.sns.bean.ScheduleBean" %>
<%
	//ログインユーザの情報
	UserBean loginUser = (UserBean)session.getAttribute("LOGIN_USER");
	String userPosition = (String)loginUser.getPositionId();

	ArrayList<EventBean> list = (ArrayList)session.getAttribute("EVENT_LIST");

	ArrayList<ScheduleBean> list2 = (ArrayList)session.getAttribute("SCHEDULE_LIST");
%>
<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml">

<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
<link rel="StyleSheet" type="text/css" href="css/event.css"/>
<link rel="StyleSheet" type="text/css" href="css/calender.css"/>
<script type="text/javascript" src="js/screenTransition.js"></script>
    <title>ConVertion</title>
</head>

<body style="background:#E0FFFF">
<form id="form" name="form" action="">
<div id="Logo"><img src="img/logo/logo.png" height="100" width="200" alt="タイトルロゴ"></div>

<div id="Kanri"></div>

<div ul="SubMenu" style="list-style:none" id="SubMenu">
<li style="float:right"><input type="submit"  id="Button" style="WIDTH: 70px; HEIGHT: 30px" value="LogOut"  onClick="goMainServlet('-1');"></li>
<li style="float:right"><input type="submit"  id="Button" style="WIDTH: 70px; HEIGHT: 30px" value="Profile" onClick="goProfileServlet();"></li>
<li style="float:right"><input type="submit"  id="Button" style="WIDTH: 70px; HEIGHT: 30px" value="Help"  disabled></li>
<li style="float:right"><input type="submit"  id="Button" style="WIDTH: 70px; HEIGHT: 30px" value="Home" onClick="goMainServlet();"></li>
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
<input type="submit" id="Button" style="WIDTH: 395px; HEIGHT: 100px" value="ユーザー検索" onClick="goSearchServlet('0');">
<input type="submit" id="Button" style="WIDTH: 395px; HEIGHT: 100px" value="アドバイス" onClick="goAdviceServlet();">
<input type="submit" id="Button" style="WIDTH: 395px; HEIGHT: 100px" value="イベントカレンダースケジュール" disabled>
</div>

<div id="content">
	<div id="event_left">
		<script type="text/javascript" src="calender/calender.js"></script>
	</div>

		<div id="event_right">
		<div id="event_add">
			<select id="starthours"name="starthours">
			<% for(int i=6;i<27;i++){%>
					<option><%= i %></option>
				<% } %>
			</select>時
			<select id="startminutes"name="startminutes">
			<% for(int i=0;i<56;i=i+15){%>
					<option><%= i %></option>
				<% } %>
			</select>分 -
			<select id="endhours"name="endhours">
			<% for(int i=6;i<27;i++){%>
					<option><%= i %></option>
				<% } %>
			</select>時
			<select id="endminutes"name="endminutes">
			<% for(int i=0;i<56;i=i+15){%>
					<option><%= i %></option>
				<% } %>
			</select>分迄
			<input type="text" id="newevent" name="newevent">
			<input type="button" id="neweventadd" name="neweventadd" value="追加" >
			<input type="submit" id="reroad" name="reroad" value="更新">
			<input type="submit" id="crear" name="crear" value="削除">
			<input type="hidden" name="pid" id="pid">

		</div>

		<table border="1" width="330" bgcolor="white">
			<tr>
				<th colspan="3">　今日('14/01/24)　金曜日</th>
			</tr>
			<tr>
				<th width="60"align="center" valign="top">時間</th>
				<th width="135"align="center" valign="top"><font size="2">個人スケジュール&nbsp;</font></th>
				<th width="135"align="center" valign="top"><font size="2">社内イベント</font></th>
			</tr>
		</table>

		<div id="schedule">
		<table border="1" width="330" bgcolor="white">
			<% int hour = 6;
			for(int i=0;i<84;i++){ %>
			<tr>
				<% if(0==i%4){ %>
				<td align="right" valign="top" width="60"rowspan="4" width="60" height="160" bgcolor="#B0C4DE"><%= hour++ %>:00</td>
				<% } %>

							<%	boolean flg = false;
								for(int z=0; z<list2.size(); z++){
									ScheduleBean schedul = list2.get(z);

									if(schedul.getTimeCount()<=i && i<=schedul.getEndTime()){
										flg = true;
									}
								}

								if (flg) { %>
									<td align="left" valign="top" width="135"height="40"bgcolor="#afeeee">
									<%	for(int z=0; z<list2.size(); z++){
										ScheduleBean schedul = list2.get(z); %>
										<%if(i==schedul.getTimeCount()){%>
											<%= schedul.getTmpTitle() %>
											<% } %>
										<% } %>
									</td>
							<% } else { %>
									<td align="left" valign="top" width="135"height="40"></td>
							<% } %>


							<%	boolean flg2 = false;
								for(int z=0; z<list.size(); z++){
									EventBean event = list.get(z);

									if(event.getTimeCount()<=i && i<=event.getEndTime()){
										flg2 = true;
									}
								}

								if (flg2) { %>
									<td align="left" valign="top" width="135"height="40"bgcolor="#f0e68c">
									<%	for(int z=0; z<list.size(); z++){
											EventBean event = list.get(z); %>
										<%if(i==event.getTimeCount()){%>
											<%= event.getTempTitle() %>
											<% } %>
										<% } %>
									</td>
							<% } else { %>
									<td align="left" valign="top" width="135"height="40"></td>
							<% } %>
			</tr>
		<% } %>
		</table>
	</div>

	<div id="schedule_syousai">
		<table border="1" width="276">
			<tr>
				<th>時間</th>
				<td>10:00 - 12:00</td>
			</tr>
			<tr>
				<th>題名</th>
				<td>プロジェクトチーム会議</td>
			</tr>
			<tr>
				<th>内容</th>
				<td height="305"><textarea cols="25" rows="17" placeholder="件の製品企画案について．．．"></textarea></td>
			</tr>
		</table>
	</div>
	</div>
</div>

</form>

<!-- <div id="content">
	<div id="event_left">
		<script type="text/javascript" src="calender/calender.js"></script>
	</div>

		<div id="event_right">
		<div id="event_add">
			<select id="starthours">

				<option>6</option>
				<option>7</option>
				<option>8</option>
				<option>9</option>
				<option>10</option>
				<option>11</option>
				<option>12</option>
				<option>13</option>
				<option>14</option>
				<option>15</option>
				<option>16</option>
				<option>17</option>
				<option>18</option>
				<option>19</option>
				<option>20</option>
				<option>21</option>
				<option>22</option>
				<option>23</option>
				<option>24</option>
				<option>25</option>
				<option>26</option>
			</select>時
			<select id="startminutes">
				<option>00</option>
				<option>10</option>
				<option>20</option>
				<option>30</option>
				<option>40</option>
				<option>50</option>
			</select>分 -
			<select id="endhours">
				<option>6</option>
				<option>7</option>
				<option>8</option>
				<option>9</option>
				<option>10</option>
				<option>11</option>
				<option>12</option>
				<option>13</option>
				<option>14</option>
				<option>15</option>
				<option>16</option>
				<option>17</option>
				<option>18</option>
				<option>19</option>
				<option>20</option>
				<option>21</option>
				<option>22</option>
				<option>23</option>
				<option>24</option>
				<option>25</option>
				<option>26</option>
			</select>時
			<select id="endminutes">
				<option>00</option>
				<option>10</option>
				<option>20</option>
				<option>30</option>
				<option>40</option>
				<option>50</option>
			</select>分迄
			<input type="text" id="newevent"><input type="submit" id="neweventadd" value="追加">
			<input type="submit" id="reroad" value="更新">
			<input type="submit" id="crear" value="削除">
		</div>

		<div id="schedule">
		<table border="1" width="330" bgcolor="white">
			<tr>
				<th colspan="3">　今日('14/01/24)　金曜日</th>
			</tr>
			<tr>
				<th align="center" valign="top">時間</th>
				<th align="center" valign="top"><font size="2">個人スケジュール</font></th>
				<th width="135"align="center" valign="top"><font size="2">社内イベント</font></th>
			</tr>
			<tr>
				<td align="right" valign="top" rowspan="4" width="60" height="160" bgcolor="#B0C4DE">6:00</td>
				<td align="left" valign="top" height="40"></td>
				<td align="left" valign="top" height="40"></td>
			</tr>
			<tr>
				<td align="left" valign="top" height="40"></td>
				<td align="left" valign="top" height="40"></td>
			</tr>
			<tr>
				<td align="left" valign="top" height="40"></td>
				<td align="left" valign="top" height="40"></td>
			</tr>
			<tr>
				<td align="left" valign="top" height="40"></td>
				<td align="left" valign="top" height="40"></td>
			</tr>
			<tr>
				<td align="right" valign="top" rowspan="4" height="160" bgcolor="#B0C4DE">7:00</td>
				<td align="left" valign="top" height="40"></td>
				<td align="left" valign="top" height="40"></td>
			</tr>
			</tr>
			<tr>
				<td align="left" valign="top" height="40"></td>
				<td align="left" valign="top" height="40"></td>
			</tr>
			<tr>
				<td align="left" valign="top" height="40"></td>
				<td align="left" valign="top" height="40"></td>
			</tr>
			<tr>
				<td align="left" valign="top" height="40"></td>
				<td align="left" valign="top" height="40"></td>
			</tr>
			<tr>
				<td align="right" valign="top" rowspan="4" width="60" height="160" bgcolor="#B0C4DE">8:00</td>
				<td align="left" valign="top" height="40"></td>
				<td align="left" valign="top" height="40"></td>
			</tr>
			<tr>
				<td align="left" valign="top" height="40"></td>
				<td align="left" valign="top" height="40"></td>
			</tr>
			<tr>
				<td align="left" valign="top" height="40"></td>
				<td align="left" valign="top" height="40"></td>
			</tr>
			<tr>
				<td align="left" valign="top" height="40"></td>
				<td align="left" valign="top" height="40"></td>
			</tr>
			<tr>
				<td align="right" valign="top" rowspan="4" width="60" height="160" bgcolor="#B0C4DE">9:00</td>
				<td align="left" valign="top" height="40"></td>
				<td align="left" valign="top" height="40"></td>
			</tr>
			<tr>
				<td align="left" valign="top" height="40"></td>
				<td align="left" valign="top" height="40"></td>
			</tr>
			<tr>
				<td align="left" valign="top" rowspan="30" width="135" bgcolor="#98FB98">9:30-17:00<br /><font size="2">会社</font></td>
				<td align="left" valign="top" height="40" width="135" bgcolor="pink">9:30-9:45<br /><font size="2">朝礼</font></td>
			</tr>
			<tr>
				<td align="left" valign="top" height="40"></td>
			</tr>
			<tr>
				<td align="right" valign="top" rowspan="4" width="60" height="160" bgcolor="#B0C4DE">10:00</td>
				<td align="left" valign="top" rowspan="8" width="135" bgcolor="pink">10:00-12:00<br /><font size="2">プロジェクトチーム会議</font></td>
			</tr>
			<tr>

			</tr>
			<tr>

			</tr>
			<tr>

			</tr>
			<tr>
				<td align="right" valign="top" rowspan="4" width="60" height="160" bgcolor="#B0C4DE">11:00</td>

			</tr>
			<tr>

			</tr>
			<tr>

			</tr>
			<tr>

			</tr>
			<tr>
				<td align="right" valign="top" rowspan="4" width="60" height="160" bgcolor="#B0C4DE">12:00</td>
				<td align="left" valign="top" height="40"></td>
			</tr>
			<tr>
				<td align="left" valign="top" height="40"></td>
			</tr>
			<tr>
				<td align="left" valign="top" height="40"></td>
			</tr>
			<tr>
				<td align="left" valign="top" height="40"></td>
			</tr>
			<tr>
				<td align="right" valign="top" rowspan="4" width="60" height="160" bgcolor="#B0C4DE">13:00</td>
				<td align="left" valign="top" height="40"></td>
			</tr>
			<tr>
				<td align="left" valign="top" height="40"></td>
			</tr>
			<tr>
				<td align="left" valign="top" height="40"></td>
			</tr>
			<tr>
				<td align="left" valign="top" height="40"></td>
			</tr>
			<tr>
				<td align="right" valign="top" rowspan="4" width="60" height="160" bgcolor="#B0C4DE">14:00</td>
				<td align="left" valign="top" height="40"></td>
			</tr>
			<tr>
				<td align="left" valign="top" height="40"></td>
			</tr>
			<tr>
				<td align="left" valign="top" height="40"></td>
			</tr>
			<tr>
				<td align="left" valign="top" height="40"></td>
			</tr>
			<tr>
				<td align="right" valign="top" rowspan="4" width="60" height="160" bgcolor="#B0C4DE">15:00</td>
				<td align="left" valign="top" height="40"></td>
			</tr>
			<tr>
				<td align="left" valign="top" height="40"></td>
			</tr>
			<tr>
				<td align="left" valign="top" height="40"></td>
			</tr>
			<tr>
				<td align="left" valign="top" height="40"></td>
			</tr>
			<tr>
				<td align="right" valign="top" rowspan="4" width="60" height="160" bgcolor="#B0C4DE">16:00</td>
				<td align="left" valign="top" height="40"></td>
			</tr>
			<tr>
				<td align="left" valign="top" height="40"></td>
			</tr>
			<tr>
				<td align="left" valign="top" height="40"></td>
			</tr>
			<tr>
				<td align="left" valign="top" height="40"></td>
			</tr>
			<tr>
				<td align="right" valign="top" rowspan="4" height="160" bgcolor="#B0C4DE">17:00</td>
				<td align="left" valign="top" height="40"></td>
				<td align="left" valign="top" height="40"></td>
			</tr>
			<tr>
				<td align="left" valign="top" height="40"></td>
				<td align="left" valign="top" height="40"></td>
			</tr>
			<tr>
				<td align="left" valign="top" height="40"></td>
				<td align="left" valign="top" height="40"></td>
			</tr>
			<tr>
				<td align="left" valign="top" height="40"></td>
				<td align="left" valign="top" height="40"></td>
			</tr>
			<tr>
				<td align="right" valign="top" rowspan="4" height="160" bgcolor="#B0C4DE">18:00</td>
				<td align="left" valign="top" height="40"></td>
				<td align="left" valign="top" height="40"></td>
			</tr>
			<tr>
				<td align="left" valign="top" height="40"></td>
				<td align="left" valign="top" height="40"></td>
			</tr>
			<tr>
				<td align="left" valign="top" height="40"></td>
				<td align="left" valign="top" rowspan="8" bgcolor="pink">18:30-20:30<br /><font size="2">定例会</font></td>
			</tr>
			<tr>
				<td align="left" valign="top" height="40"></td>
			</tr>
			<tr>
				<td align="right" valign="top" rowspan="4" height="160" bgcolor="#B0C4DE">19:00</td>
				<td align="left" valign="top" height="40"></td>
			</tr>
			<tr>
				<td align="left" valign="top" height="40"></td>
			</tr>
			<tr>
				<td align="left" valign="top" height="40"></td>
			</tr>
			<tr>
				<td align="left" valign="top" height="40"></td>
			</tr>
			<tr>
				<td align="right" valign="top" rowspan="4" height="160" bgcolor="#B0C4DE">20:00</td>
				<td align="left" valign="top" height="40"></td>
			</tr>
			<tr>
				<td align="left" valign="top" height="40"></td>
			</tr>
			<tr>
				<td align="left" valign="top" height="40"></td>
				<td align="left" valign="top" height="40"></td>
			</tr>
			<tr>
				<td align="left" valign="top" height="40"></td>
				<td align="left" valign="top" height="40"></td>
			</tr>
			<tr>
				<td align="right" valign="top" rowspan="4" height="160" bgcolor="#B0C4DE">21:00</td>
				<td align="left" valign="top" height="40"></td>
				<td align="left" valign="top" height="40"></td>
			</tr>
			<tr>
				<td align="left" valign="top" height="40"></td>
				<td align="left" valign="top" height="40"></td>
			</tr>
			<tr>
				<td align="left" valign="top" height="40"></td>
				<td align="left" valign="top" height="40"></td>
			</tr>
			<tr>
				<td align="left" valign="top" height="40"></td>
				<td align="left" valign="top" height="40"></td>
			</tr>
			<tr>
				<td align="right" valign="top" rowspan="4" height="160" bgcolor="#B0C4DE">22:00</td>
				<td align="left" valign="top" height="40"></td>
				<td align="left" valign="top" height="40"></td>
			</tr>
			<tr>
				<td align="left" valign="top" height="40"></td>
				<td align="left" valign="top" height="40"></td>
			</tr>
			<tr>
				<td align="left" valign="top" height="40"></td>
				<td align="left" valign="top" height="40"></td>
			</tr>
			<tr>
				<td align="left" valign="top" height="40"></td>
				<td align="left" valign="top" height="40"></td>
			</tr>
			<tr>
				<td align="right" valign="top" rowspan="4" height="160" bgcolor="#B0C4DE">23:00</td>
				<td align="left" valign="top" height="40"></td>
				<td align="left" valign="top" height="40"></td>
			</tr>
			<tr>
				<td align="left" valign="top" height="40"></td>
				<td align="left" valign="top" height="40"></td>
			</tr>
			<tr>
				<td align="left" valign="top" height="40"></td>
				<td align="left" valign="top" height="40"></td>
			</tr>
			<tr>
				<td align="left" valign="top" height="40"></td>
				<td align="left" valign="top" height="40"></td>
			</tr>
			<tr>
				<td align="right" valign="top" rowspan="4" height="160" bgcolor="#B0C4DE">24:00</td>
				<td align="left" valign="top" height="40"></td>
				<td align="left" valign="top" height="40"></td>
			</tr>
			<tr>
				<td align="left" valign="top" height="40"></td>
				<td align="left" valign="top" height="40"></td>
			</tr>
			<tr>
				<td align="left" valign="top" height="40"></td>
				<td align="left" valign="top" height="40"></td>
			</tr>
			<tr>
				<td align="left" valign="top" height="40"></td>
				<td align="left" valign="top" height="40"></td>
			</tr>
			<tr>
				<td align="right" valign="top" rowspan="4" height="160" bgcolor="#B0C4DE">25:00</td>
				<td align="left" valign="top" height="40"></td>
				<td align="left" valign="top" height="40"></td>
			</tr>
			<tr>
				<td align="left" valign="top" height="40"></td>
				<td align="left" valign="top" height="40"></td>
			</tr>
			<tr>
				<td align="left" valign="top" height="40"></td>
				<td align="left" valign="top" height="40"></td>
			</tr>
			<tr>
				<td align="left" valign="top" height="40"></td>
				<td align="left" valign="top" height="40"></td>
			</tr>
			<tr>
				<td align="right" valign="top" rowspan="4" height="160" bgcolor="#B0C4DE">26:00</td>
				<td align="left" valign="top" height="40"></td>
				<td align="left" valign="top" height="40"></td>
			</tr>
			<tr>
				<td align="left" valign="top" height="40"></td>
				<td align="left" valign="top" height="40"></td>
			</tr>
			<tr>
				<td align="left" valign="top" height="40"></td>
				<td align="left" valign="top" height="40"></td>
			</tr>
			<tr>
				<td align="left" valign="top" height="40"></td>
				<td align="left" valign="top" height="40"></td>
			</tr>
		</table>
	</div>

	<div id="schedule_syousai">
		<table border="1" width="276">
			<tr>
				<th>時間</th>
				<td>10:00 - 12:00</td>
			</tr>
			<tr>
				<th>題名</th>
				<td>プロジェクトチーム会議</td>
			</tr>
			<tr>
				<th>内容</th>
				<td height="305"><textarea cols="25" rows="17" placeholder="件の製品企画案について．．．"></textarea></td>
			</tr>
		</table>
	</div>
	</div>
</div>

</form> -->

</body>
</html>