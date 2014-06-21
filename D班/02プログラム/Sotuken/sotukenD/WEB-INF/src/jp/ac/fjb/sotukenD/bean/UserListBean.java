package jp.ac.fjb.sotukenD.bean;

public class UserListBean {
	private String listUserId = "";	// ユーザーId
	private String listUserName = "";	// ユーザーの名前
	private String listUserAddress = ""; //メアド取得

	public String getListUserId() {
		return listUserId;
	}
	public void setListUserId(String listUserId) {
		this.listUserId = listUserId;
	}
	public String getListUserName() {
		return listUserName;
	}
	public void setListUserName(String listUserName) {
		this.listUserName = listUserName;
	}
	public String getListUserAddress() {
		return listUserAddress;
	}
	public void setListUserAddress(String listUserAddress) {
		this.listUserAddress = listUserAddress;
	}
}
