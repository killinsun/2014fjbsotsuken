<%@page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<div id="nav">
<form action="/travelsys/MenuServlet" id="form">
	<ul>
		<li><input type="button" name="home" id="home" value="ホーム"></li>
		<li><input type="button" name="search" id="serch" value="旅行プラン検索"></li></a>
		<li><input type="button" name="makePlan"  id="makePlan" value="旅行を計画"></li>
		<li><input type="button" name="userMenu" id="usermenu" value="ユーザーメニュー"></li>
		<li><input type="button" name="bbs" id="bbs" value="掲示板"></li></a>
		<input type="hidden" id="progId" name="progId">
	</ul>
</form>
</div><!-- nav end -->