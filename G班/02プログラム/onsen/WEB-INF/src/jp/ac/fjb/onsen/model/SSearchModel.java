package jp.ac.fjb.onsen.model;

import java.sql.ResultSet;
import java.util.ArrayList;

import jp.ac.fjb.onsen.bean.SyouhinBean;
import jp.ac.fjb.onsen.util.DBManager;

public class SSearchModel {

	public ArrayList<SyouhinBean> getSyouhin(String Key, String[] area, String min, String max, String sort) {

//-----------------------------------------------------
//キーワード条件SQL設定
//-----------------------------------------------------
		boolean keyflg = false;//キーワード検索を設定するか
		if(Key.equals("")) {
			System.out.println("キーワード条件は設定されていません");
		} else {
			System.out.println("キーワード条件が設定されています");
			Key = " 商品名 LIKE '%" + Key + "%'";
			keyflg = true;
		}

//-----------------------------------------------------
//地域条件SQL設定
//-----------------------------------------------------
		String areasql = "";//地域条件SQL格納
		boolean areaflg = false;//地域条件を設定するか
		if(area == null) {
			System.out.println("地域条件は設定されていません");
		} else {
			System.out.println("地域条件が設定されています");
			for(int i=0; i < area.length; i++) {
				if(i == 0) {
					areasql = " AND";

					if(area.length >= 2)
						areasql = areasql + " (";
				}

				areasql = areasql + " 商品表.地域コード = 'R" + area[i] + "'";

				if(area.length >= 2 && i+1 != area.length) {
					areasql = areasql + " OR";
				} else if(area.length != 1) {
					areasql = areasql + " )";
				}
			}
			areaflg = true;
		}

//-----------------------------------------------------
//価格条件SQL設定
//-----------------------------------------------------
		String pricesql = "";//価格条件SQL格納
		boolean priceflg = false;//価格条件を設定するか
		if(min=="" && max=="") {
			System.out.println("価格条件は設定されていません");
		} else {
			System.out.println("価格条件が設定されています");
			if(min=="")
				min = "0";

			if(max=="")
				max = "1000000000";

			if(keyflg == true || areaflg == true){
				pricesql = " AND";
			}

			pricesql = pricesql + " 単価 BETWEEN " + min + " AND " + max;
			priceflg = true;
		}

//-----------------------------------------------------
//絞込条件で調整
//-----------------------------------------------------
		String where = "";//where句の挿入
		String areaT = "";//from句に地域表を挿入
		String bondT = "";//地域コードで商品表と地域表を結合
		String and = "";//キーワード条件を設定して地域条件を設定するか
		if(keyflg == true || areaflg == true || priceflg == true) {
			where = " WHERE";
			if(areaflg == true) {
				areaT = ",地域表";
				bondT = " 商品表.地域コード = 地域表.地域コード";
			}

			if(keyflg == true && areaflg == true)
				and = " AND";
		}

//-----------------------------------------------------
//並び替え条件
//-----------------------------------------------------
		String sortsql = "";
		String bondO = "";
		if(sort == null) {
			System.out.println("初回の表示");
		} else {
			bondO = " ORDER BY ";
			System.out.println("並べ替え実行");
			if(sort.equals("2")) {
				sortsql = "商品表.商品番号 DESC";
			} else if(sort.equals("1")) {
				sortsql = "商品表.単価";
			} else {
				sortsql = "商品表.商品番号";
			}
		}

//-----------------------------------------------------
//SQL文を生成
//-----------------------------------------------------
		String sql = "SELECT * FROM 商品表" + areaT + where + bondT + and + Key + areasql + pricesql + bondO + sortsql;


//-----------------------------------------------------
//DBアクセス
//-----------------------------------------------------
		//DBアクセス部品の生成
		DBManager db = new DBManager();

		//商品一覧を格納するArrayList
		ArrayList<SyouhinBean> slist = new ArrayList<SyouhinBean>();

		try {
			//データベースのオープン
			db.openDB();

			//SQL文の実行
			ResultSet rs = db.selectSQL(sql);

			//判定用
			boolean flg = rs.next();

			//データを取得できなければNULLを返す
			if(flg == false) {
				return null;
			}

			while(flg == true) {

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

				//商品情報一件分のインスタンスをArrayListへ格納
				slist.add(syouhin);

				flg = rs.next();
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			db.closeDB();
		}

		return slist;

	}
}
