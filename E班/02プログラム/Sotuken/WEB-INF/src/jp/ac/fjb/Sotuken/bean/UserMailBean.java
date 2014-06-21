package jp.ac.fjb.Sotuken.bean;

public class UserMailBean {

	private String MailId = "";//メールIDの取得
	private String UserId = "";//ユーザIDの取得
	private String SendAddress = "";//受信先アドレスの取得
	private String UserAddress = "";//送信先アドレスの取得
	private String UserName = "";//名前の取得
	private String SubjectLine = "";//件名の取得
	private String MainLine = "";//本文の取得
	private String Attach = "";//添付ファイルの取得
	private String ReceiptTime = "";//保存日時の取得
	private String SendTime = "";//送信日時の取得
	private String ClassId = "";//種別IDの取得（0,送信 1,受信 2,下書き 3,ゴミ箱)


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


	public String getSendAddress() {
		return getSendAddress();
	}
	public void setSendAddress(String sendAddress) {
		SendAddress = sendAddress;
	}


	public String getUserName() {
		return UserName;
	}
	public void setUserName(String userName) {
		UserName = userName;
	}

	public String getUserAddress() {
		return UserAddress;
	}
	public void setUserAddress(String userAddress) {
		UserAddress = userAddress;
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


	public String getReceiptTime() {
		return ReceiptTime;
	}
	public void setReceiptTime(String receiptTime) {
		ReceiptTime = receiptTime;
	}


	public String getSendTime() {
		return SendTime;
	}
	public void setSendTime(String sendTime) {
		SendTime = sendTime;
	}


	public String getClassId() {
		return ClassId;
	}
	public void setClassId(String classId) {
		ClassId = classId;
	}


}
