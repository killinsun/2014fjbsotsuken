package jp.ac.fjb.onsen.model;

import java.sql.ResultSet;
import java.sql.SQLException;

import jp.ac.fjb.onsen.bean.UserBean;
import jp.ac.fjb.onsen.util.DBManager;



public class LoginModel {

	// ***************************************** //
	//  IDとパスワードを元に、ユーザ情報を取得する
	// ***************************************** //
	public UserBean getUser(String id, String pass) {

		// ユーザ情報格納用
		UserBean user = new UserBean();

		// SQL文を組み立てる
		String sql = "SELECT * FROM ユーザ表 WHERE ユーザID = '" + id + "' AND パスワード = '" + pass + "'";
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
			user.setUserID(rs.getString("ユーザID"));
			user.setSei(rs.getString("姓"));
			user.setMei(rs.getString("名"));
			user.setSeibetu(rs.getString("性別"));
			user.setSeinengappi(rs.getString("生年月日"));
			user.setYubin(rs.getString("郵便番号"));
			user.setMail(rs.getString("メールアドレス"));
			user.setTel(rs.getString("電話番号"));
			user.setTodouhuken(rs.getString("都道府県"));
			user.setAddress(rs.getString("住所"));
			user.setAddress2(rs.getString("マンション"));

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
