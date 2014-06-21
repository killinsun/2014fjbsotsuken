package jp.ac.fjb.sotuken.bean;

public class BbsBean {
	//【保留】総評価
	//String allStar;
	private String bbsNo;			//掲示板No
	private String kenName;			//県.県名
	private String planName;		//プラン.プラン名
	private String planId;			//プラン.プランID
	private String pressTime;		//投稿日時
	private String pressUserName;	//掲示板.投稿者名
	private String planPressSt;		//プラン紹介文
	private String bbsImage;		//イメージ画像
	private String chiiki;				//地域.地域名
	private String kankochi;			//観光地.観光地名
	private String dateStart;			//プラン.予約開始
	private String dateRemit;			//プラン.予約終了
	private String people;				//プラン.最大人数
	private String hotel;				//宿泊先.宿泊先名
	private String syukuhakuDay;		//プラン.宿泊日数
	private String price;				//プラン.デフォルト料金
	private String go;					//プラン.デフォルト出発駅
	private String arrive;				//プラン.到着駅
	private String keyWord;				//プラン.キーワード

	private int pageEnd;
	private int startCnt;
	private int endCnt;


	public String getKenName() {
		return kenName;
	}
	public void setKenName(String kenName) {
		this.kenName = kenName;
	}
	public String getPlanName() {
		return planName;
	}
	public void setPlanName(String planName) {
		this.planName = planName;
	}
	public String getPlanId() {
		return planId;
	}
	public void setPlanId(String planId) {
		this.planId = planId;
	}
	public String getPressTime() {
		return pressTime;
	}
	public void setPressTime(String pressTime) {
		this.pressTime = pressTime;
	}
	public String getPressUserName() {
		return pressUserName;
	}
	public void setPressUserName(String pressUserName) {
		this.pressUserName = pressUserName;
	}
	public String getPlanPressSt() {
		return planPressSt;
	}
	public void setPlanPressSt(String planPressSt) {
		this.planPressSt = planPressSt;
	}
	public String getBbsImage() {
		return bbsImage;
	}
	public void setBbsImage(String bbsImage) {
		this.bbsImage = bbsImage;
	}
	public String getBbsNo() {
		return bbsNo;
	}
	public void setBbsNo(String bbsNo) {
		this.bbsNo = bbsNo;
	}
	public String getChiiki() {
		return chiiki;
	}
	public void setChiiki(String chiiki) {
		this.chiiki = chiiki;
	}
	public String getKankochi() {
		return kankochi;
	}
	public void setKankochi(String kankochi) {
		this.kankochi = kankochi;
	}
	public String getDateStart() {
		return dateStart;
	}
	public void setDateStart(String dateStart) {
		this.dateStart = dateStart;
	}
	public String getDateRemit() {
		return dateRemit;
	}
	public void setDateRemit(String dateRemit) {
		this.dateRemit = dateRemit;
	}
	public String getPeople() {
		return people;
	}
	public void setPeople(String people) {
		this.people = people;
	}
	public String getHotel() {
		return hotel;
	}
	public void setHotel(String hotel) {
		this.hotel = hotel;
	}
	public String getSyukuhakuDay() {
		return syukuhakuDay;
	}
	public void setSyukuhakuDay(String syukuhakuDay) {
		this.syukuhakuDay = syukuhakuDay;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public String getGo() {
		return go;
	}
	public void setGo(String go) {
		this.go = go;
	}
	public String getArrive() {
		return arrive;
	}
	public void setArrive(String arrive) {
		this.arrive = arrive;
	}
	public String getKeyWord() {
		return keyWord;
	}
	public void setKeyWord(String keyWord) {
		this.keyWord = keyWord;
	}
	public int getPageEnd() {
		return pageEnd;
	}
	public void setPageEnd(int pageEnd) {
		this.pageEnd = pageEnd;
	}
	public int getStartCnt() {
		return startCnt;
	}
	public void setStartCnt(int startCnt) {
		this.startCnt = startCnt;
	}
	public int getEndCnt() {
		return endCnt;
	}
	public void setEndCnt(int endCnt) {
		this.endCnt = endCnt;
	}



}
