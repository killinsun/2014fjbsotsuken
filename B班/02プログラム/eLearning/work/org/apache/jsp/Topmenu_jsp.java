package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Topmenu_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">\r\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\">\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\r\n");
      out.write("<meta http-equiv=\"Content-Style-Type\" content=\"text/css\" />\r\n");
      out.write("<meta http-equiv=\"Content-Script-Type\" content=\"text/javascript\" />\r\n");
      out.write("<meta name=\"copyright\" content=\"Nikukyu-Punch\" />\r\n");
      out.write("<title>ログイン</title>\r\n");
      out.write("<link href=\"css/login2.css\" rel=\"stylesheet\" type=\"text/css\" />\r\n");
      out.write("<script type=\"text/javascript\" src=\"js/script.js\"></script>\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("<div id=\"title\">\r\n");
      out.write("<img src=\"images/top_title.gif\">\r\n");
      out.write("</div>\r\n");
      out.write("<div id=\"a\" align=\"center\">\r\n");
      out.write("<div id=\"aikon\">\r\n");
      out.write("<img src=\"images/syasyou+.gif\" id=\"syasyou\" />\r\n");
      out.write("</div>\r\n");
      out.write("<!--ログインメニュー-->\r\n");
      out.write("\r\n");
      out.write("<div id = \"sub\">\r\n");
      out.write("\r\n");
      out.write("<form action=\"/eLearning/TopmenuServlet\" id=\"login\">\r\n");
      out.write("<h3><img src=\"images/sub_menu_midashi_submenu4.gif\" alt=\"ログインメニュー\" width=\"226\" height=\"32\" /></h3>\r\n");
      out.write("<ul class=\"menubottom\">\r\n");
      out.write("<p>　ID　<input type=\"text\" name=\"ID\" value=\"\" align=\"center\"></p>\r\n");
      out.write("<p>PASS<input type=\"password\" name=\"PASS\" value=\"\" ></p>\r\n");
      out.write("<br>\r\n");
      out.write("\r\n");
      out.write("<p style=\"color: red\">\r\n");
      out.write("\r\n");
 if(request.getAttribute("ERROR_LOGIN") != null){ 
      out.write('\r');
      out.write('\n');
      out.print( request.getAttribute("ERROR_LOGIN") );
      out.write('\r');
      out.write('\n');
 }
      out.write("\r\n");
      out.write("\r\n");
      out.write("</p>\r\n");
      out.write("\r\n");
      out.write("<input type=\"submit\"  value=\"ログイン\"><br>\r\n");
      out.write("新規登録は<a href=\"touroku.html\">こちら</a>\r\n");
      out.write("</ul>\r\n");
      out.write("</form>\r\n");
      out.write("\r\n");
      out.write("</div>\r\n");
      out.write("</div>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
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
