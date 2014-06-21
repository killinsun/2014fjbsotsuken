function detail(iNo) {
	var form = document.getElementById("selectForm");
	var itemNo = document.getElementById("syouhinID");

	//hidden領域の値を選択された商品にカーソルを指定
	itemNo.value = iNo;

	form.submit();
}