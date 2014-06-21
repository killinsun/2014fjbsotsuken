<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html; charaset=UTF-8" pageEncoding="UTF-8"%>
<%@page import="jp.ac.fjb.onsen.bean.OnsenBean"%>
<%@page import="jp.ac.fjb.onsen.bean.UserBean"%>

<%
	UserBean loginUser = (UserBean) session.getAttribute("LOGIN_USER");
	if (loginUser==null) {
		loginUser = new UserBean();
		loginUser.setUserID("on00000");
	}
	ArrayList<OnsenBean> OSearchlist = (ArrayList)session.getAttribute("ONSEN");
	String noneOnsen = (String)session.getAttribute("NONE_ONSEN");
%>


<html xmlns="http://www.w3.org/1999/xhtml" xml:lang="ja" lang="ja">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta http-equiv="Content-Style-Type" content="text/css" />
<meta http-equiv="Content-Script-Type" content="text/javascript" />
<meta http-equiv="imagetoolbar" content="no" />
<meta name="description" content="" />
<meta name="keywords" content="" />
<link rel="stylesheet" href="css/common.css" type="text/css" />
<script type="text/javascript" src="js/jquery.js"></script>
<script type="text/javascript" src="js/common.js"></script>
<title>検索結果</title>
</head>
<body>
<div id="top">
   <div id="headWrap">
      <div id="header">
         <h1><a href="index.html"><img src="images/rogo2.png" alt="" /></a></h1>
         <div id="pr">
            <p>温泉を紹介します</p>
         </div>
         <div id="gnavi">
            <ul>
				<%
					if (loginUser.getUserID().equals("on00000")) {
				%>
				<li><font size="4">ようこそ!! </font>
				</li>
				<li><font size="4" color='green'><a
						href="LoginServlet">ログイン</a> </font></li>
				<%
					} else {
				%>
				<li><font size="4">ようこそ!! <%=loginUser.getSei()%>さん</font>
				</li>
				<li><font size="4" color='green'><a
						href="LoginServlet">ログアウト</a>
				</font>
				</li>
				<%
					}
				%>
            </ul>
         </div>
      </div><!-- /#header -->
   </div><!-- /#headWrap -->
   <div id="menu">
      <ul>
			<li class="home"><a href="HomeServlet"  id="home">ホーム</a></li>
			<li><a href="ShopTopServlet" id="shop">ショップ</a></li>
			<%
				if (loginUser.getUserID().equals("on00000")) {
			%>
			<li><a href="LoginServlet" id="mypage">マイページ</a></li>
			<%
				} else {
			%>
			<li><a href="MypageServlet" id="mypage">マイページ</a></li>
			<%
				}
			%>
			<li><a href="#Top" id="game">ゲーム</a></li>
      </ul>
   </div><!-- /#menu -->
   <div id="contents">
      <div id="topicPath">
         <a href="index.html">HOME</a> &gt; 検索結果
      </div><!-- /#topicPath -->

  <div id="sub">
   <div class="section">

   <form action="OsServlet" id="searchmenu">
    <h2>名前で検索</h2>
    <ul>
     <li>
      <input type="text" size="26" name="searchKey" value="">
      <input type="submit" value="検索"style="width: 190px" id="searchButton">
     </li>
    </ul>

    <h2>検索条件追加・変更</h2>
    <ul>
     <li>・地域</li>
     <li>
      　<input type="checkbox" value="01" name="area">北海道<br>
      　<input type="checkbox" value="02" name="area">東北<br>
      　<input type="checkbox" value="03" name="area">関東<br>
      　<input type="checkbox" value="04" name="area">北陸・信越<br>
      　<input type="checkbox" value="05" name="area">東海<br>
      　<input type="checkbox" value="06" name="area">近畿<br>
      　<input type="checkbox" value="07" name="area">中国<br>
      　<input type="checkbox" value="08" name="area">四国<br>
      　<input type="checkbox" value="09" name="area">九州<br>
      　<input type="checkbox" value="10" name="area">沖縄
     </li>
    </ul>

    <ul>
     <li>・予算</li>
     <li><input type="text" name="min" placeholder="最低額を入力してください">円<br>
     ~<input type="text" name="max" placeholder="最高額を入力してください">円</li>
    </ul>

    <ul>
     <li>・プラン</li>
     <li>
         　<input type="checkbox" name="stay" value=1>宿泊<br>
         　<input type="checkbox" name="day" value=1>日帰り
     </li>
    </ul>

    <div><input type="submit" value="検索" style="width:190px" id="searchButton2"></div>

   </form>

   </div><!-- /.section -->
  </div><!-- /#sub -->


      <% if(noneOnsen == "") { %>
	  <% for(int i=0; i<OSearchlist.size(); i++) { %>
	<div id="serchResult">
		<table border="1" id="resultTable">
			<tr>
				<td colspan="2" id ="resultTitle" ><a href=<%=request.getContextPath()%>/OSyousaiServlet?OnsenID=<%= OSearchlist.get(i).getOnsenID() %>></a><h2>
				<%= OSearchlist.get(i).getOnsenName() %></h2></td>
			</tr>
			<tr>
				<td id ="resultImage"><a href=<%=request.getContextPath()%>/OSyousaiServlet?OnsenID=<%= OSearchlist.get(i).getOnsenID() %>>
				<input type=image src=<%= OSearchlist.get(i).getImagepass() %> width="125px" height="125px"></a></td>
				<td><%=OSearchlist.get(i).getOnsenzyouhou() %></td>
			</tr>
		</table>
	</div>
	<% } %>
	<% } %>
	<% if(OSearchlist.size()>5){ %>
	 <form  action="/onsen/onsenKensaku.jsp">
	 <div align="right">
         <input type="submit" value="次へ" style="height: 30px; width: 80px;">
      </div>
      </form>
      <%} %>
      <div id="pageTop">
         <a href="#top">ページのトップへ戻る</a>
      </div><!-- /#pageTop -->
   </div><!-- /#contents -->
   <div id="footer">
      <div id="footMenu">
         <ul>
            <li><a href="#top">会社概要</a></li>
            <li><a href="index.html">採用情報</a></li>
            <li><a href="index.html">お問い合わせ</a></li>
            <li><a href="index.html">プライバシーポリシー</a></li>
         </ul>
      </div><!-- /#footerMenu -->
      <div class="copyright">Copyright &copy; 2011 YOUR SITE NAME All Rights Reserved.</div>
   </div><!-- /#footer -->
</div><!-- /#top -->
</body>
</html>