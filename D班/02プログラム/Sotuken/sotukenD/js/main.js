//window.addEventListener("load", function() {
//
//	// フォーム
//	var form = document.getElementById("form");
//	var progId = document.getElementById("progId");
//
// 登録ボタンが押された時の処理
//	document.getElementById("insertButton").addEventListener("click",
//			function() {
//				progId.value = "1";
//				form.submit();
//			}, true);
//	document.getElementById("modoruButton").addEventListener("click",
//			function() {
//				progId.value = "0";
//				form.submit();
//			}, true);
//	document.getElementById("deleteButton").addEventListener("click",
//			function() {
//				progId.value = "2";
//				document.getElementById('ListForm').action="/sotukenD/ForUserListServlet";
//				form.submit();
//			}, true);
//	document.getElementById("editButton").addEventListener("click",
//			function() {
//				progId.value = "3";
//				document.getElementById('ListForm').action="/sotukenD/ForUserEditServlet";
//				form.submit();
//			}, true);
//	document.getElementById("signButton").addEventListener("click",
//			function() {
//				progId.value = "4";
//				document.getElementById('ListForm').action="/sotukenD/ForUserSignServlet";
//				form.submit();
//			}, true);
//
//}, true);

//function goListServlet(value) {
//	document.getElementById('progId').value = value;
//	document.getElementById('ListForm').action = "/sotukenD/ForUserListServlet";
//}

//function goEditServlet(value) {
//	document.getElementById('progId').value = value;
//	document.getElementById('ListForm').action = "/sotukenD/ForUserEditServlet";
//}

//function goSignServlet() {
//	document.getElementById('ListForm').action = "/sotukenD/ForUserSignServlet";
//}

//function goUserListServlet() {
//	//alert("aa");
//	//document.getElementById('progId').value = value;
//	document.getElementById('ListForm').action = "/sotukenD/ForUserListServlet";
//	document.getElementById('ListForm').submit();
//}
//function goUserListServletP() {
//	alert("aa");
//	document.getElementById('progId').value = "3";
//	document.getElementById('ListForm').action = "/sotukenD/ForUserListServlet";
//	//document.getElementById('ListForm').submit();
//}
function test(value){
	document.getElementById('mailId').value = value;
	document.getElementById('form').submit()

}


