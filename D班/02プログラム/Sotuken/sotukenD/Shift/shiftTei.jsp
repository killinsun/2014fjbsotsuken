<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml">
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page pageEncoding="UTF-8" %>
<%@ page import="java.util.Calendar" %>
<%@ page import="jp.ac.fjb.sotukenD.bean.ShiftTeiFormBean" %>
<%@ page import="java.util.ArrayList"%>
<%@ page import="java.lang.Number"%>


<head>
    <meta charset="utf-8" />
    <title>レイアウトテスト</title>
    <link rel="stylesheet" type="text/css" href="/sotukenD/css/style.css" />
    <link rel="stylesheet" type="text/css" href="/sotukenD/css/calendar.css" />
    <script type="text/javascript" src="/sotukenD/js/tei.js" charset="utf-8"></script>

</head>
<body>
<div class="frm">
	<!--header部分-->
	<header id="header">
			<div id="title">
			シフト提出
		</div>
		<div id="account" align="right">
			<div id="name">苗字　名前</div>
			<!--ログアウトボタン-->
			<button type="button" id="logout">ログアウト</button>
		</div>
		<div>
		　
		</div>

	</header>

	<!--ページ移動、ナビゲーション部分-->
<nav id="nav">

			<iframe src="/sotukenD/mainMenu.jsp" name="mainMenu" Align="left" Frameborder="no" Marginheight="0" Width="200">

			</iframe>

	</nav>

	<!--作業画面-->
<%



Calendar now = Calendar.getInstance();
int y = now.get(now.YEAR);          //年を取得
int m = now.get(now.MONTH) + 1;     //月を取得
int d = now.get(now.DATE);          //日を取得
int kigen = 0;
int teiM=m;
int kigenM=m;
int zenkouflag=0;
String zenkou="";
if(10<d && d<25){
	if(m==12){
		y=y++;
		teiM= teiM - 11;
		kigen = 25;
		zenkou = "１ー１５";
		zenkouflag=0;
	}else{
		kigen = 25;
		zenkou = "１ー１５";
		kigenM = teiM+1;
		teiM=teiM+1;
		zenkouflag=0;
	}
}else{
	kigen = 10;
	zenkou = "１６ー３１";
	zenkouflag=1;
}


%>

	<section id="mainContent">
		<div id="zentai">
<font size="5"><%=teiM%>月 <%=zenkou %></font>

<table border="0" width="550" height="100%">
<tr></tr>
<tr><td>
<table border="0" width="100%" height="50" cellpadding="2" cellspacing="1" bgcolor="#002047">
<tr align="center" bgcolor="#CCCCFF">
	<td><font color="#FF0000">提出期限：<%=m %>月<%=kigen %>日</font>
	</td>
</tr>
<%
ArrayList kibouShift = (ArrayList) session.getAttribute("KIBOU_LIST");




int startDay = 0;
int endDay = 0;
int statFlag=0;
if(zenkouflag==0){
	startDay = 1;
	endDay = 15;
}else if(zenkouflag==1){
	startDay = 16;
	endDay = 31;
}

%>
<form method="POST" action="/sotukenD/ForShiftTeiServlet" >
<%
int listCount=0;
for(int i=startDay;i < endDay+1 ;i++){

		ShiftTeiFormBean getKibou=(ShiftTeiFormBean)kibouShift.get(listCount);
		statFlag = getKibou.getStatFlag();


		out.println("<table border=\"0\" width=\"100%\" cellpadding=\"2\" cellspacing=\"1\" bgcolor=\"#002047\"> " );
		out.println("<tr align=\"center\" bgcolor=\"#FFFFFF\"> " );
		out.println("<td width=\"20%\"><h4>"+ i +"</h4></td> ");
		out.println("<td>");
		out.println("<select id=statBox"+i+" name=\"statBox"+i+"\"> ");
		if(statFlag==0){
			out.println("<option value=\"0\" selected>未提出</option>");
			out.println("<option value=\"1\">出勤希望</option> ");
			out.println("<option value=\"2\">休み希望</option>");
			out.println("<option value=\"3\">FREE</option>");
		}else if(statFlag==1){
			out.println("<option value=\"0\">未提出</option>\r\n ");
			out.println("<option value=\"1\" selected>出勤希望</option>");
			out.println("<option value=\"2\">休み希望</option> ");
			out.println("<option value=\"3\">FREE</option>");
		}else if(statFlag==2){
			out.println("<option value=\"0\">未提出</option>");
			out.println("<option value=\"1\">出勤希望</option>");
			out.println("<option value=\"2\" selected>休み希望</option>");
			out.println("<option value=\"3\">FREE</option>");
		}else if(statFlag==3) {
			out.println("<option value=\"0\">未提出</option>");
			out.println("<option value=\"1\">出勤希望</option>");
			out.println("<option value=\"2\">休み希望</option>");
			out.println("<option value=\"3\" selected>FREE</option>");
		}
		out.println("</select>");
		out.println("　　　");
		out.println("<input type=\"text\" id=startH"+i+" name=\"startH"+i+"\" value='"+getKibou.getStartH()+"' size=\"3\" />");
		out.println(":");
		out.println("<input type=\"text\" id=startM"+i+" name=\"startM"+i+"\" value='"+getKibou.getStartM()+"' size=\"3\" />");
		out.println("ー");
		out.println("<input type=\"text\" id=finishH"+i+" name=\"finishH"+i+"\" value='"+getKibou.getFinishH()+"' size=\"3\" />");
		out.println(":");
		out.println("<input type=\"text\" id=finishM"+i+" name=\"finishM"+i+"\" value='"+getKibou.getFinishM()+"' size=\"3\" />");
		out.println("</td>");
		out.println("</tr>");
		out.println("</table>");
		listCount++;
}
%>




</table>
</td></tr>
</table>
<button type="button"  onclick="location.href='/sotukenD/ForShiftMainServlet'">シフトトップへ</button>
</a>
<!--配置のためのスペースです-->
　　　　　　　　　　　　　　　　　　　　　　　　　　　

<input type="submit" name="tei"  value="提出する" style="WIDTH: 120px; HEIGHT: 60px;" >

</a>
</div>
	</section>
</div>
</form>
</body>
</html>
