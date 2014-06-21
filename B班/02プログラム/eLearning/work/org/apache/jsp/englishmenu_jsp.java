package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class englishmenu_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">\r\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\">\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=shift_jis\" />\r\n");
      out.write("<meta http-equiv=\"Content-Style-Type\" content=\"text/css\" />\r\n");
      out.write("<meta http-equiv=\"Content-Script-Type\" content=\"text/javascript\" />\r\n");
      out.write("<meta name=\"copyright\" content=\"Nikukyu-Punch\" />\r\n");
      out.write("<script type=\"text/javascript\" src=\"js/englishmenu.js\"></script>\r\n");
      out.write("<title>学習用e-leaningサイト</title>\r\n");
      out.write("<link href=\"css/style.css\" rel=\"stylesheet\" type=\"text/css\" />\r\n");
      out.write("<link href=\"css/englishmenu.css\" rel=\"stylesheet\" type=\"text/css\" />\r\n");
      out.write("<link href=\"/eLearning/css/btn.css\" rel=\"stylesheet\" type=\"text/css\" />\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body onload=\"MM_preloadImages('images/menu_over_01.gif','images/menu_over_02.gif','images/menu_over_03.gif','images/menu_over_04.gif','images/menu_over_05.gif','images/menu_over_06.gif')\">\r\n");
      out.write("<form id=\"EnglishForm\">\r\n");
      out.write("<div id=\"container\">\r\n");
      out.write("<div id=\"main_img2\"><h1></h1><img src=\"images/main_img2.jpg\" width=\"800\" height=\"175\" /></div>\r\n");
      out.write("<ul id=\"menu\">\r\n");
      out.write("<li><a href=\"Mainmenu.jsp\"><img src=\"images/menu_++1.gif\" alt=\"ホーム\" name=\"Image1\" width=\"140\" height=\"59\" id=\"Image1\" onmouseover=\"MM_swapImage('Image1','','images/menu_over_++01.gif',1)\" onmouseout=\"MM_swapImgRestore()\" /></a></li><!--\r\n");
      out.write("--><li><a href=\"e-learningmenu.jsp\"><img src=\"images/menu_++2.gif\" alt=\"当サイトについて\" name=\"Image2\" width=\"133\" height=\"59\" id=\"Image2\" onmouseover=\"MM_swapImage('Image2','','images/menu_over_++02.gif',1)\" onmouseout=\"MM_swapImgRestore()\" /></a></li><!--\r\n");
      out.write("--><li><a href=\"Mainmenu.jsp\"><img src=\"images/menu_++3.gif\" alt=\"お仕事\" name=\"Image3\" width=\"134\" height=\"59\" id=\"Image3\" onmouseover=\"MM_swapImage('Image3','','images/menu_over_++03.gif',1)\" onmouseout=\"MM_swapImgRestore()\" /></a></li><!--\r\n");
      out.write("--><li><a href=\"Mainmenu.jsp\"><img src=\"images/menu_++4.gif\" alt=\"ブログ\" name=\"Image4\" width=\"133\" height=\"59\" id=\"Image4\" onmouseover=\"MM_swapImage('Image4','','images/menu_over_++04.gif',1)\" onmouseout=\"MM_swapImgRestore()\" /></a></li><!--\r\n");
      out.write("--><li><a href=\"Mainmenu.jsp\"><img src=\"images/menu_++5.gif\" alt=\"お問い合わせ\" name=\"Image5\" width=\"133\" height=\"59\" id=\"Image5\" onmouseover=\"MM_swapImage('Image5','','images/menu_over_++05.gif',1)\" onmouseout=\"MM_swapImgRestore()\" /></a></li><!--\r\n");
      out.write("--><li><a href=\"Mainmenu.jsp\"><img src=\"images/menu_++6.gif\" alt=\"リンク\" name=\"Image6\" width=\"139\" height=\"59\" id=\"Image6\" onmouseover=\"MM_swapImage('Image6','','images/menu_over_++06.gif',1)\" onmouseout=\"MM_swapImgRestore()\" /></a></li><!--\r\n");
      out.write("--></ul>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<div id = \"button\" align = \"center\">\r\n");
      out.write("\t<!-- <div id = \"english\"> -->\r\n");
      out.write("\t<br><button type=\"button\" name=\"button1\" value=\"\">\r\n");
      out.write("\t\t<a class=\"btn\" href=\"#\"><font size = \"5\">中学英語</font></a>\r\n");
      out.write("\r\n");
      out.write("\t</button>\r\n");
      out.write("\r\n");
      out.write("\t<!-- </div> -->\r\n");
      out.write("\t<br></br>\r\n");
      out.write("\r\n");
      out.write("\t<!-- <div id= \"writing\"> -->\r\n");
      out.write("\t<button type=\"button\" name=\"button1\" value=\"\" id=\"Wbtn\">\r\n");
      out.write("\t\t<a class=\"btn\" href=\"#\"><font size = \"5\">高校 Writing</font></a>\r\n");
      out.write("\r\n");
      out.write("\t</button>\r\n");
      out.write("\r\n");
      out.write("\t<!-- </div> -->\r\n");
      out.write("\r\n");
      out.write("\t<!-- <div id= \"reading\"> -->\r\n");
      out.write("\t<button type=\"button\" name=\"button1\" value=\"\" id=\"Rbtn\">\r\n");
      out.write("\t\t<a class=\"btn\" href=\"#\"><font size = \"5\">高校 Reading</font></a>\r\n");
      out.write("\r\n");
      out.write("\t</button>\r\n");
      out.write("\r\n");
      out.write("\t<!-- </div> -->\r\n");
      out.write("\r\n");
      out.write("\t<!-- <div id= \"listening\"> -->\r\n");
      out.write("\t<button type=\"button\" name=\"button1\" value=\"\" id=\"Lbtn\">\r\n");
      out.write("\t\t<a class=\"btn\" href=\"#\"><font size = \"5\">高校 Listening</font></a>\r\n");
      out.write("\r\n");
      out.write("\t</button>\r\n");
      out.write("\t<br>\r\n");
      out.write("\t<!-- </div> -->\r\n");
      out.write("\r\n");
      out.write("\t<!-- <div id= \"toeic\"> -->\r\n");
      out.write("\t<br><button type=\"button\" name=\"button1\" value=\"\">\r\n");
      out.write("\t\t<a class=\"btn\" href=\"#\"><font size = \"5\">TOEIC</font></a>\r\n");
      out.write("\r\n");
      out.write("\t</button>\r\n");
      out.write("\r\n");
      out.write("\t<!-- </div> -->\r\n");
      out.write("\r\n");
      out.write("\t<!-- <div id= \"toefl\"> -->\r\n");
      out.write("\t<button type=\"button\" name=\"button1\" value=\"\">\r\n");
      out.write("\t\t<a class=\"btn\" href=\"#\"><font size = \"5\">単語・熟語</font></a>\r\n");
      out.write("\r\n");
      out.write("\t</button>\r\n");
      out.write("\r\n");
      out.write("\t<!-- </div> -->\r\n");
      out.write("\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<div id=\"footer\">Copyright(C)2008 秀英社 All Rights Reserved.<br />\r\n");
      out.write("<a href=\"http://nikukyu-punch.com/\" target=\"_blank\">Template design by Nikukyu-Punch</a></div>\r\n");
      out.write("</div>\r\n");
      out.write("<input type=\"hidden\" id=\"kamokuID\" name=\"kamokuID\"></input>\r\n");
      out.write("</form>\r\n");
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
