package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.ArrayList;
import jp.ac.fjb.eLearning.bean.OsiraseBean;
import jp.ac.fjb.eLearning.bean.NewsBean;
import jp.ac.fjb.eLearning.bean.MenteBean;

public final class Mainmenu_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">\r\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\">\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=shift_jis\" />\r\n");
      out.write("<meta http-equiv=\"Content-Style-Type\" content=\"text/css\" />\r\n");
      out.write("<meta http-equiv=\"Content-Script-Type\" content=\"text/javascript\" />\r\n");
      out.write("<meta name=\"copyright\" content=\"Nikukyu-Punch\" />\r\n");
      out.write("<title>�w�K�pe-���[�j���O�T�C�g</title>\r\n");
      out.write("<link href=\"css/Mainmenu1.css\" rel=\"stylesheet\" type=\"text/css\" />\r\n");
      out.write("<script type=\"text/javascript\" src=\"js/script.js\"></script>\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body onload=\"MM_preloadImages('images/menu_over_01.gif','images/menu_over_02.gif','images/menu_over_03.gif','images/menu_over_04.gif','images/menu_over_05.gif','images/menu_over_06.gif')\">\r\n");
      out.write("<form id=\"menuform\">\r\n");
      out.write("<div id=\"container\">\r\n");
      out.write("<div id=\"main-img\"><h1>���C�����j���[</h1><img src=\"images/main_img2.jpg\" width=\"800\" height=\"175\" /></div>\r\n");
      out.write("<ul id=\"menu\">\r\n");
      out.write("<li><a href=\"Mainmenu.jsp\"><img src=\"images/menu_++1.gif\" alt=\"�z�[��\" name=\"Image1\" width=\"140\" height=\"59\" id=\"Image1\" onmouseover=\"MM_swapImage('Image1','','images/menu_over_++01.gif',1)\" onmouseout=\"MM_swapImgRestore()\" /></a></li><!--\r\n");
      out.write("\t\t\t--><li><a href=\"e-learningmenu.jsp\"><img src=\"images/menu_++2.gif\" alt=\"���T�C�g�ɂ���\" name=\"Image2\" width=\"133\" height=\"59\" id=\"Image2\" onmouseover=\"MM_swapImage('Image2','','images/menu_over_++02.gif',1)\" onmouseout=\"MM_swapImgRestore()\" /></a></li><!--\r\n");
      out.write("\t\t\t--><li><a href=\"Mainmenu.jsp\"><img src=\"images/menu_++3.gif\" alt=\"���d��\" name=\"Image3\" width=\"134\" height=\"59\" id=\"Image3\" onmouseover=\"MM_swapImage('Image3','','images/menu_over_++03.gif',1)\" onmouseout=\"MM_swapImgRestore()\" /></a></li><!--\r\n");
      out.write("\t\t\t--><li><a href=\"Mainmenu.jsp\"><img src=\"images/menu_++4.gif\" alt=\"�u���O\" name=\"Image4\" width=\"133\" height=\"59\" id=\"Image4\" onmouseover=\"MM_swapImage('Image4','','images/menu_over_++04.gif',1)\" onmouseout=\"MM_swapImgRestore()\" /></a></li><!--\r\n");
      out.write("\t\t\t--><li><a href=\"Mainmenu.jsp\"><img src=\"images/menu_++5.gif\" alt=\"���₢���킹\" name=\"Image5\" width=\"133\" height=\"59\" id=\"Image5\" onmouseover=\"MM_swapImage('Image5','','images/menu_over_++05.gif',1)\" onmouseout=\"MM_swapImgRestore()\" /></a></li><!--\r\n");
      out.write("\t\t\t--><li><a href=\"Mainmenu.jsp\"><img src=\"images/menu_++6.gif\" alt=\"�����N\" name=\"Image6\" width=\"139\" height=\"59\" id=\"Image6\" onmouseover=\"MM_swapImage('Image6','','images/menu_over_++06.gif',1)\" onmouseout=\"MM_swapImgRestore()\" /></a></li><!--\r\n");
      out.write("\t\t\t--></ul>\r\n");
      out.write("<div id=\"contents\">\r\n");
      out.write("<div id=\"main\">\r\n");
      out.write("<h2>�V���j���[�X</h2>\r\n");
      out.write("<DIV style=\"overflow-y:scroll;width:500px;height:100px;\">\r\n");

	ArrayList<NewsBean> listN
	= (ArrayList)session.getAttribute("NewsList");

	for(int i = 0; i < listN.size(); i++){
    	NewsBean bean = listN.get(i); 		 //ArrayList�̗v�f���擾
    	out.println( " ��"+bean.getHiduke()+" "+ bean.getHonbun() +  "<br>");
	}

      out.write("\r\n");
      out.write("\r\n");
      out.write("</DIV>\r\n");
      out.write("\r\n");
      out.write("<h2>�����点</h2>\r\n");
      out.write("<DIV style=\"overflow-y:scroll;width:500px;height:100px;\">\r\n");
      out.write("\r\n");

	ArrayList<OsiraseBean> listO
	= (ArrayList)session.getAttribute("OsiraseList");

	for(int i = 0; i < listO.size(); i++){
    	OsiraseBean bean = listO.get(i); 		 //ArrayList�̗v�f���擾
    	out.println( " ��"+bean.getHiduke()+" "+bean.getHonbun() + "<br>");
	}

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</div>\r\n");
      out.write("<h2>�����e�i���X</h2>\r\n");
      out.write("<DIV style=\"overflow-y:scroll;width:500px;height:100px;\">\r\n");

	ArrayList<MenteBean> listMN
	= (ArrayList)session.getAttribute("MenteList");

	for(int i = 0; i < listMN.size(); i++){
    	MenteBean bean = listMN.get(i); 		 //ArrayList�̗v�f���擾
    	out.println( " ��"+bean.getHiduke()+" "+ bean.getHonbun() + "<br>");
	}

      out.write("\r\n");
      out.write("</div>\r\n");
      out.write("<h2>���[�U�l��</h2>\r\n");
      out.write("<p>\r\n");
      out.write("���T�C�g�������p�����������ɂ��肪�Ƃ��������܂��B\r\n");
      out.write("<br>\r\n");
      out.write("��������p�җl����񂹂�ꂽ�v�]��g���₷���̒ǋ������Ƃɂ��ǂ��T�C�g�ɂ��Ă����܂��̂ō������낵�����肢���܂��B\r\n");
      out.write("</p>\r\n");
      out.write("<h2>���p�K��</h2>\r\n");
      out.write("<DIV style=\"overflow-y:scroll;width:500px;height:100px;\">\r\n");
      out.write("<p>\r\n");
      out.write("��1���i�{�R���e���c�̎g�p��������ї��p�����j\r\n");
      out.write("<br>\r\n");
      out.write("1.���Ђ́A���p�҂ɑ΂��A�{�R���e���c�𖳏��Ŏg�p���錠�����������܂��B\r\n");
      out.write("<br>\r\n");
      out.write("2.�e���v���[�g�A�e���v���[�g�Ɋ܂܂��摜�����WEB�f�ނ̉��ς���щ��H�i�ȉ����̂�\r\n");
      out.write("�@�āu���ϓ��v�Ƃ����܂��j�́A���p�҂̐ӔC�ɂ����Ď��R�ɍs�����Ƃ��ł��܂��B\r\n");
      out.write("<br>\r\n");
      out.write("3.���p�҂́A�{�K�񂨂�ѓ��T�C�g�ɂ����ē��Ђ����J����܂��͌ʂɒʒm�������͒�\r\n");
      out.write("�@����{�R���e���c�̋@�\�����A���p���@�Ɋւ�������A���ӎ�������ѐ����������i�ȉ��@���̂��āu���������v�Ƃ����܂��j�ɏ]���{�R���e���c�𗘗p������̂Ƃ��܂��B\r\n");
      out.write("<br>\r\n");
      out.write("��2���i�֎~�����j\r\n");
      out.write("<br>\r\n");
      out.write("���p�҂́A�{�R���e���c�̗��p�܂��͉��ϓ��Ɋ֘A���A�ȉ��̍s�ׂ��s��Ȃ����̂Ƃ��܂��B\r\n");
      out.write("<br>\r\n");
      out.write("(1)�{�K�񂨂�ѐ��������̒�߂Ɉᔽ����s��\r\n");
      out.write("<br>\r\n");
      out.write("(2)�����O�̏��@�߂Ɉᔽ���邨����̂���s��\r\n");
      out.write("<br>\r\n");
      out.write("(3)���Ђ܂��͑�O�҂̌����i���쌠�A����אڌ�����я��W�����܂ޒm�I���Y���A�v���C�@�o�V�[���A�ё����Ȃ�тɖ��_�������܂ނ������Ɍ���Ȃ��j��N�Q����A�܂��͂��̂��@����̂���s��\r\n");
      out.write("<br>\r\n");
      out.write("(4)�}���`���@�A�˂��ݍu�܂��̓l�b�g���[�N�r�W�l�X���ւ̊��U�����s���s��\r\n");
      out.write("<br>\r\n");
      out.write("(5)�����A�A�_���g�Ɋւ�����A�����N�҂���N�ɗL�Q�ȏ��A�܂��͂����ɗނ���Ɓ@���f�������𔭐M����s��\r\n");
      out.write("<br>\r\n");
      out.write("(6)���Љ�I�A�\�͓I�A��I�ȏ��𔭐M����s��\r\n");
      out.write("<br>\r\n");
      out.write("(7)�ƍߍs�ׂ��̑��̈�@�s�ׂ�񏕁A�����A��������s��\r\n");
      out.write("<br>\r\n");
      out.write("(8)�s���ɃA�N�Z�X����s�ׁA�N���b�L���O�s�ׁA�A�^�b�N�s�ׁA�E�B���X���M�s�ׁA���̑����@�Ђ܂��͑�O�҂̉^�p����R���s���[�^���Ɏx���^����s�ׁA�܂��͂��̂�����̂���@�@�s��\r\n");
      out.write("<br>\r\n");
      out.write("(9)�{�R���e���c�܂��͉��ϓ����s�����{�R���e���c�i�ȉ����̂��āu�{�R���e���c���v�Ƃ����܁@���j�̑�O�҂ւ̔z�z�A�g�p�����܂��͌����̏��n\r\n");
      out.write("<br>\r\n");
      out.write("(10)�{�R���e���c�����L�^�����}�̂̑�O�҂ւ̔z�z�܂��͔̔�\r\n");
      out.write("</p>\r\n");
      out.write("</div>\r\n");
      out.write("<h2>���̑������N</h2>\r\n");
      out.write("<p><span class=\"color1\">��<strong>���Њ֘A�T�C�g</strong></span><br />\r\n");
      out.write("<a href=\"http://template-punch.com/\" target=\"_blank\"><img src=\"images/banner_tp.png\" alt=\"�e���v���[�g�̔��T�C�g�̃e���v���[�g�p���`\" width=\"200\" height=\"40\" /></a></p>\r\n");
      out.write("<p><a href=\"http://moko-design.com/\" target=\"_blank\"><img src=\"images/banner_md.png\" alt=\"WEB����T�C�g Moko Design\" width=\"200\" height=\"40\" /></a></p>\r\n");
      out.write("<p><a href=\"http://photo-chips.com/\" target=\"_blank\"><img src=\"images/banner_pc.png\" alt=\"�t���[�ʐ^�T�C�g PHOTO CHIPS\" width=\"200\" height=\"40\" /></a></p>\r\n");
      out.write("\r\n");
      out.write("</div><!--main-->\r\n");
      out.write("<div id=\"sub\">\r\n");
      out.write("\r\n");
      out.write("<h3><img src=\"images/sub_menu_midashi_topics.gif\" alt=\"�g�s�b�N�X\" width=\"226\" height=\"32\" /></h3>\r\n");
      out.write("<div class=\"menubottom\">\r\n");
      out.write("<a class=\"twitter-timeline\" href=\"https://twitter.com/jallyman23\" data-widget-id=\"388179343463030785\">@jallyman23 ����̃c�C�[�g</a>\r\n");
      out.write("<script>!function(d,s,id){var js,fjs=d.getElementsByTagName(s)[0],p=/^http:/.test(d.location)?'http':'https';if(!d.getElementById(id)){js=d.createElement(s);js.id=id;js.src=p+\"://platform.twitter.com/widgets.js\";fjs.parentNode.insertBefore(js,fjs);}}(document,\"script\",\"twitter-wjs\");</script>\r\n");
      out.write("\r\n");
      out.write("<!--<input name=\"textfield\" type=\"text\" style=\"width: 90%\" value=\"&lt;li&gt;&lt;a href=&quot;#&quot;&gt;* sub menu 1 *&lt;/a&gt;&lt;/li&gt;\" />-->\r\n");
      out.write("<p>\r\n");
      out.write("</div><!--menubottom-->\r\n");
      out.write("<br />\r\n");
      out.write("</div>\r\n");
      out.write("<!--sub-->\r\n");
      out.write("</div><!--contents-->\r\n");
      out.write("<div id=\"footer\">Copyright(C)2013 �G�p�� All Rights Reserved.<br />\r\n");
      out.write("<a href=\"http://nikukyu-punch.com/\" target=\"_blank\">Template design by Nikukyu-Punch</a></div>\r\n");
      out.write("</div>\r\n");
      out.write("</body>\r\n");
      out.write("</form>\r\n");
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
