<%@page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<%-- ヘッドの挿入 --%>
<%@include file="head.jsp" %>
<link href="./css/login.css" rel="stylesheet" type="text/css" />
<!-- <link href="./css/login.css" rel="stylesheet" type="text/css" /> -->
<title>ログイン-FJBマラベル-</title>
</head>
<body>

<%-- ヘッダーの挿入 --%>
<%@include file="header.jsp" %>

<div id="wrapper">

<%-- メニューの挿入 --%>
<%@include file="menu.jsp" %>

<div id="contents"><!-- ここから内容編集 -->

<h3>ログイン画面</h3>

ユーザIDとパスワードを入力して下さい。
<form action="/travelsys/LoginServlet" id="">
	ユーザID ： <input type="text" name="id" id="id"><br>
	パスワード：<input type="password" name="pass" id="pass"><br>
	<br>
	<input type="submit" value="ログイン" class="btnPadding">
	<input type="reset" value="リセット" class="btnPadding">
</form>



新規登録の方は<a href="userregister.jsp"><span class="bold">こちら</span></a>。<br>

</div><!-- contents end　ここまで編集 -->

</div><!-- wrapper end -->

<%-- フッターの挿入 --%>
<%@include file="footer.jsp" %>

</body>
</html>
