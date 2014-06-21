package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.ArrayList;
import jp.ac.fjb.sotuken.bean.RirekiBean;
import jp.ac.fjb.sotuken.bean.UserBean;

public final class usermenu_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList(4);
    _jspx_dependants.add("/head.jsp");
    _jspx_dependants.add("/header.jsp");
    _jspx_dependants.add("/menu.jsp");
    _jspx_dependants.add("/footer.jsp");
  }

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

ArrayList<RirekiBean> list = (ArrayList)session.getAttribute("RIREKI");

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\">\r\n");
      out.write("<head>\r\n");
      out.write("<script src=\"./script/Menu.js\"></script>\r\n");
      out.write("<script src=\"./script/UserMenu.js\"></script>\r\n");
      out.write('\r');
      out.write('\n');
      out.write("\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\" />\r\n");
      out.write("<link href=\"./css/StyleSheet1.css\" rel=\"stylesheet\" type=\"text/css\" />\r\n");
      out.write("<script type=\"text/javascript\" src=\"./script/Menu.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"http://ajax.googleapis.com/ajax/libs/jquery/1.7.2/jquery.min.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"./script/footerFixed.js\"></script>");
      out.write("\r\n");
      out.write("<link href=\"./css/planPressStyle.css\" rel=\"stylesheet\" type=\"text/css\" />\r\n");
      out.write("<title>新規プラン投稿-FJBマラベル-</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write('\r');
      out.write('\n');
      out.write("\r\n");
      out.write("\r\n");

	String name="ログイン";
	UserBean loginUser = (UserBean)session.getAttribute("LOGIN_USER");
	if(loginUser!=null){name=loginUser.getUserName();};


      out.write("\r\n");
      out.write("<div id=\"header\">\r\n");
      out.write("\r\n");
      out.write("<div id=\"left\">\r\n");
      out.write("<img src=\"images/rogo01.jpg\">\r\n");
      out.write("</div><!-- left end -->\r\n");
      out.write("\r\n");
      out.write("<div id=\"right\">\r\n");
      out.write("<p><span class=\"bold\"><a href=\"");
      out.print(request.getContextPath() );
      out.write('/');
      out.write('\r');
      out.write('\n');
 if(name.equals("ログイン")){ 
      out.write("\r\n");
      out.write("LoginServlet\r\n");
 }else{ 
      out.write("\r\n");
      out.write("UserMenuServlet\r\n");
 } 
      out.write("\r\n");
      out.write("\">");
      out.print(name );
      out.write("</a></span></p>\r\n");
      out.write("<a href=\"dammy.jsp\">お問い合わせ</a>\r\n");
 if(!name.equals("ログイン")){ 
      out.write("\r\n");
      out.write("\t&frasl;<a href=\"/travelsys/LogoutServlet\">ログアウト</a>\r\n");
      out.write("\r\n");
 } 
      out.write("\r\n");
      out.write("</div><!-- right end -->\r\n");
      out.write("\r\n");
      out.write("</div><!-- header end -->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<div id=\"wrapper\">\r\n");
      out.write("\r\n");
      out.write('\r');
      out.write('\n');
      out.write("\r\n");
      out.write("<div id=\"nav\">\r\n");
      out.write("<form action=\"/travelsys/MenuServlet\" id=\"form\">\r\n");
      out.write("\t<ul>\r\n");
      out.write("\t\t<li><input type=\"button\" name=\"home\" id=\"home\" value=\"ホーム\"></li>\r\n");
      out.write("\t\t<li><input type=\"button\" name=\"search\" id=\"serch\" value=\"旅行プラン検索\"></li></a>\r\n");
      out.write("\t\t<li><input type=\"button\" name=\"makePlan\"  id=\"makePlan\" value=\"旅行を計画\"></li>\r\n");
      out.write("\t\t<li><input type=\"button\" name=\"userMenu\" id=\"usermenu\" value=\"ユーザーメニュー\"></li>\r\n");
      out.write("\t\t<li><input type=\"button\" name=\"bbs\" id=\"bbs\" value=\"掲示板\"></li></a>\r\n");
      out.write("\t\t<input type=\"hidden\" id=\"progId\" name=\"progId\">\r\n");
      out.write("\t</ul>\r\n");
      out.write("</form>\r\n");
      out.write("</div><!-- nav end -->");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<div id=\"contents\"><!-- ここから内容編集 -->\r\n");
      out.write("<h3>ユーザメニュー画面</h3>\r\n");
      out.write("<h2>お客様情報</h2>\r\n");
      out.write("<table border=\"1\">\r\n");
      out.write("\t<tr>\r\n");
      out.write("\t\t<th>ユーザID</th><td>");
      out.print(loginUser.getUserId() );
      out.write("</td>\r\n");
      out.write("\t</tr>\r\n");
      out.write("\t<tr>\r\n");
      out.write("\t\t<th>メールアドレス</th><td>");
      out.print( loginUser.getMailAddress() );
      out.write("</td>\r\n");
      out.write("\t</tr>\r\n");
      out.write("\t<tr>\r\n");
      out.write("\t\t<th>氏名</th><td>");
      out.print(loginUser.getUserName() );
      out.write("</td>\r\n");
      out.write("\t</tr>\r\n");
      out.write("\t<tr>\r\n");
      out.write("\t\t<th>フリガナ</th><td>");
      out.print(loginUser.getHurigana() );
      out.write("</td>\r\n");
      out.write("\t</tr>\r\n");
      out.write("\t<tr>\r\n");
      out.write("\t\t<th>生年月日</th><td>");
      out.print(loginUser.getBirthDay() );
      out.write("</td>\r\n");
      out.write("\t</tr>\r\n");
      out.write("\t<tr>\r\n");
      out.write("\t\t<th>性別</th><td>");
      out.print(loginUser.getSeibetu() );
      out.write("</td>\r\n");
      out.write("\t</tr>\r\n");
      out.write("\t<tr>\r\n");
      out.write("\t\t<th>郵便番号</th><td>");
      out.print(loginUser.getYubin() );
      out.write("</td>\r\n");
      out.write("\t</tr>\r\n");
      out.write("\t<tr>\r\n");
      out.write("\t\t<th>住所</th><td>");
      out.print(loginUser.getAddress() );
      out.write("</td>\r\n");
      out.write("\t</tr>\r\n");
      out.write("\t<tr>\r\n");
      out.write("\t\t<th>電話番号</th><td>");
      out.print(loginUser.getTell() );
      out.write("</td>\r\n");
      out.write("\t</tr>\r\n");
      out.write("</table>\r\n");
      out.write("\r\n");
      out.write("<h2>旅行履歴</h2>\r\n");
      out.write("<table border=\"1\">\r\n");
      out.write("\t<tr>\r\n");
      out.write("\t\t<th>旅行日時</th>\r\n");
      out.write("\t\t<th>注文ＩＤ</th>\r\n");
      out.write("\t\t<th>ツアー名</th>\r\n");
      out.write("\t\t<th>合計金額</th>\r\n");
      out.write("\t\t<th>支払方法</th>\r\n");
      out.write("\t\t<th>備考</th>\r\n");
      out.write("\t</tr>\r\n");
      out.write(" ");

        	for(int i=0; i<list.size(); i++){
            	RirekiBean rireki = list.get(i);
        
      out.write("\r\n");
      out.write("\t<tr>\r\n");
      out.write("\t\t<td>");
      out.print(rireki.getTyumonDay() );
      out.write("</td>\r\n");
      out.write("\t\t<td>");
      out.print(rireki.getTyumonId());
      out.write("</td>\r\n");
      out.write("\t\t<td>");
      out.print(rireki.getPranName() );
      out.write("</td>\r\n");
      out.write("\t\t<td>");
      out.print(rireki.getRyoukin() );
      out.write("</td>\r\n");
      out.write("\t\t<td>クレジットカード</td>\r\n");
      out.write("\t\t<td></td>\r\n");
      out.write("\t</tr>\r\n");
      out.write(" ");
} 
      out.write("\r\n");
      out.write("\r\n");
      out.write("</table>\r\n");
      out.write("<br>\r\n");
      out.write("<form action=\"UserMenuNextServlet\" id=\"f\">\r\n");
      out.write("<input type=\"button\" name=\"aaa\"  id=\"toukou\"  value=\"旅行プラン投稿\" class=\"btnPadding\">\r\n");
      out.write("\r\n");
      out.write("<input type=\"button\" name=\"aaa\"  id=\"info\" value=\"お客様情報変更\" class=\"btnPadding\">\r\n");
      out.write("\r\n");
      out.write("<input type=\"button\" name=\"aaa\"  id=\"qurejit\"  value=\"クレジットカード登録\" class=\"btnPadding\">\r\n");
      out.write("<input type=\"hidden\" id=\"prog\" name=\"prog\">\r\n");
      out.write("\r\n");
      out.write("</form>\r\n");
      out.write("</div><!-- contents end　ここまで編集 -->\r\n");
      out.write("\r\n");
      out.write("</div><!-- wrapper end -->\r\n");
      out.write("\r\n");
      out.write('\r');
      out.write('\n');
      out.write("\r\n");
      out.write("<div id=\"footer\">\r\n");
      out.write("Copyright (C) 2013 株式会社 FJBマラベル\r\n");
      out.write("</div><!-- footer end -->");
      out.write("\r\n");
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
