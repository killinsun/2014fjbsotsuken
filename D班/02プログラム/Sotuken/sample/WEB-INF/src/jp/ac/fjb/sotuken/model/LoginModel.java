package jp.ac.fjb.sotuken.model;

import java.sql.ResultSet;
import java.sql.SQLException;

import jp.ac.fjb.sotuken.bean.UserBean;
import jp.ac.fjb.sotuken.util.DBManager;

public class LoginModel {

	// ***************************************** //
	//  IDとパスワードを元に、ユーザ情報を取得する
	// ***************************************** //
	public UserBean getUser(String id, String pass) {

		// ユーザ情報格納用
		UserBean user = new UserBean();

		// SQL文を組み立てる
		String sql = "SELECT ユーザID, ユーザ名, ユーザ種別 FROM ユーザ表 WHERE ユーザID = '" + id + "' AND パスワード = '" + pass + "'";
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
			user.setUserId(rs.getString("ユーザID"));
			user.setUserName(rs.getString("ユーザ名"));
			user.setUserType(rs.getString("ユーザ種別"));

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
