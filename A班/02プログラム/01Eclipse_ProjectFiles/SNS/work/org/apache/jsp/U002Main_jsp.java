package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.ArrayList;
import jp.ac.fjb.sns.bean.UserBean;
import jp.ac.fjb.sns.bean.RoomBean;

public final class U002Main_jsp extends org.apache.jasper.runtime.HttpJspBase
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

	// ログインユーザの情報
	UserBean loginUser = (UserBean)session.getAttribute("LOGIN_USER");
	@SuppressWarnings("unchecked")
	ArrayList<RoomBean> list = (ArrayList<RoomBean>)session.getAttribute("HAVING_ROOM_LIST");
	String userPosition = (String)loginUser.getPositionId();
	System.out.println(userPosition);
	String roomCheck = (String)session.getAttribute("ROOM_ID");

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\">\r\n");
      out.write("\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\"/>\r\n");
      out.write("<link rel=\"StyleSheet\" type=\"text/css\" href=\"css/main.css\" />\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"css/calender.css\" />\r\n");
      out.write("<script type=\"text/javascript\" src=\"js/screenTransition.js\"></script>\r\n");
      out.write("    <title>ConVertion</title>\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body style=\"background:#E0FFFF\">\r\n");
      out.write("<form id=\"form\" name=\"form\" action=\"\">\r\n");
      out.write("<div id=\"Logo\"><img src=\"img/logo/logo.png\" height=\"100\" width=\"200\" alt=\"タイトルロゴ\"></div>\r\n");
      out.write("\r\n");
      out.write("<div id=\"Kanri\"></div>\r\n");
      out.write("\r\n");
      out.write("<div ul=\"SubMenu\" style=\"list-style:none\" id=\"SubMenu\">\r\n");
      out.write("<li style=\"float:right\"><input type=\"submit\"  id=\"Button\" style=\"WIDTH: 70px; HEIGHT: 30px\" value=\"LogOut\" onClick=\"goMainServlet('-1');\"></li>\r\n");
      out.write("<li style=\"float:right\"><input type=\"submit\"  id=\"Button\" style=\"WIDTH: 70px; HEIGHT: 30px\" value=\"Profile\" onClick=\"goProfileServlet();\"></li>\r\n");
      out.write("<li style=\"float:right\"><input type=\"submit\"  id=\"Button\" style=\"WIDTH: 70px; HEIGHT: 30px\" value=\"Help\" disabled></li>\r\n");
      out.write("<li style=\"float:right\"><input type=\"submit\"  id=\"Button\" style=\"WIDTH: 70px; HEIGHT: 30px\" value=\"Home\" disabled></li>\r\n");
      out.write("<li style=\"float:right\">\r\n");
      out.write("\t");
if (userPosition.equals("Y00") || userPosition.equals("Y01") || userPosition.equals("Y02") || userPosition.equals("Y03") || userPosition.equals("Y04")) { 
      out.write("\r\n");
      out.write("\t<input type=\"submit\" id=\"admin\" style=\"WIDTH: 70px; HEIGHT: 30px\" value=\"Admin\" onClick=\"goMasterMaintenanceServlet();\">\r\n");
      out.write("\t");
} else { 
      out.write("\r\n");
      out.write("\t<input type=\"submit\" id=\"admin\" style=\"WIDTH: 70px; HEIGHT: 30px\" value=\"Admin\" disabled>\r\n");
      out.write("\t");
} 
      out.write("\r\n");
      out.write("</li>\r\n");
      out.write("\r\n");
      out.write("</div>\r\n");
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
      out.write("\t\t<div id=\"zLogo\"><font size=\"4\">いらっしゃいませ。</font><br/><h3 align=\"right\" >");
      out.print(loginUser.getUserName() );
      out.write(" 　様</h3></div>\r\n");
      out.write("\t\t<div id=\"Name\"></div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\r\n");
      out.write("<div id=\"UserMenu\">\r\n");
      out.write("<input type=\"submit\"  id=\"Button\" style=\"WIDTH: 395px; HEIGHT: 100px\" value=\"ユーザー検索\" onClick=\"goSearchServlet('0');\">\r\n");
      out.write("<input type=\"submit\"  id=\"Button\" style=\"WIDTH: 395px; HEIGHT: 100px\" value=\"アドバイス\" onClick=\"goAdviceServlet();\">\r\n");
      out.write("<input type=\"submit\"  id=\"Button\" style=\"WIDTH: 395px; HEIGHT: 100px\" value=\"イベントカレンダースケジュール\" onClick=\"goEventServlet();\">\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<!-- 部屋リスト -->\r\n");
      out.write("\r\n");
      out.write("\t<div id=\"RoomList\" >\r\n");
      out.write("\t\t<table id=\"Room\" class=\"Room\" >\r\n");
      out.write("\t\t\t");
