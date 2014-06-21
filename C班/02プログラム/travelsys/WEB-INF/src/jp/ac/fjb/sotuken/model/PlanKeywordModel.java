package jp.ac.fjb.sotuken.model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import jp.ac.fjb.sotuken.bean.PlanKeywordBean;
import jp.ac.fjb.sotuken.util.DBManager;

public class PlanKeywordModel {

	// ***************************************** //
	//  プランキーワードからプラン情報を取得する
	// ***************************************** //



		public ArrayList<PlanKeywordBean> getPlan(String planKeyword) {

			// プラン情報格納用
			ArrayList<PlanKeywordBean> list = new ArrayList<PlanKeywordBean>();

			// SQL文を組み立てる
			String sql = "SELECT * FROM プラン  WHERE キーワード like '%" + planKeyword + "%'";

			// DBアクセス部品の生成
			DBManager dm = new DBManager();


			// ユーザ一覧データを格納するリスト


			try {
				// DBのオープン
				dm.openDB();

				// SELECT文の実行
				ResultSet rs = dm.selectSQL(sql);

				while (rs.next()) {
					PlanKeywordBean plan = new PlanKeywordBean();
					plan.setPlanKeyword(rs.getString("キーワード"));
					plan.setPlanName(rs.getString("プラン名"));
					plan.setPlanId(rs.getString("プランID"));
//					plan.setStar(rs.getString("評価"));
					plan.setComment(rs.getString("コメント"));
					plan.setImgUrl(rs.getString("イメージ画像URL"));
					plan.setDefaultFee(rs.getString("デフォルト料金"));


					list.add(plan);
				}

			} catch (SQLException e) {
				e.printStackTrace();
			} finally {
				// データベースのクロース
				dm.closeDB();
			}

			return list;
		}

}
