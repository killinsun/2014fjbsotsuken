package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.ArrayList;
import jp.ac.fjb.sns.bean.OutputSearchResultBean;
import jp.ac.fjb.sns.bean.RoomBean;
import jp.ac.fjb.sns.bean.UserBean;

public final class U003Search_jsp extends org.apache.jasper.runtime.HttpJspBase
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

	// ���O�C�����[�U�̏��
	UserBean loginUser = (UserBean)session.getAttribute("LOGIN_USER");
	String userPosition = (String)loginUser.getPositionId();
	// �������ʃ��[�U�̃��X�g
	@SuppressWarnings("unchecked")
	ArrayList<OutputSearchResultBean> resultList = (ArrayList<OutputSearchResultBean>)session.getAttribute("RESULT_USER_LIST");
	// �I�𒆃��[�U�̃��X�g
	@SuppressWarnings("unchecked")
	ArrayList<OutputSearchResultBean> selectedList = (ArrayList<OutputSearchResultBean>)session.getAttribute("SELECTED_USER_LIST");
	// DB�ɑ��݂���`���b�g���[���̃��X�g
	@SuppressWarnings("unchecked")
	ArrayList<RoomBean> roomList = (ArrayList<RoomBean>)session.getAttribute("HAVING_ROOM_LIST");

      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\">\r\n");
      out.write("\r\n");
      out.write("<head>\r\n");
      out.write("\t<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\r\n");
      out.write("\t<link rel=\"StyleSheet\" type=\"text/css\" href=\"css/search.css\" />\r\n");
      out.write("\t<script type=\"text/javascript\" src=\"js/screenTransition.js\"></script>\r\n");
      out.write("\t<script type=\"text/javascript\" src=\"js/selecterClick.js\"></script>\r\n");
      out.write("\t<title>ConVertion</title>\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("\t<form id=\"form\" name=\"action\" action=\"\">\r\n");
      out.write("\t\t<div id=\"logo\">\r\n");
      out.write("\t\t\t<img src=\"img/logo/logo.png\" height=\"100\" width=\"200\" alt=\"�^�C�g�����S\" />\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t<div id=\"subMenu\">\r\n");
      out.write("\t\t\t<ul id=\"menu\">\r\n");
      out.write("\t\t\t\t<li id=\"m\"><input type=\"submit\" id=\"subm\" value=\"LogOut\" onClick=\"goMainServlet('-1');\" /></li>\r\n");
      out.write("\t\t\t\t<li id=\"m\"><input type=\"submit\" id=\"subm\" value=\"Profile\" onClick=\"goProfileServlet();\" /></li>\r\n");
      out.write("\t\t\t\t<li id=\"m\"><input type=\"submit\" id=\"subm\" value=\"Help\" disabled /></li>\r\n");
      out.write("\t\t\t\t<li id=\"m\"><input type=\"submit\" id=\"subm\" value=\"Home\" onClick=\"goMainServlet('0');\" /></li>\r\n");
      out.write("\t\t\t\t<li id=\"m\">\r\n");
      out.write("\t\t\t\t\t");
