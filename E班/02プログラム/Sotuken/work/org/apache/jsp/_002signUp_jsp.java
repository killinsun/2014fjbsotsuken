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
      out.write("<!--002���[�U�o�^���-->\r\n");
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
      out.write("\t\t<title>002���[�U�o�^���</title>\r\n");
      out.write("\t</head>\r\n");
      out.write("\r\n");
      out.write("\t<body>\r\n");
      out.write("\t\t<form action=\"/Sotuken/SendEmailCompletionServlet\" method=\"get\" id=\"form\" name=\"form\" >\r\n");
      out.write("\t\t<!--�@�w�b�_�[�@-->\r\n");
      out.write("\t\t<div id=\"header\">\r\n");
      out.write("\t\t\t<div id=\"wrap_header\">\r\n");
      out.write("\t\t\t\t<a href=\"001index.html\" onClick=\"disp(); return false;\">\r\n");
      out.write("\t\t\t\t\t<img id=\"logo\" src=\"img/logo.png\" />\r\n");
      out.write("\t\t\t\t</a>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<!--���C���R���e���c-->\r\n");
      out.write("\t\t<div id=\"main\">\r\n");
      out.write("\t\t\t<div id=\"top\">\r\n");
      out.write("\t\t\t\t<h1>�V�K�o�^</h1>\r\n");
      out.write("\t\t\t\t<h3>���L�̃t�H�[���ɏ���S�ē��͂��Ă�������</h3>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<!--�@�e�[�u���@ -->\r\n");
      out.write("\t\t\t<table>\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<td class=\"left_cell\">\r\n");
      out.write("\t\t\t\t\t\t�����O�F\r\n");
      out.write("\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t<td class=\"right_cell\">\r\n");
      out.write("\t\t\t\t\t\t<input class=\"frametext\" type=\"text\" name=\"lastName\" id=\"lastName\"  autofocus required/ placeholder=\"���Ɩ���S�p�X�y�[�X�ŋ�؂��Ă��������B\" ><br />\r\n");
      out.write("\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<td class=\"left_cell\">\r\n");
      out.write("\t\t\t\t\t\t�t���K�i�F\r\n");
      out.write("\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t<td class=\"right_cell\">\r\n");
      out.write("\t\t\t\t\t\t<input class=\"frametext\" type=\"text\" name=\"lastName_kana\"  id=\"lastName_kana\"  required  placeholder=\"���Ɩ���S�p�X�y�[�X�ŋ�؂��Ă��������B\" ><br />\r\n");
      out.write("\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<td class=\"left_cell\">\r\n");
      out.write("\t\t\t\t\t\t���ʁF\r\n");
      out.write("\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t<td class=\"right_cell\">\r\n");
      out.write("\t\t\t\t\t\t<select class=\"framecell\" name=\"gender\" required>\r\n");
      out.write("\t\t\t\t\t\t\t<option value=\"S0\">�j</option>\r\n");
      out.write("\t\t\t\t\t\t\t<option value=\"S1\">��</option>\r\n");
      out.write("\t\t\t\t\t\t</select>\r\n");
      out.write("\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<td class=\"left_cell\">\r\n");
      out.write("\t\t\t\t\t\t���N�����F\r\n");
      out.write("\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t<td class=\"right_cell\">\r\n");
      out.write("\t\t\t\t\t\t<input class=\"frame text\" type=\"text\" pattern=\"[0-9]{8}$\" placeholder=\"��:19000131\" name=\"birthday\" maxlength=\"8\" id=\"birthday\" required />\r\n");
      out.write("\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<td class=\"left_cell\">\r\n");
      out.write("\t\t\t\t\t\tID�F\r\n");
      out.write("\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t<td class=\"right_cell\">\r\n");
      out.write("\t\t\t\t\t\t<input class=\"frame text\" type=\"text\" pattern=\"[a-z0-9]+$\" placeholder=\"�ő�10����\" name=\"memberId\" maxlength=\"10\"  id=\"memberId\" required />\r\n");
      out.write("\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<td class=\"left_cell\">\r\n");
      out.write("\t\t\t\t\t\tPASSWORD�F\r\n");
      out.write("\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t<td class=\"right_cell\">\r\n");
      out.write("\t\t\t\t\t\t<input class=\"frame password\" type=\"password\" placeholder=\"�p�X���[�h�����\" name=\"passWord\" id=\"passWord\" maxlength=\"100\" required />\r\n");
      out.write("\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<td class=\"left_cell\">\r\n");
      out.write("\t\t\t\t\t\tPASSWORD�F\r\n");
      out.write("\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t<td class=\"right_cell\">\r\n");
      out.write("\t\t\t\t\t\t<input class=\"frame password\" type=\"password\" placeholder=\"�p�X���[�h���ēx����\" maxlength=\"100\"  id=\"passWord2\"  required />\r\n");
      out.write("\t\t\t\t\t\t<span id=\"retype\">[�ē���]</span>\r\n");
      out.write("\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<td class=\"left_cell\">\r\n");
      out.write("\t\t\t\t\t\t���[���A�h���X�F\r\n");
      out.write("\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t<td class=\"right_cell\">\r\n");
      out.write("\t\t\t\t\t\t<input class=\"frame\" type=\"email\" name=\"emailAddress\" id=\"emailAddress\" required />\r\n");
      out.write("\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<td class=\"left_cell\">\r\n");
      out.write("\t\t\t\t\t\t�X�֔ԍ��F\r\n");
      out.write("\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t<td class=\"right_cell\">\r\n");
      out.write("\t\t\t\t\t\t<input class=\"frame text\" type=\"text\" name=\"postalCode\" pattern=\"[0-9]{7}$\" placeholder=\"�n�C�t������7����\" maxlength=\"7\"  id=\"postalCode\" required />\r\n");
      out.write("\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<td class=\"left_cell\">\r\n");
      out.write("\t\t\t\t\t\t�o�g�n�F\r\n");
      out.write("\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t<td class=\"right_cell\">\r\n");
      out.write("\t\t\t\t\t\t<input class=\"frame\" id=\"address\" type=\"text\" name=\"address\" id=\"address\"  required />\r\n");
      out.write("\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<td class=\"left_cell lastCell\">\r\n");
      out.write("\t\t\t\t\t\t�����F\r\n");
      out.write("\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t<td class=\"right_cell lastCell\">\r\n");
      out.write("\t\t\t\t\t\t<select class=\"frame\" name=\"post\" required>\r\n");
      out.write("\t\t\t\t\t\t\t<option value=\"B001\">�����͊Ǘ��҂��\�ߓo�^</option>\r\n");
      out.write("\t\t\t\t\t\t\t<option value=\"B002\">�����͊Ǘ��҂��\�ߓo�^</option>\r\n");
      out.write("\t\t\t\t\t\t</select>\r\n");
      out.write("\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t</table>\r\n");
      out.write("\t\t\t<div id=\"submit_area\">\r\n");
      out.write("\t\t\t\t<input id=\"submit1\" class=\"frame button\" type=button value=\"���ӂ��đ��M\"  />\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t<!-- �t�b�^�[ -->\r\n");
      out.write("\t\t<div id=\"footer\">\r\n");
      out.write("\t\t\t<div id=\"wrap_footer\">\r\n");
      out.write("\t\t\t\t<!-- �t�b�^�[�͂����ɏ����@ -->\r\n");
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
