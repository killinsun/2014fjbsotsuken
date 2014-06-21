<%@page import="java.beans.beancontext.BeanContext"%>
<%@ page contentType="text/html; charset=UTF-8"%>
<%@ page pageEncoding="UTF-8"%>
<%@ page import="java.util.ArrayList"%>
<%@ page import="jp.ac.fjb.Sotuken.bean.MyPageFormBean"%>
<%@ page import="jp.ac.fjb.Sotuken.bean.TweetPostBean"%>
<%@ page import="jp.ac.fjb.Sotuken.bean.LoginBean"%>

<%
	ArrayList<MyPageFormBean> mpfb = (ArrayList) session.getAttribute("TWEET_LIST");

	LoginBean lb = (LoginBean) session.getAttribute("LOGIN_USER");
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="keywords" content="">
<meta name="description" content="">
<link rel="stylesheet" href="stylesheet/template/styleSheet.css"
	type="text/css" />
<link rel="stylesheet" href="stylesheet/template/header.css"
	type="text/css" />
<link rel="stylesheet" href="stylesheet/template/headerContent.css"
	type="text/css" />
<link rel="stylesheet" href="stylesheet/template/footer.css"
	type="text/css" />
<link rel="stylesheet" href="stylesheet/template/form.css"
	type="text/css" />
<link rel="stylesheet" href="stylesheet/template/nav.css"
	type="text/css" />
<link rel="stylesheet" href="stylesheet/004myPage.css" type="text/css" />
<script src="js/myPage.js"></script>
<!-- <script src="js/file.js"></script>-->
<script src="js/jquery.min.js"></script>
<script>
	$(document).ready(function() {
		$('#photoIco').bind("click touchend", function() {
			$('#selectImage').click();
		});
	});

</script>
<script>
	var cnt = 0;
	var btnName = "☆Good!";
	window.onload = function() {
		setBtnValue(cnt);
	}

	function setBtnValue(cnt) {
		var btn = document.getElementById("firstFavorite");
		if(<%= lb.getUserId() %> != 0000041 ){
			btn.value = btnName + cnt;
		} else {
			btn.value = btnName + 0;
		}
	}


	/*
	window.onload = function(){
		//ボタンを取得
		var targetBtn = documten.getEleentById("firstFavorite");
		//targetBtnをクリックしたとき
		targetBtn.onclick = function(){
			num++;
			targetBtn.value = name + num;
		}

		//初期設定
		targetBtn.value = name+num;
	}*/
</script>

<script>
	function show_html() {
		if(<%= lb.getUserId() %> != 0000041 ){

			if (document.getElementById) {
				document.getElementById("goodUserName").innerHTML = '<%= lb.getName() %>';
			}
		}
	}
</script>



