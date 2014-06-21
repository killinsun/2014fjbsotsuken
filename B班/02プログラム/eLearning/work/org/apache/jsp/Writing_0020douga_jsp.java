package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import jp.ac.fjb.eLearning.bean.WritingDougaFormBean;

public final class Writing_0020douga_jsp extends org.apache.jasper.runtime.HttpJspBase
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
 WritingDougaFormBean WritingDouga = (WritingDougaFormBean)session.getAttribute("DOUGA"); 
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01//EN\" \"http://www.w3.org/TR/html4/strict.dtd\">\r\n");
      out.write("<html lang=\"ja\">\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("<script type=\"text/javascript\" src=\"/eLearning/js/Writing douga.js\"></script>\r\n");
      out.write("<title>");
      out.print(WritingDouga.getTitle() );
      out.write("</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<form id=\"WDform\">\r\n");
      out.write("<center>\r\n");
      out.write("<h3>");
      out.print(WritingDouga.getTitle() );
      out.write("</h3>\r\n");
      out.write("\r\n");
      out.write("<video src = \"");
      out.print(WritingDouga.getDouga() );
      out.write("\" width=\"600\" height=\"366\"  controls></video>\r\n");
      out.write("\r\n");
      out.write("<br>\r\n");
      out.write("<textarea rows=\"4\"  name=\"body\" cols=\"83\"></textarea>\r\n");
      out.write("<br><br>\r\n");
      out.write("</center>\r\n");
      out.write("<center>\r\n");
      out.write("<input type=\"button\"  value=\"確認テストへ\" id=\"Testbtn\">\r\n");
      out.write("<input type=\"button\"  value=\"Writing目次へ\" id=\"Rebtn\"><BR>\r\n");
      out.write("</center>\r\n");
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
