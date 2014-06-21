<%@page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@page import="java.util.ArrayList" %>
<%@page import="jp.ac.fjb.Sotuken.bean.groupSelectBean" %>
<%@ page import="jp.ac.fjb.Sotuken.bean.LoginBean"%>
<%

	ArrayList<groupSelectBean> list = (ArrayList)session.getAttribute("GROUP_SELECT");
	LoginBean lb = (LoginBean) session.getAttribute("LOGIN_USER");
%>

<!DOCTYPE html>
<!--007グループ選択画面-->
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
		<link rel="stylesheet" href="stylesheet/008groupSelect.css" type="text/css"/>


		<script>

			function chatOpen(id){
				window.open( "groupChatServlet?GroupID="+id , "_blank","width=600,height=600,resizable=yes");
			}

		</script>


		<title>008グループ選択画面</title>
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
			<a href="groupSelectServlet">
				<div id="newFeed">
					<div class="navList">ニュース</div>
					<img class="ico" src="img/newsPaper.png" />

				</div> </a>
			<!-- /********** nav要素のニュース領域 *********** -->

			<!-- ********** nav要素の画像領域 *********** -->
			<a href="groupSelectServlet">
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
<!-- **********************ここにグループを表示させます********************************************* -->
					<div id="message2">
						<h3>グループ選択画面</h3>
						<div id="group">
							<table>
							<!-- for文書く予定地 -->
							<%
							for(int i=0; i<list.size(); i++){
								groupSelectBean group = list.get(i);
							%>
								<tr>
									<td class="chatGroupBorder" onclick="chatOpen( '<%= group.getGroupID() %>' )"><img src="<%= group.getGrouoImg() %>" width="75" height="75" alt="ユーザアイコン" />
									<div class="groupText">
										<span class="groupTitle"> <%= group.getGroupName()  %> <!-- チャットのグループ名を表示します。 -->
											<br />
										</span>
										<%
										if(group.getMessage() == null){
										%>

										メッセージがありません

										<%
										}else{
										%>
										<%= group.getMessage() %><!-- ここには、一番最後の投稿を表示します。(一部) -->
										<%
										}
										%>
									</div></td>
								</tr>
							<%
							}
							%>
							</table>
						</div>
					</div>
				</div>
			</div>

<!-- /********************************************************************************************** -->
		</div>
		<!-- コンテンツ終了 -->

		<!-- フッター -->
		<div id="footer">
			<div id="wrap_footer">
				<!-- フッターはここに書く　 -->

			</div>
		</div>
	</body>
</html>
