<%@ page language="java" contentType="text/html; charset=UTF-8" %>
<%@ page import="jp.ac.fjb.Sotuken.bean.LoginBean"%>

<%
	LoginBean lb = (LoginBean) session.getAttribute("LOGIN_USER");
%>

<!DOCTYPE html>
<!--019該当者表示画面-->
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
		<link rel="stylesheet" href="stylesheet/020UserInfo.css" type="text/css"/>

		<title>020ユーザ情報画面</title>
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
			<a href="020UserInfo.jsp">
				<div id="newFeed">
					<div class="navList">ニュース</div>
					<img class="ico" src="img/newsPaper.png" />

				</div> </a>
			<!-- /********** nav要素のニュース領域 *********** -->

			<!-- ********** nav要素の画像領域 *********** -->
			<a href="020UserInfo.jsp">
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
					<div id="userInfo">
						<h2>ユーザ情報</h2>
						<div id="left">
							<div id="userIconArea">
								<img src="img/defaultBlack.png" width="120" height="120" alt="ユーザアイコン" />
							</div>
							<p>
								詳細不明
							</p>
						</div>

						<div id="right">
							<div id="user">
								<table>
									<tr>
										<td class="name">名前</td><td>名称不明</td>
									</tr>
									<tr>
										<td class="name">性別</td><td>不明</td>
									</tr>
									<tr>
										<td class="name">生年月日</td><td>不明</td>
									</tr>
									<tr>
										<td class="name">メールアドレス</td><td>○○○○○○○○</td>
									</tr>
									<tr>
										<td class="name">住所</td><td>千葉県八街市○○○○</td>
									</tr>
									<tr>
										<td class="name">部署</td><td>総務部</td>
									</tr>
									<tr>
										<td class="name">紹介</td><td>
										<p>
											とにかく前に！前に！がモットーの○大学○学部の、
											○○と申します。大学時代も前へ前への精神で、様々なことに挑戦してきました。<br />
										<p>
											特に、ハードだったのが、２ヶ月の海外インターンでインドの企業で働いた経験です。スキルもなく、
											語学もいまいちで、最初は全く貢献できませんでした。<br />
										<p>
											ただ、前へ、前への精神で、恥をかく事承知で、わからないことは同僚にどんどん質問し、
											自宅で学んだことを必ず振り返るようにしました。さらに、関連する書籍があれば、英語でしたが時間をかけて読み込んでいきました。<br />
										<p>
											結果、２週間ほどで業務内容も理解できるようになり、後半では業務改善提案を自分でもできるようになりました。この前へ前へ精神は、
											貴社が重視しているフロンティアスピリッツとも一致すると考えます。本日はよろしくお願い致します。<br />
										</td>
									</tr>
								</table>
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
