package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.ArrayList;
import jp.ac.fjb.eLearning.bean.OsiraseBean;
import jp.ac.fjb.eLearning.bean.NewsBean;
import jp.ac.fjb.eLearning.bean.MenteBean;

public final class Mainmenu_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">\r\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\">\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=shift_jis\" />\r\n");
      out.write("<meta http-equiv=\"Content-Style-Type\" content=\"text/css\" />\r\n");
      out.write("<meta http-equiv=\"Content-Script-Type\" content=\"text/javascript\" />\r\n");
      out.write("<meta name=\"copyright\" content=\"Nikukyu-Punch\" />\r\n");
      out.write("<title>学習用e-ラーニングサイト</title>\r\n");
      out.write("<link href=\"css/Mainmenu1.css\" rel=\"stylesheet\" type=\"text/css\" />\r\n");
      out.write("<script type=\"text/javascript\" src=\"js/script.js\"></script>\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body onload=\"MM_preloadImages('images/menu_over_01.gif','images/menu_over_02.gif','images/menu_over_03.gif','images/menu_over_04.gif','images/menu_over_05.gif','images/menu_over_06.gif')\">\r\n");
      out.write("<form id=\"menuform\">\r\n");
      out.write("<div id=\"container\">\r\n");
      out.write("<div id=\"main-img\"><h1>メインメニュー</h1><img src=\"images/main_img2.jpg\" width=\"800\" height=\"175\" /></div>\r\n");
      out.write("<ul id=\"menu\">\r\n");
      out.write("<li><a href=\"Mainmenu.jsp\"><img src=\"images/menu_++1.gif\" alt=\"ホーム\" name=\"Image1\" width=\"140\" height=\"59\" id=\"Image1\" onmouseover=\"MM_swapImage('Image1','','images/menu_over_++01.gif',1)\" onmouseout=\"MM_swapImgRestore()\" /></a></li><!--\r\n");
      out.write("\t\t\t--><li><a href=\"e-learningmenu.jsp\"><img src=\"images/menu_++2.gif\" alt=\"当サイトについて\" name=\"Image2\" width=\"133\" height=\"59\" id=\"Image2\" onmouseover=\"MM_swapImage('Image2','','images/menu_over_++02.gif',1)\" onmouseout=\"MM_swapImgRestore()\" /></a></li><!--\r\n");
      out.write("\t\t\t--><li><a href=\"Mainmenu.jsp\"><img src=\"images/menu_++3.gif\" alt=\"お仕事\" name=\"Image3\" width=\"134\" height=\"59\" id=\"Image3\" onmouseover=\"MM_swapImage('Image3','','images/menu_over_++03.gif',1)\" onmouseout=\"MM_swapImgRestore()\" /></a></li><!--\r\n");
      out.write("\t\t\t--><li><a href=\"Mainmenu.jsp\"><img src=\"images/menu_++4.gif\" alt=\"ブログ\" name=\"Image4\" width=\"133\" height=\"59\" id=\"Image4\" onmouseover=\"MM_swapImage('Image4','','images/menu_over_++04.gif',1)\" onmouseout=\"MM_swapImgRestore()\" /></a></li><!--\r\n");
      out.write("\t\t\t--><li><a href=\"Mainmenu.jsp\"><img src=\"images/menu_++5.gif\" alt=\"お問い合わせ\" name=\"Image5\" width=\"133\" height=\"59\" id=\"Image5\" onmouseover=\"MM_swapImage('Image5','','images/menu_over_++05.gif',1)\" onmouseout=\"MM_swapImgRestore()\" /></a></li><!--\r\n");
      out.write("\t\t\t--><li><a href=\"Mainmenu.jsp\"><img src=\"images/menu_++6.gif\" alt=\"リンク\" name=\"Image6\" width=\"139\" height=\"59\" id=\"Image6\" onmouseover=\"MM_swapImage('Image6','','images/menu_over_++06.gif',1)\" onmouseout=\"MM_swapImgRestore()\" /></a></li><!--\r\n");
      out.write("\t\t\t--></ul>\r\n");
      out.write("<div id=\"contents\">\r\n");
      out.write("<div id=\"main\">\r\n");
      out.write("<h2>新着ニュース</h2>\r\n");
      out.write("<DIV style=\"overflow-y:scroll;width:500px;height:100px;\">\r\n");

	ArrayList<NewsBean> listN
	= (ArrayList)session.getAttribute("NewsList");

	for(int i = 0; i < listN.size(); i++){
    	NewsBean bean = listN.get(i); 		 //ArrayListの要素を取得
    	out.println( " ■"+bean.getHiduke()+" "+ bean.getHonbun() +  "<br>");
	}

      out.write("\r\n");
      out.write("\r\n");
      out.write("</DIV>\r\n");
      out.write("\r\n");
      out.write("<h2>おしらせ</h2>\r\n");
      out.write("<DIV style=\"overflow-y:scroll;width:500px;height:100px;\">\r\n");
      out.write("\r\n");

	ArrayList<OsiraseBean> listO
	= (ArrayList)session.getAttribute("OsiraseList");

	for(int i = 0; i < listO.size(); i++){
    	OsiraseBean bean = listO.get(i); 		 //ArrayListの要素を取得
    	out.println( " ■"+bean.getHiduke()+" "+bean.getHonbun() + "<br>");
	}

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</div>\r\n");
      out.write("<h2>メンテナンス</h2>\r\n");
      out.write("<DIV style=\"overflow-y:scroll;width:500px;height:100px;\">\r\n");

	ArrayList<MenteBean> listMN
	= (ArrayList)session.getAttribute("MenteList");

	for(int i = 0; i < listMN.size(); i++){
    	MenteBean bean = listMN.get(i); 		 //ArrayListの要素を取得
    	out.println( " ■"+bean.getHiduke()+" "+ bean.getHonbun() + "<br>");
	}

      out.write("\r\n");
      out.write("</div>\r\n");
      out.write("<h2>ユーザ様へ</h2>\r\n");
      out.write("<p>\r\n");
      out.write("当サイトをご利用いただき誠にありがとうございます。\r\n");
      out.write("<br>\r\n");
      out.write("今後も利用者様から寄せられた要望や使いやすさの追求をもとにより良いサイトにしていきますので今後もよろしくお願いします。\r\n");
      out.write("</p>\r\n");
      out.write("<h2>利用規約</h2>\r\n");
      out.write("<DIV style=\"overflow-y:scroll;width:500px;height:100px;\">\r\n");
      out.write("<p>\r\n");
      out.write("第1条（本コンテンツの使用許諾および利用条件）\r\n");
      out.write("<br>\r\n");
      out.write("1.当社は、利用者に対し、本コンテンツを無償で使用する権利を許諾します。\r\n");
      out.write("<br>\r\n");
      out.write("2.テンプレート、テンプレートに含まれる画像およびWEB素材の改変および加工（以下総称し\r\n");
      out.write("　て「改変等」といいます）は、利用者の責任において自由に行うことができます。\r\n");
      out.write("<br>\r\n");
      out.write("3.利用者は、本規約および当サイトにおいて当社が公開するまたは個別に通知もしくは提供\r\n");
      out.write("　する本コンテンツの機能説明、利用方法に関する説明、注意事項および制限事項等（以下　総称して「説明書等」といいます）に従い本コンテンツを利用するものとします。\r\n");
      out.write("<br>\r\n");
      out.write("第2条（禁止事項）\r\n");
      out.write("<br>\r\n");
      out.write("利用者は、本コンテンツの利用または改変等に関連し、以下の行為を行わないものとします。\r\n");
      out.write("<br>\r\n");
      out.write("(1)本規約および説明書等の定めに違反する行為\r\n");
      out.write("<br>\r\n");
      out.write("(2)国内外の諸法令に違反するおそれのある行為\r\n");
      out.write("<br>\r\n");
      out.write("(3)当社または第三者の権利（著作権、著作隣接権および商標権を含む知的財産権、プライ　バシー権、肖像権ならびに名誉権等を含むがこれらに限らない）を侵害する、またはそのお　それのある行為\r\n");
      out.write("<br>\r\n");
      out.write("(4)マルチ商法、ねずみ講またはネットワークビジネス等への勧誘等を行う行為\r\n");
      out.write("<br>\r\n");
      out.write("(5)風俗、アダルトに関する情報、未成年者や青少年に有害な情報、またはそれらに類すると　判断される情報を発信する行為\r\n");
      out.write("<br>\r\n");
      out.write("(6)反社会的、暴力的、猟奇的な情報を発信する行為\r\n");
      out.write("<br>\r\n");
      out.write("(7)犯罪行為その他の違法行為を幇助、教唆、助長する行為\r\n");
      out.write("<br>\r\n");
      out.write("(8)不正にアクセスする行為、クラッキング行為、アタック行為、ウィルス発信行為、その他当　社または第三者の運用するコンピュータ等に支障を与える行為、またはそのおそれのある　　行為\r\n");
      out.write("<br>\r\n");
      out.write("(9)本コンテンツまたは改変等を行った本コンテンツ（以下総称して「本コンテンツ等」といいま　す）の第三者への配布、使用許諾または権利の譲渡\r\n");
      out.write("<br>\r\n");
      out.write("(10)本コンテンツ等を記録した媒体の第三者への配布または販売\r\n");
      out.write("</p>\r\n");
      out.write("</div>\r\n");
      out.write("<h2>その他リンク</h2>\r\n");
      out.write("<p><span class=\"color1\">■<strong>当社関連サイト</strong></span><br />\r\n");
      out.write("<a href=\"http://template-punch.com/\" target=\"_blank\"><img src=\"images/banner_tp.png\" alt=\"テンプレート販売サイトのテンプレートパンチ\" width=\"200\" height=\"40\" /></a></p>\r\n");
      out.write("<p><a href=\"http://moko-design.com/\" target=\"_blank\"><img src=\"images/banner_md.png\" alt=\"WEB制作サイト Moko Design\" width=\"200\" height=\"40\" /></a></p>\r\n");
      out.write("<p><a href=\"http://photo-chips.com/\" target=\"_blank\"><img src=\"images/banner_pc.png\" alt=\"フリー写真サイト PHOTO CHIPS\" width=\"200\" height=\"40\" /></a></p>\r\n");
      out.write("\r\n");
      out.write("</div><!--main-->\r\n");
      out.write("<div id=\"sub\">\r\n");
      out.write("\r\n");
      out.write("<h3><img src=\"images/sub_menu_midashi_topics.gif\" alt=\"トピックス\" width=\"226\" height=\"32\" /></h3>\r\n");
      out.write("<div class=\"menubottom\">\r\n");
      out.write("<a class=\"twitter-timeline\" href=\"https://twitter.com/jallyman23\" data-widget-id=\"388179343463030785\">@jallyman23 からのツイート</a>\r\n");
      out.write("<script>!function(d,s,id){var js,fjs=d.getElementsByTagName(s)[0],p=/^http:/.test(d.location)?'http':'https';if(!d.getElementById(id)){js=d.createElement(s);js.id=id;js.src=p+\"://platform.twitter.com/widgets.js\";fjs.parentNode.insertBefore(js,fjs);}}(document,\"script\",\"twitter-wjs\");</script>\r\n");
      out.write("\r\n");
      out.write("<!--<input name=\"textfield\" type=\"text\" style=\"width: 90%\" value=\"&lt;li&gt;&lt;a href=&quot;#&quot;&gt;* sub menu 1 *&lt;/a&gt;&lt;/li&gt;\" />-->\r\n");
      out.write("<p>\r\n");
      out.write("</div><!--menubottom-->\r\n");
      out.write("<br />\r\n");
      out.write("</div>\r\n");
      out.write("<!--sub-->\r\n");
      out.write("</div><!--contents-->\r\n");
      out.write("<div id=\"footer\">Copyright(C)2013 秀英社 All Rights Reserved.<br />\r\n");
      out.write("<a href=\"http://nikukyu-punch.com/\" target=\"_blank\">Template design by Nikukyu-Punch</a></div>\r\n");
      out.write("</div>\r\n");
      out.write("</body>\r\n");
      out.write("</form>\r\n");
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
