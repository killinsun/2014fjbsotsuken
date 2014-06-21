<%@page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<script src="./script/Menu.js"></script>
<%-- ヘッドの挿入 --%>
<%@include file="head.jsp" %>
<link href="./css/planPressStyle.css" rel="stylesheet" type="text/css" />
<link href="./css/userregister.css" rel="stylesheet" type="text/css" />
<title>新規プラン投稿-FJBマラベル-</title>
</head>
<body>

<%-- ヘッダーの挿入 --%>
<%@include file="header.jsp" %>

<div id="wrapper">

<%-- メニューの挿入 --%>
<%@include file="menu.jsp" %>

<div id="contents"><!-- ここから内容編集 -->
<form action="#" id="member">

	<h3>ユーザー情報変更</h3>

   <fieldset>
        <legend>ログイン情報</legend>
        <p>
        <label for="login_id">ユーザー名：</label><input type="text" name="login_id" id="login_id" required  value="yachimata"/>
        <半角英数字></p>
        <p>
        <label for="login_pw">パスワード：</label><input type="password" name="login_pw" id="login_pw" required value="jjjjjj"/>
        <半角英数字></p>
            <p>
                <label for="email">メールアドレス：</label>
                <input id="email" required value="aaaaaaa@chiba-fjb.ac.jp"/>
                <変更完了のメールが届きます>
            </p>
    </fieldset>
    <fieldset>
        <legend>個人情報</legend>
            <p>
                <label for="name1">氏名：</label>
                <input id="name1" required value="長谷尾孝"/>
            </p>
            <p>
                <label for="name2">フリガナ：</label>
                <input id="name2" required value="ハセオタカシ"/>
            </p>
            <p>
                <label for="year">生年月日：</label>
            <form name="yyyymmdd" method="post" action="#">
	<select name="year">
	<option value="">1992</option>
	<option value="1900">1900</option>
	<option value="1901">1901</option>
	<option value="1902">1902</option>
	<option value="1903">1903</option>
	<option value="1904">1904</option>
	<option value="1905">1905</option>
	<option value="1906">1906</option>
	<option value="1907">1907</option>
	<option value="1908">1908</option>
	<option value="1909">1909</option>
	<option value="1910">1910</option>
	<option value="1911">1911</option>
	<option value="1912">1912</option>
	<option value="1913">1913</option>
	<option value="1914">1914</option>
	<option value="1915">1915</option>
	<option value="1916">1916</option>
	<option value="1917">1917</option>
	<option value="1918">1918</option>
	<option value="1919">1919</option>
	<option value="1920">1920</option>
	<option value="1921">1921</option>
	<option value="1922">1922</option>
	<option value="1923">1923</option>
	<option value="1924">1924</option>
	<option value="1925">1925</option>
	<option value="1926">1926</option>
	<option value="1927">1927</option>
	<option value="1928">1928</option>
	<option value="1929">1929</option>
	<option value="1930">1930</option>
	<option value="1931">1931</option>
	<option value="1932">1932</option>
	<option value="1933">1933</option>
	<option value="1934">1934</option>
	<option value="1935">1935</option>
	<option value="1936">1936</option>
	<option value="1937">1937</option>
	<option value="1938">1938</option>
	<option value="1939">1939</option>
	<option value="1940">1940</option>
	<option value="1941">1941</option>
	<option value="1942">1942</option>
	<option value="1943">1943</option>
	<option value="1944">1944</option>
	<option value="1945">1945</option>
	<option value="1946">1946</option>
	<option value="1947">1947</option>
	<option value="1948">1948</option>
	<option value="1949">1949</option>
	<option value="1950">1950</option>
	<option value="1951">1951</option>
	<option value="1952">1952</option>
	<option value="1953">1953</option>
	<option value="1954">1954</option>
	<option value="1955">1955</option>
	<option value="1956">1956</option>
	<option value="1957">1957</option>
	<option value="1958">1958</option>
	<option value="1959">1959</option>
	<option value="1960">1960</option>
	<option value="1961">1961</option>
	<option value="1962">1962</option>
	<option value="1963">1963</option>
	<option value="1964">1964</option>
	<option value="1965">1965</option>
	<option value="1966">1966</option>
	<option value="1967">1967</option>
	<option value="1968">1968</option>
	<option value="1969">1969</option>
	<option value="1970">1970</option>
	<option value="1971">1971</option>
	<option value="1972">1972</option>
	<option value="1973">1973</option>
	<option value="1974">1974</option>
	<option value="1975">1975</option>
	<option value="1976">1976</option>
	<option value="1977">1977</option>
	<option value="1978">1978</option>
	<option value="1979">1979</option>
	<option value="1980">1980</option>
	<option value="1981">1981</option>
	<option value="1982">1982</option>
	<option value="1983">1983</option>
	<option value="1984">1984</option>
	<option value="1985">1985</option>
	<option value="1986">1986</option>
	<option value="1987">1987</option>
	<option value="1988">1988</option>
	<option value="1989">1989</option>
	<option value="1990">1990</option>
	<option value="1991">1991</option>
	<option value="1992">1992</option>
	<option value="1993">1993</option>
	<option value="1994">1994</option>
	<option value="1995">1995</option>
	<option value="1996">1996</option>
	<option value="1997">1997</option>
	<option value="1998">1998</option>
	<option value="1999">1999</option>
	<option value="2000">2000</option>
	<option value="2001">2001</option>
	<option value="2002">2002</option>
	<option value="2003">2003</option>
	<option value="2004">2004</option>
	<option value="2005">2005</option>
	<option value="2006">2006</option>
	<option value="2007">2007</option>
	<option value="2008">2008</option>
	<option value="2009">2009</option>
	<option value="2010">2010</option>
	<option value="2011">2011</option>
	<option value="2012">2012</option>
	<option value="2013">2013</option>
	</select>
	年
	<SELECT name="month">
	<option value="">5</option>
	<option value="1">1</option>
	<option value="2">2</option>
	<option value="3">3</option>
	<option value="4">4</option>
	<option value="5">5</option>
	<option value="6">6</option>
	<option value="7">7</option>
	<option value="8">8</option>
	<option value="9">9</option>
	<option value="10">10</option>
	<option value="11">11</option>
	<option value="12">12</option>
	</SELECT>
	月
	<SELECT name="day">
	<option value="">5</option>
	<option value="1">1</option>
	<option value="2">2</option>
	<option value="3">3</option>
	<option value="4">4</option>
	<option value="5">5</option>
	<option value="6">6</option>
	<option value="7">7</option>
	<option value="8">8</option>
	<option value="9">9</option>
	<option value="10">10</option>
	<option value="11">11</option>
	<option value="12">12</option>
	<option value="13">13</option>
	<option value="14">14</option>
	<option value="15">15</option>
	<option value="16">16</option>
	<option value="17">17</option>
	<option value="18">18</option>
	<option value="19">19</option>
	<option value="20">20</option>
	<option value="21">21</option>
	<option value="22">22</option>
	<option value="23">23</option>
	<option value="24">24</option>
	<option value="25">25</option>
	<option value="26">26</option>
	<option value="27">27</option>
	<option value="28">28</option>
	<option value="29">29</option>
	<option value="30">30</option>
	<option value="31">31</option>
