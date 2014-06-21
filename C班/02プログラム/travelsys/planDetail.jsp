<%@page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@page import="java.util.ArrayList" %>
<%@page import="jp.ac.fjb.sotuken.bean.PlanDetailBean" %>
<%@page import="jp.ac.fjb.sotuken.bean.HotelBean" %>

<%
	ArrayList<PlanDetailBean> list = (ArrayList)session.getAttribute("DET");
	HotelBean list2 = (HotelBean)session.getAttribute("CAG");
%>

<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<%@include file="head.jsp" %>
<link href="./css/syousaiStyle.css" rel="stylesheet" type="text/css" />
<script type="text/javascript" src="./script/a.js"></script>
<title>詳細画面</title>
</head>

<body>
<%@include file="header.jsp" %>

<div id="wrapper">
<%@include file="menu.jsp" %>



<div id="contents"><!-- ここから内容編集 -->


<!------------------------------------------------------>
<h3>詳細画面</h3>
<!------------------------------------------------------>
<form action="/travelsys/HotelChangeServlet" id="for">
<%
        	for(int i=0; i<list.size(); i++){
                	PlanDetailBean a = list.get(i);
 %>

	<input type="hidden" name="kenName" value="<%= a.getKenName()  %>">

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
		<img src="./images/<%= a.getAreaImgUrl()  %>"  align="left" class="example">
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

		<input type="date" name="date" min=<%= a.getPlanDateStart() %> max=<%=a.getPlanDateEnd() %> value=<%= a.getPlanDateStart() %>>
	</div>

<!------------------------------------------------------>

	<div id="a">
		<h4>人数</h4>
	</div>

	<div id="b">
		<input type="number" name="ninzu" min="1" max=<%= a.getPeople() %> value="1" required/>名
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
		HotelBean b = list2;
 %>

	<div id="a">
		<h4>宿泊先</h4>
	</div>

	<div id="b">
		<table border=0>
		<tr>
		<td width="1000">
		<img src="./images/<%= b.getImage() %>" align="left" class="example">
		<p>
		<%= b.getComment() %>
		</p>
		</td>
		</tr>
		</table>
		<br>ホテル：<%= b.getHotelName() %>
		<br>チェックイン：<%= b.getCheckinStart().substring(0,5) %>
		<br><%= b.getStayDate() %>泊：<%= b.getPrice() %>円
	</div>

<!------------------------------------------------------>

	<div id="a">
		<h4>料金(交通費込)</h4>
	</div>

	<div id="b">
		<%= b.getDefaultPrice() %>円
	</div>

<!------------------------------------------------------>



	<div id="button">
		<input type="button" value="アレンジ"  id="are"  style="WIDTH: 150px; HEIGHT: 30px">
		<input type="button" value="予約" id="yoy" style="WIDTH: 150px; HEIGHT: 30px">
		<input type="hidden" name="aId" id="aId" value="">
	</div>

</form>



</div><!-- contents end　ここまで編集 -->

</div><!-- wrapper end -->








<%@include file="footer.jsp" %>
</body>
</html>