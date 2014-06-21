package jp.ac.fjb.sns.bean;

public class EditProfileFormBean {
	private String profileImg = "";				// プロフィール画像のパス
	private String profileName = "";			// ログインユーザの氏名
	private String profileGender = "";			// ログインユーザの性別
	private String profileBday = "";			// ログインユーザの生年月日
	private String profileAge = "";				// ログインユーザの年齢
	private String profileBType = "";			// ログインユーザの血液型
	private int profileCarrier;					// ログインユーザの在社歴
	private String profileAddress = "";			// ログインユーザの連絡先
	private String profileEmail = "";			// ログインユーザのE-Mail
	private String profileSection = "";			// ログインユーザの所属部署
	private String profilePosition = "";		// ログインユーザの役職
	private String[] profileLanguage = null;	// ログインユーザの使用可能言語
	private String[] profilePLanguage = null;	// ログインユーザの使用可能P言語
	private String[] profileLisence = null;		// ログインユーザの所持資格
	private String[] profileHistory = null;		// ログインユーザの経歴
	private String profileFreeSpace = "";		// ログインユーザの自由欄

	public String getProfileImg() {
		return profileImg;
	}

	public void setProfileImg(String profileImg) {
		this.profileImg = profileImg;
	}

	public String getProfileName() {
		return profileName;
	}

	public void setProfileName(String profileName) {
		this.profileName = profileName;
	}

	public String getProfileGender() {
		return profileGender;
	}

	public void setProfileGender(String profileGender) {
		this.profileGender = profileGender;
	}

	public String getProfileBday() {
		return profileBday;
	}

	public void setProfileBday(String profileBday) {
		this.profileBday = profileBday;
	}

	public String getProfileAge() {
		return profileAge;
	}

	public void setProfileAge(String profileAge) {
		this.profileAge = profileAge;
	}

	public String getProfileBType() {
		return profileBType;
	}

	public void setProfileBType(String profileBType) {
		this.profileBType = profileBType;
	}

	public int getProfileCarrier() {
		return profileCarrier;
	}

	public void setProfileCarrier(int profileCarrier) {
		this.profileCarrier = profileCarrier;
	}

	public String getProfileAddress() {
		return profileAddress;
	}

	public void setProfileAddress(String profileAddress) {
		this.profileAddress = profileAddress;
	}

	public String getProfileEmail() {
		return profileEmail;
	}

	public void setProfileEmail(String profileEmail) {
		this.profileEmail = profileEmail;
	}

	public String getProfileSection() {
		return profileSection;
	}

	public void setProfileSection(String profileSection) {
		this.profileSection = profileSection;
	}

	public String getProfilePosition() {
		return profilePosition;
	}

	public void setProfilePosition(String profilePosition) {
		this.profilePosition = profilePosition;
	}

	public String[] getProfileLanguage() {
		return profileLanguage;
	}

	public void setProfileLanguage(String[] profileLanguage) {
		this.profileLanguage = profileLanguage;
	}

	public String[] getProfilePLanguage() {
		return profilePLanguage;
	}

	public void setProfilePLanguage(String[] profilePLanguage) {
		this.profilePLanguage = profilePLanguage;
	}

	public String[] getProfileLisence() {
		return profileLisence;
	}

	public void setProfileLisence(String[] profileLisence) {
		this.profileLisence = profileLisence;
	}

	public String[] getProfileHistory() {
		return profileHistory;
	}

	public void setProfileHistory(String[] profileHistory) {
		this.profileHistory = profileHistory;
	}

	public String getProfileFreeSpace() {
		return profileFreeSpace;
	}

	public void setProfileFreeSpace(String profileFreeSpace) {
		this.profileFreeSpace = profileFreeSpace;
	}
}