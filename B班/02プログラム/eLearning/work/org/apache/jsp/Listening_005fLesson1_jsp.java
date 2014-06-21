package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.ArrayList;
import jp.ac.fjb.eLearning.bean.listeningFormBean;

public final class Listening_005fLesson1_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"ja\">\r\n");
      out.write("\r\n");
      out.write("<head>\r\n");
      out.write("<script type=\"text/javascript\" src=\"js/listeningReturn.js\"></script>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("\r\n");
      out.write("<title >Lesson1</title>\r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write("\t#question{\r\n");
      out.write("\t\twidth: 600px;\r\n");
      out.write("\t\tmargin: 0 auto;\r\n");
      out.write("\t}\r\n");
      out.write("\t#ques{\r\n");
      out.write("\t\tfloat:right;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\tp.line {color:black; background:yellowgreen;}\r\n");
      out.write("</style>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("<!--<form id=\"Dform\">  -->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<h2>Lesson1</h2>\r\n");
      out.write("<p>éüÇÃâπê∫Çï∑Ç´ñ‚ëËÇ…ìöÇ¶Ç»Ç≥Ç¢ÅB</p>\r\n");
      out.write("\r\n");
      out.write("\r\n");
 for (int i=0; i<list.size(); i++) {
listeningFormBean lis = list.get(i); 
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t<p class=\"line\" name=\"questionID\">");
      out.print(lis.getQuestionText() );
      out.write("</p>\r\n");
      out.write("<center>\r\n");
      out.write("\t\t\t<audio id=\"audio\" controls width=\"320\" height=\"240\">\r\n");
      out.write("\t\t\t<source src=\"");
      out.print(lis.getMusicName() );
      out.write("\"></source>\r\n");
      out.write("\t\t\t</audio><br>\r\n");
      out.write("\r\n");
      out.write("<form action=\"/eLearning/ListeningAnswerServlet\">\r\n");
      out.write("\t\t<input type=\"text\" id=\"UserAnswer");
      out.print( i );
      out.write("\" name=\"UserAnswer");
      out.print( i );
      out.write("\">\r\n");
      out.write("\r\n");
      out.write("\t\t<br>\r\n");
      out.write("\r\n");
      out.write("</center>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
 } 
      out.write("\r\n");
      out.write("\r\n");
      out.write("<center>\r\n");
      out.write("\r\n");
      out.write("<BUTTON>çÃì_Åïâê‡Ç÷</BUTTON>\r\n");
      out.write("</form>\r\n");
      out.write("\r\n");
      out.write("<form  id=\"EnglishForm\">\r\n");
      out.write("<button type=\"button\" name=\"button1\" value=\"\" id=\"Lbtn\">Listeningñ⁄éüÇ÷</button>\r\n");
      out.write("<input type=\"hidden\" id=\"kamokuID\" name=\"kamokuID\"></input>\r\n");
      out.write("</form>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</center>\r\n");
      out.write("\r\n");
      out.write("\r\n");
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
