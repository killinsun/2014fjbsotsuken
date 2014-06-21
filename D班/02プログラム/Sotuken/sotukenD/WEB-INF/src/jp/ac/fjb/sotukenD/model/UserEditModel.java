package jp.ac.fjb.sotukenD.model;

import java.sql.ResultSet;
import java.sql.SQLException;

import jp.ac.fjb.sotukenD.bean.UserEditBean;
import jp.ac.fjb.sotukenD.bean.UserListBean;
import jp.ac.fjb.sotukenD.util.DBManager;

public class UserEditModel {
	// 一覧として表示するユーザーの情報の取得
	public UserEditBean getUserEdit(String userId) {
		UserEditBean listBean = new UserEditBean();

		String sql = "SELECT ユーザID,パスワード,メールアドレス,氏名,フリガナ,性別,住所,電話番号,権限ID,生年月日 FROM ユーザー情報 WHERE ユーザID='"
				+ userId + "'";

		DBManager dm = new DBManager();

		try {
			// DBのオープン
			dm.openDB();
			// SELECT文の実行
			ResultSet rs = dm.selectSQL(sql);

			if (!rs.next()) {
				return null;
			}

			listBean.setEditUserIdE(rs.getString("ユーザID"));
			listBean.setEditUserPassE(rs.getString("パスワード"));
			listBean.setEditUserAddressE(rs.getString("メールアドレス"));
			listBean.setEditUserNameE(rs.getString("氏名"));
			listBean.setEditUserHuriE(rs.getString("フリガナ"));
			listBean.setEditUserSexE(rs.getString("性別"));
			listBean.setEditUserHomeE(rs.getString("住所"));
			listBean.setEditUserTellE(rs.getString("電話番号"));
			listBean.setEditUserKenE(rs.getString("権限ID"));
			listBean.setEditUserBirthE(rs.getString("生年月日"));


		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			// データベースのクロース
			dm.closeDB();
		}

		// ユーザ情報を返す
		return listBean;

	}

}
