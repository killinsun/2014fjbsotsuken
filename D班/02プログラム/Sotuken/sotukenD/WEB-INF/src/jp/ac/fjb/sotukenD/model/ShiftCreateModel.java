package jp.ac.fjb.sotukenD.model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import jp.ac.fjb.sotukenD.bean.ShiftCreateFormBean;
import jp.ac.fjb.sotukenD.bean.ShiftShowFormBean;

import jp.ac.fjb.sotukenD.util.DBManager;

public class ShiftCreateModel {


	public ArrayList<ShiftCreateFormBean> getUserData(){
		ArrayList<ShiftCreateFormBean> list = new ArrayList<ShiftCreateFormBean>();
		String sql ="SELECT ユーザID,氏名 FROM ユーザー情報";
		System.out.print(sql);

		DBManager dm = new DBManager();
		try{
			dm.openDB();
			ResultSet rs = dm.selectSQL(sql);
			if (rs != null) {

			while (rs.next()) {
				ShiftCreateFormBean user = new ShiftCreateFormBean();
				user.setUserID(rs.getString("ユーザID"));
				user.setUserName(rs.getString("氏名"));

				list.add(user);
			}

		} else {
			ShiftCreateFormBean user = new ShiftCreateFormBean();
			list.add(user);
		}



		}catch(SQLException e){
			e.printStackTrace();
		}finally{
			dm.closeDB();
		}

		return list;

	}

//存在チェック
	public boolean searchShift(String userId, String date){
		String sql ="SELECT * FROM シフト決定 WHERE 年月日 = '"+ date +"' AND ユーザID = '"+ userId +" ' ";
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
		return chack;

	}

//アップデート文発行メソッド
	public ArrayList<ShiftCreateFormBean> setUpdateShift(String userId, String date, String start, String end){
		String sql ="UPDATE シフト決定 SET  決定開始時刻 = '"+start+"',決定終了時刻 = '"+end+"' WHERE  ユーザID = '"+ userId +"'AND 年月日 = '"+ date+"'";
		DBManager dm = new DBManager();
		System.out.println(sql);
		dm.openDB();
		dm.updateSQL(sql);
		dm.closeDB();

		return null;

	}

//インサート文発行メソッド
	public ArrayList<ShiftCreateFormBean> setInsertShift(String userId, String date, String start, String end){
		String sql ="INSERT INTO シフト決定 (ユーザID,年月日,決定開始時刻,決定終了時刻) VALUES ('"+userId+"', '"+date+"', '"+ start +"', '"+ end +"')";
		DBManager dm = new DBManager();
		System.out.println(sql);
		dm.openDB();
		dm.insertSQL(sql);
		dm.closeDB();

		return null;

	}

	public ArrayList<ShiftCreateFormBean> setDeleteShift(String userId, String date){
		String sql ="DELETE FROM シフト決定 WHERE ユーザID = '"+userId+"' AND 年月日 ='"+date+"'";
		DBManager dm = new DBManager();
		System.out.println(sql);
		dm.openDB();
		dm.deleteSQL(sql);
		dm.closeDB();

		return null;

	}



}
