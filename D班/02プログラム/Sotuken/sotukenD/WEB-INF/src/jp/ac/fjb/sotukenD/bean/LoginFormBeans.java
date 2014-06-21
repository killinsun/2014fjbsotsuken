package jp.ac.fjb.sotukenD.bean;

public class LoginFormBeans {

	private String userID ="";			//ユーザID
	private String userPass = "";		//パスワード
	private String userName = "";		//氏名

	public String getUserId() {
		return userID;
	}
	public void setUserId(String userId) {
		this.userID = userId;
	}

	public String getPassword() {
		return userPass;
	}
	public void setPassword(String password) {
		this.userPass = password;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}


}
