window.addEventListener("load", function () {

	var form = document.getElementById("WDform");

    document.getElementById("Testbtn").addEventListener("click", function () {
		form.action = "/eLearning/SetQuestionServlet"; //飛び先のサーブレットを記入する
    	form.submit();
    }, true);

	document.getElementById("Rebtn").addEventListener("click", function () {
		form.action = "/eLearning/Writing.jsp";
    	form.submit();
    }, true);

	document.getElementById("Dougabtn").addEventListener("click", function () {
		form.action = "/eLearning/Writing.jsp";
    	form.submit();
    	}, true);

}, true);

