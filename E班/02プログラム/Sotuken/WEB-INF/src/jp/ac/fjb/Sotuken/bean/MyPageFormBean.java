package jp.ac.fjb.Sotuken.bean;

public class MyPageFormBean {

	private String tweetId = "";		//つぶやきIDを格納する
	private String userId = "";			//ユーザIDを格納する
	private String userName = "";		//ユーザ名を格納する
	private String userIco = "";		//つぶやきユーザのアイコンを格納する
	private String tweet = "";			//つぶやきを格納する
	private String sendTime = "";		//送信した時間を格納する
	private String tweetImg	= "";		//つぶやいた画像を格納する
	private String postId = "";			//部署ID
	private String postName = "";		//部署名



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
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserIco() {
		return userIco;
	}
	public void setUserIco(String userIco) {
		this.userIco = userIco;
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
	public String getPostId() {
		return postId;
	}
	public void setPostId(String postId) {
		this.postId = postId;
	}
	public String getPostName() {
		return postName;
	}
	public void setPostName(String postName) {
		this.postName = postName;
	}


}
