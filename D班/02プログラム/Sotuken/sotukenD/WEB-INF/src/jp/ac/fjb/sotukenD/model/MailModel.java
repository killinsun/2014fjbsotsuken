package jp.ac.fjb.sotukenD.model;

import java.sql.ResultSet;

import jp.ac.fjb.sotukenD.bean.LoginFormBeans;
import jp.ac.fjb.sotukenD.bean.MailFormBeans;
import jp.ac.fjb.sotukenD.util.DBManager;

public class MailModel {

	public MailFormBeans getUser(String userId, String mailId) {

		MailFormBeans mail = new MailFormBeans();

		String sql = "SELECT 氏名, 件名, 本文 FROM ユーザー情報,メール WHERE ユーザID = '" + userId +
					 "' AND メールアドレス = 受信ID AND メールID = '"+ mailId + "'";
		System.out.println(sql);

		DBManager dm = new DBManager();

		try{
			dm.openDB();

			ResultSet rs = dm.selectSQL(sql);

			if ( rs.next() ) {

				mail.setUserName(rs.getString("氏名"));
				mail.setTitle(rs.getString("件名"));
				mail.setMain(rs.getString("本文"));

			}

		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			// データベースのクロース
			dm.closeDB();
		}
		return mail;


	}

}
