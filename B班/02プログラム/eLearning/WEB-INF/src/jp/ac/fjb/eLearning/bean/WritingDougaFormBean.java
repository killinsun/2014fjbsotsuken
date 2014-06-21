package jp.ac.fjb.eLearning.bean;

public class WritingDougaFormBean {
	private String title = ""; //タイトル名格納
	private String douga = "";   //動画格納

	public String getTitle() {
		return title;
	}
	public void setTaitoru(String cntTitle) {
		this.title = cntTitle;
	}

	public String getDouga() {
		return douga;
	}
	public void setDouga(String cntDouga) {
		this.douga = cntDouga;
	}
}
