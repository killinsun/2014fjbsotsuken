function category(ctg) {
	var form = document.getElementById("searchmenu");

	document.forms["searchmenu"].searchKey.value = ctg
	form.submit();
}