<%@page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@page import="jp.ac.fjb.onsen.bean.UserBean" %>


<!DOCTYPE html>
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
		<meta http-equiv="Content-Style-Type" content="text/css" />
		<meta http-equiv="Content-Script-Type" content="text/javascript" />
		<meta http-equiv="imagetoolbar" content="no" />
		<meta name="description" content="" />
		<meta name="keywords" content="" />
		<link rel="stylesheet" href="css/rogin.css" type="text/css" />
		<script type="text/javascript" src="js/jquery.js"></script>
		<script type="text/javascript" src="js/common.js"></script>
		<title>温ラインショップ</title>
	</head>

	<body>
		<div id="top">
			<div id="headWrap">
				<div id="header">
					<h1><a href="index.html"><img src="images/rogo2.png" alt="" /></a></h1>
					<div id="pr">
					<p>温泉を紹介します。</p>
					</div>
				</div><!-- /#header -->
			</div><!-- /#headWrap -->

			<div id="menu">
				<ul>
				<li class="home"><a href="HomeServlet">ホーム</a></li>
				<li><a href="index.html">ショップ</a></li></ul>
				<li><a href="LoginServlet">マイページ</a></li>
				<li><a href="index.html">ゲーム</a></li>
				</ul>
			</div><!-- /#menu -->

			<div id="contents">
				<div class="area">
					<hr color="#ff8c00" size="5">
					<h1 align="center">ログイン画面</h1>
					<hr color="#ff8c00" size="5">
					<br><br>
<form action="/onsen/LoginServlet">
					<%
					if(session.getAttribute("ERROR_LOGIN")!=null)
						out.print(session.getAttribute("ERROR_LOGIN"));
					%>
					<table summary="" align="center" height="120px">
						<tr>
							<td width="140"><font size="5">ID</font></td>
							<td><input type="text" name="id" value="on13000" required></td>
						</tr>
						<tr>
							<td width="140px"><font size="5">Password</font></td>
							<td><input type="password" name="pass" value="" required></td>
						</tr>
					</table><br>
					<table summary="" align="center" width="330">
						<tr align="center">
							<td><input type="image"  src="images/roginBtn.png" alt="" width="150"></td>
							<td><a href="touroku.html"><img src="images/sinkiTourokuBtn.png" alt="" width="150"></a></td>
						</tr>
					</table>
</form>
					<br><br>
				</div>
			</div><!-- /#contents -->

			<div id="footer">
				<div class="copyright">Copyright &copy; 2011 YOUR SITE NAME All Rights Reserved.</div>
			</div><!-- /#footer -->
		</div><!-- /#top -->
	</body>
</html>