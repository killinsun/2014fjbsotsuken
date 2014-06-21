<%@page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8" %>
<%@page import="jp.ac.fjb.sns.bean.UserBean"%>

<%
	// ログインユーザの情報
	UserBean loginUser = (UserBean)session.getAttribute("LOGIN_USER");
	String userPosition = (String)loginUser.getPositionId();
%>
<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml">

<head>
	<meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
	<link rel="StyleSheet" type="text/css" href="css/editProfile.css" />
	<script type="text/javascript" src="js/screenTransition.js"></script>
    <title>ConVertion</title>
</head>

<body>
<form id="form" name="form" action="">
	<div id="Logo">
		<img src="img/logo/logo.png" height="100" width="200" alt="タイトルロゴ">
	</div>

	<div ul="SubMenu" style="list-style:none" id="SubMenu">
		<li style="float:right">
			<input type="submit" id="Button" style="WIDTH: 70px; HEIGHT: 30px" value="LogOut" onClick="goMainServlet('-1');"></li>
		</li>
		<li style="float:right">
			<input type="submit" id="Button" style="WIDTH: 70px; HEIGHT: 30px" value="Profile" onClick="goProfileServlet();">
		</li>
		<li style="float:right">
			<input type="submit" id="Button" style="WIDTH: 70px; HEIGHT: 30px" value="Help" disabled>
		</li>
		<li style="float:right">
			<input type="submit" id="Button" style="WIDTH: 70px; HEIGHT: 30px" value="Home" onClick="goMainServlet();">
		</li>
		<li style="float:right">
			<%if (userPosition.equals("Y00") || userPosition.equals("Y01") || userPosition.equals("Y02") || userPosition.equals("Y03") || userPosition.equals("Y04")) { %>
			<input type="submit" id="admin" style="WIDTH: 70px; HEIGHT: 30px" value="Admin" onClick="goMasterMaintenanceServlet();">
			<%} else { %>
			<input type="submit" id="admin" style="WIDTH: 70px; HEIGHT: 30px" value="Admin" disabled>
			<%} %>
		</li>
	</div>

	<div id="LoginName">
		<div id="xLogo" align="center">
			<img src="<%=loginUser.getSectionImg()%>.png"><br />
			<img src="<%=loginUser.getPositionImg()%>">
		</div>
		<div id="yLogo"><img src="<%=loginUser.getLevelImg()%>.png"></div>
		<div id="zLogo"><font size="4">いらっしゃいませ。</font><br/><h3 align="right" ><%=loginUser.getUserName() %> 　様</h3></div>
		<div id="Name"></div>
	</div>

	<div id="profile">
	<table id="protable" border="1" width="1300" height="300">
	 <tr align=center>
	  <td rowspan="11" colspan="2" >
	  <div id="gazou">
		画像
	  </div>
	  <input type="file"/></td>

	  <td rowspan=2  colspan=2><font size="12" >吉田　優徳</font></td>

	 </tr>
	 <tr>
	 </tr>
	 <tr>

	  <td width="100" align=right>性別：</td>
	  <td align=left>男</td>
	 </tr>
	 <tr >
	  <td align=right>生年月日：</td>
	  <td align=left>1992年9月20日</td>
	 </tr>
	 <tr>

	  <td align=right>年齢：</td>
	  <td align=left>21歳</td>
	 </tr>
	 <tr >

	  <td align=right>血液型：</td>
	  <td ><SELECT name="blood" id="blood">
		<OPTION value="a">A</OPTION>
		<OPTION value="b">B</OPTION>
		<OPTION value="ab">AB</OPTION>
		<OPTION value="o">O</OPTION>
		</SELECT>型<br></td>
	 </tr>
	 <tr>

	  <td align=right>在社歴：</td>
	  <td>？年</td>
	 </tr>
	 <tr >

	  <td align=right>連絡先：</td>
	  <td><input type="telephone"/></td>
	 </tr>
	 <tr >

	  <td align=right>E-mail：</td>
	  <td><INPUT type="email" name="mail">
	<SELECT name="Kgaisya" id="Kgaisya">
	<OPTION value="D">@docomo.ne.jp</OPTION>
	<OPTION value="S">@softbank.ne.jp</OPTION>
	<OPTION value="A">@au.ne.jp</OPTION>
	<OPTION value="Y">@yahoo.co.jp</OPTION>
	<Option value="G">@gmail.com</Option>

	</SELECT>
	</FORM></td>
	 </tr>

	 <tr >
	  <td align=right>所属部署：</td>
	  <td>代表取締役</td>
	 </tr>
	 <tr >
	  <td align=right>役職：</td>
	  <td>社長</td>
	 </tr>

	 <tr>
	 <td width="150" align=right>言語：</td>
	 <td colspan=3><FORM name="koktoba">
	<INPUT type="checkbox" name="gengo" value="jap" checked>日本語
	<INPUT type="checkbox" name="gengo" value="chi">中国語
	<INPUT type="checkbox" name="gengo" value="ame">英語
	<INPUT type="checkbox" name="gengo" value="fra">フランス語
	<INPUT type="checkbox" name="gengo" value="tai">タイ語
	</FORM></td>
	 </tr>

	 <tr>
	 <td width=150 align=right>プログラム言語：</td>
	 <td colspan=3><FORM name="progen" id="progen">
	<INPUT type="checkbox" name="progen" value="html" >HTML
	<INPUT type="checkbox" name="progen" value="html5" >HTML5
	<INPUT type="checkbox" name="progen" value="Jquery" >JQuery
	<INPUT type="checkbox" name="progen" value="java">Java
	<INPUT type="checkbox" name="progen" value="js" >Java Script
	<INPUT type="checkbox" name="progen" value="LinuX">LinuX
	<INPUT type="checkbox" name="progen" value="COB" >COBOL <BR>
	<INPUT type="checkbox" name="progen" value="C">C
	<INPUT type="checkbox" name="progen" value="C++" >C++
	<INPUT type="checkbox" name="progen" value="C#" >C#
	<INPUT type="checkbox" name="progen" value="Perl" >Perl
	<INPUT type="checkbox" name="progen" value="Python" >Python
	<INPUT type="checkbox" name="progen" value="Ruby" >Ruby
	<INPUT type="checkbox" name="progen" value="Scala" >Scala

	</FORM></td>
	 </tr>

	 <tr>
	 <td width=150 align=right>取得資格：</td>
	 <td colspan=3><FORM name="sikaku" id="sikaku">
	<INPUT type="checkbox" name="sikaku" value="">ITパスポート
	<INPUT type="checkbox" name="sikaku" value="">基本情報技術者試験
	<INPUT type="checkbox" name="sikaku" value="">応用情報技術者試験
	<INPUT type="checkbox" name="sikaku" value="">プロジェクトマネージャ試験
	<INPUT type="checkbox" name="sikaku" value="">情報セキュリティスペシャリスト試験<BR>
	<INPUT type="checkbox" name="sikaku" value="">組み込みソフトウェア技術者試験
	<INPUT type="checkbox" name="sikaku" value="">ITサービスマネージャ試験
	<INPUT type="checkbox" name="sikaku" value="">システム監査技術者試験
	<INPUT type="checkbox" name="sikaku" value="">PHP技術者試験
	<INPUT type="checkbox" name="sikaku" value="">CISCO技術者認定試験<BR>
	<INPUT type="checkbox" name="sikaku" value="">Sun Javaプログラミング能力検定
	<INPUT type="checkbox" name="sikaku" value="">画像処理エンジニア検定試験

	<INPUT type="checkbox" name="sikaku" value="">LinuX技術者試験(LPIC)
	<SELECT name="LPICLV" id="LPICLV">
	<OPTION name="lv1"value="lv1">LV1</OPTION>
	<OPTION name="lv2"value="lv2">LV2</OPTION>
	<OPTION name="lv3"value="lv3">LV3</OPTION>
	</SELECT></INPUT>

	<INPUT type="checkbox" name="sikaku" value="">UMTP UML モデリング技術者認定試験

	<INPUT type="checkbox" name="sikaku" value="">TOEIC<br>

	<INPUT type="checkbox" name="sikaku" value="">日本漢字能力検定
	<SELECT name="LPICLV" id="LPICLV">
	<OPTION name="1"value="1">1級</OPTION>
	<OPTION name="j1"value="j1">準1級</OPTION>
	<OPTION name="2"value="2">2級</OPTION>
	<OPTION name="j2"value="j2">準2級</OPTION>
	</SELECT></INPUT>

	<INPUT type="checkbox" name="sikaku" value="">日本数学能力検定
	<SELECT name="LPICLV" id="LPICLV">
	<OPTION name="1"value="1">1級</OPTION>
	<OPTION name="j1"value="j1">準1級</OPTION>
	<OPTION name="2"value="2">2級</OPTION>
	<OPTION name="j2"value="j2">準2級</OPTION>
	</SELECT></INPUT>

	<INPUT type="checkbox" name="sikaku" value="">ビジネス実務マナー検定
	<INPUT type="checkbox" name="sikaku" value="">ビジネス文書検定
	<INPUT type="checkbox" name="sikaku" value="">日本語文書能力検定<BR>
	</FORM></td>
	 </tr>

	 <tr>
	 <td width=150 align=right>経歴：</td>
	 <td colspan=3><FORM>
	<SELECT name="year" id="year">
	<OPTION name="H4">平成4</Option>
	<OPTION name="H4">平成5</Option>
	<OPTION name="H4">平成6</Option>
	<OPTION name="H4">平成7</Option>
	<OPTION name="H4">平成8</Option>
	<OPTION name="H4">平成9</Option>
	<OPTION name="H4">平成10</Option>
	<OPTION name="H4">平成11</Option>
	<OPTION name="H4">平成12</Option>
	<OPTION name="H4">平成13</Option>
	<OPTION name="H4">平成14</Option>
	<OPTION name="H4">平成15</Option>
	<OPTION name="H4">平成16</Option>
	<OPTION name="H4">平成17</Option>
	<OPTION name="H4">平成18</Option>
	<OPTION name="H4">平成19</Option>
	<OPTION name="H4">平成20</Option>
	<OPTION name="H4">平成21</Option>
	<OPTION name="H4">平成22</Option>
	<OPTION name="H4">平成23</Option>
	<OPTION name="H4">平成24</Option>
	<OPTION name="H4">平成25</Option>
	<OPTION name="H4">平成26</Option>
	</SELECT>年
	<SELECT name="tuki" id="tuki">
	<OPTION name="" value="">1</Option>
	<OPTION name="" value="">2</Option>
	<OPTION name="" value="">3</Option>
	<OPTION name="" value="">4</Option>
	<OPTION name="" value="">5</Option>
	<OPTION name="" value="">6</Option>
	<OPTION name="" value="">7</Option>
	<OPTION name="" value="">8</Option>
	<OPTION name="" value="">9</Option>
	<OPTION name="" value="">10</Option>
	<OPTION name="" value="">11</Option>
	<OPTION name="" value="">12</Option>
	</SELECT>月　経歴：<INPUT type="text" name="keireki" size="85">
	<input type="submit" id="clear" value="追加"/>
			<input type="submit" id="tuika" value="削除"/>
	<BR>
	<table id="keireki" border="1" width="830">
		 <tr style="background:pink">
	        <th align="center" width="75">年</th>
	        <th align="center" width="75">月</th>
	        <th align="center" width="680">経歴</th>
	    </tr>
	    <tr>
	    	<th>平成26年</th>
	    	<th align="center">4月</th>
	    	<th>本社入社</th>
	    </tr>

	</table><BR>

	</FORM></td>
	 </tr>

	 <tr>
	 <td width=150 align=right>自由欄</td>
	 <td colspan=3>
		<textarea cols="100" rows="10">

		</textarea>
		</td>
	 </tr>
	 <tr>
	 <td colspan="4" align=right>
	 <input type="submit"  id="prev" style="WIDTH: 70px; HEIGHT: 30px" value="プレビュー" onClick="goPreviewProfileServlet();">
	 </td>
	 </tr>
	</table>

	</div>
</form>
</body>

</html>