package jp.ac.fjb.Sotuken.model;

import java.sql.ResultSet;
import java.sql.SQLException;
import jp.ac.fjb.Sotuken.bean.UserMailBean;
import jp.ac.fjb.Sotuken.util.DBManager;

public class ContentDisplayModel{

	public UserMailBean getContentDisplay(String UserId,String MailId) {

		UserMailBean user = new UserMailBean();

		// SQL文を組み立てる
		String sql = "SELECT メールID,ユーザID,受信アドレス,送信アドレス,件名,本文,添付,保存日時,送信日時,メール種別ID FROM メール WHERE メールID = '" + MailId + "' AND ユーザID = '" + UserId + "'";

		// DBアクセス部品の生成
		DBManager su = new DBManager();

		//ArrayList<UserMailBean> list = new ArrayList<UserMailBean>();

		try {
			// DBのオープン
			su.openDB();

			// SELECT文の実行
			ResultSet rs = su.selectSQL(sql);

			while (rs.next()) {
				System.out.println("リストに追加するメールID"+rs.getString("メールID"));
				user.setMailId(rs.getString("メールID"));
				user.setUserId(rs.getString("ユーザID"));
				user.setSendAddress(rs.getString("受信アドレス"));
				user.setUserAddress(rs.getString("送信アドレス"));
				user.setSubjectLine(rs.getString("件名"));
				user.setMainLine(rs.getString("本文"));
				user.setAttach(rs.getString("添付"));
				user.setReceiptTime(rs.getString("保存日時"));
				user.setSendTime(rs.getString("送信日時"));
				user.setClassId(rs.getString("メール種別ID"));

				//list.add(user);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			// データベースのクロース
			su.closeDB();
		}

	return user;

	}
}



