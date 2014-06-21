package org.apache.jsp.Schedule;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import jp.ac.fjb.sotukenD.bean.ScheduleForBean;
import java.util.ArrayList;

public final class scheduleMain_jsp extends org.apache.jasper.runtime.HttpJspBase
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

	ArrayList<ScheduleForBean> schedule = (ArrayList) session.getAttribute("SCHEDULE_DATA");
	String year = (String)session.getAttribute("YEAR");
	String month = (String)session.getAttribute("MONTH");
	int intYear2 = Integer.parseInt(year);
	int intMonth2 = Integer.parseInt(month);

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\">\r\n");
      out.write("\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"utf-8\" />\r\n");
      out.write("<title>スケジュール確認</title>\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"/sotukenD/css/style.css\" />\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"/sotukenD/css/Schedule.css\" />\r\n");
      out.write("<script src=\"/sotukenD/js/scheduleMain.js\"></script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t<form id=\"form\">\r\n");
      out.write("\t<div class=\"frm\">\r\n");
      out.write("\t\t<!--header部分-->\r\n");
      out.write("\t\t<header id=\"header\">\r\n");
      out.write("\t\t\t<div id=\"title\">スケジュール確認</div>\r\n");
      out.write("\t\t\t<div id=\"account\" align=\"right\">\r\n");
      out.write("\t\t\t\t<div id=\"name\">苗字 名前</div>\r\n");
      out.write("\t\t\t\t<!--ログアウトボタン-->\r\n");
      out.write("\t\t\t\t<button type=\"button\" id=\"logout\">ログアウト</button>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t</header>\r\n");
      out.write("\r\n");
      out.write("\t\t<!--ページ移動、ナビゲーション部分-->\r\n");
      out.write("\t\t<nav id=\"nav\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t<iframe src=\"mainMenu.jsp\" name=\"mainMenu\" Align=\"left\"\r\n");
      out.write("\t\t\t\tFrameborder=\"no\" Marginheight=\"0\" Width=\"200\"> </iframe>\r\n");
      out.write("\r\n");
      out.write("\t\t</nav>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t<!--作業画面-->\r\n");
      out.write("\t\t<section id=\"mainContent\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t<table align=\"center\" border=\"5\" width=\"500\" cellspacing=\"0\">\r\n");
      out.write("\t\t\t");
 int c = 0; 
      out.write("\r\n");
      out.write("\t\t\t\t<script>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\tif (location.search.indexOf(\"/\") > 0) { // 年月取得\r\n");
      out.write("\t\t\t\t\t\tquery = new Array();\r\n");
      out.write("\t\t\t\t\t\tquery = location.search.split(\"/\");\r\n");
      out.write("\t\t\t\t\t\tyear = parseInt(query[1]); // 年\r\n");
      out.write("\t\t\t\t\t\tmonth = parseInt(query[2]); // 月\r\n");
      out.write("\t\t\t\t\t} else {\r\n");
      out.write("\t\t\t\t\t\ttoday = new Date();\r\n");
      out.write("\t\t\t\t\t\tyear = today.getFullYear(); // 今日の年\r\n");
      out.write("\t\t\t\t\t\tmonth = today.getMonth() + 1; // 今日の月\r\n");
      out.write("\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\tstart = new Date(year + \"/\" + month + \"/1\");\r\n");
      out.write("\t\t\t\t\tstartday = start.getDay(); // １日の曜日\r\n");
      out.write("\t\t\t\t\tdays = new Array(31, 28, 31, 30, 31, 30, 31, 31, 30, 31,\r\n");
      out.write("\t\t\t\t\t\t\t30, 31);\r\n");
      out.write("\t\t\t\t\tif (month == 2\r\n");
      out.write("\t\t\t\t\t\t\t&& (year % 4 == 0 && year % 100 != 0 || year % 400 == 0)) {\r\n");
      out.write("\t\t\t\t\t\tdays[1]++; // うるう年\r\n");
      out.write("\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\tenddate = days[month - 1]; // 最後の日\r\n");
      out.write("\t\t\t\t\tprevyear = year; // 前月・次月\r\n");
      out.write("\t\t\t\t\tprevmonth = month - 1;\r\n");
      out.write("\t\t\t\t\tnextyear = year;\r\n");
      out.write("\t\t\t\t\tnextmonth = month + 1;\r\n");
      out.write("\t\t\t\t\tif (prevmonth < 1) {\r\n");
      out.write("\t\t\t\t\t\tprevyear--;\r\n");
      out.write("\t\t\t\t\t\tprevmonth += 12;\r\n");
      out.write("\t\t\t\t\t} else if (nextmonth > 12) {\r\n");
      out.write("\t\t\t\t\t\tnextyear++;\r\n");
      out.write("\t\t\t\t\t\tnextmonth -= 12;\r\n");
      out.write("\t\t\t\t\t}\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\tdocument.write('<tr>');\r\n");
      out.write("\t\t\t\t\tdocument.write('<td colspan=\"7\" align=\"center\">');\r\n");
      out.write("\t\t\t\t\tdocument.write(\r\n");
      out.write("\t\t\t\t\t\t\t'<a href=\"/sotukenD/ForScheduleMainServlet?/',\r\n");
      out.write("\t\t\t\t\t\t\tprevyear, '/', prevmonth,\r\n");
      out.write("\t\t\t\t\t\t\t'/\" style=\"font-size:15px\" onClick=prevClick(prevyear,prevmonth)>≪前月</a> ');\r\n");
      out.write("\t\t\t\t\tdocument.write(year,\r\n");
      out.write("\t\t\t\t\t\t\t'<span style=\"font-size:20px\">年</span>');\r\n");
      out.write("\t\t\t\t\tdocument.write(month,\r\n");
      out.write("\t\t\t\t\t\t\t'<span style=\"font-size:20px\">月</span> ');\r\n");
      out.write("\t\t\t\t\tdocument.write(\r\n");
      out.write("\t\t\t\t\t\t\t'<a href=\"/sotukenD/ForScheduleMainServlet?/',\r\n");
      out.write("\t\t\t\t\t\t\tnextyear, '/', nextmonth,\r\n");
      out.write("\t\t\t\t\t\t\t'/\" style=\"font-size:15px\">次月≫</a>');\r\n");
      out.write("\t\t\t\t\tdocument.write('</td>');\r\n");
      out.write("\t\t\t\t\tdocument.write('</tr>');\r\n");
      out.write("\t\t\t\t\tdocument.write('<tr>');\r\n");
      out.write("\t\t\t\t\tdocument\r\n");
      out.write("\t\t\t\t\t\t\t.write('<td align=\"center\" style=\"font-size:20px;color:red\">日</td>');\r\n");
      out.write("\t\t\t\t\tdocument\r\n");
      out.write("\t\t\t\t\t\t\t.write('<td align=\"center\" style=\"font-size:20px\">月</td>');\r\n");
      out.write("\t\t\t\t\tdocument\r\n");
      out.write("\t\t\t\t\t\t\t.write('<td align=\"center\" style=\"font-size:20px\">火</td>');\r\n");
      out.write("\t\t\t\t\tdocument\r\n");
      out.write("\t\t\t\t\t\t\t.write('<td align=\"center\" style=\"font-size:20px\">水</td>');\r\n");
      out.write("\t\t\t\t\tdocument\r\n");
      out.write("\t\t\t\t\t\t\t.write('<td align=\"center\" style=\"font-size:20px\">木</td>');\r\n");
      out.write("\t\t\t\t\tdocument\r\n");
      out.write("\t\t\t\t\t\t\t.write('<td align=\"center\" style=\"font-size:20px\">金</td>');\r\n");
      out.write("\t\t\t\t\tdocument\r\n");
      out.write("\t\t\t\t\t\t\t.write('<td align=\"center\" style=\"font-size:20px;color:blue\">土</td>');\r\n");
      out.write("\t\t\t\t\tdocument.write('</tr>');\r\n");
      out.write("\t\t\t\t\tcount = 0;\r\n");
      out.write("\t\t\t\t\tfor (i = 0; i < startday; i++) { // １日の曜日までの空欄\r\n");
      out.write("\t\t\t\t\t\tif (count % 7 == 0) {\r\n");
      out.write("\t\t\t\t\t\t\tdocument.write('<tr>');\r\n");
      out.write("\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\tdocument.write('<td> </td>');\r\n");
      out.write("\t\t\t\t\t\t++count;\r\n");
      out.write("\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\tfor (i = 1; i <= enddate; i++) { // 日付を書き出す\r\n");
      out.write("\t\t\t\t\t\tif (count % 7 == 0) {\r\n");
      out.write("\t\t\t\t\t\t\tdocument.write('<tr>');\r\n");
      out.write("\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\tdocument\r\n");
      out.write("\t\t\t\t\t\t\t\t.write('<td align=\"center\" valign=\"top\" height=\"50\" style=\"font-size:20px\"');\r\n");
      out.write("\t\t\t\t\t\tif (count % 7 == 0) {\r\n");
      out.write("\t\t\t\t\t\t\tdocument.write(' style=\"color:red\"');\r\n");
      out.write("\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\tif (count % 7 == 6) {\r\n");
      out.write("\t\t\t\t\t\t\tdocument.write(' style=\"color:blue\"');\r\n");
      out.write("\t\t\t\t\t\t}\r\n");
      out.write("// \t\t\t\t\t\tイベント色付け予定地\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\tif(month == 1 && i >= 9 && i <= 15){\r\n");
      out.write("\t\t\t\t\t\tdocument.write(' bgcolor=\"#eed777\"');\r\n");
      out.write("\t\t\t\t\t\t}\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\tif(month == 1 && i == 13){\r\n");
      out.write("\t\t\t\t\t\t\tday = i;\r\n");
      out.write("\t\t\t\t\t\t\tdocument.write('>', i,\"<br><a href='#' onClick=dayClick(month,day)>個</a>\", '</td>');\r\n");
      out.write("\t\t\t\t\t\t}else{\r\n");
      out.write("\t\t\t\t\t\tdocument.write('>', i, '</td>')\t\t;\r\n");
      out.write("\t\t\t\t\t\t}\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t++count;\r\n");
      out.write("\t\t\t\t\t\tif (count % 7 == 0) {\r\n");
      out.write("\t\t\t\t\t\t\tdocument.write('</tr>');\r\n");
      out.write("\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\twhile (count % 7 != 0) { // 最後の日から土曜までの空欄\r\n");
      out.write("\t\t\t\t\t\tdocument\r\n");
      out.write("\t\t\t\t\t\t\t\t.write('<td height=\"50\" style=\"font-size:20px\"> </td>');\r\n");
      out.write("\t\t\t\t\t\t++count;\r\n");
      out.write("\t\t\t\t\t\tif (count % 7 == 0) {\r\n");
      out.write("\t\t\t\t\t\t\tdocument.write('</tr>');\r\n");
      out.write("\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t</script>\r\n");
      out.write("\t\t\t</table>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t<br>\r\n");
      out.write("\r\n");
      out.write("\t\t\t<!--イベントテキスト-->\r\n");
      out.write("\t\t\t");

				for (int i = 0; i < schedule.size(); i++) {
					ScheduleForBean s = schedule.get(i);
			
      out.write("\r\n");
      out.write("\t\t\t");

				if (s.getEventEnd() != null) {
			
      out.write("\r\n");
      out.write("\t\t\t");
      out.print(s.getEventStart().substring(0,10));
      out.write("\r\n");
      out.write("\t\t\t-\r\n");
      out.write("\t\t\t");
      out.print(s.getEventEnd().substring(0,10));
      out.write("<br>\r\n");
      out.write("\r\n");
      out.write("\t\t\t");
      out.print(s.getEventName());
      out.write("\r\n");
      out.write("\t\t\t<div id=\"Ikkatu\">");
      out.print(s.getEventContent());
      out.write("</div>\r\n");
      out.write("\t\t\t<br>\r\n");
      out.write("\t\t\t");

				}
			
      out.write("\r\n");
      out.write("\t\t\t");

				}
			
      out.write("\r\n");
      out.write("\t\t\t<div id=\"com\">※個表記のある日は日別イベント有</div>\r\n");
      out.write("\t\t\t<br>\r\n");
      out.write("\t\t\t<!--編集ボタン-->\r\n");
      out.write("\t\t\t<div id=\"button\">\r\n");
      out.write("\t\t\t\t<button type=\"button\" style=\"WIDTH: 100px; HEIGHT: 30px\"\r\n");
      out.write("\t\t\t\t\tonclick=\"location.href='/sotukenD/ForScheduleEditServlet'\">\r\n");
      out.write("\t\t\t\t\t編集</button>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</section>\r\n");
      out.write("\t</div>\r\n");
      out.write("\r\n");
      out.write("\t<input type=\"hidden\" id=\"x\" name=\"x\">\r\n");
      out.write("\t<input type=\"hidden\" id=\"y\" name=\"y\">\r\n");
      out.write("\t<input type=\"hidden\" id=\"year\" name=\"year\">\r\n");
      out.write("\t<input type=\"hidden\" id=\"monthA\" name=\"monthA\">\r\n");
      out.write("\t</form>\r\n");
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
