package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.ArrayList;
import jp.ac.fjb.eLearning.bean.MondaiMenuBean;
import jp.ac.fjb.eLearning.bean.QuestionInputBean;

public final class Writing_jsp extends org.apache.jasper.runtime.HttpJspBase
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
 ArrayList<MondaiMenuBean> list = (ArrayList)session.getAttribute("Mondai"); 
      out.write('\r');
      out.write('\n');
 ArrayList<QuestionInputBean> tensuList= (ArrayList)session.getAttribute("TENSU");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">\r\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\">\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\" />\r\n");
      out.write("<meta http-equiv=\"Content-Style-Type\" content=\"text/css\" />\r\n");
      out.write("<meta http-equiv=\"Content-Script-Type\" content=\"text/javascript\" />\r\n");
      out.write("<meta name=\"copyright\" content=\"Nikukyu-Punch\" />\r\n");
      out.write("<script type=\"text/javascript\" src=\"js/Writing menu.js\"></script>\r\n");
      out.write("<title>�w�K�pe-���[�j���O�T�C�g</title>\r\n");
      out.write("<link href=\"css/Writing menu.css\" rel=\"stylesheet\" type=\"text/css\" />\r\n");
      out.write("<script type=\"text/javascript\" src=\"js/script.js\"></script>\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body onload=\"MM_preloadImages('images/menu_over_01.gif','images/menu_over_02.gif','images/menu_over_03.gif','images/menu_over_04.gif','images/menu_over_05.gif','images/menu_over_06.gif')\">\r\n");
      out.write("<form id=\"Wform\">\r\n");
      out.write("<div id=\"container\">\r\n");
      out.write("<div id=\"main-img\"><h1></h1><img src=\"images/main_img2.jpg\" width=\"800\" height=\"175\" /></div>\r\n");
      out.write("<ul id=\"menu\">\r\n");
      out.write("<li><a href=\"Mainmenu.jsp\"><img src=\"images/menu_++1.gif\" alt=\"�z�[��\" name=\"Image1\" width=\"140\" height=\"59\" id=\"Image1\" onmouseover=\"MM_swapImage('Image1','','images/menu_over_++01.gif',1)\" onmouseout=\"MM_swapImgRestore()\" /></a></li><!--\r\n");
      out.write("--><li><a href=\"e-learningmenu.jsp\"><img src=\"images/menu_++2.gif\" alt=\"���T�C�g�ɂ���\" name=\"Image2\" width=\"133\" height=\"59\" id=\"Image2\" onmouseover=\"MM_swapImage('Image2','','images/menu_over_++02.gif',1)\" onmouseout=\"MM_swapImgRestore()\" /></a></li><!--\r\n");
      out.write("--><li><a href=\"Mainmenu.jsp\"><img src=\"images/menu_++3.gif\" alt=\"���d��\" name=\"Image3\" width=\"134\" height=\"59\" id=\"Image3\" onmouseover=\"MM_swapImage('Image3','','images/menu_over_++03.gif',1)\" onmouseout=\"MM_swapImgRestore()\" /></a></li><!--\r\n");
      out.write("--><li><a href=\"Mainmenu.jsp\"><img src=\"images/menu_++4.gif\" alt=\"�u���O\" name=\"Image4\" width=\"133\" height=\"59\" id=\"Image4\" onmouseover=\"MM_swapImage('Image4','','images/menu_over_++04.gif',1)\" onmouseout=\"MM_swapImgRestore()\" /></a></li><!--\r\n");
      out.write("--><li><a href=\"Mainmenu.jsp\"><img src=\"images/menu_++5.gif\" alt=\"���₢���킹\" name=\"Image5\" width=\"133\" height=\"59\" id=\"Image5\" onmouseover=\"MM_swapImage('Image5','','images/menu_over_++05.gif',1)\" onmouseout=\"MM_swapImgRestore()\" /></a></li><!--\r\n");
      out.write("--><li><a href=\"Mainmenu.jsp\"><img src=\"images/menu_++6.gif\" alt=\"�����N\" name=\"Image6\" width=\"139\" height=\"59\" id=\"Image6\" onmouseover=\"MM_swapImage('Image6','','images/menu_over_++06.gif',1)\" onmouseout=\"MM_swapImgRestore()\" /></a></li><!--\r\n");
      out.write("--></ul>\r\n");
      out.write("</div>\r\n");
      out.write("<div id=\"contents\">\r\n");
      out.write("<div id=\"main\">\r\n");
      out.write("<h2>WRITING</h2>\r\n");
      out.write("\r\n");
for(int i=0; i<list.size(); i++){
      out.write('\r');
      out.write('\n');
      out.write('	');
 MondaiMenuBean monda = list.get(i);
      out.write('\r');
      out.write('\n');
      out.write('	');
 QuestionInputBean tensu = tensuList.get(i); 
      out.write("\r\n");
      out.write("\r\n");
      out.write("<div><button type=\"button\" name=\"aaa\" value=\"aaa\" style=\"width: 550px; height: 60px\" id=\"Wbtn\" onClick=\"bunyaClick('");
      out.print(monda.getTangen() );
      out.write("')\"><font size=\"4\" color=\"#333399\">\r\n");
      out.print(monda.getTitle() );
      out.write("<div class=\"meter-wrap\"><div class=\"meter-value\" style=\"background-color: #0a0; width:  ");
      out.print(tensu.getTensu());
      out.write("%;\"><div class=\"meter-text\">\r\n");
      out.write("</div></div></div></font></div>\r\n");
 } 
      out.write("\r\n");
      out.write("</div>\r\n");
      out.write("</div>\r\n");
      out.write("<input type= \"hidden\" name =\"bunyaId\", id = \"bunyaId\"></input></form>\r\n");
      out.write("</body>\r\n");
      out.write("<!--<div class=\"meter-wrap\"><div class=\"meter-value\" style=\"background-color: #0a0; width: 100%;\"><div class=\"meter-text\">������</div></div></div>-->\r\n");
      out.write("\r\n");
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
