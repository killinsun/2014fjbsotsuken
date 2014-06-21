package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import jp.ac.fjb.sotuken.bean.UserBean;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<script src=\"./script/Menu.js\"></script>\r\n");
      out.write('\r');
      out.write('\n');
      out.write("\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\" />\r\n");
      out.write("<link href=\"./css/StyleSheet1.css\" rel=\"stylesheet\" type=\"text/css\" />\r\n");
      out.write("<script type=\"text/javascript\" src=\"./script/Menu.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"http://ajax.googleapis.com/ajax/libs/jquery/1.7.2/jquery.min.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"./script/footerFixed.js\"></script>");
      out.write("\r\n");
      out.write("<link href=\"./css/indexStyle.css\" rel=\"stylesheet\" type=\"text/css\" />\r\n");
      out.write("<title>FJB�}���x��-�������s�T�C�g-</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write('\r');
      out.write('\n');
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
      out.write("<div id=\"headimg\">\r\n");
      out.write("<img src=\"./images/kabumara01.jpg\">\r\n");
      out.write("</div><!-- headimg end -->\r\n");
      out.write("\r\n");
      out.write("<div id=\"wrapper\">\r\n");
      out.write('\r');
      out.write('\n');
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
      out.write("<div class=\"wrap\">\r\n");
      out.write("<h1>���m�点</h1>\r\n");
      out.write("\t<ul>\r\n");
      out.write("\t\t<li>2013/9/18(��)�l�C�̃v�����̍X�V�I</li>\r\n");
      out.write("\t\t<li>2013/9/19(��)�{�̃v�����X�V�I</li>\r\n");
      out.write("\t\t<li>2013/9/20(��)���m�点</li>\r\n");
      out.write("\t</ul>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<div class=\"wrap\">\r\n");
      out.write("<h1>�{�ȗ��s�v����</h1>\r\n");
      out.write("\t<table>\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t\t<td class=\"left\">\r\n");
      out.write("\t\t\t<img src=\"images/yachimata.jpg\">\r\n");
      out.write("\t\t\t</td>\r\n");
      out.write("\t\t\t<td>\r\n");
      out.write("\t\t\t\t<p><span class=\"bold\">���X</span></p>\r\n");
      out.write("\t\t\t\t<p>���Ԑ��ł��Ȃ��݂̔��X�I</p>\r\n");
      out.write("\t\t\t\t<p>���Ԑ��x������Ă����������Ԑ���H�ׂ��܂��I���A�T�c�}�C���A�j���W���ȂǁA��ؑS�ʂ̎��n�̌���1������܂Ŋy���߂܂��B</p>\r\n");
      out.write("\t\t\t\t<form id=\"imdexForm01\" class=\"right\" action=\"");
      out.print(request.getContextPath());
      out.write("/IndexServlet\">\r\n");
      out.write("\t\t\t\t\t\t<input type=\"hidden\" id=\"planInfo\" name=\"planInfo\" value=\"p0142\">\r\n");
      out.write("\t\t\t\t\t\t<input type=\"hidden\" id=\"planInfo2\" name=\"planInfo2\" value=\"���X\">\r\n");
      out.write("\t\t\t\t\t\t<input type=\"submit\" id=\"detail01\" class=\"btnPadding\" name=\"���X\" value=\"�ڍ�\">\r\n");
      out.write("\t\t\t\t</form>\r\n");
      out.write("\t\t\t</td>\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\t</table>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<div class=\"wrap\">\r\n");
      out.write("<h1>�l�C�̗��s�v����</h1>\r\n");
      out.write("\t<table>\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t\t<td class=\"left\">\r\n");
      out.write("\t\t\t<img src=\"images/kiyomizudera.jpg\">\r\n");
      out.write("\t\t\t</td>\r\n");
      out.write("\t\t\t<td>\r\n");
      out.write("\t\t\t\t<p><span class=\"bold\">���s</span></p>\r\n");
      out.write("\t\t\t\t<p>��l�C���s�̐������ό��v�����I</p>\r\n");
      out.write("\t\t\t\t<p>���{���O�����l�C�̃X�|�b�g�̐������𒆐S�ɋ��s���ό����܂��傤�I</p>\r\n");
      out.write("\t\t\t\t<form id=\"imdexForm02\" class=\"right\" action=\"");
      out.print(request.getContextPath());
      out.write("/IndexServlet\">\r\n");
      out.write("\t\t\t\t\t\t<input type=\"hidden\" id=\"planInfo\" name=\"planInfo\" value=\"p0146\">\r\n");
      out.write("\t\t\t\t\t\t<input type=\"hidden\" id=\"planInfo2\" name=\"planInfo2\" value=\"���s\">\r\n");
      out.write("\t\t\t\t\t\t<input type=\"submit\" id=\"detail02\" class=\"btnPadding\" name=\"���s\" value=\"�ڍ�\">\r\n");
      out.write("\t\t\t\t</form>\r\n");
      out.write("\t\t\t</td>\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\t</table>\r\n");
      out.write("</div>\r\n");
      out.write("</div><!-- contents end �����܂ŕҏW -->\r\n");
      out.write("\r\n");
      out.write("</div><!-- wrapper end -->\r\n");
      out.write("\r\n");
      out.write('\r');
      out.write('\n');
      out.write("\r\n");
      out.write("<div id=\"footer\">\r\n");
      out.write("Copyright (C) 2013 ������� FJB�}���x��\r\n");
      out.write("</div><!-- footer end -->");
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
