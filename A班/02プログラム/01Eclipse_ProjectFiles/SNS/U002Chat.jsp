<%@page import="java.util.ArrayList" %>
<%@page import="jp.ac.fjb.sns.bean.ChatBean" %>
<%@page import="jp.ac.fjb.sns.bean.EventBean" %>
<% ArrayList<ChatBean> cList = (ArrayList)session.getAttribute("HAVING_CHAT_LIST"); %>
<% ArrayList<EventBean> eList = (ArrayList)session.getAttribute("HAVING_EVENT_LIST"); %>
<%String roomCheck = (String)session.getAttribute("ROOM_ID"); %>
<div id="CD">
<table id="ranking" width="530" border="1">
	<%if (roomCheck == "E") { %>
	<tr>
		<td width="75px" align="center" >DATE</td>
		<td width="200px" align="center" >TITLE</td>
	</tr>
		<%for (int i=0; i<eList.size(); i++){
	              EventBean list = eList.get(i);
		%>
				<tr>
					<td><%=list.getDate() %></td>
					<td><%=list.getTitle()%></td>
				</tr>
		<%}%>
	<% } else { %>
	<tr>
		<td width="75px" align="center" >NAME</td>
		<td width="200px" align="center" >MESSAGE</td>
	</tr>
		<%for (int i=0; i<cList.size(); i++){
	              ChatBean list = cList.get(i);
		%>
				<tr>
					<td><%=list.getUserName() %></td>
					<td><%=list.getChat()%></td>
				</tr>
		<%}%>

	<%} %>
</table>
</div>
