<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml">
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page pageEncoding="UTF-8" %>
	<head>
    	<meta charset="utf-8" />
   	 <title>売り上げ一覧</title>
   	 <link rel="stylesheet" type="text/css" href="/sotukenD/css/style.css" />
    <script type="text/javascript" src="https://www.google.com/jsapi"></script>
    <script type="text/javascript">
      google.load("visualization", "1", {packages:["corechart"]});
      google.setOnLoadCallback(drawChart);
      function drawChart() {
        var data = google.visualization.arrayToDataTable([
          ['Month', '今年', '前年'],
          ['1月',  45,      50],
          ['2月',  56,      44],
          ['3月',  44,      42],
          ['4月',  75,      66],
          ['5月',  55,      58],
          ['6月',  60,      65],
        ]);

        var options = {
          title: '前年対比',
          vAxis: {title: '万'}
        };

        var chart = new google.visualization.LineChart(document.getElementById('chart_div'));
        chart.draw(data, options);
      }
      </script>
	</head>
<body>
<div class="frm">
	<!--header部分-->
		<header id="header">
			<div id="title">売上確認画面</div>
			<div id="account" align="right">
				<div id="name">苗字 名前</div>
				<!--ログアウトボタン-->
				<button type="button" id="logout">ログアウト</button>
			</div>
			<div>　
			</div>
		</header>

	<!--ページ移動、ナビゲーション部分-->
	<nav id="nav">

			<iframe src="./../mainMenu.jsp" name="mainMenu" Align="left" Frameborder="no" Marginheight="0" Width="200">

			</iframe>

	</nav>


	<!--作業画面-->
	<section id="mainContent">
	現在売上　<input type="text" size="10" name="proceedsNow" value=１２４２６８ readonly="readonly"  />円　　
	前年対比<input type="text" size=4 name="lastYearPercent" value=101.2 readonly="readonly"  />％　　
	目標達成率<input type="text" size=4 name="achievePercent" value=93.5 readonly="readonly"  />％　　
	<div id="chart_div" style="width: 580px; height: 350px;"></div>
		<br>
	</section>
</div>

</body>
</html>
