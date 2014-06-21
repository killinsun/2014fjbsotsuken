<%@page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>


<!DOCTYPE html>
<!--001トップ画面 -->
<html>
	<head>
		<meta charset="UTF-8">
		<meta name="keywords" content="">
 		<meta name="description" content="">
 		<link rel="stylesheet" href="stylesheet/template/styleSheet.css" type="text/css"/>
 		<link rel="stylesheet" href="stylesheet/template/footer.css" type="text/css"/>
 		<link rel="stylesheet" href="stylesheet/template/form.css" type="text/css"/>
 		<link rel="stylesheet" href="stylesheet/001topStyle.css" type="text/css"/>
		<script>
			function signUp(){

				location.href = "002signUp.jsp";
			}

			function logIn(){
				if(form.userid.value == "") {
					alert("ユーザIDを入力してください");
					return;
				} else if(form.password.value == "") {
					alert("パスワードを入力してください")

				} else {
					//location.href = "004myPage.jsp";
					form.submit();
				}
			}
		</script>
		<title>001トップ画面</title>
	</head>

	<body>
	<% String msg = (String)session.getAttribute("ERROR_LOGIN");
	   if (msg != null) {
		   out.print("<font color='red'>"+msg+"</font>");
		   session.removeAttribute("ERROR_LOGIN");
	   }
	%>
		<form action="/Sotuken/IndexServlet" id="form" method="post">
		<!-- ヘッダー　-->
		<div id="header">
			<div id="wrap_header">
				<a href="001index.html">
					<img id="logo" src="img/logo.png" />
				</a>
			</div>
		</div>
		<!--　メインコンテンツ　-->
		<div id="main">
			<!-- 右側の要素でここにはログインなどのコンテンツが含まれる -->
			<div id="right_contents">
				<!-- ただのスペース現在は何も置かない　 -->
				<div id="space">
					<!--　スペース　-->
				</div>
				<!--　ログイン 　-->
				<div id="login">
			■ID<br />
			<input class="frame" class="text" type="text" name="userid" id="userid" autofocus required/><br />
			■PASSWORD<br />
			<input class="frame" type="password" name="password"  required/><br />
			<input class="button" type="button" value="ログイン" onclick="logIn()" />
			<input class="button" type="button" value="新規登録" onclick="signUp()" />


				</div>
			</div>

			<!-- 左側の要素でここにはSNSの紹介したい部分を書く -->
			<div id="left_contents">
				<img src="img/serverAdd.png" />
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
