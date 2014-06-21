// 画面読み込み完了時の処理
window.addEventListener("load", function () {

	// フォーム
	var form = document.getElementById("tourokukakunin-ID");

    //次へボタンが押されたとき
    document.getElementById("backBtn3").addEventListener("click", function () {
		form.action = "tourokuhenkou-ID.html";
    	form.submit();
    }, true);
    document.getElementById("touroku2").addEventListener("click", function () {
		form.action = "tourokukanryou.html";
    	form.submit();
    }, true);


}, true);

