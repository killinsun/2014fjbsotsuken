// 画面読み込み完了時の処理
window.addEventListener("load", function () {

	// フォーム
	var form = document.getElementById("tourokuhenkou");

    //次へボタンが押されたとき
    document.getElementById("nextBtn2").addEventListener("click", function () {
		form.action = "tourokukakunin-henkou.html";
    	form.submit();
    }, true);


}, true);

