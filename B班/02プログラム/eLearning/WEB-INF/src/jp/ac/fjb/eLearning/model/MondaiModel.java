package jp.ac.fjb.eLearning.model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.swing.DefaultButtonModel;

import jp.ac.fjb.eLearning.bean.MondaiMenuBean;
import jp.ac.fjb.eLearning.util.DBManager;

public class MondaiModel {
	public ArrayList<MondaiMenuBean> getMondaiMenu(String kamokuID) {


		// SQL文を組み立てる
		String sql = "SELECT 分野詳細表.分野ID,分野詳細表.タイトル名,分野詳細表.概要,分野詳細表.概要2 " +
					"FROM 分野詳細表,分野表 " +
					"WHERE 分野表.分野ID = 分野詳細表.分野ID " +
					"AND 分野表.タイトルID = 分野詳細表.タイトルID " +
					"AND 分野表.科目ID = '"+kamokuID +"' " +
					"ORDER BY 分野詳細表.タイトルID asc";



		System.out.println(sql);

		// DBアクセス部品の生成
		DBManager dm = new DBManager();

		// ユーザ一覧データを格納するリスト
		ArrayList<MondaiMenuBean> list = new ArrayList<MondaiMenuBean>();

		try {
			// DBのオープン
			dm.openDB();

			// SELECT文の実行
			ResultSet rs = dm.selectSQL(sql);


			MondaiMenuBean m;

			// データが取得できなかったらnullを返す
			while (rs.next()) {
				m = new MondaiMenuBean();
				// 取得した情報をDAOに詰めてセッションに格納
				// MondaiMenu.setTangen(rs.getString());

				m.setTangen(rs.getString("分野ID"));
				m.setTitle(rs.getString("タイトル名"));
				m.setKinou(rs.getString("概要"));
				m.setHyogen(rs.getString("概要2"));

				list.add(m);
			}


		} catch (SQLException e) {
			// TODO 自動生成された catchブロック
			e.printStackTrace();
		} finally {
			// データベースのクロース
			dm.closeDB();
		}

		return list;

	}

}
