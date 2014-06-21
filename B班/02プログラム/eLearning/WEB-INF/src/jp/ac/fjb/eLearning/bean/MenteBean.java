package jp.ac.fjb.eLearning.bean;

import java.sql.Date;


public class MenteBean {
	private String menteId = "";	// メンテナンスID
	private String honbun = "";		// 本文
	private String hiduke = "";		// 日付
	public String getMenteId() {
		return menteId;
	}
	public void setMenteId(String menteId) {
		this.menteId = menteId;
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