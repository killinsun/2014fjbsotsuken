package jp.ac.fjb.onsen.bean;

public class OnsenBean
{
	public String getOnsenID() {
		return onsenID;
	}
	public void setOnsenID(String onsenID) {
		this.onsenID = onsenID;
	}
	public String getOnsenzyouhou() {
		return onsenzyouhou;
	}
	public void setOnsenzyouhou(String onsenzyouhou) {
		this.onsenzyouhou = onsenzyouhou;
	}
	public String getOnsensyousaizyouhou() {
		return onsensyousaizyouhou;
	}
	public void setOnsensyousaizyouhou(String onsensyousaizyouhou) {
		this.onsensyousaizyouhou = onsensyousaizyouhou;
	}
	public String getHeyasuu() {
		return heyasuu;
	}
	public void setHeyasuu(String heyasuu) {
		this.heyasuu = heyasuu;
	}
	public String getHigaeri() {
		return higaeri;
	}
	public void setHigaeri(String higaeri) {
		this.higaeri = higaeri;
	}
	public String getSyukuhaku() {
		return syukuhaku;
	}
	public void setSyukuhaku(String syukuhaku) {
		this.syukuhaku = syukuhaku;
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
	public String getCount() {
		return count;
	}
	public void setCount(String count) {
		this.count = count;
	}
	public String getOnsenName() {
		return onsenName;
	}
	public void setOnsenName(String onsenName) {
		this.onsenName = onsenName;
	}
	public void setOnsenTanka(String onsenTanka) {
		this.onsenTanka = onsenTanka;
	}
	private String onsenName = "";		//温泉名
	private String onsenID = "";		// 温泉番号
	private String onsenzyouhou = "";		//温泉情報
	private String onsensyousaizyouhou = "";		//温泉詳細情報
	private String heyasuu = "";	// 部屋数
	private String higaeri = "";	// 日帰り温泉
	private String syukuhaku = "";		//宿泊温泉
	private String imagepass = "";	// 画像パス
	private String chiikicode = "";	// 地域コード
	private String count = "";		//検索回数
	private String onsenTanka = "";		//温泉単価
}