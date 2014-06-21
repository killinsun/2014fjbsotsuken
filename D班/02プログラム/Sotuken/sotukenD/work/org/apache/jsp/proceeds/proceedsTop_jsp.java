package org.apache.jsp.proceeds;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class proceedsTop_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("<!DOCTYPE html>\r\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t<head>\r\n");
      out.write("    \t<meta charset=\"utf-8\" />\r\n");
      out.write("   \t <title>����グ�ꗗ</title>\r\n");
      out.write("   \t <link rel=\"stylesheet\" type=\"text/css\" href=\"/sotukenD/css/style.css\" />\r\n");
      out.write("    <script type=\"text/javascript\" src=\"https://www.google.com/jsapi\"></script>\r\n");
      out.write("    <script type=\"text/javascript\">\r\n");
      out.write("      google.load(\"visualization\", \"1\", {packages:[\"corechart\"]});\r\n");
      out.write("      google.setOnLoadCallback(drawChart);\r\n");
      out.write("      function drawChart() {\r\n");
      out.write("        var data = google.visualization.arrayToDataTable([\r\n");
      out.write("          ['Month', '���N', '�O�N'],\r\n");
      out.write("          ['1��',  45,      50],\r\n");
      out.write("          ['2��',  56,      44],\r\n");
      out.write("          ['3��',  44,      42],\r\n");
      out.write("          ['4��',  75,      66],\r\n");
      out.write("          ['5��',  55,      58],\r\n");
      out.write("          ['6��',  60,      65],\r\n");
      out.write("        ]);\r\n");
      out.write("\r\n");
      out.write("        var options = {\r\n");
      out.write("          title: '�O�N�Δ�',\r\n");
      out.write("          vAxis: {title: '��'}\r\n");
      out.write("        };\r\n");
      out.write("\r\n");
      out.write("        var chart = new google.visualization.LineChart(document.getElementById('chart_div'));\r\n");
      out.write("        chart.draw(data, options);\r\n");
      out.write("      }\r\n");
      out.write("      </script>\r\n");
      out.write("\t</head>\r\n");
      out.write("<body>\r\n");
      out.write("<div class=\"frm\">\r\n");
      out.write("\t<!--header����-->\r\n");
      out.write("\t\t<header id=\"header\">\r\n");
      out.write("\t\t\t<div id=\"title\">����m�F���</div>\r\n");
      out.write("\t\t\t<div id=\"account\" align=\"right\">\r\n");
      out.write("\t\t\t\t<div id=\"name\">�c�� ���O</div>\r\n");
      out.write("\t\t\t\t<!--���O�A�E�g�{�^��-->\r\n");
      out.write("\t\t\t\t<button type=\"button\" id=\"logout\">���O�A�E�g</button>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div>�@\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</header>\r\n");
      out.write("\r\n");
      out.write("\t<!--�y�[�W�ړ��A�i�r�Q�[�V��������-->\r\n");
      out.write("\t<nav id=\"nav\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t<iframe src=\"./../mainMenu.jsp\" name=\"mainMenu\" Align=\"left\" Frameborder=\"no\" Marginheight=\"0\" Width=\"200\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t</iframe>\r\n");
      out.write("\r\n");
      out.write("\t</nav>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t<!--��Ɖ��-->\r\n");
      out.write("\t<section id=\"mainContent\">\r\n");
      out.write("\t���ݔ���@<input type=\"text\" size=\"10\" name=\"proceedsNow\" value=�P�Q�S�Q�U�W readonly=\"readonly\"  />�~�@�@\r\n");
      out.write("\t�O�N�Δ�<input type=\"text\" size=4 name=\"lastYearPercent\" value=101.2 readonly=\"readonly\"  />���@�@\r\n");
      out.write("\t�ڕW�B����<input type=\"text\" size=4 name=\"achievePercent\" value=93.5 readonly=\"readonly\"  />���@�@\r\n");
      out.write("\t<div id=\"chart_div\" style=\"width: 580px; height: 350px;\"></div>\r\n");
      out.write("\t\t<br>\r\n");
      out.write("\t</section>\r\n");
      out.write("</div>\r\n");
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
