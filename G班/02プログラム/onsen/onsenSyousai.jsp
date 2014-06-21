<%@page contentType="text/html; charaset=UTF-8" pageEncoding="UTF-8"%>
<%@page import="jp.ac.fjb.onsen.bean.UserBean"%>
<%@page import="jp.ac.fjb.onsen.bean.OnsenBean"%>
<%@page import="jp.ac.fjb.onsen.bean.SyouhinBean"%>
<%@page import="jp.ac.fjb.onsen.model.HomeModel"%>

<%
	UserBean loginUser = (UserBean) session.getAttribute("LOGIN_USER");
	if (loginUser==null) {
		loginUser = new UserBean();
		loginUser.setUserID("on00000");
	}
    OnsenBean syousai = (OnsenBean)session.getAttribute("ONSEN");
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
							<li><font size="4">ようこそ!! <%=session.getAttribute("LOGIN_USERsei")%>さん</font>
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
         <li class="home"><a href="OnsenTop.jsp">ホーム</a></li>
         <li><a href="<%=request.getContextPath()%>/ShopTopServlet" id="shop">ショップ</a></li>
         <li><a href="index.html">マイページ</a></li>
         <li><a href="index.html">ゲーム</a></li>
      </ul>
   </div><!-- /#menu -->
   <div id="contents">
      <div id="topicPath">
         <a href="index.html">HOME</a> &gt; 検索結果
      </div><!-- /#topicPath -->

      <div id="sub">
         <div class="section">
					<h2>ショップ</h2>
            <ul>
               <li><a href="index.html">入浴剤</a>
               </li>
               <li><a href="index.html">桶</a>
               </li>
            </ul>
      <div class="section">
	    <h2>名前で検索</h2>
	    <ul>
		<li><input type="text" size="26"><input type="button" value="検索"style="width: 190px">
	        </li>
	    </ul>
				</div>
            <h2>検索条件追加・変更</h2>
            <ul>
               <li>・地域</li>
               <li>　<input type="checkbox">北海道<br>
               　<input type="checkbox">東北<br>
               　<input type="checkbox">関東<br>
               　<input type="checkbox">北陸・信越<br>
               　<input type="checkbox">東海<br>
               　<input type="checkbox">近畿<br>
               　<input type="checkbox">中国<br>
               　<input type="checkbox">四国<br>
               　<input type="checkbox">九州<br>
               　<input type="checkbox">沖縄
                </li>
            </ul>
            <ul>
               <li>・予算</li>
               <li>　<input type="text" placeholder="最低額を入力してください">円<br>　～<input type="text" style="width:150px;" placeholder="最高額を入力してください">円</li>
            </ul>
            <ul>
               <li>・プラン</li>
               <li>　<input type="checkbox">宿泊<br>
                     　<input type="checkbox">日帰り
            </ul>
            <ul>
            	<input type="button" value="検索" style="width:190px">
            </ul>
         </div><!-- /.section -->
  </div><!-- /#sub -->

<div id = "SyousaiTitle">
<center><span style="background-image:url(images/Otitle.jpg);  letter-spacing:10px;">
<font size="7"><%=syousai.getOnsenName() %></font></span></center>
</div>

      <div id="ResultSyousai">

        <h2 style="background-color:#33FF00"><td id="SyousaiTitle"><td><p align="center"></p></td></h2>
        <center><input type=image src=<%= syousai.getImagepass() %> width="500px" height="250px"></center>
            <table>
				<td id ="SyousaiZyouhou">
				<td><%=syousai.getOnsensyousaizyouhou() %></td>
			</table>
<br>
<br>
<form action="OyoyakuSevlet" id=Yoyakuk>
	<a href="<%=request.getContextPath()%>/OYoyakuServlet"><div style="text-align:center;"><img src="images/yoyaku.gif" /></div></a>
</form>

					<table>
							<td><div style="text-align:center;"><img src="images/hakone.jpg" width="130px" alt="" /></td></div><br>
							<td><div style="text-align:center;"><img src="images/yuhu.jpg" width="130px" alt="" /></td></div>
							<td><div style="text-align:center;"><img src="images/kusatsu.jpg" width="130px" height="87px" alt="" /></div></td>
							<td><div style="text-align:center;"><img src="images/image05.jpg" width="130px" height="87px" alt="" /></div></td>
					</table>

      <div id="pageTop">
         <a href="#top">ページのトップへ戻る</a>
      </div><!-- /#pageTop -->
   </div><!-- /#contents -->
   <div id="footer">

      <div class="copyright">Copyright &copy; 2011 YOUR SITE NAME All Rights Reserved.</div>
   </div><!-- /#footer -->
</div><!-- /#top -->
</body>
</html>
