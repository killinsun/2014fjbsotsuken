package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.ArrayList;
import jp.ac.fjb.sotuken.bean.KenBean;
import jp.ac.fjb.sotuken.bean.KankouchiBean;
import jp.ac.fjb.sotuken.bean.StationBean;
import jp.ac.fjb.sotuken.bean.HotelBean;
import jp.ac.fjb.sotuken.bean.UserBean;

public final class newPlanPress_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");

	// 掲示板一覧データ
	ArrayList<KenBean> kenList = (ArrayList) session.getAttribute("KEN");
	ArrayList<KankouchiBean> kankochiList = (ArrayList) session.getAttribute("KANKOCHI");
	ArrayList<StationBean> stationList = (ArrayList) session.getAttribute("STATION");
	ArrayList<HotelBean> hotelList = (ArrayList) session.getAttribute("HOTEL");

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\">\r\n");
      out.write("<head>\r\n");
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
      out.write("<script type=\"text/javascript\" src=\"./script/newPlan.js\"></script>\r\n");
      out.write("<title>新規プラン投稿-FJBマラベル-</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("\t");
      out.write('\r');
      out.write('\n');
      out.write('	');
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
      out.write("\t<div id=\"wrapper\">\r\n");
      out.write("\r\n");
      out.write("\t\t");
      out.write("\r\n");
      out.write("\t\t");
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
      out.write("\t\t<div id=\"contents\">\r\n");
      out.write("\t\t\t<!-- ここから内容編集 -->\r\n");
      out.write("\t\t\t<h3>旅行プランを投稿する</h3>\r\n");
      out.write("\t\t\t<form id=\"planForm\" method=\"POST\" enctype=\"multipart/form-data\" action=\"");
      out.print(request.getContextPath());
      out.write("/UploadFileServlet\">\r\n");
      out.write("\t\t\t\t<table border=\"1\">\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<td class=\"label\">投稿者名：</td>\r\n");
      out.write("\t\t\t\t\t\t<td><input type=\"text\" name=\"name\" size=\"35\" maxlength=\"15\" required>\r\n");
      out.write("\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<td class=\"label\">県名：</td>\r\n");
      out.write("\t\t\t\t\t\t<td><select id=\"todofuken\" name=\"todofuken\" onChange=\"setChiiki(this[this.selectedIndex].value)\" required>\r\n");
      out.write("\t\t\t\t\t\t\t\t<option value=\"\" selected=\"selected\" disabled>▼県名を選択してください</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t");

									for (int i = 0; i < kenList.size(); i++) {
																KenBean allKenList = kenList.get(i);
								
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t<option value=\"");
      out.print(allKenList.getKenName());
      out.write('"');
      out.write('>');
      out.print(allKenList.getKenName());
      out.write("</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t");

									}
								
      out.write("\r\n");
      out.write("\t\t\t\t\t\t</select></td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<td class=\"label\">地域：</td>\r\n");
      out.write("\t\t\t\t\t\t<td><input type=\"text\" name=\"chiiki\" id=\"chiiki\" readonly />\r\n");
      out.write("\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<td class=\"label\">観光地：</td>\r\n");
      out.write("\t\t\t\t\t\t<td><select id=\"kankochi\" name=\"kankochi\" required>\r\n");
      out.write("\t\t\t\t\t\t\t\t<option value=\"\" selected=\"selected\" disabled>▼観光地を選択してください</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t");

									for (int j = 0; j < kankochiList.size(); j++) {
																KankouchiBean allKankochiList = kankochiList.get(j);
								
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t<option value=\"");
      out.print(allKankochiList.getKankochiId());
      out.write('"');
      out.write('>');
      out.print(allKankochiList.getKankochiName());
      out.write("</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t");

									}
								
      out.write("\r\n");
      out.write("\t\t\t\t\t\t</select></td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<td class=\"label\">プラン名：</td>\r\n");
      out.write("\t\t\t\t\t\t<td><input type=\"text\" name=\"planName\" size=\"35\" maxlength=\"15\" required>\r\n");
      out.write("\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<td class=\"label\">おススメ予約期間：</td>\r\n");
      out.write("\t\t\t\t\t\t<td><input type=\"date\" name=\"datestart\" required>&nbsp;&#xFF5E;&nbsp;<input\r\n");
      out.write("\t\t\t\t\t\t\ttype=\"date\" name=\"dateremit\" required>\r\n");
      out.write("\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<td class=\"label\">人数：</td>\r\n");
      out.write("\t\t\t\t\t\t<td><input type=\"number\" name=\"people\" size=\"4\" max=\"999\" min=\"1\" required>名</td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<td class=\"label\">紹介文：<br />(150文字まで)</td>\r\n");
      out.write("\t\t\t\t\t\t<td><textarea name=\"message\" rows=\"10\" cols=\"50\"\r\n");
      out.write("\t\t\t\t\t\t\t\tmaxlength=\"150\" required></textarea>\r\n");
      out.write("\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<td class=\"label\">宿泊先：</td>\r\n");
      out.write("\t\t\t\t\t\t<td><select id=\"hotel\" name=\"hotel\" required>\r\n");
      out.write("\t\t\t\t\t\t\t\t<option value=\"\" selected=\"selected\" disabled>▼宿泊先を選択してください</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t");

									for (int k = 0; k < hotelList.size(); k++) {
																HotelBean allhotelList = hotelList.get(k);
								
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t<option value=\"");
      out.print(allhotelList.getHotelId());
      out.write('"');
      out.write('>');
      out.print(allhotelList.getHotelName());
      out.write("</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t");

									}
								
      out.write("\r\n");
      out.write("\t\t\t\t\t\t</select></td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<td class=\"label\">宿泊日数：</td>\r\n");
      out.write("\t\t\t\t\t\t<td><select id=\"syukuhaku\" name=\"syukuhakuNum\" required>\r\n");
      out.write("\t\t\t\t\t\t\t\t<option value=\"\" selected=\"selected\" disabled>▼宿泊日数を選択してください</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t<option value=\"1\">一泊</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t<option value=\"2\">二泊</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t<option value=\"3\">三泊</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t<option value=\"4\">四泊</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t<option value=\"5\">五泊</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t<option value=\"0\">日帰り</option>\r\n");
      out.write("\t\t\t\t\t\t</select></td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<td class=\"label\">金額：</td>\r\n");
      out.write("\t\t\t\t\t\t<td>&yen;<input type=\"number\" name=\"price\" size=\"7\" max=\"99999\" min=\"0\" required>\r\n");
      out.write("\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<td class=\"label\">出発地点：</td>\r\n");
      out.write("\t\t\t\t\t\t<td><select id=\"startstation\" name=\"startstation\"  required>\r\n");
      out.write("\t\t\t\t\t\t\t\t<option value=\"\" selected=\"selected\" disabled>▼出発駅を選択してください</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t");

									for (int s = 0; s < stationList.size(); s++) {
										StationBean allstationList = stationList.get(s);
								
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t<option value=\"");
      out.print(allstationList.getStationId());
      out.write('"');
      out.write('>');
      out.print(allstationList.getStationname());
      out.write("</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t");

									}
								
      out.write("\r\n");
      out.write("\t\t\t\t\t\t</select>\r\n");
      out.write("\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<td class=\"label\">到着地点：</td>\r\n");
      out.write("\t\t\t\t\t\t<td><select id=\"arrivestation\" name=\"arrivestation\"  required>\r\n");
      out.write("\t\t\t\t\t\t\t\t<option value=\"\" selected=\"selected\" disabled>▼出発駅を選択してください</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t");

									for (int s = 0; s < stationList.size(); s++) {
										StationBean allstationList = stationList.get(s);
								
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t<option value=\"");
      out.print(allstationList.getStationId());
      out.write('"');
      out.write('>');
      out.print(allstationList.getStationname());
      out.write("</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t");

									}
								
      out.write("\r\n");
      out.write("\t\t\t\t\t\t</select>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<td class=\"label\">イメージ画像：</td>\r\n");
      out.write("\t\t\t\t\t\t<td><input type=\"file\" name=\"imagefile\" maxlength=\"50\">\r\n");
      out.write("\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<td class=\"label\">検索キーワード：</td>\r\n");
      out.write("\t\t\t\t\t\t<td><input type=\"text\" name=\"keyword\" size=\"55\" maxlength=\"15\" required>\r\n");
      out.write("\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t</table>\r\n");
      out.write("\t\t\t\t<div id=\"button\">\r\n");
      out.write("\t\t\t\t\t<input type=\"submit\" value=\"投稿\" id=\"sendPlanBtn\" class=\"btnPadding\">\r\n");
      out.write("\t\t\t\t\t<input type=\"reset\" class=\"btnPadding\">\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</form>\r\n");
      out.write("\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<!-- contents end　ここまで編集 -->\r\n");
      out.write("\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<!-- wrapper end -->\r\n");
      out.write("\r\n");
      out.write("\t");
      out.write('\r');
      out.write('\n');
      out.write('	');
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
