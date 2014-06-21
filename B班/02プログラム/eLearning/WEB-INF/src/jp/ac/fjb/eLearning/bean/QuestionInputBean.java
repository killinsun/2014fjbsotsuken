package jp.ac.fjb.eLearning.bean;

public class QuestionInputBean {
	private String Title = "";
	private String Tangen = "";
	private String userKaitou = "";
	private String Kaitou = "";
	private String Mondai = "";
	private String Kaisetsu = "";
	private int Tensu ;

	public String getTitle() {
		return Title;
	}

	public String getTangen() {
		return Tangen;
	}

	public void setTangen(String tangen) {
		Tangen = tangen;
	}

	public void setTitle(String title) {
		Title = title;
	}

	public String getUserKaitou() {
		return userKaitou;
	}

	public void setUserKaitou(String userKaitou) {
		this.userKaitou = userKaitou;
	}

	public String getKaitou() {
		return Kaitou;
	}

	public void setKaitou(String kaitou) {
		Kaitou = kaitou;
	}

	public String getMondai() {
		return Mondai;
	}

	public void setMondai(String mondai) {
		Mondai = mondai;
	}

	public String getKaisetsu() {
		return Kaisetsu;
	}

	public void setKaisetsu(String kaisetsu) {
		Kaisetsu = kaisetsu;
	}

	public int getTensu() {
		return Tensu;
	}

	public void setTensu(int tensu) {
		Tensu = tensu;
	}

}
