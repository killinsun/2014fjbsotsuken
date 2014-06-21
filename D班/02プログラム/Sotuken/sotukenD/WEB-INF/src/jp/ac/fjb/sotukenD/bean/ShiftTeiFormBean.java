package jp.ac.fjb.sotukenD.bean;

public class ShiftTeiFormBean {
	private String userID="";
	private String shiftYear="";
	private String shiftMonth="";
	private String shiftDays="";
	private int statFlag=0;
	private String startH="";
	private String startM="";
	private String finishH="";
	private String finishM="";


	public String getShiftYear() {
		return shiftYear;
	}
	public void setShiftYear(String shiftYear) {
		this.shiftYear = shiftYear;
	}
	public String getShiftMonth() {
		return shiftMonth;
	}
	public void setShiftMonth(String shiftMonth) {
		this.shiftMonth = shiftMonth;
	}
	public String getShiftDays() {
		return shiftDays;
	}
	public void setShiftDays(String shiftDays) {
		this.shiftDays = shiftDays;
	}
	public int getStatFlag() {
		return statFlag;
	}
	public void setStatFlag(int statFlag) {
		this.statFlag = statFlag;
	}
	public String getStartH() {
		return startH;
	}
	public void setStartH(String startH) {
		this.startH = startH;
	}
	public String getStartM() {
		return startM;
	}
	public void setStartM(String startM) {
		this.startM = startM;
	}
	public String getFinishH() {
		return finishH;
	}
	public void setFinishH(String finishH) {
		this.finishH = finishH;
	}
	public String getFinishM() {
		return finishM;
	}
	public void setFinishM(String finishM) {
		this.finishM = finishM;
	}
	public String getUserID() {
		return userID;
	}
	public void setUserID(String userID) {
		this.userID = userID;
	}



}
