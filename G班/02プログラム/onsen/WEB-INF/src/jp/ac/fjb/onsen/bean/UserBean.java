package jp.ac.fjb.onsen.bean;

public class UserBean
{
	public String getUserID() {
		return userID;
	}
	public void setUserID(String userID) {
		this.userID = userID;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	public String getSei() {
		return sei;
	}
	public void setSei(String sei) {
		this.sei = sei;
	}
	public String getMei() {
		return mei;
	}
	public void setMei(String mei) {
		this.mei = mei;
	}
	public String getSeiKana() {
		return seiKana;
	}
	public void setSeiKana(String seiKana) {
		this.seiKana = seiKana;
	}
	public String getMeiKana() {
		return meiKana;
	}
	public void setMeiKana(String meiKana) {
		this.meiKana = meiKana;
	}
	public String getSeibetu() {
		return seibetu;
	}
	public void setSeibetu(String seibetu) {
		this.seibetu = seibetu;
	}
	public String getSeinengappi() {
		return seinengappi;
	}
	public void setSeinengappi(String seinengappi) {
		this.seinengappi = seinengappi;
	}
	public String getYubin() {
		return yubin;
	}
	public void setYubin(String yubin) {
		this.yubin = yubin;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getTodouhuken() {
		return todouhuken;
	}
	public void setTodouhuken(String todouhuken) {
		this.todouhuken = todouhuken;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getAddress2() {
		return address2;
	}
	public void setAddress2(String address2) {
		this.address2 = address2;
	}
	private String userID = "";		// ユーザーID
	private String pass = "";		// パスワード
	private String sei = "";			// 姓
	private String mei = "";			// 名
	private String seiKana = "";		// フリガナ姓
	private String meiKana = "";		// フリガナ名
	private String seibetu = "";		// 性別
	private String seinengappi = "";	// 生年月日
	private String yubin = "";			// 郵便番号
	private String mail = "";			// メールアドレス
	private String tel = "";			// 電話番号
	private String todouhuken = "";		// 都道府県
	private String address = "";		// 市町村区
	private String address2 = "";		// 番地
}
