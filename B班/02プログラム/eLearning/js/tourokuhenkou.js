// ��ʓǂݍ��݊������̏���
window.addEventListener("load", function () {

	// �t�H�[��
	var form = document.getElementById("tourokuhenkou");

    //���փ{�^���������ꂽ�Ƃ�
    document.getElementById("nextBtn2").addEventListener("click", function () {
		form.action = "tourokukakunin-henkou.html";
    	form.submit();
    }, true);


}, true);

