package jp.ac.fjb.Sotuken.model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import jp.ac.fjb.Sotuken.bean.UserMailBean;
import jp.ac.fjb.Sotuken.util.DBManager;


public class UserMailModel {

	// ***************************************** //
	//  メールのデータを全件取得して返す
	// ***************************************** //
	public ArrayList<UserMailBean> getMailList(String userId, String classId) {

		// SQL文を組み立てる
		String sql = "SELECT メール.メールID,メール.ユーザID,メール.受信アドレス,メール.送信アドレス" +
				",ユーザ.名前,メール.件名,メール.添付,メール.送信日時,メール.保存日時,メール種別.メール種別 "
				+ "FROM メール,メール種別,ユーザ "
				+ "WHERE メール.メール種別ID = メール種別.メール種別ID "
				+ "AND メール.ユーザID = ユーザ.ユーザID  "
				+ "AND メール.ユーザID ='" + userId +
				"' AND メール種別.メール種別ID='"
				+ classId + "' " + "ORDER BY 保存日時 DESC";

		// DBアクセス部品の生成
		DBManager su = new DBManager();

		// ユーザ一覧データを格納するリスト
		ArrayList<UserMailBean> list = new ArrayList<UserMailBean>();

		try {
			// DBのオープン
			su.openDB();

			// SELECT文の実行
			ResultSet rs = su.selectSQL(sql);

			while (rs.next()) {
				UserMailBean mail = new UserMailBean();
				mail.setMailId(rs.getString("メールID")); // メールIDの取得
				mail.setUserId(rs.getString("ユーザID")); // ユーザIDの取得
				mail.setSendAddress(rs.getString("受信アドレス")); // 受信先アドレスの取得
				mail.setUserAddress(rs.getString("送信アドレス")); // 送信先アドレスの取得
				mail.setUserName(rs.getString("名前")); // 件名の取得
				mail.setSubjectLine(rs.getString("件名")); // 件名の取得
				mail.setAttach(rs.getString("添付")); // 添付ファイルの取得
				mail.setSendTime(rs.getString("送信日時")); // 送信日時の取得
				mail.setReceiptTime(rs.getString("保存日時")); // 保存日時の取得
				mail.setClassId(rs.getString("メール種別")); // 種別IDの取得（0,送信 1,受信
														// 2,下書き
														// 3,ゴミ箱)

				list.add(mail);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			// データベースのクロース
			su.closeDB();
		}

		return list;
	}

	// ***************************************** //
	// 削除ボタンが押された際の動作（受信箱,下書き,送信箱）
	// ***************************************** //

	public int updateMail(String[] mailId, String userId, String classId) {
	    int count = 0;

	    String mailWhere = "WHERE メールID IN (";
	    //変更がない場合はそのまま返す
	    if (mailId == null) {
	    	return 0;
	    //チェックボックスにチェックがあった場合
	    } else {
	    	mailWhere = mailWhere + "'" + mailId[0] + "'";
	    	//複数件のチェックがあった場合
	    	if (mailId.length > 1) {
	    		for (int i=1; i<mailId.length; i++) {
			    	mailWhere = mailWhere + " , '" + mailId[i] + "'";
	    		}
	    	}
	    }
	    mailWhere = mailWhere + ") ";


	    // SQL文を組み立てる
	    	String sql = "UPDATE メール "+
	    	"SET メール種別ID = '" + classId + "' "
	    	+ mailWhere +
	    	"AND ユーザID = '"+ userId +"' ";

	    System.out.println("UPDATE文：" + sql);

	    // DBアクセス部品の生成
	    DBManager su = new DBManager();

	    // DBのオープン
	    su.openDB();

	    // UPDATE文の実行
	    count = su.updateSQL(sql);

	    // データベースのクローズ
	    su.closeDB();

	    return count;
	}

	// ***************************************** //
	// 削除ボタンが押された際の動作（ゴミ箱）
	// ***************************************** //
	public int deleteMail(String[] mailId, String userId, String classId) {
		int count = 0;

		  String mailWhere = " AND メールID IN (";
		    //変更がない場合はそのまま返す
		    if (mailId == null) {
		    	return 0;
		    //チェックボックスにチェックがあった場合
		    } else {
		    	mailWhere  = mailWhere + "'" + mailId[0] + "'";
		    	//複数件のチェックがあった場合
		    	if (mailId.length > 1) {
		    		for (int i=1; i<mailId.length; i++) {
				    	mailWhere = mailWhere + " , '" + mailId[i] + "'";
		    		}
		    	}
		    }
		    mailWhere = mailWhere + ") ";

		// SQL文を組み立てる
		String sql = "DELETE FROM メール " +
						 "WHERE メール種別ID = '" + classId + "'"
						 +" AND ユーザID = '" + userId + "'"
						 + mailWhere ;
		System.out.println("DELETE文：" + sql);

	    // DBアクセス部品の生成
		DBManager su = new DBManager();

	    // DBのオープン
	    su.openDB();

		// DELETE文の実行
		count = su.deleteSQL(sql);

		// データベースのクローズ
		su.closeDB();

		return count;
	}
}
