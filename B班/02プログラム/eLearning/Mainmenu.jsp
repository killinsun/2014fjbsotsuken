<%@page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@page import="java.util.ArrayList" %>
<%@page import="jp.ac.fjb.eLearning.bean.OsiraseBean" %>
<%@page import="jp.ac.fjb.eLearning.bean.NewsBean" %>
<%@page import="jp.ac.fjb.eLearning.bean.MenteBean" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=shift_jis" />
<meta http-equiv="Content-Style-Type" content="text/css" />
<meta http-equiv="Content-Script-Type" content="text/javascript" />
<meta name="copyright" content="Nikukyu-Punch" />
<title>学習用e-ラーニングサイト</title>
<link href="css/Mainmenu1.css" rel="stylesheet" type="text/css" />
<script type="text/javascript" src="js/script.js"></script>
</head>

<body onload="MM_preloadImages('images/menu_over_01.gif','images/menu_over_02.gif','images/menu_over_03.gif','images/menu_over_04.gif','images/menu_over_05.gif','images/menu_over_06.gif')">
<form id="menuform">
<div id="container">
<div id="main-img"><h1>メインメニュー</h1><img src="images/main_img2.jpg" width="800" height="175" /></div>
<ul id="menu">
<li><a href="Mainmenu.jsp"><img src="images/menu_++1.gif" alt="ホーム" name="Image1" width="140" height="59" id="Image1" onmouseover="MM_swapImage('Image1','','images/menu_over_++01.gif',1)" onmouseout="MM_swapImgRestore()" /></a></li><!--
			--><li><a href="e-learningmenu.jsp"><img src="images/menu_++2.gif" alt="当サイトについて" name="Image2" width="133" height="59" id="Image2" onmouseover="MM_swapImage('Image2','','images/menu_over_++02.gif',1)" onmouseout="MM_swapImgRestore()" /></a></li><!--
			--><li><a href="Mainmenu.jsp"><img src="images/menu_++3.gif" alt="お仕事" name="Image3" width="134" height="59" id="Image3" onmouseover="MM_swapImage('Image3','','images/menu_over_++03.gif',1)" onmouseout="MM_swapImgRestore()" /></a></li><!--
			--><li><a href="Mainmenu.jsp"><img src="images/menu_++4.gif" alt="ブログ" name="Image4" width="133" height="59" id="Image4" onmouseover="MM_swapImage('Image4','','images/menu_over_++04.gif',1)" onmouseout="MM_swapImgRestore()" /></a></li><!--
			--><li><a href="Mainmenu.jsp"><img src="images/menu_++5.gif" alt="お問い合わせ" name="Image5" width="133" height="59" id="Image5" onmouseover="MM_swapImage('Image5','','images/menu_over_++05.gif',1)" onmouseout="MM_swapImgRestore()" /></a></li><!--
			--><li><a href="Mainmenu.jsp"><img src="images/menu_++6.gif" alt="リンク" name="Image6" width="139" height="59" id="Image6" onmouseover="MM_swapImage('Image6','','images/menu_over_++06.gif',1)" onmouseout="MM_swapImgRestore()" /></a></li><!--
			--></ul>
<div id="contents">
<div id="main">
<h2>新着ニュース</h2>
<DIV style="overflow-y:scroll;width:500px;height:100px;">
<%
	ArrayList<NewsBean> listN
	= (ArrayList)session.getAttribute("NewsList");

	for(int i = 0; i < listN.size(); i++){
    	NewsBean bean = listN.get(i); 		 //ArrayListの要素を取得
    	out.println( " ■"+bean.getHiduke()+" "+ bean.getHonbun() +  "<br>");
	}
%>

</DIV>

<h2>おしらせ</h2>
<DIV style="overflow-y:scroll;width:500px;height:100px;">

<%
	ArrayList<OsiraseBean> listO
	= (ArrayList)session.getAttribute("OsiraseList");

	for(int i = 0; i < listO.size(); i++){
    	OsiraseBean bean = listO.get(i); 		 //ArrayListの要素を取得
    	out.println( " ■"+bean.getHiduke()+" "+bean.getHonbun() + "<br>");
	}
%>


</div>
<h2>メンテナンス</h2>
<DIV style="overflow-y:scroll;width:500px;height:100px;">
<%
	ArrayList<MenteBean> listMN
	= (ArrayList)session.getAttribute("MenteList");

	for(int i = 0; i < listMN.size(); i++){
    	MenteBean bean = listMN.get(i); 		 //ArrayListの要素を取得
    	out.println( " ■"+bean.getHiduke()+" "+ bean.getHonbun() + "<br>");
	}