String cRoomId = roomCheck; 
      out.write("\r\n");
      out.write("\t\t\t<tr >\r\n");
      out.write("\t\t\t\t<th>__</th>\r\n");
      out.write("\t\t\t\t<th>ルーム名</th>\r\n");
      out.write("\t\t\t\t<th width=\"55\" >人数</th>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t<tr onClick=\"goMainServlet('E')\" ");
if (cRoomId.equals("E")){
      out.write("style=\"background:yellow\"");
}
      out.write(">\r\n");
      out.write("\t\t\t\t<td>☆</td>\r\n");
      out.write("\t\t\t\t<td onclick=\"event()\">お知らせ</td>\r\n");
      out.write("\t\t\t\t<td align=\"center\">∞</td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\r\n");
      out.write("<!-- DB:チャットルーム表参照 -->\r\n");
      out.write("\t\t\t");
for(int i=0; i<list.size(); i++){
				RoomBean room = list.get(i);
			
      out.write("\r\n");
      out.write("\t\t\t\t");
if(room.getUserId().equals(loginUser.getUserId())){
      out.write("\r\n");
      out.write("\t\t\t<tr onClick=\"roomSelect('");
      out.print(room.getRoomId());
      out.write("')\" ");
if(cRoomId.equals(room.getRoomId())){
      out.write("style=\"background:yellow\"");
}
      out.write(">\r\n");
      out.write("\t\t\t\t<td>★</td>\r\n");
      out.write("\t\t\t\t<td>");
      out.print(room.getRoomName());
      out.write("</td>\r\n");
      out.write("\t\t\t\t<td align=\"right\">");
      out.print(room.getCountId() );
      out.write("人</td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t\t");
} else {
      out.write("\r\n");
      out.write("\t\t\t<tr onClick=\"roomSelect('");
      out.print(room.getRoomId());
      out.write("')\" ");
if(cRoomId.equals(room.getRoomId())){
      out.write("style=\"background:yellow\"");
}
      out.write(">\r\n");
      out.write("\t\t\t\t<td>☆</td>\r\n");
      out.write("\t\t\t\t<td>");
      out.print(room.getRoomName());
      out.write("</td>\r\n");
      out.write("\t\t\t\t<td align=\"right\">");
      out.print(room.getCountId() );
      out.write("人</td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t\t");
}
      out.write("\r\n");
      out.write("\t\t\t");
}
      out.write("\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td></td>\r\n");
      out.write("\t\t\t\t<td><input type=\"text\" id=\"newRoomName\" name=\"newRoomName\" placeholder=\"部屋名を入力\" ></td>\r\n");
      out.write("\r\n");
      out.write("<!-- DB:チャットルーム表に格納 -->\r\n");
      out.write("\t\t\t\t<td align=\"center\" ><input type=\"submit\" id=\"createNewRoom\" name=\"createNewRoom\"  value=\"作成\" onClick=\"goMainServlet('1')\"></td>\r\n");
      out.write("<!-- DB:チャットルーム表に格納 -->\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t</table>\r\n");
      out.write("\t</div>\r\n");
      out.write("\r\n");
      out.write("<!-- チャット画面 -->\r\n");
      out.write("\r\n");
      out.write("\t<div id=\"chat\" name=\"chat\" >\r\n");
      out.write("\t\t<div id=\"chatDis\">\r\n");
      out.write("\t\t\t");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "U002Chat.jsp", out, false);
      out.write("\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t<div id=\"chatText\">\r\n");
      out.write("\t\t\t<input type=\"text\" name=\"message\" id=\"message\" size=\"77\">\r\n");
      out.write("\t\t\t");
if(roomCheck == null && (!userPosition.equals("Y00") || !userPosition.equals("Y01") || !userPosition.equals("Y02") || !userPosition.equals("Y03") || !userPosition.equals("Y04"))){ 
      out.write("\r\n");
      out.write("\t\t\t\t<input type=\"submit\" value=\"送信\" name=\"chatGo\" id=\"chatGo\" disabled>\r\n");
      out.write("\t\t\t");
} else {
      out.write("\r\n");
      out.write("\t\t\t\t<input type=\"submit\" value=\"送信\" name=\"chatGo\" id=\"chatGo\" onClick=\"goMainServlet('2')\">\r\n");
      out.write("\t\t\t");
}
      out.write("\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\r\n");
      out.write("\t<div id=\"Calender\">\r\n");
      out.write("\t\t<script type=\"text/javascript\" src=\"calender/calender.js\"></script>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<input type=\"hidden\" id=\"pid\" name=\"pid\" value=\"\">\r\n");
      out.write("</form>\r\n");
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
