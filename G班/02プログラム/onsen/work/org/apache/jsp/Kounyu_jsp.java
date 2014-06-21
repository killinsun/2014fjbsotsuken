package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import jp.ac.fjb.onsen.bean.UserBean;
import jp.ac.fjb.onsen.bean.SyouhinBean;
import java.util.ArrayList;

public final class Kounyu_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html; charaset=UTF-8;charset=UTF-8");
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
      out.write("\r\n");
      out.write("\r\n");

	UserBean loginUser = (UserBean) session.getAttribute("LOGIN_USER");
	if (loginUser==null) {
		loginUser = new UserBean();
		loginUser.setUserID("on00000");
	}
	ArrayList<SyouhinBean> hslist = (ArrayList)session.getAttribute("KOUNYU");

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">\r\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\" xml:lang=\"ja\" lang=\"ja\">\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\r\n");
      out.write("<meta http-equiv=\"Content-Style-Type\" content=\"text/css\" />\r\n");
      out.write("<meta http-equiv=\"Content-Script-Type\" content=\"text/javascript\" />\r\n");
      out.write("<meta http-equiv=\"imagetoolbar\" content=\"no\" />\r\n");
      out.write("<meta name=\"description\" content=\"\" />\r\n");
      out.write("<meta name=\"keywords\" content=\"\" />\r\n");
      out.write("<link rel=\"stylesheet\" href=\"css/reg.css\" type=\"text/css\" />\r\n");
      out.write("<script type=\"text/javascript\" src=\"js/jquery.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"js/common.js\"></script>\r\n");
      out.write("<title>温ラインショップ</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<div id=\"top\">\r\n");
      out.write("   <div id=\"headWrap\">\r\n");
      out.write("      <div id=\"header\">\r\n");
      out.write("         <h1><a href=\"index.html\"><img src=\"images/rogo2.png\" alt=\"\" /></a></h1>\r\n");
      out.write("         <div id=\"pr\">\r\n");
      out.write("            <p>温泉を紹介します。</p>\r\n");
      out.write("         </div>\r\n");
      out.write("         <div id=\"gnavi\">\r\n");
      out.write("            <ul>\r\n");
      out.write("               <li><font size=\"4\">ようこそ!! ");
      out.print(session.getAttribute("LOGIN_USERsei"));
      out.write("さん</font></li>\r\n");
      out.write("               <li><font size=\"4\" color='green'><a href=\"LoginServlet\">ログアウト</a></font></li>\r\n");
      out.write("            </ul>\r\n");
      out.write("         </div>\r\n");
      out.write("      </div><!-- /#header -->\r\n");
      out.write("   </div><!-- /#headWrap -->\r\n");
      out.write("   <div id=\"menu\">\r\n");
      out.write("      <ul>\r\n");
      out.write("\t\t\t<li class=\"home\"><a href=\"HomeServlet\"  id=\"home\">ホーム</a></li>\r\n");
      out.write("\t\t\t<li><a href=\"ShopTopServlet\" id=\"shop\">ショップ</a></li>\r\n");
      out.write("\t\t\t<li><a href=\"MypageServlet\" id=\"mypage\">マイページ</a></li>\r\n");
      out.write("\t\t\t<li><a href=\"#Top\" id=\"game\">ゲーム</a></li>\r\n");
      out.write("      </ul>\r\n");
      out.write("   </div><!-- /#menu -->\r\n");
      out.write("   <div id=\"contents\">\r\n");
      out.write("\t\t\t<div id=\"main\">\r\n");
      out.write("\t\t\t\t<h2>購入履歴</h2>\r\n");
      out.write("\t\t\t\t<p class=\"got\">\r\n");
      out.write("\t\t\t\t");

				for(int i=0;i<hslist.size();i++)
				{
				
      out.write("\r\n");
      out.write("\t\t\t\t\t<table border=\"1\" cellspacing=\"0\">\r\n");
      out.write("\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t<td width=\"100\"><font size=\"3\">");
      out.print( hslist.get(i).getSyouhinName() );
      out.write("<div style=\"text-align:center;\" valign=\"baseline\">購入日時:");
      out.print( hslist.get(i).getChiikicode() );
      out.write("<br>合計金額:");
      out.print( hslist.get(i).getTanka() );
      out.write("円</div>\r\n");
      out.write("\t\t\t\t\t\t\t<br>\r\n");
      out.write("\t\t\t\t\t\t\t<img src=");
      out.print( hslist.get(i).getImagepass() );
      out.write(" width=\"160px\" height=\"120px\" alt=\"\" />\r\n");
      out.write("\t\t\t\t\t\t\t</font>\r\n");
      out.write("\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t</table>\r\n");
      out.write("\t\t\t\t");

				}
				
      out.write("\r\n");
      out.write("\t\t\t\t</p>\r\n");
      out.write("\t\t\t\t<p></p>\r\n");
      out.write("\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<!-- /#main -->\r\n");
      out.write("      <div id=\"sub\">\r\n");
      out.write("         <div class=\"section\">\r\n");
      out.write("            <h2><font size=\"4px\">マイメニュー</font></h2>\r\n");
      out.write("            <ul>\r\n");
      out.write("            <font size=\"3px\">\r\n");
      out.write("               <li><a href=\"MypageServlet\">登録情報確認</a></li>\r\n");
      out.write("               <br>\r\n");
      out.write("               <li><a href=\"MTourokuhenkouServlet\">登録情報変更</a></li>\r\n");
      out.write("\t\t\t\t<br>\r\n");
      out.write("               <li><a href=\"MCardServlet\">クレジットカード</a></li>\r\n");
      out.write("               <br>\r\n");
      out.write("               <li><a href=\"MKounyuServlet\"><font color=\"blue\">購入履歴</font></a></li>\r\n");
      out.write("               <br>\r\n");
      out.write("               </font>\r\n");
      out.write("            </ul>\r\n");
      out.write("         </div><!-- /.section -->\r\n");
      out.write("         <div class=\"section\">\r\n");
      out.write("         </div><!-- /.section -->\r\n");
      out.write("      </div><!-- /#sub -->\r\n");
      out.write("      <div id=\"pageTop\">\r\n");
      out.write("         <a href=\"#top\">ページのトップへ戻る</a>\r\n");
      out.write("      </div><!-- /#pageTop -->\r\n");
      out.write("   </div><!-- /#contents -->\r\n");
      out.write("   <div id=\"footer\">\r\n");
      out.write("      <div id=\"footMenu\">\r\n");
      out.write("         <ul>\r\n");
      out.write("         </ul>\r\n");
      out.write("      </div><!-- /#footerMenu -->\r\n");
      out.write("      <div class=\"copyright\">Copyright &copy; 2011 YOUR SITE NAME All Rights Reserved.</div>\r\n");
      out.write("   </div><!-- /#footer -->\r\n");
      out.write("</div><!-- /#top -->\r\n");
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
