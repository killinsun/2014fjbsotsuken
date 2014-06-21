// 画面読み込み完了時の処理
window.addEventListener("load", function () {
	// プログラムID
	var prog = document.getElementById("prog");

	// フォーム
	var form = document.getElementById("f");

	//「ユーザ情報メンテナンス」ボタンが押されたとき
    document.getElementById("toukou").addEventListener("click", function () {
    	prog.value = "0";
    	form.submit();
    }, true);

	//「商品メンテナンス」ボタンが押されたとき
    document.getElementById("info").addEventListener("click", function () {
    	prog.value = "1";
    	form.submit();
    }, true);

    document.getElementById("qurejit").addEventListener("click", function () {
    	prog.value = "2";
    	form.submit();
    }, true);

}, true);
