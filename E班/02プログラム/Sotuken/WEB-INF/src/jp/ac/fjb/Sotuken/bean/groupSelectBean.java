package jp.ac.fjb.Sotuken.bean;

public class groupSelectBean {
	private String userID;		//ユーザID
	private String groupID;		//グループID
	private String groupName;	//グループ名
	private String grouoImg;	//グループ画像
	private String messageID;	//メッセージID
	private String message;		//メッセージ内容
	private String sousinTime;	//送信時間

	public String getUserID() {
		return userID;
	}

	public void setUserID(String userID) {
		this.userID = userID;
	}

	public String getGroupID() {
		return groupID;
	}

	public void setGroupID(String groupID) {
		this.groupID = groupID;
	}

	public String getGroupName() {
		return groupName;
	}

	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}

	public String getGrouoImg() {
		return grouoImg;
	}

	public void setGrouoImg(String grouoImg) {
		this.grouoImg = grouoImg;
	}

	public String getMessageID() {
		return messageID;
	}

	public void setMessageID(String messageID) {
		this.messageID = messageID;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getSousinTime() {
		return sousinTime;
	}

	public void setSousinTime(String sousinTime) {
		this.sousinTime = sousinTime;
	}

}
