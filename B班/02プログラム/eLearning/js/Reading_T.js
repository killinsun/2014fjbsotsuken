// 画面読み込み完了時の処理
window.addEventListener("load", function () {

	// フォーム
	var form = document.getElementById("Bform");

    //次へボタンが押されたとき
    document.getElementById("Rebtn").addEventListener("click", function () {
		form.action = "Reading.html";
    	form.submit();
    }, true);


}, true);

