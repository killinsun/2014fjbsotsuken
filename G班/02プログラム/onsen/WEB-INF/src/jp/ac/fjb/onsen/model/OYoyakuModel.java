package jp.ac.fjb.onsen.model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.servlet.jsp.tagext.TryCatchFinally;

import jp.ac.fjb.onsen.bean.OnsenYoyakuBean;
import jp.ac.fjb.onsen.util.DBManager;

public class OYoyakuModel {


	//月毎の宿泊人数の取得
	public ArrayList<Integer> getAkiHeya(String onsenNo, String year, String month){

		ArrayList<Integer> cList = new ArrayList<Integer>();

		// SQL文を組み立てる
		String sql = "select 日付,空き部屋数 from 予約状況表 where 温泉番号 = '"+ onsenNo +"' and 日付 like '"+ year +"/"+ month +"/%' order by TO_DATE(日付, 'YYYY/MM/DD') asc";
		System.out.println(sql);

		// DBアクセス部品の生成
		DBManager dm = new DBManager();

		try {
			// DBのオープン
			dm.openDB();

			// SELECT文の実行
			ResultSet rs = dm.selectSQL(sql);


			// データが取得できなかったらnullを返す
			if ( !rs.next() ) {
				return null;
			}

			// 取得したユーザ情報をDAOに詰めてセッションに格納
			boolean flg = true;
			while(flg==true){
				cList.add(rs.getInt("空き部屋数"));

				flg = rs.next();
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			// データベースのクロース
			dm.closeDB();
		}
		return cList;
	}
}