package jp.ac.fjb.sotuken.model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import jp.ac.fjb.sotuken.bean.RirekiBean;
import jp.ac.fjb.sotuken.bean.UserBean;
import jp.ac.fjb.sotuken.util.DBManager;

public class UserMenuModel {

	// ***************************************** //
	//  IDとパスワードを元に、ユーザ情報を取得する
	// ***************************************** //
	public ArrayList<RirekiBean> getRireki(String id) {



		RirekiBean rireki;
		// SQL文を組み立てる
		String sql = "SELECT 注文.注文日 , 注文.注文ID , プラン.プラン名 , 注文.料金 FROM プラン,注文 WHERE  注文.ユーザID='"+id+"' and (注文.プランID=プラン.プランID)";
		System.out.println(sql);

		// DBアクセス部品の生成
		DBManager dm = new DBManager();

		ArrayList<RirekiBean> list = new ArrayList<RirekiBean>();
		try {

			// DBのオープン
			dm.openDB();

			// SELECT文の実行
			ResultSet rs = dm.selectSQL(sql);


			while (rs.next()) {
				rireki = new RirekiBean();

				rireki.setTyumonDay(rs.getString("注文日"));
				rireki.setTyumonId(rs.getString("注文ID"));
				rireki.setPranName(rs.getString("プラン名"));
				rireki.setRyoukin(rs.getString("料金"));

				list.add(rireki);
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
