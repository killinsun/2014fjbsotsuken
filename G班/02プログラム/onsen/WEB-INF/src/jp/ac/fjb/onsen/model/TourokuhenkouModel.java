package jp.ac.fjb.onsen.model;

import java.sql.ResultSet;
import java.sql.SQLException;

import jp.ac.fjb.onsen.bean.UserBean;
import jp.ac.fjb.onsen.util.DBManager;



public class TourokuhenkouModel {

	// ***************************************** //
	//  IDとパスワードを元に、ユーザ情報を取得する
	// ***************************************** //
	public UserBean setUser(String sei, String mei,String tel, String mail,String yubin,String todouhuken,String address,String address2, String userID) {

		// ユーザ情報格納用
		UserBean user = new UserBean();

		// SQL文を組み立てる
		String sql = "update ユーザ表 set  姓= '" + sei + "',名 = '" + mei + "',郵便番号 = '" + yubin + "',電話番号='" + tel+"',メールアドレス = '" + mail + "',都道府県='" + todouhuken+"',住所 = '" + address + "',マンション='" + address2+"' where  ユーザID='"+ userID + "'";
//		String sql = "SELECT ユーザID, 姓 FROM ユーザ表";
		System.out.println(sql);

		// DBアクセス部品の生成
		DBManager dm = new DBManager();

		try {

			// DBのオープン
			dm.openDB();

			//UPDATE文の実行
			int x = dm.updateSQL(sql);
			System.out.println("更新件数: "+ x + "件");
			sql = "SELECT * FROM ユーザ表 WHERE ユーザID = '"+ userID+ "'";

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
