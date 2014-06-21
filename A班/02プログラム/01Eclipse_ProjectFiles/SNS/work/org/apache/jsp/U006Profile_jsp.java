package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import jp.ac.fjb.sns.bean.UserBean;

public final class U006Profile_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html;charset=UTF-8");
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

	// ���O�C�����[�U�̏��
	UserBean loginUser = (UserBean)session.getAttribute("LOGIN_USER");
	String userPosition = (String)loginUser.getPositionId();

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\">\r\n");
      out.write("\r\n");
      out.write("<head>\r\n");
      out.write("\t<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\"/>\r\n");
      out.write("\t<link rel=\"StyleSheet\" type=\"text/css\" href=\"css/profile.css\" />\r\n");
      out.write("\t<script type=\"text/javascript\" src=\"js/screenTransition.js\"></script>\r\n");
      out.write("    <title>ConVertion</title>\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("<form id=\"form\" name=\"form\" action=\"\">\r\n");
      out.write("\t<div id=\"Logo\">\r\n");
      out.write("\t\t<img src=\"img/logo/logo.png\" height=\"100\" width=\"200\" alt=\"�^�C�g�����S\">\r\n");
      out.write("\t</div>\r\n");
      out.write("\r\n");
      out.write("\t<div ul=\"SubMenu\" style=\"list-style:none\" id=\"SubMenu\">\r\n");
      out.write("\t\t<li style=\"float:right\">\r\n");
      out.write("\t\t\t<input type=\"submit\" id=\"Button\" style=\"WIDTH: 70px; HEIGHT: 30px\" value=\"LogOut\" onClick=\"goMainServlet('-1');\"></li>\r\n");
      out.write("\t\t<li style=\"float:right\">\r\n");
      out.write("\t\t\t<input type=\"submit\" id=\"Button\" style=\"WIDTH: 70px; HEIGHT: 30px\" value=\"Profile\" onClick=\"goProfileServlet();\">\r\n");
      out.write("\t\t</li>\r\n");
      out.write("\t\t<li style=\"float:right\">\r\n");
      out.write("\t\t\t<input type=\"submit\" id=\"Button\" style=\"WIDTH: 70px; HEIGHT: 30px\" value=\"Help\" disabled>\r\n");
      out.write("\t\t</li>\r\n");
      out.write("\t\t<li style=\"float:right\">\r\n");
      out.write("\t\t\t<input type=\"submit\" id=\"Button\" style=\"WIDTH: 70px; HEIGHT: 30px\" value=\"Home\" onClick=\"goMainServlet();\">\r\n");
      out.write("\t\t</li>\r\n");
      out.write("\t\t<li style=\"float:right\">\r\n");
      out.write("\t\t\t");
