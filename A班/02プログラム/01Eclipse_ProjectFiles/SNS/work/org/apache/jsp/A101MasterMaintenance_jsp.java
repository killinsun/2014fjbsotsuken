package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import jp.ac.fjb.sns.bean.UserBean;

public final class A101MasterMaintenance_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html;charset=UTF-8");
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

	// ログインユーザの情報
	UserBean loginUser = (UserBean)session.getAttribute("LOGIN_USER");

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\">\r\n");
      out.write("\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\"/>\r\n");
      out.write("<link rel=\"StyleSheet\" type=\"text/css\" href=\"css/masterMaintenance.css\" />\r\n");
      out.write("<script type=\"text/javascript\" src=\"js/screenTransition.js\"></script>\r\n");
      out.write("    <title>ConVertion</title>\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body style=\"background:#FFE4E1\">\r\n");
      out.write("<form id=\"form\" name=\"form\" action=\"\">\r\n");
      out.write("<div id=\"Logo\"><img src=\"img/logo/logo.png\" height=\"100\" width=\"200\" alt=\"タイトルロゴ\"></div>\r\n");
      out.write("\r\n");
      out.write("<div ul=\"SubMenu\" style=\"list-style:none\" id=\"SubMenu\">\r\n");
      out.write("<li style=\"float:right\"><input type=\"submit\"  id=\"Button\" style=\"WIDTH: 70px; HEIGHT: 30px\" value=\"LogOut\" onClick=\"goLoginServlet('-1');\"></li>\r\n");
      out.write("<li style=\"float:right\"><input type=\"submit\"  id=\"Button\" style=\"WIDTH: 70px; HEIGHT: 30px\" value=\"Profile\" onClick=\"goProfileServlet();\"></li>\r\n");
      out.write("\r\n");
      out.write("<li style=\"float:right\"><input type=\"submit\"  id=\"Button\" style=\"WIDTH: 70px; HEIGHT: 30px\" value=\"Help\"  disabled></li>\r\n");
      out.write("<li style=\"float:right\"><input type=\"submit\"  id=\"Button\" style=\"WIDTH: 70px; HEIGHT: 30px\" value=\"Home\" onClick=\"goMainServlet();\">\r\n");
      out.write("</li>\r\n");
      out.write("<li style=\"float:right\"><input type=\"submit\"  id=\"Button\" style=\"WIDTH: 70px; HEIGHT: 30px\" value=\"Admin\" disabled></li>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("\t<div id=\"LoginName\">\r\n");
      out.write("\t\t<div id=\"xLogo\" align=\"center\">\r\n");
      out.write("\t\t\t<img src=\"");
      out.print(loginUser.getSectionImg());
      out.write(".png\"><br />\r\n");
      out.write("\t\t\t<img src=\"");
      out.print(loginUser.getPositionImg());
      out.write("\">\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div id=\"yLogo\"><img src=\"");
      out.print(loginUser.getLevelImg());
      out.write(".png\"></div>\r\n");
      out.write("\t\t<div id=\"zLogo\"><font size=\"4\">いらっしゃいませ。</font><br/><h3 align=\"right\" >");
      out.print(loginUser.getUserName() );
      out.write(" 　様</h3></div>\r\n");
      out.write("\t\t<div id=\"Name\"></div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\r\n");
      out.write("<div id=\"manage\">\r\n");
      out.write("\t<hr>\r\n");
      out.write("\t<h4>マスターメンテナンス</h4>\r\n");
      out.write("\t<input type=\"submit\" id=\"userList\" style=\"WIDTH: 395px; HEIGHT: 80px\"  value=\"ユーザ管理\" onClick=\"goUserListServlet();\">\r\n");
      out.write("\t<input type=\"submit\" id=\"userChangeInfo\" style=\"WIDTH: 395px; HEIGHT: 80px\" value=\"イベント管理\" disabled>\r\n");
      out.write("\t<input type=\"submit\" id=\"userDelete\" style=\"WIDTH: 395px; HEIGHT: 80px\" value=\"お知らせ編集\" disabled><br />\r\n");
      out.write("\t<input type=\"submit\" id=\"eventManage\" style=\"WIDTH: 395px; HEIGHT: 80px\" value=\"SNS設定\" disabled>\r\n");
      out.write("\t<input type=\"submit\" id=\"editNotice\" style=\"WIDTH: 395px; HEIGHT: 80px\" value=\"管理ページ設定\" disabled>\r\n");
      out.write("\t<input type=\"button\" id=\"userManage\" style=\"WIDTH: 395px; HEIGHT: 80px\" value=\"?\" disabled><br />\r\n");
      out.write("\t<input type=\"button\" id=\"userManage\" style=\"WIDTH: 395px; HEIGHT: 80px\" value=\"?\" disabled>\r\n");
      out.write("\t<input type=\"button\" id=\"userManage\" style=\"WIDTH: 395px; HEIGHT: 80px\" value=\"?\" disabled>\r\n");
      out.write("\t<input type=\"button\" id=\"userManage\" style=\"WIDTH: 395px; HEIGHT: 80px\" value=\"?\" disabled>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("</form>\r\n");
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
