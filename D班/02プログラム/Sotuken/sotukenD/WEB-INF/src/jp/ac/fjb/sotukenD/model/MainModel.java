package jp.ac.fjb.sotukenD.model;

import java.sql.ResultSet;
import java.util.ArrayList;

import jp.ac.fjb.sotukenD.bean.MainFormBeans;
import jp.ac.fjb.sotukenD.util.DBManager;

public class MainModel {

	public ArrayList<MainFormBeans> getUser(String userId) {


		String sql = "SELECT  氏名,メールID,件名, 読了フラグ FROM メール,ユーザー情報 WHERE ユーザID = '" + userId + "' AND メールアドレス = 受信ID ORDER BY 時間 DESC" ;
		System.out.println(sql);

		DBManager dm = new DBManager();

		ArrayList<MainFormBeans> mailj = new ArrayList<MainFormBeans>();

		try{
			dm.openDB();

			ResultSet rs = dm.selectSQL(sql);

			while ( rs.next() ) {

				MainFormBeans main = new MainFormBeans();

				main.setUserName(rs.getString("氏名"));
				main.setTitle(rs.getString("件名"));
				main.setMailFlag(rs.getString("読了フラグ"));
				main.setMailId(rs.getString("メールID"));

				mailj.add(main);

			}

		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			// データベースのクロース
			dm.closeDB();
		}
		return mailj;
	}

}
