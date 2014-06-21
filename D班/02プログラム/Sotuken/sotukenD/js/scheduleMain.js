function dayClick(value1,value2) {
	document.getElementById("x").value=value1;
	document.getElementById("y").value=value2;
	document.getElementById("form").action = "/sotukenD/ForScheduleConServlet";
	document.getElementById("form").submit();
}

function prevClick(value1,value2) {
	document.getElementById("year").value=value1;
	document.getElementById("monthA").value=value2;
	document.getElementById("form").action = "#";
	document.getElementById("form").submit();
}



