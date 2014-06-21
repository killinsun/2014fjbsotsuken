package jp.ac.fjb.eLearning.bean;

import java.sql.Date;


public class NewsBean {
	private String newsId = "";	// ニュースID
	private String honbun = "";		// 本文
	private String hiduke = "";		// 日付

	public String getNewsId() {
		return newsId;
	}
	public void setNewsId(String newsId) {
		this.newsId = newsId;
	}
	public String getHonbun() {
		return honbun;
	}
	public void setHonbun(String honbun) {
		this.honbun = honbun;
	}
	public String getHiduke() {
		return hiduke;
	}
	public void setHiduke(String hiduke) {
		this.hiduke = hiduke;
	}

}