<%@page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<%@include file="head.jsp" %>
<link href="./css/searchStyle.css" rel="stylesheet" type="text/css" />
<script type="text/javascript" src="./script/range.js"></script>
<title>検索画面</title>
</head>

<body>
<%@include file="header.jsp" %>

<div id="wrapper">
<%@include file="menu.jsp" %>


<div id="contents"><!-- ここから内容編集 -->

<!------------------------------------------------------>
<h3>プラン検索</h3>
<br>

<!------------------------------------------------------>

<div id="c2">
<center>
検索
<form action="/travelsys/SerchOkServlet" id="ran" name="ran">
<input type="text" name="soa" size="30" maxlength="20" value="">
<input type="button" name="uuu" id="kensaku" class="btnPadding" value="検索" autofocus>
<br>


<br><img src="images/tp1.jpg" name="huyu" id="huyu" width="500" height="125" >



<br><img src="images/tp2.jpg" name="yasui" id="yasui" width="500" height="125">



<br><img src="images/tp3.jpg" name="aki" id="aki" width="500" height="125">

<input type="hidden" id="pi" name="pi">
<input type="hidden" id="key" name="key">
</form>

</center>

</div>



</from>

</div><!-- contents end　ここまで編集 -->

</div><!-- wrapper end -->







<%@include file="footer.jsp" %>
</body>
</html>