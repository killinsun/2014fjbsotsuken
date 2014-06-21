package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import jp.ac.fjb.sotuken.bean.HotelChangeBean;
import java.util.ArrayList;
import jp.ac.fjb.sotuken.bean.PlanDetailBean;
import jp.ac.fjb.sotuken.bean.HotelChangeBean;
import jp.ac.fjb.sotuken.bean.UkewatasiBean;
import jp.ac.fjb.sotuken.bean.HotelBean;
import jp.ac.fjb.sotuken.bean.UserBean;

public final class hotelChange_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\r\n");
      out.write("\r\n");

	ArrayList<PlanDetailBean> list = (ArrayList)session.getAttribute("DET");
	HotelBean list2 = (HotelBean)session.getAttribute("CAG");
	ArrayList<HotelChangeBean> list3 = (ArrayList)session.getAttribute("HTC");
	UkewatasiBean uk=(UkewatasiBean)session.getAttribute("UKEWATASI");

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\">\r\n");
      out.write("<head>\r\n");
      out.write("\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\" />\r\n");
      out.write("<link href=\"./css/StyleSheet1.css\" rel=\"stylesheet\" type=\"text/css\" />\r\n");
      out.write("<script type=\"text/javascript\" src=\"./script/Menu.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"http://ajax.googleapis.com/ajax/libs/jquery/1.7.2/jquery.min.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"./script/footerFixed.js\"></script>");
      out.write("\r\n");
      out.write("<link href=\"./css/syousaiStyle.css\" rel=\"stylesheet\" type=\"text/css\" />\r\n");
      out.write("<script type=\"text/javascript\" src=\"./script/func.js\"></script>\r\n");
      out.write("<title>�h����ύX���</title>\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("\r\n");

	String name="���O�C��";
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
 if(name.equals("���O�C��")){ 
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
      out.write("<a href=\"dammy.jsp\">���₢���킹</a>\r\n");
 if(!name.equals("���O�C��")){ 
      out.write("\r\n");
      out.write("\t&frasl;<a href=\"/travelsys/LogoutServlet\">���O�A�E�g</a>\r\n");
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
      out.write("<div id=\"nav\">\r\n");
      out.write("<form action=\"/travelsys/MenuServlet\" id=\"form\">\r\n");
      out.write("\t<ul>\r\n");
      out.write("\t\t<li><input type=\"button\" name=\"home\" id=\"home\" value=\"�z�[��\"></li>\r\n");
      out.write("\t\t<li><input type=\"button\" name=\"search\" id=\"serch\" value=\"���s�v��������\"></li></a>\r\n");
      out.write("\t\t<li><input type=\"button\" name=\"makePlan\"  id=\"makePlan\" value=\"���s���v��\"></li>\r\n");
      out.write("\t\t<li><input type=\"button\" name=\"userMenu\" id=\"usermenu\" value=\"���[�U�[���j���[\"></li>\r\n");
      out.write("\t\t<li><input type=\"button\" name=\"bbs\" id=\"bbs\" value=\"�f����\"></li></a>\r\n");
      out.write("\t\t<input type=\"hidden\" id=\"progId\" name=\"progId\">\r\n");
      out.write("\t</ul>\r\n");
      out.write("</form>\r\n");
      out.write("</div><!-- nav end -->");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<div id=\"contents\"><!-- ����������e�ҏW -->\r\n");
      out.write("\r\n");
      out.write("<form name=\"aForm\">\r\n");
      out.write("\r\n");
      out.write("<!------------------------------------------------------>\r\n");
      out.write("<h3>�A�����W</h3>\r\n");
      out.write("<!------------------------------------------------------>\r\n");

        	for(int i=0; i<list.size(); i++){
                	PlanDetailBean a = list.get(i);
 
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t<div id=\"a\">\r\n");
      out.write("\t\t<h4>�v������</h4>\r\n");
      out.write("\t</div>\r\n");
      out.write("\r\n");
      out.write("\t<div id=\"b\">\r\n");
      out.write("\t\t");
      out.print( a.getPlanName()  );
      out.write("\r\n");
      out.write("\t</div>\r\n");
      out.write("\r\n");
      out.write("<!------------------------------------------------------>\r\n");
      out.write("\r\n");
      out.write("\t<div id=\"a\">\r\n");
      out.write("\t\t<h4>�ό��n</h4>\r\n");
      out.write("\t</div>\r\n");
      out.write("\r\n");
      out.write("\t<div id=\"b\">\r\n");
      out.write("\t\t");
      out.print( a.getAreaName()  );
      out.write("\r\n");
      out.write("\t</div>\r\n");
      out.write("\r\n");
      out.write("<!------------------------------------------------------>\r\n");
      out.write("\r\n");
      out.write("\t<div id=\"a\">\r\n");
      out.write("\t\t<h4>�ό��n�̏Љ�</h4>\r\n");
      out.write("\t</div>\r\n");
      out.write("\r\n");
      out.write("\t<div id=\"b\">\r\n");
      out.write("\t\t<table border=0>\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t<td width=\"1000\">\r\n");
      out.write("\t\t<img src=\"./images/");
      out.print( a.getAreaImgUrl()  );
      out.write("\" align=\"left\" class=\"example\">\r\n");
      out.write("\t\t<p>\r\n");
      out.write("\t\t");
      out.print( a.getAreaComment() );
      out.write("\r\n");
      out.write("\t\t</p>\r\n");
      out.write("\t\t</td>\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\t\t</table>\r\n");
      out.write("\t</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!------------------------------------------------------>\r\n");
      out.write("\r\n");
      out.write("\t<div id=\"a\">\r\n");
      out.write("\t\t<h4>���t</h4>\r\n");
      out.write("\t</div>\r\n");
      out.write("\r\n");
      out.write("\t<div id=\"b\">\r\n");
      out.write("\r\n");
      out.write("\t\t<input type=\"date\" name=\"example\" min=");
      out.print( a.getPlanDateStart() );
      out.write(" max=");
      out.print(a.getPlanDateEnd() );
      out.write(" value=\"");
      out.print( uk.getDate() );
      out.write("\"  required/>\r\n");
      out.write("\t</div>\r\n");
      out.write("\r\n");
      out.write("<!------------------------------------------------------>\r\n");
      out.write("\r\n");
      out.write("\t<div id=\"a\">\r\n");
      out.write("\t\t<h4>�l��</h4>\r\n");
      out.write("\t</div>\r\n");
      out.write("\r\n");
      out.write("\t<div id=\"b\">\r\n");
      out.write("\t\t<input type=\"number\" min=\"1\" max=");
      out.print( a.getPeople() );
      out.write(" value=\"");
      out.print(uk.getNinzu() );
      out.write("\" required/>��\r\n");
      out.write("\t</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
 } 
      out.write("\r\n");
      out.write("<!------------------------------------------------------>\r\n");
      out.write("\r\n");
      out.write("<div id=\"a\">\r\n");
      out.write("\t<h4>��ʎ�i</h4>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<div id=\"b\">\r\n");
      out.write("\r\n");
      out.write("\t�y�d�ԁz\r\n");
      out.write("\t<div align=\"center\">\r\n");
      out.write("\t\t<br>���w 7��03��-9��07�� 2����4��\r\n");
      out.write("\t\t<br>��\r\n");
      out.write("\t\t<br>���ˉw 9��22��-10��31�� 1����9��\r\n");
      out.write("\t\t<br>��\r\n");
      out.write("\t\t<br>�ܓc�w 10��31��\r\n");
      out.write("\t</div>\r\n");
      out.write("\t\t<div align=\"right\">\r\n");
      out.write("\t\t<br>3����28��\r\n");
      out.write("\t\t<br>�Г� 2,940�~\r\n");
      out.write("</div>\r\n");
      out.write("<br>\r\n");
      out.write("</div>\r\n");
      out.write("<!------------------------------------------------------>\r\n");
      out.write("\r\n");
      out.write("<script type=\"text/javascript\" src=\"func.js\"></script>\r\n");
      out.write("\r\n");
      out.write("\t<div id=\"a\">\r\n");
      out.write("\t\t<h4>�h����</h4>\r\n");
      out.write("\t</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t<div id=\"b\">\r\n");
 HotelBean b = list2;
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t<select onChange=\"setData(this[this.selectedIndex].value)\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t<option selected disabled>�z�e����I�����Ă�������</option>\r\n");
      out.write("\t\t\t");

        	for(int n=0; n<list3.size(); n++){
            	HotelChangeBean c = list3.get(n);
        	
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t<option value=\" ");
      out.print(c.getHotelComment());
      out.write(" 1. ");
      out.print(c.getHotelImgUrl());
      out.write(" 2. ");
      out.print(c.getCheckinStart());
      out.write(" 3. ");
      out.print(c.getCheckinEnd() );
      out.write(" 4. ");
      out.print(c.getStayFee());
      out.write(" 5. ");
      out.print(b.getStayDate());
      out.write(" 6.\"\"> ");
      out.print( c.getHotelName()  );
      out.write("</option>\r\n");
      out.write("\t\t\t");
 } 
      out.write("\r\n");
      out.write("\t\t\t</select>\r\n");
      out.write("\t\t\t<br>\r\n");
      out.write("\r\n");
      out.write("\t\t<table border=0>\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t<td width=\"1000\">\r\n");
      out.write("\r\n");
      out.write("\t\t<div id=\"img\"  ></div>\r\n");
      out.write("\t\t<div id=\"coment\" ></div>\r\n");
      out.write("\r\n");
      out.write("\t\t<div id=\"check\" ></div>\r\n");
      out.write("\t\t<div id=\"date\" style=\"display: inline-block;_display: inline;\"></div>\r\n");
      out.write("\t\t<div id=\"fee\" style=\"display: inline-block;_display: inline;\"></div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t</td>\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\t\t</table>\r\n");
      out.write("\r\n");
      out.write("\t</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!------------------------------------------------------>\r\n");
      out.write("\r\n");
      out.write("\t<div id=\"a\">\r\n");
      out.write("\t\t<h4>����(��ʔ)</h4>\r\n");
      out.write("\t</div>\r\n");
      out.write("\r\n");
      out.write("\t<div id=\"b\">\r\n");
      out.write("\t\t <div id=\"sum\">���v���z��\��</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\r\n");
      out.write("<!------------------------------------------------------>\r\n");
      out.write("\t<div id=\"button\">\r\n");
      out.write("\t\t<input type=\"button\" value=\"�\��\" onclick=\"location.href='006Kessai.jsp'\"style=\"WIDTH: 150px; HEIGHT: 30px\">\r\n");
      out.write("\t</div>\r\n");
      out.write("\r\n");
      out.write("</form>\r\n");
      out.write("</div><!-- contents end�@�����܂ŕҏW -->\r\n");
      out.write("\r\n");
      out.write("</div><!-- wrapper end -->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<div id=\"footer\">\r\n");
      out.write("Copyright (C) 2013 ������� FJB�}���x��\r\n");
      out.write("</div><!-- footer end -->");
      out.write("\r\n");
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
