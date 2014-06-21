package jp.ac.fjb.Sotuken.bean;

public class GoodUserBean {
	private String tweetId = "";	//つぶやきID
	private String userId = "";		//つぶやきユーザID
	private String goodUserId = "";	//GoodユーザID
	/**
	 * @return tweetId
	 */
	public String getTweetId() {
		return tweetId;
	}
	/**
	 * @param tweetId セットする tweetId
	 */
	public void setTweetId(String tweetId) {
		this.tweetId = tweetId;
	}
	/**
	 * @return userId
	 */
	public String getUserId() {
		return userId;
	}
	/**
	 * @param userId セットする userId
	 */
	public void setUserId(String userId) {
		this.userId = userId;
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
