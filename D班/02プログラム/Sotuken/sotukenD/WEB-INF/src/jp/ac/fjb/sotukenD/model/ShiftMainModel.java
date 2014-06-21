package jp.ac.fjb.sotukenD.model;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Calendar;

import jp.ac.fjb.sotukenD.bean.ShiftMainBean;
import jp.ac.fjb.sotukenD.bean.ShiftTeiFormBean;
import jp.ac.fjb.sotukenD.util.DBManager;

public class ShiftMainModel {

	String sql="";

	Calendar now = Calendar.getInstance();
	int y = now.get(now.YEAR);          //年を取得
	int m = now.get(now.MONTH) + 1;     //月を取得
	int d = now.get(now.DATE);          //日を取得
	int startDay = 0;
	int endDay = 0;

	public ArrayList<ShiftMainBean> farstShow(String userID){
		ArrayList<ShiftMainBean> list = new ArrayList<ShiftMainBean>();

		for(int i=1;i<32;i++){
			ShiftMainBean day = new ShiftMainBean();

			sql="SELECT * FROM シフト決定 WHERE 年月日 = '"+
				String.valueOf(y).substring(2,4)+"-"+String.format("%1$02d",m)+"-"+String.format("%1$02d",i)
					+"' AND ユーザID = '"+ userID +" ' ";
			DBManager dm = new DBManager();
			try{
				dm.openDB();
				ResultSet rs = dm.selectSQL(sql);

				if(rs.next()){
					day.setDay(String.valueOf(y).substring(2,4)+"-"+String.format("%1$02d",m)+"-"+i);
					list.add(day);
				}else{
					System.out.println("データなし");
				}
			}catch (Exception e) {
				System.out.println("例外");
			}finally{
				dm.closeDB();
			}



		}
		return list;
	}

}
