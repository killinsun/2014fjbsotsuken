
  		// 画面読み込み完了時の処理
  		window.addEventListener("load", function () {
  			// プログラムID
  			var progId = document.getElementById("progId");

  			// フォーム
  			var form = document.getElementById("form");

  			//「送信」ボタンが押されたとき
  		    document.getElementById("sousin").addEventListener("click", function () {
  		    	progId.value = "0";
  		    	form.submit();
  		    }, true);

  			//「スタンプ」ボタンが押されたとき
  		    document.getElementById("stamp").addEventListener("click", function () {
  		    	progId.value = "1";
  		    	form.submit();
  		    }, true);

  			//「ファイルの送信」ボタンが押されたとき
  		    document.getElementById("gazou").addEventListener("click", function () {
  		    	progId.value = "2";
  		    	form.submit();
  		    }, true);

  		}, true);

		function stampOpen(){

			document.getElementById("progId").value = "1";
			document.getElementById("chatTextArea").value = "";

			//window.open( "/Sotuken/groupChatServlet?progId=1","_blank","width=340,height=300,resizable=yes");
		}

