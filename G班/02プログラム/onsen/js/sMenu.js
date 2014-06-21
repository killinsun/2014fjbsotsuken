// 画面読み込み完了時の処理
window.addEventListener("load", function () {
	// フォーム
	var form = document.getElementById("searchmenu");

	document.getElementById("searchButton").addEventListener("click", function () {
    	form.submit();
    }, true);

	document.getElementById("searchButton2").addEventListener("click", function () {
    	form.submit();
    }, true);
}, true);