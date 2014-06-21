<%@page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<%@include file="head.jsp"%>
<link href="./css/StyleSheet1.css" rel="stylesheet" type="text/css" />
<title>ユーザー登録完了－FJBマラベル－</title>
</head>
<body>
	<%@include file="header.jsp"%>
	<div id="wrapper">
		<%@include file="menu.jsp"%>

		<div id="contents">
			<!-- ここから内容編集 -->
			<h3>ユーザー登録完了</h3>


			<form action="/travelsys/userendServlet" id="member">
				<fieldset>
					<p>
					<center>
						<br> ユーザー登録が完了しました <br> <br>
					</center>
					</p>
				</fieldset>
				<p>
				<center>
					<br> <input type="submit" name="kakunin" value=" ログインする "
						class="btnPadding">
				</center>
				</p>
			</form>



		</div>
		<!-- contents end　ここまで編集 -->

	</div>
	<!-- wrapper end -->

	<div id="footer">Copyright (C) 2013 株式会社 FJBマラベル</div>
	<!-- footer end -->


</body>
</html>
