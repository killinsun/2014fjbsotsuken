// ��ʓǂݍ��݊������̏���
window.addEventListener("load", function () {

	// �t�H�[��
	var form = document.getElementById("tourokukakunin-henkou");

    //���փ{�^���������ꂽ�Ƃ�
    document.getElementById("backBtn2").addEventListener("click", function () {
		form.action = "tourokuhenkou.html";
    	form.submit();
    }, true);
    //�o�^�{�^���������ꂽ�Ƃ�
    document.getElementById("touroku").addEventListener("click", function () {
		form.action = "tourokukanryou2.html";
    	form.submit();
    }, true);


}, true);

