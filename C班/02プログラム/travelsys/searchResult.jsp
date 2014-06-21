<%@page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@page import="java.util.ArrayList" %>
<%@page import="jp.ac.fjb.sotuken.bean.PlanKeywordBean" %>

<%
	// メンテ対象のユーザ一覧
	ArrayList<PlanKeywordBean> list = (ArrayList)session.getAttribute("SEA");
%>


<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<%@include file="head.jsp" %>
<link href="./css/planStyle.css" rel="stylesheet" type="text/css" />
<link href="./css/bbsStyle.css" rel="stylesheet" type="text/css" />
<title>検索結果</title>
</head>

<body>
<%@include file="header.jsp" %>

<div id="wrapper">
<%@include file="menu.jsp" %>

<div id="contents"><!-- ここから内容編集 -->
<h3>当社プラン一覧</h3>





<%
        	for(int i=0; i<list.size(); i++){
                	PlanKeywordBean a = list.get(i);
 %>



	<div id="bbs1" class="bbsWrap">

		<div class="title"> <%= a.getPlanName()  %> </div>
		<div class="planCnt">
			<table>
			<tr>
				<td><img src="./images/<%= a.getImgUrl() %>" ></td>

				<td>
				<p><%= a.getComment() %></p>

				<form class="right"  action="<%= request.getContextPath()%>/PlanDetailServlet">

					<input type="hidden" name="planName" value="<%= a.getPlanName()  %>">
					<input type="hidden" name="planId" value="<%= a.getPlanId()  %>">
					<input type="submit" value="詳細" style="WIDTH: 150px; HEIGHT: 30px">

				</form>

			</td>
			<tr>
				<td colspan="2">
				<div class="pliceWrap">
				&yen;<%= a.getDefaultFee()  %>
				</div>
				</td>
			</tr>
			</table>
		</div><!-- planCnt end -->
	</div><!-- bbsWrap end -->


 <% } %>


</div><!-- contents end　ここまで編集 -->

</div><!-- wrapper end -->

<%@include file="footer.jsp" %>
</body>
</html>