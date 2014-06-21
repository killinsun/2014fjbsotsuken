package jp.ac.fjb.Sotuken.bean;

public class MailSakuseiBean {

	private String MailId = ""; //メールID
	private String UserId = ""; //ユーザID
	private String SendAddress = ""; //送信先アドレス
	private String UserAddress = ""; //ユーザアドレス
	private String SubjectLine = ""; //件名
	private String MainLine = ""; //本文
	private String Attach = ""; //添付


	public String getMailId() {
		return MailId;
	}
	public void setMailId(String mailId) {
		MailId = mailId;
	}


	public String getUserId() {
		return UserId;
	}
	public void setUserId(String userId) {
		UserId = userId;
	}


	public String getSubjectLine() {
		return SubjectLine;
	}
	public void setSubjectLine(String subjectLine) {
		SubjectLine = subjectLine;
	}


	public String getMainLine() {
		return MainLine;
	}
	public void setMainLine(String mainLine) {
		MainLine = mainLine;
	}


	public String getAttach() {
		return Attach;
	}

	public void setAttach(String attach) {
		Attach = attach;
	}

	public String getSendAddress() {
		return SendAddress;
	}

	public void setSendAddress(String sendAddress) {
		SendAddress = sendAddress;
	}

	public String getUserAddress() {
		return UserAddress;
	}

	public void setUserAddress(String userAddress) {
		UserAddress = userAddress;
	}


}
