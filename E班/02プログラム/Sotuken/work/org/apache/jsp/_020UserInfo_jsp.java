package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import jp.ac.fjb.Sotuken.bean.LoginBean;

public final class _020UserInfo_jsp extends org.apache.jasper.runtime.HttpJspBase
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

	LoginBean lb = (LoginBean) session.getAttribute("LOGIN_USER");

      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<!--019該当者表示画面-->\r\n");
      out.write("<html>\r\n");
      out.write("\t<head>\r\n");
      out.write("\t\t<meta charset=\"UTF-8\">\r\n");
      out.write("\t\t<meta name=\"keywords\" content=\"\">\r\n");
      out.write("\t\t<meta name=\"description\" content=\"\">\r\n");
      out.write("  \t\t<link rel=\"stylesheet\" href=\"stylesheet/template/styleSheet.css\" type=\"text/css\"/>\r\n");
      out.write(" \t\t<link rel=\"stylesheet\" href=\"stylesheet/template/header.css\" type=\"text/css\"/>\r\n");
      out.write("  \t\t<link rel=\"stylesheet\" href=\"stylesheet/template/headerContent.css\" type=\"text/css\"/>\r\n");
      out.write(" \t\t<link rel=\"stylesheet\" href=\"stylesheet/template/footer.css\" type=\"text/css\"/>\r\n");
      out.write(" \t\t<link rel=\"stylesheet\" href=\"stylesheet/template/form.css\" type=\"text/css\"/>\r\n");
      out.write(" \t\t<link rel=\"stylesheet\" href=\"stylesheet/template/nav.css\" type=\"text/css\"/>\r\n");
      out.write("\t\t<link rel=\"stylesheet\" href=\"stylesheet/020UserInfo.css\" type=\"text/css\"/>\r\n");
      out.write("\r\n");
      out.write("\t\t<title>020ユーザ情報画面</title>\r\n");
      out.write("\t</head>\r\n");
      out.write("\r\n");
      out.write("\t<body>\r\n");
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
      out.write("\t\t\t<a href=\"020UserInfo.jsp\">\r\n");
      out.write("\t\t\t\t<div id=\"newFeed\">\r\n");
      out.write("\t\t\t\t\t<div class=\"navList\">ニュース</div>\r\n");
      out.write("\t\t\t\t\t<img class=\"ico\" src=\"img/newsPaper.png\" />\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t</div> </a>\r\n");
      out.write("\t\t\t<!-- /********** nav要素のニュース領域 *********** -->\r\n");
      out.write("\r\n");
      out.write("\t\t\t<!-- ********** nav要素の画像領域 *********** -->\r\n");
      out.write("\t\t\t<a href=\"020UserInfo.jsp\">\r\n");
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
      out.write("\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t<!-- メイン　-->\r\n");
      out.write("\t\t<div id=\"main\">\r\n");
      out.write("\t\t\t<!-- ツイートエリアやタイムライン等、全てを含んだ領域  -->\r\n");
      out.write("\t\t\t<div id=\"timeLine\">\r\n");
      out.write("\t\t\t\t<!-- コンテンツ開始　 -->\r\n");
      out.write("\t\t\t\t<div id=\"contents\">\r\n");
      out.write("\t\t\t\t\t<!-- ********************************************************************** -->\r\n");
      out.write("\t\t\t\t\t<div id=\"userInfo\">\r\n");
      out.write("\t\t\t\t\t\t<h2>ユーザ情報</h2>\r\n");
      out.write("\t\t\t\t\t\t<div id=\"left\">\r\n");
      out.write("\t\t\t\t\t\t\t<div id=\"userIconArea\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<img src=\"img/defaultBlack.png\" width=\"120\" height=\"120\" alt=\"ユーザアイコン\" />\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t<p>\r\n");
      out.write("\t\t\t\t\t\t\t\t詳細不明\r\n");
      out.write("\t\t\t\t\t\t\t</p>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<div id=\"right\">\r\n");
      out.write("\t\t\t\t\t\t\t<div id=\"user\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<table>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<td class=\"name\">名前</td><td>名称不明</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<td class=\"name\">性別</td><td>不明</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<td class=\"name\">生年月日</td><td>不明</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<td class=\"name\">メールアドレス</td><td>○○○○○○○○</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<td class=\"name\">住所</td><td>千葉県八街市○○○○</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<td class=\"name\">部署</td><td>総務部</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<td class=\"name\">紹介</td><td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<p>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tとにかく前に！前に！がモットーの○大学○学部の、\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t○○と申します。大学時代も前へ前への精神で、様々なことに挑戦してきました。<br />\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<p>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t特に、ハードだったのが、２ヶ月の海外インターンでインドの企業で働いた経験です。スキルもなく、\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t語学もいまいちで、最初は全く貢献できませんでした。<br />\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<p>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tただ、前へ、前への精神で、恥をかく事承知で、わからないことは同僚にどんどん質問し、\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t自宅で学んだことを必ず振り返るようにしました。さらに、関連する書籍があれば、英語でしたが時間をかけて読み込んでいきました。<br />\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<p>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t結果、２週間ほどで業務内容も理解できるようになり、後半では業務改善提案を自分でもできるようになりました。この前へ前へ精神は、\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t貴社が重視しているフロンティアスピリッツとも一致すると考えます。本日はよろしくお願い致します。<br />\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t</table>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<!-- /********************************************************************* -->\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<!-- コンテンツ終了 -->\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t<!-- フッター -->\r\n");
      out.write("\t\t<div id=\"footer\">\r\n");
      out.write("\t\t\t<div id=\"wrap_footer\">\r\n");
      out.write("\t\t\t\t<!-- フッターはここに書く　 -->\r\n");
      out.write("\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t</body>\r\n");
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
