<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml">
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page pageEncoding="UTF-8" %>
<%@ page import="java.util.ArrayList"%>
<%@ page import="jp.ac.fjb.sotukenD.bean.ShiftMainBean" %>
<%@ page import="jp.ac.fjb.sotukenD.bean.LoginFormBeans"%>
<%LoginFormBeans loginBean = (LoginFormBeans) session.getAttribute("LOGIN_USER");%>


<head>
    <meta charset="utf-8" />
    <title>レイアウトテスト</title>
    <link rel="stylesheet" type="text/css" href="/sotukenD/css/style.css" />
    <link rel="stylesheet" type="text/css" href="/sotukenD/css/calendar.css" />
</head>
<body>
<div class="frm">
	<!--header部分-->
	<header id="header">
			<div id="title">
			シフト確認
		</div>
		<div id="account" align="right">
	<div id="name"><%=loginBean.getUserName()%></div>
		<!--ログアウトボタン-->
			<button type="submit" id="logout" onclick="location.href='/sotukenD/LogoutServlet'">ログアウト</button>
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
	<section id="mainContent">
<!-- 	<BUTTON type="button">11月</BUTTON> -->
<!-- 	<font size="5">12月</font> -->
<!-- 	<BUTTON type="button">1月</BUTTON> -->
<table border="0" width="150">
<tr></tr>
<tr><td>
<table align="center" border="5" width="500" cellspacing="0">
<script language="JavaScript">
<% ArrayList dayList = (ArrayList)session.getAttribute("DAY_LIST"); %>

	<%
	int flag=0;
	%>
	var a=[];
	<%
	if(dayList != null && dayList.size()!=0){
		for(int b=0;b<dayList.size();b++){%>
			a.push("<%out.print(((ShiftMainBean)dayList.get(b)).getDay());%>");
		<%}
		flag=1;
		out.print("flag ="+ flag);
	}else{
		out.print("flag ="+flag);
	}
	%>



	daycount=0;
    if(location.search.indexOf("/") > 0) {                    // 年月取得
        query    = new Array();
        query    = location.search.split("/");
        year    = parseInt(query[1]);                    // 年
        month    = parseInt(query[2]);                    // 月
    }
    else {
        today    = new Date();
        year    = today.getFullYear();                    // 今日の年
        month    = today.getMonth() + 1;                    // 今日の月
    }
    start        = new Date(year + "/" + month + "/1");
    startday    = start.getDay();                    // １日の曜日
    days        = new Array(31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31);
    if(month == 2 && (year % 4 == 0 && year % 100 != 0 || year % 400 == 0)) {
        days[1]++;                            // うるう年
    }
    enddate        = days[month - 1];                    // 最後の日
    prevyear    = year;                            // 前月・次月
    prevmonth    = month - 1;
    nextyear    = year;
    nextmonth    = month + 1;
    if(prevmonth < 1) {
        prevyear--;
        prevmonth += 12;
    }
    else if(nextmonth > 12) {
        nextyear++;
        nextmonth -= 12;
    }
    document.write('<tr>');
    document.write('<td colspan="7" align="center">');
    document.write(year, '<span style="font-size:20px">年</span>');
    document.write(month, '<span style="font-size:20px">月</span> ');
    document.write('</td>');
    document.write('</tr>');
    document.write('<tr>');
    document.write('<td align="center" style="font-size:20px;color:red">日</td>');
    document.write('<td align="center" style="font-size:20px">月</td>');
    document.write('<td align="center" style="font-size:20px">火</td>');
    document.write('<td align="center" style="font-size:20px">水</td>');
    document.write('<td align="center" style="font-size:20px">木</td>');
    document.write('<td align="center" style="font-size:20px">金</td>');
    document.write('<td align="center" style="font-size:20px;color:blue">土</td>');
    document.write('</tr>');
    count = 0;
    for(i = 0 ; i < startday ; i++) {                    // １日の曜日までの空欄
        if(count % 7 == 0) {
            document.write('<tr>');
        }
        document.write('<td> </td>');
        ++count;
    }
    for(i = 1 ; i <= enddate ; i++) {                    // 日付を書き出す
        if(count % 7 == 0) {
            document.write('<tr>');
        }
        document.write('<td align="center" valign="top" height="50" style="font-size:20px"');
        if(count % 7 == 0) {
            document.write(' style="color:red"');
        }
        if(count % 7 == 6) {
            document.write(' style="color:blue"');
        }
		if(flag==1){
			var aString = a[daycount];
			if(i>9){
				var formatI = i;
			}else{
				var formatI = "0"+i;
			}


        	if( aString!=null && aString.substring(6,8) == formatI){
     	   		document.write('>','<a href="/sotukenD/ForShiftShowServlet?day=',aString,'" >', i, '</td>');
     	   		++count;
     	  		++daycount;
        	}else{
        		document.write('>', i, '</td>');
            	++count;
        	}
        }else{
        	document.write('>', i, '</td>');
        	++count;
        }
        if(count % 7 == 0) {
            document.write('</tr>');
        }
    }
    while(count % 7 != 0) {                            // 最後の日から土曜までの空欄
        document.write('<td height="50" style="font-size:20px"> </td>');
        ++count;
        if(count % 7 == 0) {
            document.write('</tr>');
        }
    }
	</script>
</table>
</td>
</tr>
</table>
<button type="button"  onclick="location.href='/sotukenD/ForShiftTeiServlet'">シフト提出</button>
　　　　　　　　　　　　　　　　　　
<form action="/sotukenD/ForShiftCreateServlet" method="POST">
<input type="text" size=10 name="day" id="day"maxlength="10">
<input type="submit" name="createDayButton" value="シフト作成">
</form>
	</section>
</div>

</body>
</html>
