<%@page contentType="text/html; charaset=UTF-8" pageEncoding="UTF-8"%>
<%@page import="jp.ac.fjb.onsen.bean.UserBean"%>
<%@page import="jp.ac.fjb.onsen.bean.SyouhinBean"%>
<%@page import="java.util.ArrayList"%>


<%
	UserBean loginUser = (UserBean) session.getAttribute("LOGIN_USER");
	if (loginUser==null) {
		loginUser = new UserBean();
		loginUser.setUserID("on00000");
	}
	ArrayList<SyouhinBean> hslist = (ArrayList)session.getAttribute("KOUNYU");
%>


<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml" xml:lang="ja" lang="ja">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta http-equiv="Content-Style-Type" content="text/css" />
<meta http-equiv="Content-Script-Type" content="text/javascript" />
<meta http-equiv="imagetoolbar" content="no" />
<meta name="description" content="" />
<meta name="keywords" content="" />
<link rel="stylesheet" href="css/reg.css" type="text/css" />
<script type="text/javascript" src="js/jquery.js"></script>
<script type="text/javascript" src="js/common.js"></script>
<title>温ラインショップ</title>
</head>
<body>
<div id="top">
   <div id="headWrap">
      <div id="header">
         <h1><a href="index.html"><img src="images/rogo2.png" alt="" /></a></h1>
         <div id="pr">
            <p>温泉を紹介します。</p>
         </div>
         <div id="gnavi">
            <ul>
               <li><font size="4">ようこそ!! <%=session.getAttribute("LOGIN_USERsei")%>さん</font></li>
               <li><font size="4" color='green'><a href="LoginServlet">ログアウト</a></font></li>
            </ul>
         </div>
      </div><!-- /#header -->
   </div><!-- /#headWrap -->
   <div id="menu">
      <ul>
			<li class="home"><a href="HomeServlet"  id="home">ホーム</a></li>
			<li><a href="ShopTopServlet" id="shop">ショップ</a></li>
			<li><a href="MypageServlet" id="mypage">マイページ</a></li>
			<li><a href="#Top" id="game">ゲーム</a></li>
      </ul>
   </div><!-- /#menu -->
   <div id="contents">
			<div id="main">
				<h2>購入履歴</h2>
				<p class="got">
				<%
				for(int i=0;i<hslist.size();i++)
				{
				%>
					<table border="1" cellspacing="0">
						<tr>
							<td width="100"><font size="3"><%= hslist.get(i).getSyouhinName() %><div style="text-align:center;" valign="baseline">購入日時:<%= hslist.get(i).getChiikicode() %><br>合計金額:<%= hslist.get(i).getTanka() %>円</div>
							<br>
							<img src=<%= hslist.get(i).getImagepass() %> width="160px" height="120px" alt="" />
							</font>
							</td>
						</tr>
					</table>
				<%
				}
				%>
				</p>
				<p></p>

			</div>
			<!-- /#main -->
      <div id="sub">
         <div class="section">
            <h2><font size="4px">マイメニュー</font></h2>
            <ul>
            <font size="3px">
               <li><a href="MypageServlet">登録情報確認</a></li>
               <br>
               <li><a href="MTourokuhenkouServlet">登録情報変更</a></li>
				<br>
               <li><a href="MCardServlet">クレジットカード</a></li>
               <br>
               <li><a href="MKounyuServlet"><font color="blue">購入履歴</font></a></li>
               <br>
               </font>
            </ul>
         </div><!-- /.section -->
         <div class="section">
         </div><!-- /.section -->
      </div><!-- /#sub -->
      <div id="pageTop">
         <a href="#top">ページのトップへ戻る</a>
      </div><!-- /#pageTop -->
   </div><!-- /#contents -->
   <div id="footer">
      <div id="footMenu">
         <ul>
         </ul>
      </div><!-- /#footerMenu -->
      <div class="copyright">Copyright &copy; 2011 YOUR SITE NAME All Rights Reserved.</div>
   </div><!-- /#footer -->
</div><!-- /#top -->
</body>
</html>