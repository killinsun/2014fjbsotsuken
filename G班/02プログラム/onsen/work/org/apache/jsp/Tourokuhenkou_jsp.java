package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import jp.ac.fjb.onsen.bean.UserBean;

public final class Tourokuhenkou_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html; charaset=UTF-8;charset=UTF-8");
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

	UserBean loginUser = (UserBean) session.getAttribute("LOGIN_USER");

      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">\r\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\" xml:lang=\"ja\" lang=\"ja\">\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\r\n");
      out.write("<meta http-equiv=\"Content-Style-Type\" content=\"text/css\" />\r\n");
      out.write("<meta http-equiv=\"Content-Script-Type\" content=\"text/javascript\" />\r\n");
      out.write("<meta http-equiv=\"imagetoolbar\" content=\"no\" />\r\n");
      out.write("<meta name=\"description\" content=\"\" />\r\n");
      out.write("<meta name=\"keywords\" content=\"\" />\r\n");
      out.write("<link rel=\"stylesheet\" href=\"css/reg.css\" type=\"text/css\" />\r\n");
      out.write("<script type=\"text/javascript\" src=\"js/jquery.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"js/common.js\"></script>\r\n");
      out.write("<title>温ラインショップ</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t<div id=\"top\">\r\n");
      out.write("\t\t<div id=\"headWrap\">\r\n");
      out.write("\t\t\t<div id=\"header\">\r\n");
      out.write("\t\t\t\t<h1>\r\n");
      out.write("\t\t\t\t\t<a href=\"index.html\"><img src=\"images/rogo2.png\" alt=\"\" />\r\n");
      out.write("\t\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t</h1>\r\n");
      out.write("\t\t\t\t<div id=\"gnavi\">\r\n");
      out.write("\t\t\t\t\t<ul>\r\n");
      out.write("\t\t\t\t\t\t<li><font size=\"4\">ようこそ!! ");
      out.print(session.getAttribute("LOGIN_USERsei"));
      out.write("さん</font>\r\n");
      out.write("\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t<li><font size=\"4\" color='green'><a href=\"LoginServlet\">ログアウト</a>\r\n");
      out.write("\t\t\t\t\t\t</font>\r\n");
      out.write("\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<!-- /#header -->\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<!-- /#headWrap -->\r\n");
      out.write("\t\t<div id=\"menu\">\r\n");
      out.write("\t\t\t<ul>\r\n");
      out.write("\t\t\t<li class=\"home\"><a href=\"HomeServlet\"  id=\"home\">ホーム</a></li>\r\n");
      out.write("\t\t\t<li><a href=\"STopServlet\" id=\"shop\">ショップ</a></li>\r\n");
      out.write("\t\t\t<li><a href=\"\" id=\"mypage\">マイページ</a></li>\r\n");
      out.write("\t\t\t<li><a href=\"Game.jsp\" id=\"game\">ゲーム</a></li>\r\n");
      out.write("\t\t\t</ul>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<!-- /#menu -->\r\n");
      out.write("\t\t<form action=\"/onsen/MTourokucommitServlet\">\r\n");
      out.write("\t\t<div id=\"contents\">\r\n");
      out.write("\t\t\t<div id=\"main\">\r\n");
      out.write("\t\t\t\t<h2>登録情報変更</h2>\r\n");
      out.write("\t\t\t\t<p class=\"got\">\r\n");
      out.write("\t\t\t\t\t<table border=\"1\" cellspacing=\"0\">\r\n");
      out.write("\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t<td width=\"100\"><font size=\"4\">姓</font></td>\r\n");
      out.write("\t\t\t\t\t\t\t<td><font size=\"4\"> <input type=\"text\" value=\"");
      out.print(loginUser.getSei() );
      out.write("\" name=\"sei\"> </font></td>\r\n");
      out.write("\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t<td width=\"100\"><font size=\"4\">名</font></td>\r\n");
      out.write("\t\t\t\t\t\t\t<td><font size=\"4\"> <input type=\"text\" value=\"");
      out.print(loginUser.getMei() );
      out.write("\" name=\"mei\"> </font></td>\r\n");
      out.write("\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t<td><font size=\"4\">電話番号</font></td>\r\n");
      out.write("\t\t\t\t\t\t\t<td><font size=\"4\"><input type=\"text\" value=\"");
      out.print(loginUser.getTel() );
      out.write("\" name=\"tel\">\r\n");
      out.write("\t\t\t\t\t\t\t</font></td>\r\n");
      out.write("\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t<td><font size=\"4\">ﾒｰﾙｱﾄﾞﾚｽ</font></td>\r\n");
      out.write("\t\t\t\t\t\t\t<td><font size=\"4\"><input type=\"text\" value=\"");
      out.print(loginUser.getMail() );
      out.write("\" name=\"mail\">\r\n");
      out.write("\t\t\t\t\t\t\t</font></td>\r\n");
      out.write("\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t<td><font size=\"4\">郵便番号</font></td>\r\n");
      out.write("\t\t\t\t\t\t\t<td><font size=\"4\"><input type=\"text\" value=\"");
      out.print(loginUser.getYubin() );
      out.write("\" name=\"yubin\">\r\n");
      out.write("\t\t\t\t\t\t\t</font></td>\r\n");
      out.write("\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t<td><font size=\"4\">住所</font></td>\r\n");
      out.write("\t\t\t\t\t\t\t<td><font size=\"4\">\r\n");
      out.write("<!-- \t\t\t\t\t\t\t<textarea name=\"address\" cols=\"50\" rows=\"3\"></textarea>   --->\r\n");
      out.write("\t\t\t\t\t\t\t\t<input type=\"text\" value=\"");
      out.print(loginUser.getTodouhuken() );
      out.write("\" name=\"todouhuken\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<input type=\"text\" value=\"");
      out.print(loginUser.getAddress() );
      out.write("\" name=\"address\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<input type=\"text\" value=\"");
      out.print(loginUser.getAddress2() );
      out.write("\" name=\"address2\">\r\n");
      out.write("\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t<td colspan=\"2\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<div style=\"text-align: right;\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<input type=\"submit\" value=\"変更\" style=\"width: 80px; height: 30px\">\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t</table>\r\n");
      out.write("\t\t\t\t</p>\r\n");
      out.write("\t\t\t\t<p></p>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t</form>\r\n");
      out.write("\t\t\t<!-- /#main -->\r\n");
      out.write("\t\t\t<div id=\"sub\">\r\n");
      out.write("\t\t\t\t<div class=\"section\">\r\n");
      out.write("\t\t\t\t\t<h2>\r\n");
      out.write("\t\t\t\t\t\t<font size=\"4px\">マイメニュー</font>\r\n");
      out.write("\t\t\t\t\t</h2>\r\n");
      out.write("\t\t\t\t\t<ul>\r\n");
      out.write("\t\t\t\t\t\t<font size=\"3px\">\r\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"MypageServlet\">登録情報確認</a>\r\n");
      out.write("\t\t\t\t\t\t</li> <br>\r\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"MTourokuhenkouServlet\"><font color=\"blue\">登録情報変更</font>\r\n");
      out.write("\t\t\t\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t\t\t</li> <br>\r\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"MCardServlet\">クレジットカード</a>\r\n");
      out.write("\t\t\t\t\t\t</li> <br>\r\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"MKounyuServlet\">購入履歴</a>\r\n");
      out.write("\t\t\t\t\t\t</li><br></font>\r\n");
      out.write("\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<!-- /.section -->\r\n");
      out.write("\t\t\t\t<div class=\"section\"></div>\r\n");
      out.write("\t\t\t\t<!-- /.section -->\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<!-- /#sub -->\r\n");
      out.write("\t\t\t<div id=\"pageTop\">\r\n");
      out.write("\t\t\t\t<a href=\"#top\">ページのトップへ戻る</a>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<!-- /#pageTop -->\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<!-- /#contents -->\r\n");
      out.write("\t\t<div id=\"footer\">\r\n");
      out.write("\t\t\t<div id=\"footMenu\">\r\n");
      out.write("\t\t\t\t<ul>\r\n");
      out.write("\t\t\t\t</ul>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<!-- /#footerMenu -->\r\n");
      out.write("\t\t\t<div class=\"copyright\">Copyright &copy; 2011 YOUR SITE NAME All\r\n");
      out.write("\t\t\t\tRights Reserved.</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<!-- /#footer -->\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<!-- /#top -->\r\n");
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
