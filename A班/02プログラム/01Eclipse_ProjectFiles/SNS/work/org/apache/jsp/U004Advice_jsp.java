package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.ArrayList;
import jp.ac.fjb.sns.bean.PostBean;
import jp.ac.fjb.sns.bean.UserBean;

public final class U004Advice_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html;charset=UTF-8");
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

	// ログインユーザの情報
	UserBean loginUser = (UserBean)session.getAttribute("LOGIN_USER");
	String userPosition = (String)loginUser.getPositionId();

	ArrayList<PostBean> list = (ArrayList)session.getAttribute("POST_LIST");
	ArrayList<PostBean> res = (ArrayList)session.getAttribute("RES_LIST");

	if (res == null) {
		res = new ArrayList();
	}

	PostBean selectPost = (PostBean)session.getAttribute("SELECT_BEAN");

	if (selectPost == null) {
		selectPost = new PostBean();
	}

      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\">\r\n");
      out.write("\r\n");
      out.write("<head>\r\n");
      out.write("\t<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\"/>\r\n");
      out.write("\t<link rel=\"StyleSheet\" type=\"text/css\" href=\"css/advice.css\" />\r\n");
      out.write("\t<script type=\"text/javascript\" src=\"js/screenTransition.js\"></script>\r\n");
      out.write("    <title>AdviceSystem</title>\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body style=\"background:#E0FFFF\">\r\n");
      out.write("<form id=\"form\" name=\"form\">\r\n");
      out.write("<input type=\"hidden\" name=\"pid\" id=\"pid\">\r\n");
      out.write("<input type=\"hidden\" name=\"contentId\" id=\"contentId\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t<div id=\"Logo\">\r\n");
      out.write("\t\t<img src=\"img/logo/logo.png\" height=\"100\" width=\"200\" alt=\"タイトルロゴ\">\r\n");
      out.write("\t</div>\r\n");
      out.write("\r\n");
      out.write("\t<div id=\"Kanri\">\r\n");
      out.write("\t</div>\r\n");
      out.write("\r\n");
      out.write("\t<div ul=\"SubMenu\" style=\"list-style:none\" id=\"SubMenu\">\r\n");
      out.write("\t\t<li style=\"float:right\"><input type=\"submit\"  id=\"Button\" style=\"WIDTH: 70px; HEIGHT: 30px\" value=\"LogOut\" onClick=\"goMainServlet('-1');\"></li>\r\n");
      out.write("\t\t<li style=\"float:right\"><input type=\"submit\"  id=\"Button\" style=\"WIDTH: 70px; HEIGHT: 30px\" value=\"Profile\" onClick=\"goProfileServlet();\"></li>\r\n");
      out.write("\t\t<li style=\"float:right\"><input type=\"submit\"  id=\"Button\" style=\"WIDTH: 70px; HEIGHT: 30px\" value=\"Help\"  disabled></li>\r\n");
      out.write("\t\t<li style=\"float:right\"><input type=\"submit\"  id=\"Button\" style=\"WIDTH: 70px; HEIGHT: 30px\" value=\"Home\" onClick=\"goMainServlet();\"></li>\r\n");
      out.write("\t\t<li style=\"float:right\">\r\n");
      out.write("\t\t\t");

				if (userPosition.equals("Y00") || userPosition.equals("Y01") || userPosition.equals("Y02") || userPosition.equals("Y03") || userPosition.equals("Y04")) {
			
      out.write("\r\n");
      out.write("\t\t\t<input type=\"submit\" id=\"admin\" style=\"WIDTH: 70px; HEIGHT: 30px\" value=\"Admin\" onClick=\"goMasterMaintenanceServlet();\">\r\n");
      out.write("\t\t\t");

				} else {
			
      out.write("\r\n");
      out.write("\t\t\t<input type=\"submit\" id=\"admin\" style=\"WIDTH: 70px; HEIGHT: 30px\" value=\"Admin\" disabled>\r\n");
      out.write("\t\t\t");

				}
			
      out.write("\r\n");
      out.write("\t\t</li>\r\n");
      out.write("\t</div>\r\n");
      out.write("\r\n");
      out.write("\t<div id=\"LoginName\">\r\n");
      out.write("\t\t<div id=\"xLogo\" align=\"center\">\r\n");
      out.write("\t\t\t<img src=\"");
      out.print(loginUser.getSectionImg());
      out.write(".png\"><br />\r\n");
      out.write("\t\t\t<img src=\"");
      out.print(loginUser.getPositionImg());
      out.write("\">\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div id=\"yLogo\"><img src=\"");
      out.print(loginUser.getLevelImg());
      out.write(".png\"></div>\r\n");
      out.write("\t\t<div id=\"zLogo\"><font size=\"4\">いらっしゃいませ。</font><br/><h3 align=\"right\" >");
      out.print(loginUser.getUserName());
      out.write(" 　様</h3></div>\r\n");
      out.write("\t\t<div id=\"Name\"></div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\r\n");
      out.write("\t<div id=\"UserMenu\">\r\n");
      out.write("\t\t<input type=\"submit\"  id=\"Button\" style=\"WIDTH: 395px; HEIGHT: 100px\" value=\"ユーザー検索\" onClick=\"goSearchServlet('0');\">\r\n");
      out.write("\t\t<input type=\"submit\"  id=\"Button\" style=\"WIDTH: 395px; HEIGHT: 100px\" value=\"アドバイス\" disabled>\r\n");
      out.write("\t\t<input type=\"submit\"  id=\"Button\" style=\"WIDTH: 395px; HEIGHT: 100px\" value=\"イベントカレンダースケジュール\" onClick=\"goEventServlet();\">\r\n");
      out.write("\t</div>\r\n");
      out.write("\r\n");
      out.write("\t<div id=\"AdisQ\">\r\n");
      out.write("\t\t<div id=\"list\">\r\n");
      out.write("\t\t\t<table id=\"Koumoku\" border=\"2\" >\r\n");
      out.write("\t\t\t\t<tr >\r\n");
      out.write("\t\t\t\t\t<th width=\"50\" align=\"center\"><font size=\"5\">項目</font></th>\r\n");
      out.write("\t\t\t\t\t<th width=\"375\"align=\"center\"><font size=\"5\">内容</font></th>\r\n");
      out.write("\t\t\t\t\t<th width=\"130\"align=\"center\"><font size=\"5\">返答数</font></th>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t</table>\r\n");
      out.write("\r\n");
      out.write("\t\t\t<div id=\"scr\">\r\n");
      out.write("\t\t\t\t<table id=\"Chat\" border=\"1\" >\r\n");
      out.write("\t\t\t\t\t");

						for(int i=0; i<list.size(); i++){
									PostBean bean = list.get(i);
					
      out.write("\r\n");
      out.write("\t\t\t\t\t<tr onClick=\"contentList('");
      out.print(bean.getPostId());
      out.write("');\">\r\n");
      out.write("\t\t\t\t\t\t<th width=\"50\" align=\"center\">");
      out.print(bean.getItem());
      out.write("</th>\r\n");
      out.write("\t\t\t\t\t\t<th width=\"400\"align=\"left\">");
      out.print(bean.getContent());
      out.write("</t>\r\n");
      out.write("\t\t\t\t\t\t<td width=\"110\"align=\"center\">");
      out.print(bean.getCountRes());
      out.write("</td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t");

						}
					
      out.write("\r\n");
      out.write("\t\t\t\t</table>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t<select name=\"example\" id=\"box\">\r\n");
      out.write("\t\t\t\t<option value=\"Z01\">質問</option>\r\n");
      out.write("\t\t\t\t<option value=\"Z02\">情報</option>\r\n");
      out.write("\t\t\t</select>\r\n");
      out.write("\r\n");
      out.write("\t\t\t<input type=\"text\" name=\"text\" id=\"text\" size=\"68\">\r\n");
      out.write("\t\t\t<input type=\"submit\" name=\"H\" id=\"H\"  value=\"送信\" onClick=\"posting();\">\r\n");
      out.write("\t</div>\r\n");
      out.write("\r\n");
      out.write("\t<div id=\"AdisA\">\r\n");
      out.write("\t\t<div id=\"list\">\r\n");
      out.write("\t\t\t<table id=\"Koumoku\" border=\"2\">\r\n");
      out.write("\t\t\t\t<tr >\r\n");
      out.write("\t\t\t\t\t<th width=\"50\" align=\"center\"><font size=\"5\">項目</font></th>\r\n");
      out.write("\t\t\t\t\t<th width=\"510\"align=\"center\" ><font size=\"5\">");
      out.print(selectPost.getContent());
      out.write("<br /></font></th>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t</table>\r\n");
      out.write("\r\n");
      out.write("\t\t\t<div id=\"scr2\">\r\n");
      out.write("\t\t\t\t<table id=\"chat\" border=\"1\">\r\n");
      out.write("\t\t\t\t\t");

						for(int i=0; i<res.size(); i++){
																		PostBean bean = res.get(i);
					
      out.write("\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<th width=\"50\" align=\"center\">");
      out.print(bean.getItem());
      out.write("</th>\r\n");
      out.write("\t\t\t\t\t\t<th width=\"510\"align=\"left\">");
      out.print(bean.getContent());
      out.write("</th>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t");

					}
					
      out.write("\r\n");
      out.write("\t\t\t\t</table>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t<select name=\"res\" id=\"box\">\r\n");
      out.write("\t\t\t\t<option value=\"Z02\">情報</option>\r\n");
      out.write("\t\t\t\t<option value=\"Z03\">返答</option>\r\n");
      out.write("\t\t\t</select>\r\n");
      out.write("\r\n");
      out.write("\t\t\t<input type=\"text\" name=\"resText\" id=\"resText\" size=\"68\">\r\n");
      out.write("\t\t\t<input type=\"submit\" name=\"H\" id=\"H\" value=\"送信\" onClick=\"sendRes();\">\r\n");
      out.write("\t</div>\r\n");
      out.write("</form>\r\n");
      out.write("</body>\r\n");
      out.write("\r\n");
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
