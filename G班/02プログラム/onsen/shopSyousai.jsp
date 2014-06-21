<%@page import="jp.ac.fjb.onsen.bean.UserBean"%>
<%@page import="jp.ac.fjb.onsen.bean.SyouhinBean"%>
<%@page import="java.util.ArrayList"%>
<%
	UserBean loginUser = (UserBean)session.getAttribute("LOGIN_USER");
	SyouhinBean sBean = (SyouhinBean)session.getAttribute("SELECT_ITEM");
	String url = "";
%>

<!DOCTYPE html>
<html lang="ja">
<head>
<meta charset="utf-8">

<title>温ラインショップ - <%= sBean.getSyouhinName() %></title>

<!-- StyleSheet -->
<link rel="stylesheet" href="./css/common.css">
<link rel="stylesheet" href="./css/item.css">

<!-- JavaScript -->
<script src="js/sMenu.js"></script>

</head>
<body>
<div id="top">

 <div id="headWrap">
  <div id="header">
   <h1><a href="OnsenTop.jsp"><img src="images/rogo2.png" alt="" /></a></h1>
    <div id="gnavi">
     <ul>
      <% if(loginUser == null) { %>
       <% url = "LoginServlet"; %>
       <li><font size="4">ようこそ!!</font></li>
       <li><font size="4"><a href="<%= url %>">ログイン</a></font></li>
      <% } else { %>
       <% url = "MypageServlet"; %>
       <li><font size="4">ようこそ!! <%=session.getAttribute("LOGIN_USERsei") %>さん</font></li>
       <li><font size="4"><a href="LoginServlet">ログアウト</a></font></li>
      <% } %>
     </ul>
    </div><!-- /#gnavi -->
  </div><!-- /#header -->
 </div><!-- /#headWrap -->

 <div id="menu">
  <ul>
   <li class="home"><a href="OnsenTop.jsp">ホーム</a></li>
   <li><a href="STopServlet">ショップ</a></li>
   <li><a href="<%= url %>">マイページ</a></li>
   <li><a href="Game.jsp">ゲーム</a></li>
  </ul>
 </div><!-- /#menu -->

 <div id="contents">
  <div id="main">
   <img src="<%= sBean.getImagepass() %>" alt="商品画像" width="250"height="250" align="left">
   <h2><%= sBean.getSyouhinName() %></h2>
   <h3>商品説明</h3><br>
   <p class="syousai"><%= sBean.getSyouhinzyouhou() %></p>
   <p class="tanka">
    単価 : <b><%= sBean.getTanka() %></b>円
    <select name="suryo">
     <% for(int i=1; i<=100; i++) { %>
      <option value=<%= i %>><%= i %></option>
     <% } %>
    </select>
    個<br>
    <input type="button" value="カートに入れる">
   </p>
  </div><!-- /#main -->


  <div id="sub">
   <div class="section">

   <form action="SSearchServlet" id="searchmenu">

    <h2>名前で検索</h2>
    <ul>
     <li>
      <input type="text" size="26" name="searchKey" value="">
      <input type="button" value="検索" style="width: 190px" id="searchButton">
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

    <div><input type="button" value="検索" style="width:190px" id="searchButton2"></div>

   </form>

   </div><!-- /.section -->
  </div><!-- /#sub -->
 </div><!-- /#contents -->

 <div id="pageTop">
  <a href="#top">ページのトップへ戻る</a>
 </div><!-- /#pageTop -->

 <div id="footer">
  <div class="copyright">Copyright &copy; 2011 YOUR SITE NAME All Rights Reserved.</div>
 </div><!-- /#footer -->

</div><!-- /#top -->

</body>
</html>
