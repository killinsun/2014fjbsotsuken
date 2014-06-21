package jp.ac.fjb.onsen.model;

import java.sql.ResultSet;
import java.util.ArrayList;

import jp.ac.fjb.onsen.bean.OnsenBean;
import jp.ac.fjb.onsen.bean.SyouhinBean;
import jp.ac.fjb.onsen.util.DBManager;

public class OSearchModel {

	public ArrayList<OnsenBean> getOnsen(String Key, String[] area, String min, String max, String stay, String day) {

		//-----------------------------------------------------
		//キーワード条件SQL設定
		//-----------------------------------------------------
				boolean keyflg = false;//キーワード検索を設定するか
				if(Key.equals("")) {
					System.out.println("キーワード条件は設定されていません");
				} else {
					Key = " 温泉名 LIKE '%" + Key + "%'";
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
					for(int i=0; i < area.length; i++) {
						if(i == 0) {
							areasql = " AND";

							if(area.length >= 2)
								areasql = areasql + " (";
						}

						areasql = areasql + " 温泉表.地域コード = 'R" + area[i] + "'";

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
		//プラン条件SQL設定
		//-----------------------------------------------------
				System.out.println(stay + day);
				String plansql = "";//プラン条件SQL格納
				boolean planflg = false;//プラン条件を設定するか
				if(stay == null && day == null) {
					System.out.println("プラン条件は設定されていません");
				} else {
					planflg = true;

					if(stay != null) {
						plansql = " 宿泊温泉 = 1";
					} else if(day != null) {
						plansql = " 日帰り温泉 = 1";
					} else if(stay != null && day != null) {
						planflg = false;
					}

				}

		//-----------------------------------------------------
		//絞込条件で調整
		//-----------------------------------------------------
				String where = "";//where句を挿入
				String areaT = "";//地域表を参照
				String bondT = "";//温泉表と地域表を結合
				String and = "";//キーワード条件を設定して地域条件を設定
				String planB = "";//プラン条件前のAND句を挿入
				if(keyflg == true || areaflg == true || priceflg == true || planflg == true) {
					where = " WHERE";
					if(areaflg == true) {
						areaT = ",地域表";
						bondT = " 温泉表.地域コード = 地域表.地域コード";
					}

					if(keyflg == true && areaflg == true)
						and = " AND";

					if(keyflg != false || areaflg != false || priceflg != false) {
						if(planflg == true)
							planB = " AND";
					}
				}

		//-----------------------------------------------------
		//SQL文を生成
		//-----------------------------------------------------
				String sql = "SELECT * FROM 温泉表" + areaT + where + bondT + and + Key + areasql + pricesql + planB + plansql;


	   //-----------------------------------------------------
	   //DBアクセス
	   //-----------------------------------------------------
			//DBアクセス部品の生成
				DBManager db = new DBManager();

			//商品一覧を格納するArrayList
				ArrayList<OnsenBean> Oslist = new ArrayList<OnsenBean>();

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
				OnsenBean onsen = new OnsenBean();
				onsen.setOnsenID(rs.getString("温泉番号"));
				onsen.setOnsenName(rs.getString("温泉名"));
				onsen.setOnsenzyouhou(rs.getString("温泉情報"));
				onsen.setOnsenTanka(rs.getString("単価"));
				onsen.setImagepass(rs.getString("画像パス"));
				onsen.setChiikicode(rs.getString("地域コード"));

				//確認用【温泉番号を出力】
				System.out.println(onsen.getOnsenID());

				//温泉情報一件分のインスタンスをArrayListへ格納
				Oslist.add(onsen);

				flg = rs.next();
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			db.closeDB();
		}

		return Oslist;

	}

	public ArrayList<OnsenBean> getOnsenmap(String Key) {
		//-----------------------------------------------------
		//SQL文を生成
		//-----------------------------------------------------
				String sql = "SELECT * FROM 温泉表,地域表 WHERE  温泉表.地域コード = 地域表.地域コード AND 地域表.地域名 ="+ "'"+ Key +"'";


	   //-----------------------------------------------------
	   //DBアクセス
	   //-----------------------------------------------------
			//DBアクセス部品の生成
				DBManager db = new DBManager();

			//商品一覧を格納するArrayList
				ArrayList<OnsenBean> Oslist = new ArrayList<OnsenBean>();

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
				OnsenBean onsen = new OnsenBean();
				onsen.setOnsenID(rs.getString("温泉番号"));
				onsen.setOnsenName(rs.getString("温泉名"));
				onsen.setOnsenzyouhou(rs.getString("温泉情報"));
				onsen.setOnsenTanka(rs.getString("単価"));
				onsen.setImagepass(rs.getString("画像パス"));
				onsen.setChiikicode(rs.getString("地域コード"));

				//確認用【温泉番号を出力】
				System.out.println(onsen.getOnsenID());

				//温泉情報一件分のインスタンスをArrayListへ格納
				Oslist.add(onsen);

				flg = rs.next();
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			db.closeDB();
		}

		return Oslist;

	}
}
