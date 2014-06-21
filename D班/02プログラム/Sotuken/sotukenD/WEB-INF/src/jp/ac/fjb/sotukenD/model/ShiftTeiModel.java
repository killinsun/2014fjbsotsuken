package jp.ac.fjb.sotukenD.model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Calendar;

import javax.servlet.http.HttpServletRequest;

import org.omg.CORBA.Request;

import com.sun.corba.se.spi.legacy.connection.GetEndPointInfoAgainException;

import jp.ac.fjb.sotukenD.bean.ShiftTeiFormBean;
import jp.ac.fjb.sotukenD.util.DBManager;

public class ShiftTeiModel {





	public ArrayList<ShiftTeiFormBean> getShiftKibou(String userID) {
		ArrayList<ShiftTeiFormBean> list = new ArrayList<ShiftTeiFormBean>();

		Calendar now = Calendar.getInstance();
		int y = now.get(now.YEAR);          //年を取得
		int m = now.get(now.MONTH) + 1;     //月を取得
		int d = now.get(now.DATE);          //日を取得
		int startDay = 0;
		int endDay = 0;
		int teiM=m;
		int zenkouflag=0;

		String sql= "";

		if(10<d && d<25){
			zenkouflag=0;
		}else{
			zenkouflag=1;
		}
		if(zenkouflag==0){
			if(teiM==12){
				y=y++;
				teiM=0;
			}
			teiM = m+1;
			startDay = 1;
			endDay = 15;

		}else if(zenkouflag==1){
			startDay = 16;
			endDay = 31;
		}




		sql = "SELECT ユーザID,年月日,希望開始時刻,希望終了時刻,状態ID FROM シフト希望 WHERE "
				+ String.valueOf(y).substring(2,4)+String.format("%1$02d",teiM)+String.format("%1$02d",startDay)+
				"<=年月日 AND 年月日<="+String.valueOf(y).substring(2,4)+String.format("%1$02d", teiM)
				+String.format("%1$02d", endDay)+" AND ユーザID = '" + userID + "'";



		DBManager dm = new DBManager();

		System.out.print(sql);

		try {
			dm.openDB();
			ResultSet rs = dm.selectSQL(sql);

			while (rs.next()) {
				ShiftTeiFormBean teiShift = new ShiftTeiFormBean();
				teiShift.setUserID(rs.getString("ユーザID"));
				String ymd = rs.getString("年月日");
				teiShift.setShiftYear(ymd.substring(0, 2));
				teiShift.setShiftMonth(ymd.substring(2, 4));
				teiShift.setShiftDays(ymd.substring(4, 6));
				String start = rs.getString("希望開始時刻");
				if(start!=null){
					teiShift.setStartH(start.substring(0, 2));
					teiShift.setStartM(start.substring(2, 4));
				}else{
					teiShift.setStartH("");
					teiShift.setStartM("");
				}
				String finish = rs.getString("希望終了時刻");
				if(finish!=null){
					teiShift.setFinishH(finish.substring(0, 2));
					teiShift.setFinishM(finish.substring(2, 4));
				}else{
					teiShift.setFinishH("");
					teiShift.setFinishM("");
				}

				teiShift.setStatFlag(rs.getInt("状態ID"));

				list.add(teiShift);
			}

			if (list.size() == 0) {
				for (int i = startDay;i<=endDay; i++) {
					ShiftTeiFormBean teiShift = new ShiftTeiFormBean();
					teiShift.setUserID(userID);
					teiShift.setShiftDays(String.valueOf(i));
					list.add(teiShift);
				}
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			dm.closeDB();
		}

		return list;
	}

	public ArrayList<ShiftTeiFormBean> setShiftKibou(String userID, HttpServletRequest req) {
		ArrayList<ShiftTeiFormBean> list = new ArrayList<ShiftTeiFormBean>();

		Calendar now = Calendar.getInstance();
		int y = now.get(now.YEAR);          //年を取得
		int m = now.get(now.MONTH) + 1;     //月を取得
		int d = now.get(now.DATE);          //日を取得
		int startDay = 0;
		int endDay = 0;
		int teiM=m;
		int zenkouflag=0;
		int stop=0;
		int stat=0;

		if(10<d && d<25){
			zenkouflag=0;
		}else{
			zenkouflag=1;
		}
		if(zenkouflag==0){
			if(teiM==12){
				y=y++;
				teiM=0;
			}
			teiM = m+1;
			startDay = 1;
			endDay = 15;
			stop=15;

		}else if(zenkouflag==1){
			startDay = 16;
			endDay = 31;
			stop= 16;
		}




		String start="";
		String end="";
		String[] date = new String[32];

		for (int i=startDay; i<endDay+1; i++) {
			date[i] = String.format("%1$02d", startDay+i);
		}
		String[] statBox = new String[32];
		for (int i=startDay; i<endDay+1; i++) {
			statBox[i] = req.getParameter("statBox" + i);
		}
		String[] startH = new String[32];
		for (int i=startDay; i<endDay+1; i++) {
			if(req.getParameter("startH" + i)!=""){
				startH[i] =String.format("%2s",req.getParameter("startH" + i)).replace(' ', '0')  ;
			}else{
				startH[i] ="";
			}
		}
		String[] startM = new String[32];
		for (int i=startDay; i<endDay+1; i++) {
			if(req.getParameter("startM" + i)!=""){
				startM[i] = String.format("%2s",req.getParameter("startM" + i)).replace(' ', '0') ;
			}else{
				startM[i] ="";
			}
		}
		String[] finishH = new String[32];
		for (int i=startDay; i<endDay+1; i++) {
			if(req.getParameter("finishH" + i)!=""){
			finishH[i] = String.format("%2s",req.getParameter("finishH" + i)).replace(' ', '0') ;
			}else{
				finishH[i]="";
			}
		}
		String[] finishM = new String[32];
		for (int i=startDay; i<endDay+1; i++) {
			if(req.getParameter("finishM" + i)!=""){
			finishM[i] = String.format("%2s",req.getParameter("finishM" + i)).replace(' ', '0') ;
			}else{
				finishM[i]="";
			}
		}



		for(int i=startDay;i<endDay+1;i++){
			ShiftTeiFormBean teiShift = new ShiftTeiFormBean();
			teiShift.setUserID(userID);
			teiShift.setShiftYear(String.valueOf(y).substring(2,4));
			teiShift.setShiftMonth(String.format("%1$02d",teiM));
			teiShift.setShiftDays(date[i]);
			teiShift.setStartH(startH[i]);
			teiShift.setStartM(startM[i]);
			teiShift.setFinishH(finishH[i]);
			teiShift.setFinishM(finishM[i]);
			teiShift.setStatFlag(Integer.valueOf(statBox[i]));

			list.add(teiShift);

			String sql ="SELECT * FROM シフト希望 WHERE 年月日 = '"+
					String.valueOf(y).substring(2,4)+String.format("%1$02d",teiM)+String.format("%1$02d",i)
						+"' AND ユーザID = '"+ userID +" '";
			DBManager dm = new DBManager();

			boolean chack = false ;
			try{
				dm.openDB();
				ResultSet rs = dm.selectSQL(sql);

				while (rs.next()) {
					chack = true;
				}

			}catch(SQLException e){
				e.printStackTrace();
			}finally{
				dm.closeDB();
			}

			//DBアップデート

			try {
				dm.openDB();

				String a =String.valueOf(y).substring(2,4);
				String b =String.format("%1$02d",teiM);
				String c =String.format("%1$02d",i);

				if(chack==false){
					sql ="INSERT INTO シフト希望 (ユーザID,年月日,希望開始時刻,希望終了時刻,状態ID) VALUES ('"+userID+"', '"+
//							String a=String.valueOf(y).substring(2,4)+
//							String.format("$02d",teiM)+
//							String.format("$02d",i)+"', '"+

							a+b+c+"', '"+
							startH[i]+startM[i]+"', '"+ finishH[i]+finishM[i]+"','"+statBox[i]+"')";
					ResultSet rs = dm.selectSQL(sql);
				}else{
					sql= "UPDATE シフト希望  SET  希望開始時刻 = '"+startH[i]+startM[i]+"',希望終了時刻 = '"+ finishH[i]+finishM[i]+"' ," +
							"状態ID='"+statBox[i]+"'"+
							"WHERE  ユーザID = '"+ userID +" 'AND 年月日 = '"+
//							 String.valueOf(y).substring(2,4)+String.format("%1$02d",teiM)+String.format("%1$02d",i)+
							a+b+c+
							 "'";
					dm.updateSQL(sql);
				}







//					ShiftTeiFormBean getlist = (ShiftTeiFormBean) list.get(count);
//						start=getlist.getStartH()+getlist.getStartM();
//						end=getlist.getFinishH()+getlist.getFinishM();
//						stat=getlist.getStatFlag();



			}finally {
				dm.closeDB();
			}


		}
		//存在チェック
		return list;







	}

}
