package jp.ac.fjb.sotukenD.model;

import jp.ac.fjb.sotukenD.util.DBManager;
import jp.ac.fjb.sotukenD.bean.MailSFormBeans;
import jp.ac.fjb.sotukenD.bean.MailSendFormBeans;

public class MailSendModel {

	public int insertMail(MailSendFormBeans user){

		int count = 0;

		MailSendFormBeans mailS = new MailSendFormBeans();

		String sql = "INSERT INTO メール(メールID,送信ID,受信ID, 件名, 本文,時間,読了フラグ) VALUES("
						+ "メールIDシーケンス.nextval"
						+",'test'"
						+ ",'" + user.getMailAddress() +  "' "
						+ ",'" + user.getTitle() +  "' "
						+ ",'" + user.getMain() +  "' "
						+ ", sysdate,0)";

		System.out.println("INSERT文"+sql);

		DBManager dm = new DBManager();

		dm.openDB();

		count = dm.insertSQL(sql);

		dm.closeDB();

		return count;


	}

}
