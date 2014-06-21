<%@page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<script src="./script/Menu.js"></script>
<%-- ヘッドの挿入 --%>
<%@include file="head.jsp" %>
<link href="./css/planPressStyle.css" rel="stylesheet" type="text/css" />
<link href="./css/siharaigamen.css" rel="stylesheet" type="text/css" />
<title>新規プラン投稿-FJBマラベル-</title>
</head>
<body>

<%-- ヘッダーの挿入 --%>
<%@include file="header.jsp" %>

<div id="wrapper">

<%-- メニューの挿入 --%>
<%@include file="menu.jsp" %>

<div id="contents"><!-- ここから内容編集 -->
<h3>クレジットカード登録</h3>
	<div id="tb">
		<div id="okya">
		クレジットカード情報入力
		</div>
		<p>お客様情報を入力してください</p>
			<table border="1" id="a">
				<tr>
					<th>
					カード会社 <br>
					</th>
					<td>
					<table>
					<tr>
					<td><input type="radio" name="k"　size="40" ></td><td><input type="radio" name="k"　size="40" ></td>
					</tr>
					<tr>
					<td><img src="images/JCB.png"></td><td><img src="images/VISA.png"></td>
					</tr>
					</table>
					</td>
		        </tr>
				<tr>
					<th>
					クレジットカード番号 <br>
					(半角)
					</th>
					<td>
					<input type="text" size="40"><br>
					<span class="small"><p>-(ハイフン)は使用できません<br>
					クレジットカードによって桁数は異なります</p></span>
					</td>
		        </tr>
		        <tr>
					<th>
					カード名義人 <br>
					(半角英字)
					</th>
					<td>
					名<input type="text" size="12">　姓<input type="text" size="12"><br>
					例:　名　Takuma　 姓　Otu
					</td>
		        </tr>
		        <tr>
					<th>
					クレジットカードの <br>
					有効期限(半角数字)
					</th>
					<td>
					<input type="text" size="5">年　<input type="text" size="2">月<br>
					例：　2014年　8月
					</td>
		        </tr>
		    </table>
		    <br>
		    <div id="button">
		    <input type="button" value="戻る" class="btnPadding">　<input type="button" value="次へ" class="btnPadding"><br>
		    </div>
		   　
	</div>
</div><!-- contents end　ここまで編集 -->

</div><!-- wrapper end -->

<%-- フッターの挿入 --%>
<%@include file="footer.jsp" %>

</body>
</html>
