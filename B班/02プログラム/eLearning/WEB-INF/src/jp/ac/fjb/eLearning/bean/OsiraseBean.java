package jp.ac.fjb.eLearning.bean;

import java.sql.Date;


public class OsiraseBean {
	private String osiraseId = "";	// お知らせID
	private String honbun = "";		// 本文
	private String hiduke = "";		// 日付
	private String userId = "";		// ユーザID

	public String getOsiraseId() {
		return osiraseId;
	}
	public void setOsiraseId(String osiraseId) {
		this.osiraseId = osiraseId;
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
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
}

