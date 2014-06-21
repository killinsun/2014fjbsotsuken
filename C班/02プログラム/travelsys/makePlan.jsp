<%@page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<script src="./script/Menu.js"></script>
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
<br><img src="./images/neko.png" width="700" height="400">
</div><!-- contents end　ここまで編集 -->

</div><!-- wrapper end -->

<%-- フッターの挿入 --%>
<%@include file="footer.jsp" %>

</body>
</html>
