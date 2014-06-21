<%@page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01//EN" "http://www.w3.org/TR/html4/strict.dtd">
<html lang="ja">
<script type="text/javascript" src="js/Listening_Lesson.js"></script>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Lesson1</title>
<style type="text/css">
	#question{
		width: 600px;
		margin: 0 auto;
	}
	#ques{
		float:right;
		}
		p.line {color:black; background:yellowgreen;}
</style>


<script type="text/javascript">
function video_play() {
   video.play();
}
function video_pause() {
   video.pause();
}
</script>
<form id="Dform">

</head>

<body>




<center>
<h2>Lesson1</h2>
<p>次の音声を聞き問題に答えなさい。</p>
</center>


<div id = "question">

	<p class="line">Q1</p>
		<center>
			<audio id="audio" controls width="320" height="240">
<source src="music/english.mp3">
</audio><br>
	<!--<div id="ques">-->

		<p><input type="radio" name="q1" value="A">
		A. This song is known all over the world.
		<p><input type="radio" name="q1" value="B">
		B. This computer is used by Ken.
		<br>


	<!--</div>-->
</center>
<!--</div>-->

<p class="line">Q2</p>
<center>
	<audio id="audio" controls width="320" height="240">
<source src="music/">
</audio><br>
		<p><input type="radio" name="q1" value="A">
		A. This song is known all over the world.
		<p><input type="radio" name="q1" value="B">
		B. This computer is used by Ken.
		<br>

</center>
<p class="line">Q3</p>
<center>
	<audio id="audio" controls width="320" height="240">
<source src="music/201311181430.asx">
</audio><br>
		<p><input type="radio" name="q1" value="A">
		A. This song is known all over the world.
		<p><input type="radio" name="q1" value="B">
		B. This computer is used by Ken.
		<br>

</center>

<p class="line">Q4</p>
<center>
	<audio id="audio" controls width="320" height="240">
<source src="music/201311181430.asx">
</audio><br>
		<p><input type="radio" name="q1" value="A">
		A. This song is known all over the world.
		<p><input type="radio" name="q1" value="B">
		B. This computer is used by Ken.
		<br>

</center>

<p class="line">Q5</p>
<center>
	<audio id="audio" controls width="320" height="240">
<source src="music/201311181430.asx">
</audio><br>
		<p><input type="radio" name="q1" value="A">
		A. This song is known all over the world.
		<p><input type="radio" name="q1" value="B">
		B. This computer is used by Ken.
		<br>

</center>
<br>
<br>
<center>
<BUTTON type="button" id="Sbtn">採点＆解説へ</BUTTON>
<BUTTON type="button" id="Rebtn">Listening目次へ</BUTTON><BR>
</P>
</center>

</body>
</form>
</html>