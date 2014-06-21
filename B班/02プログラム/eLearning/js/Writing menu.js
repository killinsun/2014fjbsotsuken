// 画面読み込み完了時の処理
window.addEventListener("load", function () {

	// フォーム
	var form = document.getElementById("Wform");

    //次へボタンが押されたとき
    //document.getElementById("Wbtn").addEventListener("click", function () {
		//form.action = "/eLearning/WritingDougaServlet";
    	//form.submit();
    //}, true);




}, true);

function bunyaClick(bunyaId) {
	document.getElementById("bunyaId").value = bunyaId;
	document.getElementById("Wform").action = "/eLearning/WritingDougaServlet";
	document.getElementById("Wform").submit();
}

