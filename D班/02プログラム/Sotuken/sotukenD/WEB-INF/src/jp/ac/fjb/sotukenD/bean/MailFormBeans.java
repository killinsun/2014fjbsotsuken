package jp.ac.fjb.sotukenD.bean;

public class MailFormBeans {


	private String userId ="";				//ユーザID
	private String userName = "";			//氏名
	private String mailAddress = "";		//メールアドレス
	private String title = "";				//件名
	private String main = "";				//本文
	private String mailId;					//メールID
	private String sendId = "";				//送信ID
	private String receivedId = "";			//受信ID
	private String onClick = "";

	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getMailAddress() {
		return mailAddress;
	}
	public void setMailAddress(String mailAddress) {
		this.mailAddress = mailAddress;
	}

	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}

	public String getMain() {
		return main;
	}
	public void setMain(String main) {
		this.main = main;
	}
	public String getSendId() {
		return sendId;
	}
	public void setSendId(String sendId) {
		this.sendId = sendId;
	}
	public String getReceivedId() {
		return receivedId;
	}
	public void setReceivedId(String receivedId) {
		this.receivedId = receivedId;
	}
	public String getOnClick() {
		return onClick;
	}
	public void setOnClick(String onClick) {
		this.onClick = onClick;
	}
	public String getMailId() {
		return mailId;
	}
	public void setMailId(String mailId) {
		this.mailId = mailId;
	}

}
