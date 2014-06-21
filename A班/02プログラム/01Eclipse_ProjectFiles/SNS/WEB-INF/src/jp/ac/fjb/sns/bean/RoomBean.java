package jp.ac.fjb.sns.bean;

public class RoomBean {
	private String roomId="";		// ルームID
	private String userId="";		// 作成者のユーザID
	private String roomName="";		// ルーム名
	private String countId="";		// ルーム内人数

	public String getRoomId() {
		return roomId;
	}

	public void setRoomId(String roomId) {
		this.roomId = roomId;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getRoomName() {
		return roomName;
	}

	public void setRoomName(String roomName) {
		this.roomName = roomName;
	}

	public String getCountId() {
		return countId;
	}

	public void setCountId(String countId) {
		this.countId = countId;
	}

}
