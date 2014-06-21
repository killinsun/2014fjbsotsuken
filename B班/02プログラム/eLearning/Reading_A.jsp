<%@page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@page import="jp.ac.fjb.eLearning.bean.QuestionInputBean" %>
<%@page import="java.util.*" %>
<% ArrayList<QuestionInputBean> Reading = (ArrayList<QuestionInputBean>)session.getAttribute("Reading"); %>
<% String tensu =(String)session.getAttribute("TEN");  %>
<!DOCTYPE html>
<html>
<form id="Aform">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<script type="text/javascript" src="js/Reading_A.js"></script>
<body>
<div  align="center">

<TABLE cellspacing="1" cellpadding="6" width="700">

	<TR>
		<TD bgcolor="#7B68EE" width="153" nowrap align="center" colspan="9"><font size="3" color="#000000">採点結果</font>
<BR>
		</TD>
	</TR>

	<TR>
		<TD bgcolor="#FFFFFF" width="153" nowrap align="center" colspan="9"><font size="3" color="#000000">
<input type="text" size=4 value="<%=tensu%>"></font>点
<BR>
		</TD>

	</TR>


	<TR>
		<TD bgcolor="#7B68EE" width="153" nowrap align="center" colspan="9"><font size="3" color="#000000">Level 1</font>
<BR>
		</TD>
	</TR>

	<TR>
		<TD bgcolor="skyblue" width="153" nowrap><font size="3" color="#000000">Q 1</font>
<BR>
		</TD>
		<TD TD align="left" bgcolor="skyblue" width="574"><%= Reading.get(1).getMondai() %>
<BR>
訳：こんにちはミシェル。よろしくね。
		</TD>
	</TR>
		<TD bgcolor="#9370DB" width="153" nowrap>
<BR>正解
		</TD>
		<TD TD align="left" bgcolor="#9370DB" width="574">Nice to me too to.
<br>
訳：こちらこそよろしく。
<BR>
<BR>
<%= Reading.get(1).getKaisetsu() %>
<BR>

		</TD>
	<TR>
		<TD bgcolor="skyblue" width="153" nowrap><font size="3" color="#000000">Q 2</font>
<BR>
		</TD>
		<TD TD align="left" bgcolor="skyblue" width="574"><%= Reading.get(0).getMondai() %>
<BR>
訳：あなたはどこから来たの？
		</TD>
	</TR>
	<TR>
		<TD bgcolor="#9370DB" width="153" nowrap>
<BR>正解
		</TD>
		<TD TD align="left" bgcolor="#9370DB" width="574"> I from Japan.
<br>
訳：私は日本にすんでいます。
<br>
<br>
<%= Reading.get(0).getKaisetsu() %>
		</TD>
	</TR>
	<TR>
		<TD bgcolor="skyblue" width="153" nowrap><font size="3" color="#000000">Q 3</font>
<BR>
		</TD>
		<TD TD align="left" bgcolor="skyblue" width="574"><%= Reading.get(2).getMondai() %>
<br>
訳：私は日本から来ました。あなたはどこの国の出身ですか？
		</TD>
	</TR>
	<TR>
		<TD bgcolor="#9370DB" width="153" nowrap>正解
		</TD>
		<TD TD align="left" bgcolor="#9370DB" width="574">I came from too.
<br>
訳：私もあなたと同じ国から来ました。
<br>
<br>
<%= Reading.get(2).getKaisetsu() %>
		</TD>
	</TR>
</TABLE>



<div id="a">
<button type="button" name="aaa" value="aaa" id="Rebtn">
<font size="5" color="#333399">Reading 目次へ</font>
</button>
</div>

</div>
</body>
</form>
</html>