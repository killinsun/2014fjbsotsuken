// ��ʓǂݍ��݊������̏���
window.addEventListener("load", function () {

	// �t�H�[��
	var form = document.getElementById("Dform");

    //�u�̓_������ցv�{�^���������ꂽ�Ƃ�
    document.getElementById("Sbtn").addEventListener("click", function () {
		form.action = "Listening_Lesson1_Answer.html";
    	form.submit();
    }, true);

	//�uListening�ڎ��ցv�{�^���������ꂽ�Ƃ�
	document.getElementById("Rebtn").addEventListener("click", function () {
		form.action = "Listening.html";
    	form.submit();
    }, true);

}, true);

