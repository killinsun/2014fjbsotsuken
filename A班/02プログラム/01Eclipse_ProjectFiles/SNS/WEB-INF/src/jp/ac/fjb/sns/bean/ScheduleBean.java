package jp.ac.fjb.sns.bean;

public class ScheduleBean {
	private String userId = "";
	private String scheduleId = "";
	private String date = "";
	private String startHour;
	private String finHour;
	private String title = "";
	private String content = "";
	private int timeCount = 0;
	private int endTime = 0;
	private String tmpTitle = "";

	public String getStartHour() {
		return startHour;
	}

	public void setStartHour(String startHour) {
		this.startHour = startHour;
	}

	public String getScheduleId() {
		return scheduleId;
	}

	public void setScheduleId(String scheduleId) {
		this.scheduleId = scheduleId;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getFinHour() {
		return finHour;
	}

	public void setFinHour(String finHour) {
		this.finHour = finHour;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public int getTimeCount() {
		return timeCount;
	}

	public void setTimeCount(int timeCount) {
		this.timeCount = timeCount;
	}

	public int getEndTime() {
		return endTime;
	}

	public void setEndTime(int endTime) {
		this.endTime = endTime;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getTmpTitle() {
		return tmpTitle;
	}

	public void setTmpTitle(String tmpTitle) {
		this.tmpTitle = tmpTitle;
	}
}
