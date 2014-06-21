<%@page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@page import="java.util.ArrayList" %>
<%@page import="jp.ac.fjb.eLearning.bean.MondaiMenuBean" %>
<%@page import="jp.ac.fjb.eLearning.bean.listeningFormBean" %>

<% ArrayList<MondaiMenuBean> list= (ArrayList)session.getAttribute("Mondai");%>
<% ArrayList<listeningFormBean> tensuList = (ArrayList)session.getAttribute("TENSU_LISTENING");%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=shift_jis" />
<meta http-equiv="Content-Style-Type" content="text/css" />
<meta http-equiv="Content-Script-Type" content="text/javascript" />
<meta name="copyright" content="Nikukyu-Punch" />
<script type="text/javascript" src="js/Listening.js"></script>
<title>Listening選択画面</title>
<link href="css/Mainmenu.css" rel="stylesheet" type="text/css" />
<script type="text/javascript" src="js/script.js"></script>
</head>
<body onload="MM_preloadImages('images/menu_over_01.gif','images/menu_over_02.gif','images/menu_over_03.gif','images/menu_over_04.gif','images/menu_over_05.gif','images/menu_over_06.gif')">
<form id="Cform">
<div id="container">
<div id="main-img"><h1>Listening</h1><img src="images/main_img2.jpg" width="800" height="175" /></div>
<ul id="menu">
<li><a href="Mainmenu.jsp"><img src="images/menu_++1.gif" alt="ホーム" name="Image1" width="140" height="59" id="Image1" onmouseover="MM_swapImage('Image1','','images/menu_over_++01.gif',1)" onmouseout="MM_swapImgRestore()" /></a></li><!--
--><li><a href="e-learningmenu.jsp"><img src="images/menu_++2.gif" alt="当サイトについて" name="Image2" width="133" height="59" id="Image2" onmouseover="MM_swapImage('Image2','','images/menu_over_++02.gif',1)" onmouseout="MM_swapImgRestore()" /></a></li><!--
--><li><a href="Mainmenu.jsp"><img src="images/menu_++3.gif" alt="お仕事" name="Image3" width="134" height="59" id="Image3" onmouseover="MM_swapImage('Image3','','images/menu_over_++03.gif',1)" onmouseout="MM_swapImgRestore()" /></a></li><!--
--><li><a href="Mainmenu.jsp"><img src="images/menu_++4.gif" alt="ブログ" name="Image4" width="133" height="59" id="Image4" onmouseover="MM_swapImage('Image4','','images/menu_over_++04.gif',1)" onmouseout="MM_swapImgRestore()" /></a></li><!--
--><li><a href="Mainmenu.jsp"><img src="images/menu_++5.gif" alt="お問い合わせ" name="Image5" width="133" height="59" id="Image5" onmouseover="MM_swapImage('Image5','','images/menu_over_++05.gif',1)" onmouseout="MM_swapImgRestore()" /></a></li><!--
--><li><a href="Mainmenu.jsp"><img src="images/menu_++6.gif" alt="リンク" name="Image6" width="139" height="59" id="Image6" onmouseover="MM_swapImage('Image6','','images/menu_over_++06.gif',1)" onmouseout="MM_swapImgRestore()" /></a></li><!--
--></ul>

<div id="table" align="center">
<table width="800" border="0" cellspacing="0" cellpadding="0" rules="all">
<tbody>
<tr><!--
--><td width="760" bgcolor="#1E90FF">単元</td><!--
--><td width="760" bgcolor="#1E90FF">タイトル</td><!--
--><td width="760" bgcolor="#1E90FF">機能・内容</td><!--
--><td width="760" bgcolor="#1E90FF">主な表現</td><!--
--></tr>
<% int a=1; %>
<%for (int i=0; i<list.size(); i++) { %>
<% MondaiMenuBean monda2 = list.get(i);%>
<% listeningFormBean tensu = tensuList.get(i);%>

<tr><!--
--><td width="760" bgcolor="#ffffff"><button id="Lbtn" onClick="bunyaClick('<%=monda2.getTangen() %>');">Lesson<%= a++ %><div class="meter-wrap">
<div class="meter-value" style="background-color: #0a0;
width: <%=tensu.getTensu() %>%"><div class="meter-text"><!--Text Here!--></div></div></div></button></td><!--
--><td width="760" bgcolor="#ffffff" id="title"><%=monda2.getTitle() %></td><!--
--><td width="760" bgcolor="#ffffff" id="kinou"><%=monda2.getKinou() %></td><!--
--><td width="760" bgcolor="#ffffff" id="hyogen"><%=monda2.getHyogen() %></td><!--
--></tr>
<% } %>
</table>
<input type ="hidden" name="bunyaId" id ="bunyaId"></input>
</div>
</div>
<!--sub-->
<!--contents-->

<div id="footer">Copyright(C)2013 秀英社 All Rights Reserved.<br />
<a href="http://nikukyu-punch.com/" target="_blank">Template design by Nikukyu-Punch</a></div>

</form>
</body>
</html>