package org.apache.jsp.mail;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import jp.ac.fjb.sotukenD.bean.MailFormBeans;

public final class mail_jsp extends org.apache.jasper.runtime.HttpJspBase
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
 MailFormBeans mail = (MailFormBeans)session.getAttribute("USER_MAILJ"); 
      out.write("\r\n");
      out.write("<head>\r\n");
      out.write("    <meta charset=\"utf-8\" />\r\n");
      out.write("    <title>受信箱</title>\r\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"./css/style.css\" />\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<div class=\"frm\">\r\n");
      out.write("\t<!--header部分-->\r\n");
      out.write("\t<header id=\"header\">\r\n");
      out.write("\t\t<div id=\"title\">\r\n");
      out.write("\t\t\t受信メール\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div id=\"account\" align=\"right\">\r\n");
      out.write("\t\t\t<div id=\"name\"></div>\r\n");
      out.write("\t\t\t<!--ログアウトボタン-->\r\n");
      out.write("\t\t\t\t<button type=\"button\" id=\"logout\">ログアウト</button>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div>　\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t</header>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t<!--ページ移動、ナビゲーション部分-->\r\n");
      out.write("\t<nav id=\"nav\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t<iframe src=\"./mainMenu.jsp\" name=\"mainMenu\" Align=\"left\" Frameborder=\"no\" Marginheight=\"0\" Width=\"200\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t</iframe>\r\n");
      out.write("\r\n");
      out.write("\t</nav>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t<!--作業画面-->\r\n");
      out.write("\t<section id=\"mainContent\">\r\n");
      out.write("\t\t");
 MailFormBeans mm = mail; 
      out.write("\r\n");
      out.write("\t\t送信者<br />\r\n");
      out.write("\t\t<input type=\"text\" value=\"");
      out.print(mm.getUserName() );
      out.write("\"><br />\r\n");
      out.write("\t\t件名<br />\r\n");
      out.write("\t\t<input type=\"text\" value=\"");
      out.print(mm.getTitle() );
      out.write("\"><br />\r\n");
      out.write("\t\t本文<br />\r\n");
      out.write("\t\t<TEXTAREA cols=\"75\" rows=\"18\" name=\"maneText\" >");
      out.print(mm.getMain() );
      out.write("</TEXTAREA><br />\r\n");
      out.write("\t\t<INPUT type=\"button\" name=\"answer\" value=\"戻る\" style=\"WIDTH: 50px; HEIGHT: 30px; float:left;\"\r\n");
      out.write("\t\tonclick=\"location.href='/sotukenD/main.jsp'\"/>\r\n");
      out.write("\t\t<INPUT type=\"button\" name=\"answer\" value=\"返信\" style=\"WIDTH: 50px; HEIGHT: 30px; float:right;\r\n");
      out.write("\t\tmargin-right:20px;\"onclick=\"location.href='/sotukenD/MailSServlet'\"/>\r\n");
      out.write("\r\n");
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
