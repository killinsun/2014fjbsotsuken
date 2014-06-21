<%@page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@page import="jp.ac.fjb.eLearning.bean.QuestionInputBean" %>
<%@page import="java.util.*" %>
<% ArrayList<QuestionInputBean> Reading = (ArrayList<QuestionInputBean>)session.getAttribute("Reading"); %>
<!DOCTYPE html>
<html>
<form id="Fform">
<script type="text/javascript" src="js/Reading_Q.js"></script>
<body>
<div  align="center">

<TABLE cellspacing="1" cellpadding="6" width="700">

	<TR>
		<TD bgcolor="#7B68EE" width="153" nowrap align="center" colspan="9"><font size="3" color="#000000">新出単語</font>
<BR>
		</TD>
	</TR>

	<TR>
		<TD bgcolor="#FFFFFF" width="153" nowrap align="center" colspan="9"><font size="3" color="#000000">
Hello・・・おはよう
<br>
<br>
country・・・故郷、出身
<br>
<br>
<br>
問題文を読み、正しいと思う回答を入力せよ</font>
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
		<TD align="left" bgcolor="skyblue" width="574"><%= Reading.get(1).getMondai() %>
		</TD>
	</TR>
	<TR>
		<TD bgcolor="#9370DB" width="153" nowrap></TD>
		<TD align="left" bgcolor="#9370DB" width="574">A:Nice to me too to.　　B:No thank you.
<br>
<input type = "text" align="center" size= "1" maxlength="1" id="kaitou0" name="kaitou0">
		</TD>
	</TR>
	<TR>

		<TD bgcolor="skyblue" width="153" nowrap><font size="3" color="#000000">Q 2</font>
<BR>
		</TD>
		<TD align="left" bgcolor="skyblue" width="574"><%= Reading.get(0).getMondai() %>
		</TD>
	</TR>
	<TR>
		<TD bgcolor="#9370DB" width="153" nowrap>
<BR>
		</TD>
		<TD align="left" bgcolor="#9370DB" width="574">A:I'm student.　　B:I from Japan.
<br>
<input type = "text" align="center" size= "1" maxlength="1" id="kaitou1" name="kaitou1">
		</TD>
	</TR>
	<TR>

		<TD bgcolor="skyblue" width="153" nowrap><font size="3" color="#000000">Q 3</font>
<BR>
		</TD>
		<TD align="left" bgcolor="skyblue" width="574"><%= Reading.get(2).getMondai() %>
		</TD>
	</TR>
	<TR>
		<TD bgcolor="#9370DB" width="153" nowrap>
<BR>
		</TD>
		<TD align="left" bgcolor="#9370DB" width="574">A:I came from too.　　B:No thank you.
<br>
<input type ="text"  align="center" size= "1" maxlength="1" id="kaitou2" name="kaitou2">
		</TD>
	</TR>



</TABLE>

<div id="a">
<button type="button" name="aaa" value="aaa" id="Sbtn">
<font size="5" color="#333399">採点＆解説へ</font>
</button>
</div>
</div>
</body>
</form>
</html>