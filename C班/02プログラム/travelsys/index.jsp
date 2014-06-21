<%@page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<html>
<head>
<script src="./script/Menu.js"></script>
<%-- ヘッドの挿入 --%>
<%@include file="head.jsp" %>
<link href="./css/indexStyle.css" rel="stylesheet" type="text/css" />
<title>FJBマラベル-総合旅行サイト-</title>
</head>
<body>
<%-- ヘッダーの挿入 --%>
<%@include file="header.jsp" %>

<div id="headimg">
<img src="./images/kabumara01.jpg">
</div><!-- headimg end -->

<div id="wrapper">
<%-- メニューの挿入 --%>
<%@include file="menu.jsp" %>

<div id="contents"><!-- ここから内容編集 -->

<div class="wrap">
<h1>お知らせ</h1>
	<ul>
		<li>2013/9/18(水)人気のプランの更新！</li>
		<li>2013/9/19(木)旬のプラン更新！</li>
		<li>2013/9/20(金)お知らせ</li>
	</ul>
</div>

<div class="wrap">
<h1>旬な旅行プラン</h1>
	<table>
		<tr>
			<td class="left">
			<img src="images/yachimata.jpg">
			</td>
			<td>
				<p><span class="bold">八街</span></p>
				<p>落花生でおなじみの八街！</p>
				<p>落花生堀りをしておいしい落花生を食べられます！芋、サツマイモ、ニンジンなど、野菜全般の収穫体験も1月ごろまで楽しめます。</p>
				<form id="imdexForm01" class="right" action="<%=request.getContextPath()%>/IndexServlet">
						<input type="hidden" id="planInfo" name="planInfo" value="p0142">
						<input type="hidden" id="planInfo2" name="planInfo2" value="八街">
						<input type="submit" id="detail01" class="btnPadding" name="八街" value="詳細">
				</form>
			</td>
		</tr>
	</table>
</div>

<div class="wrap">
<h1>人気の旅行プラン</h1>
	<table>
		<tr>
			<td class="left">
			<img src="images/kiyomizudera.jpg">
			</td>
			<td>
				<p><span class="bold">京都</span></p>
				<p>大人気京都の清水寺観光プラン！</p>
				<p>日本内外から大人気のスポットの清水寺を中心に京都を観光しましょう！</p>
				<form id="imdexForm02" class="right" action="<%=request.getContextPath()%>/IndexServlet">
						<input type="hidden" id="planInfo" name="planInfo" value="p0146">
						<input type="hidden" id="planInfo2" name="planInfo2" value="京都">
						<input type="submit" id="detail02" class="btnPadding" name="京都" value="詳細">
				</form>
			</td>
		</tr>
	</table>
</div>
</div><!-- contents end ここまで編集 -->

</div><!-- wrapper end -->

<%-- フッターの挿入 --%>
<%@include file="footer.jsp" %>
</body>
</html>
