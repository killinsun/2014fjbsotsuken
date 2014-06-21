package jp.ac.fjb.sotuken.model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

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
		String sql = "SELECT * FROM ユーザ WHERE ユーザID = '" + id + "' AND パスワード = '" + pass + "'";
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
			user.setUserName(rs.getString("名前"));
			user.setUserType(rs.getString("ユーザ種別ID"));
			user.setBirthDay(rs.getString("生年月日"));
			user.setMailAddress(rs.getString("メールアドレス"));
			user.setHurigana(rs.getString("フリガナ"));
			user.setAddress(rs.getString("住所"));
			user.setPassWord(rs.getString("パスワード"));
			user.setTell(rs.getString("電話番号"));
			user.setSeibetu(rs.getString("性別"));
			user.setYubin(rs.getString("郵便番号"));

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
