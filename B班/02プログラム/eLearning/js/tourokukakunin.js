// ��ʓǂݍ��݊������̏���
window.addEventListener("load", function () {

	// �t�H�[��
	var form = document.getElementById("tourokukakunin");

    //�߂�{�^���������ꂽ�Ƃ�
    document.getElementById("backBtn5").addEventListener("click", function () {
		form.action = "touroku.html";
    	form.submit();
    }, true);
    
    //�o�^�{�^���������ꂽ�Ƃ�
    document.getElementById("nextBtn4").addEventListener("click", function () {
		form.action = "tourokukanryou.html";
    	form.submit();
    }, true);
}, true);
