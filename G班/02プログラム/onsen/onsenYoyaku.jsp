<%@page import="jp.ac.fjb.onsen.bean.UserBean"%>
<%@page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@page import="java.util.*" %>
<%@page import="java.text.*" %>
<%@page import="java.util.ArrayList" %>
<%@page import="jp.ac.fjb.onsen.bean.OnsenYoyakuBean" %>
<%
HttpSession s = request.getSession();
UserBean loginUser = (UserBean) s.getAttribute("LOGIN_USER");
ArrayList<Integer> list = (ArrayList)s.getAttribute("AKI_LIST");
OnsenYoyakuBean bean = (OnsenYoyakuBean)s.getAttribute("OYBEAN");
int ninzu = bean.getNinzu();
int heya = bean.getHeyasuu();
String Y = (String)s.getAttribute("Y");
String M = (String)s.getAttribute("M");
int year = Integer.parseInt(Y);
int month = Integer.parseInt(M);
String[] yoyakuDay = (String[])s.getAttribute(Y+M);
String alert = (String)s.getAttribute("ALERT");
Calendar c = Calendar.getInstance();
%>
<!DOCTYPE html>
<html>
<head>
 <meta charset="UTF-8" />
 <title>カレンダー画面</title>
 <link rel="stylesheet" type="text/css" href="css/onsenYoyaku.css"/>
 <script type="text/javascript">
 <!--

 <% if(alert != null){%>
 alert("日付を選択してください");
 <% } %>

 function cal(year,month,heya) {

 //空き部屋配列
 var AKI = new Array(
 <%
 for(int i=0; i<list.size()-1; i++) {
	 out.print(list.get(i) +",");
 }
 out.print(list.get(list.size()-1));
 %>
 );

 var yoyakuDay;
 <% if(yoyakuDay == null){ %>
	yoyakuDay = null;
 <% }else if(yoyakuDay != null){ %>
	yoyakuDay = new Array(
			<%
			for(int i=0; i<yoyakuDay.length-1; i++) {
				out.print('"'+yoyakuDay[i]+'"' +",");
			}
			out.print('"'+yoyakuDay[yoyakuDay.length-1]+'"');
			%>
	);
 <% } %>

  today=new Date();
  month--;
  var day=today.getDate();
  var leap_year=false;
  if ((year%4 == 0 && year%100 != 0) || (year%400 == 0)) leap_year=true;
  lom=new Array(31,28+leap_year,31,30,31,30,31,31,30,31,30,31);
  var days=0;
  for (var i=0; i < month; i++) days+=lom[i];
  var week=Math.floor((year*365.2425+days)%7);
  var j=0;
  var calendar='<table>\n<tr align="center" bgcolor="#DCDCDC" height="40px">';
  calendar+='<td><font color="red">日</td><td>月</td><td>火</td><td>水</td><td>木</td><td>金</td><td>土</td>';
  calendar+='</tr>\n<tr>';
  for (i=0; i < week; i++,j++) calendar+='<td height="65px"></td>';
  for (i=1; i <= lom[month]; i++) {
   calendar+='<td height="65px"';
   if(day == i && month == today.getMonth() && year == today.getFullYear()) calendar+='><font color="red"';
   if (day > i && month == today.getMonth() && year == today.getFullYear() || month < today.getMonth() || year < today.getFullYear()) {
    calendar+='><font color="#C0C0C0">'+i+'</td>';
   } else {
    if (AKI[i-1] <= 0 || AKI[i-1]-heya < 0) calendar+=' bgcolor="red"><font color="white"';
    calendar+='>'+i;
    if (AKI[i-1] > 0 && AKI[i-1]-heya >= 0) {
    	if(yoyakuDay){
    		var y=0;
    		var x=year;
    		x+="/";
    		x+=month+1;
    		x+="/";
    		x+=i;
    		var checked='';
    		var flg=true;
    		while (flg && y < yoyakuDay.length){
	    		if(yoyakuDay[y] === x){
	    			checked=' checked';
	    			flg=false;
	    		}
	    		y++;
     		}
		    calendar+='<br><input type="checkbox" name="yoyakuDay" value="'+year+'/'+(month+1)+'/'+i+'"'+checked+'>';
    	}else{
    		calendar+='<br><input type="checkbox" name="yoyakuDay" value="'+year+'/'+(month+1)+'/'+i+'">';
    	}
    }
    calendar+='</td>';
   }
   j++;
   if (j > 6) {
    calendar+='</tr>\n<tr>';
    j=0;
   }
  }
  for (i=j; i > 6; i++) calendar+='<td></td>';
  calendar+='</tr>\n</table>\n';

  return calendar;
 }

 // -->
 </script>
