// ��ʓǂݍ��݊������̏���
window.addEventListener("load", function () {

	// �t�H�[��
	var form = document.getElementById("tourokuForm");

    //���փ{�^���������ꂽ�Ƃ�
    document.getElementById("nextBtn").addEventListener("click", function () {
		form.action = "tourokukakunin.html";
    	form.submit();
    }, true);


}, true);

