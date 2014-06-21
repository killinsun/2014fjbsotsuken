package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.ArrayList;
import jp.ac.fjb.eLearning.bean.QuestionInputBean;

public final class Writing_0020question_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01//EN\" \"http://www.w3.org/TR/html4/strict.dtd\">\r\n");
      out.write("<html lang=\"ja\">\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("<script type=\"text/javascript\" src=\"js/Writing question.js\"></script>\r\n");
      out.write("<title>受け身 練習問題</title>\r\n");
      out.write("</head>\r\n");

	//教科、科目、分野IDと一致する問題
	ArrayList<QuestionInputBean> list = (ArrayList) session
			.getAttribute("MONDAI_LIST");

      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("\t<form id=\"WQform\" action=\"/eLearning/SetQuestionServlet\">\r\n");
      out.write("\r\n");
      out.write("\t\t<div align=\"center\">\r\n");
      out.write("\t\t\t<TABLE cellspacing=\"1\" cellpadding=\"6\" width=\"700\">\r\n");
      out.write("\t\t\t\t<TR>\r\n");
      out.write("\t\t\t\t\t<TD bgcolor=\"#FFFFFF\" width=\"153\" nowrap align=\"center\" colspan=\"9\"><font\r\n");
      out.write("\t\t\t\t\t\tsize=\"3\" color=\"#000000\">\r\n");
      out.write("\t\t\t\t</TR>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<TR>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t<TD bgcolor=\"#7B68EE\" width=\"153\" nowrap align=\"center\" colspan=\"9\"><font\r\n");
      out.write("\t\t\t\t\t\tsize=\"3\" color=\"#000000\">\r\n");
      out.write("\t\t\t\t\t\t\t<center>\r\n");
      out.write("\t\t\t\t\t\t\t\t高校英語Writing <br>受け身 確認テスト\r\n");
      out.write("\t\t\t\t\t</font>\r\n");
      out.write("\t\t\t\t\t\t</center>\r\n");
      out.write("\t\t\t\t\t\t<BR>\r\n");
      out.write("\t\t\t\t\t</TD>\r\n");
      out.write("\t\t\t\t</TR>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t");

			for (int i = 0; i < list.size(); i++) {
				QuestionInputBean mondai = list.get(i);
				
      out.write("\r\n");
      out.write("\t\t\t\t<TR>\r\n");
      out.write("\t\t\t\t\t<TD bgcolor=\"skyblue\" width=\"153\" nowrap><font size=\"3\"\r\n");
      out.write("\t\t\t\t\t\tcolor=\"#000000\">Q");
      out.print(i+1);
      out.write("</font><BR>\r\n");
      out.write("\t\t\t\t\t</TD>\r\n");
      out.write("\t\t\t\t\t<TD TD align=\"left\" bgcolor=\"skyblue\" width=\"574\">・");
      out.print(mondai.getMondai());
      out.write("<br>\r\n");
      out.write("\t\t\t\t\t\t<input type=\"text\" id=\"kaitou");
      out.print( i );
      out.write(">\" name=\"kaitou");
      out.print( i );
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\tsize=\"45\" style=\"text-align: left\">&nbsp;&nbsp;</TD>\r\n");
      out.write("\t\t\t\t</TR>\r\n");
      out.write("\t\t\t\t");

				}
				
      out.write("\r\n");
      out.write("\t\t\t</TABLE>\r\n");
      out.write("\t\t\t</TR>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t<button type=\"button\" name=\"aaa\" value=\"aaa\" id=\"Ibtn\">\r\n");
      out.write("\t\t\t\t<font size=\"5\" color=\"#333399\">解答</font>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<button type=\"button\" name=\"aaa\" value=\"aaa\" id=\"Wbtn\">\r\n");
      out.write("\t\t\t\t\t<font size=\"5\" color=\"#333399\">Writing目次へ</font>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t</center>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("</body>\r\n");
      out.write("</form>\r\n");
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
