<%@page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@page import="java.util.ArrayList" %>
<%@page import="jp.ac.fjb.eLearning.bean.listeningFormBean" %>

<% ArrayList<listeningFormBean> list= (ArrayList)session.getAttribute("listening");
String tensu = (String) session.getAttribute("TEN");%>

<!DOCTYPE html>
<html lang="ja">
<script type="text/javascript" src="js/listeningReturn.js"></script>
<script type="text/css" src="css/Listening.css"></script>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Lesson1</title>
<style type="text/css">

		p.line {color:black; background:yellowgreen;}

</style>


</head>
<body>


<h3>Lesson1</h3>
<center>
<h2>Lesson1　回答および解説</h2>

<input type="text" value="<%=tensu%>" size="4">点



</center>
<div id=Q>

<% for (int i=0; i<list.size(); i++) {
listeningFormBean lis = list.get(i);%>

<p><%=lis.getQuestionText() %></p>

<br>

<br><br>
<center>
<!--<p class="line">-->
<audio id="audio" controls width="320" height="240">
<source src="<%=lis.getMusicName() %>">
</audio><br>

<input type="text" ><br>
答え”<%=lis.getAnswer() %>”<br>
<%=lis.getAnswerText() %>

</center>
</div>
<% } %>

<center>
<form action="/eLearning/ListeningNextServlet">
<BUTTON>リトライ！</BUTTON>
</form>

<form action="/eLearning/ListeningServlet" id="EnglishForm">
<BUTTON id="Lbtn">Listening目次へ</BUTTON>
<input type="hidden" id="kamokuID" name="kamokuID"></input>

</form>

<BR>

</center>
</body>

</html>
