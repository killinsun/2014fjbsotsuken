package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import jp.ac.fjb.sotukenD.bean.MainFormBeans;
import java.util.ArrayList;

public final class main_jsp extends org.apache.jasper.runtime.HttpJspBase
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
 ArrayList<MainFormBeans> userMail = (ArrayList)session.getAttribute("USER_MAIL"); 
      out.write("\r\n");
      out.write("\r\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\">\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"utf-8\" />\r\n");
      out.write("<title>���C�A�E�g�e�X�g</title>\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"/sotukenD/css/style.css\" />\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"/sotukenD/css/main.css\" />\r\n");
      out.write("<script src=\"/sotukenD/js/main.js\"></script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<form id=\"form\">\r\n");
      out.write("\t<div class=\"frm\">\r\n");
      out.write("\t\t<!--header����-->\r\n");
      out.write("\t\t<header id=\"header\">\r\n");
      out.write("\t\t\t<div id=\"title\">�g�b�v�y�[�W</div>\r\n");
      out.write("\t\t\t<div id=\"account\" align=\"right\">\r\n");
      out.write("\t\t\t\t<div id=\"name\">�c�� ���O</div>\r\n");
      out.write("\t\t\t\t<!--���O�A�E�g�{�^��-->\r\n");
      out.write("\t\t\t\t<button type=\"button\" id=\"logout\">���O�A�E�g</button>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div>�@\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</header>\r\n");
      out.write("\r\n");
      out.write("\t\t<!--�y�[�W�ړ��A�i�r�Q�[�V��������-->\r\n");
      out.write("\t\t<nav id=\"nav\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t<iframe src=\"./mainMenu.jsp\" name=\"mainMenu\" Align=\"left\"\r\n");
      out.write("\t\t\t\tFrameborder=\"no\" Marginheight=\"0\" Width=\"200\"> </iframe>\r\n");
      out.write("\r\n");
      out.write("\t\t</nav>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t<!--��Ɖ��-->\r\n");
      out.write("\t\t<section id=\"mainContent\">\r\n");
      out.write("\t\t\t<br />\r\n");
      out.write("\t\t\t<button type=\"button\" onclick=\"location.href='/sotukenD/MailSServlet'\">�V�K���[��</button>\r\n");
      out.write("\t\t\t<br />\r\n");
      out.write("\t\t\t<h2>��M���[��</h2>\r\n");
      out.write("\t\t\t<table id=\"mail\" cellspacing=\"0\" frame=\"box\" border=\"1\">\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<th width=\"5%\"><input type=\"checkbox\"></th>\r\n");
      out.write("\t\t\t\t\t<th width=\"20%\">���M��</th>\r\n");
      out.write("\t\t\t\t\t<th width=\"10%\"></th>\r\n");
      out.write("\t\t\t\t\t<th width=\"65%\">�^�C�g��</th>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t");
for (int i = 0; i < userMail.size(); i++) {
					MainFormBeans xx = userMail.get(i); 
      out.write("\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<td><input type=\"checkbox\"></td>\r\n");
      out.write("\t\t\t\t\t<td>");
      out.print(xx.getUserName() );
      out.write("</td>\r\n");
      out.write("\t\t\t\t\t<td></td>\r\n");
      out.write("\t\t\t\t\t<td><a href=\"/sotukenD/MailServlet?mailId=");
      out.print(xx.getMailId() );
      out.write("\"  onclick=\"test('");
      out.print(xx.getMailId() );
      out.write("')\">");
      out.print(xx.getTitle() );
      out.write("</a>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t");

				}
				
      out.write("\r\n");
      out.write("\t\t\t</table>\r\n");
      out.write("\t\t\t<input type=\"submit\" value=\"�I�����폜\">\r\n");
      out.write("\t\t\t<input type =\"hidden\" value=\" \" id=\"mailId\" name=\"mailId\" >\r\n");
      out.write("\t\t</section>\r\n");
      out.write("\t</div>\r\n");
      out.write("</form>\r\n");
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
