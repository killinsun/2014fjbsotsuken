<%@page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@page import="java.util.ArrayList"%>
<%@page import="jp.ac.fjb.Sotuken.bean.groupChatBean"%>

<%
	ArrayList<groupChatBean> list = (ArrayList) session
			.getAttribute("CHAT_SELECT");
%>

<!DOCTYPE html>
<!--009チャット画面この画面は別画面で開くので、cssはひとつだけ-->
<html>
<head>
<meta charset="UTF-8">
<meta name="keywords" content="">
<meta name="description" content="">
<link rel="stylesheet" href="stylesheet/009Chat.css" type="text/css" />
<script type="text/javascript" src="js/jquery-1.10.2.min.js"></script>
<script type="text/javascript" src="js/chat.js"></script>


<title>009チャット画面</title>
</head>

<body>
	<div id="main">
		<div id="chat" style="overflow: scroll; height: 400px;">
			<table>
				<%
					for (int i = 0; i < list.size(); i++) {
						groupChatBean group = list.get(i);
				%>
				<%
					if (group.getStampID() == null) {
				%>
				<tr>
					<td class="left"><img src="<%=group.getUserGazou()%>"
						width="75" height="75" alt="ユーザアイコン" /></td>
					<td class="right">
						<h4><%=group.getUserName()%></h4>
						<p><%=group.getMessage()%></p></td>
				</tr>

				<%
					} else {
				%>
				<tr>
					<td class="left"><img src="<%=group.getUserGazou()%>"
						width="75" height="75" alt="ユーザアイコン" /></td>
					<td class="right">
						<h4><%=group.getUserName()%></h4>
						<p>
							<img src="<%=group.getStampGazou()%>" width="200" height="200" />
						</p></td>
				</tr>

				<%
					}
				%>

				<%
					}
				%>


			</table>
		</div>

		<form action="/Sotuken/groupChatServlet">
			<div id="submit">
				<table>
					<tr>
						<td>
							<div id="post">
								<input type="submit" id="sousin" value="送信">
							</div>
							<div id="tools">
								<!-- <input type="button"  id="gazou" value="ファイルの送信">-->
								<input type="button" id="stamp" value="スタンプ"   onClick="location.href='/Sotuken/groupChatServlet?progId=1'">
							</div></td><!-- onclick="stampOpen()" -->
					</tr>
					<tr>
						<td><textarea id="chatTextArea" name="message_in"
								placeholder="入力してください。"></textarea>
						</td>
					</tr>
				</table>
				<input type="hidden" id="progId" name="progId">
			</div>
		</form>
	</div>
</body>
</html>
