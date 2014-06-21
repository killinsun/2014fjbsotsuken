<%@page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@page	import = "jp.ac.fjb.eLearning.bean.WritingDougaFormBean" %>
<% WritingDougaFormBean WritingDouga = (WritingDougaFormBean)session.getAttribute("DOUGA"); %>


<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01//EN" "http://www.w3.org/TR/html4/strict.dtd">
<html lang="ja">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<script type="text/javascript" src="/eLearning/js/Writing douga.js"></script>
<title><%=WritingDouga.getTitle() %></title>
</head>
<body>
<form id="WDform">
<center>
<h3><%=WritingDouga.getTitle() %></h3>

<video src = "<%=WritingDouga.getDouga() %>" width="600" height="366"  controls></video>

<br>
<textarea rows="4"  name="body" cols="83"></textarea>
<br><br>
</center>
<center>
<input type="button"  value="確認テストへ" id="Testbtn">
<input type="button"  value="Writing目次へ" id="Rebtn"><BR>
</center>
</body>
</form>
</html>
