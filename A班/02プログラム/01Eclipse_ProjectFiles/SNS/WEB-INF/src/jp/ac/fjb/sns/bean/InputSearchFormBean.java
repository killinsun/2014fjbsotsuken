package jp.ac.fjb.sns.bean;

public class InputSearchFormBean {

	private String userName = "";			// 検索キーワード「氏名」
	private String gender = "";				// 検索キーワード「性別」
	private String age = "";				// 検索キーワード「年齢」
	private String section = "";			// 検索キーワード「所属部署」
	private String carrier;					// 検索キーワード「在社歴」
	private String freeSpace = "";			// 検索キーワード「フリーワード」
	private String[] lisence = null;		// 検索キーワード「所持資格」

	private String roomName = "";			// 新規に作成した部屋名

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getSection() {
		return section;
	}

	public void setSection(String section) {
		this.section = section;
	}

	public String getCarrier() {
		return carrier;
	}

	public void setCarrier(String carrier) {
		this.carrier = carrier;
	}

	public String getFreeSpace() {
		return freeSpace;
	}

	public void setFreeSpace(String freeSpace) {
		this.freeSpace = freeSpace;
	}

	public String[] getLisence() {
		return lisence;
	}

	public void setLisence(String[] lisence) {
		this.lisence = lisence;
	}

	public String getRoomName() {
		return roomName;
	}

	public void setRoomName(String roomName) {
		this.roomName = roomName;
	}
}