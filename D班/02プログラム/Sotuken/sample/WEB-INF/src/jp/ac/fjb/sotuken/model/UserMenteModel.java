package jp.ac.fjb.sotuken.model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import jp.ac.fjb.sotuken.bean.UserBean;
import jp.ac.fjb.sotuken.util.DBManager;

public class UserMenteModel {

	// ***************************************** //
	//  ユーザ表のデータを全件取得して返す
	// ***************************************** //
	public ArrayList<UserBean> getUserList() {

		// SQL文を組み立てる
		String sql = "SELECT ユーザID, ユーザ名, ユーザ種別 FROM ユーザ表";

		// DBアクセス部品の生成
		DBManager dm = new DBManager();


		// ユーザ一覧データを格納するリスト
		ArrayList<UserBean> list = new ArrayList<UserBean>();

		try {
			// DBのオープン
			dm.openDB();

			// SELECT文の実行
			ResultSet rs = dm.selectSQL(sql);

			while (rs.next()) {
				UserBean user = new UserBean();
				user.setUserId(rs.getString("ユーザID"));
				user.setUserName(rs.getString("ユーザ名"));
				user.setUserType(rs.getString("ユーザ種別"));

				list.add(user);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			// データベースのクロース
			dm.closeDB();
		}

		return list;
	}

	// ***************************************** //
	//  ユーザIDを元に、ユーザ表のデータを取得して返す
	// ***************************************** //
	public UserBean getUser(String userId) {

		// SQL文を組み立てる
		String sql = "SELECT ユーザID, ユーザ名, ユーザ種別, パスワード, メールアドレス, 生年月日, 住所 FROM ユーザ表 WHERE ユーザID = '" + userId + "'";

		// DBアクセス部品の生成
		DBManager dm = new DBManager();

		UserBean user = null;

		try {
			// DBのオープン
			dm.openDB();

			// SELECT文の実行
			ResultSet rs = dm.selectSQL(sql);

			if (rs.next()) {
				user = new UserBean();
				user.setUserId(rs.getString("ユーザID"));
				user.setUserName(rs.getString("ユーザ名"));
				user.setUserType(rs.getString("ユーザ種別"));
				user.setPassWord(rs.getString("パスワード"));
				user.setMailAddress(rs.getString("メールアドレス"));
				user.setBirthDay(rs.getString("生年月日"));
				user.setAddress(rs.getString("住所"));
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			// データベースのクローズ
			dm.closeDB();
		}

		return user;
	}

	// ***************************************** //
	//  ユーザを新規登録する
	// ***************************************** //
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


	// ***************************************** //
	//  ユーザを更新する
	// ***************************************** //
	public int updateUser(UserBean user) {
		int count = 0;

		// SQL文を組み立てる
		String sql = "UPDATE ユーザ表 SET "
						+ "ユーザ名 = '" + user.getUserName() +  "', "
						+ "ユーザ種別 = '" + user.getUserType() +  "', "
						+ "パスワード = '" + user.getPassWord() +  "', "
						+ "メールアドレス = '" + user.getMailAddress() +  "', "
						+ "生年月日 = '" + user.getBirthDay() +  "', "
						+ " 住所 = '" + user.getAddress() +  "' "
						+ "WHERE ユーザID = '" + user.getUserId() + "'";
		System.out.println("UPDATE文：" + sql);

		// DBアクセス部品の生成
		DBManager dm = new DBManager();

		// DBのオープン
		dm.openDB();

		// UPDATE文の実行
		count = dm.updateSQL(sql);

		// データベースのクローズ
		dm.closeDB();

		return count;
	}

	// ***************************************** //
	//  ユーザを削除する
	// ***************************************** //
	public int deleteUser(UserBean user) {
		int count = 0;

		// SQL文を組み立てる
		String sql = "DELETE FROM ユーザ表 "
						+ "WHERE ユーザID = '" + user.getUserId() + "'";
		System.out.println("DELETE文：" + sql);

		// DBアクセス部品の生成
		DBManager dm = new DBManager();

		// DBのオープン
		dm.openDB();

		// DELETE文の実行
		count = dm.deleteSQL(sql);

		// データベースのクローズ
		dm.closeDB();

		return count;
	}
}
