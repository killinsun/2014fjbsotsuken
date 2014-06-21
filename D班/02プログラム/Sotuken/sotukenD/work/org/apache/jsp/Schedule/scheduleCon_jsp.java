package org.apache.jsp.Schedule;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import jp.ac.fjb.sotukenD.bean.ScheduleForBean;
import java.util.ArrayList;

public final class scheduleCon_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\">\r\n");
      out.write("\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"utf-8\" />\r\n");
      out.write("<title>レイアウトテスト</title>\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"/sotukenD/css/style.css\" />\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"/sotukenD/css/Schedule.css\" />\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t<div class=\"frm\">\r\n");
      out.write("\t\t<!--header部分-->\r\n");
      out.write("\t\t<header id=\"header\">\r\n");
      out.write("\t\t\t<div id=\"title\">スケジュール詳細</div>\r\n");
      out.write("\t\t\t<div id=\"account\" align=\"right\">\r\n");
      out.write("\t\t\t\t<div id=\"name\">苗字 名前</div>\r\n");
      out.write("\t\t\t\t<!--ログアウトボタン-->\r\n");
      out.write("\t\t\t\t<button type=\"button\" id=\"logout\">ログアウト</button>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t</div>\r\n");
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
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t<!--作業画面-->\r\n");
      out.write("\t\t<section id=\"mainContent\">\r\n");
      out.write("\t\t\t<div id=\"today\">\r\n");
      out.write("\t\t\t\t<FONT size=\"6\">");
      out.print( request.getParameter("x") );
      out.write('月');
      out.print( request.getParameter("y") );
      out.write("日 </FONT>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<br> <br> 当日イベント案内：<br>\r\n");
      out.write("\t\t\t\t\t\t");

				for (int i = 0; i < schedule.size(); i++) {
					ScheduleForBean s = schedule.get(i);
				if (s.getEventEnd() == null) {
			
      out.write("\r\n");
      out.write("\t\t\t<div id=\"Kobetu\">\r\n");
      out.write("\t\t\t\t<FONT size=\"4\">");
      out.print(s.getEventContent());
      out.write("</FONT>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t<br> <br> 期間イベント案内：<br>\r\n");
      out.write("\r\n");
      out.write("\t\t\t");

				}else{
			
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t");
      out.print(s.getEventName());
      out.write("\r\n");
      out.write("\t\t\t<div id=\"Ikkatu\"><FONT size=\"4\">");
      out.print(s.getEventContent());
      out.write("</FONT></div>\r\n");
      out.write("\t\t\t");
      out.print(s.getEventStart().substring(0,10));
      out.write("\r\n");
      out.write("\t\t\t-\r\n");
      out.write("\t\t\t");
      out.print(s.getEventEnd().substring(0,10));
      out.write("<br><br>\r\n");
      out.write("\r\n");
      out.write("\t\t\t");

				}
			
      out.write("\r\n");
      out.write("\t\t\t");

				}
			
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write(" <br>\r\n");
      out.write("\t\t\t<button type=\"button\"\r\n");
      out.write("\t\t\t\tonclick=\"location.href='/sotukenD/ForScheduleMainServlet'\">戻る</button>\r\n");
      out.write("\t\t</section>\r\n");
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
