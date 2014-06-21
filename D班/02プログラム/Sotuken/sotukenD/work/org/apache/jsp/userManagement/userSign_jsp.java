package org.apache.jsp.userManagement;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import jp.ac.fjb.sotukenD.bean.UserSignBean;
import jp.ac.fjb.sotukenD.bean.LoginFormBeans;

public final class userSign_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\r\n");
      out.write("\r\n");

	LoginFormBeans loginBean = (LoginFormBeans) session
			.getAttribute("LOGIN_USER");

      out.write('\r');
      out.write('\n');

	UserSignBean menteUser = (UserSignBean) session
			.getAttribute("SIGN_USER");

      out.write("\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("function FormCheck() {\r\n");
      out.write("\r\n");
      out.write("\t// 未入力チェック\r\n");
      out.write("\tvar val = document.getElementsByName(\"idS\")[0];\r\n");
      out.write("\tif ( jsLTrim( val.value ).length == 0 ) {\r\n");
      out.write("\t\talert( \"入力されていない項目があります\");\r\n");
      out.write("\t\tval.focus();\r\n");
      out.write("\t\treturn false;\r\n");
      out.write("\t}\r\n");
      out.write("\t// 入力値チェック\r\n");
      out.write("\tif ( !val.value.match( /[0-9]/) ) {\r\n");
      out.write("\t\talert( \"入力値が間違っています\");\r\n");
      out.write("\t\tval.focus();\r\n");
      out.write("\t\treturn false;\r\n");
      out.write("\t}\r\n");
      out.write("\t// 未入力チェック\r\n");
      out.write("\tvar val = document.getElementsByName(\"passS\")[0];\r\n");
      out.write("\tif ( jsTrim( val.value ).length == 0 ) {\r\n");
      out.write("\t\talert( \"入力されていない項目があります\" );\r\n");
      out.write("\t\tval.focus();\r\n");
      out.write("\t\treturn false;\r\n");
      out.write("\t}\r\n");
      out.write("\t// 入力値チェック\r\n");
      out.write("\tvar val = document.getElementsByName(\"passS\")[0];\r\n");
      out.write("\tif ( !val.value.match( /^([a-z0-9])/ ) ) {\r\n");
      out.write("\t\talert( \"入力値が間違っています\" );\r\n");
      out.write("\t\tval.focus();\r\n");
      out.write("\t\treturn false;\r\n");
      out.write("\t}\r\n");
      out.write("\t// 未入力チェック\r\n");
      out.write("\tvar val = document.getElementsByName(\"nameS\")[0];\r\n");
      out.write("\tif ( jsTrim( val.value ).length == 0 ) {\r\n");
      out.write("\t\talert( \"入力されていない項目があります\" );\r\n");
      out.write("\t\tval.focus();\r\n");
      out.write("\t\treturn false;\r\n");
      out.write("\t}\r\n");
      out.write("\tvar val = document.getElementsByName(\"huriS\")[0];\r\n");
      out.write("\tif ( jsTrim( val.value ).length == 0 ) {\r\n");
      out.write("\t\talert( \"入力されていない項目があります\" );\r\n");
      out.write("\t\tval.focus();\r\n");
      out.write("\t\treturn false;\r\n");
      out.write("\t}\r\n");
      out.write("\t// 入力値チェック\r\n");
      out.write("\tvar val = document.getElementsByName(\"huriS\")[0];\r\n");
      out.write("\tif ( !val.value.match(/^[ァ-ン\\s]*$/) ) {\r\n");
      out.write("\t\talert( \"入力値が間違っています\" );\r\n");
      out.write("\t\tval.focus();\r\n");
      out.write("\t\treturn false;\r\n");
      out.write("\t}\r\n");
      out.write("\tvar val = document.getElementsByName(\"yyS\")[0];\r\n");
      out.write("\tif ( jsTrim( val.value ).length == 0 ) {\r\n");
      out.write("\t\talert( \"入力されていない項目があります\" );\r\n");
      out.write("\t\tval.focus();\r\n");
      out.write("\t\treturn false;\r\n");
      out.write("\t}\r\n");
      out.write("\tvar val = document.getElementsByName(\"yyS\")[0];\r\n");
      out.write("\tif ( !val.value.match( /^([0-9])/ ) ) {\r\n");
      out.write("\t\talert( \"入力値が間違っています\" );\r\n");
      out.write("\t\tval.focus();\r\n");
      out.write("\t\treturn false;\r\n");
      out.write("\t}\r\n");
      out.write("\tvar val = document.getElementsByName(\"mmS\")[0];\r\n");
      out.write("\tif ( jsTrim( val.value ).length == 0 ) {\r\n");
      out.write("\t\talert( \"入力されていない項目があります\" );\r\n");
      out.write("\t\tval.focus();\r\n");
      out.write("\t\treturn false;\r\n");
      out.write("\t}\r\n");
      out.write("\tvar val = document.getElementsByName(\"mmS\")[0];\r\n");
      out.write("\tif ( !val.value.match( /^([0-9])/ ) ) {\r\n");
      out.write("\t\talert( \"入力値が間違っています\" );\r\n");
      out.write("\t\tval.focus();\r\n");
      out.write("\t\treturn false;\r\n");
      out.write("\t}\r\n");
      out.write("\tvar val = document.getElementsByName(\"ddS\")[0];\r\n");
      out.write("\tif ( jsTrim( val.value ).length == 0 ) {\r\n");
      out.write("\t\talert( \"入力されていない項目があります\" );\r\n");
      out.write("\t\tval.focus();\r\n");
      out.write("\t\treturn false;\r\n");
      out.write("\t}\r\n");
      out.write("\tvar val = document.getElementsByName(\"ddS\")[0];\r\n");
      out.write("\tif ( !val.value.match( /^([0-9])/ ) ) {\r\n");
      out.write("\t\talert( \"入力値が間違っています\" );\r\n");
      out.write("\t\tval.focus();\r\n");
      out.write("\t\treturn false;\r\n");
      out.write("\t}\r\n");
      out.write("\tvar val = document.getElementsByName(\"homeS\")[0];\r\n");
      out.write("\tif ( jsTrim( val.value ).length == 0 ) {\r\n");
      out.write("\t\talert( \"入力されていない項目があります\" );\r\n");
      out.write("\t\tval.focus();\r\n");
      out.write("\t\treturn false;\r\n");
      out.write("\t}\r\n");
      out.write("\tvar val = document.getElementsByName(\"tellS\")[0];\r\n");
      out.write("\tif ( jsTrim( val.value ).length == 0 ) {\r\n");
      out.write("\t\talert( \"入力されていない項目があります\" );\r\n");
      out.write("\t\tval.focus();\r\n");
      out.write("\t\treturn false;\r\n");
      out.write("\t}\r\n");
      out.write("\tvar val = document.getElementsByName(\"tellS\")[0];\r\n");
      out.write("\tif ( !val.value.match( /^0[0-9]{1,2}-[0-9]{4,5}-[0-9]{4}$/ ) ) {\r\n");
      out.write("\t\talert( \"入力値が間違っています\" );\r\n");
      out.write("\t\tval.focus();\r\n");
      out.write("\t\treturn false;\r\n");
      out.write("\t}\r\n");
      out.write("\tvar val = document.getElementsByName(\"mailS\")[0];\r\n");
      out.write("\tif ( jsTrim( val.value ).length == 0 ) {\r\n");
      out.write("\t\talert( \"入力されていない項目があります\" );\r\n");
      out.write("\t\tval.focus();\r\n");
      out.write("\t\treturn false;\r\n");
      out.write("\t}\r\n");
      out.write("\tvar val = document.getElementsByName(\"mailS\")[0];\r\n");
      out.write("\tif ( !val.value.match( /^([a-z0-9_\\.\\-])+@([a-z0-9_\\.\\-])+/ ) ) {\r\n");
      out.write("\t\talert( \"入力値が間違っています\" );\r\n");
      out.write("\t\tval.focus();\r\n");
      out.write("\t\treturn false;\r\n");
      out.write("\t}\r\n");
      out.write("\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("//前後スペース削除(全角半角対応)\r\n");
      out.write("function jsTrim( val ) {\r\n");
      out.write("\r\n");
      out.write("\tvar ret = val;\r\n");
      out.write("\r\n");
      out.write("\tret = ret.replace( /^[\\s]*/, \"\" );\r\n");
      out.write("\tret = ret.replace( /[\\s]*$/, \"\" );\r\n");
      out.write("\r\n");
      out.write("\treturn ret;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("//前スペース削除(全角半角対応)\r\n");
      out.write("function jsLTrim( val ) {\r\n");
      out.write("\tvar ret = val;\r\n");
      out.write("\r\n");
      out.write("\tret = ret.replace( /^[\\s]*/, \"\" );\r\n");
      out.write("\r\n");
      out.write("\treturn ret;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("//後スペース削除(全角半角対応)\r\n");
      out.write("function jsRTrim( val ) {\r\n");
      out.write("\tvar ret = val;\r\n");
      out.write("\r\n");
      out.write("\tret = ret.replace( /^[\\s]*/, \"\" );\r\n");
      out.write("\r\n");
      out.write("\treturn ret;\r\n");
      out.write("}\r\n");
      out.write("</script>\r\n");
      out.write("<head>\r\n");
      out.write("<script src=\"/sotukenD/js/UserSign.js\"></script>\r\n");
      out.write("<meta charset=\"utf-8\" />\r\n");
      out.write("<title>レイアウトテスト</title>\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"/sotukenD/css/style.css\" />\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"renraku.css\" />\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t<div class=\"frm\">\r\n");
      out.write("\t\t<!--header部分-->\r\n");
      out.write("\t\t<header id=\"header\">\r\n");
      out.write("\t\t\t<div id=\"title\">ユーザー情報登録</div>\r\n");
      out.write("\t\t\t<div id=\"account\" align=\"right\">\r\n");
      out.write("\t\t\t\t<div id=\"name\">");
      out.print(loginBean.getUserName());
      out.write("</div>\r\n");
      out.write("\t\t\t\t<!--ログアウトボタン-->\r\n");
      out.write("\t\t\t\t<button type=\"submit\" id=\"logout\"\r\n");
      out.write("\t\t\t\t\tonclick=\"location.href='/sotukenD/LogoutServlet'\">ログアウト</button>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<!--新着メールは、はたして表示されるのだろうか・・・ -->\r\n");
      out.write("\t\t\t<div>　</div>\r\n");
      out.write("\r\n");
      out.write("\t\t</header>\r\n");
      out.write("\r\n");
      out.write("\t\t<!--ページ移動、ナビゲーション部分-->\r\n");
      out.write("\t\t<nav id=\"nav\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t<iframe src=\"/sotukenD/mainMenu.jsp\" name=\"mainMenu\" Align=\"left\"\r\n");
      out.write("\t\t\t\tFrameborder=\"no\" Marginheight=\"0\" Width=\"200\"> </iframe>\r\n");
      out.write("\r\n");
      out.write("\t\t</nav>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t<!--作業画面-->\r\n");
      out.write("\t\t<section id=\"mainContent\">\r\n");
      out.write("\t\t\t<div id=\"zentai\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<table border=\"0\" width=\"100%\" height=\"15\" cellpadding=\"2\"\r\n");
      out.write("\t\t\t\t\tcellspacing=\"1\" bgcolor=\"#002047\">\r\n");
      out.write("\t\t\t\t</table>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<!--ここから-->\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<form action=\"/sotukenD/ForUserListServlet\" id=\"form\" name=\"form\" onSubmit=\"return FormCheck()\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t<table border=\"0\" width=\"100%\" cellpadding=\"2\" cellspacing=\"1\"\r\n");
      out.write("\t\t\t\t\t\tbgcolor=\"#002047\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<tr bgcolor=\"#FFFFFF\">\r\n");
      out.write("\t\t\t\t\t\t\t<td width=\"18%\"><font size=\"2\">ユーザーID</font>\r\n");
      out.write("\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t<td><input type=\"text\" name=\"idS\" size=\"15\" value=\"\"\r\n");
      out.write("\t\t\t\t\t\t\t\tid=\"idS\" placeholder=\"例：Uxxx\" maxlength=\"4\" element.style.imeMode = \"disabled\";><font size=\"2\"> ※\r\n");
      out.write("\t\t\t\t\t\t\t\t\t管理者:Mxxx 一般:Uxxx</font>\r\n");
      out.write("\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t</tr>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<tr bgcolor=\"#FFFFFF\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t<td width=\"18%\"><font size=\"2\">パスワード</font>\r\n");
      out.write("\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t<td><input type=\"text\" name=\"passS\" size=\"15\" value=\"\"\r\n");
      out.write("\t\t\t\t\t\t\t\tid=\"passS\" placeholder=\"例：xxxxx\" maxlength=\"5\" ><font size=\"2\"> ※\r\n");
      out.write("\t\t\t\t\t\t\t\t\t半角英数5文字</font>\r\n");
      out.write("\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t<tr bgcolor=\"#FFFFFF\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t<td width=\"18%\"><font size=\"2\">氏名</font>\r\n");
      out.write("\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t<td><input type=\"text\" name=\"nameS\" size=\"15\" value=\"\"\r\n");
      out.write("\t\t\t\t\t\t\t\tid=\"nameS\" placeholder=\"例：船橋 太郎\" maxlength=\"10\">\r\n");
      out.write("\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t<tr bgcolor=\"#FFFFFF\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t<td width=\"18%\"><font size=\"2\">フリガナ</font>\r\n");
      out.write("\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t<td><input type=\"text\" name=\"huriS\" size=\"15\" value=\"\"\r\n");
      out.write("\t\t\t\t\t\t\t\tid=\"huriS\" placeholder=\"例：フナバシ タロウ\" maxlength=\"10\">\r\n");
      out.write("\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t<tr bgcolor=\"#FFFFFF\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t<td width=\"18%\"><font size=\"2\">性別</font>\r\n");
      out.write("\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t<td><select name=\"sexS\" id=sexS>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<option value=\"男性\">男</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<option value=\"女性\">女</option>\r\n");
      out.write("\t\t\t\t\t\t\t</select>\r\n");
      out.write("\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t<tr bgcolor=\"#FFFFFF\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t<td width=\"18%\"><font size=\"2\">生年月日</font>\r\n");
      out.write("\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t<td><input type=\"text\" name=\"yyS\" size=\"5\" value=\"\" id=\"yyS\"\r\n");
      out.write("\t\t\t\t\t\t\t\tplaceholder=\"xxxx\" maxlength=\"4\"/> 年 <input type=\"text\" name=\"mmS\" size=\"3\"\r\n");
      out.write("\t\t\t\t\t\t\t\tvalue=\"\" id=\"mmS\" placeholder=\"xx\" maxlength=\"2\"/> 月 <input type=\"text\"\r\n");
      out.write("\t\t\t\t\t\t\t\tname=\"ddS\" size=\"3\" value=\"\" id=\"ddS\" placeholder=\"xx\" maxlength=\"2\">\r\n");
      out.write("\t\t\t\t\t\t\t\t日</td>\r\n");
      out.write("\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t<tr bgcolor=\"#FFFFFF\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t<td width=\"18%\"><font size=\"2\">住所</font>\r\n");
      out.write("\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t<td><input type=\"text\" name=\"homeS\" size=\"30\" value=\"\"\r\n");
      out.write("\t\t\t\t\t\t\t\tid=\"homeS\" placeholder=\"例：xx県xx市xx-xx-xx\" maxlength=\"50\">\r\n");
      out.write("\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t<tr bgcolor=\"#FFFFFF\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t<td width=\"18%\"><font size=\"2\">電話番号</font>\r\n");
      out.write("\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t<td><input type=\"text\" name=\"tellS\" size=\"15\" value=\"\"\r\n");
      out.write("\t\t\t\t\t\t\t\tid=\"tellS\" placeholder=\"例：xxx-xxxx-xxxx\" maxlength=\"14\">\r\n");
      out.write("\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t<tr bgcolor=\"#FFFFFF\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t<td width=\"18%\"><font size=\"2\">メールアドレス</font>\r\n");
      out.write("\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t<td><input type=\"text\" name=\"mailS\" size=\"20\" value=\"\"\r\n");
      out.write("\t\t\t\t\t\t\t\tid=\"mailS\" placeholder=\"xxx@xxx.xx.xx\" maxlength=\"50\">\r\n");
      out.write("\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t<tr bgcolor=\"#FFFFFF\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t<td width=\"18%\"><font size=\"2\">権限</font>\r\n");
      out.write("\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t<td><select name=\"kenS\" id=kenS>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<option value=\"0\">一般</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<option value=\"1\">管理者</option>\r\n");
      out.write("\t\t\t\t\t\t\t</select>\r\n");
      out.write("\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t</table>\r\n");
      out.write("\t\t\t\t\t<!--\r\n");
      out.write("\t\t\t\t\t<input type=\"submit\" id=\"modoruButton\"\r\n");
      out.write("\t\t\t\t\t\tstyle=\"WIDTH: 80px; HEIGHT: 23px;\" value=\"戻る\"\r\n");
      out.write("\t\t\t\t\t\tonClick=\"goListServlet('0');,\">\r\n");
      out.write("\t\t\t\t\t-->\r\n");
      out.write("\t\t\t\t\t <input type=\"submit\"\r\n");
      out.write("\t\t\t\t\t\tid=\"insertButton\" style=\"WIDTH: 80px; HEIGHT: 23px;\"\r\n");
      out.write("\t\t\t\t\t\tonClick=\"goListServlet('1');FormCheck();\" value=\"登録\"> <input\r\n");
      out.write("\t\t\t\t\t\ttype=\"hidden\" id=\"progId\" name=\"progId\" value=\"\">\r\n");
      out.write("\t\t\t\t</form>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</section>\r\n");
      out.write("\t</div>\r\n");
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
