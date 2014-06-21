<%@page contentType="text/html; charaset=UTF-8" pageEncoding="UTF-8"%>
<%@page import="jp.ac.fjb.onsen.bean.UserBean"%>

<%
	UserBean loginUser = (UserBean) session.getAttribute("LOGIN_USER");
%>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml" xml:lang="ja" lang="ja">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta http-equiv="Content-Style-Type" content="text/css" />
<meta http-equiv="Content-Script-Type" content="text/javascript" />
<meta http-equiv="imagetoolbar" content="no" />
<meta name="description" content="" />
<meta name="keywords" content="" />
<link rel="stylesheet" href="css/reg.css" type="text/css" />
<script type="text/javascript" src="js/jquery.js"></script>
<script type="text/javascript" src="js/common.js"></script>
<title>温ラインショップ</title>
</head>
<body>
	<div id="top">
		<div id="headWrap">
			<div id="header">
				<h1>
					<a href="index.html"><img src="images/rogo2.png" alt="" />
					</a>
				</h1>
				<div id="gnavi">
					<ul>
						<li><font size="4">ようこそ!! <%=session.getAttribute("LOGIN_USERsei")%>さん</font>
						</li>
						<li><font size="4" color='green'><a href="LoginServlet">ログアウト</a>
						</font>
						</li>
					</ul>
				</div>
			</div>
			<!-- /#header -->
		</div>
		<!-- /#headWrap -->
		<div id="menu">
			<ul>
			<li class="home"><a href="HomeServlet"  id="home">ホーム</a></li>
			<li><a href="STopServlet" id="shop">ショップ</a></li>
			<li><a href="" id="mypage">マイページ</a></li>
			<li><a href="Game.jsp" id="game">ゲーム</a></li>
			</ul>
		</div>
		<!-- /#menu -->
		<form action="/onsen/MTourokucommitServlet">
		<div id="contents">
			<div id="main">
				<h2>登録情報変更</h2>
				<p class="got">
					<table border="1" cellspacing="0">
						<tr>
							<td width="100"><font size="4">姓</font></td>
							<td><font size="4"> <input type="text" value="<%=loginUser.getSei() %>" name="sei"> </font></td>
						</tr>
						<tr>
							<td width="100"><font size="4">名</font></td>
							<td><font size="4"> <input type="text" value="<%=loginUser.getMei() %>" name="mei"> </font></td>
						</tr>
						<tr>
							<td><font size="4">電話番号</font></td>
							<td><font size="4"><input type="text" value="<%=loginUser.getTel() %>" name="tel">
							</font></td>
						</tr>
						<tr>
							<td><font size="4">ﾒｰﾙｱﾄﾞﾚｽ</font></td>
							<td><font size="4"><input type="text" value="<%=loginUser.getMail() %>" name="mail">
							</font></td>
						</tr>
						<tr>
							<td><font size="4">郵便番号</font></td>
							<td><font size="4"><input type="text" value="<%=loginUser.getYubin() %>" name="yubin">
							</font></td>
						</tr>
						<tr>
							<td><font size="4">住所</font></td>
							<td><font size="4">
<!-- 							<textarea name="address" cols="50" rows="3"></textarea>   --->
								<input type="text" value="<%=loginUser.getTodouhuken() %>" name="todouhuken">
								<input type="text" value="<%=loginUser.getAddress() %>" name="address">
								<input type="text" value="<%=loginUser.getAddress2() %>" name="address2">
							</td>
						</tr>
						<tr>
							<td colspan="2">
								<div style="text-align: right;">
									<input type="submit" value="変更" style="width: 80px; height: 30px">
								</div>
							</td>
						</tr>
					</table>
				</p>
				<p></p>
			</div>
			</form>
			<!-- /#main -->
			<div id="sub">
				<div class="section">
					<h2>
						<font size="4px">マイメニュー</font>
					</h2>
					<ul>
						<font size="3px">
							<li><a href="MypageServlet">登録情報確認</a>
						</li> <br>
							<li><a href="MTourokuhenkouServlet"><font color="blue">登録情報変更</font>
							</a>
						</li> <br>
							<li><a href="MCardServlet">クレジットカード</a>
						</li> <br>
							<li><a href="MKounyuServlet">購入履歴</a>
						</li><br></font>
					</ul>
				</div>
				<!-- /.section -->
				<div class="section"></div>
				<!-- /.section -->
			</div>
			<!-- /#sub -->
			<div id="pageTop">
				<a href="#top">ページのトップへ戻る</a>
			</div>
			<!-- /#pageTop -->
		</div>
		<!-- /#contents -->
		<div id="footer">
			<div id="footMenu">
				<ul>
				</ul>
			</div>
			<!-- /#footerMenu -->
			<div class="copyright">Copyright &copy; 2011 YOUR SITE NAME All
				Rights Reserved.</div>
		</div>
		<!-- /#footer -->
	</div>
	<!-- /#top -->
</body>
</html>