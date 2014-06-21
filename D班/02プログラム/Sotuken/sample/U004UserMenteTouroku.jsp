<%@page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@page import="java.util.ArrayList" %>
<%@page import="jp.ac.fjb.sotuken.bean.UserBean" %>

<%
	// ログイン中のユーザの情報
	UserBean loginUser = (UserBean)session.getAttribute("LOGIN_USER");

	// 登録するユーザの情報
	UserBean menteUser = (UserBean)session.getAttribute("MENTE_USER");
%>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8" />
    <title>ユーザ情報メンテナンス画面 【新規登録画面】</title>
    <script src="./script/U004UserMenteTouroku.js"></script>
</head>

<body>

<h2>ユーザ情報メンテナンス画面 【新規登録画面】</h2>

ようこそ<%= loginUser.getUserName() %>さん。新規登録するユーザの情報を入力して下さい。<br><br>

<form action="/sample/UserMenteTourokuServlet" id="form">

    <table border="1">
        <tr>
            <th>項目</th>
            <th>入力値</th>
        </tr>
        <tr>
            <td>ユーザID</td>
            <td><input type="text" name="userId"    value="<%=menteUser.getUserId()%>"></td>
        </tr>
        <tr>
            <td>ユーザ名</td>
            <td><input type="text" name="userName"  value="<%=menteUser.getUserName()%>"></td>
        </tr>
        <tr>
            <td>ユーザ種別</td>
            <td><input type="text" name="userType"  value="<%=menteUser.getUserType()%>"></td>
        </tr>
        <tr>
            <td>パスワード</td>
            <td><input type="password" name="passWord"  value=""></td>
        </tr>
        <tr>
            <td>パスワード（確認用）</td>
            <td><input type="password" name="passWord2" value=""></td>
        </tr>
        <tr>
            <td>メールアドレス</td>
            <td><input type="text" name="mailAddress"   value="<%=menteUser.getPassWord()%>"></td>
        </tr>
        <tr>
            <td>生年月日</td>
            <td><input type="text" name="birthDay"  value="<%=menteUser.getBirthDay()%>"></td>
        </tr>
        <tr>
            <td>住所</td>
            <td><input type="text" name="address"   value="<%=menteUser.getAddress()%>"></td>
        </tr>
    </table>


	<input type="button" id="insertButton" value="新規登録">
	<input type="button" id="backButton" value="戻る">

	<input type="hidden" id="progId" name="progId">
</form>

</body>
</html>
