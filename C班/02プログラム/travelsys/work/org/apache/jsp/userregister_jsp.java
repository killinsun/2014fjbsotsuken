package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import jp.ac.fjb.sotuken.bean.UserBean;

public final class userregister_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList(3);
    _jspx_dependants.add("/head.jsp");
    _jspx_dependants.add("/header.jsp");
    _jspx_dependants.add("/menu.jsp");
  }

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
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\">\r\n");
      out.write("<head>\r\n");
      out.write("\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\" />\r\n");
      out.write("<link href=\"./css/StyleSheet1.css\" rel=\"stylesheet\" type=\"text/css\" />\r\n");
      out.write("<script type=\"text/javascript\" src=\"./script/Menu.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"http://ajax.googleapis.com/ajax/libs/jquery/1.7.2/jquery.min.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"./script/footerFixed.js\"></script>");
      out.write("\r\n");
      out.write("<link href=\"./css/userregister.css\" rel=\"stylesheet\" type=\"text/css\" />\r\n");
      out.write("<title>ユーザー登録?FJBマラベル?</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t");
      out.write("\r\n");
      out.write("\r\n");

	String name="ログイン";
	UserBean loginUser = (UserBean)session.getAttribute("LOGIN_USER");
	if(loginUser!=null){name=loginUser.getUserName();};


      out.write("\r\n");
      out.write("<div id=\"header\">\r\n");
      out.write("\r\n");
      out.write("<div id=\"left\">\r\n");
      out.write("<img src=\"images/rogo01.jpg\">\r\n");
      out.write("</div><!-- left end -->\r\n");
      out.write("\r\n");
      out.write("<div id=\"right\">\r\n");
      out.write("<p><span class=\"bold\"><a href=\"");
      out.print(request.getContextPath() );
      out.write('/');
      out.write('\r');
      out.write('\n');
 if(name.equals("ログイン")){ 
      out.write("\r\n");
      out.write("LoginServlet\r\n");
 }else{ 
      out.write("\r\n");
      out.write("UserMenuServlet\r\n");
 } 
      out.write("\r\n");
      out.write("\">");
      out.print(name );
      out.write("</a></span></p>\r\n");
      out.write("<a href=\"dammy.jsp\">お問い合わせ</a>\r\n");
 if(!name.equals("ログイン")){ 
      out.write("\r\n");
      out.write("\t&frasl;<a href=\"/travelsys/LogoutServlet\">ログアウト</a>\r\n");
      out.write("\r\n");
 } 
      out.write("\r\n");
      out.write("</div><!-- right end -->\r\n");
      out.write("\r\n");
      out.write("</div><!-- header end -->\r\n");
      out.write("\r\n");
      out.write("\t<div id=\"wrapper\">\r\n");
      out.write("\t\t");
      out.write("\r\n");
      out.write("<div id=\"nav\">\r\n");
      out.write("<form action=\"/travelsys/MenuServlet\" id=\"form\">\r\n");
      out.write("\t<ul>\r\n");
      out.write("\t\t<li><input type=\"button\" name=\"home\" id=\"home\" value=\"ホーム\"></li>\r\n");
      out.write("\t\t<li><input type=\"button\" name=\"search\" id=\"serch\" value=\"旅行プラン検索\"></li></a>\r\n");
      out.write("\t\t<li><input type=\"button\" name=\"makePlan\"  id=\"makePlan\" value=\"旅行を計画\"></li>\r\n");
      out.write("\t\t<li><input type=\"button\" name=\"userMenu\" id=\"usermenu\" value=\"ユーザーメニュー\"></li>\r\n");
      out.write("\t\t<li><input type=\"button\" name=\"bbs\" id=\"bbs\" value=\"掲示板\"></li></a>\r\n");
      out.write("\t\t<input type=\"hidden\" id=\"progId\" name=\"progId\">\r\n");
      out.write("\t</ul>\r\n");
      out.write("</form>\r\n");
      out.write("</div><!-- nav end -->");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t<div id=\"contents\">\r\n");
      out.write("\t\t\t<!-- ここから内容編集 -->\r\n");
      out.write("\t\t\t<form action=\"/travelsys/userregisterServlet\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<h3>ユーザー登録</h3>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<fieldset>\r\n");
      out.write("\t\t\t\t\t<legend>ログイン情報</legend>\r\n");
      out.write("\t\t\t\t\t<p>\r\n");
      out.write("\t\t\t\t\t\t<label for=\"login_id\">ユーザーID：</label> <input type=\"text\"\r\n");
      out.write("\t\t\t\t\t\t\tname=\"login_id\" id=\"login_id\" style=\"ime-mode: disabled;\"\r\n");
      out.write("\t\t\t\t\t\t\tmaxlength=\"8\" required />\r\n");
      out.write("\t\t\t\t\t\t<半角英数字 8文字>\r\n");
      out.write("\t\t\t\t\t</p>\r\n");
      out.write("\t\t\t\t\t<p>\r\n");
      out.write("\t\t\t\t\t\t<label for=\"login_pw\">パスワード：</label> <input type=\"password\"\r\n");
      out.write("\t\t\t\t\t\t\tname=\"login_pw\" id=\"login_pw\" style=\"ime-mode: disabled;\"\r\n");
      out.write("\t\t\t\t\t\t\trequired />\r\n");
      out.write("\t\t\t\t\t\t<半角英数字>\r\n");
      out.write("\t\t\t\t\t</p>\r\n");
      out.write("\t\t\t\t\t<p>\r\n");
      out.write("\t\t\t\t\t\t<label for=\"email\">メールアドレス：</label> <input type=\"email\"\r\n");
      out.write("\t\t\t\t\t\t\tname=\"email\" id=\"email\" style=\"ime-mode: disabled;\" required />\r\n");
      out.write("\t\t\t\t\t\t<半角英数字>\r\n");
      out.write("\t\t\t\t\t</p>\r\n");
      out.write("\t\t\t\t</fieldset>\r\n");
      out.write("\t\t\t\t<fieldset>\r\n");
      out.write("\t\t\t\t\t<legend>個人情報</legend>\r\n");
      out.write("\t\t\t\t\t<p>\r\n");
      out.write("\t\t\t\t\t\t<label for=\"name1\">氏名：</label> <input name=\"name1\" id=\"name1\"\r\n");
      out.write("\t\t\t\t\t\t\trequired />\r\n");
      out.write("\t\t\t\t\t</p>\r\n");
      out.write("\t\t\t\t\t<p>\r\n");
      out.write("\t\t\t\t\t\t<label for=\"name2\">フリガナ：</label> <input name=\"name2\" id=\"name2\"\r\n");
      out.write("\t\t\t\t\t\t\trequired />\r\n");
      out.write("\t\t\t\t\t</p>\r\n");
      out.write("\t\t\t\t\t<p>\r\n");
      out.write("\t\t\t\t\t\t<label for=\"year\">生年月日：</label> <select name=\"year\" id=\"year\"\r\n");
      out.write("\t\t\t\t\t\t\trequired=\"required\">\r\n");
      out.write("\t\t\t\t\t\t\t<option value=\"\">--</option>\r\n");
      out.write("\t\t\t\t\t\t\t<option value=\"1900\">1900</option>\r\n");
      out.write("\t\t\t\t\t\t\t<option value=\"1901\">1901</option>\r\n");
      out.write("\t\t\t\t\t\t\t<option value=\"1902\">1902</option>\r\n");
      out.write("\t\t\t\t\t\t\t<option value=\"1903\">1903</option>\r\n");
      out.write("\t\t\t\t\t\t\t<option value=\"1904\">1904</option>\r\n");
      out.write("\t\t\t\t\t\t\t<option value=\"1905\">1905</option>\r\n");
      out.write("\t\t\t\t\t\t\t<option value=\"1906\">1906</option>\r\n");
      out.write("\t\t\t\t\t\t\t<option value=\"1907\">1907</option>\r\n");
      out.write("\t\t\t\t\t\t\t<option value=\"1908\">1908</option>\r\n");
      out.write("\t\t\t\t\t\t\t<option value=\"1909\">1909</option>\r\n");
      out.write("\t\t\t\t\t\t\t<option value=\"1910\">1910</option>\r\n");
      out.write("\t\t\t\t\t\t\t<option value=\"1911\">1911</option>\r\n");
      out.write("\t\t\t\t\t\t\t<option value=\"1912\">1912</option>\r\n");
      out.write("\t\t\t\t\t\t\t<option value=\"1913\">1913</option>\r\n");
      out.write("\t\t\t\t\t\t\t<option value=\"1914\">1914</option>\r\n");
      out.write("\t\t\t\t\t\t\t<option value=\"1915\">1915</option>\r\n");
      out.write("\t\t\t\t\t\t\t<option value=\"1916\">1916</option>\r\n");
      out.write("\t\t\t\t\t\t\t<option value=\"1917\">1917</option>\r\n");
      out.write("\t\t\t\t\t\t\t<option value=\"1918\">1918</option>\r\n");
      out.write("\t\t\t\t\t\t\t<option value=\"1919\">1919</option>\r\n");
      out.write("\t\t\t\t\t\t\t<option value=\"1920\">1920</option>\r\n");
      out.write("\t\t\t\t\t\t\t<option value=\"1921\">1921</option>\r\n");
      out.write("\t\t\t\t\t\t\t<option value=\"1922\">1922</option>\r\n");
      out.write("\t\t\t\t\t\t\t<option value=\"1923\">1923</option>\r\n");
      out.write("\t\t\t\t\t\t\t<option value=\"1924\">1924</option>\r\n");
      out.write("\t\t\t\t\t\t\t<option value=\"1925\">1925</option>\r\n");
      out.write("\t\t\t\t\t\t\t<option value=\"1926\">1926</option>\r\n");
      out.write("\t\t\t\t\t\t\t<option value=\"1927\">1927</option>\r\n");
      out.write("\t\t\t\t\t\t\t<option value=\"1928\">1928</option>\r\n");
      out.write("\t\t\t\t\t\t\t<option value=\"1929\">1929</option>\r\n");
      out.write("\t\t\t\t\t\t\t<option value=\"1930\">1930</option>\r\n");
      out.write("\t\t\t\t\t\t\t<option value=\"1931\">1931</option>\r\n");
      out.write("\t\t\t\t\t\t\t<option value=\"1932\">1932</option>\r\n");
      out.write("\t\t\t\t\t\t\t<option value=\"1933\">1933</option>\r\n");
      out.write("\t\t\t\t\t\t\t<option value=\"1934\">1934</option>\r\n");
      out.write("\t\t\t\t\t\t\t<option value=\"1935\">1935</option>\r\n");
      out.write("\t\t\t\t\t\t\t<option value=\"1936\">1936</option>\r\n");
      out.write("\t\t\t\t\t\t\t<option value=\"1937\">1937</option>\r\n");
      out.write("\t\t\t\t\t\t\t<option value=\"1938\">1938</option>\r\n");
      out.write("\t\t\t\t\t\t\t<option value=\"1939\">1939</option>\r\n");
      out.write("\t\t\t\t\t\t\t<option value=\"1940\">1940</option>\r\n");
      out.write("\t\t\t\t\t\t\t<option value=\"1941\">1941</option>\r\n");
      out.write("\t\t\t\t\t\t\t<option value=\"1942\">1942</option>\r\n");
      out.write("\t\t\t\t\t\t\t<option value=\"1943\">1943</option>\r\n");
      out.write("\t\t\t\t\t\t\t<option value=\"1944\">1944</option>\r\n");
      out.write("\t\t\t\t\t\t\t<option value=\"1945\">1945</option>\r\n");
      out.write("\t\t\t\t\t\t\t<option value=\"1946\">1946</option>\r\n");
      out.write("\t\t\t\t\t\t\t<option value=\"1947\">1947</option>\r\n");
      out.write("\t\t\t\t\t\t\t<option value=\"1948\">1948</option>\r\n");
      out.write("\t\t\t\t\t\t\t<option value=\"1949\">1949</option>\r\n");
      out.write("\t\t\t\t\t\t\t<option value=\"1950\">1950</option>\r\n");
      out.write("\t\t\t\t\t\t\t<option value=\"1951\">1951</option>\r\n");
      out.write("\t\t\t\t\t\t\t<option value=\"1952\">1952</option>\r\n");
      out.write("\t\t\t\t\t\t\t<option value=\"1953\">1953</option>\r\n");
      out.write("\t\t\t\t\t\t\t<option value=\"1954\">1954</option>\r\n");
      out.write("\t\t\t\t\t\t\t<option value=\"1955\">1955</option>\r\n");
      out.write("\t\t\t\t\t\t\t<option value=\"1956\">1956</option>\r\n");
      out.write("\t\t\t\t\t\t\t<option value=\"1957\">1957</option>\r\n");
      out.write("\t\t\t\t\t\t\t<option value=\"1958\">1958</option>\r\n");
      out.write("\t\t\t\t\t\t\t<option value=\"1959\">1959</option>\r\n");
      out.write("\t\t\t\t\t\t\t<option value=\"1960\">1960</option>\r\n");
      out.write("\t\t\t\t\t\t\t<option value=\"1961\">1961</option>\r\n");
      out.write("\t\t\t\t\t\t\t<option value=\"1962\">1962</option>\r\n");
      out.write("\t\t\t\t\t\t\t<option value=\"1963\">1963</option>\r\n");
      out.write("\t\t\t\t\t\t\t<option value=\"1964\">1964</option>\r\n");
      out.write("\t\t\t\t\t\t\t<option value=\"1965\">1965</option>\r\n");
      out.write("\t\t\t\t\t\t\t<option value=\"1966\">1966</option>\r\n");
      out.write("\t\t\t\t\t\t\t<option value=\"1967\">1967</option>\r\n");
      out.write("\t\t\t\t\t\t\t<option value=\"1968\">1968</option>\r\n");
      out.write("\t\t\t\t\t\t\t<option value=\"1969\">1969</option>\r\n");
      out.write("\t\t\t\t\t\t\t<option value=\"1970\">1970</option>\r\n");
      out.write("\t\t\t\t\t\t\t<option value=\"1971\">1971</option>\r\n");
      out.write("\t\t\t\t\t\t\t<option value=\"1972\">1972</option>\r\n");
      out.write("\t\t\t\t\t\t\t<option value=\"1973\">1973</option>\r\n");
      out.write("\t\t\t\t\t\t\t<option value=\"1974\">1974</option>\r\n");
      out.write("\t\t\t\t\t\t\t<option value=\"1975\">1975</option>\r\n");
      out.write("\t\t\t\t\t\t\t<option value=\"1976\">1976</option>\r\n");
      out.write("\t\t\t\t\t\t\t<option value=\"1977\">1977</option>\r\n");
      out.write("\t\t\t\t\t\t\t<option value=\"1978\">1978</option>\r\n");
      out.write("\t\t\t\t\t\t\t<option value=\"1979\">1979</option>\r\n");
      out.write("\t\t\t\t\t\t\t<option value=\"1980\">1980</option>\r\n");
      out.write("\t\t\t\t\t\t\t<option value=\"1981\">1981</option>\r\n");
      out.write("\t\t\t\t\t\t\t<option value=\"1982\">1982</option>\r\n");
      out.write("\t\t\t\t\t\t\t<option value=\"1983\">1983</option>\r\n");
      out.write("\t\t\t\t\t\t\t<option value=\"1984\">1984</option>\r\n");
      out.write("\t\t\t\t\t\t\t<option value=\"1985\">1985</option>\r\n");
      out.write("\t\t\t\t\t\t\t<option value=\"1986\">1986</option>\r\n");
      out.write("\t\t\t\t\t\t\t<option value=\"1987\">1987</option>\r\n");
      out.write("\t\t\t\t\t\t\t<option value=\"1988\">1988</option>\r\n");
      out.write("\t\t\t\t\t\t\t<option value=\"1989\">1989</option>\r\n");
      out.write("\t\t\t\t\t\t\t<option value=\"1990\">1990</option>\r\n");
      out.write("\t\t\t\t\t\t\t<option value=\"1991\">1991</option>\r\n");
      out.write("\t\t\t\t\t\t\t<option value=\"1992\">1992</option>\r\n");
      out.write("\t\t\t\t\t\t\t<option value=\"1993\">1993</option>\r\n");
      out.write("\t\t\t\t\t\t\t<option value=\"1994\">1994</option>\r\n");
      out.write("\t\t\t\t\t\t\t<option value=\"1995\">1995</option>\r\n");
      out.write("\t\t\t\t\t\t\t<option value=\"1996\">1996</option>\r\n");
      out.write("\t\t\t\t\t\t\t<option value=\"1997\">1997</option>\r\n");
      out.write("\t\t\t\t\t\t\t<option value=\"1998\">1998</option>\r\n");
      out.write("\t\t\t\t\t\t\t<option value=\"1999\">1999</option>\r\n");
      out.write("\t\t\t\t\t\t\t<option value=\"2000\">2000</option>\r\n");
      out.write("\t\t\t\t\t\t\t<option value=\"2001\">2001</option>\r\n");
      out.write("\t\t\t\t\t\t\t<option value=\"2002\">2002</option>\r\n");
      out.write("\t\t\t\t\t\t\t<option value=\"2003\">2003</option>\r\n");
      out.write("\t\t\t\t\t\t\t<option value=\"2004\">2004</option>\r\n");
      out.write("\t\t\t\t\t\t\t<option value=\"2005\">2005</option>\r\n");
      out.write("\t\t\t\t\t\t\t<option value=\"2006\">2006</option>\r\n");
      out.write("\t\t\t\t\t\t\t<option value=\"2007\">2007</option>\r\n");
      out.write("\t\t\t\t\t\t\t<option value=\"2008\">2008</option>\r\n");
      out.write("\t\t\t\t\t\t\t<option value=\"2009\">2009</option>\r\n");
      out.write("\t\t\t\t\t\t\t<option value=\"2010\">2010</option>\r\n");
      out.write("\t\t\t\t\t\t\t<option value=\"2011\">2011</option>\r\n");
      out.write("\t\t\t\t\t\t\t<option value=\"2012\">2012</option>\r\n");
      out.write("\t\t\t\t\t\t\t<option value=\"2013\">2013</option>\r\n");
      out.write("\t\t\t\t\t\t</select> 年 <SELECT name=\"month\" id=\"month\" required=\"required\">\r\n");
      out.write("\t\t\t\t\t\t\t<option value=\"\">--</option>\r\n");
      out.write("\t\t\t\t\t\t\t<option value=\"1\">1</option>\r\n");
      out.write("\t\t\t\t\t\t\t<option value=\"2\">2</option>\r\n");
      out.write("\t\t\t\t\t\t\t<option value=\"3\">3</option>\r\n");
      out.write("\t\t\t\t\t\t\t<option value=\"4\">4</option>\r\n");
      out.write("\t\t\t\t\t\t\t<option value=\"5\">5</option>\r\n");
      out.write("\t\t\t\t\t\t\t<option value=\"6\">6</option>\r\n");
      out.write("\t\t\t\t\t\t\t<option value=\"7\">7</option>\r\n");
      out.write("\t\t\t\t\t\t\t<option value=\"8\">8</option>\r\n");
      out.write("\t\t\t\t\t\t\t<option value=\"9\">9</option>\r\n");
      out.write("\t\t\t\t\t\t\t<option value=\"10\">10</option>\r\n");
      out.write("\t\t\t\t\t\t\t<option value=\"11\">11</option>\r\n");
      out.write("\t\t\t\t\t\t\t<option value=\"12\">12</option>\r\n");
      out.write("\t\t\t\t\t\t</SELECT> 月 <SELECT name=\"day\" id=\"day\" required=\"required\">\r\n");
      out.write("\t\t\t\t\t\t\t<option value=\"\">--</option>\r\n");
      out.write("\t\t\t\t\t\t\t<option value=\"1\">1</option>\r\n");
      out.write("\t\t\t\t\t\t\t<option value=\"2\">2</option>\r\n");
      out.write("\t\t\t\t\t\t\t<option value=\"3\">3</option>\r\n");
      out.write("\t\t\t\t\t\t\t<option value=\"4\">4</option>\r\n");
      out.write("\t\t\t\t\t\t\t<option value=\"5\">5</option>\r\n");
      out.write("\t\t\t\t\t\t\t<option value=\"6\">6</option>\r\n");
      out.write("\t\t\t\t\t\t\t<option value=\"7\">7</option>\r\n");
      out.write("\t\t\t\t\t\t\t<option value=\"8\">8</option>\r\n");
      out.write("\t\t\t\t\t\t\t<option value=\"9\">9</option>\r\n");
      out.write("\t\t\t\t\t\t\t<option value=\"10\">10</option>\r\n");
      out.write("\t\t\t\t\t\t\t<option value=\"11\">11</option>\r\n");
      out.write("\t\t\t\t\t\t\t<option value=\"12\">12</option>\r\n");
      out.write("\t\t\t\t\t\t\t<option value=\"13\">13</option>\r\n");
      out.write("\t\t\t\t\t\t\t<option value=\"14\">14</option>\r\n");
      out.write("\t\t\t\t\t\t\t<option value=\"15\">15</option>\r\n");
      out.write("\t\t\t\t\t\t\t<option value=\"16\">16</option>\r\n");
      out.write("\t\t\t\t\t\t\t<option value=\"17\">17</option>\r\n");
      out.write("\t\t\t\t\t\t\t<option value=\"18\">18</option>\r\n");
      out.write("\t\t\t\t\t\t\t<option value=\"19\">19</option>\r\n");
      out.write("\t\t\t\t\t\t\t<option value=\"20\">20</option>\r\n");
      out.write("\t\t\t\t\t\t\t<option value=\"21\">21</option>\r\n");
      out.write("\t\t\t\t\t\t\t<option value=\"22\">22</option>\r\n");
      out.write("\t\t\t\t\t\t\t<option value=\"23\">23</option>\r\n");
      out.write("\t\t\t\t\t\t\t<option value=\"24\">24</option>\r\n");
      out.write("\t\t\t\t\t\t\t<option value=\"25\">25</option>\r\n");
      out.write("\t\t\t\t\t\t\t<option value=\"26\">26</option>\r\n");
      out.write("\t\t\t\t\t\t\t<option value=\"27\">27</option>\r\n");
      out.write("\t\t\t\t\t\t\t<option value=\"28\">28</option>\r\n");
      out.write("\t\t\t\t\t\t\t<option value=\"29\">29</option>\r\n");
      out.write("\t\t\t\t\t\t\t<option value=\"30\">30</option>\r\n");
      out.write("\t\t\t\t\t\t\t<option value=\"31\">31</option>\r\n");
      out.write("\t\t\t\t\t\t</select> 日 <br>\r\n");
      out.write("\t\t\t\t\t</p>\r\n");
      out.write("\t\t\t\t\t<fieldset>\r\n");
      out.write("\t\t\t\t\t\t<legend>性別</legend>\r\n");
      out.write("\t\t\t\t\t\t<p>\r\n");
      out.write("\t\t\t\t\t\t\t<label for=\"sex\"> <input id=\"sex\" type=\"radio\" name=\"sex\"\r\n");
      out.write("\t\t\t\t\t\t\t\tvalue=\"男性\" required />男性 <input id=\"sex\" type=\"radio\"\r\n");
      out.write("\t\t\t\t\t\t\t\tname=\"sex\" value=\"女性\" required />女性 </label>\r\n");
      out.write("\t\t\t\t\t\t</p>\r\n");
      out.write("\t\t\t\t\t</fieldset>\r\n");
      out.write("\t\t\t\t\t※ハイフンは抜かしてください\r\n");
      out.write("\t\t\t\t\t<p>\r\n");
      out.write("\t\t\t\t\t\t<label for=\"postcode\">郵便番号：</label> <input id=\"postcode\"\r\n");
      out.write("\t\t\t\t\t\t\tname=\"postcode\" type=\"text\" style=\"ime-mode: disabled;\"\r\n");
      out.write("\t\t\t\t\t\t\tonkeypress='\r\n");
      out.write("\t\t\t\tif(event.keyCode<\"0\".charCodeAt(0) || \"9\".charCodeAt(0)<event.keyCode)\r\n");
      out.write("\t\t\t\t\t\t\treturn false;'\r\n");
      out.write("\t\t\t\tname=\"example1\" size=\"15\" maxlength=\"7\"\r\n");
      out.write("\t\t\t\t\t\t\trequired />\r\n");
      out.write("\t\t\t\t\t\t<半角数字>\r\n");
      out.write("\t\t\t\t\t</p>\r\n");
      out.write("\t\t\t\t\t<p>\r\n");
      out.write("\t\t\t\t\t\t<label for=\"address\">住所：</label> <input id=\"address\"\r\n");
      out.write("\t\t\t\t\t\t\tname=\"address\" required />\r\n");
      out.write("\t\t\t\t\t</p>\r\n");
      out.write("\t\t\t\t\t<p>\r\n");
      out.write("\t\t\t\t\t\t<label for=\"tel\">電話番号：</label> <input id=\"tel\" name=\"tel\"\r\n");
      out.write("\t\t\t\t\t\t\ttype=\"text\" style=\"ime-mode: disabled;\"\r\n");
      out.write("\t\t\t\t\t\t\tonkeypress='\r\n");
      out.write("\t\t\t\tif(event.keyCode<\"0\".charCodeAt(0) || \"9\".charCodeAt(0)<event.keyCode)\r\n");
      out.write("\t\t\t\t\t\t\treturn false;'\r\n");
      out.write("\t\t\t\tname=\"example2\" size=\"15\" maxlength=\"10\"\r\n");
      out.write("\t\t\t\t\t\t\tstyle=\"ime-mode: disabled;\" required />\r\n");
      out.write("\t\t\t\t\t\t<半角数字>\r\n");
      out.write("\t\t\t\t\t</p>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t</fieldset>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<p>\r\n");
      out.write("\t\t\t\t\t<input type=\"submit\" name=\"kakunin\" value=\" 確認する \"\r\n");
      out.write("\t\t\t\t\t\tclass=\"btnPadding\">\r\n");
      out.write("\t\t\t\t</p>\r\n");
      out.write("\r\n");
      out.write("\t\t\t</form>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<!-- contents end　ここまで編集 -->\r\n");
      out.write("\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<!-- wrapper end -->\r\n");
      out.write("\r\n");
      out.write("\t<div id=\"footer\">Copyright (C) 2013 株式会社 FJBマラベル</div>\r\n");
      out.write("\t<!-- footer end -->\r\n");
      out.write("\r\n");
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
