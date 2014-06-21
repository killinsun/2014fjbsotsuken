function category(ctg) {
	var form = document.getElementById("category");

	document.forms["searchmenu"].searchKey.value = ctg
	form.submit();
}