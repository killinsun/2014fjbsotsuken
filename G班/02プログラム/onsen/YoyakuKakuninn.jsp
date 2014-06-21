<%@page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@page import="java.util.*" %>
<%@page import="java.text.*" %>
<%@page import="java.util.ArrayList" %>
<%@page import="jp.ac.fjb.onsen.bean.OnsenYoyakuBean" %>
<%@page import="jp.ac.fjb.onsen.bean.UserBean" %>


<%
	UserBean loginUser = (UserBean) session.getAttribute("LOGIN_USER");
	OnsenYoyakuBean yoyaku = (OnsenYoyakuBean) session.getAttribute("OYBEAN");
	String noneOnsenYoyakuBean = (String)session.getAttribute("NONE_OYBEAN");
%>


<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml" html:lang="ja" lang="ja">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta http-equiv="Content-Style-Type" content="text/css" />
<meta http-equiv="Content-Script-Type" content="text/javascript" />
<meta http-equiv="imagetoolbar" content="no" />
<meta name="description" content="" />
<meta name="keywords" content="" />
<link rel="stylesheet" href="css/yoyaku-kakunin.css" type="text/css" />
<script type="text/javascript" src="js/jquery.js"></script>
<script type="text/javascript" src="js/common.js"></script>
<title>温ラインショップ</title>
</head>
<body>
<div id="top">
   <div id="headWrap">
      <div id="header">
         <h1><a href="index.html"><img src="images/rogo2.gif" alt="" /></a></h1>
         <div id="pr">
            <p>温泉を紹介します。</p>
         </div>
         <div id="gnavi">
            <ul>
               <li><font size="4">ようこそ!! <%=loginUser.getSei()%>さん</font></li>
               <li><font size="4" color='green'><a href="index.html">ログアウト</a></font></li>
            </ul>
         </div><!-- /#gnavi -->
      </div><!-- /#header -->
   </div><!-- /#headWrap -->
   <div id="menu">
      <ul>
         <li class="home"><a href="index.html">ホーム</a></li>
         <li><a href="index.html">ショップ</a></li>
         <li><a href="mymenu.html">マイページ</a></li>
         <li><a href="index.html">ゲーム</a></li>
      </ul>
   </div><!-- /#menu -->

    <form  action="/onsen/yoyakuKakuninServlet">
    <div id="contents">
     <div id="topicPath">
         <a href="index.html">HOME</a>　&gt;　<a href="cart.html">検索結果</a>　&gt;　<a href="cart.html">予約詳細</a> &gt <a href="cart.html">予約カレンダー</a>  &gt 予約確認
      </div><!-- /#topicPath -->
      <div id="main">
         <div align="center">
            <!--  img src="./images/宛先指定.JPG" -->
         </div>
      <table align="center" width="500px"  summary border="0" >

         <tr id="order">
            <td id="addres"><font size="4"><br>氏　　名：</font></td><td colspan="2"><div align="left">姓　<%=loginUser.getSei()%>　名　<%=loginUser.getMei()%></div></td>
         </tr>
         <tr id="order">
           <td id="addres"><font size="4"><br>フリガナ：</font></td><td colspan="2"><div align="left">セイ　<%=loginUser.getSeiKana()%>　メイ　<%=loginUser.getMeiKana()%></div></td>
         </tr>
         <tr id="order">
            <td id="addres"><font size="4"><br>郵便番号：</font></td>
            <td colspan="2">
               <div align="left">
                 <%=loginUser.getYubin()%>
               </div>
            </td>
         </tr>
         <tr id="order">
            <td id="addres"><font size="4"><br>都道府県：</font></td><td colspan="2"><div align="left"><%=loginUser.getTodouhuken()%></div></td>
         </tr>
         <tr id="order">
            <td id="addres"><font size="4"><br>市区町村：</font></td><td colspan="2"><div align="left"><%=loginUser.getAddress()%></div></td>
         </tr>
         <tr id="order">
            <td id="addres"><font size="4"><br>番　　地：</font></td><td colspan="2"><div align="left"><%=loginUser.getAddress2()%></div></td>
         </tr>
         <tr id="order">
            <td id="addres"><font size="4"><br>電話番号：</font></td><td colspan="2"><div align="left"><%=loginUser.getTel()%></font></div></td>
         </tr>
          <tr id="order">
            <td id="addres"><font size="4"><br>利用人数：</font></td><td colspan="2"><div align="left"><%=yoyaku.getNinzu()%></div></td>
         </tr>
         <tr id="order">
            <td id="addres"><font size="4"><br>部屋数：</font></td><td colspan="2"><div align="left"><%=yoyaku.getHeyasuu()%></div></td>
         </tr>
         <tr id="order">
            <td id="addres"><font size="4"><br>ご利用料金：</font></td><td colspan="2"><div align="left">40000円</div></td>
         </tr>


      </table>
      <div align="right">
         <input type="submit" value="完了" style="height: 30px; width: 80px;">
      </div>
      </form>
      </div><!-- /#main -->



    <div id="sub">
<!-- /.section -->
				<div class="section">
					<h2>ショップ</h2>
					<ul>
						<li><a href="index.html">入浴剤</a>
						</li>
						<li><a href="index.html">桶</a>
						</li>
					</ul>
				</div>
				<!-- /.section -->
				<!-- /.section -->
				<div class="section">
					<h2>名前で検索</h2>
					<ul>
						<li><input type="text" size="26"><input type="button" value="検索"style="width: 190px">
						</li>
					</ul>
				</div>
				<!-- /.section -->


           <div class="section">
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
						<li>
							<input type="text" placeholder="最低額を入力してください">円<br>
							～<input type="text" placeholder="最高額を入力してください">円
						</li>
					</ul>
					<ul>
						<li>・日帰りプラン</li>
						<li>　<input type="checkbox">日帰りを含む
					</ul>
					<ul>
						<a href="Kensaku2.jsp"><input type="button" value="検索" style="width: 190px"></a>
					</ul>
				</div>
				<!-- /.section -->
         </div><!-- /.sub -->



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
