<%@page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@page import="java.util.ArrayList" %>
<%@page import="jp.ac.fjb.sotuken.bean.RirekiBean" %>
<%
ArrayList<RirekiBean> list = (ArrayList)session.getAttribute("RIREKI");
%>
<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<script src="./script/Menu.js"></script>
<script src="./script/UserMenu.js"></script>
<%-- ヘッドの挿入 --%>
<%@include file="head.jsp" %>
<link href="./css/planPressStyle.css" rel="stylesheet" type="text/css" />
<title>新規プラン投稿-FJBマラベル-</title>
</head>
<body>

<%-- ヘッダーの挿入 --%>
<%@include file="header.jsp" %>

<div id="wrapper">

<%-- メニューの挿入 --%>
<%@include file="menu.jsp" %>

<div id="contents"><!-- ここから内容編集 -->
<h3>ユーザメニュー画面</h3>
<h2>お客様情報</h2>
<table border="1">
	<tr>
		<th>ユーザID</th><td><%=loginUser.getUserId() %></td>
	</tr>
	<tr>
		<th>メールアドレス</th><td><%= loginUser.getMailAddress() %></td>
	</tr>
	<tr>
		<th>氏名</th><td><%=loginUser.getUserName() %></td>
	</tr>
	<tr>
		<th>フリガナ</th><td><%=loginUser.getHurigana() %></td>
	</tr>
	<tr>
		<th>生年月日</th><td><%=loginUser.getBirthDay() %></td>
	</tr>
	<tr>
		<th>性別</th><td><%=loginUser.getSeibetu() %></td>
	</tr>
	<tr>
		<th>郵便番号</th><td><%=loginUser.getYubin() %></td>
	</tr>
	<tr>
		<th>住所</th><td><%=loginUser.getAddress() %></td>
	</tr>
	<tr>
		<th>電話番号</th><td><%=loginUser.getTell() %></td>
	</tr>
</table>

<h2>旅行履歴</h2>
<table border="1">
	<tr>
		<th>旅行日時</th>
		<th>注文ＩＤ</th>
		<th>ツアー名</th>
		<th>合計金額</th>
		<th>支払方法</th>
		<th>備考</th>
	</tr>
 <%
        	for(int i=0; i<list.size(); i++){
            	RirekiBean rireki = list.get(i);
        %>
	<tr>
		<td><%=rireki.getTyumonDay() %></td>
		<td><%=rireki.getTyumonId()%></td>
		<td><%=rireki.getPranName() %></td>
		<td><%=rireki.getRyoukin() %></td>
		<td>クレジットカード</td>
		<td></td>
	</tr>
 <%} %>

</table>
<br>
<form action="UserMenuNextServlet" id="f">
<input type="button" name="aaa"  id="toukou"  value="旅行プラン投稿" class="btnPadding">

<input type="button" name="aaa"  id="info" value="お客様情報変更" class="btnPadding">

<input type="button" name="aaa"  id="qurejit"  value="クレジットカード登録" class="btnPadding">
<input type="hidden" id="prog" name="prog">

</form>
</div><!-- contents end　ここまで編集 -->

</div><!-- wrapper end -->

<%-- フッターの挿入 --%>
<%@include file="footer.jsp" %>

</body>
</html>
