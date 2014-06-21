package jp.ac.fjb.onsen.model;

import java.sql.ResultSet;
import java.util.ArrayList;

import jp.ac.fjb.onsen.bean.OnsenBean;
import jp.ac.fjb.onsen.bean.SyouhinBean;
import jp.ac.fjb.onsen.util.DBManager;

public class OSyousaiModel {


	public OnsenBean getOnsen(String NoID) {


		//-----------------------------------------------------
		//SQL文を生成
		//-----------------------------------------------------
		String sql = "SELECT * FROM 温泉表 WHERE 温泉番号 = " +"'" + NoID + "'";
		System.out.println(sql);


		//-----------------------------------------------------
		//DBアクセス
		//-----------------------------------------------------
		//DBアクセス部品の生成
		DBManager db = new DBManager();
		OnsenBean onsen = new OnsenBean();

		try {
			//データベースのオープン
			db.openDB();

			//SQL文の実行
			ResultSet rs = db.selectSQL(sql);

			rs.next();
			//取得したデータをBeanに格納
			onsen.setOnsenID(rs.getString("温泉番号"));
			onsen.setOnsenName(rs.getString("温泉名"));
			onsen.setOnsenzyouhou(rs.getString("温泉情報"));
			onsen.setOnsensyousaizyouhou(rs.getString("温泉詳細情報"));
			onsen.setOnsenTanka(rs.getString("単価"));
			onsen.setImagepass(rs.getString("画像パス"));
			onsen.setChiikicode(rs.getString("地域コード"));

			//確認用【温泉番号を出力】
			System.out.println(onsen.getOnsenID());
			System.out.println(onsen.getImagepass());

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			db.closeDB();
		}

		return onsen;


	}





}