<title>004マイページ画面</title>
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
					<div id="various" class="headerList" >
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
			<a href="MyPageServlet">
				<div id="newFeed">
					<div class="navList">ニュース</div>
					<img class="ico" src="img/newsPaper.png" />

				</div> </a>
			<!-- /********** nav要素のニュース領域 *********** -->

			<!-- ********** nav要素の画像領域 *********** -->
			<a href="MyPageServlet">
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

				<!-- つぶやく領域 -->

				<form action="/Sotuken/MyPageServlet" id="postTweet" method="post" name="postTweet">
					<input type="hidden" id="userId" name="userId" value="<%=lb.getUserId() %>">
					<% System.out.println(lb.getUserId()); %>
					<div id="tweetarea">
						<!-- つぶやきを投稿するときのツール置き場1 -->
						<div id="topTweetTools" class="tweetTools">
							<div class="spaceBox"></div>
							<div id="addImage">
								<input type="file" name="tweetImg" id="selectImage" />

								<img id="photoIco" src="img/photoIco.png" />

							</div>

						</div>
						<!-- つぶやきを投稿するときのツール置き場2終了 -->
						<!-- つぶやく領域　 -->

						<textarea id="tweet" placeholder="つぶやく内容を記入" name="tweetContent"></textarea>
						<!-- つぶやきを投稿するときのツール置き場2 -->
						<div id="btmTweetTools" class="tweetTools">
							<div id="submitBox">

								<input type="submit" id="submit" value="投稿" class="button" />

							</div>
							<div class="spaceBox"></div>
						</div>
						<!-- つぶやきを投稿するときのツール置き場2 終了 -->
					</div>

				</form>
				<form action="/Sotuken/MyPageServlet" id="textareaDataForm"
					name="textateaDataForm" >
					<input type="hidden" id="textareaData" name="textareaData">
				</form>
				<!-- /つぶやく領域 -->
				<!-- ここは、タイムラインに表示される領域 -->
				<div class="outWrapTimeLineBox">
					<div class="wrapTimeLineBox" id="wrapTimeLineBoxTop">


						<!-- **************************先頭のつぶやきの領域************************** -->
						<div class="timeLineBox">
							<div class="nameArea">
								<%
									//先頭のつぶやきを取得するために、リストのなかの0番目を表示
									MyPageFormBean myPage = mpfb.get(0);
								%>
								<%=myPage.getUserName()%>
							</div>
							<div class="contents">
								<%=myPage.getTweet()%><br />
								<div class="timeAndPost">
									<div class="postName">
										部署名:<%=myPage.getPostName()%>
									</div>
									<div class="time">
										<%=myPage.getSendTime()%>
									</div>
								</div>
							</div>

							<div class="shareArea">
								<input type="button" class="favorite" id="firstFavorite" onclick="setBtnValue(++cnt);disabled = true;show_html();">
								<!--  <img class="favorite" id="firstFavorite" src="img/good.png"  onclick="favorite()"> -->
								<img class="comment" src="img/comment.png">
							</div>
						</div>
						<div class="goodCountArea">
							<div class="goodCount"><span id="goodUserName" ></span></div>
						</div>
						<div class="commentArea">
							<div class="commentContent">
								<div class="commentUserName"></div>
								<div class="commentText">
								<br />
								</div>
							</div>
							<!-- コメントしたユーザのアイコン -->
							<!-- <div class="commentIcon">
								<img class="commentUserIconSize" src="img/userIcoWhite.png" />
							</div>
							-->
						</div>
						<!-- つぶやき投稿者のユーザアイコン -->
						<div class="userImage">
							<img class="userImageSize" src="<%=myPage.getUserIco()%>">
						</div>
					</div>

					<script>
						function favorite(){
							var Id;
							//Id = obj.elements.id;
							document.getElementsByClassName("favorite");
							Id = "<%=myPage.getTweetId() %>";
							window.alert(Id);
						}
					</script>
					<!-- **************************/先頭のつぶやきの領域************************** -->
					<!-- **************************先頭以降のつぶやきの領域part1************************** -->

					<%
						myPage = mpfb.get(1);
					%>

					<div class="wrapTimeLineBox">

						<div class="timeLineBox">
							<div class="nameArea">
								<!-- ユーザID -->
								<%=myPage.getUserName()%>
							</div>
							<div class="contents">
								<%=myPage.getTweet()%><br />
								<div class="timeAndPost">
									<div class="postName">
										部署名:<%=myPage.getPostName()%>
									</div>
									<div class="time">
										<%=myPage.getSendTime()%>
									</div>
								</div>
							</div>
							<div class="shareArea">
								<input type="button" class="favorite"  value="☆Good! 1">
								<!-- <img class="favorite" src="img/good.png" onclick="favorite()" > -->

								<img class="comment" src="img/comment.png">

							</div>

						</div>
						<div class="goodCountArea">
							<div class="goodCount">赤木　貴宣</div>
						</div>
						<div class="commentArea">
							<div class="commentContent">
								<!-- <div class="commentUserName">太郎 山田</div>
								<div class="commentText">
									コメントをしてみました。よろしくお願いいたします。<br />
								</div>
								-->
							</div>
							<!-- コメントしたユーザのアイコン -->
							<!--
							<div class="commentIcon">
								<img class="commentUserIconSize" src="img/userIcoWhite.png" />
							</div>
							-->
						</div>
						<div class="userImage">
							<img class="userImageSize" src="<%=myPage.getUserIco()%>">
						</div>
					</div>

					<!-- **************************/先頭以降のつぶやきの領域part1************************** -->

					<!-- **************************先頭以降のつぶやきの領域part2************************** -->

					<%
						for (int i = 2; i < mpfb.size(); i++) {

							myPage = mpfb.get(i);

					%>

					<div class="wrapTimeLineBox">

						<div class="timeLineBox">
							<div class="nameArea">
								<!-- ユーザID -->
								<%=myPage.getUserName()%>
							</div>
							<div class="contents">
								<%=myPage.getTweet()%><br />
								<div class="timeAndPost">
									<div class="postName">
										部署名:<%=myPage.getPostName()%>
									</div>
									<div class="time">
										<%=myPage.getSendTime()%>
									</div>
								</div>
							</div>
							<div class="shareArea">
								<input type="button" class="favorite"  value="☆Good! 0">
								<!-- <img class="favorite" src="img/good.png" onclick="favorite()" <%= myPage.getTweetId() %> <%= myPage.getUserId() %>>  -->

								<img class="comment" src="img/comment.png">

							</div>

						</div>
						<div class="goodCountArea">
							<div class="goodCount">3件のGood!があります。</div>
						</div>
						<div class="commentArea">
							<div class="commentContent">
								<div class="commentUserName">太郎 山田</div>
								<div class="commentText">
									コメントをしてみました。よろしくお願いいたします。<br />
								</div>
							</div>
							<!-- コメントしたユーザのアイコン -->
							<div class="commentIcon">
								<img class="commentUserIconSize" src="img/userIcoWhite.png" />
							</div>
						</div>
						<div class="userImage">
							<img class="userImageSize" src="<%=myPage.getUserIco()%>">
						</div>
					</div>

					<%
						}
					%>
					<!-- **************************/先頭以降のつぶやきの領域part2************************** -->

				</div>
				<!-- /ここは、タイムラインに表示される領域 -->

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
