// ��ʓǂݍ��݊������̏���
window.addEventListener("load", function () {

	// �t�H�[��
	var form = document.getElementById("Eform");

    //���փ{�^���������ꂽ�Ƃ�
    document.getElementById("Rbtn").addEventListener("click", function () {
		form.action = "Listening_Lesson1.html";
    	form.submit();
    }, true);

	  document.getElementById("Rebtn").addEventListener("click", function () {
		form.action = "Listening.html";
    	form.submit();
    }, true);

}, true);

