// 画面読み込み完了時の処理
window.addEventListener("load", function () {

	// フォーム
	var form = document.getElementById("EnglishForm");
	var kamokuID = document.getElementById("kamokuID");

    //次へボタンが押されたとき
	document.getElementById("Lbtn").addEventListener("click", function () {
		form.action = "/eLearning/ListeningServlet";
		kamokuID.value = "KMK0000004";

    	form.submit();
    }, true);

}, true);



