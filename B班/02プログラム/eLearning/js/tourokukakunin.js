// 画面読み込み完了時の処理
window.addEventListener("load", function () {

	// フォーム
	var form = document.getElementById("tourokukakunin");

    //戻るボタンが押されたとき
    document.getElementById("backBtn5").addEventListener("click", function () {
		form.action = "touroku.html";
    	form.submit();
    }, true);
    
    //登録ボタンが押されたとき
    document.getElementById("nextBtn4").addEventListener("click", function () {
		form.action = "tourokukanryou.html";
    	form.submit();
    }, true);
}, true);