</select>
	日 <br>
	            </p>
</form>
            <fieldset>
                <legend>性別</legend>
                <p>
                    <label><input type="radio" name="sex"  checked/>男性</label>
                    <label><input type="radio" name="sex" />女性</label>
                </p>
            </fieldset>

            <p>
                <label for="postcode">郵便番号：</label>
                <input type="text" style="ime-mode: disabled;" onkeypress='
				if(event.keyCode<"0".charCodeAt(0) || "9".charCodeAt(0)<event.keyCode)return false;'
				name="example1" size="15" maxlength="7" input id="postcode" required value="273-0003"/>
            <半角数字>
            </p>
            <p>
                <label for="address">住所：</label>
                <input id="address" required value="千葉県船橋市本町7-2-1"/>
            </p>
            <p>
            	<label for="tel">電話番号：</label>
				<input type="text" style="ime-mode: disabled;" onkeypress='
				if(event.keyCode<"0".charCodeAt(0) || "9".charCodeAt(0)<event.keyCode)return false;'
				name="example2" size="15" maxlength="10" input id="tel" required value="090-2355-6567"/>
			<半角数字>
			</p>



    </fieldset>

                <p>
            <form action="userhensyuend.html" method="post"><input type="submit" name="henkou" value=" ユーザー情報を変更する ">
            </p>

</form>
</div><!-- contents end　ここまで編集 -->

</div><!-- wrapper end -->

<%-- フッターの挿入 --%>
<%@include file="footer.jsp" %>

</body>
</html>
