package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<!--001トップ画面 -->\n");
      out.write("<html>\n");
      out.write("\t<head>\n");
      out.write("\t\t<meta charset=\"UTF-8\">\n");
      out.write("\t\t<meta name=\"keywords\" content=\"\">\n");
      out.write(" \t\t<meta name=\"description\" content=\"\">\n");
      out.write(" \t\t<link rel=\"stylesheet\" href=\"stylesheet/template/styleSheet.css\" type=\"text/css\"/>\n");
      out.write(" \t\t<link rel=\"stylesheet\" href=\"stylesheet/template/footer.css\" type=\"text/css\"/>\n");
      out.write(" \t\t<link rel=\"stylesheet\" href=\"stylesheet/template/form.css\" type=\"text/css\"/>\n");
      out.write(" \t\t<link rel=\"stylesheet\" href=\"stylesheet/001topStyle.css\" type=\"text/css\"/>\n");
      out.write("\t\t<script>\n");
      out.write("\t\t\tfunction signUp(){\n");
      out.write("\n");
      out.write("\t\t\t\tlocation.href = \"002signUp.jsp\";\n");
      out.write("\t\t\t}\n");
      out.write("\n");
      out.write("\t\t\tfunction logIn(){\n");
      out.write("\t\t\t\tif(form.userid.value == \"\") {\n");
      out.write("\t\t\t\t\talert(\"ユーザIDを入力してください\");\n");
      out.write("\t\t\t\t\treturn;\n");
      out.write("\t\t\t\t} else if(form.password.value == \"\") {\n");
      out.write("\t\t\t\t\talert(\"パスワードを入力してください\")\n");
      out.write("\n");
      out.write("\t\t\t\t} else {\n");
      out.write("\t\t\t\t\t//location.href = \"004myPage.jsp\";\n");
      out.write("\t\t\t\t\tform.submit();\n");
      out.write("\t\t\t\t}\n");
      out.write("\t\t\t}\n");
      out.write("\t\t</script>\n");
      out.write("\t\t<title>001トップ画面</title>\n");
      out.write("\t</head>\n");
      out.write("\n");
      out.write("\t<body>\n");
      out.write("\t");
 String msg = (String)session.getAttribute("ERROR_LOGIN");
	   if (msg != null) {
		   out.print("<font color='red'>"+msg+"</font>");
		   session.removeAttribute("ERROR_LOGIN");
	   }
	
      out.write("\n");
      out.write("\t\t<form action=\"/Sotuken/IndexServlet\" id=\"form\" method=\"post\">\n");
      out.write("\t\t<!-- ヘッダー　-->\n");
      out.write("\t\t<div id=\"header\">\n");
      out.write("\t\t\t<div id=\"wrap_header\">\n");
      out.write("\t\t\t\t<a href=\"001index.html\">\n");
      out.write("\t\t\t\t\t<img id=\"logo\" src=\"img/logo.png\" />\n");
      out.write("\t\t\t\t</a>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<!--　メインコンテンツ　-->\n");
      out.write("\t\t<div id=\"main\">\n");
      out.write("\t\t\t<!-- 右側の要素でここにはログインなどのコンテンツが含まれる -->\n");
      out.write("\t\t\t<div id=\"right_contents\">\n");
      out.write("\t\t\t\t<!-- ただのスペース現在は何も置かない　 -->\n");
      out.write("\t\t\t\t<div id=\"space\">\n");
      out.write("\t\t\t\t\t<!--　スペース　-->\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<!--　ログイン 　-->\n");
      out.write("\t\t\t\t<div id=\"login\">\n");
      out.write("\t\t\t■ID<br />\n");
      out.write("\t\t\t<input class=\"frame\" class=\"text\" type=\"text\" name=\"userid\" id=\"userid\" autofocus required/><br />\n");
      out.write("\t\t\t■PASSWORD<br />\n");
      out.write("\t\t\t<input class=\"frame\" type=\"password\" name=\"password\"  required/><br />\n");
      out.write("\t\t\t<input class=\"button\" type=\"button\" value=\"ログイン\" onclick=\"logIn()\" />\n");
      out.write("\t\t\t<input class=\"button\" type=\"button\" value=\"新規登録\" onclick=\"signUp()\" />\n");
      out.write("\n");
      out.write("\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t<!-- 左側の要素でここにはSNSの紹介したい部分を書く -->\n");
      out.write("\t\t\t<div id=\"left_contents\">\n");
      out.write("\t\t\t\t<img src=\"img/serverAdd.png\" />\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\n");
      out.write("\t\t<!-- フッター -->\n");
      out.write("\t\t<div id=\"footer\">\n");
      out.write("\t\t\t<div id=\"wrap_footer\">\n");
      out.write("\t\t\t\t<!-- フッターはここに書く　 -->\n");
      out.write("\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t</form>\n");
      out.write("\t</body>\n");
      out.write("</html>\n");
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
