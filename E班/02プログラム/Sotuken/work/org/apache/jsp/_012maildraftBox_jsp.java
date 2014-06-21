package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.ArrayList;
import jp.ac.fjb.Sotuken.bean.UserMailBean;
import jp.ac.fjb.Sotuken.bean.LoginBean;

public final class _012maildraftBox_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\r\n");

	ArrayList<UserMailBean> list = (ArrayList) session.getAttribute("MAIL_LIST");
	LoginBean lb = (LoginBean) session.getAttribute("LOGIN_USER");

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("\t<head>\r\n");
      out.write("\t\t<meta charset=\"UTF-8\">\r\n");
      out.write("\t\t<meta name=\"keywords\" content=\"\">\r\n");
      out.write("\t\t<meta name=\"description\" content=\"\">\r\n");
      out.write("\t\t<link rel=\"stylesheet\" href=\"stylesheet/template/styleSheet.css\" type=\"text/css\"/>\r\n");
      out.write("\t\t<link rel=\"stylesheet\" href=\"stylesheet/template/header.css\" type=\"text/css\"/>\r\n");
      out.write("\t\t<link rel=\"stylesheet\" href=\"stylesheet/template/headerContent.css\" type=\"text/css\"/>\r\n");
      out.write("\t\t<link rel=\"stylesheet\" href=\"stylesheet/template/footer.css\" type=\"text/css\"/>\r\n");
      out.write("\t\t<link rel=\"stylesheet\" href=\"stylesheet/template/form.css\" type=\"text/css\"/>\r\n");
      out.write("\t\t<link rel=\"stylesheet\" href=\"stylesheet/template/nav.css\" type=\"text/css\"/>\r\n");
      out.write("\t\t<link rel=\"stylesheet\" href=\"stylesheet/012maildraftBox.css\" type=\"text/css\"/>\r\n");
      out.write("\t\t<script src=\"js/jquery.min.js\"></script>\r\n");
      out.write("\t\t<!--<script src=\"js/javascript.js\"></script>-->\r\n");
      out.write("\t\t<script src=\"js/mail.js\"></script>\r\n");
      out.write("\t\t<title>012未送信一覧画面</title>\r\n");
      out.write("\t</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("<form id=\"form\">\r\n");
      out.write("\r\n");
      out.write("\t<!-- ヘッダー　-->\r\n");
      out.write("\t<div id=\"header\">\r\n");
      out.write("\t\t<div id=\"wrap_header\">\r\n");
      out.write("\t\t\t<div id=\"headerSpace\"></div>\r\n");
      out.write("\t\t\t<!-- 会社のロゴ的なもの -->\r\n");
      out.write("\t\t\t<img id=\"logo\" src=\"img/logo.png\" />\r\n");
      out.write("\t\t\t<div id=\"headerContents\">\r\n");
      out.write("\t\t\t\t<div id=\"headerContentsSpace\"></div>\r\n");
      out.write("\t\t\t\t<div id=\"noticeList\">\r\n");
      out.write("\t\t\t\t\t<!-- 様々なその他の通知  -->\r\n");
      out.write("\t\t\t\t\t<div id=\"various\" class=\"headerList\">\r\n");
      out.write("\t\t\t\t\t\t<img class=\"icoSize\" src=\"img/various.png\">\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<!-- 友達追加通知  -->\r\n");
      out.write("\t\t\t\t\t<div id=\"friends\" class=\"headerList\">\r\n");
      out.write("\t\t\t\t\t\t<img class=\"icoSize\" src=\"img/friendsIco.png\">\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<!-- チャット通知  -->\r\n");
      out.write("\t\t\t\t\t<div id=\"realtimeChat\" class=\"headerList\">\r\n");
      out.write("\t\t\t\t\t\t<img class=\"icoSize\" src=\"img/chatIco.png\">\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<!-- メール通知  -->\r\n");
      out.write("\t\t\t\t\t<div id=\"message\" class=\"headerList\">\r\n");
      out.write("\t\t\t\t\t\t<img class=\"icoSize\" src=\"img/mailIco.png\">\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div id=\"menuList\">\r\n");
      out.write("\t\t\t\t\t<!-- つぶやきボタン-->\r\n");
      out.write("\t\t\t\t\t<a href=\"MyPageServlet\">\r\n");
      out.write("\t\t\t\t\t\t<div id=\"tweetPost\" class=\"headerList\">\r\n");
      out.write("\t\t\t\t\t\t\t<img class=\"icoSize\" src=\"img/tweet.png\">\r\n");
      out.write("\t\t\t\t\t\t</div> </a>\r\n");
      out.write("\t\t\t\t\t<!-- 友達検索 -->\r\n");
      out.write("\t\t\t\t\t<a href=\"018UserSearch.jsp\">\r\n");
      out.write("\t\t\t\t\t\t<div id=\"userSearch\" class=\"headerList\">\r\n");
      out.write("\t\t\t\t\t\t\t<img class=\"icoSize\" src=\"img/memberSearch.png\">\r\n");
      out.write("\t\t\t\t\t\t</div> </a>\r\n");
      out.write("\t\t\t\t\t<!-- ホーム -->\r\n");
      out.write("\t\t\t\t\t<a href=\"MyPageServlet\">\r\n");
      out.write("\t\t\t\t\t\t<div id=\"myPage\" class=\"headerList\">\r\n");
      out.write("\t\t\t\t\t\t\t<img class=\"icoSize\" src=\"img/homeIco.png\">\r\n");
      out.write("\t\t\t\t\t\t</div> </a>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<!-- ヘッダ終了 -->\r\n");
      out.write("\r\n");
      out.write("\t<!-- NAV要素 -->\r\n");
      out.write("\t<div id=\"nav\">\r\n");
      out.write("\t\t<div id=\"innerNav\">\r\n");
      out.write("\t\t\t<!-- ********** nav要素のユーザ領域 *********** -->\r\n");
      out.write("\t\t\t<a href=\"020UserInfo.jsp\">\r\n");
      out.write("\t\t\t\t<div id=\"myInformation\">\r\n");
      out.write("\t\t\t\t\t<div class=\"navList\">");
      out.print( lb.getName() );
      out.write("</div>\r\n");
      out.write("\t\t\t\t\t<img id=\"navUserIco\" class=\"ico\" src=\"img/default.png\" />\r\n");
      out.write("\t\t\t\t</div> </a>\r\n");
      out.write("\t\t\t<!-- /********** nav要素のユーザ領域 *********** -->\r\n");
      out.write("\r\n");
      out.write("\t\t\t<!-- ********** nav要素のニュース領域 *********** -->\r\n");
      out.write("\t\t\t<!-- ***************************************************************************** -->\r\n");
      out.write("\t\t\t<!-- ***************************************************************************** -->\r\n");
      out.write("\t\t\t<!-- ***************************************************************************** -->\r\n");
      out.write("\t\t\t<a href=\"MailServlet\">\r\n");
      out.write("\t\t\t\t<div id=\"newFeed\">\r\n");
      out.write("\t\t\t\t\t<div class=\"navList\">ニュース</div>\r\n");
      out.write("\t\t\t\t\t<img class=\"ico\" src=\"img/newsPaper.png\" />\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t</div> </a>\r\n");
      out.write("\t\t\t<!-- /********** nav要素のニュース領域 *********** -->\r\n");
      out.write("\r\n");
      out.write("\t\t\t<!-- ********** nav要素の画像領域 *********** -->\r\n");
      out.write("\t\t\t<a href=\"MailServlet\">\r\n");
      out.write("\t\t\t\t<div id=\"album\">\r\n");
      out.write("\t\t\t\t\t<div class=\"navList\">アルバム</div>\r\n");
      out.write("\t\t\t\t\t<img class=\"ico\" src=\"img/album.png\" />\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t</div> </a>\r\n");
      out.write("\t\t\t<!-- /********** nav要素のニュース領域 *********** -->\r\n");
      out.write("\t\t\t<!-- ***************************************************************************** -->\r\n");
      out.write("\t\t\t<!-- ***************************************************************************** -->\r\n");
      out.write("\t\t\t<!-- ***************************************************************************** -->\r\n");
      out.write("\t\t\t<!-- ********** nav要素のメール領域 *********** -->\r\n");
      out.write("\t\t\t<a href=\"MailServlet\">\r\n");
      out.write("\t\t\t\t<div id=\"mail\">\r\n");
      out.write("\t\t\t\t\t<div class=\"navList\">メール</div>\r\n");
      out.write("\t\t\t\t\t<img class=\"ico\" src=\"img/mail.png\" />\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</a>\r\n");
      out.write("\t\t\t<!-- /********** nav要素のメール領域 *********** -->\r\n");
      out.write("\r\n");
      out.write("\t\t\t<!-- ********** nav要素のチャット領域 *********** -->\r\n");
      out.write("\t\t\t<a href=\"groupSelectServlet\">\r\n");
      out.write("\t\t\t\t<div id=\"chat\">\r\n");
      out.write("\t\t\t\t\t<div class=\"navList\">チャット</div>\r\n");
      out.write("\t\t\t\t\t<img class=\"ico\" src=\"img/chat.png\" />\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t</div> </a>\r\n");
      out.write("\t\t\t<!-- /********** nav要素のチャット領域 *********** -->\r\n");
      out.write("\r\n");
      out.write("\t\t\t<!-- ********** nav要素の設定領域 *********** -->\r\n");
      out.write("\t\t\t<a href=\"006personalInformationChange.jsp\">\r\n");
      out.write("\t\t\t\t<div id=\"setting\">\r\n");
      out.write("\t\t\t\t\t<div class=\"navList\">設定</div>\r\n");
      out.write("\t\t\t\t\t<img class=\"ico\" src=\"img/setting.png\" />\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t</div> </a>\r\n");
      out.write("\t\t\t<!-- /********** nav要素の設定領域 *********** -->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t<!-- メイン　-->\r\n");
      out.write("\t\t<div id=\"main\">\r\n");
      out.write("\t\t\t<!-- ツイートエリアやタイムライン等、全てを含んだ領域  -->\r\n");
      out.write("\t\t\t<div id=\"timeLine\">\r\n");
      out.write("\t\t\t\t<!-- コンテンツ開始　 -->\r\n");
      out.write("\t\t\t\t<div id=\"contents\">\r\n");
      out.write("\t\t\t\t\t<!-- ********************************************************************** -->\r\n");
      out.write("\t\t\t\t\t<!-- メールの領域全体 -->\r\n");
      out.write("\t\t\t\t\t<div id=\"table\">\r\n");
      out.write("\t\t\t\t\t\t<!-- メッセージ作成・削除ボタンの領域  -->\r\n");
      out.write("\t\t\t\t\t\t<table id=\"mailbutton\">\r\n");
      out.write("\t\t\t\t\t\t\t<tr id=\"action\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<td id=\"operation\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<button id=\"button1\" class=\"frame button\" type=\"button\" value=\"aaa\" onclick=\"mailsakusei()\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\tメッセージ作成\r\n");
      out.write("\t\t\t\t\t\t\t\t</button></td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td id=\"delete\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<button id=\"deletemoveButton\"  name=\"deletemoveButton\" type=\"button\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\tvalue=\"03\" onclick=\"deletemoveClick3()\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t削除\r\n");
      out.write("\t\t\t\t\t\t\t\t</button></td>\r\n");
      out.write("\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t</table>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<!-- 受信箱、下書き、送信箱、ゴミ箱の領域  -->\r\n");
      out.write("\t\t\t\t\t\t<table id=\"mailtable1\">\r\n");
      out.write("\t\t\t\t\t\t\t<tr onclick=\"mail()\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<td class=\"box\"> 受信箱 </td>\r\n");
      out.write("\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t<tr onclick=\"maildraftBox()\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<td class=\"box\" id=\"backcolor\"> 下書き </td>\r\n");
      out.write("\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t<tr onclick=\"mailoutBox()\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<td class=\"box\"> 送信箱 </td>\r\n");
      out.write("\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t<tr onclick=\"mailtrashBox()\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<td class=\"box\"> ゴミ箱 </td>\r\n");
      out.write("\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td class=\"space\"></td>\r\n");
      out.write("\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t</table>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<!-- メールの一覧表示領域 　-->\r\n");
      out.write("\t\t\t\t\t\t<table id=\"mailtable2\">\r\n");
      out.write("\t\t\t\t\t\t\t<!-- 差出人、件名、送信日時 -->\r\n");
      out.write("\t\t\t\t\t\t\t<tr id=\"itemName\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<td class=\"checkbox partition\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<input class=\"check\" type=\"checkbox\" value=\"3\">\r\n");
      out.write("\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td class=\"clip partition\"><img class=\"clipImg\" src=\"img/clear.png\" /></td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td class=\"partition\"> 差出人 </td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td class=\"partition\"> 件名 </td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td> 送信日時 </td>\r\n");
      out.write("\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t<!-- 差出人、件名、送信日時終了 -->\r\n");
      out.write("\t\t\t\t\t\t\t\t");
 for(int i=0; i<list.size(); i++){
								 UserMailBean UserMail = list.get(i);
								 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t<tr class=\"line\">\r\n");
      out.write("\t\t\t\t\t\t\t\t <td>\r\n");
      out.write("\t\t\t\t\t\t\t\t <input type=\"checkBox\" name=\"mail\" value=\"");
      out.print(UserMail.getMailId());
      out.write("\">\r\n");
      out.write("\t\t\t\t\t\t\t\t </td>\r\n");
      out.write("\t\t\t\t\t\t\t\t <td class=\"clip\">\r\n");
      out.write("\t\t\t\t\t\t\t\t ");
 if (!"".equals(UserMail.getAttach())) { 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t <img class=\"clipImg\" src=\"img/clip.png\" />\r\n");
      out.write("\t\t\t\t\t\t\t\t ");
 } 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t </td>\r\n");
      out.write("\t\t\t\t\t\t\t\t <td onclick=\"mailkakunin()\">");
      out.print(UserMail.getUserName());
      out.write("</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t <td onclick=\"mailkakunin()\">");
      out.print(UserMail.getSubjectLine());
      out.write("</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t <td onclick=\"mailkakunin()\">");
      out.print(UserMail.getReceiptTime());
      out.write("</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t </tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t");

									}
									
      out.write("\r\n");
      out.write("\t\t\t\t\t\t</table>\r\n");
      out.write("\t\t\t\t\t\t<!-- メールの一覧表示領域 　-->\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<!-- メールの領域終了  -->\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<!-- コンテンツ終了 -->\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t<!-- フッター -->\r\n");
      out.write("\t\t\t<div id=\"footer\">\r\n");
      out.write("\t\t\t\t<div id=\"wrap_footer\">\r\n");
      out.write("\t\t\t\t\t<!-- フッターはここに書く　 -->\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t\t\t<input type=\"hidden\" id=\"progId\" name=\"progId\">\r\n");
      out.write("</form>\r\n");
      out.write("\t</body>\r\n");
      out.write("</html>\r\n");
      out.write("\r\n");
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
