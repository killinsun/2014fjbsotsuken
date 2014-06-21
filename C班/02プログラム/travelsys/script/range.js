// 画面読み込み完了時の処理
window.addEventListener("load", function () {
	// プログラムID
	var progId = document.getElementById("pi");
	var keyword = document.getElementById("key");

	// フォーム
	var form = document.getElementById("ran");

	progId.value = "0";

	//ボタンが押されたとき
    document.getElementById("kensaku").addEventListener("click", function () {
    	progId.value = "0";
    	form.submit();
    }, true);

	//ボタンが押されたとき
    document.getElementById("huyu").addEventListener("click", function () {
    	var bt = document.getElementById("huyu");
    	progId.value = "1";
    	keyword.value = "冬";
    	form.submit();
    }, true);

  //ボタンが押されたとき
    document.getElementById("yasui").addEventListener("click", function () {
    	progId.value = "1";
    	keyword.value = "安い";
    	form.submit();
    }, true);

  //ボタンが押されたとき
    document.getElementById("aki").addEventListener("click", function () {
    	progId.value = "1";
    	keyword.value = "秋";
    	form.submit();
    }, true);



}, true);
