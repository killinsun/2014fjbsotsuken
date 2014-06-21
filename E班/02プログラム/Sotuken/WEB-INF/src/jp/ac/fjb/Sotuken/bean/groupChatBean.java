package jp.ac.fjb.Sotuken.bean;

public class groupChatBean{

	private String groupID;
	private String groupName;
	private String userID;
	private String userName;
	private String userGazou;
	private String messageID;
	private String maxMessageID;
	private String message;
	private String stampID;
	private String stampGazou;
	private String chatGazou;

	public String getGroupName() {
		return groupName;
	}

	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserGazou() {
		return userGazou;
	}

	public void setUserGazou(String userGazou) {
		this.userGazou = userGazou;
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

	public String getChatGazou() {
		return chatGazou;
	}

	public void setChatGazou(String chatGazou) {
		this.chatGazou = chatGazou;
	}

	public String getMaxMessageID() {
		return maxMessageID;
	}

	public void setMaxMessageID(String maxMessageID) {
		this.maxMessageID = maxMessageID;
	}

	public String getStampID() {
		return stampID;
	}

	public void setStampID(String stampID) {
		this.stampID = stampID;
	}

	public String getStampGazou() {
		return stampGazou;
	}

	public void setStampGazou(String stampGazou) {
		this.stampGazou = stampGazou;
	}

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

}