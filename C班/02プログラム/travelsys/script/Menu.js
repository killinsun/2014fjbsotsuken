// 画面読み込み完了時の処理
window.addEventListener("load", function () {
	// プログラムID
	var progId = document.getElementById("progId");

	// フォーム
	var form = document.getElementById("form");

	//「ユーザ情報メンテナンス」ボタンが押されたとき
    document.getElementById("home").addEventListener("click", function () {
    	progId.value = "0";
    	form.submit();
    }, true);

	//「商品メンテナンス」ボタンが押されたとき
    document.getElementById("serch").addEventListener("click", function () {
    	progId.value = "1";
    	form.submit();
    }, true);

    document.getElementById("usermenu").addEventListener("click", function () {
    	progId.value = "2";
    	form.submit();
    }, true);

    document.getElementById("bbs").addEventListener("click", function () {
    	progId.value = "3";
    	form.submit();
    }, true);
    document.getElementById("makePlan").addEventListener("click", function () {
    	progId.value = "4";
    	form.submit();
    }, true);


}, true);
