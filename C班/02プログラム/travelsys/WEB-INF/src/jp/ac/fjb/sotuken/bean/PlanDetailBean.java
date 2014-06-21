package jp.ac.fjb.sotuken.bean;

public class PlanDetailBean {

	private String PlanName = "";		// プラン名
	private String planId = "";			//プランID
	private String AreaName = "";		// 観光地名
	private String AreaImgUrl = ""; 	// イメージ画像URL
	private String AreaComment = "";	// コメント
	private String PlanDateStart = "";	// 予約開始
	private String PlanDateEnd = "";	// 予約終了
	private String StayDate = "";		//宿泊日数
	private String People = "";			// 最大人数
	private String KenName = "";		// 県名


	public String getPlanName() {
		return PlanName;
	}
	public void setPlanName(String planName) {
		PlanName = planName;
	}
	public String getPlanId() {
		return planId;
	}
	public void setPlanId(String planId) {
		this.planId = planId;
	}
	public String getAreaName() {
		return AreaName;
	}
	public void setAreaName(String areaName) {
		AreaName = areaName;
	}
	public String getAreaImgUrl() {
		return AreaImgUrl;
	}
	public void setAreaImgUrl(String areaImgUrl) {
		AreaImgUrl = areaImgUrl;
	}
	public String getAreaComment() {
		return AreaComment;
	}
	public void setAreaComment(String areaComment) {
		AreaComment = areaComment;
	}
	public String getPeople() {
		return People;
	}
	public void setPeople(String people) {
		People = people;
	}
	public String getPlanDateStart() {
		return PlanDateStart;
	}
	public void setPlanDateStart(String planDateStart) {
		PlanDateStart = planDateStart;
	}
	public String getPlanDateEnd() {
		return PlanDateEnd;
	}
	public String getStayDate() {
		return StayDate;
	}
	public void setStayDate(String stayDate) {
		StayDate = stayDate;
	}
	public void setPlanDateEnd(String planDateEnd) {
		PlanDateEnd = planDateEnd;
	}
	public String getKenName() {
		return KenName;
	}
	public void setKenName(String kenName) {
		KenName = kenName;
	}

}
