package jp.ac.fjb.sotukenD.bean;

public class ShiftShowFormBean {


		 private String userID = ""; //ユーザID
		 private String userName = "";//ユーザ名
		 private String date = "";	//日時
		 private String startTime = "";	//開始時間
		 private String finishTime = "";	//終了時間
		 private String[] style = new String[30];
		 private String[] cv = new String[30];

		 public ShiftShowFormBean() {
			 for (int i=0;i<30;i++){
			 style[i] = "";
			 getCv()[i]="no";
			 }
		 }

		 public String getUserID() {
			return userID;
		}
		public void setUserID(String userID) {
			this.userID = userID;
		}
		public String getUserName() {
			return userName;
		}
		public void setUserName(String userName) {
			this.userName = userName;
		}
		public String getDate() {
			return date;
		}
		public void setDate(String date) {
			this.date = date;
		}


		public String getStartTime() {
			return startTime;
		}
		public void setStartTime(String startTime) {
			this.startTime = startTime;
		}


		public String getFinishTime() {
			return finishTime;
		}
		public void setFinishTime(String finishTime) {
			this.finishTime = finishTime;
		}



		public String[] getStyle() {
			return style;
		}
		public void setStyle(String[] style) {
			this.style = style;
		}

		public String[] getCv() {
			return cv;
		}

		public void setCv(String[] cv) {
			this.cv = cv;
		}

}
