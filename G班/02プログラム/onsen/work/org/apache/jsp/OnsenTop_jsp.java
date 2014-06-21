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
      out.write("<title>�����C���V���b�v</title>\r\n");
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
      out.write("\t\t\t\t\t\t\t<li><font size=\"4\">�悤����!! </font>\r\n");
      out.write("\t\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t\t<li><font size=\"4\" color='green'><a\r\n");
      out.write("\t\t\t\t\t\t\t\t\thref=\"LoginServlet\">���O�C��</a> </font></li>\r\n");
      out.write("\t\t\t\t\t\t\t");

								} else {
							
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t<li><font size=\"4\">�悤����!! ");
      out.print(loginUser.getSei());
      out.write("����</font>\r\n");
      out.write("\t\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t\t<li><font size=\"4\" color='green'><a\r\n");
      out.write("\t\t\t\t\t\t\t\t\thref=\"LoginServlet\">���O�A�E�g</a>\r\n");
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
      out.write("\t\t\t\t\t<li class=\"home\"><a href=\"HomeServlet\"  id=\"home\">�z�[��</a></li>\r\n");
      out.write("\t\t\t\t\t<li><a href=\"STopServlet\" id=\"shop\">�V���b�v</a></li>\r\n");
      out.write("\t\t\t\t\t");

						if (loginUser.getUserID().equals("on00000")) {
					
      out.write("\r\n");
      out.write("\t\t\t\t\t<li><a href=\"LoginServlet\" id=\"mypage\">�}�C�y�[�W</a></li>\r\n");
      out.write("\t\t\t\t\t");

						} else {
					
      out.write("\r\n");
      out.write("\t\t\t\t\t<li><a href=\"MypageServlet\" id=\"mypage\">�}�C�y�[�W</a></li>\r\n");
      out.write("\t\t\t\t\t");

						}
					
      out.write("\r\n");
      out.write("\t\t\t\t\t<li><a href=\"Game.jsp\" id=\"game\">�Q�[��</a></li>\r\n");
      out.write("\t\t\t\t</ul>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</form>\r\n");
      out.write("\t\t<!-- /#menu -->\r\n");
      out.write("\t\t<div id=\"icatch\">\r\n");
      out.write("\t\t\t<img src=\"images/icatch.jpg\" width=\"787px\" alt=\"\" />\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div id=\"contents\">\r\n");
      out.write("\t\t\t<div id=\"main\">\r\n");
      out.write("\t\t\t\t<h2>�h�E�z�e���\��</h2>\r\n");
      out.write("\t\t\t\t<h3>�G���A����T��</h3>\r\n");
      out.write("\t\t\t\t<p>\r\n");
      out.write("\t\t\t\t\t<div class=\"area\">\r\n");
      out.write("\t\t\t\t\t\t<dl>\r\n");
      out.write("\t\t\t\t\t\t\t<dt>�S���}�b�v</dt>\r\n");
      out.write("\t\t\t\t\t\t\t<dd class=\"description\">����]�̃G���A���N���b�N���Ă��������B</dd>\r\n");
      out.write("\t\t\t\t\t\t\t<dd class=\"map\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<img src=\"images/map.gif\" alt=\"�S���}�b�v\" width=\"515\" height=\"210\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\tusemap=\"#mapArea\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<map name=\"mapArea\" id=\"mapArea\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<area shape=\"poly\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tcoords=\"415,2,509,2,485,51,435,51,432,57,388,57\" href=\"HokkaidouServlet\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\talt=\"�k�C��\" title=\"�k�C���G���A\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<area shape=\"poly\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tcoords=\"386,61,459,61,424,131,369,131,383,104,365,104\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\thref=\"TouhokuServlet\" alt=\"���k\" title=\"���k�G���A\" >\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<area shape=\"poly\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tcoords=\"351,133,423,133,392,196,363,196,368,187,324,187\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\thref=\"KantouServlet\" alt=\"�֓�\" title=\"�֓��G���A\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<area shape=\"poly\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tcoords=\"277,108,306,108,302,117,358,117,364,106,380,106,368,131,350,131,334,162,293,162,301,144,259,144\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\thref=\"HokurikuServlet\" alt=\"�k���E�M�z\" title=\"�k���E�M�z�G���A\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<area shape=\"poly\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tcoords=\"273,146,299,146,290,164,333,164,322,187,278,187,274,196,248,196\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\thref=\"ToukaiServlet\" alt=\"���C\" title=\"���C�G���A\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<area shape=\"poly\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tcoords=\"234,117,270,117,256,146,271,146,246,196,203,196,223,154,215,154\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\thref=\"KinkiServlet\" alt=\"�ߋE\" title=\"�ߋE�G���A\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<area shape=\"poly\" coords=\"166,117,232,117,213,154,147,154\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\thref=\"TyuugokuServlet\" alt=\"����\" title=\"�����G���A\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<area shape=\"poly\" coords=\"150,158,213,158,194,196,131,196\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\thref=\"ShikokuServlet\" alt=\"�l��\" title=\"�l���G���A\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<area shape=\"poly\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tcoords=\"96,117,162,117,118,206,66,206,92,153,78,153\" href=\"KyuusyuuServlet\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\talt=\"��B\" title=\"��B�G���A\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<area shape=\"poly\" coords=\"19,180,63,180,50,206,6,206\" href=\"OkinawaServlet\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\talt=\"����\" title=\"����G���A\">\r\n");
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
      out.write("\t\t\t\t<h2>�I�����C���V���b�v</h2>\r\n");
      out.write("\t\t\t\t<h3>�V�����i���</h3>\r\n");
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
      out.write("\t\t\t\t\t\t\t�V������������X�V���܂����B<br />\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</dd>\r\n");
      out.write("\t\t\t\t\t<dt>\r\n");
      out.write("\t\t\t\t\t\t<span>2013-04-24</span>\r\n");
      out.write("\t\t\t\t\t</dt>\r\n");
      out.write("\t\t\t\t\t<dd>\r\n");
      out.write("\t\t\t\t\t\t<div>2013�N4��24�����烊�j���[�A���I�[�v�����܂����B</div>\r\n");
      out.write("\t\t\t\t\t</dd>\r\n");
      out.write("\t\t\t\t\t<dt>\r\n");
      out.write("\t\t\t\t\t\t<span>2009-03-31</span>\r\n");
      out.write("\t\t\t\t\t</dt>\r\n");
      out.write("\t\t\t\t\t<dd>\r\n");
      out.write("\t\t\t\t\t\t<div>�x�Ƃ̂��m�点�B���ɏ���Ȃ���3��31�����������Ė����������x�ɓ��Ƃ����Ă��������܂��B���������������B</div>\r\n");
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
      out.write("    <h2>���O�Ō���</h2>\r\n");
      out.write("    <ul>\r\n");
      out.write("     <li>\r\n");
      out.write("      <input type=\"text\" size=\"26\" name=\"searchKey\" value=\"\">\r\n");
      out.write("      <input type=\"submit\" value=\"����\"style=\"width: 190px\" id=\"searchButton\">\r\n");
      out.write("     </li>\r\n");
      out.write("    </ul>\r\n");
      out.write("\r\n");
      out.write("    <h2>���������ǉ��E�ύX</h2>\r\n");
      out.write("    <ul>\r\n");
      out.write("     <li>�E�n��</li>\r\n");
      out.write("     <li>\r\n");
      out.write("      �@<input type=\"checkbox\" value=\"01\" name=\"area\">�k�C��<br>\r\n");
      out.write("      �@<input type=\"checkbox\" value=\"02\" name=\"area\">���k<br>\r\n");
      out.write("      �@<input type=\"checkbox\" value=\"03\" name=\"area\">�֓�<br>\r\n");
      out.write("      �@<input type=\"checkbox\" value=\"04\" name=\"area\">�k���E�M�z<br>\r\n");
      out.write("      �@<input type=\"checkbox\" value=\"05\" name=\"area\">���C<br>\r\n");
      out.write("      �@<input type=\"checkbox\" value=\"06\" name=\"area\">�ߋE<br>\r\n");
      out.write("      �@<input type=\"checkbox\" value=\"07\" name=\"area\">����<br>\r\n");
      out.write("      �@<input type=\"checkbox\" value=\"08\" name=\"area\">�l��<br>\r\n");
      out.write("      �@<input type=\"checkbox\" value=\"09\" name=\"area\">��B<br>\r\n");
      out.write("      �@<input type=\"checkbox\" value=\"10\" name=\"area\">����\r\n");
      out.write("     </li>\r\n");
      out.write("    </ul>\r\n");
      out.write("\r\n");
      out.write("    <ul>\r\n");
      out.write("     <li>�E�\�Z</li>\r\n");
      out.write("     <li><input type=\"text\" name=\"min\" placeholder=\"�Œ�z����͂��Ă�������\">�~<br>\r\n");
      out.write("     ~<input type=\"text\" name=\"max\" placeholder=\"�ō��z����͂��Ă�������\">�~</li>\r\n");
      out.write("    </ul>\r\n");
      out.write("\r\n");
      out.write("    <ul>\r\n");
      out.write("     <li>�E�v����</li>\r\n");
      out.write("     <li>\r\n");
      out.write("         �@<input type=\"checkbox\" name=\"stay\" value=1>�h��<br>\r\n");
      out.write("         �@<input type=\"checkbox\" name=\"day\" value=1>���A��\r\n");
      out.write("     </li>\r\n");
      out.write("    </ul>\r\n");
      out.write("\r\n");
      out.write("    <div><input type=\"submit\" value=\"����\" style=\"width:190px\" id=\"searchButton2\"></div>\r\n");
      out.write("\r\n");
      out.write("   </form>\r\n");
      out.write("\r\n");
      out.write("   </div><!-- /.section -->\r\n");
      out.write("  </div><!-- /#sub -->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t<div id=\"pageTop\">\r\n");
      out.write("\t\t\t\t<a href=\"#top\">�y�[�W�̃g�b�v�֖߂�</a>\r\n");
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
