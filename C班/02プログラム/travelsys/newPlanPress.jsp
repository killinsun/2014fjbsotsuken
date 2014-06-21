<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@page import="java.util.ArrayList"%>
<%@page import="jp.ac.fjb.sotuken.bean.KenBean"%>
<%@page import="jp.ac.fjb.sotuken.bean.KankouchiBean"%>
<%@page import="jp.ac.fjb.sotuken.bean.StationBean"%>
<%@page import="jp.ac.fjb.sotuken.bean.HotelBean"%>
<%
	// 掲示板一覧データ
	ArrayList<KenBean> kenList = (ArrayList) session.getAttribute("KEN");
	ArrayList<KankouchiBean> kankochiList = (ArrayList) session.getAttribute("KANKOCHI");
	ArrayList<StationBean> stationList = (ArrayList) session.getAttribute("STATION");
	ArrayList<HotelBean> hotelList = (ArrayList) session.getAttribute("HOTEL");
%>
<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<%-- ヘッドの挿入 --%>
<%@include file="head.jsp"%>
<link href="./css/planPressStyle.css" rel="stylesheet" type="text/css" />
<script type="text/javascript" src="./script/newPlan.js"></script>
<title>新規プラン投稿-FJBマラベル-</title>
</head>
<body>

	<%-- ヘッダーの挿入 --%>
	<%@include file="header.jsp"%>

	<div id="wrapper">

		<%-- メニューの挿入 --%>
		<%@include file="menu.jsp"%>

		<div id="contents">
			<!-- ここから内容編集 -->
			<h3>旅行プランを投稿する</h3>
			<form id="planForm" method="POST" enctype="multipart/form-data" action="<%=request.getContextPath()%>/UploadFileServlet">
				<table border="1">
					<tr>
						<td class="label">投稿者名：</td>
						<td><input type="text" name="name" size="35" maxlength="15" required>
						</td>
					</tr>
					<tr>
						<td class="label">県名：</td>
						<td><select id="todofuken" name="todofuken" onChange="setChiiki(this[this.selectedIndex].value)" required>
								<option value="" selected="selected" disabled>▼県名を選択してください</option>
								<%
									for (int i = 0; i < kenList.size(); i++) {
																KenBean allKenList = kenList.get(i);
								%>
								<option value="<%=allKenList.getKenName()%>"><%=allKenList.getKenName()%></option>
								<%
									}
								%>
						</select></td>
					</tr>
					<tr>
						<td class="label">地域：</td>
						<td><input type="text" name="chiiki" id="chiiki" readonly />
						</td>
					</tr>
					<tr>
						<td class="label">観光地：</td>
						<td><select id="kankochi" name="kankochi" required>
								<option value="" selected="selected" disabled>▼観光地を選択してください</option>
								<%
									for (int j = 0; j < kankochiList.size(); j++) {
																KankouchiBean allKankochiList = kankochiList.get(j);
								%>
								<option value="<%=allKankochiList.getKankochiId()%>"><%=allKankochiList.getKankochiName()%></option>
								<%
									}
								%>
						</select></td>
					</tr>
					<tr>
						<td class="label">プラン名：</td>
						<td><input type="text" name="planName" size="35" maxlength="15" required>
						</td>
					</tr>
					<tr>
						<td class="label">おススメ予約期間：</td>
						<td><input type="date" name="datestart" required>&nbsp;&#xFF5E;&nbsp;<input
							type="date" name="dateremit" required>
						</td>
					</tr>
					<tr>
						<td class="label">人数：</td>
						<td><input type="number" name="people" size="4" max="999" min="1" required>名</td>
					</tr>
					<tr>
						<td class="label">紹介文：<br />(150文字まで)</td>
						<td><textarea name="message" rows="10" cols="50"
								maxlength="150" required></textarea>
						</td>
					</tr>
					<tr>
						<td class="label">宿泊先：</td>
						<td><select id="hotel" name="hotel" required>
								<option value="" selected="selected" disabled>▼宿泊先を選択してください</option>
								<%
									for (int k = 0; k < hotelList.size(); k++) {
																HotelBean allhotelList = hotelList.get(k);
								%>
								<option value="<%=allhotelList.getHotelId()%>"><%=allhotelList.getHotelName()%></option>
								<%
									}
								%>
						</select></td>
					</tr>
					<tr>
						<td class="label">宿泊日数：</td>
						<td><select id="syukuhaku" name="syukuhakuNum" required>
								<option value="" selected="selected" disabled>▼宿泊日数を選択してください</option>
								<option value="1">一泊</option>
								<option value="2">二泊</option>
								<option value="3">三泊</option>
								<option value="4">四泊</option>
								<option value="5">五泊</option>
								<option value="0">日帰り</option>
						</select></td>
					</tr>
					<tr>
						<td class="label">金額：</td>
						<td>&yen;<input type="number" name="price" size="7" max="99999" min="0" required>
						</td>
					</tr>
					<tr>
						<td class="label">出発地点：</td>
						<td><select id="startstation" name="startstation"  required>
								<option value="" selected="selected" disabled>▼出発駅を選択してください</option>
								<%
									for (int s = 0; s < stationList.size(); s++) {
										StationBean allstationList = stationList.get(s);
								%>
								<option value="<%=allstationList.getStationId()%>"><%=allstationList.getStationname()%></option>
								<%
									}
								%>
						</select>
						</td>
					</tr>
					<tr>
						<td class="label">到着地点：</td>
						<td><select id="arrivestation" name="arrivestation"  required>
								<option value="" selected="selected" disabled>▼出発駅を選択してください</option>
								<%
									for (int s = 0; s < stationList.size(); s++) {
										StationBean allstationList = stationList.get(s);
								%>
								<option value="<%=allstationList.getStationId()%>"><%=allstationList.getStationname()%></option>
								<%
									}
								%>
						</select>
					</tr>

					<tr>
						<td class="label">イメージ画像：</td>
						<td><input type="file" name="imagefile" maxlength="50">
						</td>
					</tr>
					<tr>
						<td class="label">検索キーワード：</td>
						<td><input type="text" name="keyword" size="55" maxlength="15" required>
						</td>
					</tr>
				</table>
				<div id="button">
					<input type="submit" value="投稿" id="sendPlanBtn" class="btnPadding">
					<input type="reset" class="btnPadding">
				</div>
			</form>

		</div>
		<!-- contents end　ここまで編集 -->

	</div>
	<!-- wrapper end -->

	<%-- フッターの挿入 --%>
	<%@include file="footer.jsp"%>

</body>
</html>
