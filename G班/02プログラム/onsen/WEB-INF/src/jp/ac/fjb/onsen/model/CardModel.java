package jp.ac.fjb.onsen.model;

import java.sql.ResultSet;
import java.sql.SQLException;

import jp.ac.fjb.onsen.bean.CardBean;
import jp.ac.fjb.onsen.bean.UserBean;
import jp.ac.fjb.onsen.util.DBManager;



public class CardModel {

	// ***************************************** //
	//  IDとパスワードを元に、ユーザ情報を取得する
	// ***************************************** //
	public CardBean getCard(String id) {

		// ユーザ情報格納用
		CardBean card = new CardBean();

		// SQL文を組み立てる
		String sql = "SELECT * FROM クレジット表 WHERE ユーザID = '" + id + "'";
//		String sql = "SELECT ユーザID, 姓 FROM ユーザ表";
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
			card.setCardID(rs.getString("カード番号"));
			card.setCard(rs.getString("カード種類"));
			card.setCardName(rs.getString("カード名義"));
			card.setCardlimit(rs.getString("有効期限"));
			card.setSequrity(rs.getString("セキュリティコード"));

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			// データベースのクロース
			dm.closeDB();
		}

		// ユーザ情報を返す
		return card;
	}

}
