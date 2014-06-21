package jp.ac.fjb.sns.bean;

public class OutputSearchResultBean {

	private String resultUserId = "";		// ユーザを識別するID
	private String resultUserName = "";		// 検索結果「氏名」表示用
	private String resultGender = "";		// 検索結果「性別」表示用
	private String sectionName = "";		// 部署名(ALT属性用)
	private String resultSectionImg = "";	// 検索結果「部署IMG」表示用
	private String levelName = "";			// レベル名(ALT属性用)
	private String resultLevelImg = "";		// 検索結果「レベルIMG」表示用
	private String resultCarrier = "";		// 検索結果「在社歴」表示用

	public String getResultUserName() {
		return resultUserName;
	}

	public void setResultUserName(String resultUserName) {
		this.resultUserName = resultUserName;
	}

	public String getResultGender() {
		return resultGender;
	}

	public void setResultGender(String resultGender) {
		this.resultGender = resultGender;
	}

	public String getSectionName() {
		return sectionName;
	}

	public void setSectionName(String sectionName) {
		this.sectionName = sectionName;
	}

	public String getResultSectionImg() {
		return resultSectionImg;
	}

	public void setResultSectionImg(String resultSectionImg) {
		this.resultSectionImg = resultSectionImg;
	}

	public String getLevelName() {
		return levelName;
	}

	public void setLevelName(String levelName) {
		this.levelName = levelName;
	}

	public String getResultLevelImg() {
		return resultLevelImg;
	}

	public void setResultLevelImg(String resultLevelImg) {
		this.resultLevelImg = resultLevelImg;
	}

	public String getResultCarrier() {
		return resultCarrier;
	}

	public void setResultCarrier(String resultCarrier) {
		this.resultCarrier = resultCarrier;
	}

	public String getResultUserId() {
		return resultUserId;
	}

	public void setResultUserId(String resultUserId) {
		this.resultUserId = resultUserId;
	}
}
