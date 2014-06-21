package jp.ac.fjb.sotuken.model;

import jp.ac.fjb.sotuken.bean.UserBean;
import jp.ac.fjb.sotuken.util.DBManager;

public class UserSignModel {
	public int insertUser(UserBean user) {
		int count = 0;

		// SQL文を組み立てる
		String sql = "INSERT INTO ユーザ表(ユーザID, ユーザ名, ユーザ種別, パスワード, メールアドレス, 生年月日, 住所) VALUES("
						+ "'" + user.getUserId()   +  "', "
						+ "'" + user.getUserName() +  "', "
						+ "'" + user.getUserType() +  "', "
						+ "'" + user.getPassWord() +  "', "
						+ "'" + user.getMailAddress() +  "', "
						+ "'" + user.getBirthDay() +  "', "
						+ "'" + user.getAddress() +  "' "
						+ ")";
		System.out.println("INSERT文：" + sql);

		// DBアクセス部品の生成
		DBManager dm = new DBManager();

		// DBのオープン
		dm.openDB();

		// INSERT文の実行
		count = dm.insertSQL(sql);

		// データベースのクローズ
		dm.closeDB();

		return count;
	}
}
