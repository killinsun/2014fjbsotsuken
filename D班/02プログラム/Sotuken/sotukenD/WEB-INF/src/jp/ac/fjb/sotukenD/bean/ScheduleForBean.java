package jp.ac.fjb.sotukenD.bean;

public class ScheduleForBean {
	private String ScheduleId = "";
	private String EventTitle = "";
	private String EventContent = "";
	private String EventStart = "";
	private String EventEnd = "";

	public String getScheduleId() {
		return ScheduleId;
	}

	public void setScheduleId(String scheduleId) {
		this.ScheduleId = scheduleId;
	}

	public String getEventName() {
		return EventTitle;
	}

	public void setEventName(String eventName) {
		this.EventTitle = eventName;
	}

	public String getEventContent() {
		return EventContent;
	}

	public void setEventContent(String eventContent) {
		this.EventContent = eventContent;
	}

	public String getEventStart() {
		return EventStart;
	}

	public void setEventStart(String eventStart) {
		this.EventStart = eventStart;
	}

	public String getEventEnd() {
		return EventEnd;
	}

	public void setEventEnd(String eventEnd) {
		this.EventEnd = eventEnd;
	}

}
