<%@page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@page import="java.util.ArrayList" %>
<%@ page import="jp.ac.fjb.Sotuken.bean.LoginBean"%>
<%@ page import="jp.ac.fjb.Sotuken.bean.UserMailBean"%>
<%
	LoginBean lb = (LoginBean) session.getAttribute("LOGIN_USER");

	// ●●●③セッションからメール情報を取得
	UserMailBean umb = (UserMailBean)session.getAttribute("MAIL_USER");
	//UserMailBean umb = (UserMailBean)session.getAttribute("MAIL_USER");
%>

<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<meta name="keywords" content="">
		<meta name="description" content="">
		<link rel="stylesheet" href="stylesheet/template/styleSheet.css" type="text/css"/>
		<link rel="stylesheet" href="stylesheet/template/header.css" type="text/css"/>
		<link rel="stylesheet" href="stylesheet/template/headerContent.css" type="text/css"/>
		<link rel="stylesheet" href="stylesheet/template/footer.css" type="text/css"/>
		<link rel="stylesheet" href="stylesheet/template/form.css" type="text/css"/>
		<link rel="stylesheet" href="stylesheet/template/nav.css" type="text/css"/>
		<link rel="stylesheet" href="stylesheet/014ContentDisplay.css" type="text/css"/>
		<script src="js/jquery.min.js"></script>
		<!--<script src="js/javascript.js"></script>-->

		<title>014内容表示画面</title>
	</head>

<body>

	<!-- ヘッダー　-->
	<div id="header">
		<div id="wrap_header">
			<div id="headerSpace"></div>
			<!-- 会社のロゴ的なもの -->
			<img id="logo" src="img/logo.png" />
			<div id="headerContents">
				<div id="headerContentsSpace"></div>
				<div id="noticeList">
					<!-- 様々なその他の通知  -->
					<div id="various" class="headerList">
						<img class="icoSize" src="img/various.png">
					</div>
					<!-- 友達追加通知  -->
					<div id="friends" class="headerList">
						<img class="icoSize" src="img/friendsIco.png">
					</div>
					<!-- チャット通知  -->
					<div id="realtimeChat" class="headerList">
						<img class="icoSize" src="img/chatIco.png">
					</div>
					<!-- メール通知  -->
					<div id="message" class="headerList">
						<img class="icoSize" src="img/mailIco.png">
					</div>
				</div>
				<div id="menuList">
					<!-- つぶやきボタン-->
					<a href="MyPageServlet">
						<div id="tweetPost" class="headerList">
							<img class="icoSize" src="img/tweet.png">
						</div> </a>
					<!-- 友達検索 -->
					<a href="018UserSearch.jsp">
						<div id="userSearch" class="headerList">
							<img class="icoSize" src="img/memberSearch.png">
						</div> </a>
					<!-- ホーム -->
					<a href="MyPageServlet">
						<div id="myPage" class="headerList">
							<img class="icoSize" src="img/homeIco.png">
						</div> </a>
				</div>
			</div>
		</div>
	</div>
	<!-- ヘッダ終了 -->

	<!-- NAV要素 -->
	<div id="nav">
		<div id="innerNav">
			<!-- ********** nav要素のユーザ領域 *********** -->
			<a href="020UserInfo.jsp">
				<div id="myInformation">
					<div class="navList"><%= lb.getName() %></div>
					<img id="navUserIco" class="ico" src="img/default.png" />
				</div> </a>
			<!-- /********** nav要素のユーザ領域 *********** -->

			<!-- ********** nav要素のニュース領域 *********** -->
			<!-- ***************************************************************************** -->
			<!-- ***************************************************************************** -->
			<!-- ***************************************************************************** -->
			<a href="MailServlet">
				<div id="newFeed">
					<div class="navList">ニュース</div>
					<img class="ico" src="img/newsPaper.png" />

				</div> </a>
			<!-- /********** nav要素のニュース領域 *********** -->

			<!-- ********** nav要素の画像領域 *********** -->
			<a href="MailServlet">
				<div id="album">
					<div class="navList">アルバム</div>
					<img class="ico" src="img/album.png" />

				</div> </a>
			<!-- /********** nav要素のニュース領域 *********** -->
			<!-- ***************************************************************************** -->
			<!-- ***************************************************************************** -->
			<!-- ***************************************************************************** -->
			<!-- ********** nav要素のメール領域 *********** -->
			<a href="MailServlet">
				<div id="mail">
					<div class="navList">メール</div>
					<img class="ico" src="img/mail.png" />

				</div>
			</a>
			<!-- /********** nav要素のメール領域 *********** -->

			<!-- ********** nav要素のチャット領域 *********** -->
			<a href="groupSelectServlet">
				<div id="chat">
					<div class="navList">チャット</div>
					<img class="ico" src="img/chat.png" />

				</div> </a>
			<!-- /********** nav要素のチャット領域 *********** -->

			<!-- ********** nav要素の設定領域 *********** -->
			<a href="006personalInformationChange.jsp">
				<div id="setting">
					<div class="navList">設定</div>
					<img class="ico" src="img/setting.png" />

				</div> </a>
			<!-- /********** nav要素の設定領域 *********** -->


		</div>
	</div>


		<!-- メイン　-->
		<div id="main">
			<!-- ツイートエリアやタイムライン等、全てを含んだ領域  -->
			<div id="timeLine">
				<!-- コンテンツ開始　 -->
				<div id="contents">
					<!-- ********************************************************************** -->
					<!-- メールの領域全体 -->
					<div id="table">
						<!-- メッセージ作成・削除ボタンの領域  -->
						<table id="mailbutton">
							<tr id="action">
								<td id="operation">
								<button id="button1" class="frame button" type="button" value="aaa">
									メッセージ作成
								</button></td>
							</tr>
						</table>

						<!-- 受信箱、下書き、送信箱、ゴミ箱の領域  -->
						<table id="mailtable1">
							<tr>
								<td class="box"> 受信箱 (100) </td>
							</tr>
							<tr>
								<td class="box"> 下書き (件数) </td>
							</tr>
							<tr>
								<td class="box"> 送信箱 (件数) </td>
							</tr>
							<tr>
								<td class="box"> ゴミ箱 (件数) </td>
							</tr>
							<tr>
								<td class="space"></td>
							</tr>
						</table>

						<!-- メールの一覧表示領域 　-->
						<table id="mailtable2">
							<!-- 差出人、件名、送信日時 -->
							<tr>
								<td><b>宛先</b></td>
								<td>
								<input type="text" size="100" maxlength="100" value="<%=umb.getUserAddress() %>" disabled />
								</td>
							</tr>
							<tr>
								<td><b>件名</b></td>
								<td>
								<input type="text" size="100" maxlength="100" value="<%=umb.getSubjectLine() %>" disabled />
								</td>
							</tr>
							<tr>
								<td><b>本文</b></td>
								<td>
									<textarea size="100" maxlength="500" disabled><%=umb.getMainLine() %></textarea>
								</td>
							</tr>
							<tr>
								<td> 　</td>

								<td align="left"><b>添付ファイル：</b>
								shincyoku.xlsx
								</td>

							</tr>

						</table>
						<!-- メールの一覧表示領域 　-->
					</div>
					<!-- メールの領域終了  -->
					<!-- /********************************************************************* -->
				</div>
				<!-- コンテンツ終了 -->
			</div>

			<!-- フッター -->
			<div id="footer">
				<div id="wrap_footer">
					<!-- フッターはここに書く　 -->

				</div>
			</div>
		</div>

	</body>
</html>
