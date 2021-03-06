package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.ArrayList;
import jp.ac.fjb.sotuken.bean.BbsBean;
import jp.ac.fjb.sotuken.bean.CommentBean;
import jp.ac.fjb.sotuken.bean.UserBean;

public final class bbs_jsp extends org.apache.jasper.runtime.HttpJspBase
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

	// 掲示板一覧データ
	ArrayList<BbsBean> list = (ArrayList) session.getAttribute("BBS");
	//コメント一覧データ
	ArrayList<CommentBean> cmtList = (ArrayList) session.getAttribute("COMMENT");

	//startCntとendCntの初期設定
	BbsBean pageCnt = new BbsBean();
	pageCnt.setPageEnd(Integer.parseInt(session.getAttribute("PAGEEND").toString()));
	pageCnt.setStartCnt(Integer.parseInt(session.getAttribute("STARTCNT").toString()));
	pageCnt.setEndCnt(Integer.parseInt(session.getAttribute("ENDCNT").toString()));

	int pageEnd = pageCnt.getPageEnd();
	int startCnt = pageCnt.getStartCnt();
	int endCnt = pageCnt.getEndCnt();

	int pg = Integer.parseInt(session.getAttribute("PAGE").toString());

      out.write("\r\n");
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
      out.write("<link href=\"./css/bbsStyle.css\" rel=\"stylesheet\" type=\"text/css\" />\r\n");
      out.write("<script type=\"text/javascript\" src=\"./script/bbsScript.js\"></script>\r\n");
      out.write("<title>旅行プラン掲示板-FJBマラベル-</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body onunload=\"init()\">\r\n");
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
      out.write("\t\t\t<h3>旅行プラン掲示板</h3>\r\n");
      out.write("\r\n");
      out.write("\t\t\t<div id=\"groups\">\r\n");
      out.write("\t\t\t\t<table>\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<td><a\r\n");
      out.write("\t\t\t\t\t\t\thref=\"");
      out.print(request.getContextPath());
      out.write("/BbsServlet?name=北海道\">北海道</a>\r\n");
      out.write("\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t<td><a\r\n");
      out.write("\t\t\t\t\t\t\thref=\"");
      out.print(request.getContextPath());
      out.write("/BbsServlet?name=東北\">東北</a>\r\n");
      out.write("\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t<td><a\r\n");
      out.write("\t\t\t\t\t\t\thref=\"");
      out.print(request.getContextPath());
      out.write("/BbsServlet?name=北関東\">北関東</a>\r\n");
      out.write("\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t<td><a\r\n");
      out.write("\t\t\t\t\t\t\thref=\"");
      out.print(request.getContextPath());
      out.write("/BbsServlet?name=首都圏\">首都圏</a>\r\n");
      out.write("\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t<td><a\r\n");
      out.write("\t\t\t\t\t\t\thref=\"");
      out.print(request.getContextPath());
      out.write("/BbsServlet?name=甲信越\">甲信越</a>\r\n");
      out.write("\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t<td><a\r\n");
      out.write("\t\t\t\t\t\t\thref=\"");
      out.print(request.getContextPath());
      out.write("/BbsServlet?name=北陸\">北陸</a>\r\n");
      out.write("\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<td><a\r\n");
      out.write("\t\t\t\t\t\t\thref=\"");
      out.print(request.getContextPath());
      out.write("/BbsServlet?name=近畿\">近畿</a>\r\n");
      out.write("\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t<td><a\r\n");
      out.write("\t\t\t\t\t\t\thref=\"");
      out.print(request.getContextPath());
      out.write("/BbsServlet?name=東海\">東海</a>\r\n");
      out.write("\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t<td><a\r\n");
      out.write("\t\t\t\t\t\t\thref=\"");
      out.print(request.getContextPath());
      out.write("/BbsServlet?name=山陰・山陽\">山陰・山陽</a>\r\n");
      out.write("\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t<td><a\r\n");
      out.write("\t\t\t\t\t\t\thref=\"");
      out.print(request.getContextPath());
      out.write("/BbsServlet?name=四国\">四国</a>\r\n");
      out.write("\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t<td><a\r\n");
      out.write("\t\t\t\t\t\t\thref=\"");
      out.print(request.getContextPath());
      out.write("/BbsServlet?name=九州\">九州</a>\r\n");
      out.write("\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t<td><a\r\n");
      out.write("\t\t\t\t\t\t\thref=\"");
      out.print(request.getContextPath());
      out.write("/BbsServlet?name=沖縄\">沖縄</a>\r\n");
      out.write("\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t</table>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t<div id=\"button1\">\r\n");
      out.write("\t\t\t\t<form id=\"form01\"\r\n");
      out.write("\t\t\t\t\taction=\"");
      out.print(request.getContextPath());
      out.write("/BbsButtonServlet\">\r\n");
      out.write("\t\t\t\t\t<input type=\"button\" id=\"write\" name=\"write\" class=\"btnPadding\"\r\n");
      out.write("\t\t\t\t\t\tvalue=\"旅行プランを投稿する\"> <input type=\"hidden\" id=\"bbsProgId\"\r\n");
      out.write("\t\t\t\t\t\tname=\"bbsProgId\">\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t");


				if(endCnt > list.size()){
					endCnt = list.size();
				}
				for (int i=startCnt; i<endCnt; i++) {
					BbsBean bbsList = list.get(i);

					int allstar = 0;
					int comcount = 0;


					for (int j=0; j<cmtList.size(); j++) {
							CommentBean comCntList = cmtList.get(j);
							String cntBbsNo = bbsList.getBbsNo();
							if (cntBbsNo.equals(comCntList.getCommentBbsNo())) {
				if (comCntList.getStar() != null){
					int getstar = Integer.parseInt(comCntList.getStar());
					comcount++;
					allstar += getstar;
				}
							}
					}
					if(comcount > 0){
					allstar = allstar/comcount;
					}

			
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t<div id=\"bbs");
      out.print(i);
      out.write("\" class=\"bbsWrap\">\r\n");
      out.write("\t\t\t\t<div class=\"title\">");
      out.print(bbsList.getKenName());
      out.write("&nbsp;");
      out.print(bbsList.getPlanName());
      out.write("<div\r\n");
      out.write("\t\t\t\t\t\tclass=\"right\">\r\n");
      out.write("\t\t\t\t\t\t投稿日時：");
      out.print(bbsList.getPressTime().substring(0,16));
      out.write("</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"planCnt\">\r\n");
      out.write("\t\t\t\t\t<table>\r\n");
      out.write("\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t<td class=\"bbsLeft\"><img src=\"images/");
      out.print(bbsList.getBbsImage());
      out.write("\"></td>\r\n");
      out.write("\t\t\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<p>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<span class=\"fontBig\"><span class=\"bold\">");
      out.print(bbsList.getPressUserName());
      out.write("</span>さんのプラン<br>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t");

												String allstrStar = "";
															if (allstar != 0) {
																int allwhiteStar = 5 - allstar;
																for (int allbs = 1; allbs <= allstar; allbs++) {
																	allstrStar += "★";
																}
																for (int allws = 1; allws <= allwhiteStar; allws++) {
																	allstrStar += "☆";
																}
															} else {
																allstrStar = "評価はありません";
															}
											
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<span class=\"star\">");
      out.print(allstrStar);
      out.write("</span>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t");

												if (!allstrStar.equals("評価はありません")) {
													out.println(allstar);
												}
											
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t</p>\r\n");
      out.write("\t\t\t\t\t\t\t\t<p>");
      out.print(bbsList.getPlanPressSt());
      out.write("</p>\r\n");
      out.write("\t\t\t\t\t\t\t\t<input type=\"button\" id=\"detail");
      out.print(i );
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\tclass=\"btnPadding\" name=\"");
      out.print(bbsList.getBbsNo());
      out.write("\" value=\"詳細\" onClick=\"detailSet_value('");
      out.print(bbsList.getPlanId() );
      out.write("')\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<input type=\"button\" id=\"coment");
      out.print(i );
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\tname=\"");
      out.print(bbsList.getBbsNo());
      out.write("\" class=\"btnPadding\" value=\"コメントする\" onClick=\"set_value('");
      out.print(bbsList.getBbsNo());
      out.write("')\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<input type=\"hidden\" id=\"bbsInfo\" name=\"bbsInfo\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<input type=\"hidden\" id=\"bbsInfo2\" name=\"bbsInfo2\" value=\"");
      out.print(bbsList.getPlanName());
      out.write("\"></td>\r\n");
      out.write("\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t<td colspan=\"2\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"comentWrap\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<h1>コメント</h1>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t");

										for (int j=0; j<cmtList.size(); j++) {
												CommentBean comentList = cmtList.get(j);
												String bbsNo = bbsList.getBbsNo();
												if (bbsNo.equals(comentList.getCommentBbsNo())) {
									
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div id=\"bbsComent");
      out.print(j);
      out.write("\" class=\"coment\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"leftAlign\">");
      out.print(comentList.getCommentNo());
      out.write(':');
      out.print(comentList.getCommentUserName());
      out.write("さんからのコメント&nbsp;\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t");

												String strStar = "";
															if (comentList.getStar() != null) {
																int star = Integer.parseInt(comentList.getStar());
																int whiteStar = 5 - star;
																for (int bs = 1; bs <= star; bs++) {
																	strStar += "★";
																}
																for (int ws = 1; ws <= whiteStar; ws++) {
																	strStar += "☆";
																}
															} else {
																strStar = "評価はありません";
															}
											
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<span class=\"star\">");
      out.print(strStar);
      out.write("</span>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t");

												if (!strStar.equals("評価はありません")) {
													out.println(comentList.getStar());
												}
											
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"rightAlign\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t投稿日時：");
      out.print(comentList.getCommentTime().substring(0,16));
      out.write("</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"nameLine\"></div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"message\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<p>");
      out.print(comentList.getCommentSt());
      out.write("</p>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t");

										}
											}
									
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t</table>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<!-- planCnt end -->\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<!-- bbsWrap end -->\r\n");
      out.write("\r\n");
      out.write("\t\t\t");

				}
			
      out.write("\r\n");
      out.write("\t\t\t</form>\r\n");
      out.write("\r\n");
      out.write("\t\t\t<div id=\"controlBar\" class=\"right\">\r\n");
      out.write("\t\t\t\t<a href=\"");
      out.print(request.getContextPath());
      out.write("/BbsNextServlet?page=");
      out.print( pg );
      out.write("&bt=b\">前へ</a>\r\n");
      out.write("\t\t\t\t|\r\n");
      out.write("\t\t\t\t");
 for(int p=1; p <= pageEnd; p++){ 
      out.write("\r\n");
      out.write("\t\t\t\t<a href=\"");
      out.print(request.getContextPath());
      out.write("/BbsNextServlet?page=");
      out.print(p );
      out.write('"');
      out.write('>');
      out.print(p );
      out.write("</a>\r\n");
      out.write("\t\t\t\t|\r\n");
      out.write("\t\t\t\t");
 } 
      out.write("\r\n");
      out.write("\t\t\t\t<a href=\"");
      out.print(request.getContextPath());
      out.write("/BbsNextServlet?page=");
      out.print(pg );
      out.write("&bt=n\">次へ</a>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<!-- contents end ここまで編集 -->\r\n");
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
