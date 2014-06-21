// 画面読み込み完了時の処理
window.addEventListener("load", function () {

	// フォーム
	var form = document.getElementById("tourokukakunin-ID");

    //次へボタンが押されたとき
    document.getElementById("nextBtn3").addEventListener("click", function () {
		form.action = "tourokukakunin-ID.html";
    	form.submit();
    }, true);


}, true);

