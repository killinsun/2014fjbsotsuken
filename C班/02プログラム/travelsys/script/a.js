// 画面読み込み完了時の処理
window.addEventListener("load", function () {
	// プログラムID
	var progId = document.getElementById("aId");

	// フォーム
	var form = document.getElementById("for");

    document.getElementById("are").addEventListener("click", function () {
    	progId.value = "0";
    	form.submit();
    }, true);

    document.getElementById("yoy").addEventListener("click", function () {
    	progId.value = "1";
    	form.submit();
    }, true);



}, true);
