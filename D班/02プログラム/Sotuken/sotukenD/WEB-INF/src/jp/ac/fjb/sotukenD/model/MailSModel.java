package jp.ac.fjb.sotukenD.model;

import java.sql.ResultSet;
import java.util.ArrayList;

import jp.ac.fjb.sotukenD.util.DBManager;
import jp.ac.fjb.sotukenD.bean.MailSFormBeans;

public class MailSModel {

	public ArrayList<MailSFormBeans> getUser(String userId){

		ArrayList<MailSFormBeans> list = new ArrayList<MailSFormBeans>();

		String sql = "SELECT *  FROM ユーザー情報";
		System.out.println(sql);

		DBManager dm = new DBManager();

		try{
			dm.openDB();

			ResultSet rs = dm.selectSQL(sql);

			while ( rs.next() ) {

				MailSFormBeans mailS = new MailSFormBeans();

				mailS.setMailAddress(rs.getString("メールアドレス"));
				mailS.setUserName(rs.getString("氏名"));

				list.add(mailS);

			}

		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			// データベースのクロース
			dm.closeDB();
		}

		return list;
	}

}
