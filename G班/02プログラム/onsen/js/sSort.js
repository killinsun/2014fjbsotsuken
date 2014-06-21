function sort(sNo) {
	var form = document.getElementById("sort");
	var sortNo = document.getElementById("sortID");

	//hidden領域の値を選択された商品にカーソルを指定
	sortNo.value = sNo;

	form.submit();
}