if (userPosition.equals("Y00") || userPosition.equals("Y01") || userPosition.equals("Y02") || userPosition.equals("Y03") || userPosition.equals("Y04")) { 
      out.write("\r\n");
      out.write("\t\t\t\t\t<input type=\"submit\" id=\"subm\" value=\"Admin\" onClick=\"goMasterMaintenanceServlet();\" />\r\n");
      out.write("\t\t\t\t\t");
} else { 
      out.write("\r\n");
      out.write("\t\t\t\t\t<input type=\"submit\" id=\"subm\" value=\"Admin\" disabled />\r\n");
      out.write("\t\t\t\t\t");
} 
      out.write("\r\n");
      out.write("\t\t\t\t</li>\r\n");
      out.write("\t\t\t</ul>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t<div id=\"loginName\">\r\n");
      out.write("\t\t\t<div id=\"xLogo\" align=\"center\">\r\n");
      out.write("\t\t\t\t<img src=\"");
      out.print(loginUser.getSectionImg());
      out.write(".png\" alt=\"");
      out.print(loginUser.getSectionName());
      out.write("\" /><br />\r\n");
      out.write("\t\t\t\t<img src=\"");
      out.print(loginUser.getPositionImg());
      out.write("\"  alt=\"");
      out.print(loginUser.getPositionName());
      out.write("\" />\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div id=\"yLogo\">\r\n");
      out.write("\t\t\t\t<img src=\"");
      out.print(loginUser.getLevelImg());
      out.write(".png\" alt=\"");
      out.print(loginUser.getLevelName());
      out.write("\" />\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div id=\"zLogo\">\r\n");
      out.write("\t\t\t\t<font size=\"4\">��������Ⴂ�܂��B</font><br />\r\n");
      out.write("\t\t\t\t<h3 align=\"right\" >");
      out.print(loginUser.getUserName() );
      out.write("�@�l</h3>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t<div id=\"userMenu\">\r\n");
      out.write("\t\t\t<input type=\"submit\" id=\"mainMenu\" value=\"���[�U�[����\" disabled />\r\n");
      out.write("\t\t\t<input type=\"submit\" id=\"mainMenu\" value=\"�A�h�o�C�X\" onClick=\"goAdviceServlet();\" />\r\n");
      out.write("\t\t\t<input type=\"submit\" id=\"mainMenu\" value=\"�C�x���g�J�����_�[�X�P�W���[��\" onClick=\"goEventServlet();\" />\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t<div id=\"searchArea\">\r\n");
      out.write("\t\t\t<p>\r\n");
      out.write("\t\t\t\t���[�U���Ō����F<br />\r\n");
      out.write("\t\t\t\t<input type=\"text\" id=\"nameSearch\" name=\"nameSearch\" size=\"30\" autofocus />\r\n");
      out.write("\t\t\t</p>\r\n");
      out.write("\t\t\t<p>\r\n");
      out.write("\t\t\t\t���ʁF<br />\r\n");
      out.write("\t\t\t\t<select id=\"selectGender\" name=\"selectGender\">\r\n");
      out.write("\t\t\t\t\t<option value=\"\" selected>���ɍi��Ȃ�</option>\r\n");
      out.write("\t\t\t\t\t<option value=\"�j\">�j</option>\r\n");
      out.write("\t\t\t\t\t<option value=\"��\">��</option>\r\n");
      out.write("\t\t\t\t</select>\r\n");
      out.write("\t\t\t</p>\r\n");
      out.write("\t\t\t<p>\r\n");
      out.write("\t\t\t\t�N��F<br />\r\n");
      out.write("\t\t\t\t<select id=\"selectAge\" name=\"selectAge\">\r\n");
      out.write("\t\t\t\t\t<option value=\"10\" selected>���ɍi��Ȃ�</option>\r\n");
      out.write("\t\t\t\t\t<option value=\"20\">20��ȏ�</option>\r\n");
      out.write("\t\t\t\t\t<option value=\"30\">30��ȏ�</option>\r\n");
      out.write("\t\t\t\t\t<option value=\"40\">40��ȏ�</option>\r\n");
      out.write("\t\t\t\t\t<option value=\"50\">50��ȏ�</option>\r\n");
      out.write("\t\t\t\t</select>\r\n");
      out.write("\t\t\t</p>\r\n");
      out.write("\t\t\t<p>\r\n");
      out.write("\t\t\t\t���������F<br />\r\n");
      out.write("\t\t\t\t<select id=\"selectSection\" name=\"selectSection\">\r\n");
      out.write("\t\t\t\t\t<option value=\"\" selected>���ɍi��Ȃ�</option>\r\n");
      out.write("\t\t\t\t\t<option value=\"B00\">��\�����</option>\r\n");
      out.write("\t\t\t\t\t<option value=\"B01\">���ƕ�</option>\r\n");
      out.write("\t\t\t\t\t<option value=\"B02\">�J����</option>\r\n");
      out.write("\t\t\t\t\t<option value=\"B03\">�c�ƕ�</option>\r\n");
      out.write("\t\t\t\t\t<option value=\"B04\">�o����</option>\r\n");
      out.write("\t\t\t\t\t<option value=\"B05\">�l����</option>\r\n");
      out.write("\t\t\t\t\t<option value=\"B06\">������</option>\r\n");
      out.write("\t\t\t\t</select>\r\n");
      out.write("\t\t\t</p>\r\n");
      out.write("\t\t\t<p>\r\n");
      out.write("\t\t\t\t�ݎЗ��F<br />\r\n");
      out.write("\t\t\t\t<input type=\"number\" id=\"numCarrier\" name=\"numCarrier\" />�N�ȏ�\r\n");
      out.write("\t\t\t</p>\r\n");
      out.write("\t\t\t<p>\r\n");
      out.write("\t\t\t\t�t���[���[�h�F<br />\r\n");
      out.write("\t\t\t\t<input type=\"text\" id=\"freeWordSearch\" name=\"freeWordSearch\" />\r\n");
      out.write("\t\t\t</p>\r\n");
      out.write("\t\t\t\t�������i�F\r\n");
      out.write("\t\t\t<table>\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<td colspan=\"2\"><input type=\"checkbox\" id=\"checkLisence\" name=\"checkLisence\" value=\"S00\" />IT�p�X�|�[�g</td>\r\n");
      out.write("\t\t\t\t\t<td colspan=\"2\"><input type=\"checkbox\" id=\"checkLisence\" name=\"checkLisence\" value=\"S01\" />��{���Z�p��</td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<td colspan=\"2\"><input type=\"checkbox\" id=\"checkLisence\" name=\"checkLisence\" value=\"S02\" />���p���Z�p��</td>\r\n");
      out.write("\t\t\t\t\t<td colspan=\"2\"><input type=\"checkbox\" id=\"checkLisence\" name=\"checkLisence\" value=\"S06\" />�v���W�F�N�g�}�l�[�W��</td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t</table>\r\n");
      out.write("\t\t\t<input type=\"submit\" id=\"searchButton\" name=\"searchButton\" value=\"����\" onClick=\"goSearchServlet('1')\" />\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t<div id=\"resultArea\">\r\n");
      out.write("\t\t\t<div id=\"resultHeader\">\r\n");
      out.write("\t\t\t\t<b>��������</b>\r\n");
      out.write("\t\t\t\t<hr />\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t\t<table id=\"table\">\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<th width=\"35px\">�I��</th>\r\n");
      out.write("\t\t\t\t\t\t<th width=\"158px\">���O</th>\r\n");
      out.write("\t\t\t\t\t\t<th width=\"35px\">����</th>\r\n");
      out.write("\t\t\t\t\t\t<th width=\"64px\">����</th>\r\n");
      out.write("\t\t\t\t\t\t<th width=\"92px\">�ݎЗ�</th>\r\n");
      out.write("\t\t\t\t\t\t<th width=\"70px\">���x��</th>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t</table>\r\n");
      out.write("\t\t\t<div id=\"resultList\">\r\n");
      out.write("\t\t\t\t<table id=\"table\">\r\n");
      out.write("\t\t\t\t\t");

					if(resultList != null) {
						for (int i=0; i<resultList.size(); i++) {
							OutputSearchResultBean osfb = resultList.get(i);
					
      out.write("\r\n");
      out.write("\t\t\t\t\t<tr background=\"img/style/sash.gif\" height=\"32\">\r\n");
      out.write("\t\t\t\t\t\t<td width=\"35px\"><input type=\"image\" src=\"img/style/plus.gif\" id=\"addButton\" onmousedown=\"pMouseDown('");
      out.print(osfb.getResultUserId());
      out.write("', this)\" onmouseup=\"pMouseUp('");
      out.print(osfb.getResultUserId());
      out.write("', this)\" /></td>\r\n");
      out.write("\t\t\t\t\t\t<td width=\"158px\">");
      out.print(osfb.getResultUserName());
      out.write("</td>\r\n");
      out.write("\t\t\t\t\t\t<td width=\"35px\">");
      out.print(osfb.getResultGender());
      out.write("</td>\r\n");
      out.write("\t\t\t\t\t\t<td width=\"64px\"><img src=\"");
      out.print( osfb.getResultSectionImg());
      out.write("_2.png\" height=\"24\" width=\"32\" alt=\"");
      out.print(osfb.getSectionName());
      out.write("\" /></td>\r\n");
      out.write("\t\t\t\t\t\t<td width=\"92px\">");
      out.print(osfb.getResultCarrier());
      out.write("�N</td>\r\n");
      out.write("\t\t\t\t\t\t<td width=\"72px\"><img src=\"");
      out.print(osfb.getResultLevelImg());
      out.write("_2.png\" height=\"22\" alt=\"");
      out.print(osfb.getLevelName());
      out.write("\" /></td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t");

						}
					}
					
      out.write("\r\n");
      out.write("\t\t\t\t</table>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t<div id=\"selectedArea\">\r\n");
      out.write("\t\t\t<div id=\"selectedHeader\">\r\n");
      out.write("\t\t\t\t<b>�I�𒆂̃��[�U</b>\r\n");
      out.write("\t\t\t\t<hr />\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div id=\"selectedList\">\r\n");
      out.write("\t\t\t\t<table id=\"table\">\r\n");
      out.write("\t\t\t\t\t");

					if(selectedList != null) {
						for (int i=0; i<selectedList.size(); i++) {
							OutputSearchResultBean osfb2 = selectedList.get(i);
					
      out.write("\r\n");
      out.write("\t\t\t\t\t<tr background=\"img/style/sash.gif\" height=\"32\">\r\n");
      out.write("\t\t\t\t\t\t<td width=\"45\"><input type=\"image\" src=\"img/style/minus.gif\" id=\"delButton\" onmousedown=\"mMouseDown('");
      out.print(osfb2.getResultUserId());
      out.write("', this)\" onmouseup=\"mMouseUp('");
      out.print(osfb2.getResultUserId());
      out.write("', this)\" value=\"d0\" /></td>\r\n");
      out.write("\t\t\t\t\t\t<td>");
      out.print(osfb2.getResultUserName());
      out.write("</td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t");

						}
					}
					
      out.write("\r\n");
      out.write("\t\t\t\t</table>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t<div id=\"roomArea\">\r\n");
      out.write("\t\t\t<div id=\"roomHeader\">\r\n");
      out.write("\t\t\t\t<b>���[��</b>\r\n");
      out.write("\t\t\t\t<input type=\"text\" id=\"newRoomName\" name=\"newRoomName\" size=\"14\" placeholder=\"�V�K���[���������\" />\r\n");
      out.write("\t\t\t\t<input type=\"submit\" id=\"newRoom\" value=\"�V�����������쐬\" onClick=\"goSearchServlet('3')\" />\r\n");
      out.write("\t\t\t\t<input type=\"submit\" id=\"addUser\" name=\"addUser\" onClick=\"goSearchServlet('4')\" value=\"�ǉ�\" />\r\n");
      out.write("\t\t\t\t<hr />\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<table id=\"table\">\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<th>�@</th>\r\n");
      out.write("\t\t\t\t\t<th>���[����</th>\r\n");
      out.write("\t\t\t\t\t<th>�l��</th>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t</table>\r\n");
      out.write("\t\t\t<div id=\"roomList\">\r\n");
      out.write("\t\t\t\t<table id=\"table\">\r\n");
      out.write("\t\t\t\t\t");

					if(roomList != null) {
						for (int i=0; i<roomList.size(); i++) {
							RoomBean rb = roomList.get(i);
					
      out.write("\r\n");
      out.write("\t\t\t\t\t<tr background=\"img/style/sash.gif\" height=\"32\">\r\n");
      out.write("\t\t\t\t\t\t<td><input type=\"radio\" id=\"selectRoom\" name=\"selectRoom\" value=\"");
      out.print(rb.getRoomId());
      out.write("\" /></td>\r\n");
      out.write("\t\t\t\t\t\t<td>");
      out.print(rb.getRoomName());
      out.write("</td>\r\n");
      out.write("\t\t\t\t\t\t<td>");
      out.print(rb.getCountId());
      out.write("�l</td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t");

						}
					}
					
      out.write("\r\n");
      out.write("\t\t\t\t</table>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<input type=\"hidden\" id=\"pid\" name=\"pid\" value=\"1\" />\r\n");
      out.write("\t\t<input type=\"hidden\" id=\"uid\" name=\"uid\" value=\"\" />\r\n");
      out.write("\t</form>\r\n");
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
