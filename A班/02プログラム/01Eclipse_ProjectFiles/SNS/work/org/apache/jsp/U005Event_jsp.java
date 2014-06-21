package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.ArrayList;
import jp.ac.fjb.sns.bean.UserBean;
import jp.ac.fjb.sns.bean.EventBean;
import jp.ac.fjb.sns.bean.ScheduleBean;

public final class U005Event_jsp extends org.apache.jasper.runtime.HttpJspBase
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

	//ログインユーザの情報
	UserBean loginUser = (UserBean)session.getAttribute("LOGIN_USER");
	String userPosition = (String)loginUser.getPositionId();

	ArrayList<EventBean> list = (ArrayList)session.getAttribute("EVENT_LIST");

	ArrayList<ScheduleBean> list2 = (ArrayList)session.getAttribute("SCHEDULE_LIST");

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\">\r\n");
      out.write("\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\"/>\r\n");
      out.write("<link rel=\"StyleSheet\" type=\"text/css\" href=\"css/event.css\"/>\r\n");
      out.write("<link rel=\"StyleSheet\" type=\"text/css\" href=\"css/calender.css\"/>\r\n");
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
      out.write("<li style=\"float:right\"><input type=\"submit\"  id=\"Button\" style=\"WIDTH: 70px; HEIGHT: 30px\" value=\"LogOut\"  onClick=\"goMainServlet('-1');\"></li>\r\n");
      out.write("<li style=\"float:right\"><input type=\"submit\"  id=\"Button\" style=\"WIDTH: 70px; HEIGHT: 30px\" value=\"Profile\" onClick=\"goProfileServlet();\"></li>\r\n");
      out.write("<li style=\"float:right\"><input type=\"submit\"  id=\"Button\" style=\"WIDTH: 70px; HEIGHT: 30px\" value=\"Help\"  disabled></li>\r\n");
      out.write("<li style=\"float:right\"><input type=\"submit\"  id=\"Button\" style=\"WIDTH: 70px; HEIGHT: 30px\" value=\"Home\" onClick=\"goMainServlet();\"></li>\r\n");
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
      out.write("<input type=\"submit\" id=\"Button\" style=\"WIDTH: 395px; HEIGHT: 100px\" value=\"ユーザー検索\" onClick=\"goSearchServlet('0');\">\r\n");
      out.write("<input type=\"submit\" id=\"Button\" style=\"WIDTH: 395px; HEIGHT: 100px\" value=\"アドバイス\" onClick=\"goAdviceServlet();\">\r\n");
      out.write("<input type=\"submit\" id=\"Button\" style=\"WIDTH: 395px; HEIGHT: 100px\" value=\"イベントカレンダースケジュール\" disabled>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<div id=\"content\">\r\n");
      out.write("\t<div id=\"event_left\">\r\n");
      out.write("\t\t<script type=\"text/javascript\" src=\"calender/calender.js\"></script>\r\n");
      out.write("\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t<div id=\"event_right\">\r\n");
      out.write("\t\t<div id=\"event_add\">\r\n");
      out.write("\t\t\t<select id=\"starthours\"name=\"starthours\">\r\n");
      out.write("\t\t\t");
 for(int i=6;i<27;i++){
      out.write("\r\n");
      out.write("\t\t\t\t\t<option>");
      out.print( i );
      out.write("</option>\r\n");
      out.write("\t\t\t\t");
 } 
      out.write("\r\n");
      out.write("\t\t\t</select>時\r\n");
      out.write("\t\t\t<select id=\"startminutes\"name=\"startminutes\">\r\n");
      out.write("\t\t\t");
 for(int i=0;i<56;i=i+15){
      out.write("\r\n");
      out.write("\t\t\t\t\t<option>");
      out.print( i );
      out.write("</option>\r\n");
      out.write("\t\t\t\t");
 } 
      out.write("\r\n");
      out.write("\t\t\t</select>分 -\r\n");
      out.write("\t\t\t<select id=\"endhours\"name=\"endhours\">\r\n");
      out.write("\t\t\t");
 for(int i=6;i<27;i++){
      out.write("\r\n");
      out.write("\t\t\t\t\t<option>");
      out.print( i );
      out.write("</option>\r\n");
      out.write("\t\t\t\t");
 } 
      out.write("\r\n");
      out.write("\t\t\t</select>時\r\n");
      out.write("\t\t\t<select id=\"endminutes\"name=\"endminutes\">\r\n");
      out.write("\t\t\t");
 for(int i=0;i<56;i=i+15){
      out.write("\r\n");
      out.write("\t\t\t\t\t<option>");
      out.print( i );
      out.write("</option>\r\n");
      out.write("\t\t\t\t");
 } 
      out.write("\r\n");
      out.write("\t\t\t</select>分迄\r\n");
      out.write("\t\t\t<input type=\"text\" id=\"newevent\" name=\"newevent\">\r\n");
      out.write("\t\t\t<input type=\"button\" id=\"neweventadd\" name=\"neweventadd\" value=\"追加\" >\r\n");
      out.write("\t\t\t<input type=\"submit\" id=\"reroad\" name=\"reroad\" value=\"更新\">\r\n");
      out.write("\t\t\t<input type=\"submit\" id=\"crear\" name=\"crear\" value=\"削除\">\r\n");
      out.write("\t\t\t<input type=\"hidden\" name=\"pid\" id=\"pid\">\r\n");
      out.write("\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t<table border=\"1\" width=\"330\" bgcolor=\"white\">\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<th colspan=\"3\">　今日('14/01/24)　金曜日</th>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<th width=\"60\"align=\"center\" valign=\"top\">時間</th>\r\n");
      out.write("\t\t\t\t<th width=\"135\"align=\"center\" valign=\"top\"><font size=\"2\">個人スケジュール&nbsp;</font></th>\r\n");
      out.write("\t\t\t\t<th width=\"135\"align=\"center\" valign=\"top\"><font size=\"2\">社内イベント</font></th>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t</table>\r\n");
      out.write("\r\n");
      out.write("\t\t<div id=\"schedule\">\r\n");
      out.write("\t\t<table border=\"1\" width=\"330\" bgcolor=\"white\">\r\n");
      out.write("\t\t\t");
 int hour = 6;
			for(int i=0;i<84;i++){ 
      out.write("\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t");
 if(0==i%4){ 
      out.write("\r\n");
      out.write("\t\t\t\t<td align=\"right\" valign=\"top\" width=\"60\"rowspan=\"4\" width=\"60\" height=\"160\" bgcolor=\"#B0C4DE\">");
      out.print( hour++ );
      out.write(":00</td>\r\n");
      out.write("\t\t\t\t");
 } 
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t");
	boolean flg = false;
								for(int z=0; z<list2.size(); z++){
									ScheduleBean schedul = list2.get(z);

									if(schedul.getTimeCount()<=i && i<=schedul.getEndTime()){
										flg = true;
									}
								}

								if (flg) { 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<td align=\"left\" valign=\"top\" width=\"135\"height=\"40\"bgcolor=\"#afeeee\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t");
	for(int z=0; z<list2.size(); z++){
										ScheduleBean schedul = list2.get(z); 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t");
if(i==schedul.getTimeCount()){
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t");
      out.print( schedul.getTmpTitle() );
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t");
 } 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t");
 } 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t");
 } else { 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<td align=\"left\" valign=\"top\" width=\"135\"height=\"40\"></td>\r\n");
      out.write("\t\t\t\t\t\t\t");
 } 
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t");
	boolean flg2 = false;
								for(int z=0; z<list.size(); z++){
									EventBean event = list.get(z);

									if(event.getTimeCount()<=i && i<=event.getEndTime()){
										flg2 = true;
									}
								}

								if (flg2) { 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<td align=\"left\" valign=\"top\" width=\"135\"height=\"40\"bgcolor=\"#f0e68c\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t");
	for(int z=0; z<list.size(); z++){
											EventBean event = list.get(z); 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t");
if(i==event.getTimeCount()){
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t");
      out.print( event.getTempTitle() );
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t");
 } 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t");
 } 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t");
 } else { 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<td align=\"left\" valign=\"top\" width=\"135\"height=\"40\"></td>\r\n");
      out.write("\t\t\t\t\t\t\t");
 } 
      out.write("\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t");
 } 
      out.write("\r\n");
      out.write("\t\t</table>\r\n");
      out.write("\t</div>\r\n");
      out.write("\r\n");
      out.write("\t<div id=\"schedule_syousai\">\r\n");
      out.write("\t\t<table border=\"1\" width=\"276\">\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<th>時間</th>\r\n");
      out.write("\t\t\t\t<td>10:00 - 12:00</td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<th>題名</th>\r\n");
      out.write("\t\t\t\t<td>プロジェクトチーム会議</td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<th>内容</th>\r\n");
      out.write("\t\t\t\t<td height=\"305\"><textarea cols=\"25\" rows=\"17\" placeholder=\"件の製品企画案について．．．\"></textarea></td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t</table>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("</form>\r\n");
      out.write("\r\n");
      out.write("<!-- <div id=\"content\">\r\n");
      out.write("\t<div id=\"event_left\">\r\n");
      out.write("\t\t<script type=\"text/javascript\" src=\"calender/calender.js\"></script>\r\n");
      out.write("\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t<div id=\"event_right\">\r\n");
      out.write("\t\t<div id=\"event_add\">\r\n");
      out.write("\t\t\t<select id=\"starthours\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<option>6</option>\r\n");
      out.write("\t\t\t\t<option>7</option>\r\n");
      out.write("\t\t\t\t<option>8</option>\r\n");
      out.write("\t\t\t\t<option>9</option>\r\n");
      out.write("\t\t\t\t<option>10</option>\r\n");
      out.write("\t\t\t\t<option>11</option>\r\n");
      out.write("\t\t\t\t<option>12</option>\r\n");
      out.write("\t\t\t\t<option>13</option>\r\n");
      out.write("\t\t\t\t<option>14</option>\r\n");
      out.write("\t\t\t\t<option>15</option>\r\n");
      out.write("\t\t\t\t<option>16</option>\r\n");
      out.write("\t\t\t\t<option>17</option>\r\n");
      out.write("\t\t\t\t<option>18</option>\r\n");
      out.write("\t\t\t\t<option>19</option>\r\n");
      out.write("\t\t\t\t<option>20</option>\r\n");
      out.write("\t\t\t\t<option>21</option>\r\n");
      out.write("\t\t\t\t<option>22</option>\r\n");
      out.write("\t\t\t\t<option>23</option>\r\n");
      out.write("\t\t\t\t<option>24</option>\r\n");
      out.write("\t\t\t\t<option>25</option>\r\n");
      out.write("\t\t\t\t<option>26</option>\r\n");
      out.write("\t\t\t</select>時\r\n");
      out.write("\t\t\t<select id=\"startminutes\">\r\n");
      out.write("\t\t\t\t<option>00</option>\r\n");
      out.write("\t\t\t\t<option>10</option>\r\n");
      out.write("\t\t\t\t<option>20</option>\r\n");
      out.write("\t\t\t\t<option>30</option>\r\n");
      out.write("\t\t\t\t<option>40</option>\r\n");
      out.write("\t\t\t\t<option>50</option>\r\n");
      out.write("\t\t\t</select>分 -\r\n");
      out.write("\t\t\t<select id=\"endhours\">\r\n");
      out.write("\t\t\t\t<option>6</option>\r\n");
      out.write("\t\t\t\t<option>7</option>\r\n");
      out.write("\t\t\t\t<option>8</option>\r\n");
      out.write("\t\t\t\t<option>9</option>\r\n");
      out.write("\t\t\t\t<option>10</option>\r\n");
      out.write("\t\t\t\t<option>11</option>\r\n");
      out.write("\t\t\t\t<option>12</option>\r\n");
      out.write("\t\t\t\t<option>13</option>\r\n");
      out.write("\t\t\t\t<option>14</option>\r\n");
      out.write("\t\t\t\t<option>15</option>\r\n");
      out.write("\t\t\t\t<option>16</option>\r\n");
      out.write("\t\t\t\t<option>17</option>\r\n");
      out.write("\t\t\t\t<option>18</option>\r\n");
      out.write("\t\t\t\t<option>19</option>\r\n");
      out.write("\t\t\t\t<option>20</option>\r\n");
      out.write("\t\t\t\t<option>21</option>\r\n");
      out.write("\t\t\t\t<option>22</option>\r\n");
      out.write("\t\t\t\t<option>23</option>\r\n");
      out.write("\t\t\t\t<option>24</option>\r\n");
      out.write("\t\t\t\t<option>25</option>\r\n");
      out.write("\t\t\t\t<option>26</option>\r\n");
      out.write("\t\t\t</select>時\r\n");
      out.write("\t\t\t<select id=\"endminutes\">\r\n");
      out.write("\t\t\t\t<option>00</option>\r\n");
      out.write("\t\t\t\t<option>10</option>\r\n");
      out.write("\t\t\t\t<option>20</option>\r\n");
      out.write("\t\t\t\t<option>30</option>\r\n");
      out.write("\t\t\t\t<option>40</option>\r\n");
      out.write("\t\t\t\t<option>50</option>\r\n");
      out.write("\t\t\t</select>分迄\r\n");
      out.write("\t\t\t<input type=\"text\" id=\"newevent\"><input type=\"submit\" id=\"neweventadd\" value=\"追加\">\r\n");
      out.write("\t\t\t<input type=\"submit\" id=\"reroad\" value=\"更新\">\r\n");
      out.write("\t\t\t<input type=\"submit\" id=\"crear\" value=\"削除\">\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t<div id=\"schedule\">\r\n");
      out.write("\t\t<table border=\"1\" width=\"330\" bgcolor=\"white\">\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<th colspan=\"3\">　今日('14/01/24)　金曜日</th>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<th align=\"center\" valign=\"top\">時間</th>\r\n");
      out.write("\t\t\t\t<th align=\"center\" valign=\"top\"><font size=\"2\">個人スケジュール</font></th>\r\n");
      out.write("\t\t\t\t<th width=\"135\"align=\"center\" valign=\"top\"><font size=\"2\">社内イベント</font></th>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td align=\"right\" valign=\"top\" rowspan=\"4\" width=\"60\" height=\"160\" bgcolor=\"#B0C4DE\">6:00</td>\r\n");
      out.write("\t\t\t\t<td align=\"left\" valign=\"top\" height=\"40\"></td>\r\n");
      out.write("\t\t\t\t<td align=\"left\" valign=\"top\" height=\"40\"></td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td align=\"left\" valign=\"top\" height=\"40\"></td>\r\n");
      out.write("\t\t\t\t<td align=\"left\" valign=\"top\" height=\"40\"></td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td align=\"left\" valign=\"top\" height=\"40\"></td>\r\n");
      out.write("\t\t\t\t<td align=\"left\" valign=\"top\" height=\"40\"></td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td align=\"left\" valign=\"top\" height=\"40\"></td>\r\n");
      out.write("\t\t\t\t<td align=\"left\" valign=\"top\" height=\"40\"></td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td align=\"right\" valign=\"top\" rowspan=\"4\" height=\"160\" bgcolor=\"#B0C4DE\">7:00</td>\r\n");
      out.write("\t\t\t\t<td align=\"left\" valign=\"top\" height=\"40\"></td>\r\n");
      out.write("\t\t\t\t<td align=\"left\" valign=\"top\" height=\"40\"></td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td align=\"left\" valign=\"top\" height=\"40\"></td>\r\n");
      out.write("\t\t\t\t<td align=\"left\" valign=\"top\" height=\"40\"></td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td align=\"left\" valign=\"top\" height=\"40\"></td>\r\n");
      out.write("\t\t\t\t<td align=\"left\" valign=\"top\" height=\"40\"></td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td align=\"left\" valign=\"top\" height=\"40\"></td>\r\n");
      out.write("\t\t\t\t<td align=\"left\" valign=\"top\" height=\"40\"></td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td align=\"right\" valign=\"top\" rowspan=\"4\" width=\"60\" height=\"160\" bgcolor=\"#B0C4DE\">8:00</td>\r\n");
      out.write("\t\t\t\t<td align=\"left\" valign=\"top\" height=\"40\"></td>\r\n");
      out.write("\t\t\t\t<td align=\"left\" valign=\"top\" height=\"40\"></td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td align=\"left\" valign=\"top\" height=\"40\"></td>\r\n");
      out.write("\t\t\t\t<td align=\"left\" valign=\"top\" height=\"40\"></td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td align=\"left\" valign=\"top\" height=\"40\"></td>\r\n");
      out.write("\t\t\t\t<td align=\"left\" valign=\"top\" height=\"40\"></td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td align=\"left\" valign=\"top\" height=\"40\"></td>\r\n");
      out.write("\t\t\t\t<td align=\"left\" valign=\"top\" height=\"40\"></td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td align=\"right\" valign=\"top\" rowspan=\"4\" width=\"60\" height=\"160\" bgcolor=\"#B0C4DE\">9:00</td>\r\n");
      out.write("\t\t\t\t<td align=\"left\" valign=\"top\" height=\"40\"></td>\r\n");
      out.write("\t\t\t\t<td align=\"left\" valign=\"top\" height=\"40\"></td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td align=\"left\" valign=\"top\" height=\"40\"></td>\r\n");
      out.write("\t\t\t\t<td align=\"left\" valign=\"top\" height=\"40\"></td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td align=\"left\" valign=\"top\" rowspan=\"30\" width=\"135\" bgcolor=\"#98FB98\">9:30-17:00<br /><font size=\"2\">会社</font></td>\r\n");
      out.write("\t\t\t\t<td align=\"left\" valign=\"top\" height=\"40\" width=\"135\" bgcolor=\"pink\">9:30-9:45<br /><font size=\"2\">朝礼</font></td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td align=\"left\" valign=\"top\" height=\"40\"></td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td align=\"right\" valign=\"top\" rowspan=\"4\" width=\"60\" height=\"160\" bgcolor=\"#B0C4DE\">10:00</td>\r\n");
      out.write("\t\t\t\t<td align=\"left\" valign=\"top\" rowspan=\"8\" width=\"135\" bgcolor=\"pink\">10:00-12:00<br /><font size=\"2\">プロジェクトチーム会議</font></td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td align=\"right\" valign=\"top\" rowspan=\"4\" width=\"60\" height=\"160\" bgcolor=\"#B0C4DE\">11:00</td>\r\n");
      out.write("\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td align=\"right\" valign=\"top\" rowspan=\"4\" width=\"60\" height=\"160\" bgcolor=\"#B0C4DE\">12:00</td>\r\n");
      out.write("\t\t\t\t<td align=\"left\" valign=\"top\" height=\"40\"></td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td align=\"left\" valign=\"top\" height=\"40\"></td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td align=\"left\" valign=\"top\" height=\"40\"></td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td align=\"left\" valign=\"top\" height=\"40\"></td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td align=\"right\" valign=\"top\" rowspan=\"4\" width=\"60\" height=\"160\" bgcolor=\"#B0C4DE\">13:00</td>\r\n");
      out.write("\t\t\t\t<td align=\"left\" valign=\"top\" height=\"40\"></td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td align=\"left\" valign=\"top\" height=\"40\"></td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td align=\"left\" valign=\"top\" height=\"40\"></td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td align=\"left\" valign=\"top\" height=\"40\"></td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td align=\"right\" valign=\"top\" rowspan=\"4\" width=\"60\" height=\"160\" bgcolor=\"#B0C4DE\">14:00</td>\r\n");
      out.write("\t\t\t\t<td align=\"left\" valign=\"top\" height=\"40\"></td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td align=\"left\" valign=\"top\" height=\"40\"></td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td align=\"left\" valign=\"top\" height=\"40\"></td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td align=\"left\" valign=\"top\" height=\"40\"></td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td align=\"right\" valign=\"top\" rowspan=\"4\" width=\"60\" height=\"160\" bgcolor=\"#B0C4DE\">15:00</td>\r\n");
      out.write("\t\t\t\t<td align=\"left\" valign=\"top\" height=\"40\"></td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td align=\"left\" valign=\"top\" height=\"40\"></td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td align=\"left\" valign=\"top\" height=\"40\"></td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td align=\"left\" valign=\"top\" height=\"40\"></td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td align=\"right\" valign=\"top\" rowspan=\"4\" width=\"60\" height=\"160\" bgcolor=\"#B0C4DE\">16:00</td>\r\n");
      out.write("\t\t\t\t<td align=\"left\" valign=\"top\" height=\"40\"></td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td align=\"left\" valign=\"top\" height=\"40\"></td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td align=\"left\" valign=\"top\" height=\"40\"></td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td align=\"left\" valign=\"top\" height=\"40\"></td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td align=\"right\" valign=\"top\" rowspan=\"4\" height=\"160\" bgcolor=\"#B0C4DE\">17:00</td>\r\n");
      out.write("\t\t\t\t<td align=\"left\" valign=\"top\" height=\"40\"></td>\r\n");
      out.write("\t\t\t\t<td align=\"left\" valign=\"top\" height=\"40\"></td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td align=\"left\" valign=\"top\" height=\"40\"></td>\r\n");
      out.write("\t\t\t\t<td align=\"left\" valign=\"top\" height=\"40\"></td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td align=\"left\" valign=\"top\" height=\"40\"></td>\r\n");
      out.write("\t\t\t\t<td align=\"left\" valign=\"top\" height=\"40\"></td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td align=\"left\" valign=\"top\" height=\"40\"></td>\r\n");
      out.write("\t\t\t\t<td align=\"left\" valign=\"top\" height=\"40\"></td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td align=\"right\" valign=\"top\" rowspan=\"4\" height=\"160\" bgcolor=\"#B0C4DE\">18:00</td>\r\n");
      out.write("\t\t\t\t<td align=\"left\" valign=\"top\" height=\"40\"></td>\r\n");
      out.write("\t\t\t\t<td align=\"left\" valign=\"top\" height=\"40\"></td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td align=\"left\" valign=\"top\" height=\"40\"></td>\r\n");
      out.write("\t\t\t\t<td align=\"left\" valign=\"top\" height=\"40\"></td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td align=\"left\" valign=\"top\" height=\"40\"></td>\r\n");
      out.write("\t\t\t\t<td align=\"left\" valign=\"top\" rowspan=\"8\" bgcolor=\"pink\">18:30-20:30<br /><font size=\"2\">定例会</font></td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td align=\"left\" valign=\"top\" height=\"40\"></td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td align=\"right\" valign=\"top\" rowspan=\"4\" height=\"160\" bgcolor=\"#B0C4DE\">19:00</td>\r\n");
      out.write("\t\t\t\t<td align=\"left\" valign=\"top\" height=\"40\"></td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td align=\"left\" valign=\"top\" height=\"40\"></td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td align=\"left\" valign=\"top\" height=\"40\"></td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td align=\"left\" valign=\"top\" height=\"40\"></td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td align=\"right\" valign=\"top\" rowspan=\"4\" height=\"160\" bgcolor=\"#B0C4DE\">20:00</td>\r\n");
      out.write("\t\t\t\t<td align=\"left\" valign=\"top\" height=\"40\"></td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td align=\"left\" valign=\"top\" height=\"40\"></td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td align=\"left\" valign=\"top\" height=\"40\"></td>\r\n");
      out.write("\t\t\t\t<td align=\"left\" valign=\"top\" height=\"40\"></td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td align=\"left\" valign=\"top\" height=\"40\"></td>\r\n");
      out.write("\t\t\t\t<td align=\"left\" valign=\"top\" height=\"40\"></td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td align=\"right\" valign=\"top\" rowspan=\"4\" height=\"160\" bgcolor=\"#B0C4DE\">21:00</td>\r\n");
      out.write("\t\t\t\t<td align=\"left\" valign=\"top\" height=\"40\"></td>\r\n");
      out.write("\t\t\t\t<td align=\"left\" valign=\"top\" height=\"40\"></td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td align=\"left\" valign=\"top\" height=\"40\"></td>\r\n");
      out.write("\t\t\t\t<td align=\"left\" valign=\"top\" height=\"40\"></td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td align=\"left\" valign=\"top\" height=\"40\"></td>\r\n");
      out.write("\t\t\t\t<td align=\"left\" valign=\"top\" height=\"40\"></td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td align=\"left\" valign=\"top\" height=\"40\"></td>\r\n");
      out.write("\t\t\t\t<td align=\"left\" valign=\"top\" height=\"40\"></td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td align=\"right\" valign=\"top\" rowspan=\"4\" height=\"160\" bgcolor=\"#B0C4DE\">22:00</td>\r\n");
      out.write("\t\t\t\t<td align=\"left\" valign=\"top\" height=\"40\"></td>\r\n");
      out.write("\t\t\t\t<td align=\"left\" valign=\"top\" height=\"40\"></td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td align=\"left\" valign=\"top\" height=\"40\"></td>\r\n");
      out.write("\t\t\t\t<td align=\"left\" valign=\"top\" height=\"40\"></td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td align=\"left\" valign=\"top\" height=\"40\"></td>\r\n");
      out.write("\t\t\t\t<td align=\"left\" valign=\"top\" height=\"40\"></td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td align=\"left\" valign=\"top\" height=\"40\"></td>\r\n");
      out.write("\t\t\t\t<td align=\"left\" valign=\"top\" height=\"40\"></td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td align=\"right\" valign=\"top\" rowspan=\"4\" height=\"160\" bgcolor=\"#B0C4DE\">23:00</td>\r\n");
      out.write("\t\t\t\t<td align=\"left\" valign=\"top\" height=\"40\"></td>\r\n");
      out.write("\t\t\t\t<td align=\"left\" valign=\"top\" height=\"40\"></td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td align=\"left\" valign=\"top\" height=\"40\"></td>\r\n");
      out.write("\t\t\t\t<td align=\"left\" valign=\"top\" height=\"40\"></td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td align=\"left\" valign=\"top\" height=\"40\"></td>\r\n");
      out.write("\t\t\t\t<td align=\"left\" valign=\"top\" height=\"40\"></td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td align=\"left\" valign=\"top\" height=\"40\"></td>\r\n");
      out.write("\t\t\t\t<td align=\"left\" valign=\"top\" height=\"40\"></td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td align=\"right\" valign=\"top\" rowspan=\"4\" height=\"160\" bgcolor=\"#B0C4DE\">24:00</td>\r\n");
      out.write("\t\t\t\t<td align=\"left\" valign=\"top\" height=\"40\"></td>\r\n");
      out.write("\t\t\t\t<td align=\"left\" valign=\"top\" height=\"40\"></td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td align=\"left\" valign=\"top\" height=\"40\"></td>\r\n");
      out.write("\t\t\t\t<td align=\"left\" valign=\"top\" height=\"40\"></td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td align=\"left\" valign=\"top\" height=\"40\"></td>\r\n");
      out.write("\t\t\t\t<td align=\"left\" valign=\"top\" height=\"40\"></td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td align=\"left\" valign=\"top\" height=\"40\"></td>\r\n");
      out.write("\t\t\t\t<td align=\"left\" valign=\"top\" height=\"40\"></td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td align=\"right\" valign=\"top\" rowspan=\"4\" height=\"160\" bgcolor=\"#B0C4DE\">25:00</td>\r\n");
      out.write("\t\t\t\t<td align=\"left\" valign=\"top\" height=\"40\"></td>\r\n");
      out.write("\t\t\t\t<td align=\"left\" valign=\"top\" height=\"40\"></td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td align=\"left\" valign=\"top\" height=\"40\"></td>\r\n");
      out.write("\t\t\t\t<td align=\"left\" valign=\"top\" height=\"40\"></td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td align=\"left\" valign=\"top\" height=\"40\"></td>\r\n");
      out.write("\t\t\t\t<td align=\"left\" valign=\"top\" height=\"40\"></td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td align=\"left\" valign=\"top\" height=\"40\"></td>\r\n");
      out.write("\t\t\t\t<td align=\"left\" valign=\"top\" height=\"40\"></td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td align=\"right\" valign=\"top\" rowspan=\"4\" height=\"160\" bgcolor=\"#B0C4DE\">26:00</td>\r\n");
      out.write("\t\t\t\t<td align=\"left\" valign=\"top\" height=\"40\"></td>\r\n");
      out.write("\t\t\t\t<td align=\"left\" valign=\"top\" height=\"40\"></td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td align=\"left\" valign=\"top\" height=\"40\"></td>\r\n");
      out.write("\t\t\t\t<td align=\"left\" valign=\"top\" height=\"40\"></td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td align=\"left\" valign=\"top\" height=\"40\"></td>\r\n");
      out.write("\t\t\t\t<td align=\"left\" valign=\"top\" height=\"40\"></td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td align=\"left\" valign=\"top\" height=\"40\"></td>\r\n");
      out.write("\t\t\t\t<td align=\"left\" valign=\"top\" height=\"40\"></td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t</table>\r\n");
      out.write("\t</div>\r\n");
      out.write("\r\n");
      out.write("\t<div id=\"schedule_syousai\">\r\n");
      out.write("\t\t<table border=\"1\" width=\"276\">\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<th>時間</th>\r\n");
      out.write("\t\t\t\t<td>10:00 - 12:00</td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<th>題名</th>\r\n");
      out.write("\t\t\t\t<td>プロジェクトチーム会議</td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<th>内容</th>\r\n");
      out.write("\t\t\t\t<td height=\"305\"><textarea cols=\"25\" rows=\"17\" placeholder=\"件の製品企画案について．．．\"></textarea></td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t</table>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("</form> -->\r\n");
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
