package org.apache.jsp.Shift;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.ArrayList;
import jp.ac.fjb.sotukenD.bean.ShiftMainBean;
import jp.ac.fjb.sotukenD.bean.LoginFormBeans;

public final class shiftMain_jsp extends org.apache.jasper.runtime.HttpJspBase
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
LoginFormBeans loginBean = (LoginFormBeans) session.getAttribute("LOGIN_USER");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<head>\r\n");
      out.write("    <meta charset=\"utf-8\" />\r\n");
      out.write("    <title>レイアウトテスト</title>\r\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"/sotukenD/css/style.css\" />\r\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"/sotukenD/css/calendar.css\" />\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<div class=\"frm\">\r\n");
      out.write("\t<!--header部分-->\r\n");
      out.write("\t<header id=\"header\">\r\n");
      out.write("\t\t\t<div id=\"title\">\r\n");
      out.write("\t\t\tシフト確認\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div id=\"account\" align=\"right\">\r\n");
      out.write("\t<div id=\"name\">");
      out.print(loginBean.getUserName());
      out.write("</div>\r\n");
      out.write("\t\t<!--ログアウトボタン-->\r\n");
      out.write("\t\t\t<button type=\"submit\" id=\"logout\" onclick=\"location.href='/sotukenD/LogoutServlet'\">ログアウト</button>\r\n");
      out.write("\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t<div>\r\n");
      out.write("\t\t　\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t</header>\r\n");
      out.write("\r\n");
      out.write("\t<!--ページ移動、ナビゲーション部分-->\r\n");
      out.write("\t<nav id=\"nav\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t<iframe src=\"/sotukenD/mainMenu.jsp\" name=\"mainMenu\" Align=\"left\" Frameborder=\"no\" Marginheight=\"0\" Width=\"200\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t</iframe>\r\n");
      out.write("\r\n");
      out.write("\t</nav>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t<!--作業画面-->\r\n");
      out.write("\t<section id=\"mainContent\">\r\n");
      out.write("<!-- \t<BUTTON type=\"button\">11月</BUTTON> -->\r\n");
      out.write("<!-- \t<font size=\"5\">12月</font> -->\r\n");
      out.write("<!-- \t<BUTTON type=\"button\">1月</BUTTON> -->\r\n");
      out.write("<table border=\"0\" width=\"150\">\r\n");
      out.write("<tr></tr>\r\n");
      out.write("<tr><td>\r\n");
      out.write("<table align=\"center\" border=\"5\" width=\"500\" cellspacing=\"0\">\r\n");
      out.write("<script language=\"JavaScript\">\r\n");
 ArrayList dayList = (ArrayList)session.getAttribute("DAY_LIST"); 
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t");

	int flag=0;
	
      out.write("\r\n");
      out.write("\tvar a=[];\r\n");
      out.write("\t");

	if(dayList != null && dayList.size()!=0){
		for(int b=0;b<dayList.size();b++){
      out.write("\r\n");
      out.write("\t\t\ta.push(\"");
out.print(((ShiftMainBean)dayList.get(b)).getDay());
      out.write("\");\r\n");
      out.write("\t\t");
}
		flag=1;
		out.print("flag ="+ flag);
	}else{
		out.print("flag ="+flag);
	}
	
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\tdaycount=0;\r\n");
      out.write("    if(location.search.indexOf(\"/\") > 0) {                    // 年月取得\r\n");
      out.write("        query    = new Array();\r\n");
      out.write("        query    = location.search.split(\"/\");\r\n");
      out.write("        year    = parseInt(query[1]);                    // 年\r\n");
      out.write("        month    = parseInt(query[2]);                    // 月\r\n");
      out.write("    }\r\n");
      out.write("    else {\r\n");
      out.write("        today    = new Date();\r\n");
      out.write("        year    = today.getFullYear();                    // 今日の年\r\n");
      out.write("        month    = today.getMonth() + 1;                    // 今日の月\r\n");
      out.write("    }\r\n");
      out.write("    start        = new Date(year + \"/\" + month + \"/1\");\r\n");
      out.write("    startday    = start.getDay();                    // １日の曜日\r\n");
      out.write("    days        = new Array(31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31);\r\n");
      out.write("    if(month == 2 && (year % 4 == 0 && year % 100 != 0 || year % 400 == 0)) {\r\n");
      out.write("        days[1]++;                            // うるう年\r\n");
      out.write("    }\r\n");
      out.write("    enddate        = days[month - 1];                    // 最後の日\r\n");
      out.write("    prevyear    = year;                            // 前月・次月\r\n");
      out.write("    prevmonth    = month - 1;\r\n");
      out.write("    nextyear    = year;\r\n");
      out.write("    nextmonth    = month + 1;\r\n");
      out.write("    if(prevmonth < 1) {\r\n");
      out.write("        prevyear--;\r\n");
      out.write("        prevmonth += 12;\r\n");
      out.write("    }\r\n");
      out.write("    else if(nextmonth > 12) {\r\n");
      out.write("        nextyear++;\r\n");
      out.write("        nextmonth -= 12;\r\n");
      out.write("    }\r\n");
      out.write("    document.write('<tr>');\r\n");
      out.write("    document.write('<td colspan=\"7\" align=\"center\">');\r\n");
      out.write("    document.write(year, '<span style=\"font-size:20px\">年</span>');\r\n");
      out.write("    document.write(month, '<span style=\"font-size:20px\">月</span> ');\r\n");
      out.write("    document.write('</td>');\r\n");
      out.write("    document.write('</tr>');\r\n");
      out.write("    document.write('<tr>');\r\n");
      out.write("    document.write('<td align=\"center\" style=\"font-size:20px;color:red\">日</td>');\r\n");
      out.write("    document.write('<td align=\"center\" style=\"font-size:20px\">月</td>');\r\n");
      out.write("    document.write('<td align=\"center\" style=\"font-size:20px\">火</td>');\r\n");
      out.write("    document.write('<td align=\"center\" style=\"font-size:20px\">水</td>');\r\n");
      out.write("    document.write('<td align=\"center\" style=\"font-size:20px\">木</td>');\r\n");
      out.write("    document.write('<td align=\"center\" style=\"font-size:20px\">金</td>');\r\n");
      out.write("    document.write('<td align=\"center\" style=\"font-size:20px;color:blue\">土</td>');\r\n");
      out.write("    document.write('</tr>');\r\n");
      out.write("    count = 0;\r\n");
      out.write("    for(i = 0 ; i < startday ; i++) {                    // １日の曜日までの空欄\r\n");
      out.write("        if(count % 7 == 0) {\r\n");
      out.write("            document.write('<tr>');\r\n");
      out.write("        }\r\n");
      out.write("        document.write('<td> </td>');\r\n");
      out.write("        ++count;\r\n");
      out.write("    }\r\n");
      out.write("    for(i = 1 ; i <= enddate ; i++) {                    // 日付を書き出す\r\n");
      out.write("        if(count % 7 == 0) {\r\n");
      out.write("            document.write('<tr>');\r\n");
      out.write("        }\r\n");
      out.write("        document.write('<td align=\"center\" valign=\"top\" height=\"50\" style=\"font-size:20px\"');\r\n");
      out.write("        if(count % 7 == 0) {\r\n");
      out.write("            document.write(' style=\"color:red\"');\r\n");
      out.write("        }\r\n");
      out.write("        if(count % 7 == 6) {\r\n");
      out.write("            document.write(' style=\"color:blue\"');\r\n");
      out.write("        }\r\n");
      out.write("\t\tif(flag==1){\r\n");
      out.write("\t\t\tvar aString = a[daycount];\r\n");
      out.write("\t\t\tif(i>9){\r\n");
      out.write("\t\t\t\tvar formatI = i;\r\n");
      out.write("\t\t\t}else{\r\n");
      out.write("\t\t\t\tvar formatI = \"0\"+i;\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        \tif( aString!=null && aString.substring(6,8) == formatI){\r\n");
      out.write("     \t   \t\tdocument.write('>','<a href=\"/sotukenD/ForShiftShowServlet?day=',aString,'\" >', i, '</td>');\r\n");
      out.write("     \t   \t\t++count;\r\n");
      out.write("     \t  \t\t++daycount;\r\n");
      out.write("        \t}else{\r\n");
      out.write("        \t\tdocument.write('>', i, '</td>');\r\n");
      out.write("            \t++count;\r\n");
      out.write("        \t}\r\n");
      out.write("        }else{\r\n");
      out.write("        \tdocument.write('>', i, '</td>');\r\n");
      out.write("        \t++count;\r\n");
      out.write("        }\r\n");
      out.write("        if(count % 7 == 0) {\r\n");
      out.write("            document.write('</tr>');\r\n");
      out.write("        }\r\n");
      out.write("    }\r\n");
      out.write("    while(count % 7 != 0) {                            // 最後の日から土曜までの空欄\r\n");
      out.write("        document.write('<td height=\"50\" style=\"font-size:20px\"> </td>');\r\n");
      out.write("        ++count;\r\n");
      out.write("        if(count % 7 == 0) {\r\n");
      out.write("            document.write('</tr>');\r\n");
      out.write("        }\r\n");
      out.write("    }\r\n");
      out.write("\t</script>\r\n");
      out.write("</table>\r\n");
      out.write("</td>\r\n");
      out.write("</tr>\r\n");
      out.write("</table>\r\n");
      out.write("<button type=\"button\"  onclick=\"location.href='/sotukenD/ForShiftTeiServlet'\">シフト提出</button>\r\n");
      out.write("　　　　　　　　　　　　　　　　　　\r\n");
      out.write("<form action=\"/sotukenD/ForShiftCreateServlet\" method=\"POST\">\r\n");
      out.write("<input type=\"text\" size=10 name=\"day\" id=\"day\"maxlength=\"10\">\r\n");
      out.write("<input type=\"submit\" name=\"createDayButton\" value=\"シフト作成\">\r\n");
      out.write("</form>\r\n");
      out.write("\t</section>\r\n");
      out.write("</div>\r\n");
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
