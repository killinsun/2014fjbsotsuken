// 画面読み込み完了時の処理
window.addEventListener("load", function () {
	// プログラムID
	var progId = document.getElementById("progId");

	// フォーム
	//var form = document.getElementById("form");

//	//「同意して送信」ボタンが押されたとき
//    document.getElementById("insertButton").addEventListener("click", function () {
//
//    	var passWrod = document.getElementById("passWord").value;
//    	var passWrod2 = document.getElementById("passWord").value;
//
//    	if(passWord!=passWrod2){
//    		alert("「パスワード」と「パスワード(確認用)」が一致しません");
//    		return;
//    	}
//
//	progId.value = "0";
//	form.submit();
//    }, true);


	//「同意して送信」ボタンが押されたとき
    document.getElementById("submit1").addEventListener("click", function () {

    	var lastName = document.getElementById("lastName").value;
    	var lastName_kana = document.getElementById("lastName_kana").value;
    	var birthday = document.getElementById("birthday").value;
    	var memberId = document.getElementById("memberId").value;
    	var passWrod = document.getElementById("passWord").value;
    	var passWrod2 = document.getElementById("passWord2").value;
    	var emailAddress = document.getElementById("emailAddress").value;
    	var postalCode = document.getElementById("postalCode").value;
    	var address = document.getElementById("address").value;

    	// 必須チェック
    	if (lastName == "") {
    		alert("「お名前」を入れてください");
    		return;
    	}
    	 if (lastName_kana == "") {
     		alert("「フリガナ」を入れてください");
     		return;
     	}
     		if (birthday == "") {
     		alert("「生年月日」を入れてください");
     		return;
     	}
     		if (memberId == "") {
     		alert("「ID」を入れてください");
     		return;
     	}
     		if (passWrod == "") {
     		alert("「パスワード」を入れてください");
     		return;
     	}
     		if (passWord2 == "") {
     		alert("「パスワード再確認」を入れてください");
     		return;
     	}
     		if (emailAddress == "") {
     		alert("「メールアドレス」を入れてください");
     		return;
     	}
     		if (postalCode == "") {
     		alert("「郵便番号」を入れてください");
     		return;
     	}
     		if (address == "") {
     		alert("「出身地」を入れてください");
     		return;
     	}


    	// 一致チェック
    	if(passWrod!=passWrod2){
    		alert("「パスワード」と「パスワード(確認用)」が一致しません");
    		return;
    	}


    	document.getElementById("form").action="/Sotuken/SendEmailCompletionServlet";
    	document.getElementById("form").submit();
    }, true);


}, true);
