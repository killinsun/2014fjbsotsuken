package jp.ac.fjb.eLearning.bean;

public class UserBean {
	private String userId = "";			// ユーザID
	private String passWord = "";		// パスワード
	private String userName = "";		// ユーザ名
	private String userMyouzi = "";		//ユーザ苗字
	private String userSei = "";		//せい
	private String userMei = "";		//めい
	private String mailAddress = "";	//メールアドレス
	private String birthDay = "";		//生年月日
	private String userType = "0";		//ユーザ性別
	private String ubinbangou = "";		//郵便番号
	private String todouhuken = "";		//都道府県
	private String sikutyouson = "0";	//市区町村
	private String banti = "0";			//番地
	private String tatemonoName = "";	//建物名・室名

	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getPassWord() {
		return passWord;
	}
	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserMyouzi() {
		return userMyouzi;
	}
	public void setUserMyouzi(String userMyouzi) {
		this.userMyouzi = userMyouzi;
	}
	public String getUserSei() {
		return userSei;
	}
	public void setUserSei(String userSei) {
		this.userSei = userSei;
	}
	public String getUserMei() {
		return userMei;
	}
	public void setUserMei(String userMei) {
		this.userMei = userMei;
	}
	public String getMailAddress() {
		return mailAddress;
	}
	public void setMailAddress(String mailAddress) {
		this.mailAddress = mailAddress;
	}
	public String getBirthDay() {
		return birthDay;
	}
	public void setBirthDay(String birthDay) {
		this.birthDay = birthDay;
	}
	public String getUserType() {
		return userType;
	}
	public void setUserType(String userType) {
		this.userType = userType;
	}
	public String getUbinbangou() {
		return ubinbangou;
	}
	public void setUbinbangou(String ubinbangou) {
		this.ubinbangou = ubinbangou;
	}
	public String getTodouhuken() {
		return todouhuken;
	}
	public void setTodouhuken(String todouhuken) {
		this.todouhuken = todouhuken;
	}
	public String getSikutyouson() {
		return sikutyouson;
	}
	public void setSikutyouson(String sikutyouson) {
		this.sikutyouson = sikutyouson;
	}
	public String getBanti() {
		return banti;
	}
	public void setBanti(String banti) {
		this.banti = banti;
	}
	public String getTatemonoName() {
		return tatemonoName;
	}
	public void setTatemonoName(String tatemonoName) {
		this.tatemonoName = tatemonoName;
	}

}