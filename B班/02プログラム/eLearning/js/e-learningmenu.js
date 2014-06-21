// ��ʓǂݍ��݊������̏���
window.addEventListener("load", function () {

	// �t�H�[��
	var form = document.getElementById("KyoukaForm");

    //���փ{�^���������ꂽ�Ƃ�
    document.getElementById("Ebtn").addEventListener("click", function () {
    	document.getElementById("KyoukaId").value="KYK0000003";
		form.action = "/eLearning/englishmenuServlet";
    	form.submit();
    }, true);


}, true);

