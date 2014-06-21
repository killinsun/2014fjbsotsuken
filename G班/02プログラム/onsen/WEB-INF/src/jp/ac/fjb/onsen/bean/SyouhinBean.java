package jp.ac.fjb.onsen.bean;

public class SyouhinBean
{
	private String syouhinID = "";		// 商品番号
	private String syouhinName = "";	// 商品名
	private String syouhinzyouhou = "";	// 商品情報
	private String tanka = "";			//単価
	private String imagepass = "";		// 画像パス
	private String chiikicode = "";		// 地域コード


	public String getSyouhinID() {
		return syouhinID;
	}
	public void setSyouhinID(String syouhinID) {
		this.syouhinID = syouhinID;
	}
	public String getSyouhinName() {
		return syouhinName;
	}
	public void setSyouhinName(String syouhinmei) {
		this.syouhinName = syouhinmei;
	}
	public String getSyouhinzyouhou() {
		return syouhinzyouhou;
	}
	public void setSyouhinzyouhou(String syouhinzyouhou) {
		this.syouhinzyouhou = syouhinzyouhou;
	}
	public String getTanka() {
		return tanka;
	}
	public void setTanka(String tabka) {
		this.tanka = tabka;
	}
	public String getImagepass() {
		return imagepass;
	}
	public void setImagepass(String imagepass) {
		this.imagepass = imagepass;
	}
	public String getChiikicode() {
		return chiikicode;
	}
	public void setChiikicode(String chiikicode) {
		this.chiikicode = chiikicode;
	}
}
