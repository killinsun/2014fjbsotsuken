<%@page import="jp.ac.fjb.sotukenD.bean.ShiftCreateFormBean"%>
<%@page import="jp.ac.fjb.sotukenD.bean.ShiftShowFormBean"%>
<%@page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@page import="java.util.ArrayList" %>
<% ArrayList<ShiftCreateFormBean> uData = (ArrayList)session.getAttribute("USER_DATA"); %>
<% ArrayList<ShiftShowFormBean> dShift = (ArrayList)session.getAttribute("DECISION_SHIFT"); %>
<%@ page import="jp.ac.fjb.sotukenD.bean.LoginFormBeans"%>
<%
	LoginFormBeans loginBean = (LoginFormBeans) session
			.getAttribute("LOGIN_USER");
%>


<% String date = (String)session.getAttribute("DATE"); %>
<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta charset="utf-8" />
<title>シフト作成画面</title>
<link rel="stylesheet" type="text/css" href="/sotukenD/css/style.css" />
<link rel="stylesheet" type="text/css" href="/sotukenD/css/sakusei.css" />

<script type="text/javascript">
<!--
shiftList = new Array('08:00','08:30','09:00','09:30','10:00','10:30','11:00','11:30','12:00','12:30','13:00','13:30','14:00','14:30','15:00','15:30','16:00','16:30','17:00','17:30','18:00','18:30','19:00','19:30','20:00','20:30','21:00','21:30','22:00','22:30','23:00');

function changeBackgroundColor(row,col){
	var newId = row+'cg'+col;
	var hidId = row+'hidId'+col;
	var start;
	var end ;

	if( document.getElementById( hidId ).value=="no"){
    	document.getElementById( newId ).style.backgroundColor = '#CCCCCC';
    	document.getElementById( hidId ).value="in";
	}else if(document.getElementById( hidId ).value == "in"){
	    document.getElementById( newId ).style.backgroundColor = '#FFFFFF';
	    document.getElementById( hidId ).value="no";
	}


	for(var i=0; i<30; i++) {
		var stI = ("0"+i).slice(-2);
		if (document.getElementById(row+'hidId'+stI ).value != 'no') {
			start = i;
			break;
		}
	}

	for(var i=29; i>-1; i--) {
		var stI = ("0"+i).slice(-2);
		if (document.getElementById(row+'hidId'+stI ).value != 'no') {
			end = i;
			break;
		}
	}

	if(start<end){
		for(var i = start;i<=end;i++){
			var stI = ("0"+i).slice(-2);
	    	document.getElementById( row+'cg'+stI ).style.backgroundColor = '#CCCCCC';
	    	document.getElementById(row+'hidId'+stI ).value='in';
		}

	}
	if(end != 0){
		document.getElementById(row+'start').value =shiftList[start];
		document.getElementById(row+'end').value =shiftList[end + 1];
	}

}

function hozon(){
	var form = document.getElementById("form").action = '/sotukenD/ShiftConserveServlet';
	alert("保存しました");

}



// -->
</script>

</head>
<body onLoad="load()">
	<% request.setCharacterEncoding("UTF-8"); %>

	<div class="frm">
				<!--header部分-->
		<header id="header">
			<div id="title">シフト作成</div>
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
		<section id="mainContent" >


		<form id="form" action="/sotukenD/ForShiftShowServlet" method="post" >
		<%String date1 = date; %>
		<div style="text-align: center;">
			<input type="submit"  id="conserve" value="保存" style="WIDTH: 100px; HEIGHT: 30px; float:left;" onclick="hozon()">

			<font size="5">  <%= date1 %>  </font>
			<input type="submit" value="閲覧画面" style="WIDTH: 100px; HEIGHT: 30px; float:right; ">
			<input type ="hidden" value=" <%= date1.substring(0,10)%>" id="date" name="day" >
			<input type ="hidden" name="dateChange" value="0">
		</div>
			<!---->


			<img src="/sotukenD/img/memori.gif" id="memori">

			<div id="zentai">

				<table border="0" width="100%" cellpadding="2" cellspacing="1" bgcolor="#002047" cols="32">

				<%int i = 0;
				String stI;
				String stJ;

				for(;i<dShift.size();i++){

				 stI = String.format("%02d", i);
					ShiftShowFormBean xx = dShift.get(i);


				%>
					<!--ここから-->
							<tr align="center" bgcolor="#FFFFFF" height="45px" id="kotei">
								<input type="hidden" value="<%= xx.getStartTime() %>" id="<%=stI%>start" name="<%=stI%>start">
								<input type="hidden" value="<%= xx.getFinishTime() %>" id="<%=stI%>end" name="<%=stI%>end">
								<td width="30px">削除<input type="checkbox" name="<%=stI%>del" value="1"></td>
								<td width="158px">

								<select name="<%=stI%>userID">

										<option value ="none">未選択</option>
										<%for(int j =0;j<uData.size();j++){
												ShiftCreateFormBean userD = uData.get(j);
												%>
										<option value="<%= userD.getUserID() %>"
										<% if(userD.getUserID().equals(xx.getUserID())){out.print("selected");}%>
										 ><%= userD.getUserName() %></option>
										<%
												}
												%>
								</select></td>
								<%
									ShiftCreateFormBean userD = uData.get(0);

									String[] styleId =  xx.getStyle();
									String[] checkV =  xx.getCv();
									for (int j=0; j<30; j++){

										 stJ = String.format("%02d", j);
									%>
								<td width="12px" id="<%=stI%>cg<%=stJ%>"<%= styleId[j] %>
									onClick="changeBackgroundColor( '<%=stI%>','<%=stJ%>')">
										<input type="hidden" name="<%=stI%>hidName<%=stJ%>" id="<%=stI%>hidId<%=stJ%>" value="<%=checkV[j] %>">
								</td>
								<%
									}
									%>
							</tr>

					<!--ここまで読み込み分-->
				<% }

				for(;i<20;i++){
					 stI = String.format("%02d", i);
				%>
					<!--ここから-->
							<tr align="center" bgcolor="#FFFFFF" height="45px" id="kotei">
								<input type="hidden" value="" id="<%=stI%>start" name="<%=stI%>start">
								<input type="hidden" value="" id="<%=stI%>end" name="<%=stI%>end">
								<td width="30px">削除<input type="checkbox" name="<%=stI%>del" value="1"></td>
								<td width="158px">
								<select name="<%=stI%>userID">

										<option value ="none">未選択</option>
										<%for(int j =0;j<uData.size();j++){
												ShiftCreateFormBean userD = uData.get(j);
												%>
										<option value="<%= userD.getUserID() %>"

										 ><%= userD.getUserName() %></option>
										<%
												}
												%>
								</select></td>
								<%
									ShiftCreateFormBean userD = uData.get(1);
									for (int j=0; j<30; j++){

										 stJ = String.format("%02d", j);
									%>
								<td width="12px" id="<%=stI%>cg<%=stJ%>"
									onClick="changeBackgroundColor( '<%=stI%>','<%=stJ%>')">
										<input type="hidden" name="<%=stI%>hidName<%=stJ%>" value="no" id="<%=stI%>hidId<%=stJ%>">
								</td>
								<%
									}
									%>
							</tr>

							<% } %>



				</table>


			</div>
			</form>
	</div>

</body>
</html>
