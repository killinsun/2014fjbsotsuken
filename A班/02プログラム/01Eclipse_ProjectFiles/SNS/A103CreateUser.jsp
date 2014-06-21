<%@page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml">

<head>
	<meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
	<link rel="StyleSheet" type="text/css" href="css/createUser.css" />
	<script type="text/javascript" src="js/screenTransition.js"></script>
    <title>ConVertion</title>
</head>

<body>
	<form id="form" name="form" action="">
	<div id="Logo">
		<img src="img/logo/logo.png" height="100" width="200" alt="タイトルロゴ">
	</div>
	<div id="a">
		<font size="5">新規登録</font>
	</div>
	 <table id="st" border="1" width="1000">
                <tr style="background:pink">
                    <th width="200">社員ID</th>
                    <th align="left"><input type="text"/></th>
                </tr>
                <tr style="background:pink">
                    <th width="200">名前</th>
                    <th align="left"><input type="text" /></th>
                </tr>
                <tr style="background:pink">
                	<th>性別</th>
                <th align="left"><input type="radio" name="hyouka" value="good" checked="checked">男
					<input type="radio" name="hyouka" value="bad">女
				</th>
                </tr>
                <tr style="background:pink">
                    <th width="200">PW</th>
                    <th align="left"><input type="text"/></th>
                </tr>
                <tr style="background:pink">
                    <th width="200">再確認PW</th>
                    <th align="left"><input type="password"></th>
                </tr>
                <tr style="background:pink">
                    <th width="200">入社年月日</th>
                    <th align="left">
                    <SELECT name="nyusyaYear" id="year">
					<OPTION value="1992">平成04年</OPTION>
					<OPTION value="1993">平成05年</OPTION>
					<OPTION value="1994">平成06年</OPTION>
					<OPTION value="1995">平成07年</OPTION>
					<OPTION value="1996">平成08年</OPTION>
					<OPTION value="1997">平成09年</OPTION>
					</SELECT>年
					<SELECT name="nyusyaManth" id="manth">
					<OPTION value="1">1月</OPTION>
					<OPTION value="2">2月</OPTION>
					<OPTION value="3">3月</OPTION>
					<OPTION value="4">4月</OPTION>
					<OPTION value="5">5月</OPTION>
					<OPTION value="6">6月</OPTION>
					</SELECT>月
                    </th>
                </tr>
                <tr style="background:pink">
                    <th width="200">所属部：役職</th>
                 <th align="left">部署：<SELECT name="busho" id="busho">
					<OPTION value="soumu">総務部</OPTION>
					<OPTION value="jinji">人事部</OPTION>
					<OPTION value="keiri">経理部</OPTION>
					<OPTION value="eigyou">営業部</OPTION>
					<OPTION value="kaihatu">開発部</OPTION>
					<OPTION value="jigyou">事業部</OPTION>
					<OPTION value="daihyou">代表取締役</OPTION>
					</SELECT>

					役職：<SELECT name="thii" id="thii">
					<OPTION value="shyain">社員</OPTION>
					<OPTION value="kakari">係長</OPTION>
					<OPTION value="katyou">課長</OPTION>
					<OPTION value="jityou">次長</OPTION>
					<OPTION value="butyou">部長</OPTION>
					<OPTION value="kyokutyou">局長</OPTION>
					<OPTION value="syatyou">社長</OPTION>
					</SELECT>
					</th>
                </tr>

	</table>
	<div id="submit">
	<input type="submit" value="クリア"/><input type="submit" value="登録完了" onclick="alert('登録完了致しました。')"/><input type="submit"  id="Button" style="WIDTH: 150px; HEIGHT: 24px" value="ユーザ一覧に戻る" onClick="goUserListServlet();">

	</div>
</form>
</body>
</html>