<%@page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@page import="java.util.ArrayList" %>
<%@page import="jp.ac.fjb.sotuken.bean.PlanDetailBean" %>
<%@page import="jp.ac.fjb.sotuken.bean.HotelChangeBean" %>
<%@page import="jp.ac.fjb.sotuken.bean.UkewatasiBean" %>

<%
	ArrayList<PlanDetailBean> list = (ArrayList)session.getAttribute("DET");
	ArrayList<HotelChangeBean> list2 = (ArrayList)session.getAttribute("CAG");
	UkewatasiBean uk=(UkewatasiBean)session.getAttribute("UKEWATASI");
%>


<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<%@include file="head.jsp" %>
<link href="./css/syousaiStyle.css" rel="stylesheet" type="text/css" />
<title>宿泊先変更画面</title>
</head>

<body>
<%@include file="header.jsp" %>

<div id="wrapper">
<%@include file="menu.jsp" %>

<div id="contents"><!-- ここから内容編集 -->

<form>

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
		<img src="./images/<%= a.getAreaImgUrl() %>" align="left" class="example">
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
		<input type="date" name="example" min=<%= a.getPlanDateStart() %> max=<%=a.getPlanDateEnd() %> value=<%= uk.getDate() %>>
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

<%
        	for(int i=0; i<list2.size(); i++){
                	HotelChangeBean b = list2.get(i);
 %>

	<div id="a">
		<h4>宿泊先</h4>
	</div>

	<div id="b">
		<table border=0>
		<tr>
		<td width="1000">
		<img src="<%= b.getHotelImgUrl() %>" align="left" class="example">
		<p>
		<%= b.getHotelComment() %>
		</p>
		</td>
		</tr>
		</table>
		ホテル：
		<select  size="1">
			<option value=""><%= b.getHotelName() %></option>
			<option value=""><%= b.getHotelName() %></option>
			<option value=""><%= b.getHotelName() %></option>
		</select>
		<br>
		チェックイン
			<input type="time"  min=<%= b.getCheckinStart() %> max=<%= b.getCheckinEnd() %> value=<%= b.getCheckinStart() %>>

		<br><%= b.getStayDate() %>泊：<%= b.getStayFee() %>円
	</div>



<!------------------------------------------------------>

	<div id="a">
		<h4>料金(交通費込)</h4>
	</div>

	<div id="b">
		<%= b.getDefaultFee() %>円
	</div>

<!------------------------------------------------------>
<% } %>

	<div id="button">
		<input type="button" value="予約" onclick="location.href='006Kessai.jsp'"style="WIDTH: 150px; HEIGHT: 30px">
	</div>

</form>
</div><!-- contents end　ここまで編集 -->

</div><!-- wrapper end -->








<%@include file="footer.jsp" %>
</body>
</html>