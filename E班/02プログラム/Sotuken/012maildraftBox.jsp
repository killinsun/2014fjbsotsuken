<%@page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@page import="java.util.ArrayList" %>
<%@page import="jp.ac.fjb.Sotuken.bean.UserMailBean" %>
<%@ page import="jp.ac.fjb.Sotuken.bean.LoginBean"%>

<%
	ArrayList<UserMailBean> list = (ArrayList) session.getAttribute("MAIL_LIST");
	LoginBean lb = (LoginBean) session.getAttribute("LOGIN_USER");
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
		<link rel="stylesheet" href="stylesheet/012maildraftBox.css" type="text/css"/>
		<script src="js/jquery.min.js"></script>
		<!--<script src="js/javascript.js"></script>-->
		<script src="js/mail.js"></script>
		<title>012未送信一覧画面</title>
	</head>

<body>
<form id="form">

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
								<button id="button1" class="frame button" type="button" value="aaa" onclick="mailsakusei()">
									メッセージ作成
								</button></td>
								<td id="delete">
								<button id="deletemoveButton"  name="deletemoveButton" type="button"
									value="03" onclick="deletemoveClick3()">
									削除
								</button></td>
							</tr>
						</table>

						<!-- 受信箱、下書き、送信箱、ゴミ箱の領域  -->
						<table id="mailtable1">
							<tr onclick="mail()">
								<td class="box"> 受信箱 </td>
							</tr>
							<tr onclick="maildraftBox()">
								<td class="box" id="backcolor"> 下書き </td>
							</tr>
							<tr onclick="mailoutBox()">
								<td class="box"> 送信箱 </td>
							</tr>
							<tr onclick="mailtrashBox()">
								<td class="box"> ゴミ箱 </td>
							</tr>
							<tr>
								<td class="space"></td>
							</tr>
						</table>

						<!-- メールの一覧表示領域 　-->
						<table id="mailtable2">
							<!-- 差出人、件名、送信日時 -->
							<tr id="itemName">
								<td class="checkbox partition">
								<input class="check" type="checkbox" value="3">
								</td>
								<td class="clip partition"><img class="clipImg" src="img/clear.png" /></td>
								<td class="partition"> 差出人 </td>
								<td class="partition"> 件名 </td>
								<td> 送信日時 </td>
							</tr>
							<!-- 差出人、件名、送信日時終了 -->
								<% for(int i=0; i<list.size(); i++){
								 UserMailBean UserMail = list.get(i);
								 %>
							<tr class="line">
								 <td>
								 <input type="checkBox" name="mail" value="<%=UserMail.getMailId()%>">
								 </td>
								 <td class="clip">
								 <% if (!"".equals(UserMail.getAttach())) { %>
								 <img class="clipImg" src="img/clip.png" />
								 <% } %>
								 </td>
								 <td onclick="mailkakunin()"><%=UserMail.getUserName()%></td>
								 <td onclick="mailkakunin()"><%=UserMail.getSubjectLine()%></td>
								 <td onclick="mailkakunin()"><%=UserMail.getReceiptTime()%></td>
								 </tr>
									<%
									}
									%>
						</table>
						<!-- メールの一覧表示領域 　-->
					</div>
					<!-- メールの領域終了  -->
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
				<input type="hidden" id="progId" name="progId">
</form>
	</body>
</html>

