package jp.ac.fjb.sotuken.bean;

public class PlanKeywordBean {

	private String PlanKeyword = "";	// プランキーワード
	private String PlanName = "";	// プラン名
	private String planId;			// プランID
	private String Star = "";		// 評価
	private String Comment = "";	// コメント
	private String ImgUrl = "";		// イメージ画像URL
	private String DefaultFee = "";	// デフォルト料金

	public String getPlanKeyword() {
		return PlanKeyword;
	}
	public void setPlanKeyword(String planKeyword) {
		PlanKeyword = planKeyword;
	}

	public String getPlanName() {
		return PlanName;
	}
	public void setPlanName(String planName) {
		this.PlanName = planName;
	}
	public String getPlanId() {
		return planId;
	}
	public void setPlanId(String planId) {
		this.planId = planId;
	}
	public String getStar() {
		return Star;
	}
	public void setStar(String star) {
		Star = star;
	}
	public String getComment() {
		return Comment;
	}
	public void setComment(String comment) {
		Comment = comment;
	}
	public String getImgUrl() {
		return ImgUrl;
	}
	public void setImgUrl(String imgUrl) {
		this.ImgUrl = imgUrl;
	}
	public String getDefaultFee() {
		return DefaultFee;
	}
	public void setDefaultFee(String defaultFee) {
		DefaultFee = defaultFee;
	}


}
