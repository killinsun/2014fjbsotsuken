package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.ArrayList;
import jp.ac.fjb.sns.bean.ChatBean;
import jp.ac.fjb.sns.bean.EventBean;

public final class U002Chat_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html");
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
 ArrayList<ChatBean> cList = (ArrayList)session.getAttribute("HAVING_CHAT_LIST"); 
      out.write('\r');
      out.write('\n');
 ArrayList<EventBean> eList = (ArrayList)session.getAttribute("HAVING_EVENT_LIST"); 
      out.write('\r');
      out.write('\n');
String roomCheck = (String)session.getAttribute("ROOM_ID"); 
      out.write("\r\n");
      out.write("<div id=\"CD\">\r\n");
      out.write("<table id=\"ranking\" width=\"530\" border=\"1\">\r\n");
      out.write("\t");
if (roomCheck == "E") { 
      out.write("\r\n");
      out.write("\t<tr>\r\n");
      out.write("\t\t<td width=\"75px\" align=\"center\" >DATE</td>\r\n");
      out.write("\t\t<td width=\"200px\" align=\"center\" >TITLE</td>\r\n");
      out.write("\t</tr>\r\n");
      out.write("\t\t");
for (int i=0; i<eList.size(); i++){
	              EventBean list = eList.get(i);
		
      out.write("\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<td>");
      out.print(list.getDate() );
      out.write("</td>\r\n");
      out.write("\t\t\t\t\t<td>");
      out.print(list.getTitle());
      out.write("</td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t");
}
      out.write('\r');
      out.write('\n');
      out.write('	');
 } else { 
      out.write("\r\n");
      out.write("\t<tr>\r\n");
      out.write("\t\t<td width=\"75px\" align=\"center\" >NAME</td>\r\n");
      out.write("\t\t<td width=\"200px\" align=\"center\" >MESSAGE</td>\r\n");
      out.write("\t</tr>\r\n");
      out.write("\t\t");
for (int i=0; i<cList.size(); i++){
	              ChatBean list = cList.get(i);
		
      out.write("\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<td>");
      out.print(list.getUserName() );
      out.write("</td>\r\n");
      out.write("\t\t\t\t\t<td>");
      out.print(list.getChat());
      out.write("</td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t");
}
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t");
} 
      out.write("\r\n");
      out.write("</table>\r\n");
      out.write("</div>\r\n");
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
