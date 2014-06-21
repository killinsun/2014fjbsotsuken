package jp.ac.fjb.sotuken.bean;

public class HotelChangeBean {


	private String HotelImgUrl = ""; 	// イメージ画像URL
	private String HotelComment = "";	// コメント
	private String HotelName = ""; 		// ホテル名
	private String CheckinStart = "";	// チェックイン時間
	private String CheckinEnd="";		// チェックイン終了時間
	private String StayDate = ""; 		// 宿泊日数
	private String StayFee = "";		// 料金
	private String DefaultFee = "";		// デフォルト料金


	public String getHotelImgUrl() {
		return HotelImgUrl;
	}
	public void setHotelImgUrl(String hotelImgUrl) {
		HotelImgUrl = hotelImgUrl;
	}
	public String getHotelComment() {
		return HotelComment;
	}
	public void setHotelComment(String hotelComment) {
		HotelComment = hotelComment;
	}
	public String getHotelName() {
		return HotelName;
	}
	public void setHotelName(String hotelName) {
		HotelName = hotelName;
	}

	public String getStayDate() {
		return StayDate;
	}
	public void setStayDate(String stayDate) {
		StayDate = stayDate;
	}
	public String getStayFee() {
		return StayFee;
	}
	public void setStayFee(String stayFee) {
		StayFee = stayFee;
	}
	public String getDefaultFee() {
		return DefaultFee;
	}
	public void setDefaultFee(String defaultFee) {
		DefaultFee = defaultFee;
	}
	public void setCheckinStart(String checkinStart) {
		CheckinStart = checkinStart;
	}

	public String getCheckinStart() {
		return CheckinStart;
	}
	public String getCheckinEnd() {
		return CheckinEnd;
	}
	public void setCheckinEnd(String checkinEnd) {
		CheckinEnd = checkinEnd;
	}


}
