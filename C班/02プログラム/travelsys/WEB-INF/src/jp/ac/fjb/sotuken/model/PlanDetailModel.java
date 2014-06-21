package jp.ac.fjb.sotuken.model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import jp.ac.fjb.sotuken.bean.PlanDetailBean;
import jp.ac.fjb.sotuken.util.DBManager;

public class PlanDetailModel {

	// ***************************************** //
	//  プランキーワードからプラン情報を取得する
	// ***************************************** //

		public ArrayList<PlanDetailBean> getPlan(String planName) {

			// プラン情報格納用
			ArrayList<PlanDetailBean> list = new ArrayList<PlanDetailBean>();

			// SQL文を組み立てる
			String sql = "SELECT プラン.プラン名,プラン.プランID,プラン.コメント,プラン.イメージ画像URL ,観光地.観光地名,プラン.最大人数,プラン.予約開始,プラン.予約終了,県.県名 " +
						 "FROM プラン, 観光地,県 "+
						 "WHERE (プラン.観光地ID = 観光地.観光地ID) " +
						 " AND (観光地.県ID = 県.県ID)" +
						 " AND プラン名 like '%" + planName + "%' ";

			System.out.println(sql);

			// DBアクセス部品の生成
			DBManager dm = new DBManager();


			// ユーザ一覧データを格納するリスト

			try {

				// DBのオープン
				dm.openDB();

				// SELECT文の実行
				ResultSet rs = dm.selectSQL(sql);

				while(rs.next()){
					PlanDetailBean plan = new PlanDetailBean();
					plan.setPlanName(rs.getString("プラン名"));
					plan.setPlanId(rs.getString("プランID"));
					plan.setAreaName(rs.getString("観光地名"));
					plan.setAreaImgUrl(rs.getString("イメージ画像URL"));
					plan.setAreaComment(rs.getString("コメント"));
					plan.setPlanDateStart(rs.getString("予約開始"));
					plan.setPlanDateEnd(rs.getString("予約終了"));
					plan.setPeople(rs.getString("最大人数"));
					plan.setKenName(rs.getString("県名"));

					list.add(plan);

				}

			} catch (SQLException e) {
				e.printStackTrace();
			} finally {
				// データベースのクロース
				dm.closeDB();
			}

			// ユーザ情報を返す
			return list;
		}


		public ArrayList<PlanDetailBean> getPlanDetail(String planId) {

			// プラン情報格納用
			ArrayList<PlanDetailBean> list = new ArrayList<PlanDetailBean>();

			// SQL文を組み立てる
			String sql = "SELECT プラン.プラン名,プラン.プランID,プラン.コメント,プラン.イメージ画像URL ,観光地.観光地名,プラン.最大人数,プラン.予約開始,プラン.予約終了,県.県名 " +
						 "FROM プラン, 観光地,県 "+
						 "WHERE (プラン.観光地ID = 観光地.観光地ID) " +
						 " AND (観光地.県ID = 県.県ID)" +
						 " AND プランID='" + planId + "' ";

			System.out.println(sql);

			// DBアクセス部品の生成
			DBManager dm = new DBManager();


			// ユーザ一覧データを格納するリスト

			try {

				// DBのオープン
				dm.openDB();

				// SELECT文の実行
				ResultSet rs = dm.selectSQL(sql);

				while(rs.next()){
					PlanDetailBean plan = new PlanDetailBean();
					plan.setPlanName(rs.getString("プラン名"));
					plan.setPlanId(rs.getString("プランID"));
					plan.setAreaName(rs.getString("観光地名"));
					plan.setAreaImgUrl(rs.getString("イメージ画像URL"));
					plan.setAreaComment(rs.getString("コメント"));
					plan.setPlanDateStart(rs.getString("予約開始"));
					plan.setPlanDateEnd(rs.getString("予約終了"));
					plan.setPeople(rs.getString("最大人数"));
					plan.setKenName(rs.getString("県名"));

					list.add(plan);

				}

			} catch (SQLException e) {
				e.printStackTrace();
			} finally {
				// データベースのクロース
				dm.closeDB();
			}

			// ユーザ情報を返す
			return list;
		}
}
