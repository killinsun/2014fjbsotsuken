<%@page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>

<meta http-equiv="Content-Type" content="text/html; charset=shift_jis" />
<meta http-equiv="Content-Style-Type" content="text/css" />
<meta http-equiv="Content-Script-Type" content="text/javascript" />
<meta name="copyright" content="Nikukyu-Punch" />
<script type="text/javascript" src="js/e-learningmenu.js"></script>
<title>学習用e-leaningサイト</title>
<link href="css/style.css" rel="stylesheet" type="text/css" />
<link href="css/e-learningmenu.css" rel="stylesheet" type="text/css" />

</head>

<body onload="MM_preloadImages('images/menu_over_01.gif','images/menu_over_02.gif','images/menu_over_03.gif','images/menu_over_04.gif','images/menu_over_05.gif','images/menu_over_06.gif')">
<form id="KyoukaForm">
<action="/sample/MenuServlet" id="form">

<div id="container">
<div id="main_img2"><h1></h1><img src="images/main_img2.jpg" width="800" height="175" /></div>
<ul id="menu">
<li><a href="Mainmenu.jsp"><img src="images/menu_++1.gif" alt="ホーム" name="Image1" width="140" height="59" id="Image1" onmouseover="MM_swapImage('Image1','','images/menu_over_++01.gif',1)" onmouseout="MM_swapImgRestore()" /></a></li><!--
--><li><a href="e-learningmenu.jsp"><img src="images/menu_++2.gif" alt="当サイトについて" name="Image2" width="133" height="59" id="Image2" onmouseover="MM_swapImage('Image2','','images/menu_over_++02.gif',1)" onmouseout="MM_swapImgRestore()" /></a></li><!--
--><li><a href="Mainmenu.jsp"><img src="images/menu_++3.gif" alt="お仕事" name="Image3" width="134" height="59" id="Image3" onmouseover="MM_swapImage('Image3','','images/menu_over_++03.gif',1)" onmouseout="MM_swapImgRestore()" /></a></li><!--
--><li><a href="Mainmenu.jsp"><img src="images/menu_++4.gif" alt="ブログ" name="Image4" width="133" height="59" id="Image4" onmouseover="MM_swapImage('Image4','','images/menu_over_++04.gif',1)" onmouseout="MM_swapImgRestore()" /></a></li><!--
--><li><a href="Mainmenu.jsp"><img src="images/menu_++5.gif" alt="お問い合わせ" name="Image5" width="133" height="59" id="Image5" onmouseover="MM_swapImage('Image5','','images/menu_over_++05.gif',1)" onmouseout="MM_swapImgRestore()" /></a></li><!--
--><li><a href="Mainmenu.jsp"><img src="images/menu_++6.gif" alt="リンク" name="Image6" width="139" height="59" id="Image6" onmouseover="MM_swapImage('Image6','','images/menu_over_++06.gif',1)" onmouseout="MM_swapImgRestore()" /></a></li><!--
--></ul>


<div id = "button" align = "center">
	<div id = "skype">
	<div style="position: relative;">

							<div style="position:absolute; top:15px; left:320px; width: 180px;">
								<font color="#ffffff" size="8">国語<br>
									</font></div>
						</div>


	<h3>漢字や古文など様々な</h3>
	<input type="image" src="images/blue.png" name="button1" alt="国語">
	<h3>の勉強ができます。</h3>

	</div>
	<br>
	<br>

	<div id= "douga">
	<div style="position: relative;">

							<div style="position:absolute; top:15px; left:320px; width: 180px;">
								<font color="#ffffff" size="8">数学<br>
									</font></div>
						</div>

	<h3>通常の計算問題や方程式など幅広い</h3>
	<input type="image" src="images/pink.png" name="button2" alt="数学">
	<h3>の勉強ができます。</h3>
	</div>
	<br>
	<br>

	<div id= "kamoku">
	<div style="position: relative;">

							<div style="position:absolute; top:15px; left:320px; width: 180px;">
								<font color="#ffffff" size="8">英語<br>
									</font></div>
						</div>
	<h3>構文、単語、リスニングなど隅々まで</h3>
	<input type="image" src="images/orange.png" name="Ebtn" id="Ebtn" alt="英語">
	<h3>の勉強ができます。</h3>
	</div>

</div>

</div>



<div id="footer">Copyright(C)2008 ●●●秀英社●●● All Rights Reserved.<br />
<a href="http://nikukyu-punch.com/" target="_blank">Template design by Nikukyu-Punch</a></div>


	<input type="hidden" id="KyoukaId" name="KyoukaId">
</div>
</body>
</form>
</html>
