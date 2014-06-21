<%@page import="jp.ac.fjb.onsen.bean.SyouhinBean"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.Random"%>
<%@page import="jp.ac.fjb.onsen.bean.UserBean"%>
<%
	UserBean loginUser = (UserBean)session.getAttribute("LOGIN_USER");
	ArrayList<SyouhinBean> olist = (ArrayList<SyouhinBean>)session.getAttribute("OSUSUME_ITEM");
	ArrayList<SyouhinBean> hlist = (ArrayList<SyouhinBean>)session.getAttribute("HISTORY_ITEM");
	String count = (String)session.getAttribute("COUNT");
	String url = "";

	if(olist == null && count != null) {
		System.out.println("サーブレット呼び出し");
		session.setAttribute("COUNT", "1");
		RequestDispatcher dp = request.getRequestDispatcher("STopServlet");
		dp.forward(request,response);
	}
%>

<!DOCTYPE html>
<html lang="ja">
<head>
<meta charset="utf-8">

<title>温ラインショップ</title>

<!-- StyleSheet -->
<link rel="stylesheet" href="./css/onlineshop.css">

<!-- JavaScript -->
<script src="js/sMenu.js"></script>
<script src="js/sTop.js"></script>

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

 <div id="guzzu"><img src="images/oke2.jpg" alt="温泉グッズ" width="787"height="300"></div>

 <div id="contents">
  <div id="main">
   <h2>新着情報！</h2>
   <h3>今月のおススメ</h3>

   <form action="SSyousaiServlet" id="selectItem">
   <% if(olist != null) { %>
    <table>
     <tr>
      <td><a href="javascript:void(0);" onclick="detail('<%= olist.get(0).getSyouhinID() %>')"><img src="<%= olist.get(0).getImagepass() %>" alt=""width="160"height="130" /></a></td>
      <td><a href="javascript:void(0);" onclick="detail('<%= olist.get(1).getSyouhinID() %>')"><img src="<%= olist.get(1).getImagepass() %>" alt=""width="160"height="130" /></a></td>
      <td><a href="javascript:void(0);" onclick="detail('<%= olist.get(2).getSyouhinID() %>')"><img src="<%= olist.get(2).getImagepass() %>" alt=""width="160"height="130" /></a></td>
     </tr>
     <tr>
      <td><a href="javascript:void(0);" onclick="detail('<%= olist.get(0).getSyouhinID() %>')"><%= olist.get(0).getSyouhinName() %></a></td>
      <td><a href="javascript:void(0);" onclick="detail('<%= olist.get(1).getSyouhinID() %>')"><%= olist.get(1).getSyouhinName() %></a></td>
      <td><a href="javascript:void(0);" onclick="detail('<%= olist.get(2).getSyouhinID() %>')"><%= olist.get(2).getSyouhinName() %></a></td>
     </tr>
     <tr>
      <td><%= olist.get(0).getTanka() %>円 </td>
      <td><%= olist.get(1).getTanka() %>円 </td>
      <td><%= olist.get(2).getTanka() %>円 </td>
     </tr>
    </table>
   <% } else { %>
    <table>
     <tr>
      <td><img src="images/noImage.jpg" width="160" height="130"></td>
      <td><img src="images/noImage.jpg" width="160" height="130"></td>
      <td><img src="images/noImage.jpg" width="160" height="130"></td>
     </tr>
     <tr>
      <td>商品名</td>
      <td>商品名</td>
      <td>商品名</td>
     </tr>
     <tr>
      <td>円</td>
      <td>円</td>
      <td>円</td>
     </tr>
    </table>
   <% } %>


   <h2>買い物履歴</h2>
   <% if(loginUser != null) { %>
    <table>
     <tr>
      <td><a href="javascript:void(0);" onclick="detail('<%= hlist.get(0).getSyouhinID() %>')"><img src="<%= hlist.get(0).getImagepass() %>" alt=""width="160"height="130" /></a></td>
      <td><a href="javascript:void(0);" onclick="detail('<%= hlist.get(1).getSyouhinID() %>')"><img src="<%= hlist.get(1).getImagepass() %>" alt=""width="160"height="130" /></a></td>
      <td><a href="javascript:void(0);" onclick="detail('<%= hlist.get(2).getSyouhinID() %>')"><img src="<%= hlist.get(2).getImagepass() %>" alt=""width="160"height="130" /></a></td>
     </tr>
     <tr>
      <td id="item4"><a href="javascript:void(0);" onclick="detail('<%= hlist.get(0).getSyouhinID() %>')"><%= hlist.get(0).getSyouhinName() %></a></td>
      <td id="item5"><a href="javascript:void(0);" onclick="detail('<%= hlist.get(1).getSyouhinID() %>')"><%= hlist.get(1).getSyouhinName() %></a></td>
      <td id="item6"><a href="javascript:void(0);" onclick="detail('<%= hlist.get(2).getSyouhinID() %>')"><%= hlist.get(2).getSyouhinName() %></a></td>
     </tr>
     <tr>
      <td id="item4"><%= hlist.get(0).getTanka() %>円 </td>
      <td id="item5"><%= hlist.get(1).getTanka() %>円 </td>
      <td id="item6"><%= hlist.get(2).getTanka() %>円 </td>
     </tr>
    </table>
   <% } else { %>
    <h3>買い物履歴を表示するには<a href="LoginServlet">ログイン</a>してください</h3>
   <% } %>
   <input type="hidden" name="syouhinID" id="syouhinID" value="">
   </form>


   <h2>INFORMATION</h2>
    <dl class="information">
     <dt><span>2009-04-28</span></dt>
      <dd>
       <div>○○新聞に取材を受けました。<br></div>
      </dd>
     <dt><span>2009-04-24</span></dt>
      <dd>
       <div>休業のお知らせ。誠に勝手ながら5月2日から6日まで長期休暇日とさせていただきます。ご了承ください。</div>
      </dd>
    </dl><!--/#information -->
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

    <div id="button"><input type="button" value="検索" style="width:190px" id="searchButton2"></div>

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