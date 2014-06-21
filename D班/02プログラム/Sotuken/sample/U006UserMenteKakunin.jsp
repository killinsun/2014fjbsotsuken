<%@page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@page import="java.util.ArrayList" %>
<%@page import="jp.ac.fjb.sotuken.bean.UserBean" %>

<%
	// ログイン中のユーザの情報
	UserBean loginUser = (UserBean)session.getAttribute("LOGIN_USER");

	// 登録または変更または削除するユーザの情報
	UserBean menteUser = (UserBean)session.getAttribute("MENTE_USER");

	// 登録または変更または削除を区別するための処理名
	String process = (String)session.getAttribute("MENTE_PROCESS");
%>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8" />
    <title>ユーザ情報メンテナンス画面 【確認画面】</title>
    <script src="./script/U006UserMenteKakunin.js"></script>
</head>

<body>

<h2>ユーザ情報メンテナンス画面 【確認画面】</h2>

ようこそ<%= loginUser.getUserName() %>さん。<br>
<% if ( process.equals("TOUROKU") ) { %>
	以下のユーザを新規登録します。よろしければ確認ボタンを押して下さい。<br><br>
<% } else if ( process.equals("HENKOU") ) { %>
	以下のユーザ情報を変更します。よろしければ確認ボタンを押して下さい。<br><br>
<% } else if ( process.equals("SAKUJO") ) { %>
	以下のユーザ情報を削除します。よろしければ確認ボタンを押して下さい。<br><br>
<% } %>

<form action="/sample/UserMenteKakuninServlet" id="form">

    <table border="1">
        <tr>
            <th>項目</th>
            <th>入力値</th>
        </tr>
        <tr>
            <td>ユーザID</td>
            <td><%=menteUser.getUserId()%></td>
        </tr>
        <tr>
            <td>ユーザ名</td>
            <td><%=menteUser.getUserName()%></td>
        </tr>
        <tr>
            <td>ユーザ種別</td>
            <td><%=menteUser.getUserType()%></td>
        </tr>
        <tr>
            <td>パスワード</td>
            <td>非表示</td>
        </tr>
        <tr>
            <td>メールアドレス</td>
            <td><%=menteUser.getMailAddress()%></td>
        </tr>
        <tr>
            <td>生年月日</td>
            <td><%=menteUser.getBirthDay()%></td>
        </tr>
        <tr>
            <td>住所</td>
            <td><%=menteUser.getAddress()%></td>
        </tr>
    </table>


	<input type="button" id="kakuninButton" value="確認">
	<input type="button" id="backButton" value="戻る">

	<input type="hidden" id="progId" name="progId">
</form>

</body>
</html>
