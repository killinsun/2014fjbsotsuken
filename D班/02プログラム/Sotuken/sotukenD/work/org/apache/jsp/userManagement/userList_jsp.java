package org.apache.jsp.userManagement;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.ArrayList;
import jp.ac.fjb.sotukenD.bean.UserListBean;
import jp.ac.fjb.sotukenD.bean.LoginFormBeans;

public final class userList_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");

	LoginFormBeans loginBean = (LoginFormBeans) session
			.getAttribute("LOGIN_USER");

      out.write('\r');
      out.write('\n');

	ArrayList<UserListBean> list = (ArrayList) session
			.getAttribute("USER_LIST");

      out.write("\r\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\">\r\n");
      out.write("<head>\r\n");
      out.write("<script src=\"/sotukenD/js/UserSign.js\"></script>\r\n");
      out.write("<meta charset=\"utf-8\" />\r\n");
      out.write("<title>レイアウトテスト</title>\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"/sotukenD/css/style.css\" />\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"renraku.css\" />\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t<div class=\"frm\">\r\n");
      out.write("\t\t<!--header部分-->\r\n");
      out.write("\t\t<header id=\"header\">\r\n");
      out.write("\t\t\t<div id=\"title\">ユーザー管理画面</div>\r\n");
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
      out.write("\r\n");
      out.write("\t\t<!--作業画面-->\r\n");
      out.write("\t\t<section id=\"mainContent\">\r\n");
      out.write("\t\t\t<div id=\"zentai\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<table border=\"0\" width=\"100%\" height=\"15\" cellpadding=\"2\"\r\n");
      out.write("\t\t\t\t\tcellspacing=\"1\" bgcolor=\"#002047\">\r\n");
      out.write("\t\t\t\t</table>\r\n");
      out.write("\t\t\t\t<form action=\"\" id=\"ListForm\">\r\n");
      out.write("\t\t\t\t\t<!--ここから-->\r\n");
      out.write("\t\t\t\t\t<table border=\"0\" width=\"100%\" cellpadding=\"2\" cellspacing=\"1\"\r\n");
      out.write("\t\t\t\t\t\tbgcolor=\"#002047\">\r\n");
      out.write("\t\t\t\t\t\t");

							for (int i = 0; i < list.size(); i++) {
								UserListBean listBean = list.get(i);
						
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<tr bgcolor=\"#FFFFFF\" id=\"");
      out.print(i);
      out.write("\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t<td width=\"13%\"><font size=\"2\"> ");
      out.print(listBean.getListUserId());
      out.write("</font>\r\n");
      out.write("\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t<td width=\"30%\"><font size=\"3\">");
      out.print(listBean.getListUserName());
      out.write("</font>\r\n");
      out.write("\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<button type=\"submit\" style=\"WIDTH: 80px; HEIGHT: 23px;\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\tid=\"editButton\" name=\"editButton\" onClick=\"goEditServlet(0);\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\tvalue=\"");
      out.print(listBean.getListUserId());
      out.write("\">編集</button>\r\n");
      out.write("\t\t\t\t\t\t\t\t<button type=\"submit\" style=\"WIDTH: 80px; HEIGHT: 23px;\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\tid=\"deleteButton\" name=\"deleteButton\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\tonClick=\"goListServlet('2');\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\tvalue=\"");
      out.print(listBean.getListUserId());
      out.write("\">削除</button></td>\r\n");
      out.write("\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t");

							}
						
      out.write("\r\n");
      out.write("\t\t\t\t\t</table>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t<input type=\"hidden\" id=\"progId\" name=\"progId\" value=\"\">\r\n");
      out.write("\t\t\t\t\t<button type=\"submit\" id=\"signButton\" onClick=\"goSignServlet();\"\r\n");
      out.write("\t\t\t\t\t\tstyle=\"WIDTH: 100px; HEIGHT: 35px;\">新規登録</button>\r\n");
      out.write("\t\t\t\t</form>\r\n");
      out.write("\t\t\t</div>\r\n");
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
