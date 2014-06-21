<%@page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta http-equiv="Content-Style-Type" content="text/css" />
<meta http-equiv="Content-Script-Type" content="text/javascript" />
<meta name="copyright" content="Nikukyu-Punch" />
<title>ログイン</title>
<link href="css/login2.css" rel="stylesheet" type="text/css" />
<script type="text/javascript" src="js/script.js"></script>
</head>

<body>
<div id="title">
<img src="images/top_title.gif">
</div>
<div id="a" align="center">
<div id="aikon">
<img src="images/syasyou+.gif" id="syasyou" />
</div>
<!--ログインメニュー-->

<div id = "sub">

<form action="/eLearning/TopmenuServlet" id="login">
<h3><img src="images/sub_menu_midashi_submenu4.gif" alt="ログインメニュー" width="226" height="32" /></h3>
<ul class="menubottom">
<p>　ID　<input type="text" name="ID" value="" align="center"></p>
<p>PASS<input type="password" name="PASS" value="" ></p>
<br>

<p style="color: red">

<% if(request.getAttribute("ERROR_LOGIN") != null){ %>
<%= request.getAttribute("ERROR_LOGIN") %>
<% }%>

</p>

<input type="submit"  value="ログイン"><br>
新規登録は<a href="touroku.html">こちら</a>
</ul>
</form>

</div>
</div>
</body>
</html>