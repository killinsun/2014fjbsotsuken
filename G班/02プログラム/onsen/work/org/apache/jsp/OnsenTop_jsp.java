package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.ArrayList;
import jp.ac.fjb.onsen.bean.UserBean;
import jp.ac.fjb.onsen.bean.OnsenBean;
import jp.ac.fjb.onsen.bean.SyouhinBean;
import jp.ac.fjb.onsen.model.HomeModel;

public final class OnsenTop_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");

	UserBean loginUser = (UserBean) session.getAttribute("LOGIN_USER");
	if (loginUser==null) {
		loginUser = new UserBean();
		loginUser.setUserID("on00000");
	}

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
      out.write("<link rel=\"stylesheet\" href=\"css/common.css\" type=\"text/css\" />\r\n");
      out.write("<script type=\"text/javascript\" src=\"js/jquery.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"js/common.js\"></script>\r\n");
      out.write("<script src=\"js/sSearch.js\"></script>\r\n");
      out.write("<title>温ラインショップ</title>\r\n");
      out.write("<script src=\"./script/Home.js\"></script>\r\n");
      out.write("<script src=\"js/oCate.js\"></script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t<div id=\"top\">\r\n");
      out.write("\t\t<div id=\"headWrap\">\r\n");
      out.write("\t\t\t<div id=\"header\">\r\n");
      out.write("\t\t\t\t<h1>\r\n");
      out.write("\t\t\t\t\t<a href=\"index.html\"><img src=\"images/rogo2.png\" alt=\"\" /> </a>\r\n");
      out.write("\t\t\t\t</h1>\r\n");
      out.write("\t\t\t\t<form action=\"/onsen/LoginServlet\">\r\n");
      out.write("\t\t\t\t\t<div id=\"gnavi\">\r\n");
      out.write("\t\t\t\t\t\t<ul>\r\n");
      out.write("\t\t\t\t\t\t\t");

								if (loginUser.getUserID().equals("on00000")) {
							
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t<li><font size=\"4\">ようこそ!! </font>\r\n");
      out.write("\t\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t\t<li><font size=\"4\" color='green'><a\r\n");
      out.write("\t\t\t\t\t\t\t\t\thref=\"LoginServlet\">ログイン</a> </font></li>\r\n");
      out.write("\t\t\t\t\t\t\t");

								} else {
							
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t<li><font size=\"4\">ようこそ!! ");
      out.print(loginUser.getSei());
      out.write("さん</font>\r\n");
      out.write("\t\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t\t<li><font size=\"4\" color='green'><a\r\n");
      out.write("\t\t\t\t\t\t\t\t\thref=\"LoginServlet\">ログアウト</a>\r\n");
      out.write("\t\t\t\t\t\t\t</font>\r\n");
      out.write("\t\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t\t");

								}
							
      out.write("\r\n");
      out.write("\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</form>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<!-- /#header -->\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<!-- /#headWrap -->\r\n");
      out.write("\t\t<form action=\"/Onsen/HomeServlet\">\r\n");
      out.write("\t\t\t<div id=\"menu\">\r\n");
      out.write("\t\t\t\t<ul>\r\n");
      out.write("\t\t\t\t\t<li class=\"home\"><a href=\"HomeServlet\"  id=\"home\">ホーム</a></li>\r\n");
      out.write("\t\t\t\t\t<li><a href=\"STopServlet\" id=\"shop\">ショップ</a></li>\r\n");
      out.write("\t\t\t\t\t");

						if (loginUser.getUserID().equals("on00000")) {
					
      out.write("\r\n");
      out.write("\t\t\t\t\t<li><a href=\"LoginServlet\" id=\"mypage\">マイページ</a></li>\r\n");
      out.write("\t\t\t\t\t");

						} else {
					
      out.write("\r\n");
      out.write("\t\t\t\t\t<li><a href=\"MypageServlet\" id=\"mypage\">マイページ</a></li>\r\n");
      out.write("\t\t\t\t\t");

						}
					
      out.write("\r\n");
      out.write("\t\t\t\t\t<li><a href=\"Game.jsp\" id=\"game\">ゲーム</a></li>\r\n");
      out.write("\t\t\t\t</ul>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</form>\r\n");
      out.write("\t\t<!-- /#menu -->\r\n");
      out.write("\t\t<div id=\"icatch\">\r\n");
      out.write("\t\t\t<img src=\"images/icatch.jpg\" width=\"787px\" alt=\"\" />\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div id=\"contents\">\r\n");
      out.write("\t\t\t<div id=\"main\">\r\n");
      out.write("\t\t\t\t<h2>宿・ホテル予約</h2>\r\n");
      out.write("\t\t\t\t<h3>エリアから探す</h3>\r\n");
      out.write("\t\t\t\t<p>\r\n");
      out.write("\t\t\t\t\t<div class=\"area\">\r\n");
      out.write("\t\t\t\t\t\t<dl>\r\n");
      out.write("\t\t\t\t\t\t\t<dt>全国マップ</dt>\r\n");
      out.write("\t\t\t\t\t\t\t<dd class=\"description\">ご希望のエリアをクリックしてください。</dd>\r\n");
      out.write("\t\t\t\t\t\t\t<dd class=\"map\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<img src=\"images/map.gif\" alt=\"全国マップ\" width=\"515\" height=\"210\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\tusemap=\"#mapArea\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<map name=\"mapArea\" id=\"mapArea\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<area shape=\"poly\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tcoords=\"415,2,509,2,485,51,435,51,432,57,388,57\" href=\"HokkaidouServlet\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\talt=\"北海道\" title=\"北海道エリア\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<area shape=\"poly\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tcoords=\"386,61,459,61,424,131,369,131,383,104,365,104\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\thref=\"TouhokuServlet\" alt=\"東北\" title=\"東北エリア\" >\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<area shape=\"poly\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tcoords=\"351,133,423,133,392,196,363,196,368,187,324,187\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\thref=\"KantouServlet\" alt=\"関東\" title=\"関東エリア\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<area shape=\"poly\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tcoords=\"277,108,306,108,302,117,358,117,364,106,380,106,368,131,350,131,334,162,293,162,301,144,259,144\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\thref=\"HokurikuServlet\" alt=\"北陸・信越\" title=\"北陸・信越エリア\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<area shape=\"poly\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tcoords=\"273,146,299,146,290,164,333,164,322,187,278,187,274,196,248,196\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\thref=\"ToukaiServlet\" alt=\"東海\" title=\"東海エリア\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<area shape=\"poly\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tcoords=\"234,117,270,117,256,146,271,146,246,196,203,196,223,154,215,154\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\thref=\"KinkiServlet\" alt=\"近畿\" title=\"近畿エリア\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<area shape=\"poly\" coords=\"166,117,232,117,213,154,147,154\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\thref=\"TyuugokuServlet\" alt=\"中国\" title=\"中国エリア\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<area shape=\"poly\" coords=\"150,158,213,158,194,196,131,196\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\thref=\"ShikokuServlet\" alt=\"四国\" title=\"四国エリア\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<area shape=\"poly\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tcoords=\"96,117,162,117,118,206,66,206,92,153,78,153\" href=\"KyuusyuuServlet\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\talt=\"九州\" title=\"九州エリア\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<area shape=\"poly\" coords=\"19,180,63,180,50,206,6,206\" href=\"OkinawaServlet\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\talt=\"沖縄\" title=\"沖縄エリア\">\r\n");
      out.write("\t\t\t\t\t\t\t\t</map>\r\n");
      out.write("\t\t\t\t\t\t\t</dd>\r\n");
      out.write("\t\t\t\t\t\t</dl>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</p>\r\n");
      out.write("\t\t\t\t<p></p>\r\n");
      out.write("\t\t\t\t<h3>Pick Up</h3>\r\n");
      out.write("\t\t\t\t<p>\r\n");
      out.write("\t\t\t\t");
 HomeModel model = new HomeModel();
					OnsenBean on1 = model.getOnsen("ON00001");
					OnsenBean on2 = model.getOnsen("ON00002");
					OnsenBean on3 = model.getOnsen("ON00003");
      out.write("\r\n");
      out.write("\t\t\t\t<form action=\"/onsen/OSyousaiServlet\" id=\"form\">\r\n");
      out.write("\t\t\t\t\t<table border=\"1\">\r\n");
      out.write("\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t<td><a href=");
      out.print(request.getContextPath());
      out.write("/OSyousaiServlet?OnsenID=\"ON00001\"><div style=\"text-align: center;\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<input type=\"image\" src=");
      out.print(on1.getImagepass() );
      out.write(" id=\"on1\" width=\"140px\"  height=\"87px\" alt=\"\" />\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t<br>\r\n");
      out.write("\t\t\t\t\t\t\t\t<div style=\"text-align: center;\">");
      out.print(on1.getOnsenName());
      out.write("</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t<td><a href=");
      out.print(request.getContextPath());
      out.write("/OSyousaiServlet?OnsenID=\"ON00002\"><div style=\"text-align: center;\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<input type=\"image\" src=");
      out.print(on2.getImagepass() );
      out.write(" id=\"on2\"  width=\"140px\"  height=\"87px\" alt=\"\" />\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t<br>\r\n");
      out.write("\t\t\t\t\t\t\t\t<div style=\"text-align: center;\">");
      out.print(on2.getOnsenName());
      out.write("</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t<td><a href=");
      out.print(request.getContextPath());
      out.write("/OSyousaiServlet?OnsenID=\"ON00003\"><div style=\"text-align: center;\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<input type=\"image\" src=");
      out.print(on3.getImagepass() );
      out.write(" id=\"on3\"  width=\"140px\" height=\"87px\"  alt=\"\" />\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t<br>\r\n");
      out.write("\t\t\t\t\t\t\t\t<div style=\"text-align: center;\">");
      out.print(on3.getOnsenName());
      out.write("</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t</table>\r\n");
      out.write("\t\t\t\t\t<input type=\"hidden\" id=\"progId2\" name=\"progId2\" />\r\n");
      out.write("\t\t\t\t</form>\r\n");
      out.write("\t\t\t\t</p>\r\n");
      out.write("\t\t\t\t<h2>オンラインショップ</h2>\r\n");
      out.write("\t\t\t\t<h3>新着商品情報</h3>\r\n");
      out.write("\t\t\t\t<p>\r\n");
      out.write("\t\t\t\t");
 SyouhinBean sh1 = model.getSyouhin("SH00003");
					SyouhinBean sh2 = model.getSyouhin("SH00004");
					SyouhinBean sh3 = model.getSyouhin("SH00005");
					ArrayList<SyouhinBean> otlist = new ArrayList<SyouhinBean>();
					otlist.add(sh1);
					otlist.add(sh2);
					otlist.add(sh3);
					session.setAttribute("O_TOP_ITEMS", otlist);
				
      out.write("\r\n");
      out.write("\t\t\t\t<form action=\"OtopSSyousaiServlet\" id=\"selectForm\">\r\n");
      out.write("\t\t\t\t\t<table border=\"1\">\r\n");
      out.write("\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t<td><div style=\"text-align: center;\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<a href=\"javascript:void(0);\" onclick=\"detail(");
      out.print( 0 );
      out.write(")\"><img src=");
      out.print(sh1.getImagepass() );
      out.write(" id=\"sh1\" width=\"120px\" height=\"87px\" alt=\"\" /></a>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t<br> <a href=\"javascript:void(0);\" onclick=\"detail(");
      out.print( 0 );
      out.write(')');
      out.write('"');
      out.write('>');
      out.print(sh1.getSyouhinName() );
      out.write(' ');
      out.print(sh1.getSyouhinzyouhou() );
      out.write("</a></td>\r\n");
      out.write("\t\t\t\t\t\t\t<td><div style=\"text-align: center;\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<a href=\"javascript:void(0);\" onclick=\"detail(");
      out.print( 1 );
      out.write(")\"><img src=");
      out.print(sh2.getImagepass() );
      out.write(" id=\"sh2\" width=\"120px\" height=\"87px\" alt=\"\" /></a>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t<br> <a href=\"javascript:void(0);\" onclick=\"detail(");
      out.print( 1 );
      out.write(')');
      out.write('"');
      out.write('>');
      out.print(sh2.getSyouhinName() );
      out.write(' ');
      out.print(sh2.getSyouhinzyouhou() );
      out.write("</a></td>\r\n");
      out.write("\t\t\t\t\t\t\t<td><div style=\"text-align: center;\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<a href=\"javascript:void(0);\" onclick=\"detail(");
      out.print( 2 );
      out.write(")\"><img src=");
      out.print(sh3.getImagepass() );
      out.write(" id=\"sh3\" width=\"120px\" height=\"87px\" alt=\"\" /></a>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t<br> <a href=\"javascript:void(0);\" onclick=\"detail(");
      out.print( 2 );
      out.write(')');
      out.write('"');
      out.write('>');
      out.print(sh3.getSyouhinName() );
      out.write(' ');
      out.print(sh3.getSyouhinzyouhou() );
      out.write("</a></td>\r\n");
      out.write("\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t</table>\r\n");
      out.write("\t\t\t\t\t<input type=\"hidden\" id=\"syouhinID\" name=\"syouhinID\" value=\"\" />\r\n");
      out.write("\t\t\t\t</form>\r\n");
      out.write("\t\t\t\t</p>\r\n");
      out.write("\t\t\t\t<h2>INFORMATION</h2>\r\n");
      out.write("\t\t\t\t<dl class=\"information\">\r\n");
      out.write("\t\t\t\t\t<dt>\r\n");
      out.write("\t\t\t\t\t\t<span>2013-10-19</span>\r\n");
      out.write("\t\t\t\t\t</dt>\r\n");
      out.write("\t\t\t\t\t<dd>\r\n");
      out.write("\t\t\t\t\t\t<div>\r\n");
      out.write("\t\t\t\t\t\t\t新しい温泉情報を更新しました。<br />\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</dd>\r\n");
      out.write("\t\t\t\t\t<dt>\r\n");
      out.write("\t\t\t\t\t\t<span>2013-04-24</span>\r\n");
      out.write("\t\t\t\t\t</dt>\r\n");
      out.write("\t\t\t\t\t<dd>\r\n");
      out.write("\t\t\t\t\t\t<div>2013年4月24日からリニューアルオープンしました。</div>\r\n");
      out.write("\t\t\t\t\t</dd>\r\n");
      out.write("\t\t\t\t\t<dt>\r\n");
      out.write("\t\t\t\t\t\t<span>2009-03-31</span>\r\n");
      out.write("\t\t\t\t\t</dt>\r\n");
      out.write("\t\t\t\t\t<dd>\r\n");
      out.write("\t\t\t\t\t\t<div>休業のお知らせ。誠に勝手ながら3月31日日を持って無期限長期休暇日とさせていただきます。ご了承ください。</div>\r\n");
      out.write("\t\t\t\t\t</dd>\r\n");
      out.write("\t\t\t\t</dl>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<!-- /#main -->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("  <div id=\"sub\">\r\n");
      out.write("   <div class=\"section\">\r\n");
      out.write("\r\n");
      out.write("   <form action=\"OSearchServlet\" id=\"searchmenu\">\r\n");
      out.write("    <h2>名前で検索</h2>\r\n");
      out.write("    <ul>\r\n");
      out.write("     <li>\r\n");
      out.write("      <input type=\"text\" size=\"26\" name=\"searchKey\" value=\"\">\r\n");
      out.write("      <input type=\"submit\" value=\"検索\"style=\"width: 190px\" id=\"searchButton\">\r\n");
      out.write("     </li>\r\n");
      out.write("    </ul>\r\n");
      out.write("\r\n");
      out.write("    <h2>検索条件追加・変更</h2>\r\n");
      out.write("    <ul>\r\n");
      out.write("     <li>・地域</li>\r\n");
      out.write("     <li>\r\n");
      out.write("      　<input type=\"checkbox\" value=\"01\" name=\"area\">北海道<br>\r\n");
      out.write("      　<input type=\"checkbox\" value=\"02\" name=\"area\">東北<br>\r\n");
      out.write("      　<input type=\"checkbox\" value=\"03\" name=\"area\">関東<br>\r\n");
      out.write("      　<input type=\"checkbox\" value=\"04\" name=\"area\">北陸・信越<br>\r\n");
      out.write("      　<input type=\"checkbox\" value=\"05\" name=\"area\">東海<br>\r\n");
      out.write("      　<input type=\"checkbox\" value=\"06\" name=\"area\">近畿<br>\r\n");
      out.write("      　<input type=\"checkbox\" value=\"07\" name=\"area\">中国<br>\r\n");
      out.write("      　<input type=\"checkbox\" value=\"08\" name=\"area\">四国<br>\r\n");
      out.write("      　<input type=\"checkbox\" value=\"09\" name=\"area\">九州<br>\r\n");
      out.write("      　<input type=\"checkbox\" value=\"10\" name=\"area\">沖縄\r\n");
      out.write("     </li>\r\n");
      out.write("    </ul>\r\n");
      out.write("\r\n");
      out.write("    <ul>\r\n");
      out.write("     <li>・予算</li>\r\n");
      out.write("     <li><input type=\"text\" name=\"min\" placeholder=\"最低額を入力してください\">円<br>\r\n");
      out.write("     ~<input type=\"text\" name=\"max\" placeholder=\"最高額を入力してください\">円</li>\r\n");
      out.write("    </ul>\r\n");
      out.write("\r\n");
      out.write("    <ul>\r\n");
      out.write("     <li>・プラン</li>\r\n");
      out.write("     <li>\r\n");
      out.write("         　<input type=\"checkbox\" name=\"stay\" value=1>宿泊<br>\r\n");
      out.write("         　<input type=\"checkbox\" name=\"day\" value=1>日帰り\r\n");
      out.write("     </li>\r\n");
      out.write("    </ul>\r\n");
      out.write("\r\n");
      out.write("    <div><input type=\"submit\" value=\"検索\" style=\"width:190px\" id=\"searchButton2\"></div>\r\n");
      out.write("\r\n");
      out.write("   </form>\r\n");
      out.write("\r\n");
      out.write("   </div><!-- /.section -->\r\n");
      out.write("  </div><!-- /#sub -->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t<div id=\"pageTop\">\r\n");
      out.write("\t\t\t\t<a href=\"#top\">ページのトップへ戻る</a>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<!-- /#pageTop -->\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<!-- /#contents -->\r\n");
      out.write("\t\t<div id=\"haikei\">\r\n");
      out.write("\t\t\t<img src=\"images/haikeib.jpg\" />\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div id=\"footer\">\r\n");
      out.write("\t\t\t<div id=\"footMenu\">\r\n");
      out.write("\t\t\t\t<ul>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t</ul>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<!-- /#footerMenu -->\r\n");
      out.write("\t\t\t<div class=\"copyright\">Copyright &copy; 2011 YOUR SITE NAME All\r\n");
      out.write("\t\t\t\tRights Reserved.</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<!-- /#footer -->\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<!-- /#top -->\r\n");
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
