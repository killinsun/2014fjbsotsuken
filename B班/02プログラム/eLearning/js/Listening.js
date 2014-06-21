// 画面読み込み完了時の処理
window.addEventListener("load", function () {

	// フォーム
	var form = document.getElementById("Cform");

    //次へボタンが押されたとき
    //document.getElementById("Lbtn").addEventListener("click", function () {
		//form.alert("ひひひ");
    	//form.action = "/eLearning/ListeningNextServlet";
    	//form.submit();
    //}, true);


}, true);



function bunyaClick(bunyaId) {
	document.getElementById("bunyaId").value = bunyaId;
	document.getElementById("Cform").action = "/eLearning/ListeningNextServlet";
	document.getElementById("Cform").submit();
}
