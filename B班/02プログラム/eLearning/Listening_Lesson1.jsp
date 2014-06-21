<%@page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@page import="java.util.ArrayList" %>
<%@page import="jp.ac.fjb.eLearning.bean.listeningFormBean" %>

<% ArrayList<listeningFormBean> list= (ArrayList)session.getAttribute("listening");%>
<!DOCTYPE html>
<html lang="ja">

<head>
<script type="text/javascript" src="js/listeningReturn.js"></script>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<title >Lesson1</title>
<style type="text/css">
	#question{
		width: 600px;
		margin: 0 auto;
	}
	#ques{
		float:right;
		}
		p.line {color:black; background:yellowgreen;}
</style>



</head>

<body>
<!--<form id="Dform">  -->






<h2>Lesson1</h2>
<p>次の音声を聞き問題に答えなさい。</p>


<% for (int i=0; i<list.size(); i++) {
listeningFormBean lis = list.get(i); %>

	<p class="line" name="questionID"><%=lis.getQuestionText() %></p>
<center>
			<audio id="audio" controls width="320" height="240">
			<source src="<%=lis.getMusicName() %>"></source>
			</audio><br>

<form action="/eLearning/ListeningAnswerServlet">
		<input type="text" id="UserAnswer<%= i %>" name="UserAnswer<%= i %>">

		<br>

</center>



<% } %>

<center>

<BUTTON>採点＆解説へ</BUTTON>
</form>

<form  id="EnglishForm">
<button type="button" name="button1" value="" id="Lbtn">Listening目次へ</button>
<input type="hidden" id="kamokuID" name="kamokuID"></input>
</form>


</center>


</body>
</html>