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

	// ログインユーザの情報
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
      out.write("\t\t<img src=\"img/logo/logo.png\" height=\"100\" width=\"200\" alt=\"タイトルロゴ\">\r\n");
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
      out.write("\t\t<div id=\"zLogo\"><font size=\"4\">いらっしゃいませ。</font><br/><h3 align=\"right\" >");
      out.print(loginUser.getUserName() );
      out.write(" 　様</h3></div>\r\n");
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
      out.write("\t\t\t\t\t\t<th align=\"center\">年</th>\r\n");
      out.write("\t\t\t\t\t\t<th align=\"center\">月</th>\r\n");
      out.write("\t\t\t\t\t\t<th align=\"center\">経歴</th>\r\n");
      out.write("\t\t\t\t\t</tr>\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<td align=\"center\">平成20年</td>\r\n");
      out.write("\t\t\t\t\t\t<td align=\"center\">4</td>\r\n");
      out.write("\t\t\t\t\t\t<td>□□□株式会社 入社</td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<td align=\"center\"></td>\r\n");
      out.write("\t\t\t\t\t\t<td align=\"center\"></td>\r\n");
      out.write("\t\t\t\t\t\t<td>　東京本社 情報システム開発部に配属</td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<td align=\"center\"></td>\r\n");
      out.write("\t\t\t\t\t\t<td align=\"center\"></td>\r\n");
      out.write("\t\t\t\t\t\t<td>　○○銀行の△△システム開発を担当</td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<td align=\"center\"></td>\r\n");
      out.write("\t\t\t\t\t\t<td align=\"center\"></td>\r\n");
      out.write("\t\t\t\t\t\t<td>　□□□の○○を担当</td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<td align=\"center\">平成23年</td>\r\n");
      out.write("\t\t\t\t\t\t<td align=\"center\">4</td>\r\n");
      out.write("\t\t\t\t\t\t<td>★★リーダーに昇格</td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<td align=\"center\">平成23年</td>\r\n");
      out.write("\t\t\t\t\t\t<td align=\"center\">11</td>\r\n");
      out.write("\t\t\t\t\t\t<td>東京本社 人材開発部へ異動</td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<td align=\"center\"></td>\r\n");
      out.write("\t\t\t\t\t\t<td align=\"center\"></td>\r\n");
      out.write("\t\t\t\t\t\t<td>　新卒採用を担当</td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<td align=\"center\">平成25年</td>\r\n");
      out.write("\t\t\t\t\t\t<td align=\"center\">8</td>\r\n");
      out.write("\t\t\t\t\t\t<td>一身上の都合により退職</td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<td align=\"center\">平成25年</td>\r\n");
      out.write("\t\t\t\t\t\t<td align=\"center\">9</td>\r\n");
      out.write("\t\t\t\t\t\t<td>株式会社よしだこ?ぽれ?しょん 入社</td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<td align=\"center\"></td>\r\n");
      out.write("\t\t\t\t\t\t<td align=\"center\"></td>\r\n");
      out.write("\t\t\t\t\t\t<td>本社 システムエンジニアリング部に配属</td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<td align=\"center\">平成25年</td>\r\n");
      out.write("\t\t\t\t\t\t<td align=\"center\">10</td>\r\n");
      out.write("\t\t\t\t\t\t<td>株式会社○○と共同開発プロジェクト参画</td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<td align=\"center\"></td>\r\n");
      out.write("\t\t\t\t\t\t<td align=\"center\"></td>\r\n");
      out.write("\t\t\t\t\t\t<td>現在に至る</td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t</table>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div id=\"profile_center\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t<table border=\"1\" id=\"profile_table\" width=\"438\" height=\"478\">\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<td rowspan=\"2\" bgcolor=\"#F0B0B0\"><b>ふりがな/名前</b></td>\r\n");
      out.write("\t\t\t\t\t<td colspan=\"3\">ふなばし たろう</td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<td colspan=\"3\"><font size=\"3\">船橋　太郎</font></td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<td bgcolor=\"#F0B0B0\"><b>性別</b></td>\r\n");
      out.write("\t\t\t\t\t<td>男</td>\r\n");
      out.write("\t\t\t\t\t<td bgcolor=\"#F0B0B0\"><b>血液型</b></td>\r\n");
      out.write("\t\t\t\t\t<td>O型</td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<td bgcolor=\"#F0B0B0\"><b>生年月日</b></td>\r\n");
      out.write("\t\t\t\t\t<td colspan=\"2\">1992年9月20日</td>\r\n");
      out.write("\t\t\t\t\t<td>(満　21歳)</td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<td bgcolor=\"#F0B0B0\"><b>連絡先</b></td>\r\n");
      out.write("\t\t\t\t\t<td>090-xxxx-xxxx</td>\r\n");
      out.write("\t\t\t\t\t<td bgcolor=\"#F0B0B0\"><b>e-Mail</b></td>\r\n");
      out.write("\t\t\t\t\t<td>t.funabashi@yc.co.jp</td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<td bgcolor=\"#F0B0B0\"><b>所属部署</b></td>\r\n");
      out.write("\t\t\t\t\t<td>総務部(社員)</td>\r\n");
      out.write("\t\t\t\t\t<td bgcolor=\"#F0B0B0\"><b>在社歴</b></td>\r\n");
      out.write("\t\t\t\t\t<td>1年</td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<td bgcolor=\"#F0B0B0\"><b>言語</b></td>\r\n");
      out.write("\t\t\t\t\t<td colspan=\"3\">日本語, 英語, 中国語</td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<td bgcolor=\"#F0B0B0\"><b>プログラム言語</b></td>\r\n");
      out.write("\t\t\t\t\t<td colspan=\"3\">HTML5, JQuery, Java, Javascript, COBOL, C</td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<td rowspan=\"14\" bgcolor=\"#F0B0B0\"><b>取得資格</b></td>\r\n");
      out.write("\t\t\t\t\t<td colspan=\"3\" bgcolor=\"#FFDEAD\"><b><i>IT Skills - General</i></b></td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<td colspan=\"3\">ITパスポート, 基本情報技術者試験, 応用情報技術者試験</td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<td colspan=\"3\" bgcolor=\"#FFDEAD\"><b><i>IT Skills - Programing</i></b></td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<td colspan=\"3\">Sun Javaプログラミング能力検定</td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<td colspan=\"3\" bgcolor=\"#FFDEAD\"><b><i>IT Skills - Network</i></b></td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<td colspan=\"3\">CISCO技術者認定試験</td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<td colspan=\"3\" bgcolor=\"#FFDEAD\"><b><i>Design Skills</i></b></td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<td colspan=\"3\">UMTP UML モデリング技術者認定試験</td>\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<td colspan=\"3\" bgcolor=\"#FFDEAD\"><b><i>Management Skills</i></b></td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<td colspan=\"3\">プロジェクトマネージャ試験</td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<td colspan=\"3\" bgcolor=\"#FFDEAD\"><b><i>Business Skills</i></b></td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<td colspan=\"3\">ビジネス実務マナー検定, ビジネス文書検定</td>\r\n");
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
      out.write("\t\t\t\t\t◆ ご挨拶<br />\r\n");
      out.write("\t\t\t\t\t2013年9月より、(株)よしだこ ～ぽれ～しょんへ入社致しました。<br />\r\n");
      out.write("\t\t\t\t\t人事の○○さんとは以前より交流があり、<br />\r\n");
      out.write("\t\t\t\t\tこの度の中途採用につきましても多大なるご支援・ご助力を頂きました。<br />\r\n");
      out.write("\t\t\t\t\tこの場を借りて御礼申し上げます。<br />\r\n");
      out.write("\t\t\t\t\t<br />\r\n");
      out.write("\t\t\t\t\t◆ 業務<br />\r\n");
      out.write("\t\t\t\t\t現在は、株式会社○○○との共同開発プロジェクト<br/>\r\n");
      out.write("\t\t\t\t\t「△△△△△△」に取り組んでおります。<br />\r\n");
      out.write("\t\t\t\t\t担当は×××××で、???といった状態で動いております。<br />\r\n");
      out.write("\t\t\t\t\t<br />\r\n");
      out.write("\t\t\t\t\t<br />\r\n");
      out.write("\t\t\t\t\t◆ 趣味<br />\r\n");
      out.write("\t\t\t\t\t週末に社内の有志メンバーで硬式テニスをして、汗を流しています。<br />\r\n");
      out.write("\t\t\t\t\t現在男女合わせて5名(男3/女2)で、毎回全員が来れるとは限らないので、<br />\r\n");
      out.write("\t\t\t\t\t経験者、未経験者問わず参加者をまだまだ募集中です！<br />\r\n");
      out.write("\t\t\t\t\t<br />\r\n");
      out.write("\t\t\t\t\t業務上のご連絡等に限らず、お気軽にメール/TELにてお知らせください。\r\n");
      out.write("\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t</table>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t</div>\r\n");
      out.write("\r\n");
      out.write("\t<div id=\"edit\">\r\n");
      out.write("\t<input type=\"submit\" id=\"editbutton\" value=\"プロフィールを編集する。\" onClick=\"goEditProfileServlet();\">\r\n");
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
