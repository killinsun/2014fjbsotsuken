// 画面読み込み完了時の処理
window.addEventListener("load", function () {

	// フォーム
	var form = document.getElementById("tourokukakunin-henkou");

    //次へボタンが押されたとき
    document.getElementById("backBtn2").addEventListener("click", function () {
		form.action = "tourokuhenkou.html";
    	form.submit();
    }, true);
    //登録ボタンが押されたとき
    document.getElementById("touroku").addEventListener("click", function () {
		form.action = "tourokukanryou2.html";
    	form.submit();
    }, true);


}, true);

