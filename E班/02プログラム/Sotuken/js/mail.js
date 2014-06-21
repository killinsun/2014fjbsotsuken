
function mailsakusei(){
	location.href = "015mailsakusei.jsp";
}

function statusDisplay(){
	document.getElementById("mt").value = "MT1";
	document.getElementById("form").action = "/Sotuken/MailSakuseiServlet";
	document.getElementById("form").submit();
}

function mailDraft(){
	document.getElementById("mt").value = "MT2";
	document.getElementById("form").action = "/Sotuken/MailSakuseiServlet";
	document.getElementById("form").submit();
}

function mail(){
	location.href = "MailServlet";
}

function mailoutBox(){
	location.href = "MailOutBoxServlet";
}

function maildraftBox(){
	location.href = "MailDraftBoxServlet";
}

function mailtrashBox(){
	location.href = "MailTrashBoxServlet";
}
function mailkakunin(mailId){
	//alert(mailId);
	document.getElementById("MailId").value = mailId;
	document.getElementById("form").action = "/Sotuken/ContentDisplayServlet";
	document.getElementById("form").submit();
	//location.href = "ContentDisplayServlet";
}
function deletemoveClick(){
	document.getElementById("progId").value = "1";

	document.getElementById("form").action= "MailServlet";
	document.getElementById("form").submit();

	//alert(document.getElementById("progId").value);

}
function deletemoveClick2(){
	document.getElementById("progId").value = "2";

	document.getElementById("form").action= "MailOutBoxServlet";
	document.getElementById("form").submit();

	///alert(document.getElementById("progId").value);

}
function deletemoveClick3(){
	document.getElementById("progId").value = "3";

	document.getElementById("form").action= "MailDraftBoxServlet";
	document.getElementById("form").submit();

	//alert(document.getElementById("progId").value);

}
function deleteClick(){
	document.getElementById("progId").value = "4";

	document.getElementById("form").action= "MailTrashBoxServlet";
	document.getElementById("form").submit();

	//alert(document.getElementById("progId").value);

}


