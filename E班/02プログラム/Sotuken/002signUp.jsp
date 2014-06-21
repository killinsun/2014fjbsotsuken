<%@page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>

<!DOCTYPE html>
<!--002ユーザ登録画面-->
<html>
	<head>
		<meta charset="UTF-8">
		<meta name="keywords" content="">
 		<meta name="description" content="">
 		<link rel="stylesheet" href="stylesheet/template/styleSheet.css" type="text/css"/>
 		<link rel="stylesheet" href="stylesheet/template/footer.css" type="text/css"/>
 		<link rel="stylesheet" href="stylesheet/template/form.css" type="text/css"/>
 		<link rel="stylesheet" href="stylesheet/002signUp.css" type="text/css"/>
	<script src="js/Singn.js"></script>

		<title>002ユーザ登録画面</title>
	</head>

	<body>
		<form action="/Sotuken/SendEmailCompletionServlet" method="get" id="form" name="form" >
		<!--　ヘッダー　-->
		<div id="header">
			<div id="wrap_header">
				<a href="001index.html" onClick="disp(); return false;">
					<img id="logo" src="img/logo.png" />
				</a>
			</div>
		</div>
		<!--メインコンテンツ-->
		<div id="main">
			<div id="top">
				<h1>新規登録</h1>
				<h3>下記のフォームに情報を全て入力してください</h3>
			</div>
			<!--　テーブル　 -->
			<table>
				<tr>
					<td class="left_cell">
						お名前：
					</td>
					<td class="right_cell">
						<input class="frametext" type="text" name="lastName" id="lastName"  autofocus required/ placeholder="姓と名を全角スペースで区切ってください。" ><br />
					</td>
				</tr>

				<tr>
					<td class="left_cell">
						フリガナ：
					</td>
					<td class="right_cell">
						<input class="frametext" type="text" name="lastName_kana"  id="lastName_kana"  required  placeholder="姓と名を全角スペースで区切ってください。" ><br />
					</td>
				</tr>

				<tr>
					<td class="left_cell">
						性別：
					</td>
					<td class="right_cell">
						<select class="framecell" name="gender" required>
							<option value="S0">男</option>
							<option value="S1">女</option>
						</select>
					</td>
				</tr>

				<tr>
					<td class="left_cell">
						生年月日：
					</td>
					<td class="right_cell">
						<input class="frame text" type="text" pattern="[0-9]{8}$" placeholder="例:19000131" name="birthday" maxlength="8" id="birthday" required />
					</td>
				</tr>

				<tr>
					<td class="left_cell">
						ID：
					</td>
					<td class="right_cell">
						<input class="frame text" type="text" pattern="[a-z0-9]+$" placeholder="最大10文字" name="memberId" maxlength="10"  id="memberId" required />
					</td>
				</tr>

				<tr>
					<td class="left_cell">
						PASSWORD：
					</td>
					<td class="right_cell">
						<input class="frame password" type="password" placeholder="パスワードを入力" name="passWord" id="passWord" maxlength="100" required />
					</td>
				</tr>

				<tr>
					<td class="left_cell">
						PASSWORD：
					</td>
					<td class="right_cell">
						<input class="frame password" type="password" placeholder="パスワードを再度入力" maxlength="100"  id="passWord2"  required />
						<span id="retype">[再入力]</span>
					</td>
				</tr>

				<tr>
					<td class="left_cell">
						メールアドレス：
					</td>
					<td class="right_cell">
						<input class="frame" type="email" name="emailAddress" id="emailAddress" required />
					</td>
				</tr>

				<tr>
					<td class="left_cell">
						郵便番号：
					</td>
					<td class="right_cell">
						<input class="frame text" type="text" name="postalCode" pattern="[0-9]{7}$" placeholder="ハイフン無し7文字" maxlength="7"  id="postalCode" required />
					</td>
				</tr>

				<tr>
					<td class="left_cell">
						出身地：
					</td>
					<td class="right_cell">
						<input class="frame" id="address" type="text" name="address" id="address"  required />
					</td>
				</tr>

				<tr>
					<td class="left_cell lastCell">
						部署：
					</td>
					<td class="right_cell lastCell">
						<select class="frame" name="post" required>
							<option value="B001">ここは管理者が予め登録</option>
							<option value="B002">ここは管理者が予め登録</option>
						</select>
					</td>
				</tr>
			</table>
			<div id="submit_area">
				<input id="submit1" class="frame button" type=button value="同意して送信"  />
			</div>
		</div>

		<!-- フッター -->
		<div id="footer">
			<div id="wrap_footer">
				<!-- フッターはここに書く　 -->

			</div>
		</div>

		</form>
	</body>
</html>
