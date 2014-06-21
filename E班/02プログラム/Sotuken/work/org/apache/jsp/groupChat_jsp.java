package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.ArrayList;
import jp.ac.fjb.Sotuken.bean.groupChatBean;

public final class groupChat_jsp extends org.apache.jasper.runtime.HttpJspBase
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

	ArrayList<groupChatBean> list = (ArrayList) session
			.getAttribute("CHAT_SELECT");

      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<!--009チャット画面この画面は別画面で開くので、cssはひとつだけ-->\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<meta name=\"keywords\" content=\"\">\r\n");
      out.write("<meta name=\"description\" content=\"\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"stylesheet/009Chat.css\" type=\"text/css\" />\r\n");
      out.write("<script type=\"text/javascript\" src=\"js/jquery-1.10.2.min.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"js/chat.js\"></script>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<title>009チャット画面</title>\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("\t<div id=\"main\">\r\n");
      out.write("\t\t<div id=\"chat\" style=\"overflow: scroll; height: 400px;\">\r\n");
      out.write("\t\t\t<table>\r\n");
      out.write("\t\t\t\t");

					for (int i = 0; i < list.size(); i++) {
						groupChatBean group = list.get(i);
				
      out.write("\r\n");
      out.write("\t\t\t\t");

					if (group.getStampID() == null) {
				
      out.write("\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<td class=\"left\"><img src=\"");
      out.print(group.getUserGazou());
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\twidth=\"75\" height=\"75\" alt=\"ユーザアイコン\" /></td>\r\n");
      out.write("\t\t\t\t\t<td class=\"right\">\r\n");
      out.write("\t\t\t\t\t\t<h4>");
      out.print(group.getUserName());
      out.write("</h4>\r\n");
      out.write("\t\t\t\t\t\t<p>");
      out.print(group.getMessage());
      out.write("</p></td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t");

					} else {
				
      out.write("\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<td class=\"left\"><img src=\"");
      out.print(group.getUserGazou());
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\twidth=\"75\" height=\"75\" alt=\"ユーザアイコン\" /></td>\r\n");
      out.write("\t\t\t\t\t<td class=\"right\">\r\n");
      out.write("\t\t\t\t\t\t<h4>");
      out.print(group.getUserName());
      out.write("</h4>\r\n");
      out.write("\t\t\t\t\t\t<p>\r\n");
      out.write("\t\t\t\t\t\t\t<img src=\"");
      out.print(group.getStampGazou());
      out.write("\" width=\"200\" height=\"200\" />\r\n");
      out.write("\t\t\t\t\t\t</p></td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t");

					}
				
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t");

					}
				
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t</table>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t<form action=\"/Sotuken/groupChatServlet\">\r\n");
      out.write("\t\t\t<div id=\"submit\">\r\n");
      out.write("\t\t\t\t<table>\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t\t<div id=\"post\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<input type=\"submit\" id=\"sousin\" value=\"送信\">\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t<div id=\"tools\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<!-- <input type=\"button\"  id=\"gazou\" value=\"ファイルの送信\">-->\r\n");
      out.write("\t\t\t\t\t\t\t\t<input type=\"button\" id=\"stamp\" value=\"スタンプ\"   onClick=\"location.href='/Sotuken/groupChatServlet?progId=1'\">\r\n");
      out.write("\t\t\t\t\t\t\t</div></td><!-- onclick=\"stampOpen()\" -->\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<td><textarea id=\"chatTextArea\" name=\"message_in\"\r\n");
      out.write("\t\t\t\t\t\t\t\tplaceholder=\"入力してください。\"></textarea>\r\n");
      out.write("\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t</table>\r\n");
      out.write("\t\t\t\t<input type=\"hidden\" id=\"progId\" name=\"progId\">\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</form>\r\n");
      out.write("\t</div>\r\n");
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
