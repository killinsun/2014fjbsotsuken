package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import jp.ac.fjb.onsen.bean.UserBean;

public final class Login_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("\t<head>\r\n");
      out.write("\t\t<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\r\n");
      out.write("\t\t<meta http-equiv=\"Content-Style-Type\" content=\"text/css\" />\r\n");
      out.write("\t\t<meta http-equiv=\"Content-Script-Type\" content=\"text/javascript\" />\r\n");
      out.write("\t\t<meta http-equiv=\"imagetoolbar\" content=\"no\" />\r\n");
      out.write("\t\t<meta name=\"description\" content=\"\" />\r\n");
      out.write("\t\t<meta name=\"keywords\" content=\"\" />\r\n");
      out.write("\t\t<link rel=\"stylesheet\" href=\"css/rogin.css\" type=\"text/css\" />\r\n");
      out.write("\t\t<script type=\"text/javascript\" src=\"js/jquery.js\"></script>\r\n");
      out.write("\t\t<script type=\"text/javascript\" src=\"js/common.js\"></script>\r\n");
      out.write("\t\t<title>温ラインショップ</title>\r\n");
      out.write("\t</head>\r\n");
      out.write("\r\n");
      out.write("\t<body>\r\n");
      out.write("\t\t<div id=\"top\">\r\n");
      out.write("\t\t\t<div id=\"headWrap\">\r\n");
      out.write("\t\t\t\t<div id=\"header\">\r\n");
      out.write("\t\t\t\t\t<h1><a href=\"index.html\"><img src=\"images/rogo2.png\" alt=\"\" /></a></h1>\r\n");
      out.write("\t\t\t\t\t<div id=\"pr\">\r\n");
      out.write("\t\t\t\t\t<p>温泉を紹介します。</p>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div><!-- /#header -->\r\n");
      out.write("\t\t\t</div><!-- /#headWrap -->\r\n");
      out.write("\r\n");
      out.write("\t\t\t<div id=\"menu\">\r\n");
      out.write("\t\t\t\t<ul>\r\n");
      out.write("\t\t\t\t<li class=\"home\"><a href=\"HomeServlet\">ホーム</a></li>\r\n");
      out.write("\t\t\t\t<li><a href=\"index.html\">ショップ</a></li></ul>\r\n");
      out.write("\t\t\t\t<li><a href=\"LoginServlet\">マイページ</a></li>\r\n");
      out.write("\t\t\t\t<li><a href=\"index.html\">ゲーム</a></li>\r\n");
      out.write("\t\t\t\t</ul>\r\n");
      out.write("\t\t\t</div><!-- /#menu -->\r\n");
      out.write("\r\n");
      out.write("\t\t\t<div id=\"contents\">\r\n");
      out.write("\t\t\t\t<div class=\"area\">\r\n");
      out.write("\t\t\t\t\t<hr color=\"#ff8c00\" size=\"5\">\r\n");
      out.write("\t\t\t\t\t<h1 align=\"center\">ログイン画面</h1>\r\n");
      out.write("\t\t\t\t\t<hr color=\"#ff8c00\" size=\"5\">\r\n");
      out.write("\t\t\t\t\t<br><br>\r\n");
      out.write("<form action=\"/onsen/LoginServlet\">\r\n");
      out.write("\t\t\t\t\t");

					if(session.getAttribute("ERROR_LOGIN")!=null)
						out.print(session.getAttribute("ERROR_LOGIN"));
					
      out.write("\r\n");
      out.write("\t\t\t\t\t<table summary=\"\" align=\"center\" height=\"120px\">\r\n");
      out.write("\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t<td width=\"140\"><font size=\"5\">ID</font></td>\r\n");
      out.write("\t\t\t\t\t\t\t<td><input type=\"text\" name=\"id\" value=\"on13000\" required></td>\r\n");
      out.write("\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t<td width=\"140px\"><font size=\"5\">Password</font></td>\r\n");
      out.write("\t\t\t\t\t\t\t<td><input type=\"password\" name=\"pass\" value=\"\" required></td>\r\n");
      out.write("\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t</table><br>\r\n");
      out.write("\t\t\t\t\t<table summary=\"\" align=\"center\" width=\"330\">\r\n");
      out.write("\t\t\t\t\t\t<tr align=\"center\">\r\n");
      out.write("\t\t\t\t\t\t\t<td><input type=\"image\"  src=\"images/roginBtn.png\" alt=\"\" width=\"150\"></td>\r\n");
      out.write("\t\t\t\t\t\t\t<td><a href=\"touroku.html\"><img src=\"images/sinkiTourokuBtn.png\" alt=\"\" width=\"150\"></a></td>\r\n");
      out.write("\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t</table>\r\n");
      out.write("</form>\r\n");
      out.write("\t\t\t\t\t<br><br>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div><!-- /#contents -->\r\n");
      out.write("\r\n");
      out.write("\t\t\t<div id=\"footer\">\r\n");
      out.write("\t\t\t\t<div class=\"copyright\">Copyright &copy; 2011 YOUR SITE NAME All Rights Reserved.</div>\r\n");
      out.write("\t\t\t</div><!-- /#footer -->\r\n");
      out.write("\t\t</div><!-- /#top -->\r\n");
      out.write("\t</body>\r\n");
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
