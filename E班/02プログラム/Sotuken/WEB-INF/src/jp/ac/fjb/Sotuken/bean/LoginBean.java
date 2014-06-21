package jp.ac.fjb.Sotuken.bean;

public class LoginBean {

	private String Name= "";			// 名前
	private String Kanaji="";        //フリガナ
	private String Gender  = "";			// 性別
	private String Birthday ="";        //生年月日
	private String  UserId = "";			// ユーザID
	private String  member = "";  			//メンバーID
	private String  PassWord ="";        //PASSWORD
	private String  MailAddress ="";        //メールアドレス
	private String PostCode ="";        //郵便番号
	private String  Shusshin ="";        //出身地
	private String  Busho ="";			//部署
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		this.Name = name;
	}
	public String getKanaji() {
		return Kanaji;
	}
	public void setKanaji(String kanaji) {
		this.Kanaji = kanaji;
	}
	public String getGender() {
		return Gender;
	}
	public void setGender(String gender) {
		this.Gender = gender;
	}
	public String getBirthday() {
		return Birthday;
	}
	public void setBirthday(String birthday) {
		this.Birthday = birthday;
	}
	public String getUserId() {
		return UserId;
	}
	public void setUserId(String userId) {
		this.UserId = userId;
	}
	public String getPassWord() {
		return PassWord;
	}
	public void setPassWord(String passWord) {
		this.PassWord = passWord;
	}
	public String getMailAddress() {
		return MailAddress;
	}
	public void setMailAddress(String mailAddress) {
		this.MailAddress = mailAddress;
	}
	public String getPostCode() {
		return PostCode;
	}
	public void setPostCode(String postCode) {
		this.PostCode = postCode;
	}
	public String getShusshin() {
		return Shusshin;
	}
	public void setShusshin(String shusshin) {
		this.Shusshin = shusshin;
	}
	public String getBusho() {
		return Busho;
	}
	public void setBusho(String busho) {
		this.Busho = busho;
	}
	public String getMember() {
		return member;
	}
	public void setMember(String member) {
		this.member = member;
	}




}
