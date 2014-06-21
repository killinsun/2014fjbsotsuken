package jp.ac.fjb.eLearning.model;

import java.sql.ResultSet;
import java.sql.SQLException;

import jp.ac.fjb.eLearning.bean.Reading_QinputBean;
import jp.ac.fjb.eLearning.util.DBManager;

public class Reading_QModel {

	// ***************************************** //
	//  IDとパスワードを元に、ユーザ情報を取得する
	// ***************************************** //
	public Reading_QinputBean getMondai(String kyouka,String kamoku, String bunya) {

		// ユーザ情報格納用
		Reading_QinputBean user = new Reading_QinputBean();

		// SQL文を組み立てる
		String sql = "SELECT 問題ID,科目ID,教科ID,分野ID,問題文 FROM 練習問題管理表 WHERE 問題ID ='"+ kyouka + "'" + " AND 科目ID = '" + kamoku + "'"+" AND 分野ID = '" + bunya + "'";
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
			user.setMondai(rs.getString("問題文"));

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			// データベースのクロース
			dm.closeDB();
		}

		// ユーザ情報を返す
		return user;
	}

}
