<%@page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>

<head>
<script src="http://ajaxzip3.googlecode.com/svn/trunk/ajaxzip3/ajaxzip3.js" charset="UTF-8"></script>
<script type="text/javascript" src="js/screenTransition.js"></script>
<link href=css/style.css rel="stylesheet"type="text/css"/>
</head>

<body>
<div id="t">
	<img src="img/logo/logo.jpg" width="380" height="260"/>
	<font color = red>
	<%
		if(session .getAttribute("ERROR_LOGIN") != null) {%>
			<%= session .getAttribute("ERROR_LOGIN") %>
	<%
	}
	%>
	</font>

	<form id="form" name="form" action="">
		ID:<input type="text" name="id"><br>
		PW:<input type="password" name="pass"><br>
		<input type="submit" value="LOGIN" onClick="goLoginServlet();">
		<input type="reset"  value="CLEAR">
	</form>

</div>
</body>

</html>