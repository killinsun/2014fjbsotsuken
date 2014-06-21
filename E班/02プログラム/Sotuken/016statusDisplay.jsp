<%@page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ page import="jp.ac.fjb.Sotuken.bean.LoginBean"%>

<%
	LoginBean lb = (LoginBean) session.getAttribute("LOGIN_USER");
%>

<!DOCTYPE html>
<!--016状態表示画面-->
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
		<link rel="stylesheet" href="stylesheet/016statusDisplay.css" type="text/css"/>
		<script>
		    function loc() {
        		window.location = "MailServlet";
    		}

			function timer(){
				setTimeout("loc()",5000);
			}

			var txt = 0;
			function countDownTxt() {
				var number = [5,4,3,2,1,0];
				number[txt];
				txt++;
			}

			function countDown(){
				setInterval("countDownTxt()",1000);
			}
		</script>

		<title>016状態表示画面</title>
	</head>

	<body onload="timer()">
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
						<a href="004myPage.jsp">
						<div id="tweetPost" class="headerList">
							<img class="icoSize" src="img/tweet.png">
						</div> </a>
						<!-- 友達検索 -->
						<a href="018UserSearch.jsp">
						<div id="userSearch" class="headerList">
							<img class="icoSize" src="img/memberSearch.png">
						</div> </a>
						<!-- ホーム -->
						<a href="004myPage.jsp">
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
					<div class="navList">
						赤木　貴宣
					</div>
					<img id="navUserIco" class="ico" src="img/default.png" />
				</div> </a>
				<!-- /********** nav要素のユーザ領域 *********** -->

				<!-- ********** nav要素のニュース領域 *********** -->
				<a href="">
				<div id="newFeed">
					<div class="navList">
						ニュース
					</div>
					<img class="ico" src="img/newsPaper.png" />

				</div> </a>
				<!-- /********** nav要素のニュース領域 *********** -->

				<!-- ********** nav要素の画像領域 *********** -->
				<a href="017UpLoad.jsp">
				<div id="album">
					<div class="navList">
						アルバム
					</div>
					<img class="ico" src="img/album.png" />

				</div> </a>
				<!-- /********** nav要素のニュース領域 *********** -->

				<!-- ********** nav要素のメール領域 *********** -->
				<a href="010mail.jsp">
				<div id="mail">
					<div class="navList">
						メール
					</div>
					<img class="ico" src="img/mail.png" />

				</div> </a>
				<!-- /********** nav要素のメール領域 *********** -->

				<!-- ********** nav要素のチャット領域 *********** -->
				<a href="008groupSelect.jsp">
				<div id="chat">
					<div class="navList">
						チャット
					</div>
					<img class="ico" src="img/chat.png" />

				</div> </a>
				<!-- /********** nav要素のチャット領域 *********** -->

				<!-- ********** nav要素の設定領域 *********** -->
				<a href="006personalInformationChange.jsp">
				<div id="setting">
					<div class="navList">
						設定
					</div>
					<img class="ico" src="img/setting.png" />

				</div> </a>
				<!-- /********** nav要素の設定領域 *********** -->

			</div>
		</div>
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
					<div id="centerPosition">
						<div id="result">

							<h3>送信が完了しました。</h3><br />
							<h4 id="position">

								<!--<script>document.write(number[txt]);</script>-->
								5秒後、自動的にページを移動します。
							</h4>
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
