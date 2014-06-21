package org.apache.jsp.Shift;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import jp.ac.fjb.sotukenD.bean.ShiftCreateFormBean;
import jp.ac.fjb.sotukenD.bean.ShiftShowFormBean;
import java.util.ArrayList;
import jp.ac.fjb.sotukenD.bean.LoginFormBeans;

public final class shiftCreate_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
 ArrayList<ShiftCreateFormBean> uData = (ArrayList)session.getAttribute("USER_DATA"); 
      out.write('\r');
      out.write('\n');
 ArrayList<ShiftShowFormBean> dShift = (ArrayList)session.getAttribute("DECISION_SHIFT"); 
      out.write("\r\n");
      out.write("\r\n");

	LoginFormBeans loginBean = (LoginFormBeans) session
			.getAttribute("LOGIN_USER");

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
 String date = (String)session.getAttribute("DATE"); 
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\">\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"utf-8\" />\r\n");
      out.write("<title>シフト作成画面</title>\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"/sotukenD/css/style.css\" />\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"/sotukenD/css/sakusei.css\" />\r\n");
      out.write("\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("<!--\r\n");
      out.write("shiftList = new Array('08:00','08:30','09:00','09:30','10:00','10:30','11:00','11:30','12:00','12:30','13:00','13:30','14:00','14:30','15:00','15:30','16:00','16:30','17:00','17:30','18:00','18:30','19:00','19:30','20:00','20:30','21:00','21:30','22:00','22:30','23:00');\r\n");
      out.write("\r\n");
      out.write("function changeBackgroundColor(row,col){\r\n");
      out.write("\tvar newId = row+'cg'+col;\r\n");
      out.write("\tvar hidId = row+'hidId'+col;\r\n");
      out.write("\tvar start;\r\n");
      out.write("\tvar end ;\r\n");
      out.write("\r\n");
      out.write("\tif( document.getElementById( hidId ).value==\"no\"){\r\n");
      out.write("    \tdocument.getElementById( newId ).style.backgroundColor = '#CCCCCC';\r\n");
      out.write("    \tdocument.getElementById( hidId ).value=\"in\";\r\n");
      out.write("\t}else if(document.getElementById( hidId ).value == \"in\"){\r\n");
      out.write("\t    document.getElementById( newId ).style.backgroundColor = '#FFFFFF';\r\n");
      out.write("\t    document.getElementById( hidId ).value=\"no\";\r\n");
      out.write("\t}\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\tfor(var i=0; i<30; i++) {\r\n");
      out.write("\t\tvar stI = (\"0\"+i).slice(-2);\r\n");
      out.write("\t\tif (document.getElementById(row+'hidId'+stI ).value != 'no') {\r\n");
      out.write("\t\t\tstart = i;\r\n");
      out.write("\t\t\tbreak;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t}\r\n");
      out.write("\r\n");
      out.write("\tfor(var i=29; i>-1; i--) {\r\n");
      out.write("\t\tvar stI = (\"0\"+i).slice(-2);\r\n");
      out.write("\t\tif (document.getElementById(row+'hidId'+stI ).value != 'no') {\r\n");
      out.write("\t\t\tend = i;\r\n");
      out.write("\t\t\tbreak;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t}\r\n");
      out.write("\r\n");
      out.write("\tif(start<end){\r\n");
      out.write("\t\tfor(var i = start;i<=end;i++){\r\n");
      out.write("\t\t\tvar stI = (\"0\"+i).slice(-2);\r\n");
      out.write("\t    \tdocument.getElementById( row+'cg'+stI ).style.backgroundColor = '#CCCCCC';\r\n");
      out.write("\t    \tdocument.getElementById(row+'hidId'+stI ).value='in';\r\n");
      out.write("\t\t}\r\n");
      out.write("\r\n");
      out.write("\t}\r\n");
      out.write("\tif(end != 0){\r\n");
      out.write("\t\tdocument.getElementById(row+'start').value =shiftList[start];\r\n");
      out.write("\t\tdocument.getElementById(row+'end').value =shiftList[end + 1];\r\n");
      out.write("\t}\r\n");
      out.write("\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("function hozon(){\r\n");
      out.write("\tvar form = document.getElementById(\"form\").action = '/sotukenD/ShiftConserveServlet';\r\n");
      out.write("\talert(\"保存しました\");\r\n");
      out.write("\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("// -->\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<body onLoad=\"load()\">\r\n");
      out.write("\t");
 request.setCharacterEncoding("UTF-8"); 
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t<div class=\"frm\">\r\n");
      out.write("\t\t\t\t<!--header部分-->\r\n");
      out.write("\t\t<header id=\"header\">\r\n");
      out.write("\t\t\t<div id=\"title\">シフト作成</div>\r\n");
      out.write("\t\t\t<div id=\"account\" align=\"right\">\r\n");
      out.write("\t\t\t\t<div id=\"name\">");
      out.print(loginBean.getUserName());
      out.write("</div>\r\n");
      out.write("\t\t\t\t<!--ログアウトボタン-->\r\n");
      out.write("\t\t\t\t<button type=\"submit\" id=\"logout\"\r\n");
      out.write("\t\t\t\t\tonclick=\"location.href='/sotukenD/LogoutServlet'\">ログアウト</button>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div>　</div>\r\n");
      out.write("\r\n");
      out.write("\t\t</header>\r\n");
      out.write("\r\n");
      out.write("\t\t<!--ページ移動、ナビゲーション部分-->\r\n");
      out.write("\t\t<nav id=\"nav\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t<iframe src=\"/sotukenD/mainMenu.jsp\" name=\"mainMenu\" Align=\"left\"\r\n");
      out.write("\t\t\t\tFrameborder=\"no\" Marginheight=\"0\" Width=\"200\"> </iframe>\r\n");
      out.write("\r\n");
      out.write("\t\t</nav>\r\n");
      out.write("\t\t<!--作業画面-->\r\n");
      out.write("\t\t<section id=\"mainContent\" >\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t<form id=\"form\" action=\"/sotukenD/ForShiftShowServlet\" method=\"post\" >\r\n");
      out.write("\t\t");
String date1 = date; 
      out.write("\r\n");
      out.write("\t\t<div style=\"text-align: center;\">\r\n");
      out.write("\t\t\t<input type=\"submit\"  id=\"conserve\" value=\"保存\" style=\"WIDTH: 100px; HEIGHT: 30px; float:left;\" onclick=\"hozon()\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t<font size=\"5\">  ");
      out.print( date1 );
      out.write("  </font>\r\n");
      out.write("\t\t\t<input type=\"submit\" value=\"閲覧画面\" style=\"WIDTH: 100px; HEIGHT: 30px; float:right; \">\r\n");
      out.write("\t\t\t<input type =\"hidden\" value=\" ");
      out.print( date1.substring(0,10));
      out.write("\" id=\"date\" name=\"day\" >\r\n");
      out.write("\t\t\t<input type =\"hidden\" name=\"dateChange\" value=\"0\">\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t\t<!---->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t<img src=\"/sotukenD/img/memori.gif\" id=\"memori\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t<div id=\"zentai\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<table border=\"0\" width=\"100%\" cellpadding=\"2\" cellspacing=\"1\" bgcolor=\"#002047\" cols=\"32\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t");
int i = 0;
				String stI;
				String stJ;

				for(;i<dShift.size();i++){

				 stI = String.format("%02d", i);
					ShiftShowFormBean xx = dShift.get(i);


				
      out.write("\r\n");
      out.write("\t\t\t\t\t<!--ここから-->\r\n");
      out.write("\t\t\t\t\t\t\t<tr align=\"center\" bgcolor=\"#FFFFFF\" height=\"45px\" id=\"kotei\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<input type=\"hidden\" value=\"");
      out.print( xx.getStartTime() );
      out.write("\" id=\"");
      out.print(stI);
      out.write("start\" name=\"");
      out.print(stI);
      out.write("start\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<input type=\"hidden\" value=\"");
      out.print( xx.getFinishTime() );
      out.write("\" id=\"");
      out.print(stI);
      out.write("end\" name=\"");
      out.print(stI);
      out.write("end\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<td width=\"30px\">削除<input type=\"checkbox\" name=\"");
      out.print(stI);
      out.write("del\" value=\"1\"></td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td width=\"158px\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t<select name=\"");
      out.print(stI);
      out.write("userID\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<option value =\"none\">未選択</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t");
for(int j =0;j<uData.size();j++){
												ShiftCreateFormBean userD = uData.get(j);
												
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<option value=\"");
      out.print( userD.getUserID() );
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t");
 if(userD.getUserID().equals(xx.getUserID())){out.print("selected");}
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t >");
      out.print( userD.getUserName() );
      out.write("</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t");

												}
												
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t</select></td>\r\n");
      out.write("\t\t\t\t\t\t\t\t");

									ShiftCreateFormBean userD = uData.get(0);

									String[] styleId =  xx.getStyle();
									String[] checkV =  xx.getCv();
									for (int j=0; j<30; j++){

										 stJ = String.format("%02d", j);
									
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t<td width=\"12px\" id=\"");
      out.print(stI);
      out.write('c');
      out.write('g');
      out.print(stJ);
      out.write('"');
      out.print( styleId[j] );
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\tonClick=\"changeBackgroundColor( '");
      out.print(stI);
      out.write('\'');
      out.write(',');
      out.write('\'');
      out.print(stJ);
      out.write("')\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<input type=\"hidden\" name=\"");
      out.print(stI);
      out.write("hidName");
      out.print(stJ);
      out.write("\" id=\"");
      out.print(stI);
      out.write("hidId");
      out.print(stJ);
      out.write("\" value=\"");
      out.print(checkV[j] );
      out.write("\">\r\n");
      out.write("\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t");

									}
									
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t<!--ここまで読み込み分-->\r\n");
      out.write("\t\t\t\t");
 }

				for(;i<20;i++){
					 stI = String.format("%02d", i);
				
      out.write("\r\n");
      out.write("\t\t\t\t\t<!--ここから-->\r\n");
      out.write("\t\t\t\t\t\t\t<tr align=\"center\" bgcolor=\"#FFFFFF\" height=\"45px\" id=\"kotei\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<input type=\"hidden\" value=\"\" id=\"");
      out.print(stI);
      out.write("start\" name=\"");
      out.print(stI);
      out.write("start\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<input type=\"hidden\" value=\"\" id=\"");
      out.print(stI);
      out.write("end\" name=\"");
      out.print(stI);
      out.write("end\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<td width=\"30px\">削除<input type=\"checkbox\" name=\"");
      out.print(stI);
      out.write("del\" value=\"1\"></td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td width=\"158px\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<select name=\"");
      out.print(stI);
      out.write("userID\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<option value =\"none\">未選択</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t");
for(int j =0;j<uData.size();j++){
												ShiftCreateFormBean userD = uData.get(j);
												
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<option value=\"");
      out.print( userD.getUserID() );
      out.write("\"\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t >");
      out.print( userD.getUserName() );
      out.write("</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t");

												}
												
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t</select></td>\r\n");
      out.write("\t\t\t\t\t\t\t\t");

									ShiftCreateFormBean userD = uData.get(1);
									for (int j=0; j<30; j++){

										 stJ = String.format("%02d", j);
									
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t<td width=\"12px\" id=\"");
      out.print(stI);
      out.write('c');
      out.write('g');
      out.print(stJ);
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\tonClick=\"changeBackgroundColor( '");
      out.print(stI);
      out.write('\'');
      out.write(',');
      out.write('\'');
      out.print(stJ);
      out.write("')\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<input type=\"hidden\" name=\"");
      out.print(stI);
      out.write("hidName");
      out.print(stJ);
      out.write("\" value=\"no\" id=\"");
      out.print(stI);
      out.write("hidId");
      out.print(stJ);
      out.write("\">\r\n");
      out.write("\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t");

									}
									
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t");
 } 
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t</table>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t</form>\r\n");
      out.write("\t</div>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
