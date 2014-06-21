package jp.ac.fjb.sotuken.bean;

public class HenkouBean {
		// ユーザID
	private String huserName = "";		// ユーザ名
	private String huserType = "";		// ユーザ種別
	private String hpassWord = "";		// パスワード
	private String hmailAddress = "";	// メールアドレス
	private String hbirthDay = "";		// 誕生日
	private String haddress = "";		// 住所
	private String hseibetu="";
	private String htell="";
	private String hhurigana="";
	private String hyubin="";

	public String gethUserName() {
		return huserName;
	}

	public void sethUserName(String userName) {
		this.huserName = userName;
	}

	public String gethUserType() {
		return huserType;
	}

	public void sethUserType(String userType) {
		this.huserType = userType;
	}

	public String gethPassWord() {
		return hpassWord;
	}

	public void sethPassWord(String passWord) {
		this.hpassWord = passWord;
	}

	public String gethMailAddress() {
		return hmailAddress;
	}

	public void sethMailAddress(String mailAddress) {
		this.hmailAddress = mailAddress;
	}

	public String gethBirthDay() {
		return hbirthDay;
	}

	public void sethBirthDay(String birthDay) {
		this.hbirthDay = birthDay;
	}

	public String gethAddress() {
		return haddress;
	}

	public void sethAddress(String address) {
		this.haddress = address;
	}

	public String gethSeibetu() {
		return hseibetu;
	}

	public void sethSeibetu(String seibetu) {
		this.hseibetu = seibetu;
	}

	public  String gethTell() {
		return htell;
	}

	public void sethTell(String tell) {
		this.htell = tell;
	}

	public String gethHurigana() {
		return hhurigana;
	}

	public void sethHurigana(String hurigana) {
		this.hhurigana = hurigana;
	}

	public String gethYubin() {
		return hyubin;
	}

	public void sethYubin(String yubin) {
		this.hyubin = yubin;
	}
}
