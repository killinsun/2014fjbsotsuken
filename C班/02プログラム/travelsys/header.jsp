<%@page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@page import="jp.ac.fjb.sotuken.bean.UserBean" %>
<%
	String name="ログイン";
	UserBean loginUser = (UserBean)session.getAttribute("LOGIN_USER");
	if(loginUser!=null){name=loginUser.getUserName();};

%>
<div id="header">

<div id="left">
<img src="images/rogo01.jpg">
</div><!-- left end -->

<div id="right">
<p><span class="bold"><a href="<%=request.getContextPath() %>/
<% if(name.equals("ログイン")){ %>
LoginServlet
<% }else{ %>
UserMenuServlet
<% } %>
"><%=name %></a></span></p>
<a href="dammy.jsp">お問い合わせ</a>
<% if(!name.equals("ログイン")){ %>
	&frasl;<a href="/travelsys/LogoutServlet">ログアウト</a>

<% } %>
</div><!-- right end -->

</div><!-- header end -->
