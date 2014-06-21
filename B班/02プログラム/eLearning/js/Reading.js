// 画面読み込み完了時の処理
window.addEventListener("load", function () {

	// フォーム
	var form = document.getElementById("Rform");

    //次へボタンが押されたとき
    //document.getElementById("Kbtn").addEventListener("click", function () {
		//form.action = "Reading_T.html";
    	//form.submit();
    //}, true);



}, true);

function bunyaClick(bunyaId) {
	document.getElementById("bunyaId").value = bunyaId;
	document.getElementById("Rform").action = "/eLearning/ReadingAnswerServlet";
	document.getElementById("Rform").submit();
}

