<%@page import="jp.ac.fjb.sotuken.bean.HotelChangeBean"%>
<%@page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@page import="java.util.ArrayList" %>
<%@page import="jp.ac.fjb.sotuken.bean.PlanDetailBean" %>
<%@page import="jp.ac.fjb.sotuken.bean.HotelChangeBean" %>
<%@page import="jp.ac.fjb.sotuken.bean.UkewatasiBean" %>
<%@page import="jp.ac.fjb.sotuken.bean.HotelBean" %>

<%
	ArrayList<PlanDetailBean> list = (ArrayList)session.getAttribute("DET");
	HotelBean list2 = (HotelBean)session.getAttribute("CAG");
	ArrayList<HotelChangeBean> list3 = (ArrayList)session.getAttribute("HTC");
	UkewatasiBean uk=(UkewatasiBean)session.getAttribute("UKEWATASI");
%>


<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<%@include file="head.jsp" %>
<link href="./css/syousaiStyle.css" rel="stylesheet" type="text/css" />
<script type="text/javascript" src="./script/func.js"></script>
<title>宿泊先変更画面</title>
</head>

<body>
<%@include file="header.jsp" %>

<div id="wrapper">
<%@include file="menu.jsp" %>

<div id="contents"><!-- ここから内容編集 -->

<form name="aForm">

<!------------------------------------------------------>
<h3>アレンジ</h3>
<!------------------------------------------------------>
<%
        	for(int i=0; i<list.size(); i++){
                	PlanDetailBean a = list.get(i);
 %>

	<div id="a">
		<h4>プラン名</h4>
	</div>

	<div id="b">
		<%= a.getPlanName()  %>
	</div>

<!------------------------------------------------------>

	<div id="a">
		<h4>観光地</h4>
	</div>

	<div id="b">
		<%= a.getAreaName()  %>
	</div>

<!------------------------------------------------------>

	<div id="a">
		<h4>観光地の紹介</h4>
	</div>

	<div id="b">
		<table border=0>
		<tr>
		<td width="1000">
		<img src="./images/<%= a.getAreaImgUrl()  %>" align="left" class="example">
		<p>
		<%= a.getAreaComment() %>
		</p>
		</td>
		</tr>
		</table>
	</div>




<!------------------------------------------------------>

	<div id="a">
		<h4>日付</h4>
	</div>

	<div id="b">

		<input type="date" name="example" min=<%= a.getPlanDateStart() %> max=<%=a.getPlanDateEnd() %> value="<%= uk.getDate() %>"  required/>
	</div>

<!------------------------------------------------------>

	<div id="a">
		<h4>人数</h4>
	</div>

	<div id="b">
		<input type="number" min="1" max=<%= a.getPeople() %> value="<%=uk.getNinzu() %>" required/>名
	</div>


<% } %>
<!------------------------------------------------------>

<div id="a">
	<h4>交通手段</h4>
</div>

<div id="b">

	【電車】
	<div align="center">
		<br>上野駅 7時03分-9時07分 2時間4分
		<br>↓
		<br>水戸駅 9時22分-10時31分 1時間9分
		<br>↓
		<br>袋田駅 10時31分
	</div>
		<div align="right">
		<br>3時間28分
		<br>片道 2,940円
</div>
<br>
</div>
<!------------------------------------------------------>

<script type="text/javascript" src="func.js"></script>

	<div id="a">
		<h4>宿泊先</h4>
	</div>


	<div id="b">
<% HotelBean b = list2;%>





			<select onChange="setData(this[this.selectedIndex].value)">

			<option selected disabled>ホテルを選択してください</option>
			<%
        	for(int n=0; n<list3.size(); n++){
            	HotelChangeBean c = list3.get(n);
        	%>

			<option value=" <%=c.getHotelComment()%> 1. <%=c.getHotelImgUrl()%> 2. <%=c.getCheckinStart()%> 3. <%=c.getCheckinEnd() %> 4. <%=c.getStayFee()%> 5. <%=b.getStayDate()%> 6.""> <%= c.getHotelName()  %></option>
			<% } %>
			</select>
			<br>

		<table border=0>
		<tr>
		<td width="1000">

		<div id="img"  ></div>
		<div id="coment" ></div>

		<div id="check" ></div>
		<div id="date" style="display: inline-block;_display: inline;"></div>
		<div id="fee" style="display: inline-block;_display: inline;"></div>


		</td>
		</tr>
		</table>

	</div>


<!------------------------------------------------------>

	<div id="a">
		<h4>料金(交通費込)</h4>
	</div>

	<div id="b">
		 <div id="sum">合計金額を表示</div>
	</div>

<!------------------------------------------------------>
	<div id="button">
		<input type="button" value="予約" onclick="location.href='006Kessai.jsp'"style="WIDTH: 150px; HEIGHT: 30px">
	</div>

</form>
</div><!-- contents end　ここまで編集 -->

</div><!-- wrapper end -->








<%@include file="footer.jsp" %>
</body>
</html>