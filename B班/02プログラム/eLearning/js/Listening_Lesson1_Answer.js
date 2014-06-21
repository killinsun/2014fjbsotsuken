// 画面読み込み完了時の処理
window.addEventListener("load", function () {

	// フォーム
	var form = document.getElementById("Eform");

    //次へボタンが押されたとき
    document.getElementById("Rbtn").addEventListener("click", function () {
		form.action = "Listening_Lesson1.html";
    	form.submit();
    }, true);

	  document.getElementById("Rebtn").addEventListener("click", function () {
		form.action = "Listening.html";
    	form.submit();
    }, true);

}, true);

