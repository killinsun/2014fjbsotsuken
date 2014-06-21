<%@page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@page import="jp.ac.fjb.sotuken.bean.UserBean" %>

<%
	UserBean loginUser = (UserBean)session.getAttribute("LOGIN_USER");
%>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8" />
    <title>メニュー画面</title>
    <script src="./script/U002Menu.js"></script>
</head>

<body>

<h2>メニュー画面</h2>

ようこそ<%= loginUser.getUserName() %>さん。処理を選択してください。
<form action="/sample/MenuServlet" id="form">
	<input type="button" id="userButton" value="ユーザ情報メンテナンス">
	<input type="button" id="syohinButton" value="商品メンテナンス">
	<input type="button" id="uriageButton" value="売り上げ情報メンテナンス">

	<input type="hidden" id="progId" name="progId">
</form>

</body>
</html>
