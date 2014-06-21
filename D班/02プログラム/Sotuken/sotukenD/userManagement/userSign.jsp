<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml">
<%@ page contentType="text/html; charset=UTF-8"%>
<%@ page pageEncoding="UTF-8"%>
<%@ page import="jp.ac.fjb.sotukenD.bean.UserSignBean"%>
<%@ page import="jp.ac.fjb.sotukenD.bean.LoginFormBeans"%>
<%
	LoginFormBeans loginBean = (LoginFormBeans) session
			.getAttribute("LOGIN_USER");
%>
<%
	UserSignBean menteUser = (UserSignBean) session
			.getAttribute("SIGN_USER");
%>
<script type="text/javascript">
function FormCheck() {

	// 未入力チェック
	var val = document.getElementsByName("idS")[0];
	if ( jsLTrim( val.value ).length == 0 ) {
		alert( "入力されていない項目があります");
		val.focus();
		return false;
	}
	// 入力値チェック
	if ( !val.value.match( /[0-9]/) ) {
		alert( "入力値が間違っています");
		val.focus();
		return false;
	}
	// 未入力チェック
	var val = document.getElementsByName("passS")[0];
	if ( jsTrim( val.value ).length == 0 ) {
		alert( "入力されていない項目があります" );
		val.focus();
		return false;
	}
	// 入力値チェック
	var val = document.getElementsByName("passS")[0];
	if ( !val.value.match( /^([a-z0-9])/ ) ) {
		alert( "入力値が間違っています" );
		val.focus();
		return false;
	}
	// 未入力チェック
	var val = document.getElementsByName("nameS")[0];
	if ( jsTrim( val.value ).length == 0 ) {
		alert( "入力されていない項目があります" );
		val.focus();
		return false;
	}
	var val = document.getElementsByName("huriS")[0];
	if ( jsTrim( val.value ).length == 0 ) {
		alert( "入力されていない項目があります" );
		val.focus();
		return false;
	}
	// 入力値チェック
	var val = document.getElementsByName("huriS")[0];
	if ( !val.value.match(/^[ァ-ン\s]*$/) ) {
		alert( "入力値が間違っています" );
		val.focus();
		return false;
	}
	var val = document.getElementsByName("yyS")[0];
	if ( jsTrim( val.value ).length == 0 ) {
		alert( "入力されていない項目があります" );
		val.focus();
		return false;
	}
	var val = document.getElementsByName("yyS")[0];
	if ( !val.value.match( /^([0-9])/ ) ) {
		alert( "入力値が間違っています" );
		val.focus();
		return false;
	}
	var val = document.getElementsByName("mmS")[0];
	if ( jsTrim( val.value ).length == 0 ) {
		alert( "入力されていない項目があります" );
		val.focus();
		return false;
	}
	var val = document.getElementsByName("mmS")[0];
	if ( !val.value.match( /^([0-9])/ ) ) {
		alert( "入力値が間違っています" );
		val.focus();
		return false;
	}
	var val = document.getElementsByName("ddS")[0];
	if ( jsTrim( val.value ).length == 0 ) {
		alert( "入力されていない項目があります" );
		val.focus();
		return false;
	}
	var val = document.getElementsByName("ddS")[0];
	if ( !val.value.match( /^([0-9])/ ) ) {
		alert( "入力値が間違っています" );
		val.focus();
		return false;
	}
	var val = document.getElementsByName("homeS")[0];
	if ( jsTrim( val.value ).length == 0 ) {
		alert( "入力されていない項目があります" );
		val.focus();
		return false;
	}
	var val = document.getElementsByName("tellS")[0];
	if ( jsTrim( val.value ).length == 0 ) {
		alert( "入力されていない項目があります" );
		val.focus();
		return false;
	}
	var val = document.getElementsByName("tellS")[0];
	if ( !val.value.match( /^0[0-9]{1,2}-[0-9]{4,5}-[0-9]{4}$/ ) ) {
		alert( "入力値が間違っています" );
		val.focus();
		return false;
	}
	var val = document.getElementsByName("mailS")[0];
	if ( jsTrim( val.value ).length == 0 ) {
		alert( "入力されていない項目があります" );
		val.focus();
		return false;
	}
	var val = document.getElementsByName("mailS")[0];
	if ( !val.value.match( /^([a-z0-9_\.\-])+@([a-z0-9_\.\-])+/ ) ) {
		alert( "入力値が間違っています" );
		val.focus();
		return false;
	}

}

//前後スペース削除(全角半角対応)
function jsTrim( val ) {

	var ret = val;

	ret = ret.replace( /^[\s]*/, "" );
	ret = ret.replace( /[\s]*$/, "" );

	return ret;
}

//前スペース削除(全角半角対応)
function jsLTrim( val ) {
	var ret = val;

	ret = ret.replace( /^[\s]*/, "" );

	return ret;
}

//後スペース削除(全角半角対応)
function jsRTrim( val ) {
	var ret = val;

	ret = ret.replace( /^[\s]*/, "" );

	return ret;
}
</script>
<head>
<script src="/sotukenD/js/UserSign.js"></script>
<meta charset="utf-8" />
<title>レイアウトテスト</title>
<link rel="stylesheet" type="text/css" href="/sotukenD/css/style.css" />
<link rel="stylesheet" type="text/css" href="renraku.css" />