%>
</div>
<h2>ユーザ様へ</h2>
<p>
当サイトをご利用いただき誠にありがとうございます。
<br>
今後も利用者様から寄せられた要望や使いやすさの追求をもとにより良いサイトにしていきますので今後もよろしくお願いします。
</p>
<h2>利用規約</h2>
<DIV style="overflow-y:scroll;width:500px;height:100px;">
<p>
第1条（本コンテンツの使用許諾および利用条件）
<br>
1.当社は、利用者に対し、本コンテンツを無償で使用する権利を許諾します。
<br>
2.テンプレート、テンプレートに含まれる画像およびWEB素材の改変および加工（以下総称し
　て「改変等」といいます）は、利用者の責任において自由に行うことができます。
<br>
3.利用者は、本規約および当サイトにおいて当社が公開するまたは個別に通知もしくは提供
　する本コンテンツの機能説明、利用方法に関する説明、注意事項および制限事項等（以下　総称して「説明書等」といいます）に従い本コンテンツを利用するものとします。
<br>
第2条（禁止事項）
<br>
利用者は、本コンテンツの利用または改変等に関連し、以下の行為を行わないものとします。
<br>
(1)本規約および説明書等の定めに違反する行為
<br>
(2)国内外の諸法令に違反するおそれのある行為
<br>
(3)当社または第三者の権利（著作権、著作隣接権および商標権を含む知的財産権、プライ　バシー権、肖像権ならびに名誉権等を含むがこれらに限らない）を侵害する、またはそのお　それのある行為
<br>
(4)マルチ商法、ねずみ講またはネットワークビジネス等への勧誘等を行う行為
<br>
(5)風俗、アダルトに関する情報、未成年者や青少年に有害な情報、またはそれらに類すると　判断される情報を発信する行為
<br>
(6)反社会的、暴力的、猟奇的な情報を発信する行為
<br>
(7)犯罪行為その他の違法行為を幇助、教唆、助長する行為
<br>
(8)不正にアクセスする行為、クラッキング行為、アタック行為、ウィルス発信行為、その他当　社または第三者の運用するコンピュータ等に支障を与える行為、またはそのおそれのある　　行為
<br>
(9)本コンテンツまたは改変等を行った本コンテンツ（以下総称して「本コンテンツ等」といいま　す）の第三者への配布、使用許諾または権利の譲渡
<br>
(10)本コンテンツ等を記録した媒体の第三者への配布または販売
</p>
</div>
<h2>その他リンク</h2>
<p><span class="color1">■<strong>当社関連サイト</strong></span><br />
<a href="http://template-punch.com/" target="_blank"><img src="images/banner_tp.png" alt="テンプレート販売サイトのテンプレートパンチ" width="200" height="40" /></a></p>
<p><a href="http://moko-design.com/" target="_blank"><img src="images/banner_md.png" alt="WEB制作サイト Moko Design" width="200" height="40" /></a></p>
<p><a href="http://photo-chips.com/" target="_blank"><img src="images/banner_pc.png" alt="フリー写真サイト PHOTO CHIPS" width="200" height="40" /></a></p>

</div><!--main-->
<div id="sub">

<h3><img src="images/sub_menu_midashi_topics.gif" alt="トピックス" width="226" height="32" /></h3>
<div class="menubottom">
<a class="twitter-timeline" href="https://twitter.com/jallyman23" data-widget-id="388179343463030785">@jallyman23 からのツイート</a>
<script>!function(d,s,id){var js,fjs=d.getElementsByTagName(s)[0],p=/^http:/.test(d.location)?'http':'https';if(!d.getElementById(id)){js=d.createElement(s);js.id=id;js.src=p+"://platform.twitter.com/widgets.js";fjs.parentNode.insertBefore(js,fjs);}}(document,"script","twitter-wjs");</script>

<!--<input name="textfield" type="text" style="width: 90%" value="&lt;li&gt;&lt;a href=&quot;#&quot;&gt;* sub menu 1 *&lt;/a&gt;&lt;/li&gt;" />-->
<p>
</div><!--menubottom-->
<br />
</div>
<!--sub-->
</div><!--contents-->
<div id="footer">Copyright(C)2013 秀英社 All Rights Reserved.<br />
<a href="http://nikukyu-punch.com/" target="_blank">Template design by Nikukyu-Punch</a></div>
</div>
</body>
</form>
</html>