if (userPosition.equals("Y00") || userPosition.equals("Y01") || userPosition.equals("Y02") || userPosition.equals("Y03") || userPosition.equals("Y04")) { 
      out.write("\r\n");
      out.write("\t\t\t<input type=\"submit\" id=\"admin\" style=\"WIDTH: 70px; HEIGHT: 30px\" value=\"Admin\" onClick=\"goMasterMaintenanceServlet();\">\r\n");
      out.write("\t\t\t");
} else { 
      out.write("\r\n");
      out.write("\t\t\t<input type=\"submit\" id=\"admin\" style=\"WIDTH: 70px; HEIGHT: 30px\" value=\"Admin\" disabled>\r\n");
      out.write("\t\t\t");
} 
      out.write("\r\n");
      out.write("\t\t</li>\r\n");
      out.write("\t</div>\r\n");
      out.write("\r\n");
      out.write("\t<div id=\"LoginName\">\r\n");
      out.write("\t\t<div id=\"xLogo\" align=\"center\">\r\n");
      out.write("\t\t\t<img src=\"");
      out.print(loginUser.getSectionImg());
      out.write(".png\"><br />\r\n");
      out.write("\t\t\t<img src=\"");
      out.print(loginUser.getPositionImg());
      out.write("\">\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div id=\"yLogo\"><img src=\"");
      out.print(loginUser.getLevelImg());
      out.write(".png\"></div>\r\n");
      out.write("\t\t<div id=\"zLogo\"><font size=\"4\">��������Ⴂ�܂��B</font><br/><h3 align=\"right\" >");
      out.print(loginUser.getUserName() );
      out.write(" �@�l</h3></div>\r\n");
      out.write("\t\t<div id=\"Name\"></div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\r\n");
      out.write("\t<div id=\"profile\">\r\n");
      out.write("\t\t<div id=\"profile_left\">\r\n");
      out.write("\t\t\t<div id=\"myimg\"></div>\r\n");
      out.write("\t\t\t<div id=\"myhistory\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<table border=\"1\" border-style=\"dotted\" width=\"320\" height=\"240\">\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<th align=\"center\">�N</th>\r\n");
      out.write("\t\t\t\t\t\t<th align=\"center\">��</th>\r\n");
      out.write("\t\t\t\t\t\t<th align=\"center\">�o��</th>\r\n");
      out.write("\t\t\t\t\t</tr>\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<td align=\"center\">����20�N</td>\r\n");
      out.write("\t\t\t\t\t\t<td align=\"center\">4</td>\r\n");
      out.write("\t\t\t\t\t\t<td>������������� ����</td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<td align=\"center\"></td>\r\n");
      out.write("\t\t\t\t\t\t<td align=\"center\"></td>\r\n");
      out.write("\t\t\t\t\t\t<td>�@�����{�� ���V�X�e���J�����ɔz��</td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<td align=\"center\"></td>\r\n");
      out.write("\t\t\t\t\t\t<td align=\"center\"></td>\r\n");
      out.write("\t\t\t\t\t\t<td>�@������s�́����V�X�e���J����S��</td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<td align=\"center\"></td>\r\n");
      out.write("\t\t\t\t\t\t<td align=\"center\"></td>\r\n");
      out.write("\t\t\t\t\t\t<td>�@�������́�����S��</td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<td align=\"center\">����23�N</td>\r\n");
      out.write("\t\t\t\t\t\t<td align=\"center\">4</td>\r\n");
      out.write("\t\t\t\t\t\t<td>�������[�_�[�ɏ��i</td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<td align=\"center\">����23�N</td>\r\n");
      out.write("\t\t\t\t\t\t<td align=\"center\">11</td>\r\n");
      out.write("\t\t\t\t\t\t<td>�����{�� �l�ފJ�����ֈٓ�</td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<td align=\"center\"></td>\r\n");
      out.write("\t\t\t\t\t\t<td align=\"center\"></td>\r\n");
      out.write("\t\t\t\t\t\t<td>�@�V���̗p��S��</td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<td align=\"center\">����25�N</td>\r\n");
      out.write("\t\t\t\t\t\t<td align=\"center\">8</td>\r\n");
      out.write("\t\t\t\t\t\t<td>��g��̓s���ɂ��ސE</td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<td align=\"center\">����25�N</td>\r\n");
      out.write("\t\t\t\t\t\t<td align=\"center\">9</td>\r\n");
      out.write("\t\t\t\t\t\t<td>������Ђ悵����?�ۂ�?����� ����</td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<td align=\"center\"></td>\r\n");
      out.write("\t\t\t\t\t\t<td align=\"center\"></td>\r\n");
      out.write("\t\t\t\t\t\t<td>�{�� �V�X�e���G���W�j�A�����O���ɔz��</td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<td align=\"center\">����25�N</td>\r\n");
      out.write("\t\t\t\t\t\t<td align=\"center\">10</td>\r\n");
      out.write("\t\t\t\t\t\t<td>������Ё����Ƌ����J���v���W�F�N�g�Q��</td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<td align=\"center\"></td>\r\n");
      out.write("\t\t\t\t\t\t<td align=\"center\"></td>\r\n");
      out.write("\t\t\t\t\t\t<td>���݂Ɏ���</td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t</table>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div id=\"profile_center\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t<table border=\"1\" id=\"profile_table\" width=\"438\" height=\"478\">\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<td rowspan=\"2\" bgcolor=\"#F0B0B0\"><b>�ӂ肪��/���O</b></td>\r\n");
      out.write("\t\t\t\t\t<td colspan=\"3\">�ӂȂ΂� ���낤</td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<td colspan=\"3\"><font size=\"3\">�D���@���Y</font></td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<td bgcolor=\"#F0B0B0\"><b>����</b></td>\r\n");
      out.write("\t\t\t\t\t<td>�j</td>\r\n");
      out.write("\t\t\t\t\t<td bgcolor=\"#F0B0B0\"><b>���t�^</b></td>\r\n");
      out.write("\t\t\t\t\t<td>O�^</td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<td bgcolor=\"#F0B0B0\"><b>���N����</b></td>\r\n");
      out.write("\t\t\t\t\t<td colspan=\"2\">1992�N9��20��</td>\r\n");
      out.write("\t\t\t\t\t<td>(���@21��)</td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<td bgcolor=\"#F0B0B0\"><b>�A����</b></td>\r\n");
      out.write("\t\t\t\t\t<td>090-xxxx-xxxx</td>\r\n");
      out.write("\t\t\t\t\t<td bgcolor=\"#F0B0B0\"><b>e-Mail</b></td>\r\n");
      out.write("\t\t\t\t\t<td>t.funabashi@yc.co.jp</td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<td bgcolor=\"#F0B0B0\"><b>��������</b></td>\r\n");
      out.write("\t\t\t\t\t<td>������(�Ј�)</td>\r\n");
      out.write("\t\t\t\t\t<td bgcolor=\"#F0B0B0\"><b>�ݎЗ�</b></td>\r\n");
      out.write("\t\t\t\t\t<td>1�N</td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<td bgcolor=\"#F0B0B0\"><b>����</b></td>\r\n");
      out.write("\t\t\t\t\t<td colspan=\"3\">���{��, �p��, ������</td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<td bgcolor=\"#F0B0B0\"><b>�v���O��������</b></td>\r\n");
      out.write("\t\t\t\t\t<td colspan=\"3\">HTML5, JQuery, Java, Javascript, COBOL, C</td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<td rowspan=\"14\" bgcolor=\"#F0B0B0\"><b>�擾���i</b></td>\r\n");
      out.write("\t\t\t\t\t<td colspan=\"3\" bgcolor=\"#FFDEAD\"><b><i>IT Skills - General</i></b></td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<td colspan=\"3\">IT�p�X�|�[�g, ��{���Z�p�Ҏ���, ���p���Z�p�Ҏ���</td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<td colspan=\"3\" bgcolor=\"#FFDEAD\"><b><i>IT Skills - Programing</i></b></td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<td colspan=\"3\">Sun Java�v���O���~���O�\�͌���</td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<td colspan=\"3\" bgcolor=\"#FFDEAD\"><b><i>IT Skills - Network</i></b></td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<td colspan=\"3\">CISCO�Z�p�ҔF�莎��</td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<td colspan=\"3\" bgcolor=\"#FFDEAD\"><b><i>Design Skills</i></b></td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<td colspan=\"3\">UMTP UML ���f�����O�Z�p�ҔF�莎��</td>\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<td colspan=\"3\" bgcolor=\"#FFDEAD\"><b><i>Management Skills</i></b></td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<td colspan=\"3\">�v���W�F�N�g�}�l�[�W������</td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<td colspan=\"3\" bgcolor=\"#FFDEAD\"><b><i>Business Skills</i></b></td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<td colspan=\"3\">�r�W�l�X�����}�i�[����, �r�W�l�X��������</td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<td colspan=\"3\" bgcolor=\"#FFDEAD\"><b><i>Language Skills</i></b></td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<td colspan=\"3\">TOEIC</td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t</table>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div id=\"profile_right\">\r\n");
      out.write("\t\t\t<table border=\"1\" width=\"438\" height=\"478\" bgcolor=\"#eeecc6\">\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<td valign=\"top\">\r\n");
      out.write("\t\t\t\t\t�� �����A<br />\r\n");
      out.write("\t\t\t\t\t2013�N9�����A(��)�悵���� �`�ۂ�`�����֓��Вv���܂����B<br />\r\n");
      out.write("\t\t\t\t\t�l���́�������Ƃ͈ȑO���𗬂�����A<br />\r\n");
      out.write("\t\t\t\t\t���̓x�̒��r�̗p�ɂ��܂��Ă�����Ȃ邲�x���E�����͂𒸂��܂����B<br />\r\n");
      out.write("\t\t\t\t\t���̏���؂�Č��\���グ�܂��B<br />\r\n");
      out.write("\t\t\t\t\t<br />\r\n");
      out.write("\t\t\t\t\t�� �Ɩ�<br />\r\n");
      out.write("\t\t\t\t\t���݂́A������Ё������Ƃ̋����J���v���W�F�N�g<br/>\r\n");
      out.write("\t\t\t\t\t�u�������������v�Ɏ��g��ł���܂��B<br />\r\n");
      out.write("\t\t\t\t\t�S���́~�~�~�~�~�ŁA???�Ƃ�������Ԃœ����Ă���܂��B<br />\r\n");
      out.write("\t\t\t\t\t<br />\r\n");
      out.write("\t\t\t\t\t<br />\r\n");
      out.write("\t\t\t\t\t�� �<br />\r\n");
      out.write("\t\t\t\t\t�T���ɎГ��̗L�u�����o�[�ōd���e�j�X�����āA���𗬂��Ă��܂��B<br />\r\n");
      out.write("\t\t\t\t\t���ݒj�����킹��5��(�j3/��2)�ŁA����S���������Ƃ͌���Ȃ��̂ŁA<br />\r\n");
      out.write("\t\t\t\t\t�o���ҁA���o���Җ�킸�Q���҂��܂��܂���W���ł��I<br />\r\n");
      out.write("\t\t\t\t\t<br />\r\n");
      out.write("\t\t\t\t\t�Ɩ���̂��A�����Ɍ��炸�A���C�y�Ƀ��[��/TEL�ɂĂ��m�点���������B\r\n");
      out.write("\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t</table>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t</div>\r\n");
      out.write("\r\n");
      out.write("\t<div id=\"edit\">\r\n");
      out.write("\t<input type=\"submit\" id=\"editbutton\" value=\"�v���t�B�[����ҏW����B\" onClick=\"goEditProfileServlet();\">\r\n");
      out.write("\t</div>\r\n");
      out.write("</form>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("\r\n");
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
