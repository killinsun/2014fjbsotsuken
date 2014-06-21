package org.apache.jsp.Shift;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import jp.ac.fjb.sotukenD.bean.ShiftShowFormBean;
import java.util.ArrayList;
import jp.ac.fjb.sotukenD.bean.LoginFormBeans;

public final class shiftShow_jsp extends org.apache.jasper.runtime.HttpJspBase
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

	LoginFormBeans loginBean = (LoginFormBeans) session
			.getAttribute("LOGIN_USER");

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
 ArrayList<ShiftShowFormBean> dShift = (ArrayList)session.getAttribute("DECISION_SHIFT"); 
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<head>\r\n");
      out.write("    <meta charset=\"utf-8\" />\r\n");
      out.write("    <title>シフト閲覧画面</title>\r\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"/sotukenD/css/style.css\" />\r\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"/sotukenD/css/eturan.css\" />\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("<!--\r\n");
      out.write("\r\n");
      out.write("function ForBack(){\r\n");
      out.write("\tdocument.getElementById('form').action = \"/sotukenD/ForShiftMainServlet\";\r\n");
      out.write("\r\n");
      out.write("}\r\n");
      out.write("function ForTei(){\r\n");
      out.write("\tdocument.getElementById('form').action = \"/sotukenD/ForShiftTeiServlet\";\r\n");
      out.write("\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("-->\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
 request.setCharacterEncoding("UTF-8"); 
      out.write("\r\n");
      out.write("<div class=\"frm\">\r\n");
      out.write("\t<!--header部分-->\r\n");
      out.write("\t\t<header id=\"header\">\r\n");
      out.write("\t\t\t<div id=\"title\">シフト閲覧</div>\r\n");
      out.write("\t\t\t<div id=\"account\" align=\"right\">\r\n");
      out.write("\t\t\t\t<div id=\"name\">");
      out.print(loginBean.getUserName());
      out.write("</div>\r\n");
      out.write("\t\t\t\t<!--ログアウトボタン-->\r\n");
      out.write("\t\t\t\t<button type=\"submit\" id=\"logout\"\r\n");
      out.write("\t\t\t\t\tonclick=\"location.href='/sotukenD/LogoutServlet'\">ログアウト</button>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div>　</div>\r\n");
      out.write("\r\n");
      out.write("\t\t</header>\r\n");
      out.write("\r\n");
      out.write("\t<!--ページ移動、ナビゲーション部分-->\r\n");
      out.write("<nav id=\"nav\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t<iframe src=\"/sotukenD/mainMenu.jsp\" name=\"mainMenu\" Align=\"left\" Frameborder=\"no\" Marginheight=\"0\" Width=\"200\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t</iframe>\r\n");
      out.write("\r\n");
      out.write("\t</nav>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t<!--作業画面-->\r\n");
      out.write("\r\n");
      out.write("\t");
 	ShiftShowFormBean xx = dShift.get(0);
      out.write("\r\n");
      out.write("\t<section id=\"mainContent\">\r\n");
      out.write("\t\t<form id=\"form\" action=\"/sotukenD/ForShiftCreateServlet\">\r\n");
      out.write("\t\t\t<div style=\"text-align:center; \">\r\n");
      out.write("\t\t\t<input type=\"submit\" value=\"戻る\" style=\"WIDTH: 50px; HEIGHT: 30px; float:left;\" onclick=\"ForBack()\">\r\n");
      out.write("\t\t\t<input type=\"submit\" value=\"シフト提出画面\" style=\"WIDTH: 100px; HEIGHT: 30px; float:left;\" onclick=\"ForTei()\">\r\n");
      out.write("\t\t\t<font size=\"5\">");
      out.print(xx.getDate().substring(0,10) );
      out.write("</font>\r\n");
      out.write("\t\t\t<input type=\"submit\" value=\"作成画面\" style=\"WIDTH: 100px; HEIGHT: 30px; float:right; \">\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t<input type=\"hidden\" value=\"");
      out.print(xx.getDate().substring(0,10) );
      out.write("\" id=\"date\" name=\"day\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<!---->\r\n");
      out.write("\t\t\t\t\t\t<img src=\"/sotukenD/img/memori.gif\" id=\"memori\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t<div id=\"zentai\">\r\n");
      out.write("\t\t\t\t\t\t<table border=\"0\" width=\"100%\" cellpadding=\"2\" cellspacing=\"1\" bgcolor=\"#002047\" cols=\"32\">\r\n");
      out.write("\t\t\t\t\t\t\t<!--表作成-->\r\n");
      out.write("\t\t\t\t\t\t\t");


							for(int i =0;i<dShift.size();i++){
								ShiftShowFormBean backdroundId = dShift.get(i);
							
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<tr align=\"center\" bgcolor=\"#FFFFFF\" height=\"45px\" id=\"kotei\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<td width=\"68px\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t");
      out.print( backdroundId.getUserID() );
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<td width=\"124px\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t");
      out.print( backdroundId.getUserName() );
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t");

											    String[] styleId =  backdroundId.getStyle();
												for (int j=0; j<styleId.length; j++){
													
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<td width=\"12px\" ");
      out.print( styleId[j] );
      out.write(">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t");

												}
												
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t");

							}
							
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</table>\r\n");
      out.write("\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</form>\r\n");
      out.write("\t</section>\r\n");
      out.write("\t</div>\r\n");
      out.write("\r\n");
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
