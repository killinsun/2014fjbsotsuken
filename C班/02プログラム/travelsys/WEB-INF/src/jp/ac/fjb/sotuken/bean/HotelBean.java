package jp.ac.fjb.sotuken.bean;

public class HotelBean {
	private String hotelId;			//ホテルID
	private String hotelName;		//ホテル名
	private String furigana;		//フリガナ
	private String address;			//住所
	private String tel;				//電話番号
	private String postNum;			//郵便番号
	private String mail;			//メール
	private String kankochiId;		//観光地ID
	private String keyword;			//キーワード
	private String price;			//料金(宿泊)
	private String defaultPrice;	//デフォルト料金
	private String comment;			//コメント
	private String image;			//イメージ画像URL
	private String checkinStart;	//チェックイン
	private String checkinRemit;	//チェックアウト
	private String StayDate = "";	//宿泊日数


	public String getHotelId() {
		return hotelId;
	}
	public void setHotelId(String hotelId) {
		this.hotelId = hotelId;
	}
	public String getHotelName() {
		return hotelName;
	}
	public void setHotelName(String hotelName) {
		this.hotelName = hotelName;
	}
	public String getFurigana() {
		return furigana;
	}
	public void setFurigana(String furigana) {
		this.furigana = furigana;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getPostNum() {
		return postNum;
	}
	public void setPostNum(String postNum) {
		this.postNum = postNum;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public String getKankochiId() {
		return kankochiId;
	}
	public void setKankochiId(String kankochiId) {
		this.kankochiId = kankochiId;
	}
	public String getKeyword() {
		return keyword;
	}
	public void setKeyword(String keyword) {
		this.keyword = keyword;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public String getDefaultPrice() {
		return defaultPrice;
	}
	public void setDefaultPrice(String defaultPrice) {
		this.defaultPrice = defaultPrice;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public String getCheckinStart() {
		return checkinStart;
	}
	public void setCheckinStart(String checkinStart) {
		this.checkinStart = checkinStart;
	}
	public String getCheckinRemit() {
		return checkinRemit;
	}
	public void setCheckinRemit(String checkinRemit) {
		this.checkinRemit = checkinRemit;
	}
	public String getStayDate() {
		return StayDate;
	}
	public void setStayDate(String stayDate) {
		StayDate = stayDate;
	}
}