</head>
<body>
 <div id="top">
  <div id="headWrap">
   <div id="header">
    <h1><a href="HomeServlet"><img src="images/rogo2.png" alt="" /></a></h1>
    <div id="pr">
     <p>温泉を紹介します。</p>
    </div>

    <div id="gnavi">
     <ul>
      <li><font size="4">ようこそ!! <%=s.getAttribute("LOGIN_USERsei")%>さん</font></li>
      <li><font size="4" color='green'><a href="LoginServlet">ログアウト</a></font></li>
     </ul>
    </div>
   </div><!-- /#header -->
  </div><!-- /#headWrap -->

  		<form action="/Onsen/HomeServlet">
			<div id="menu">
				<ul>
					<li class="home"><a href="HomeServlet"  id="home">ホーム</a></li>
					<li><a href="STopServlet" id="shop">ショップ</a></li>
					<li><a href="MypageServlet" id="mypage">マイページ</a></li>
					<li><a href="Game.jsp" id="game">ゲーム</a></li>
				</ul>
			</div>
		</form>

  <div id="contents">
   <a href="index.html">HOME</a>　&gt;　<a href="cart.html">検索結果</a>　&gt;　<a href="">温泉詳細</a>　&gt;　温泉予約<br>

   <form  action="/onsen/OKakuninServlet">
   <div id="main">
    <div  class="area">
      <table border="" cellpadding="2" cellspacing="1" bgcolor="">
       <tr>
        <td style="width: 70px; height: 34px;">
        <% if(year+month != c.get(Calendar.YEAR)+c.get(Calendar.MONTH) + 1){ %>
        <input type="submit" name="btn" value="前月" style="width: 70px; height: 34px;">
        <% } %>
        </td>
        <td width="350"><b style="color:#333333;"><font size="5"><%= year %>年<%= month %>月</font></b></td>
        <td style="width: 70px; height: 34px;">
        <% if(month < c.get(Calendar.MONTH) + 3){ %>
        <input type="submit" name="btn" value="次月" style="width: 70px; height: 34px;">
        <% } %>
        </td>
        <input type="hidden" name="Y" value="<%=year%>">
        <input type="hidden" name="M" value="<%=month%>">
       </tr>
      </table>

      <table border="" cellpadding="2" cellspacing="1" >
       <tr>

        <td><script type="text/javascript">document.write(cal(<%= year %>,<%= month %>,<%= heya %>))</script></td>
       </tr>
      </table>


     <p align="right"><font size="4"><font color="red">赤</font>…満室</font></p>

      <input type="submit" name="btn" value="予約確認画面へ" style="width: 150px; height: 50px">

    </div>
   </div><!-- /#main -->

   <div id="sub">
    <div class="section">
     <h2>予約人数</h2>
     <font size="2px">
     <ul>
      <li>・予約人数　
      …　<input type="number" name="ninzu" style="width: 40px;" value="<%= ninzu %>" required="required" min="1" max="100">人</li>
     </ul>
     <ul>
      <li>・予約部屋数
      …　<input type="number" name="heya" style="width: 40px;" value="<%= heya %>" required="required" min="1" max="50">室</li>
     </ul>
     </font>
     <ul>
      <input type="submit" name="btn" value="決定" style="width: 190px; height: 30px"></a>
     </ul>
    </div><!-- /.section -->
   </div><!-- /#sub -->
   </form>

   <div id="pageTop">
    <a href="#top">ページのトップへ戻る</a>
   </div><!-- /#pageTop -->
  </div><!-- /#contents -->

  <div id="footer">
   <div class="copyright">Copyright &copy; 2011 YOUR SITE NAME All Rights Reserved.</div>
  </div><!-- /#footer -->
 </div><!-- /#top -->

</body>
</html>