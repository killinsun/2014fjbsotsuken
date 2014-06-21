package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.ArrayList;
import jp.ac.fjb.eLearning.bean.listeningFormBean;

public final class Listening_005fLesson1_005fAnswer_jsp extends org.apache.jasper.runtime.HttpJspBase
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
 ArrayList<listeningFormBean> list= (ArrayList)session.getAttribute("listening");
String tensu = (String) session.getAttribute("TEN");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"ja\">\r\n");
      out.write("<script type=\"text/javascript\" src=\"js/listeningReturn.js\"></script>\r\n");
      out.write("<script type=\"text/css\" src=\"css/Listening.css\"></script>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("<title>Lesson1</title>\r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write("\r\n");
      out.write("\t\tp.line {color:black; background:yellowgreen;}\r\n");
      out.write("\r\n");
      out.write("</style>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<h3>Lesson1</h3>\r\n");
      out.write("<center>\r\n");
      out.write("<h2>Lesson1　回答および解説</h2>\r\n");
      out.write("\r\n");
      out.write("<input type=\"text\" value=\"");
      out.print(tensu);
      out.write("\" size=\"4\">点\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</center>\r\n");
      out.write("<div id=Q>\r\n");
      out.write("\r\n");
 for (int i=0; i<list.size(); i++) {
listeningFormBean lis = list.get(i);
      out.write("\r\n");
      out.write("\r\n");
      out.write("<p>");
      out.print(lis.getQuestionText() );
      out.write("</p>\r\n");
      out.write("\r\n");
      out.write("<br>\r\n");
      out.write("\r\n");
      out.write("<br><br>\r\n");
      out.write("<center>\r\n");
      out.write("<!--<p class=\"line\">-->\r\n");
      out.write("<audio id=\"audio\" controls width=\"320\" height=\"240\">\r\n");
      out.write("<source src=\"");
      out.print(lis.getMusicName() );
      out.write("\">\r\n");
      out.write("</audio><br>\r\n");
      out.write("\r\n");
      out.write("<input type=\"text\" ><br>\r\n");
      out.write("答え”");
      out.print(lis.getAnswer() );
      out.write("”<br>\r\n");
      out.print(lis.getAnswerText() );
      out.write("\r\n");
      out.write("\r\n");
      out.write("</center>\r\n");
      out.write("</div>\r\n");
 } 
      out.write("\r\n");
      out.write("\r\n");
      out.write("<center>\r\n");
      out.write("<form action=\"/eLearning/ListeningNextServlet\">\r\n");
      out.write("<BUTTON>リトライ！</BUTTON>\r\n");
      out.write("</form>\r\n");
      out.write("\r\n");
      out.write("<form action=\"/eLearning/ListeningServlet\" id=\"EnglishForm\">\r\n");
      out.write("<BUTTON id=\"Lbtn\">Listening目次へ</BUTTON>\r\n");
      out.write("<input type=\"hidden\" id=\"kamokuID\" name=\"kamokuID\"></input>\r\n");
      out.write("\r\n");
      out.write("</form>\r\n");
      out.write("\r\n");
      out.write("<BR>\r\n");
      out.write("\r\n");
      out.write("</center>\r\n");
      out.write("</body>\r\n");
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
