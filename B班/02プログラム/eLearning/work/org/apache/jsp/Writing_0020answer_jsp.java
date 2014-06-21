package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.ArrayList;
import jp.ac.fjb.eLearning.bean.QuestionInputBean;

public final class Writing_0020answer_jsp extends org.apache.jasper.runtime.HttpJspBase
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

	//教科、科目、分野IDと一致する問題
	ArrayList<QuestionInputBean> list = (ArrayList) session
			.getAttribute("MONDAI_LIST");
	String tensu = (String) session.getAttribute("TEN");

      out.write("\r\n");
      out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01//EN\" \"http://www.w3.org/TR/html4/strict.dtd\">\r\n");
      out.write("<html lang=\"ja\">\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("<script type=\"text/javascript\" src=\"js/Writing answer.js\"></script>\r\n");
      out.write("<title>受け身 解答・解説</title>\r\n");
      out.write("</head>\r\n");
      out.write("<center>\r\n");
      out.write("\t<h3>受け身 解答・解説</h3>\r\n");
      out.write("\r\n");
      out.write("\t<input type=\"text\" value=\"");
      out.print(tensu);
      out.write("\" size=\"4\" id=\"tensu\" name =\"tensu\" >点\r\n");
      out.write("\t<body>\r\n");
      out.write("\t\t");

			for (int i = 0; i < list.size(); i++) {
				QuestionInputBean mondai = list.get(i);
				String name = request.getParameter("kaitou"+i);
		
      out.write("\r\n");
      out.write("\t\t<form id=\"WAform\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t<TABLE cellspacing=\"1\" cellpadding=\"6\" width=\"700\">\r\n");
      out.write("\t\t\t\t<TD bgcolor=\"skyblue\" nowrap align=\"center\" colspan=\"9\">\r\n");
      out.write("\t\t\t\t<font\r\n");
      out.write("\t\t\t\t\tsize=\"3\" color=\"#000000\">Q");
      out.print(i+1);
      out.write('.');
      out.print(mondai.getMondai());
      out.write("<br>\r\n");
      out.write("\t\t\t\t\t\t<!-- &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; -->\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<input type=\"text\"\r\n");
      out.write("\t\t\t\t\t\tid=\"kaitou");
      out.print(i);
      out.write("\" name=\"kaitou");
      out.print(i);
      out.write("\"  style=\"color: red\"\r\n");
      out.write("\t\t\t\t\t\tsize=\"50\" style=\"text-align:right\" value = ");
      out.print(name);
      out.write("\r\n");
      out.write("\t\t\t\t\t\t>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<br><!-- &nbsp;&nbsp;  --><font\r\n");
      out.write("\t\t\t\t\t\tcolor=\"red\">");
      out.print(mondai.getKaitou());
      out.write("</font><br> 解答:");
      out.print(mondai.getKaisetsu());
      out.write("\r\n");
      out.write("\t\t\t\t\t\t</TR>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t");

			}
		
      out.write("\r\n");
      out.write("\t\t\t</TABLE>\r\n");
      out.write("\t\t\t<BUTTON type=\"button\" id=\"Rebtn\">Writing目次へ</BUTTON>\r\n");
      out.write("\t<input type=\"hidden\" id=\"kamokuID\" name=\"kamokuID\"></input>\r\n");
      out.write("\t</form>\r\n");
      out.write("\t");
      out.print(request.getParameter("kaitou0"));
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t</body>\r\n");
      out.write("\r\n");
      out.write("\r\n");
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
