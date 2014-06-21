<%@page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@page import="jp.ac.fjb.sotukenD.bean.ShiftShowFormBean" %>
<%@page import="java.util.ArrayList" %>
<%@ page import="jp.ac.fjb.sotukenD.bean.LoginFormBeans"%>
<%
	LoginFormBeans loginBean = (LoginFormBeans) session
			.getAttribute("LOGIN_USER");
%>


<% ArrayList<ShiftShowFormBean> dShift = (ArrayList)session.getAttribute("DECISION_SHIFT"); %>


<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml">


<head>
    <meta charset="utf-8" />
    <title>シフト閲覧画面</title>
    <link rel="stylesheet" type="text/css" href="/sotukenD/css/style.css" />
    <link rel="stylesheet" type="text/css" href="/sotukenD/css/eturan.css" />
<script type="text/javascript">
<!--

function ForBack(){
	document.getElementById('form').action = "/sotukenD/ForShiftMainServlet";

}
function ForTei(){
	document.getElementById('form').action = "/sotukenD/ForShiftTeiServlet";

}

-->
</script>

</head>
<body>
<% request.setCharacterEncoding("UTF-8"); %>
<div class="frm">
	<!--header部分-->
		<header id="header">
			<div id="title">シフト閲覧</div>
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

			<iframe src="/sotukenD/mainMenu.jsp" name="mainMenu" Align="left" Frameborder="no" Marginheight="0" Width="200">

			</iframe>

	</nav>


	<!--作業画面-->

	<% 	ShiftShowFormBean xx = dShift.get(0);%>
	<section id="mainContent">
		<form id="form" action="/sotukenD/ForShiftCreateServlet">
			<div style="text-align:center; ">
			<input type="submit" value="戻る" style="WIDTH: 50px; HEIGHT: 30px; float:left;" onclick="ForBack()">
			<input type="submit" value="シフト提出画面" style="WIDTH: 100px; HEIGHT: 30px; float:left;" onclick="ForTei()">
			<font size="5"><%=xx.getDate().substring(0,10) %></font>
			<input type="submit" value="作成画面" style="WIDTH: 100px; HEIGHT: 30px; float:right; ">
			</div>


			<input type="hidden" value="<%=xx.getDate().substring(0,10) %>" id="date" name="day">

				<!---->
						<img src="/sotukenD/img/memori.gif" id="memori">


		<div id="zentai">
						<table border="0" width="100%" cellpadding="2" cellspacing="1" bgcolor="#002047" cols="32">
							<!--表作成-->
							<%

							for(int i =0;i<dShift.size();i++){
								ShiftShowFormBean backdroundId = dShift.get(i);
							%>
											<tr align="center" bgcolor="#FFFFFF" height="45px" id="kotei">
												<td width="68px">
													<%= backdroundId.getUserID() %>
												</td>
												<td width="124px">
													<%= backdroundId.getUserName() %>
												</td>
											<%
											    String[] styleId =  backdroundId.getStyle();
												for (int j=0; j<styleId.length; j++){
													%>
													<td width="12px" <%= styleId[j] %>>

													</td>
												<%
												}
												%>
											</tr>

							<%
							}
							%>
									</table>

			</div>
		</form>
	</section>
	</div>

</body>
</html>
