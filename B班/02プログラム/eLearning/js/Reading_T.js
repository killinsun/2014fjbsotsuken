// ��ʓǂݍ��݊������̏���
window.addEventListener("load", function () {

	// �t�H�[��
	var form = document.getElementById("Bform");

    //���փ{�^���������ꂽ�Ƃ�
    document.getElementById("Rebtn").addEventListener("click", function () {
		form.action = "Reading.html";
    	form.submit();
    }, true);


}, true);

