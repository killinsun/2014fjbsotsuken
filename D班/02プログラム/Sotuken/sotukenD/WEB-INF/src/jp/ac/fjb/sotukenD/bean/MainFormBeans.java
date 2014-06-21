package jp.ac.fjb.sotukenD.bean;

public class MainFormBeans {

	private String mailId = "";				//メールID
	private String userId = "";				//ユーザID
	private String userName = "";			//ユーザ名
	private String mailAddress = "";		//メールアドレス
	private String title = "";				//件名
	private String mailFlag = "0";			//読了フラグ
	private String sendId = "";				//送信ID
	private String receivedId = "";			//受信ID
	private String time = "";				//時間

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
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public String getMailFlag() {
		return mailFlag;
	}
	public void setMailFlag(String mailFlag) {
		this.mailFlag = mailFlag;
	}
	public String getMailId() {
		return mailId;
	}
	public void setMailId(String mailId) {
		this.mailId = mailId;
	}

}
