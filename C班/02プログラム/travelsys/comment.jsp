<%@page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<%-- ヘッドの挿入 --%>
<%@include file="head.jsp"%>
<link href="./css/coment.css" rel="stylesheet" type="text/css" />
<title>コメント入力-FJBマラベル-</title>
</head>
<body>

	<%-- ヘッダーの挿入 --%>
	<%@include file="header.jsp"%>

	<div id="wrapper">

		<%-- メニューの挿入 --%>
		<%@include file="menu.jsp"%>

		<div id="contents">
			<!-- ここから内容編集 -->
			<h3>コメント送信</h3>
			<div id="comentsu">
				<div id="mjk">
					<h1>コメントを入力してください</h1>
				</div>
				<form id="form"
					action="<%=request.getContextPath()%>/CommentServlet"  method="post" >
					<div id="text">
						お名前:<br> &nbsp;<input type="text" name="comName" required><br>
					</div>
					<% if(!name.equals("ログイン")){ %>
					<div id="radio">
						<input type="radio" name="starSend" value="send">評価を送信する<br>
						<input type="radio" name="starSend" value="notSend" checked>評価を送信しない
					</div>
					<div id="number">
						評価(1&#xFF5E;5)<br> <input type="number" size="1" min="1" max="5" name="comStar">
					</div>
					<% }else{ %>
					<div id="number">
					<span id="small">※評価はログインしないと送信できません</span>
					</div>
					<% } %>
					<div id="textarea">
						コメント:<br> &nbsp;
						<textarea name="comMessage" cols="40" rows="7" required></textarea>
					</div>
					<div id="submit">
						<input type="submit" value="送信" class="btnPadding"> <input
							type="reset" value="リセット" class="btnPadding">
					</div>
				</form>
			</div>

		</div>
		<!-- contents end ここまで編集 -->

	</div>
	<!-- wrapper end -->

	<%-- フッターの挿入 --%>
	<%@include file="footer.jsp"%>

</body>
</html>
