<%@page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@page import="java.util.ArrayList"%>
<%@page import="jp.ac.fjb.eLearning.bean.QuestionInputBean"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01//EN" "http://www.w3.org/TR/html4/strict.dtd">
<html lang="ja">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<script type="text/javascript" src="js/Writing question.js"></script>
<title>受け身 練習問題</title>
</head>
<%
	//教科、科目、分野IDと一致する問題
	ArrayList<QuestionInputBean> list = (ArrayList) session
			.getAttribute("MONDAI_LIST");
%>
<body>
	<form id="WQform" action="/eLearning/SetQuestionServlet">

		<div align="center">
			<TABLE cellspacing="1" cellpadding="6" width="700">
				<TR>
					<TD bgcolor="#FFFFFF" width="153" nowrap align="center" colspan="9"><font
						size="3" color="#000000">
				</TR>


				<TR>

					<TD bgcolor="#7B68EE" width="153" nowrap align="center" colspan="9"><font
						size="3" color="#000000">
							<center>
								高校英語Writing <br>受け身 確認テスト
					</font>
						</center>
						<BR>
					</TD>
				</TR>

				<%
			for (int i = 0; i < list.size(); i++) {
				QuestionInputBean mondai = list.get(i);
				%>
				<TR>
					<TD bgcolor="skyblue" width="153" nowrap><font size="3"
						color="#000000">Q<%=i+1%></font><BR>
					</TD>
					<TD TD align="left" bgcolor="skyblue" width="574">・<%=mondai.getMondai()%><br>
						<input type="text" id="kaitou<%= i %>>" name="kaitou<%= i %>"
						size="45" style="text-align: left">&nbsp;&nbsp;</TD>
				</TR>
				<%
				}
				%>
			</TABLE>
			</TR>


			<button type="button" name="aaa" value="aaa" id="Ibtn">
				<font size="5" color="#333399">解答</font>

				<button type="button" name="aaa" value="aaa" id="Wbtn">
					<font size="5" color="#333399">Writing目次へ</font>

					</center>
		</div>
		</div>
</body>
</form>
</html>
