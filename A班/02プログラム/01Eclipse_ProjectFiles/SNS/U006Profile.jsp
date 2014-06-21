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
	<link rel="StyleSheet" type="text/css" href="css/profile.css" />
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
		<div id="profile_left">
			<div id="myimg"></div>
			<div id="myhistory">

				<table border="1" border-style="dotted" width="320" height="240">
					<tr>
						<th align="center">年</th>
						<th align="center">月</th>
						<th align="center">経歴</th>
					</tr>					<tr>
						<td align="center">平成20年</td>
						<td align="center">4</td>
						<td>□□□株式会社 入社</td>
					</tr>
					<tr>
						<td align="center"></td>
						<td align="center"></td>
						<td>　東京本社 情報システム開発部に配属</td>
					</tr>
					<tr>
						<td align="center"></td>
						<td align="center"></td>
						<td>　○○銀行の△△システム開発を担当</td>
					</tr>
					<tr>
						<td align="center"></td>
						<td align="center"></td>
						<td>　□□□の○○を担当</td>
					</tr>
					<tr>
						<td align="center">平成23年</td>
						<td align="center">4</td>
						<td>★★リーダーに昇格</td>
					</tr>
					<tr>
						<td align="center">平成23年</td>
						<td align="center">11</td>
						<td>東京本社 人材開発部へ異動</td>
					</tr>
					<tr>
						<td align="center"></td>
						<td align="center"></td>
						<td>　新卒採用を担当</td>
					</tr>
					<tr>
						<td align="center">平成25年</td>
						<td align="center">8</td>
						<td>一身上の都合により退職</td>
					</tr>
					<tr>
						<td align="center">平成25年</td>
						<td align="center">9</td>
						<td>株式会社よしだこ～ぽれ～しょん 入社</td>
					</tr>
					<tr>
						<td align="center"></td>
						<td align="center"></td>
						<td>本社 システムエンジニアリング部に配属</td>
					</tr>
					<tr>
						<td align="center">平成25年</td>
						<td align="center">10</td>
						<td>株式会社○○と共同開発プロジェクト参画</td>
					</tr>
					<tr>
						<td align="center"></td>
						<td align="center"></td>
						<td>現在に至る</td>
					</tr>
				</table>
			</div>
		</div>
		<div id="profile_center">

			<table border="1" id="profile_table" width="438" height="478">
				<tr>
					<td rowspan="2" bgcolor="#F0B0B0"><b>ふりがな/名前</b></td>
					<td colspan="3">ふなばし たろう</td>
				</tr>
				<tr>
					<td colspan="3"><font size="3">船橋　太郎</font></td>
				</tr>
				<tr>
					<td bgcolor="#F0B0B0"><b>性別</b></td>
					<td>男</td>
					<td bgcolor="#F0B0B0"><b>血液型</b></td>
					<td>O型</td>
				</tr>
				<tr>
					<td bgcolor="#F0B0B0"><b>生年月日</b></td>
					<td colspan="2">1992年9月20日</td>
					<td>(満　21歳)</td>
				</tr>
				<tr>
					<td bgcolor="#F0B0B0"><b>連絡先</b></td>
					<td>090-xxxx-xxxx</td>
					<td bgcolor="#F0B0B0"><b>e-Mail</b></td>
					<td>t.funabashi@yc.co.jp</td>
				</tr>
				<tr>
					<td bgcolor="#F0B0B0"><b>所属部署</b></td>
					<td>総務部(社員)</td>
					<td bgcolor="#F0B0B0"><b>在社歴</b></td>
					<td>1年</td>
				</tr>
				<tr>
					<td bgcolor="#F0B0B0"><b>言語</b></td>
					<td colspan="3">日本語, 英語, 中国語</td>
				</tr>
				<tr>
					<td bgcolor="#F0B0B0"><b>プログラム言語</b></td>
					<td colspan="3">HTML5, JQuery, Java, Javascript, COBOL, C</td>
				</tr>
				<tr>
					<td rowspan="14" bgcolor="#F0B0B0"><b>取得資格</b></td>
					<td colspan="3" bgcolor="#FFDEAD"><b><i>IT Skills - General</i></b></td>
				</tr>
				<tr>
					<td colspan="3">ITパスポート, 基本情報技術者試験, 応用情報技術者試験</td>
				</tr>
				<tr>
					<td colspan="3" bgcolor="#FFDEAD"><b><i>IT Skills - Programing</i></b></td>
				</tr>
				<tr>
					<td colspan="3">Sun Javaプログラミング能力検定</td>
				</tr>
				<tr>
					<td colspan="3" bgcolor="#FFDEAD"><b><i>IT Skills - Network</i></b></td>
				</tr>
				<tr>
					<td colspan="3">CISCO技術者認定試験</td>
				</tr>
				<tr>
					<td colspan="3" bgcolor="#FFDEAD"><b><i>Design Skills</i></b></td>
				</tr>
				<tr>
					<td colspan="3">UMTP UML モデリング技術者認定試験</td>
				<tr>
					<td colspan="3" bgcolor="#FFDEAD"><b><i>Management Skills</i></b></td>
				</tr>
				<tr>
					<td colspan="3">プロジェクトマネージャ試験</td>
				</tr>
				<tr>
					<td colspan="3" bgcolor="#FFDEAD"><b><i>Business Skills</i></b></td>
				</tr>
				<tr>
					<td colspan="3">ビジネス実務マナー検定, ビジネス文書検定</td>
				</tr>
				<tr>
					<td colspan="3" bgcolor="#FFDEAD"><b><i>Language Skills</i></b></td>
				</tr>
				<tr>
					<td colspan="3">TOEIC</td>
				</tr>
			</table>
		</div>
		<div id="profile_right">
			<table border="1" width="438" height="478" bgcolor="#eeecc6">
				<tr>
					<td valign="top">
					◆ ご挨拶<br />
					2013年9月より、(株)よしだこ 〜ぽれ〜しょんへ入社致しました。<br />
					人事の○○さんとは以前より交流があり、<br />
					この度の中途採用につきましても多大なるご支援・ご助力を頂きました。<br />
					この場を借りて御礼申し上げます。<br />
					<br />
					◆ 業務<br />
					現在は、株式会社○○○との共同開発プロジェクト<br/>
					「△△△△△△」に取り組んでおります。<br />
					担当は×××××で、～～～といった状態で動いております。<br />
					<br />
					<br />
					◆ 趣味<br />
					週末に社内の有志メンバーで硬式テニスをして、汗を流しています。<br />
					現在男女合わせて5名(男3/女2)で、毎回全員が来れるとは限らないので、<br />
					経験者、未経験者問わず参加者をまだまだ募集中です！<br />
					<br />
					業務上のご連絡等に限らず、お気軽にメール/TELにてお知らせください。
					</td>
				</tr>
			</table>
		</div>

	</div>

	<div id="edit">
	<input type="submit" id="editbutton" value="プロフィールを編集する。" onClick="goEditProfileServlet();">
	</div>
</form>

</body>

</html>