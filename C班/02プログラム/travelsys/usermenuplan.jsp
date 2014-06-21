<%@page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<script src="./script/Menu.js"></script>
<%-- ヘッドの挿入 --%>
<%@include file="head.jsp" %>
<link href="./css/planPressStyle.css" rel="stylesheet" type="text/css" />
<link href="./css/toukou.css" rel="stylesheet" type="text/css" />
<title>新規プラン投稿-FJBマラベル-</title>
</head>
<body>

<%-- ヘッダーの挿入 --%>
<%@include file="header.jsp" %>

<div id="wrapper">

<%-- メニューの挿入 --%>
<%@include file="menu.jsp" %>

<div id="contents"><!-- ここから内容編集 -->
<h3>旅行プラン投稿</h3>
<div id="comentsu">
	<div id="mjk">
			<h1>プラン情報を入力してください</h1>
	</div>
	<form id="form">
		<div id="text">
			お名前:<br>
			　<input type="text"><br>
		</div>
		<div id="radio">
				 <legend>旅行プラン選択</legend>
		            <br>
			<select name="example1">
			<option value="サンプル1">旅行サンプル1</option>
			<option value="サンプル2">旅行サンプル2</option>
			<option value="サンプル3">旅行のサンプル3</option>
			<option value="サンプル4">旅行のサンプル4</option>
			<option value="サンプル5">旅行のサンプル5</option>
			</select>
		</div>
		<div id="number">
		<br>
		プランイメージ画像：<br>
		<input type="file" name="fileName" size="60">
		</div>
		<div id="textarea">
			コメント:<br>
			　<textarea name="MSG" cols=40 rows=7>
			</textarea>
		</div>
		<div id="submit">
			<input type=submit value="投稿する">
		</div>
	</form>
</div>
</div><!-- contents end　ここまで編集 -->

</div><!-- wrapper end -->

<%-- フッターの挿入 --%>
<%@include file="footer.jsp" %>

</body>
</html>
