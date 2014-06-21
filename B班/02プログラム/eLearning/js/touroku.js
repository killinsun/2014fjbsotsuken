// 画面読み込み完了時の処理
window.addEventListener("load", function () {

	// フォーム
	var form = document.getElementById("tourokuForm");

    //次へボタンが押されたとき
    document.getElementById("nextBtn").addEventListener("click", function () {
		form.action = "tourokukakunin.html";
    	form.submit();
    }, true);


}, true);

