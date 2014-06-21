package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import jp.ac.fjb.sns.bean.UserBean;

public final class A102UserList_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<link rel=\"StyleSheet\" type=\"text/css\" href=\"css/userList.css\" />\r\n");
      out.write("<script type=\"text/javascript\" src=\"js/screenTransition.js\"></script>\r\n");
      out.write("    <title>ConVertion</title>\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body style=\"background:#FFE4E1\">\r\n");
      out.write("<form id=\"form\" name=\"form\" action=\"\">\r\n");
      out.write("<div id=\"Logo\"><img src=\"img/logo/logo.png\" height=\"100\" width=\"200\" alt=\"タイトルロゴ\"></div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<div ul=\"SubMenu\" style=\"list-style:none\" id=\"SubMenu\">\r\n");
      out.write("<li style=\"float:right\"><input type=\"submit\"  id=\"Button\" style=\"WIDTH: 70px; HEIGHT: 30px\" value=\"LogOut\" onClick=\"goMainServlet('-1');\"></li>\r\n");
      out.write("<li style=\"float:right\"><input type=\"submit\"  id=\"Button\" style=\"WIDTH: 70px; HEIGHT: 30px\" value=\"Profile\" onClick=\"goProfileServlet();\"></li>\r\n");
      out.write("<li style=\"float:right\"><input type=\"submit\"  id=\"Button\" style=\"WIDTH: 70px; HEIGHT: 30px\" value=\"Help\"  disabled></li>\r\n");
      out.write("<li style=\"float:right\"><input type=\"submit\"  id=\"Button\" style=\"WIDTH: 70px; HEIGHT: 30px\" value=\"Home\" onClick=\"goMainServlet();\"></li>\r\n");
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
      out.write("\t<b>ユーザ一覧</b><input type=\"submit\" id=\"createUser\" style=\"WIDTH: 110px; HEIGHT: 30px\" value=\"ユーザ新規登録 \" onClick=\"goCreateUserServlet();\"><input type=\"button\" id=\"usersearch\" style=\"WIDTH: 110px; HEIGHT: 30px\" value=\"ユーザ検索\"><input type=\"button\" id=\"useredit\" style=\"WIDTH: 110px; HEIGHT: 30px\" value=\"ユーザ情報変更\"><input type=\"button\" id=\"userdel\" style=\"WIDTH: 110px; HEIGHT: 30px\" value=\"ユーザ消去\">\r\n");
      out.write("\t<div id=\"list\">\r\n");
      out.write("\t\t<table id=\"userList\" border=\"1\" bgcolor=\"white\">\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<th>選択</th>\r\n");
      out.write("\t\t\t\t<th>ユーザID</th>\r\n");
      out.write("\t\t\t\t<th>ユーザ名</th>\r\n");
      out.write("\t\t\t\t<th>権限</th>\r\n");
      out.write("\t\t\t\t<th>部署</th>\r\n");
      out.write("\t\t\t\t<th>役職</th>\r\n");
      out.write("\t\t\t\t<th>勤務地</th>\r\n");
      out.write("\t\t\t\t<th>連絡先</th>\r\n");
      out.write("\t\t\t\t<th>Eメール</th>\r\n");
      out.write("\t\t\t\t<th>住所</th>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td><input type=\"checkbox\" id=\"select\" value=\"0\"></td>\r\n");
      out.write("\t\t\t\t<td>x11g031</td>\r\n");
      out.write("\t\t\t\t<td>吉田 優徳</td>\r\n");
      out.write("\t\t\t\t<td>ADMIN.</td>\r\n");
      out.write("\t\t\t\t<td>代表取締役</td>\r\n");
      out.write("\t\t\t\t<td>社長</td>\r\n");
      out.write("\t\t\t\t<td>本社</td>\r\n");
      out.write("\t\t\t\t<td></td>\r\n");
      out.write("\t\t\t\t<td></td>\r\n");
      out.write("\t\t\t\t<td></td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td><input type=\"checkbox\" id=\"select\" value=\"1\"></td>\r\n");
      out.write("\t\t\t\t<td>x11g023</td>\r\n");
      out.write("\t\t\t\t<td>奈須 健太</td>\r\n");
      out.write("\t\t\t\t<td>USER</td>\r\n");
      out.write("\t\t\t\t<td>総務部</td>\r\n");
      out.write("\t\t\t\t<td>部長</td>\r\n");
      out.write("\t\t\t\t<td>本社</td>\r\n");
      out.write("\t\t\t\t<td></td>\r\n");
      out.write("\t\t\t\t<td></td>\r\n");
      out.write("\t\t\t\t<td></td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td><input type=\"checkbox\" id=\"select\" value=\"2\"></td>\r\n");
      out.write("\t\t\t\t<td>x11g005</td>\r\n");
      out.write("\t\t\t\t<td>石橋 太樹</td>\r\n");
      out.write("\t\t\t\t<td>USER</td>\r\n");
      out.write("\t\t\t\t<td>総務部</td>\r\n");
      out.write("\t\t\t\t<td>部長</td>\r\n");
      out.write("\t\t\t\t<td>支社</td>\r\n");
      out.write("\t\t\t\t<td></td>\r\n");
      out.write("\t\t\t\t<td></td>\r\n");
      out.write("\t\t\t\t<td></td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td><input type=\"checkbox\" id=\"select\" value=\"3\"></td>\r\n");
      out.write("\t\t\t\t<td>x11g029</td>\r\n");
      out.write("\t\t\t\t<td>山本 樹</td>\r\n");
      out.write("\t\t\t\t<td>USER</td>\r\n");
      out.write("\t\t\t\t<td>総務部</td>\r\n");
      out.write("\t\t\t\t<td>部長</td>\r\n");
      out.write("\t\t\t\t<td>支社</td>\r\n");
      out.write("\t\t\t\t<td></td>\r\n");
      out.write("\t\t\t\t<td></td>\r\n");
      out.write("\t\t\t\t<td></td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td><input type=\"checkbox\" id=\"select\" value=\"4\"></td>\r\n");
      out.write("\t\t\t\t<td>x11g017</td>\r\n");
      out.write("\t\t\t\t<td>鈴木 健太</td>\r\n");
      out.write("\t\t\t\t<td>USER</td>\r\n");
      out.write("\t\t\t\t<td>総務部</td>\r\n");
      out.write("\t\t\t\t<td>部長</td>\r\n");
      out.write("\t\t\t\t<td>支社</td>\r\n");
      out.write("\t\t\t\t<td></td>\r\n");
      out.write("\t\t\t\t<td></td>\r\n");
      out.write("\t\t\t\t<td></td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td><input type=\"checkbox\" id=\"select\" value=\"5\"></td>\r\n");
      out.write("\t\t\t\t<td>x11g000</td>\r\n");
      out.write("\t\t\t\t<td>船橋 太郎</td>\r\n");
      out.write("\t\t\t\t<td>ADMIN.</td>\r\n");
      out.write("\t\t\t\t<td>開発部</td>\r\n");
      out.write("\t\t\t\t<td>執行役員</td>\r\n");
      out.write("\t\t\t\t<td>本社</td>\r\n");
      out.write("\t\t\t\t<td></td>\r\n");
      out.write("\t\t\t\t<td></td>\r\n");
      out.write("\t\t\t\t<td></td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td><input type=\"checkbox\" id=\"select\" value=\"6\"></td>\r\n");
      out.write("\t\t\t\t<td>x11g---</td>\r\n");
      out.write("\t\t\t\t<td>-----</td>\r\n");
      out.write("\t\t\t\t<td>---</td>\r\n");
      out.write("\t\t\t\t<td>-----</td>\r\n");
      out.write("\t\t\t\t<td>---</td>\r\n");
      out.write("\t\t\t\t<td>--</td>\r\n");
      out.write("\t\t\t\t<td></td>\r\n");
      out.write("\t\t\t\t<td></td>\r\n");
      out.write("\t\t\t\t<td></td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td><input type=\"checkbox\" id=\"select\" value=\"7\"></td>\r\n");
      out.write("\t\t\t\t<td>x11g---</td>\r\n");
      out.write("\t\t\t\t<td>-----</td>\r\n");
      out.write("\t\t\t\t<td>---</td>\r\n");
      out.write("\t\t\t\t<td>-----</td>\r\n");
      out.write("\t\t\t\t<td>---</td>\r\n");
      out.write("\t\t\t\t<td>--</td>\r\n");
      out.write("\t\t\t\t<td></td>\r\n");
      out.write("\t\t\t\t<td></td>\r\n");
      out.write("\t\t\t\t<td></td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td><input type=\"checkbox\" id=\"select\" value=\"8\"></td>\r\n");
      out.write("\t\t\t\t<td>x11g---</td>\r\n");
      out.write("\t\t\t\t<td>-----</td>\r\n");
      out.write("\t\t\t\t<td>---</td>\r\n");
      out.write("\t\t\t\t<td>-----</td>\r\n");
      out.write("\t\t\t\t<td>---</td>\r\n");
      out.write("\t\t\t\t<td>--</td>\r\n");
      out.write("\t\t\t\t<td></td>\r\n");
      out.write("\t\t\t\t<td></td>\r\n");
      out.write("\t\t\t\t<td></td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td><input type=\"checkbox\" id=\"select\" value=\"9\"></td>\r\n");
      out.write("\t\t\t\t<td>x11g---</td>\r\n");
      out.write("\t\t\t\t<td>-----</td>\r\n");
      out.write("\t\t\t\t<td>---</td>\r\n");
      out.write("\t\t\t\t<td>-----</td>\r\n");
      out.write("\t\t\t\t<td>---</td>\r\n");
      out.write("\t\t\t\t<td>--</td>\r\n");
      out.write("\t\t\t\t<td></td>\r\n");
      out.write("\t\t\t\t<td></td>\r\n");
      out.write("\t\t\t\t<td></td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td><input type=\"checkbox\" id=\"select\" value=\"10\"></td>\r\n");
      out.write("\t\t\t\t<td>x11g---</td>\r\n");
      out.write("\t\t\t\t<td>-----</td>\r\n");
      out.write("\t\t\t\t<td>---</td>\r\n");
      out.write("\t\t\t\t<td>-----</td>\r\n");
      out.write("\t\t\t\t<td>---</td>\r\n");
      out.write("\t\t\t\t<td>--</td>\r\n");
      out.write("\t\t\t\t<td></td>\r\n");
      out.write("\t\t\t\t<td></td>\r\n");
      out.write("\t\t\t\t<td></td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td><input type=\"checkbox\" id=\"select\" value=\"11\"></td>\r\n");
      out.write("\t\t\t\t<td>x11g---</td>\r\n");
      out.write("\t\t\t\t<td>-----</td>\r\n");
      out.write("\t\t\t\t<td>---</td>\r\n");
      out.write("\t\t\t\t<td>-----</td>\r\n");
      out.write("\t\t\t\t<td>---</td>\r\n");
      out.write("\t\t\t\t<td>--</td>\r\n");
      out.write("\t\t\t\t<td></td>\r\n");
      out.write("\t\t\t\t<td></td>\r\n");
      out.write("\t\t\t\t<td></td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td><input type=\"checkbox\" id=\"select\" value=\"12\"></td>\r\n");
      out.write("\t\t\t\t<td>x11g---</td>\r\n");
      out.write("\t\t\t\t<td>-----</td>\r\n");
      out.write("\t\t\t\t<td>---</td>\r\n");
      out.write("\t\t\t\t<td>-----</td>\r\n");
      out.write("\t\t\t\t<td>---</td>\r\n");
      out.write("\t\t\t\t<td>--</td>\r\n");
      out.write("\t\t\t\t<td></td>\r\n");
      out.write("\t\t\t\t<td></td>\r\n");
      out.write("\t\t\t\t<td></td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td><input type=\"checkbox\" id=\"select\" value=\"13\"></td>\r\n");
      out.write("\t\t\t\t<td>x11g---</td>\r\n");
      out.write("\t\t\t\t<td>-----</td>\r\n");
      out.write("\t\t\t\t<td>---</td>\r\n");
      out.write("\t\t\t\t<td>-----</td>\r\n");
      out.write("\t\t\t\t<td>---</td>\r\n");
      out.write("\t\t\t\t<td>--</td>\r\n");
      out.write("\t\t\t\t<td></td>\r\n");
      out.write("\t\t\t\t<td></td>\r\n");
      out.write("\t\t\t\t<td></td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td><input type=\"checkbox\" id=\"select\" value=\"14\"></td>\r\n");
      out.write("\t\t\t\t<td>x11g---</td>\r\n");
      out.write("\t\t\t\t<td>-----</td>\r\n");
      out.write("\t\t\t\t<td>---</td>\r\n");
      out.write("\t\t\t\t<td>-----</td>\r\n");
      out.write("\t\t\t\t<td>---</td>\r\n");
      out.write("\t\t\t\t<td>--</td>\r\n");
      out.write("\t\t\t\t<td></td>\r\n");
      out.write("\t\t\t\t<td></td>\r\n");
      out.write("\t\t\t\t<td></td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td><input type=\"checkbox\" id=\"select\" value=\"15\"></td>\r\n");
      out.write("\t\t\t\t<td>x11g---</td>\r\n");
      out.write("\t\t\t\t<td>-----</td>\r\n");
      out.write("\t\t\t\t<td>---</td>\r\n");
      out.write("\t\t\t\t<td>-----</td>\r\n");
      out.write("\t\t\t\t<td>---</td>\r\n");
      out.write("\t\t\t\t<td>--</td>\r\n");
      out.write("\t\t\t\t<td></td>\r\n");
      out.write("\t\t\t\t<td></td>\r\n");
      out.write("\t\t\t\t<td></td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td><input type=\"checkbox\" id=\"select\" value=\"16\"></td>\r\n");
      out.write("\t\t\t\t<td>x11g---</td>\r\n");
      out.write("\t\t\t\t<td>-----</td>\r\n");
      out.write("\t\t\t\t<td>---</td>\r\n");
      out.write("\t\t\t\t<td>-----</td>\r\n");
      out.write("\t\t\t\t<td>---</td>\r\n");
      out.write("\t\t\t\t<td>--</td>\r\n");
      out.write("\t\t\t\t<td></td>\r\n");
      out.write("\t\t\t\t<td></td>\r\n");
      out.write("\t\t\t\t<td></td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t</table>\r\n");
      out.write("\t</div>\r\n");
      out.write("</div>\r\n");
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
