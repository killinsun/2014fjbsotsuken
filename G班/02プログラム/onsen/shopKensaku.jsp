<%@page import="jp.ac.fjb.onsen.bean.UserBean"%>
<%@page import="java.util.ArrayList"%>
<%@page import="jp.ac.fjb.onsen.bean.SyouhinBean"%>

<%
	UserBean loginUser = (UserBean)session.getAttribute("LOGIN_USER");
	String searchKey = "";
	if(session.getAttribute("SEARCHKEY") != null) {
	 searchKey = (String)session.getAttribute("SEARCHKEY");
	}
	ArrayList<SyouhinBean> slist = (ArrayList)session.getAttribute("ITEM");
	String noneItem = (String)session.getAttribute("NONE_ITEM");
	String url = "";
%>

<!DOCTYPE html>
<html lang="ja">
<head>
<meta charset="utf-8">

<title>温ラインショップ - 検索結果</title>

<!-- StyleSheet -->
<link rel="stylesheet" href="./css/common.css">
<link rel="stylesheet" href="./css/kensaku.css">

<!-- JavaScript -->
<script src="js/sMenu.js"></script>
<script src="js/sSearch.js"></script>
<script src="js/sSort.js"></script>


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
   <h2>検索結果</h2>
    <div class="kenta">
     <dl>
      <dd class="kenta2">
       <form action="SSortServlet" id="sort">
       <table class="sort_02">
        <tr>
         <td>
          [並び順を変更]<a href="javascript:void(0);" onclick="sort(0)">おすすめ順</a>・<a href="javascript:void(0);" onclick="sort(1)">価格順</a>・<a href="javascript:void(0);" onclick="sort(2)">新着順</a>
         </td>
        </tr>
       </table>
       <input type="hidden" id="sortID" name="sortID" value="">
       </form>

       <div class="pagenavi">
        <table><tr><td>
           <% if(noneItem != "") { %>
            <%= noneItem %>
           <% } else { %>
            検索結果:<%= slist.size() %>件
            <% if(slist.size() > 9) { %>
             中 1～9 件目を表示
            <% } %>
           <% } %>
        </td></tr></table>
       </div><!-- /pagenavi -->

       <form id="selectForm" action="SSyousaiServlet">
       <% if(noneItem == "") { %>
        <% for(int i=0; i<slist.size(); i++) { %>
         <div class="product_list">
          <div class="product_item" align="center">
           <a href="javascript:void(0);" onclick="detail('<%= slist.get(i).getSyouhinID() %>')"><img src="<%= slist.get(i).getImagepass() %>" width="160px" height="120px"></a>
           <div class="name"><a href="javascript:void(0);" onclick="detail('<%= slist.get(i).getSyouhinID() %>')"><%= slist.get(i).getSyouhinName() %></a></div>
           <div class="price"><p class="price_search"><%= slist.get(i).getTanka()%>円</p></div>
           <div class="expl"><span style="color:#999999"><%= slist.get(i).getSyouhinzyouhou() %></span></div>
          </div><!-- /.product_item -->
         </div><!-- /.product_list -->
        <% } %>
       <% } %>
       <input type="hidden" id="syouhinID" name="syouhinID" value="">
       </form>

       <br style="clear:both;">

       <div class="pagenavi">
        <table><tr><td><% if(noneItem == "") { %>検索結果:<%= slist.size() %>件<% } %></td></tr></table>
       </div><!-- /pagenavi -->

      </dd><!--/kenta2 -->
     </dl>
    </div><!--/kenta -->
  </div><!-- /main -->


  <div id="sub">
   <div class="section">

   <form action="SSearchServlet" id="searchmenu" method="get">

    <h2>名前で検索</h2>
    <ul>
     <li>
      <input type="text" size="26" name="searchKey" value="<%= searchKey %>">
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
     <li><input type="text" name="min" value="" placeholder="最低額を入力してください">円<br>
     ~<input type="text" name="max" value="" placeholder="最高額を入力してください" >円</li>
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