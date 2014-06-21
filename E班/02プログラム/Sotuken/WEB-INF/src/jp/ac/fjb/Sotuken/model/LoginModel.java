package jp.ac.fjb.Sotuken.model;

import java.sql.ResultSet;
import java.sql.SQLException;

import jp.ac.fjb.Sotuken.bean.LoginBean;
import jp.ac.fjb.Sotuken.util.DBManager;

public class LoginModel {

	public LoginBean getUser(String id, String pass) {
		LoginBean user = new LoginBean();
		// SQL文を組み立てる
		String sql = "SELECT 名前,ユーザID,メンバーID, パスワード " + "FROM ユーザ "
				+ "WHERE メンバーID = '" + id + "' AND パスワード = '" + pass + "'";
		System.out.println(sql);

		// DBアクセス部品の生成
		DBManager dm = new DBManager();

		try {
			// DBのオープン
			dm.openDB();

			// SELECT文の実行
			ResultSet rs = dm.selectSQL(sql);

			// データが取得できなかったらnullを返す
			if (!rs.next()) {
				return null;
			}

			//rs.next();

			// 取得したユーザ情報をBeanに詰めてセッションに格納


			user.setName(rs.getString("名前"));
			user.setMember(rs.getString("メンバーID"));
			user.setUserId(rs.getString("ユーザID"));
			user.setPassWord(rs.getString("パスワード"));

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
