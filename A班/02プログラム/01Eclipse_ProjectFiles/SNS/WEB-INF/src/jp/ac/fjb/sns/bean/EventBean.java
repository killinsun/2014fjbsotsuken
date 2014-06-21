package jp.ac.fjb.sns.bean;

public class EventBean {
	private String eventId = "";
	private String date = "";
	private String startHour;
	private String finHour;
	private String title = "";
	private String content = "";
	private int timeCount = 0;
	private int endTime = 0;
	private String tempTitle = title;

	public String getStartHour() {
		return startHour;
	}

	public void setStartHour(String startHour) {
		this.startHour = startHour;
	}

	public String getEventId() {
		return eventId;
	}

	public void setEventId(String eventId) {
		this.eventId = eventId;
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

	public String getTempTitle() {
		return tempTitle;
	}

	public void setTempTitle(String tempTitle) {
		this.tempTitle = tempTitle;
	}
}