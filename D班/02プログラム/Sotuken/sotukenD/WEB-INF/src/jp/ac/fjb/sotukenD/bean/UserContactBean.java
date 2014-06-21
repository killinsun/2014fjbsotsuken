package jp.ac.fjb.sotukenD.bean;

public class UserContactBean {
	private String contactUserId = "";	// ユーザーId
	private String contactUserName = "";	// ユーザーの名前
	private String contactUserTell = "";	// ユーザーの電話番号

	public String getContactUserId() {
		return contactUserId;
	}
	public void setContactUserId(String contactUserId) {
		this.contactUserId = contactUserId;
	}
	public String getContactUserName() {
		return contactUserName;
	}
	public void setContactUserName(String contactUserName) {
		this.contactUserName = contactUserName;
	}
	public String getContactUserTell() {
		return contactUserTell;
	}
	public void setContactUserTell(String contactUserTell) {
		this.contactUserTell = contactUserTell;
	}


}
