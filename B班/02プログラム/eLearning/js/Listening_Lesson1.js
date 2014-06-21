// 画面読み込み完了時の処理
window.addEventListener("load", function () {

	// フォーム
	var form = document.getElementById("Dform");

    //「採点＆解説へ」ボタンが押されたとき
    document.getElementById("Sbtn").addEventListener("click", function () {
		form.action = "Listening_Lesson1_Answer.html";
    	form.submit();
    }, true);

	//「Listening目次へ」ボタンが押されたとき
	document.getElementById("Rebtn").addEventListener("click", function () {
		form.action = "Listening.html";
    	form.submit();
    }, true);

}, true);

