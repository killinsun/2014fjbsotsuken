// ��ʓǂݍ��݊������̏���
window.addEventListener("load", function () {

	// �t�H�[��
	var form = document.getElementById("tourokukakunin-ID");

    //���փ{�^���������ꂽ�Ƃ�
    document.getElementById("nextBtn3").addEventListener("click", function () {
		form.action = "tourokukakunin-ID.html";
    	form.submit();
    }, true);


}, true);

