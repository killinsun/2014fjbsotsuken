package jp.ac.fjb.eLearning.model;

import java.sql.ResultSet;
import java.sql.SQLException;

import jp.ac.fjb.eLearning.bean.WritingDougaFormBean;
import jp.ac.fjb.eLearning.util.DBManager;

public class WritingDougaModel {

	public WritingDougaFormBean getDouga(String kyoukaID, String kamokuID, String bunyaId) {
		// 動画情報格納用Bean
		WritingDougaFormBean douga = new WritingDougaFormBean();

		// SQL文を組み立てる
		String sql = "SELECT 分野詳細表.タイトル名, 動画表.動画名 " +
				"FROM 分野詳細表, 分野表, 動画表 " +
				"WHERE 分野詳細表.タイトルID = 分野表.タイトルID " +
				"AND   分野表.科目ID = 動画表.科目ID " +
				"AND   分野表.分野ID = 動画表.分野ID " +
				"AND   動画表.教科ID = '"+kyoukaID + "'" +
				"AND   動画表.科目ID = '"+kamokuID + "'" +
				"AND   動画表.分野ID = '"+bunyaId + "'";

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

			// 取得したタイトルをBeanに詰めてセッションに格納
			douga.setTaitoru(rs.getString("タイトル名"));
			douga.setDouga(rs.getString("動画名"));

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			// データベースのクロース
			dm.closeDB();
		}

		// 動画情報を返す
		return douga;
	}

}
