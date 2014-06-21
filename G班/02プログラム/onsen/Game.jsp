<%@page contentType="text/html; charaset=UTF-8" pageEncoding="UTF-8" %>
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
<link rel="stylesheet" href="css/reg.css" type="text/css" />
<script type="text/javascript" src="js/jquery.js"></script>
<script type="text/javascript" src="js/common.js"></script>
<script src="./script/oyu.js"></script>
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
					<li><a href="#Top" id="game">ゲーム</a></li>
      </ul>
   </div><!-- /#menu -->
   <span id="onsen"><img src="images/o001.png" width="80px" height="60px" ></img></span>
   <span id ="oyu"></span>
	<!-- /.section -->
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

<script>
function Time(){
	createSpan();
	oyu();


}
setInterval(Time,1000/50);
var x = 0;
var y=0;
var i = document.getElementById("onsen");
i.style.position ="relative";
document.onkeydown = function (e)
{
	if(e.keyCode==39)
	{
		x +=10;
		i.style.left = x+"px";
	}
	if(e.keyCode==37)
	{
		x -=10;
		i.style.left = x+"px";
	}
	if(e.keyCode==38)
	{
		y -=10;
		i.style.top = y+"px";
	}
	if(e.keyCode==40)
	{
		y +=10;
		i.style.top = y+"px";
	}
}

</script>
</html>