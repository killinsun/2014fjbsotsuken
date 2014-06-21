<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@page import="jp.ac.fjb.sotukenD.bean.ScheduleForBean"%>
<%@page import="java.util.ArrayList"%>

<%
	ArrayList<ScheduleForBean> schedule = (ArrayList) session.getAttribute("SCHEDULE_DATA");
%>

<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml">

<head>
<meta charset="utf-8" />
<title>レイアウトテスト</title>
<link rel="stylesheet" type="text/css" href="/sotukenD/css/style.css" />
<link rel="stylesheet" type="text/css" href="/sotukenD/css/Schedule.css" />
</head>
<body>
	<div class="frm">
		<!--header部分-->
		<header id="header">
			<div id="title">スケジュール詳細</div>
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

			<iframe src="/sotukenD/mainMenu.jsp" name="mainMenu" Align="left"
				Frameborder="no" Marginheight="0" Width="200"> </iframe>

		</nav>


		<!--作業画面-->
		<section id="mainContent">
			<div id="today">
				<FONT size="6"><%= request.getParameter("x") %>月<%= request.getParameter("y") %>日 </FONT>
			</div>
			<br> <br> 当日イベント案内：<br>
						<%
				for (int i = 0; i < schedule.size(); i++) {
					ScheduleForBean s = schedule.get(i);
				if (s.getEventEnd() == null) {
			%>
			<div id="Kobetu">
				<FONT size="4"><%=s.getEventContent()%></FONT>
			</div>


			<br> <br> 期間イベント案内：<br>

			<%
				}else{
			%>

			<%=s.getEventName()%>
			<div id="Ikkatu"><FONT size="4"><%=s.getEventContent()%></FONT></div>
			<%=s.getEventStart().substring(0,10)%>
			-
			<%=s.getEventEnd().substring(0,10)%><br><br>

			<%
				}
			%>
			<%
				}
			%>


 <br>
			<button type="button"
				onclick="location.href='/sotukenD/ForScheduleMainServlet'">戻る</button>
		</section>
	</div>

</body>
</html>
