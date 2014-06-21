package org.apache.jsp.Schedule;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import jp.ac.fjb.sotukenD.bean.ScheduleForBean;
import java.util.ArrayList;

public final class scheduleEdit_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\">\r\n");
      out.write("\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"utf-8\" />\r\n");
      out.write("<title>レイアウトテスト</title>\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"/sotukenD/css/style.css\" />\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"/sotukenD/css/Schedule.css\" />\r\n");
      out.write("<script src=\"/sotukenD/js/scheduleEdit.js\"></script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t<form id=\"form\">\r\n");
      out.write("\t\t<div class=\"frm\">\r\n");
      out.write("\t\t\t<!--header部分-->\r\n");
      out.write("\t\t\t<header id=\"header\">\r\n");
      out.write("\t\t\t\t<div id=\"title\">スケジュール編集</div>\r\n");
      out.write("\t\t\t\t<div id=\"account\" align=\"right\">\r\n");
      out.write("\t\t\t\t\t<div id=\"name\">苗字 名前</div>\r\n");
      out.write("\t\t\t\t\t<!--ログアウトボタン-->\r\n");
      out.write("\t\t\t\t\t<button type=\"button\" id=\"logout\">ログアウト</button>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t</header>\r\n");
      out.write("\r\n");
      out.write("\t\t\t<!--ページ移動、ナビゲーション部分-->\r\n");
      out.write("\t\t\t<nav id=\"nav\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<iframe src=\"mainMenu.jsp\" name=\"mainMenu\" Align=\"left\"\r\n");
      out.write("\t\t\t\t\tFrameborder=\"no\" Marginheight=\"0\" Width=\"200\"> </iframe>\r\n");
      out.write("\r\n");
      out.write("\t\t\t</nav>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t<!--作業画面-->\r\n");
      out.write("\t\t\t<section id=\"mainContent\">\r\n");
      out.write("\t\t\t\t<!-- ここから1セット -->\r\n");
      out.write("\t\t\t\t");

					for (int i = 0; i < schedule.size(); i++) {
						ScheduleForBean s = schedule.get(i);
				
      out.write("\r\n");
      out.write("\t\t\t\t");

					if (s.getEventEnd() == null) {
				
      out.write("\r\n");
      out.write("\t\t\t\t<br><br>\r\n");
      out.write("\t\t\t\t");
      out.print(s.getEventStart().substring(0,10));
      out.write("<br> <br>\r\n");
      out.write("\t\t\t\t");
      out.print(s.getEventName());
      out.write("\r\n");
      out.write("\t\t\t\t<div id=\"Kobetu\">\r\n");
      out.write("\t\t\t\t\t");
      out.print(s.getEventContent());
      out.write("\r\n");
      out.write("\t\t\t\t\t");

						String sId = s.getScheduleId();
					
      out.write("\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<br>\r\n");
      out.write("\t\t\t\t<button type=button id=\"editButton\"\r\n");
      out.write("\t\t\t\t\tonclick=\"updateClick('");
      out.print(s.getScheduleId());
      out.write("')\"\r\n");
      out.write("\t\t\t\t\tstyle=\"WIDTH: 100px; HEIGHT: 30px\">更新</button>\r\n");
      out.write("\t\t\t\t<button type=button id=\"deleteButton\"\r\n");
      out.write("\t\t\t\t\tonclick=\"deleteClick('");
      out.print(s.getScheduleId());
      out.write("')\"\r\n");
      out.write("\t\t\t\t\tstyle=\"WIDTH: 100px; HEIGHT: 30px\">削除</button>\r\n");
      out.write("\t\t\t\t");

					} else {
				
      out.write("\r\n");
      out.write("\t\t\t\t<br><br>\r\n");
      out.write("\t\t\t\t");
      out.print(s.getEventStart().substring(0,10));
      out.write("\r\n");
      out.write("\t\t\t\t-\r\n");
      out.write("\t\t\t\t");
      out.print(s.getEventEnd().substring(0,10));
      out.write("<br> <br>\r\n");
      out.write("\t\t\t\t");
      out.print(s.getEventName());
      out.write("\r\n");
      out.write("\t\t\t\t<div id=\"Ikkatu\">\r\n");
      out.write("\t\t\t\t\t");
      out.print(s.getEventContent());
      out.write("\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<br>\r\n");
      out.write("\t\t\t\t<button type=button onclick=\"updateClick('");
      out.print(s.getScheduleId());
      out.write("')\"\r\n");
      out.write("\t\t\t\t\tstyle=\"WIDTH: 100px; HEIGHT: 30px\">更新</button>\r\n");
      out.write("\t\t\t\t<button type=button onclick=\"deleteClick('");
      out.print(s.getScheduleId());
      out.write("')\"\r\n");
      out.write("\t\t\t\t\tstyle=\"WIDTH: 100px; HEIGHT: 30px\">削除</button>\r\n");
      out.write("\t\t\t\t");

					}
				
      out.write("\r\n");
      out.write("\t\t\t\t");

					}

				
      out.write("\r\n");
      out.write("\t\t\t\t<!-- ここまで1セット -->\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<br> <br> <br> <br>\r\n");
      out.write("\t\t\t\t<input type=\"text\" name=\"year1\" id=\"year1\" size=\"2\" maxlength=\"4\">年\r\n");
      out.write("\t\t\t\t<input type=\"text\" name=\"manth1\" id=\"manth1\" size=\"1\" maxlength=\"2\">月\r\n");
      out.write("\t\t\t\t<input type=\"text\" name=\"day1\" id=\"day1\" size=\"1\" maxlength=\"2\">日\r\n");
      out.write("\t\t\t\t-\r\n");
      out.write("\t\t\t\t<input type=\"text\" name=\"year2\" id=\"year\" size=\"2\"  maxlength=\"4\">年\r\n");
      out.write("\t\t\t\t<input type=\"text\" name=\"manth2\" id=\"manth2\" size=\"1\" maxlength=\"2\">月\r\n");
      out.write("\t\t\t\t<input type=\"text\" name=\"day2\" id=\"day2\" size=\"1\" maxlength=\"2\">日\r\n");
      out.write("\t\t\t\t\t<br> <input\r\n");
      out.write("\t\t\t\t\ttype=\"text\" name=\"eventTitle\" id=\"eventTitle\" size=\"45\"\r\n");
      out.write("\t\t\t\t\tmaxlength=\"40\" placeholder=\" イベントタイトルを入力してください\"><br>\r\n");
      out.write("\t\t\t\t<textarea name=\"eventContent\" id=\"eventContent\" cols=\"40\" rows=\"4\"\r\n");
      out.write("\t\t\t\t\tmaxlength=\"40\" placeholder=\"イベント内容を入力してください\"></textarea>\r\n");
      out.write("\t\t\t\t<br>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<button type=button onclick=\"insertClick()\"\r\n");
      out.write("\t\t\t\t\tstyle=\"WIDTH: 100px; HEIGHT: 30px\">登録</button>\r\n");
      out.write("\t\t\t\t<input type=\"reset\" value=\"リセット\" style=\"WIDTH: 100px; HEIGHT: 30px\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<button type=\"button\" style=\"WIDTH: 100px; HEIGHT: 30px\"\r\n");
      out.write("\t\t\t\t\tonclick=\"location.href='/sotukenD/ForScheduleMainServlet'\">戻る</button>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t</section>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<input type=\"hidden\" id=\"scheduleId\" name=\"scheduleId\"> <input\r\n");
      out.write("\t\t\ttype=\"hidden\" id=\"buttonId\" name=\"buttonId\">\r\n");
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
