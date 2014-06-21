package jp.ac.fjb.sotuken.bean;

public class CommentBean {
	private String CommentBbsNo;			//掲示板No
	private String commentNo;			//コメントナンバー
	private String commentUserName;		//コメント投稿者名
	private String star;				//評価
	private String commentTime;			//コメント投稿日時
	private String commentSt;			//コメント文

	public String getCommentNo() {
		return commentNo;
	}
	public void setCommentNo(String commentNo) {
		this.commentNo = commentNo;
	}
	public String getCommentUserName() {
		return commentUserName;
	}
	public void setCommentUserName(String commentUserName) {
		this.commentUserName = commentUserName;
	}
	public String getStar() {
		return star;
	}
	public void setStar(String star) {
		this.star = star;
	}
	public String getCommentTime() {
		return commentTime;
	}
	public void setCommentTime(String commentTime) {
		this.commentTime = commentTime;
	}
	public String getCommentSt() {
		return commentSt;
	}
	public void setCommentSt(String commentSt) {
		this.commentSt = commentSt;
	}
	public String getCommentBbsNo() {
		return CommentBbsNo;
	}
	public void setCommentBbsNo(String commentBbsNo) {
		CommentBbsNo = commentBbsNo;
	}

}
