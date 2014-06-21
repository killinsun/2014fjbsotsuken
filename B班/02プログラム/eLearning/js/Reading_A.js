// ��ʓǂݍ��݊������̏���
window.addEventListener("load", function () {

	// �t�H�[��
	var form = document.getElementById("Aform");

    //���փ{�^���������ꂽ�Ƃ�
    document.getElementById("Rebtn").addEventListener("click", function () {
		form.action = "Reading.jsp";
    	form.submit();
    }, true);


}, true);

