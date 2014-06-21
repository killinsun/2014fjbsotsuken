<%@page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@page import="java.util.ArrayList"%>
<%@page import="jp.ac.fjb.Sotuken.bean.stampBean"%>

<%
	ArrayList<stampBean> list = (ArrayList) session
			.getAttribute("STAMP_SELECT");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="keywords" content="">
<meta name="description" content="">
<link rel="stylesheet" href="stylesheet/stamp.css" type="text/css" />

<title>スタンプ選択画面</title>

<script>

	function stamp(id) {
		document.getElementById("stamp_Id").value = id;
		document.getElementById("progId").value = 2;

	}

</script>
<!-- window.close();
		window.opener.location.reload(); -->

</head>
<body>
	<div id="mein" >
		<!-- for文を書く予定地 -->

		<form action="/Sotuken/groupChatServlet">

			<%
				for (int i = 0; i < list.size(); i++) {
					stampBean stampList = list.get(i);
			%>

			<!-- クリックしたら閉じる クリックしたらサーブレッドに値を渡す -->
			<input type="image" id="stampId"
				src="<%=stampList.getStampGazou()%>" width="180" height="180" onClick="stamp('<%=stampList.getStampID()%>')">
				<input type="hidden" name="stamp_Id" id="stamp_Id">
				<input type="hidden" name="progId" id="progId">

			<%
				}
			%>

		</form>

	</div>
</body>
</html>
