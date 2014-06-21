<%@page contentType="text/html; charaset=UTF-8" pageEncoding="UTF-8"%>
<%@page import="jp.ac.fjb.onsen.bean.UserBean"%>
<%@page import="jp.ac.fjb.onsen.bean.CardBean"%>


<%
	CardBean card = (CardBean) session.getAttribute("CARD");
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
				<h2>クレジットカード</h2>
				<p class="got">
				<table border="1" cellspacing="0">
					<tr>
					<td>クレジットカードタイプ
						<form name="yyyy" method="post" action="#">
						<select name="2">
						<option name="11" value="VISA">1つ選択してください</option>
						<option name="11" value="VISA">VISA</option>
						<option name="12" value="JCB">JCB</option>
						</select>
						</form><br>
						カード番号<br>
						<input type="Text" name="CardID" size="40px" value=<%=card.getCardID() %>><br>
						<font color="red">※クレジットカード番号をご入力の際は、ハイフン、スペースを入れずにご入力ください。</font>
						<br>
						カード名義<br><input type="Text" name="CardName" size="40px" value=<%=card.getCardName() %>><br><br>
						有効期限（月/年）
						<form name="yyyy" method="post" action="#">
						<select name="2">
						<option name="1" value="1">1</option>
						<option name="2" value="2">2</option>
						<option name="3" value="3">3</option>
						<option name="4" value="4">4</option>
						<option name="5" value="1">5</option>
						<option name="6" value="2">6</option>
						<option name="7" value="3">7</option>
						<option name="8" value="4">8</option>
						<option name="9" value="4">9</option>
						<option name="10" value="1">10</option>
						<option name="11" value="2">11</option>
						<option name="12" value="3">12</option>
						</select>
						<select name="2">
						<option name="13" value="1">13</option>
						<option name="14" value="2">14</option>
						<option name="15" value="3">15</option>
						<option name="16" value="4">16</option>
						<option name="17" value="1">17</option>
						<option name="18" value="2">18</option>
						<option name="19" value="3">19</option>
						<option name="20" value="4">20</option>
						<option name="21" value="4">21</option>
						<option name="22" value="1">22</option>
						<option name="23" value="2">23</option>
						<option name="24" value="3">24</option>
						</select>
						</form>
						<br>
						セキュリティコード<input type="Text" name="Card" size="10px" value=<%=card.getSequrity() %>>
						<br>
						<br>
					<div style="text-align:right;"><input type="button" value="変更" style="width:80px;height:30px"></div>
					</td>
					</tr>
				</table>
				</p>
				<p></p>

			</div>
			<!-- /#main -->
			<div id="sub">
				<div class="section">
					<h2>
						<font size="4px">マイメニュー</font>
					</h2>
					<ul>
						<font size="3px">
							<li><a href="MypageServlet">登録情報確認</a>
						</li> <br>
								<li><a href="MTourokuhenkouServlet">登録情報変更</a>
							</li> <br>
									<li><a href="MCardServlet"><font color="blue">クレジットカード</font></a>
								</li> <br>
										<li><a href="MKounyuServlet">購入履歴</a>
									</li>
									               <br>
						</font>
					</ul>
				</div>
				<!-- /.section -->
				<div class="section"></div>
				<!-- /.section -->
			</div>
			<!-- /#sub -->
			<div id="pageTop">
				<a href="#top">ページのトップへ戻る</a>
			</div>
			<!-- /#pageTop -->
		</div>
		<!-- /#contents -->
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