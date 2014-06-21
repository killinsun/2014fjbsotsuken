<%@page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@page import="java.util.ArrayList" %>
<%@page import="jp.ac.fjb.sotuken.bean.UserBean" %>

<%
	// ログイン中のユーザの情報
	UserBean loginUser = (UserBean)session.getAttribute("LOGIN_USER");

	// メンテ対象のユーザ一覧
	ArrayList<UserBean> list = (ArrayList)session.getAttribute("MENTE_USER_LIST");
%>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8" />
    <title>ユーザ情報メンテナンス画面 【一覧画面】</title>
    <script src="./script/U003UserMente.js"></script>
</head>

<body>

<h2>ユーザ情報メンテナンス画面 【一覧画面】</h2>

ようこそ<%=loginUser.getUserName()%>さん。処理を選択してください。<br><br>

<form action="/sample/UserMenteServlet" id="form">

    <table border="1">
        <tr>
            <th>選択</th>
            <th>ユーザID</th>
            <th>ユーザ名</th>
            <th>ユーザ種別</th>
        </tr>

        <%
        	for(int i=0; i<list.size(); i++){
                	UserBean user = list.get(i);
        %>
            <tr>
                <td><input type="radio" name="user" value="<%=user.getUserId()%>"></td>
                <td><%=user.getUserId()%></td>
                <td><%=user.getUserName()%></td>
                <td><%=user.getUserType()%></td>
            </tr>
        <%
        }
        %>
    </table>


	<input type="button" id="insertButton" value="新規登録">
	<input type="button" id="updateButton" value="変更">
	<input type="button" id="deleteButton" value="削除">
	<input type="button" id="backButton" value="戻る">

	<input type="hidden" id="progId" name="progId">
</form>

</body>
</html>
