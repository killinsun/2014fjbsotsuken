package jp.ac.fjb.onsen.model;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Random;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpSession;


import jp.ac.fjb.onsen.bean.SyouhinBean;
import jp.ac.fjb.onsen.util.DBManager;

public class STopModel extends HttpServlet {

//---------------------------------------------------
//おすすめ商品を取得
//---------------------------------------------------
	public ArrayList<SyouhinBean> getOsusume() {

		DBManager db = new DBManager();
		ArrayList<SyouhinBean> olist = new ArrayList<SyouhinBean>();
		Calendar now = Calendar.getInstance();
		int newMonth = now.get(Calendar.MONTH) + 1;
		int oldMonth;
		String sql = "SELECT * FROM 商品表";
		int count = 0;

		try {
			db.openDB();

			ResultSet rs = db.selectSQL(sql);

			while(rs.next()){
				count += 1;
			}

			System.out.println("登録されているデータの件数" + count + "件");
			System.out.println("おすすめ商品取得");

			Random r = new Random();

				for(int i = 0; i < 3; i++){
					sql = "SELECT * FROM 商品表 WHERE 商品番号 LIKE 'SH%" + (r.nextInt(count)+1) + "'";

					rs = db.selectSQL(sql);

					rs.next();

					//取得したデータをBeanに格納
					SyouhinBean syouhin = new SyouhinBean();
					syouhin.setSyouhinID(rs.getString("商品番号"));
					syouhin.setSyouhinName(rs.getString("商品名"));
					syouhin.setSyouhinzyouhou(rs.getString("商品情報"));
					syouhin.setTanka(rs.getString("単価"));
					syouhin.setImagepass(rs.getString("画像パス"));
					syouhin.setChiikicode(rs.getString("地域コード"));

					//確認用【商品番号を出力】
					System.out.println(syouhin.getSyouhinID());

					olist.add(syouhin);
				}

			db.closeDB();



		} catch (Exception e) {
			// TODO: handle exception
		}

		return olist;
	}

//---------------------------------------------------
//購入履歴を取得
//---------------------------------------------------
	public ArrayList<SyouhinBean> getHistory(String userID) {

		int count = 0;
		String sql = "SELECT S.商品番号, S.商品名, S.商品情報, S.単価, S.画像パス, TZ.注文日時, TM.注文数 FROM 商品表 S, 注文明細表 TM, 注文情報表 TZ, ユーザ表 U WHERE S.商品番号 = TM.商品番号 AND TM.注文番号 = TZ.注文番号 AND TZ.ユーザID = U.ユーザID AND TZ.ユーザID = '" + userID + "' ORDER BY TZ.注文番号 DESC";
		ArrayList<SyouhinBean> hlist = new ArrayList<SyouhinBean>();

		try {

			DBManager db = new DBManager();

			db.openDB();

			ResultSet rs = db.selectSQL(sql);

			boolean flg = rs.next();

			//結果がなければNULLを返す
			if(!flg) {
				System.out.println("データを取得できませんでした");
				return null;
			}

			//結果をBeanに詰める
			while(flg && count < 3) {
				SyouhinBean syouhin = new SyouhinBean();
				syouhin.setSyouhinID(rs.getString("商品番号"));
				syouhin.setSyouhinName(rs.getString("商品名"));
				syouhin.setSyouhinzyouhou(rs.getString("商品情報"));
				syouhin.setTanka(rs.getString("単価"));
				syouhin.setImagepass(rs.getString("画像パス"));
				syouhin.setChiikicode(rs.getString("注文日時"));
				//取得したデータを出力
				System.out.println("取得した商品番号:" + rs.getString("商品番号"));

				//ArrayListへ一件分の情報を追加
				hlist.add(syouhin);

				//カウントを1増やす
				count += 1;

				//次のデータへ , フラグ更新
				flg = rs.next();
			}
			db.closeDB();
		} catch (Exception e) {
			// TODO: handle exception
		}

		return hlist;
	}
}
