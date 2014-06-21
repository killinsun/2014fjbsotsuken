package org.apache.jsp.Shift;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.Calendar;
import jp.ac.fjb.sotukenD.bean.ShiftTeiFormBean;
import java.util.ArrayList;
import java.lang.Number;

public final class shiftTei_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("<!DOCTYPE html>\r\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<head>\r\n");
      out.write("    <meta charset=\"utf-8\" />\r\n");
      out.write("    <title>レイアウトテスト</title>\r\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"/sotukenD/css/style.css\" />\r\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"/sotukenD/css/calendar.css\" />\r\n");
      out.write("    <script type=\"text/javascript\" src=\"/sotukenD/js/tei.js\" charset=\"utf-8\"></script>\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<div class=\"frm\">\r\n");
      out.write("\t<!--header部分-->\r\n");
      out.write("\t<header id=\"header\">\r\n");
      out.write("\t\t\t<div id=\"title\">\r\n");
      out.write("\t\t\tシフト提出\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div id=\"account\" align=\"right\">\r\n");
      out.write("\t\t\t<div id=\"name\">苗字　名前</div>\r\n");
      out.write("\t\t\t<!--ログアウトボタン-->\r\n");
      out.write("\t\t\t<button type=\"button\" id=\"logout\">ログアウト</button>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div>\r\n");
      out.write("\t\t　\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t</header>\r\n");
      out.write("\r\n");
      out.write("\t<!--ページ移動、ナビゲーション部分-->\r\n");
      out.write("<nav id=\"nav\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t<iframe src=\"/sotukenD/mainMenu.jsp\" name=\"mainMenu\" Align=\"left\" Frameborder=\"no\" Marginheight=\"0\" Width=\"200\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t</iframe>\r\n");
      out.write("\r\n");
      out.write("\t</nav>\r\n");
      out.write("\r\n");
      out.write("\t<!--作業画面-->\r\n");




Calendar now = Calendar.getInstance();
int y = now.get(now.YEAR);          //年を取得
int m = now.get(now.MONTH) + 1;     //月を取得
int d = now.get(now.DATE);          //日を取得
int kigen = 0;
int teiM=m;
int kigenM=m;
int zenkouflag=0;
String zenkou="";
if(10<d && d<25){
	if(m==12){
		y=y++;
		teiM= teiM - 11;
		kigen = 25;
		zenkou = "１ー１５";
		zenkouflag=0;
	}else{
		kigen = 25;
		zenkou = "１ー１５";
		kigenM = teiM+1;
		teiM=teiM+1;
		zenkouflag=0;
	}
}else{
	kigen = 10;
	zenkou = "１６ー３１";
	zenkouflag=1;
}



      out.write("\r\n");
      out.write("\r\n");
      out.write("\t<section id=\"mainContent\">\r\n");
      out.write("\t\t<div id=\"zentai\">\r\n");
      out.write("<font size=\"5\">");
      out.print(teiM);
      out.write('月');
      out.write(' ');
      out.print(zenkou );
      out.write("</font>\r\n");
      out.write("\r\n");
      out.write("<table border=\"0\" width=\"550\" height=\"100%\">\r\n");
      out.write("<tr></tr>\r\n");
      out.write("<tr><td>\r\n");
      out.write("<table border=\"0\" width=\"100%\" height=\"50\" cellpadding=\"2\" cellspacing=\"1\" bgcolor=\"#002047\">\r\n");
      out.write("<tr align=\"center\" bgcolor=\"#CCCCFF\">\r\n");
      out.write("\t<td><font color=\"#FF0000\">提出期限：");
      out.print(m );
      out.write('月');
      out.print(kigen );
      out.write("日</font>\r\n");
      out.write("\t</td>\r\n");
      out.write("</tr>\r\n");

ArrayList kibouShift = (ArrayList) session.getAttribute("KIBOU_LIST");




int startDay = 0;
int endDay = 0;
int statFlag=0;
if(zenkouflag==0){
	startDay = 1;
	endDay = 15;
}else if(zenkouflag==1){
	startDay = 16;
	endDay = 31;
}


      out.write("\r\n");
      out.write("<form method=\"POST\" action=\"/sotukenD/ForShiftTeiServlet\" >\r\n");

int listCount=0;
for(int i=startDay;i < endDay+1 ;i++){

		ShiftTeiFormBean getKibou=(ShiftTeiFormBean)kibouShift.get(listCount);
		statFlag = getKibou.getStatFlag();


		out.println("<table border=\"0\" width=\"100%\" cellpadding=\"2\" cellspacing=\"1\" bgcolor=\"#002047\"> " );
		out.println("<tr align=\"center\" bgcolor=\"#FFFFFF\"> " );
		out.println("<td width=\"20%\"><h4>"+ i +"</h4></td> ");
		out.println("<td>");
		out.println("<select id=statBox"+i+" name=\"statBox"+i+"\"> ");
		if(statFlag==0){
			out.println("<option value=\"0\" selected>未提出</option>");
			out.println("<option value=\"1\">出勤希望</option> ");
			out.println("<option value=\"2\">休み希望</option>");
			out.println("<option value=\"3\">FREE</option>");
		}else if(statFlag==1){
			out.println("<option value=\"0\">未提出</option>\r\n ");
			out.println("<option value=\"1\" selected>出勤希望</option>");
			out.println("<option value=\"2\">休み希望</option> ");
			out.println("<option value=\"3\">FREE</option>");
		}else if(statFlag==2){
			out.println("<option value=\"0\">未提出</option>");
			out.println("<option value=\"1\">出勤希望</option>");
			out.println("<option value=\"2\" selected>休み希望</option>");
			out.println("<option value=\"3\">FREE</option>");
		}else if(statFlag==3) {
			out.println("<option value=\"0\">未提出</option>");
			out.println("<option value=\"1\">出勤希望</option>");
			out.println("<option value=\"2\">休み希望</option>");
			out.println("<option value=\"3\" selected>FREE</option>");
		}
		out.println("</select>");
		out.println("　　　");
		out.println("<input type=\"text\" id=startH"+i+" name=\"startH"+i+"\" value='"+getKibou.getStartH()+"' size=\"3\" />");
		out.println(":");
		out.println("<input type=\"text\" id=startM"+i+" name=\"startM"+i+"\" value='"+getKibou.getStartM()+"' size=\"3\" />");
		out.println("ー");
		out.println("<input type=\"text\" id=finishH"+i+" name=\"finishH"+i+"\" value='"+getKibou.getFinishH()+"' size=\"3\" />");
		out.println(":");
		out.println("<input type=\"text\" id=finishM"+i+" name=\"finishM"+i+"\" value='"+getKibou.getFinishM()+"' size=\"3\" />");
		out.println("</td>");
		out.println("</tr>");
		out.println("</table>");
		listCount++;
}

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</table>\r\n");
      out.write("</td></tr>\r\n");
      out.write("</table>\r\n");
      out.write("<button type=\"button\"  onclick=\"location.href='/sotukenD/ForShiftMainServlet'\">シフトトップへ</button>\r\n");
      out.write("</a>\r\n");
      out.write("<!--配置のためのスペースです-->\r\n");
      out.write("　　　　　　　　　　　　　　　　　　　　　　　　　　　\r\n");
      out.write("\r\n");
      out.write("<input type=\"submit\" name=\"tei\"  value=\"提出する\" style=\"WIDTH: 120px; HEIGHT: 60px;\" >\r\n");
      out.write("\r\n");
      out.write("</a>\r\n");
      out.write("</div>\r\n");
      out.write("\t</section>\r\n");
      out.write("</div>\r\n");
      out.write("</form>\r\n");
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
