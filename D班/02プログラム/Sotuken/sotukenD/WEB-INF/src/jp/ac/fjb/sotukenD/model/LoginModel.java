package jp.ac.fjb.sotukenD.model;

import java.sql.ResultSet;
import java.sql.SQLException;

import jp.ac.fjb.sotukenD.bean.LoginFormBeans;
import jp.ac.fjb.sotukenD.util.DBManager;

public class LoginModel {

	// ***************************************** //
	//  IDとパスワードを元に、ユーザ情報を取得する
	// ***************************************** //
	public LoginFormBeans getUser(String userID, String userPass) {

		// ユーザ情報格納用
		LoginFormBeans user = new LoginFormBeans();

		// SQL文を組み立てる
		String sql = "SELECT ユーザID,パスワード,氏名 FROM ユーザー情報 WHERE ユーザID = '" + userID + "' AND パスワード = '" + userPass + "'";
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
			user.setUserName(rs.getString("氏名"));

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
