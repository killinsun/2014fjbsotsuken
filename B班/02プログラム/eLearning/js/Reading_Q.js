// ��ʓǂݍ��݊������̏���
window.addEventListener("load", function () {

	// �t�H�[��
	var form = document.getElementById("Fform");

    //���փ{�^���������ꂽ�Ƃ�
    document.getElementById("Sbtn").addEventListener("click", function () {
		form.action = "Reading_SaitenServlet";
    	form.submit();
    }, true);


}, true);

