// ��ʓǂݍ��݊������̏���
window.addEventListener("load", function () {

	// �t�H�[��
	var form = document.getElementById("tourokukakunin-ID");

    //���փ{�^���������ꂽ�Ƃ�
    document.getElementById("backBtn3").addEventListener("click", function () {
		form.action = "tourokuhenkou-ID.html";
    	form.submit();
    }, true);
    document.getElementById("touroku2").addEventListener("click", function () {
		form.action = "tourokukanryou.html";
    	form.submit();
    }, true);


}, true);

