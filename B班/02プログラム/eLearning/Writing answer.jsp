<%@page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@page import="java.util.ArrayList"%>
<%@page import="jp.ac.fjb.eLearning.bean.QuestionInputBean"%>
<%
	//教科、科目、分野IDと一致する問題
	ArrayList<QuestionInputBean> list = (ArrayList) session
			.getAttribute("MONDAI_LIST");
	String tensu = (String) session.getAttribute("TEN");
%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01//EN" "http://www.w3.org/TR/html4/strict.dtd">
<html lang="ja">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<script type="text/javascript" src="js/Writing answer.js"></script>
<title>受け身 解答・解説</title>
</head>
<center>
	<h3>受け身 解答・解説</h3>

	<input type="text" value="<%=tensu%>" size="4" id="tensu" name ="tensu" >点
	<body>
		<%
			for (int i = 0; i < list.size(); i++) {
				QuestionInputBean mondai = list.get(i);
				String name = request.getParameter("kaitou"+i);
		%>
		<form id="WAform">

			<TABLE cellspacing="1" cellpadding="6" width="700">
				<TD bgcolor="skyblue" nowrap align="center" colspan="9">
				<font
					size="3" color="#000000">Q<%=i+1%>.<%=mondai.getMondai()%><br>
						<!-- &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; -->

						<input type="text"
						id="kaitou<%=i%>" name="kaitou<%=i%>"  style="color: red"
						size="50" style="text-align:right" value = <%=name%>
						>

						<br><!-- &nbsp;&nbsp;  --><font
						color="red"><%=mondai.getKaitou()%></font><br> 解答:<%=mondai.getKaisetsu()%>
						</TR>


		<%
			}
		%>
			</TABLE>
			<BUTTON type="button" id="Rebtn">Writing目次へ</BUTTON>
	<input type="hidden" id="kamokuID" name="kamokuID"></input>
	</form>
	<%=request.getParameter("kaitou0")%>


	</body>


</html>