</head>
<body>
	<div class="frm">
		<!--header部分-->
		<header id="header">
			<div id="title">ユーザー情報登録</div>
			<div id="account" align="right">
				<div id="name"><%=loginBean.getUserName()%></div>
				<!--ログアウトボタン-->
				<button type="submit" id="logout"
					onclick="location.href='/sotukenD/LogoutServlet'">ログアウト</button>
			</div>
			<!--新着メールは、はたして表示されるのだろうか・・・ -->
			<div>　</div>

		</header>

		<!--ページ移動、ナビゲーション部分-->
		<nav id="nav">

			<iframe src="/sotukenD/mainMenu.jsp" name="mainMenu" Align="left"
				Frameborder="no" Marginheight="0" Width="200"> </iframe>

		</nav>


		<!--作業画面-->
		<section id="mainContent">
			<div id="zentai">

				<table border="0" width="100%" height="15" cellpadding="2"
					cellspacing="1" bgcolor="#002047">
				</table>

				<!--ここから-->

				<form action="/sotukenD/ForUserListServlet" id="form" name="form" onSubmit="return FormCheck()">

					<table border="0" width="100%" cellpadding="2" cellspacing="1"
						bgcolor="#002047">

						<tr bgcolor="#FFFFFF">
							<td width="18%"><font size="2">ユーザーID</font>
							</td>
							<td><input type="text" name="idS" size="15" value=""
								id="idS" placeholder="例：Uxxx" maxlength="4" element.style.imeMode = "disabled";><font size="2"> ※
									管理者:Mxxx 一般:Uxxx</font>
							</td>
						</tr>

						<tr bgcolor="#FFFFFF">

							<td width="18%"><font size="2">パスワード</font>
							</td>
							<td><input type="text" name="passS" size="15" value=""
								id="passS" placeholder="例：xxxxx" maxlength="5" ><font size="2"> ※
									半角英数5文字</font>
							</td>
						</tr>
						<tr bgcolor="#FFFFFF">

							<td width="18%"><font size="2">氏名</font>
							</td>
							<td><input type="text" name="nameS" size="15" value=""
								id="nameS" placeholder="例：船橋 太郎" maxlength="10">
							</td>
						</tr>
						<tr bgcolor="#FFFFFF">

							<td width="18%"><font size="2">フリガナ</font>
							</td>
							<td><input type="text" name="huriS" size="15" value=""
								id="huriS" placeholder="例：フナバシ タロウ" maxlength="15">
							</td>
						</tr>
						<tr bgcolor="#FFFFFF">

							<td width="18%"><font size="2">性別</font>
							</td>
							<td><select name="sexS" id=sexS>
									<option value="男性">男</option>
									<option value="女性">女</option>
							</select>
							</td>
						</tr>
						<tr bgcolor="#FFFFFF">

							<td width="18%"><font size="2">生年月日</font>
							</td>
							<td><input type="text" name="yyS" size="5" value="" id="yyS"
								placeholder="xxxx" maxlength="4"/> 年 <input type="text" name="mmS" size="3"
								value="" id="mmS" placeholder="xx" maxlength="2"/> 月 <input type="text"
								name="ddS" size="3" value="" id="ddS" placeholder="xx" maxlength="2">
								日</td>
						</tr>
						<tr bgcolor="#FFFFFF">

							<td width="18%"><font size="2">住所</font>
							</td>
							<td><input type="text" name="homeS" size="30" value=""
								id="homeS" placeholder="例：xx県xx市xx-xx-xx" maxlength="50">
							</td>
						</tr>
						<tr bgcolor="#FFFFFF">

							<td width="18%"><font size="2">電話番号</font>
							</td>
							<td><input type="text" name="tellS" size="15" value=""
								id="tellS" placeholder="例：xxx-xxxx-xxxx" maxlength="14">
							</td>
						</tr>
						<tr bgcolor="#FFFFFF">

							<td width="18%"><font size="2">メールアドレス</font>
							</td>
							<td><input type="text" name="mailS" size="20" value=""
								id="mailS" placeholder="xxx@xxx.xx.xx" maxlength="30">
							</td>
						</tr>
						<tr bgcolor="#FFFFFF">

							<td width="18%"><font size="2">権限</font>
							</td>
							<td><select name="kenS" id=kenS>
									<option value="0">一般</option>
									<option value="1">管理者</option>
							</select>
							</td>
						</tr>
					</table>
					<!--
					<input type="submit" id="modoruButton"
						style="WIDTH: 80px; HEIGHT: 23px;" value="戻る"
						onClick="goListServlet('0');,">
					-->
					 <input type="submit"
						id="insertButton" style="WIDTH: 80px; HEIGHT: 23px;"
						onClick="goListServlet('1');FormCheck();" value="登録"> <input
						type="hidden" id="progId" name="progId" value="">
				</form>
			</div>
		</section>
	</div>
</body>
</html>
