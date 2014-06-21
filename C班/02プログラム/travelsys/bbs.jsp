<%@page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@page import="java.util.ArrayList"%>
<%@page import="jp.ac.fjb.sotuken.bean.BbsBean"%>
<%@page import="jp.ac.fjb.sotuken.bean.CommentBean"%>
<%
	// 掲示板一覧データ
	ArrayList<BbsBean> list = (ArrayList) session.getAttribute("BBS");
	//コメント一覧データ
	ArrayList<CommentBean> cmtList = (ArrayList) session.getAttribute("COMMENT");

	//startCntとendCntの初期設定
	BbsBean pageCnt = new BbsBean();
	pageCnt.setPageEnd(Integer.parseInt(session.getAttribute("PAGEEND").toString()));
	pageCnt.setStartCnt(Integer.parseInt(session.getAttribute("STARTCNT").toString()));
	pageCnt.setEndCnt(Integer.parseInt(session.getAttribute("ENDCNT").toString()));

	int pageEnd = pageCnt.getPageEnd();
	int startCnt = pageCnt.getStartCnt();
	int endCnt = pageCnt.getEndCnt();

	int pg = Integer.parseInt(session.getAttribute("PAGE").toString());
%>

<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<%-- ヘッドの挿入 --%>
<%@include file="head.jsp"%>
<link href="./css/bbsStyle.css" rel="stylesheet" type="text/css" />
<script type="text/javascript" src="./script/bbsScript.js"></script>
<title>旅行プラン掲示板-FJBマラベル-</title>
</head>
<body onunload="init()">

	<%-- ヘッダーの挿入 --%>
	<%@include file="header.jsp"%>

	<div id="wrapper">

		<%-- メニューの挿入 --%>
		<%@include file="menu.jsp"%>

		<div id="contents">
			<!-- ここから内容編集 -->
			<h3>旅行プラン掲示板</h3>

			<div id="groups">
				<table>
					<tr>
						<td><a
							href="<%=request.getContextPath()%>/BbsServlet?name=北海道">北海道</a>
						</td>
						<td><a
							href="<%=request.getContextPath()%>/BbsServlet?name=東北">東北</a>
						</td>
						<td><a
							href="<%=request.getContextPath()%>/BbsServlet?name=北関東">北関東</a>
						</td>
						<td><a
							href="<%=request.getContextPath()%>/BbsServlet?name=首都圏">首都圏</a>
						</td>
						<td><a
							href="<%=request.getContextPath()%>/BbsServlet?name=甲信越">甲信越</a>
						</td>
						<td><a
							href="<%=request.getContextPath()%>/BbsServlet?name=北陸">北陸</a>
						</td>
					</tr>
					<tr>
						<td><a
							href="<%=request.getContextPath()%>/BbsServlet?name=近畿">近畿</a>
						</td>
						<td><a
							href="<%=request.getContextPath()%>/BbsServlet?name=東海">東海</a>
						</td>
						<td><a
							href="<%=request.getContextPath()%>/BbsServlet?name=山陰・山陽">山陰・山陽</a>
						</td>
						<td><a
							href="<%=request.getContextPath()%>/BbsServlet?name=四国">四国</a>
						</td>
						<td><a
							href="<%=request.getContextPath()%>/BbsServlet?name=九州">九州</a>
						</td>
						<td><a
							href="<%=request.getContextPath()%>/BbsServlet?name=沖縄">沖縄</a>
						</td>
					</tr>
				</table>
			</div>

			<div id="button1">
				<form id="form01"
					action="<%=request.getContextPath()%>/BbsButtonServlet">
					<input type="button" id="write" name="write" class="btnPadding"
						value="旅行プランを投稿する"> <input type="hidden" id="bbsProgId"
						name="bbsProgId">
			</div>

			<%

				if(endCnt > list.size()){
					endCnt = list.size();
				}
				for (int i=startCnt; i<endCnt; i++) {
					BbsBean bbsList = list.get(i);

					int allstar = 0;
					int comcount = 0;


					for (int j=0; j<cmtList.size(); j++) {
							CommentBean comCntList = cmtList.get(j);
							String cntBbsNo = bbsList.getBbsNo();
							if (cntBbsNo.equals(comCntList.getCommentBbsNo())) {
				if (comCntList.getStar() != null){
					int getstar = Integer.parseInt(comCntList.getStar());
					comcount++;
					allstar += getstar;
				}
							}
					}
					if(comcount > 0){
					allstar = allstar/comcount;
					}

			%>

			<div id="bbs<%=i%>" class="bbsWrap">
				<div class="title"><%=bbsList.getKenName()%>&nbsp;<%=bbsList.getPlanName()%><div
						class="right">
						投稿日時：<%=bbsList.getPressTime().substring(0,16)%></div>
				</div>
				<div class="planCnt">
					<table>
						<tr>
							<td class="bbsLeft"><img src="images/<%=bbsList.getBbsImage()%>"></td>
							<td>
								<p>
									<span class="fontBig"><span class="bold"><%=bbsList.getPressUserName()%></span>さんのプラン<br>
										<%
												String allstrStar = "";
															if (allstar != 0) {
																int allwhiteStar = 5 - allstar;
																for (int allbs = 1; allbs <= allstar; allbs++) {
																	allstrStar += "★";
																}
																for (int allws = 1; allws <= allwhiteStar; allws++) {
																	allstrStar += "☆";
																}
															} else {
																allstrStar = "評価はありません";
															}
											%>
										<span class="star"><%=allstrStar%></span>
										<%
												if (!allstrStar.equals("評価はありません")) {
													out.println(allstar);
												}
											%>
								</p>
								<p><%=bbsList.getPlanPressSt()%></p>
								<input type="button" id="detail<%=i %>"
								class="btnPadding" name="<%=bbsList.getBbsNo()%>" value="詳細" onClick="detailSet_value('<%=bbsList.getPlanId() %>')">
								<input type="button" id="coment<%=i %>"
								name="<%=bbsList.getBbsNo()%>" class="btnPadding" value="コメントする" onClick="set_value('<%=bbsList.getBbsNo()%>')">
								<input type="hidden" id="bbsInfo" name="bbsInfo">
								<input type="hidden" id="bbsInfo2" name="bbsInfo2" value="<%=bbsList.getPlanName()%>"></td>
						<tr>
							<td colspan="2">
								<div class="comentWrap">
									<h1>コメント</h1>

									<%
										for (int j=0; j<cmtList.size(); j++) {
												CommentBean comentList = cmtList.get(j);
												String bbsNo = bbsList.getBbsNo();
												if (bbsNo.equals(comentList.getCommentBbsNo())) {
									%>

									<div id="bbsComent<%=j%>" class="coment">
										<div class="leftAlign"><%=comentList.getCommentNo()%>:<%=comentList.getCommentUserName()%>さんからのコメント&nbsp;
											<%
												String strStar = "";
															if (comentList.getStar() != null) {
																int star = Integer.parseInt(comentList.getStar());
																int whiteStar = 5 - star;
																for (int bs = 1; bs <= star; bs++) {
																	strStar += "★";
																}
																for (int ws = 1; ws <= whiteStar; ws++) {
																	strStar += "☆";
																}
															} else {
																strStar = "評価はありません";
															}
											%>
											<span class="star"><%=strStar%></span>
											<%
												if (!strStar.equals("評価はありません")) {
													out.println(comentList.getStar());
												}
											%>
										</div>
										<div class="rightAlign">
											投稿日時：<%=comentList.getCommentTime().substring(0,16)%></div>
										<div class="nameLine"></div>
										<div class="message">
											<p><%=comentList.getCommentSt()%></p>
										</div>
									</div>

									<%
										}
											}
									%>

								</div>
							</td>
						</tr>
					</table>
				</div>
				<!-- planCnt end -->
			</div>
			<!-- bbsWrap end -->

			<%
				}
			%>
			</form>

			<div id="controlBar" class="right">
				<a href="<%=request.getContextPath()%>/BbsNextServlet?page=<%= pg %>&bt=b">前へ</a>
				|
				<% for(int p=1; p <= pageEnd; p++){ %>
				<a href="<%=request.getContextPath()%>/BbsNextServlet?page=<%=p %>"><%=p %></a>
				|
				<% } %>
				<a href="<%=request.getContextPath()%>/BbsNextServlet?page=<%=pg %>&bt=n">次へ</a>
			</div>
		</div>
		<!-- contents end ここまで編集 -->

	</div>
	<!-- wrapper end -->

	<%-- フッターの挿入 --%>
	<%@include file="footer.jsp"%>

</body>
</html>
