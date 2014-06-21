// ��ʓǂݍ��݊������̏���
window.addEventListener("load", function () {

	// �t�H�[��
	var form = document.getElementById("WQform");

    //���փ{�^���������ꂽ�Ƃ�
	document.getElementById("Ibtn").addEventListener("click", function () {
		form.action = "SetAnswerServlet";
    	form.submit();
    }, true);

	document.getElementById("Wbtn").addEventListener("click", function () {
		form.action = "/eLearning/Writing.jsp";
    	form.submit();
    }, true);

}, true);

