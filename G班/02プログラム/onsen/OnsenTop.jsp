<%@page import="java.util.ArrayList"%>
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
<link rel="stylesheet" href="css/common.css" type="text/css" />
<script type="text/javascript" src="js/jquery.js"></script>
<script type="text/javascript" src="js/common.js"></script>
<script src="js/sSearch.js"></script>
<title>温ラインショップ</title>
<script src="./script/Home.js"></script>
<script src="js/oCate.js"></script>
</head>
<body>
	<div id="top">
		<div id="headWrap">
			<div id="header">
				<h1>
					<a href="index.html"><img src="images/rogo2.png" alt="" /> </a>
				</h1>
				<form action="/onsen/LoginServlet">
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
				</form>
			</div>
			<!-- /#header -->
		</div>
		<!-- /#headWrap -->
		<form action="/Onsen/HomeServlet">
			<div id="menu">
				<ul>
					<li class="home"><a href="HomeServlet"  id="home">ホーム</a></li>
					<li><a href="STopServlet" id="shop">ショップ</a></li>
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
					<li><a href="Game.jsp" id="game">ゲーム</a></li>
				</ul>
			</div>
		</form>
		<!-- /#menu -->
		<div id="icatch">
			<img src="images/icatch.jpg" width="787px" alt="" />
		</div>
		<div id="contents">
			<div id="main">
				<h2>宿・ホテル予約</h2>
				<h3>エリアから探す</h3>
				<p>
					<div class="area">
						<dl>
							<dt>全国マップ</dt>
							<dd class="description">ご希望のエリアをクリックしてください。</dd>
							<dd class="map">
								<img src="images/map.gif" alt="全国マップ" width="515" height="210"
									usemap="#mapArea">
								<map name="mapArea" id="mapArea">
									<area shape="poly"
										coords="415,2,509,2,485,51,435,51,432,57,388,57" href="HokkaidouServlet"
										alt="北海道" title="北海道エリア">
									<area shape="poly"
										coords="386,61,459,61,424,131,369,131,383,104,365,104"
										href="TouhokuServlet" alt="東北" title="東北エリア" >
									<area shape="poly"
										coords="351,133,423,133,392,196,363,196,368,187,324,187"
										href="KantouServlet" alt="関東" title="関東エリア">
									<area shape="poly"
										coords="277,108,306,108,302,117,358,117,364,106,380,106,368,131,350,131,334,162,293,162,301,144,259,144"
										href="HokurikuServlet" alt="北陸・信越" title="北陸・信越エリア">
									<area shape="poly"
										coords="273,146,299,146,290,164,333,164,322,187,278,187,274,196,248,196"
										href="ToukaiServlet" alt="東海" title="東海エリア">
									<area shape="poly"
										coords="234,117,270,117,256,146,271,146,246,196,203,196,223,154,215,154"
										href="KinkiServlet" alt="近畿" title="近畿エリア">
									<area shape="poly" coords="166,117,232,117,213,154,147,154"
										href="TyuugokuServlet" alt="中国" title="中国エリア">
									<area shape="poly" coords="150,158,213,158,194,196,131,196"
										href="ShikokuServlet" alt="四国" title="四国エリア">
									<area shape="poly"
										coords="96,117,162,117,118,206,66,206,92,153,78,153" href="KyuusyuuServlet"
										alt="九州" title="九州エリア">
									<area shape="poly" coords="19,180,63,180,50,206,6,206" href="OkinawaServlet"
										alt="沖縄" title="沖縄エリア">
								</map>
							</dd>
						</dl>
					</div>
				</p>
				<p></p>
				<h3>Pick Up</h3>
				<p>
				<% HomeModel model = new HomeModel();
					OnsenBean on1 = model.getOnsen("ON00001");
					OnsenBean on2 = model.getOnsen("ON00002");
					OnsenBean on3 = model.getOnsen("ON00003");%>
				<form action="/onsen/OSyousaiServlet" id="form">
					<table border="1">
						<tr>
							<td><a href=<%=request.getContextPath()%>/OSyousaiServlet?OnsenID="ON00001"><div style="text-align: center;">
									<input type="image" src=<%=on1.getImagepass() %> id="on1" width="140px"  height="87px" alt="" />
								</div>
								<br>
								<div style="text-align: center;"><%=on1.getOnsenName()%></div>
								</a>
							</td>
							<td><a href=<%=request.getContextPath()%>/OSyousaiServlet?OnsenID="ON00002"><div style="text-align: center;">
									<input type="image" src=<%=on2.getImagepass() %> id="on2"  width="140px"  height="87px" alt="" />
								</div>
								<br>
								<div style="text-align: center;"><%=on2.getOnsenName()%></div>
								</a>
							</td>
							<td><a href=<%=request.getContextPath()%>/OSyousaiServlet?OnsenID="ON00003"><div style="text-align: center;">
									<input type="image" src=<%=on3.getImagepass() %> id="on3"  width="140px" height="87px"  alt="" />
								</div>
								<br>
								<div style="text-align: center;"><%=on3.getOnsenName()%></div>
								</a>
							</td>
					</table>
					<input type="hidden" id="progId2" name="progId2" />
				</form>
				</p>
				<h2>オンラインショップ</h2>
				<h3>新着商品情報</h3>
				<p>
				<% SyouhinBean sh1 = model.getSyouhin("SH00003");
					SyouhinBean sh2 = model.getSyouhin("SH00004");
					SyouhinBean sh3 = model.getSyouhin("SH00005");
					ArrayList<SyouhinBean> otlist = new ArrayList<SyouhinBean>();
					otlist.add(sh1);
					otlist.add(sh2);
					otlist.add(sh3);
					session.setAttribute("O_TOP_ITEMS", otlist);
				%>
				<form action="OtopSSyousaiServlet" id="selectForm">
					<table border="1">
						<tr>
							<td><div style="text-align: center;">
									<a href="javascript:void(0);" onclick="detail(<%= 0 %>)"><img src=<%=sh1.getImagepass() %> id="sh1" width="120px" height="87px" alt="" /></a>
								</div>
								<br> <a href="javascript:void(0);" onclick="detail(<%= 0 %>)"><%=sh1.getSyouhinName() %> <%=sh1.getSyouhinzyouhou() %></a></td>
							<td><div style="text-align: center;">
									<a href="javascript:void(0);" onclick="detail(<%= 1 %>)"><img src=<%=sh2.getImagepass() %> id="sh2" width="120px" height="87px" alt="" /></a>
								</div>
								<br> <a href="javascript:void(0);" onclick="detail(<%= 1 %>)"><%=sh2.getSyouhinName() %> <%=sh2.getSyouhinzyouhou() %></a></td>
							<td><div style="text-align: center;">
									<a href="javascript:void(0);" onclick="detail(<%= 2 %>)"><img src=<%=sh3.getImagepass() %> id="sh3" width="120px" height="87px" alt="" /></a>
								</div>
								<br> <a href="javascript:void(0);" onclick="detail(<%= 2 %>)"><%=sh3.getSyouhinName() %> <%=sh3.getSyouhinzyouhou() %></a></td>
						</tr>
					</table>
					<input type="hidden" id="syouhinID" name="syouhinID" value="" />
				</form>
				</p>
				<h2>INFORMATION</h2>
				<dl class="information">
					<dt>
						<span>2013-10-19</span>
					</dt>
					<dd>
						<div>
							新しい温泉情報を更新しました。<br />
						</div>
					</dd>
					<dt>
						<span>2013-04-24</span>
					</dt>
					<dd>
						<div>2013年4月24日からリニューアルオープンしました。</div>
					</dd>
					<dt>
						<span>2009-03-31</span>
					</dt>
					<dd>
						<div>休業のお知らせ。誠に勝手ながら3月31日日を持って無期限長期休暇日とさせていただきます。ご了承ください。</div>
					</dd>
				</dl>
			</div>
			<!-- /#main -->


  <div id="sub">
   <div class="section">

   <form action="OSearchServlet" id="searchmenu">
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


			<div id="pageTop">
				<a href="#top">ページのトップへ戻る</a>
			</div>
			<!-- /#pageTop -->
		</div>
		<!-- /#contents -->
		<div id="haikei">
			<img src="images/haikeib.jpg" />
		</div>
		<div id="footer">
			<div id="footMenu">
				<ul>

				</ul>
			</div>
			<!-- /#footerMenu -->
			<div class="copyright">Copyright &copy; 2011 YOUR SITE NAME All
				Rights Reserved.</div>
		</div>
		<!-- /#footer -->
	</div>
	<!-- /#top -->
</body>
</html>