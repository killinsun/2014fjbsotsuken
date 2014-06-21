package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class _002signUp_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\r\n");
      out.write("<!--002ユーザ登録画面-->\r\n");
      out.write("<html>\r\n");
      out.write("\t<head>\r\n");
      out.write("\t\t<meta charset=\"UTF-8\">\r\n");
      out.write("\t\t<meta name=\"keywords\" content=\"\">\r\n");
      out.write(" \t\t<meta name=\"description\" content=\"\">\r\n");
      out.write(" \t\t<link rel=\"stylesheet\" href=\"stylesheet/template/styleSheet.css\" type=\"text/css\"/>\r\n");
      out.write(" \t\t<link rel=\"stylesheet\" href=\"stylesheet/template/footer.css\" type=\"text/css\"/>\r\n");
      out.write(" \t\t<link rel=\"stylesheet\" href=\"stylesheet/template/form.css\" type=\"text/css\"/>\r\n");
      out.write(" \t\t<link rel=\"stylesheet\" href=\"stylesheet/002signUp.css\" type=\"text/css\"/>\r\n");
      out.write("\t<script src=\"js/Singn.js\"></script>\r\n");
      out.write("\r\n");
      out.write("\t\t<title>002ユーザ登録画面</title>\r\n");
      out.write("\t</head>\r\n");
      out.write("\r\n");
      out.write("\t<body>\r\n");
      out.write("\t\t<form action=\"/Sotuken/SendEmailCompletionServlet\" method=\"get\" id=\"form\" name=\"form\" >\r\n");
      out.write("\t\t<!--　ヘッダー　-->\r\n");
      out.write("\t\t<div id=\"header\">\r\n");
      out.write("\t\t\t<div id=\"wrap_header\">\r\n");
      out.write("\t\t\t\t<a href=\"001index.html\" onClick=\"disp(); return false;\">\r\n");
      out.write("\t\t\t\t\t<img id=\"logo\" src=\"img/logo.png\" />\r\n");
      out.write("\t\t\t\t</a>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<!--メインコンテンツ-->\r\n");
      out.write("\t\t<div id=\"main\">\r\n");
      out.write("\t\t\t<div id=\"top\">\r\n");
      out.write("\t\t\t\t<h1>新規登録</h1>\r\n");
      out.write("\t\t\t\t<h3>下記のフォームに情報を全て入力してください</h3>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<!--　テーブル　 -->\r\n");
      out.write("\t\t\t<table>\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<td class=\"left_cell\">\r\n");
      out.write("\t\t\t\t\t\tお名前：\r\n");
      out.write("\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t<td class=\"right_cell\">\r\n");
      out.write("\t\t\t\t\t\t<input class=\"frametext\" type=\"text\" name=\"lastName\" id=\"lastName\"  autofocus required/ placeholder=\"姓と名を全角スペースで区切ってください。\" ><br />\r\n");
      out.write("\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<td class=\"left_cell\">\r\n");
      out.write("\t\t\t\t\t\tフリガナ：\r\n");
      out.write("\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t<td class=\"right_cell\">\r\n");
      out.write("\t\t\t\t\t\t<input class=\"frametext\" type=\"text\" name=\"lastName_kana\"  id=\"lastName_kana\"  required  placeholder=\"姓と名を全角スペースで区切ってください。\" ><br />\r\n");
      out.write("\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<td class=\"left_cell\">\r\n");
      out.write("\t\t\t\t\t\t性別：\r\n");
      out.write("\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t<td class=\"right_cell\">\r\n");
      out.write("\t\t\t\t\t\t<select class=\"framecell\" name=\"gender\" required>\r\n");
      out.write("\t\t\t\t\t\t\t<option value=\"S0\">男</option>\r\n");
      out.write("\t\t\t\t\t\t\t<option value=\"S1\">女</option>\r\n");
      out.write("\t\t\t\t\t\t</select>\r\n");
      out.write("\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<td class=\"left_cell\">\r\n");
      out.write("\t\t\t\t\t\t生年月日：\r\n");
      out.write("\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t<td class=\"right_cell\">\r\n");
      out.write("\t\t\t\t\t\t<input class=\"frame text\" type=\"text\" pattern=\"[0-9]{8}$\" placeholder=\"例:19000131\" name=\"birthday\" maxlength=\"8\" id=\"birthday\" required />\r\n");
      out.write("\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<td class=\"left_cell\">\r\n");
      out.write("\t\t\t\t\t\tID：\r\n");
      out.write("\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t<td class=\"right_cell\">\r\n");
      out.write("\t\t\t\t\t\t<input class=\"frame text\" type=\"text\" pattern=\"[a-z0-9]+$\" placeholder=\"最大10文字\" name=\"memberId\" maxlength=\"10\"  id=\"memberId\" required />\r\n");
      out.write("\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<td class=\"left_cell\">\r\n");
      out.write("\t\t\t\t\t\tPASSWORD：\r\n");
      out.write("\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t<td class=\"right_cell\">\r\n");
      out.write("\t\t\t\t\t\t<input class=\"frame password\" type=\"password\" placeholder=\"パスワードを入力\" name=\"passWord\" id=\"passWord\" maxlength=\"100\" required />\r\n");
      out.write("\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<td class=\"left_cell\">\r\n");
      out.write("\t\t\t\t\t\tPASSWORD：\r\n");
      out.write("\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t<td class=\"right_cell\">\r\n");
      out.write("\t\t\t\t\t\t<input class=\"frame password\" type=\"password\" placeholder=\"パスワードを再度入力\" maxlength=\"100\"  id=\"passWord2\"  required />\r\n");
      out.write("\t\t\t\t\t\t<span id=\"retype\">[再入力]</span>\r\n");
      out.write("\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<td class=\"left_cell\">\r\n");
      out.write("\t\t\t\t\t\tメールアドレス：\r\n");
      out.write("\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t<td class=\"right_cell\">\r\n");
      out.write("\t\t\t\t\t\t<input class=\"frame\" type=\"email\" name=\"emailAddress\" id=\"emailAddress\" required />\r\n");
      out.write("\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<td class=\"left_cell\">\r\n");
      out.write("\t\t\t\t\t\t郵便番号：\r\n");
      out.write("\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t<td class=\"right_cell\">\r\n");
      out.write("\t\t\t\t\t\t<input class=\"frame text\" type=\"text\" name=\"postalCode\" pattern=\"[0-9]{7}$\" placeholder=\"ハイフン無し7文字\" maxlength=\"7\"  id=\"postalCode\" required />\r\n");
      out.write("\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<td class=\"left_cell\">\r\n");
      out.write("\t\t\t\t\t\t出身地：\r\n");
      out.write("\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t<td class=\"right_cell\">\r\n");
      out.write("\t\t\t\t\t\t<input class=\"frame\" id=\"address\" type=\"text\" name=\"address\" id=\"address\"  required />\r\n");
      out.write("\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<td class=\"left_cell lastCell\">\r\n");
      out.write("\t\t\t\t\t\t部署：\r\n");
      out.write("\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t<td class=\"right_cell lastCell\">\r\n");
      out.write("\t\t\t\t\t\t<select class=\"frame\" name=\"post\" required>\r\n");
      out.write("\t\t\t\t\t\t\t<option value=\"B001\">ここは管理者が予め登録</option>\r\n");
      out.write("\t\t\t\t\t\t\t<option value=\"B002\">ここは管理者が予め登録</option>\r\n");
      out.write("\t\t\t\t\t\t</select>\r\n");
      out.write("\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t</table>\r\n");
      out.write("\t\t\t<div id=\"submit_area\">\r\n");
      out.write("\t\t\t\t<input id=\"submit1\" class=\"frame button\" type=button value=\"同意して送信\"  />\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t<!-- フッター -->\r\n");
      out.write("\t\t<div id=\"footer\">\r\n");
      out.write("\t\t\t<div id=\"wrap_footer\">\r\n");
      out.write("\t\t\t\t<!-- フッターはここに書く　 -->\r\n");
      out.write("\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t</form>\r\n");
      out.write("\t</body>\r\n");
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
