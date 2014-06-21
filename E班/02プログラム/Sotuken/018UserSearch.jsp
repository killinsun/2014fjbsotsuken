<%@ page language="java" contentType="text/html; charset=UTF-8" %>
<%@ page import="jp.ac.fjb.Sotuken.bean.LoginBean"%>

<%
	LoginBean lb = (LoginBean) session.getAttribute("LOGIN_USER");
%>

<!DOCTYPE html>
<!--018ユーザ検索画面-->
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
  		<link rel="stylesheet" href="stylesheet/018UserSearch.css" type="text/css"/>

		<title>018ユーザ検索画面</title>
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
			<a href="018UserSearch.jsp">
				<div id="newFeed">
					<div class="navList">ニュース</div>
					<img class="ico" src="img/newsPaper.png" />

				</div> </a>
			<!-- /********** nav要素のニュース領域 *********** -->

			<!-- ********** nav要素の画像領域 *********** -->
			<a href="018UserSearch.jsp"">
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
					<div id="message2">
						<div id="centerPosition">
							<h2>ユーザ検索</h2>
							<table>
								<tr>
									<td>名前</td>
									<td><input type="text" size="50">
										<select>
											<option value="or">を含む</option>
											<option value="and">と一致する</option>
											<option value="not">を含まない</option>
										</select>
									</td>
								</tr>
								<tr>
									<td>ID</td>
									<td><input type="text" size="30"></td>
								</tr>
								<tr>
									<td>性別</td>
									<td>男<input type="radio" name="sex" checked>　女<input type="radio" name="sex"></td>
								</tr>
								<tr>
									<td>部署</td>
									<td><select name="example">
										<option value="サンプル">部署</option>
										<option value="サンプル">は</option>
										<option value="サンプル">まだ</option>
										<option value="サンプル">未定</option>
										<option value="サンプル">です</option>
									</select></td>
								</tr>
								<tr>
									<td>フリーワード</td>
									<td><input type="text" size="50"></td>
								</tr>
							</table>
							<div id="submitButton">
								<input type="button" value="実行">
							</div>
						</div>
					</div>
				</div>


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
	</body>
</html>
