// 画面読み込み完了時の処理
window.addEventListener("load", function () {
	// プログラムID
	var bbsProgId = document.getElementById("bbsProgId");

	// フォーム
	var bbsform = document.getElementById("form01");

	//////////////////////////////　formの処理　///////////////////////////////
	//「旅行プラン投稿」ボタンが押されたとき
    document.getElementById("write").addEventListener("click", function () {
    	bbsProgId.value = "0";
    	bbsform.submit();
    }, true);

}, true);

//「コメント」ボタンが押されたとき
function set_value(bbsNo){
	// フォーム
	var bbsform = document.getElementById("form01");

	//bbsNo
	var hiddenBbsNo = document.getElementById("bbsInfo");
	hiddenBbsNo.value = bbsNo;
	bbsProgId.value = "1";
	bbsform.submit();
}

//「詳細」ボタンが押されたとき
function detailSet_value(planId){
	// フォーム
	var bbsform = document.getElementById("form01");

	//bbsNo
	var hiddenPlanId = document.getElementById("bbsInfo");
	hiddenPlanId.value = planId;
	bbsProgId.value = "2";
	bbsform.submit();
}
