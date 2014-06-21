<%@page contentType="text/html; charaset=UTF-8" pageEncoding="UTF-8"%>
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
               <li><font size="4">ようこそ!! 石原さん</font></li>
               <li><font size="4" color='green'><a href="index.html">ログアウト</a></font></li>
            </ul>
         </div><!-- /#gnavi -->
      </div><!-- /#header -->
   </div><!-- /#headWrap -->
   <div id="menu">
      <ul>
         <li class="home"><a href="OnsenTop.jsp">ホーム</a></li>
         <li><a href="<%=request.getContextPath()%>/ShopTopServlet" id="shop">ショップ</a></li>
         <li><a href="mymenu.html">マイページ</a></li>
         <li><a href="index.html">ゲーム</a></li>
      </ul>
   </div><!-- /#menu -->

    <div id="contents">
     <div id="topicPath">
         <a href="index.html">HOME</a>&gt;<a href="cart.html">検索結果</a>&gt;<a href="cart.html">予約詳細</a>
                &gt <a href="cart.html">予約カレンダー</a>  &gt <a href="cart.html">予約確認 &gt 予約完了
      </div><!-- /#topicPath -->
      <div id="main">
        <p><font size= "20px"><br><br>ご予約ありがとう<br>ございました。</font></p>

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
