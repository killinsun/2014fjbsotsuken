function updateClick(value) {
	document.getElementById("scheduleId").value=value;
	document.getElementById("buttonId").value="0";
	document.getElementById("form").action = "/sotukenD/ForScheduleEditServlet";
	document.getElementById("form").submit();
}

function deleteClick(value) {
	document.getElementById("scheduleId").value=value;
	document.getElementById("buttonId").value="1";
	document.getElementById("form").action = "/sotukenD/ForScheduleEditServlet";
	document.getElementById("form").submit();
}

function insertClick() {
	document.getElementById("buttonId").value="2";
	document.getElementById("form").action = "/sotukenD/ForScheduleEditServlet";
	document.getElementById("form").submit();
}


