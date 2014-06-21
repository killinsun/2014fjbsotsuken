package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import jp.ac.fjb.onsen.bean.UserBean;
import jp.ac.fjb.onsen.bean.CardBean;

public final class Card_jsp extends org.apache.jasper.runtime.HttpJspBase
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

	CardBean card = (CardBean) session.getAttribute("CARD");

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
      out.write("\t\t<div id=\"contents\">\r\n");
      out.write("\t\t\t<div id=\"main\">\r\n");
      out.write("\t\t\t\t<h2>クレジットカード</h2>\r\n");
      out.write("\t\t\t\t<p class=\"got\">\r\n");
      out.write("\t\t\t\t<table border=\"1\" cellspacing=\"0\">\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<td>クレジットカードタイプ\r\n");
      out.write("\t\t\t\t\t\t<form name=\"yyyy\" method=\"post\" action=\"#\">\r\n");
      out.write("\t\t\t\t\t\t<select name=\"2\">\r\n");
      out.write("\t\t\t\t\t\t<option name=\"11\" value=\"VISA\">1つ選択してください</option>\r\n");
      out.write("\t\t\t\t\t\t<option name=\"11\" value=\"VISA\">VISA</option>\r\n");
      out.write("\t\t\t\t\t\t<option name=\"12\" value=\"JCB\">JCB</option>\r\n");
      out.write("\t\t\t\t\t\t</select>\r\n");
      out.write("\t\t\t\t\t\t</form><br>\r\n");
      out.write("\t\t\t\t\t\tカード番号<br>\r\n");
      out.write("\t\t\t\t\t\t<input type=\"Text\" name=\"CardID\" size=\"40px\" value=");
      out.print(card.getCardID() );
      out.write("><br>\r\n");
      out.write("\t\t\t\t\t\t<font color=\"red\">※クレジットカード番号をご入力の際は、ハイフン、スペースを入れずにご入力ください。</font>\r\n");
      out.write("\t\t\t\t\t\t<br>\r\n");
      out.write("\t\t\t\t\t\tカード名義<br><input type=\"Text\" name=\"CardName\" size=\"40px\" value=");
      out.print(card.getCardName() );
      out.write("><br><br>\r\n");
      out.write("\t\t\t\t\t\t有効期限（月/年）\r\n");
      out.write("\t\t\t\t\t\t<form name=\"yyyy\" method=\"post\" action=\"#\">\r\n");
      out.write("\t\t\t\t\t\t<select name=\"2\">\r\n");
      out.write("\t\t\t\t\t\t<option name=\"1\" value=\"1\">1</option>\r\n");
      out.write("\t\t\t\t\t\t<option name=\"2\" value=\"2\">2</option>\r\n");
      out.write("\t\t\t\t\t\t<option name=\"3\" value=\"3\">3</option>\r\n");
      out.write("\t\t\t\t\t\t<option name=\"4\" value=\"4\">4</option>\r\n");
      out.write("\t\t\t\t\t\t<option name=\"5\" value=\"1\">5</option>\r\n");
      out.write("\t\t\t\t\t\t<option name=\"6\" value=\"2\">6</option>\r\n");
      out.write("\t\t\t\t\t\t<option name=\"7\" value=\"3\">7</option>\r\n");
      out.write("\t\t\t\t\t\t<option name=\"8\" value=\"4\">8</option>\r\n");
      out.write("\t\t\t\t\t\t<option name=\"9\" value=\"4\">9</option>\r\n");
      out.write("\t\t\t\t\t\t<option name=\"10\" value=\"1\">10</option>\r\n");
      out.write("\t\t\t\t\t\t<option name=\"11\" value=\"2\">11</option>\r\n");
      out.write("\t\t\t\t\t\t<option name=\"12\" value=\"3\">12</option>\r\n");
      out.write("\t\t\t\t\t\t</select>\r\n");
      out.write("\t\t\t\t\t\t<select name=\"2\">\r\n");
      out.write("\t\t\t\t\t\t<option name=\"13\" value=\"1\">13</option>\r\n");
      out.write("\t\t\t\t\t\t<option name=\"14\" value=\"2\">14</option>\r\n");
      out.write("\t\t\t\t\t\t<option name=\"15\" value=\"3\">15</option>\r\n");
      out.write("\t\t\t\t\t\t<option name=\"16\" value=\"4\">16</option>\r\n");
      out.write("\t\t\t\t\t\t<option name=\"17\" value=\"1\">17</option>\r\n");
      out.write("\t\t\t\t\t\t<option name=\"18\" value=\"2\">18</option>\r\n");
      out.write("\t\t\t\t\t\t<option name=\"19\" value=\"3\">19</option>\r\n");
      out.write("\t\t\t\t\t\t<option name=\"20\" value=\"4\">20</option>\r\n");
      out.write("\t\t\t\t\t\t<option name=\"21\" value=\"4\">21</option>\r\n");
      out.write("\t\t\t\t\t\t<option name=\"22\" value=\"1\">22</option>\r\n");
      out.write("\t\t\t\t\t\t<option name=\"23\" value=\"2\">23</option>\r\n");
      out.write("\t\t\t\t\t\t<option name=\"24\" value=\"3\">24</option>\r\n");
      out.write("\t\t\t\t\t\t</select>\r\n");
      out.write("\t\t\t\t\t\t</form>\r\n");
      out.write("\t\t\t\t\t\t<br>\r\n");
      out.write("\t\t\t\t\t\tセキュリティコード<input type=\"Text\" name=\"Card\" size=\"10px\" value=");
      out.print(card.getSequrity() );
      out.write(">\r\n");
      out.write("\t\t\t\t\t\t<br>\r\n");
      out.write("\t\t\t\t\t\t<br>\r\n");
      out.write("\t\t\t\t\t<div style=\"text-align:right;\"><input type=\"button\" value=\"変更\" style=\"width:80px;height:30px\"></div>\r\n");
      out.write("\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t</table>\r\n");
      out.write("\t\t\t\t</p>\r\n");
      out.write("\t\t\t\t<p></p>\r\n");
      out.write("\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<!-- /#main -->\r\n");
      out.write("\t\t\t<div id=\"sub\">\r\n");
      out.write("\t\t\t\t<div class=\"section\">\r\n");
      out.write("\t\t\t\t\t<h2>\r\n");
      out.write("\t\t\t\t\t\t<font size=\"4px\">マイメニュー</font>\r\n");
      out.write("\t\t\t\t\t</h2>\r\n");
      out.write("\t\t\t\t\t<ul>\r\n");
      out.write("\t\t\t\t\t\t<font size=\"3px\">\r\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"MypageServlet\">登録情報確認</a>\r\n");
      out.write("\t\t\t\t\t\t</li> <br>\r\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"MTourokuhenkouServlet\">登録情報変更</a>\r\n");
      out.write("\t\t\t\t\t\t\t</li> <br>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<li><a href=\"MCardServlet\"><font color=\"blue\">クレジットカード</font></a>\r\n");
      out.write("\t\t\t\t\t\t\t\t</li> <br>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li><a href=\"MKounyuServlet\">購入履歴</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t               <br>\r\n");
      out.write("\t\t\t\t\t\t</font>\r\n");
      out.write("\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<!-- /.section -->\r\n");
      out.write("\t\t\t\t<div class=\"section\"></div>\r\n");
      out.write("\t\t\t\t<!-- /.section -->\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<!-- /#sub -->\r\n");
      out.write("\t\t\t<div id=\"pageTop\">\r\n");
      out.write("\t\t\t\t<a href=\"#top\">ページのトップへ戻る</a>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<!-- /#pageTop -->\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<!-- /#contents -->\r\n");
      out.write("   <div id=\"footer\">\r\n");
      out.write("      <div id=\"footMenu\">\r\n");
      out.write("         <ul>\r\n");
      out.write("\r\n");
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
