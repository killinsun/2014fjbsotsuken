// ��ʓǂݍ��݊������̏���
window.addEventListener("load", function () {

	// �t�H�[��
	var form = document.getElementById("WAform");
	var kamokuID = document.getElementById("kamokuID");

    //���փ{�^���������ꂽ�Ƃ�
    document.getElementById("Rebtn").addEventListener("click", function () {
		form.action = "/eLearning/WritingServlet";
		kamokuID.value = "KMK0000002";
    	form.submit();
    }, true);


}, true);

