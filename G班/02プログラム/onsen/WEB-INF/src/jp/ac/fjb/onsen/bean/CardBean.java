package jp.ac.fjb.onsen.bean;

public class CardBean
{

	private String cardID = "";		// カード番号
	private String userID = "";		//ユーザーID
	private String card = "";	// カード種類
	private String cardName = "";	// カード名義
	private String cardlimit = "";		//有効期限
	private String sequrity = "";		//有効期限
	public String getSequrity() {
		return sequrity;
	}
	public void setSequrity(String sequrity) {
		this.sequrity = sequrity;
	}
	public String getCardID() {
		return cardID;
	}
	public void setCardID(String cardID) {
		this.cardID = cardID;
	}
	public String getUserID() {
		return userID;
	}
	public void setUserID(String userID) {
		this.userID = userID;
	}
	public String getCard() {
		return card;
	}
	public void setCard(String card) {
		this.card = card;
	}
	public String getCardName() {
		return cardName;
	}
	public void setCardName(String cardName) {
		this.cardName = cardName;
	}
	public String getCardlimit() {
		return cardlimit;
	}
	public void setCardlimit(String cardlimit) {
		this.cardlimit = cardlimit;
	}
}