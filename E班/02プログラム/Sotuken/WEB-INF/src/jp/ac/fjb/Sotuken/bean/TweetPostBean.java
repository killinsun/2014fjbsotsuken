package jp.ac.fjb.Sotuken.bean;

public class TweetPostBean {

	private String tweetId = "";		//つぶやきIDを格納する
	private String userId = "";			//ユーザIDを格納する
	private String tweet = "";			//つぶやきを格納する
	private String sendTime = "";		//送信した時間を格納する
	private String tweetImg	= "";		//つぶやいた画像を格納する
	private String goodUserId = "";		//GoodユーザIDを格納する


	public String getTweetId() {
		return tweetId;
	}
	public void setTweetId(String tweetId) {
		this.tweetId = tweetId;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getTweet() {
		return tweet;
	}
	public void setTweet(String tweet) {
		this.tweet = tweet;
	}
	public String getSendTime() {
		return sendTime;
	}
	public void setSendTime(String sendTime) {
		this.sendTime = sendTime;
	}
	public String getTweetImg() {
		return tweetImg;
	}
	public void setTweetImg(String tweetImg) {
		this.tweetImg = tweetImg;
	}
	/**
	 * @return goodUserId
	 */
	public String getGoodUserId() {
		return goodUserId;
	}
	/**
	 * @param goodUserId セットする goodUserId
	 */
	public void setGoodUserId(String goodUserId) {
		this.goodUserId = goodUserId;
	}




}
