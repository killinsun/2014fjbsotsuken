function goLoginServlet() {
	document.getElementById('form').action = "/SNS/LoginServlet";
}


function goMainServlet(value) {
	// Homeボタンがクリックされたかを判定
	if (value == 0) {
		document.getElementById('pid').value = "";
		document.getElementById('form').action = "/SNS/MainServlet?pid=";
	}


	// ログアウトボタンがクリックされたかを判定
	if (value == -1) {
		if (window.confirm("ログアウトします。よろしいですか？")) {
			document.getElementById('pid').value = value;
		} else {
			return;
		}
	}

	// 新規部屋作成ボタンがクリックされたかを判定
	if (value == 1) {
		// 部屋名が入力されているかを判定
		if(document.getElementById('newRoomName').value == "") {
			window.alert("ルーム名を入力して下さい。");
			document.getElementById('pid').value = "";
		} else {
			// 新規部屋作成を行う
			document.getElementById('pid').value = value;
			document.getElementById('form').action = "/SNS/MainServlet";
			return;
		}
	}

	// 発言発信ボタンが押された時
	if (value == 2) {
		// 発言内容が入力されているかを判定
		if(document.getElementById('message').value == ""){
			document.getElementById('pid').value = "";
    		return false;
    	} else {
    		// 発言を行う
			document.getElementById('pid').value = value;
			document.getElementById('form').action = "/SNS/MainServlet";
    	}
	}

	// お知らせルームがクリックされた時
	if (value == "E") {
		 document.getElementById("pid").value = value;
		 document.getElementById('form').action = "/SNS/MainServlet";
		 document.getElementById('form').submit();
	}

	// ログインしてきた時
	document.getElementById('form').action = "/SNS/MainServlet";
}


function goAdviceServlet() {
	document.getElementById('form').action = "/SNS/AdviceServlet";
}


function goSearchServlet(value) {

	// 新規部屋作成ボタンがクリックされたかを判定
	if (value == 3) {
		// 部屋名が入力されているかを判定
		if (document.getElementById('newRoomName').value == "") {
			window.alert("ルーム名を入力して下さい");
			document.getElementById('pid').value = "";
		} else {
			// 新規部屋作成を行う
			document.getElementById('pid').value = value;
			document.getElementById('form').action = "/SNS/SearchServlet?pid=" + value;
			return;
		}

	}

	// 追加ボタンがクリックされたかを判定
	if (value == 4) {
		// 選択中のユーザのリストがnullでないことを確認
			document.getElementById('pid').value = value;
			document.getElementById('form').action = "/SNS/SearchServlet?pid=" + value;
			return;
	}

	// 検索ボタンがクリックされた時の処理
	document.getElementById('form').action = "/SNS/SearchServlet?pid=" + value;
}

// 部屋が選択された時
function roomSelect(value){
	// プログラムIDにルームIDをセット
	document.getElementById('pid').value = value;
	document.getElementById('form').action = "/SNS/MainServlet";
	document.getElementById('form').submit();
}


function goEventServlet() {
	document.getElementById('form').action = "/SNS/EventServlet";
}


function goProfileServlet() {
	document.getElementById('form').action = "/SNS/ProfileServlet";
}


function goEditProfileServlet() {
	document.getElementById('form').action = "/SNS/EditProfileServlet";
}


function goPreviewProfileServlet() {
	document.getElementById('form').action = "/SNS/PreviewProfileServlet";
}


function goMasterMaintenanceServlet() {
	document.getElementById('form').action = "/SNS/MasterMaintenanceServlet";
}


function goCreateUserServlet() {
	document.getElementById('form').action = "/SNS/CreateUserServlet";
}


function goUserListServlet() {
	document.getElementById('form').action = "/SNS/UserListServlet";
}


function posting() {
	document.getElementById('form').action = "/SNS/AdviceServlet";
	document.getElementById('pid').value = 1;
}


function contentList(value){
	document.getElementById('form').action = "/SNS/AdviceServlet";
	document.getElementById('pid').value = value;
	document.getElementById('contentId').value = value;
	document.getElementById('form').submit();
}


function sendRes() {
	document.getElementById('form').action = "/SNS/AdviceServlet";
	document.getElementById('pid').value = 2;
}