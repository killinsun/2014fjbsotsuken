<%@page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@page import="jp.ac.fjb.sotuken.bean.userregisterFormBean" %>

<%userregisterFormBean registerUser = (userregisterFormBean)session.getAttribute("REGISTER_USER"); %>

<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<%@include file="head.jsp" %>
<link href="./css/StyleSheet1.css" rel="stylesheet" type="text/css" />
<title>ユーザ登録確認画面－FJBマラベル－</title>
</head>
<body>
<%@include file="header.jsp" %>
<div id="wrapper">
<%@include file="menu.jsp" %>


<div id="contents"><!-- ここから内容編集 -->
<form action="/travelsys/userkakuninServlet" id="member">
<h3>ユーザ登録確認</h3>
   <fieldset>
  <center><table border="1">
	<tr>
		<td>ユーザID</td>
		<td><%=registerUser.getLogin_id()%>
		</td>
	</tr>
	<tr>
		<td>パスワード</td>
		<td><%=registerUser.getLogin_pw()%>
		</td>
	</tr>
	<tr>
		<td>メールアドレス</td>
		<td><%=registerUser.getEmail()%>
		</td>
	</tr>
	<tr>
		<td>氏名</td>
		<td><%=registerUser.getName1()%>
		</td>
	</tr>
	<tr>
		<td>フリガナ</td>
		<td><%=registerUser.getName2()%>
		</td>
	</tr>
	<tr>
		<td>生年月日</td>
		<td><%=registerUser.getYear()%>年<%=registerUser.getMonth()%>月<%=registerUser.getDay()%>日
		</td>
	</tr>
	<tr>
		<td>性別</td>
		<td><%=registerUser.getSex()%>
		</td>
	</tr>
	<tr>
		<td>郵便番号</td>
		<td><%=registerUser.getPostcode()%>
		</td>
	</tr>
	<tr>
		<td>住所</td>
		<td><%=registerUser.getAddress()%>
		</td>
	</tr>
	<tr>
		<td>電話番号</td>
		<td><%=registerUser.getTel()%>
		</td>
	</tr>
</table></center>
	<p><br>
        <center>この内容で登録する</center>
        <br></p>
    </fieldset>

    <br>
                <p>
                   <center>
                   <input type="submit" name="touroku" value=" 登録する " class="btnPadding">
				   </center>
				</p>

            </p>


</form>



</div><!-- contents end　ここまで編集 -->

</div><!-- wrapper end -->

<div id="footer">
Copyright (C) 2013 株式会社 FJBマラベル
</div><!-- footer end -->


</body>
</html>