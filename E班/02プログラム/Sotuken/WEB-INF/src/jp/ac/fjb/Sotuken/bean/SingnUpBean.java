package jp.ac.fjb.Sotuken.bean;

public class SingnUpBean {

	private String  UserId = "";			// ユーザID
	private String Name= "";			// 名前
	private String Kanaji="";        //フリガナ
	private String Gender  = "";			// 性別
	private String Birthday ="";        //生年月日
	private String  MemberId = "";			// メンバーID
	private String  PassWord ="";        //PASSWORD
	private String PassWord2 = "";			// PASSWORD2
	private String  MailAddress ="";        //メールアドレス
	private String PostCode ="";        //郵便番号
	private String  Shusshin ="";        //出身地
	private String  Busho ="";			//部署

	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getKanaji() {
		return Kanaji;
	}
	public void setKanaji(String kanaji) {
		Kanaji = kanaji;
	}
	public String getGender() {
		return Gender;
	}
	public void setGender(String gender) {
		Gender = gender;
	}
	public String getBirthday() {
		return Birthday;
	}
	public void setBirthday(String birthday) {
		Birthday = birthday;
	}
	public String getMemberId() {
		return MemberId;
	}
	public void setMemberId(String memberid) {
		MemberId = memberid;
	}
	public String getPassWord() {
		return PassWord;
	}
	public void setPassWord(String passWord) {
		PassWord = passWord;
	}
	public String getPassWord2() {
		return PassWord2;
	}
	public void setPassWord2(String passWord2) {
		PassWord2 = passWord2;
	}
	public String getMailAddress() {
		return MailAddress;
	}
	public void setMailAddress(String mailAddress) {
		MailAddress = mailAddress;
	}
	public String getPostCode() {
		return PostCode;
	}
	public void setPostCode(String postCode) {
		PostCode = postCode;
	}
	public String getShusshin() {
		return Shusshin;
	}
	public void setShusshin(String shusshin) {
		Shusshin = shusshin;
	}
	public String getBusho() {
		return Busho;
	}
	public void setBusho(String busho) {
		Busho = busho;
	}
	public String getUserId() {
		return UserId;
	}
	public void setUserId(String userId) {
		UserId = userId;
	}

}
