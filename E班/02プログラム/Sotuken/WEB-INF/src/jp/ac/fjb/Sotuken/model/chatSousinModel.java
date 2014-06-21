package jp.ac.fjb.Sotuken.model;

import java.sql.ResultSet;
import java.sql.SQLException;

import jp.ac.fjb.Sotuken.bean.groupChatBean;
import jp.ac.fjb.Sotuken.util.DBManager;;

public class chatSousinModel {

	public void chatSousin(String messageIn, String userID, String groupId){

		//一番大きいメッセージIDを出すSQL
		String selectSql = "SELECT A.メッセージID,ユーザID,グループID,メッセージ内容 FROM メッセージ,(SELECT MAX(メッセージID) AS メッセージID FROM メッセージ) A WHERE A.メッセージID = メッセージ.メッセージID";

		DBManager dm = new DBManager();

		groupChatBean message = new groupChatBean();

		try {
			// DBのオープン
			dm.openDB();

			// SELECT文の実行
			ResultSet rs = dm.selectSQL(selectSql);

			rs.next();

			//MAXメッセージIDげっと
			message.setMaxMessageID(rs.getString("メッセージID"));

			message.setUserID(rs.getString("ユーザID"));
			message.setGroupID(rs.getString("グループID"));
			message.setMessage(rs.getString("メッセージ内容"));


		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			// データベースのクロース
			dm.closeDB();
		}
		//ここまではおｋ
		//System.out.println(message.getMaxMessageID());

		String USER_ID = message.getUserID();
		String GROUP_ID = message.getGroupID();
		String MESSAGE = message.getMessage();
		System.out.println(USER_ID + GROUP_ID + MESSAGE);

		//MAXメッセージIDに＋１する処理を書く予定地
		String MaxMessageIDmk2 = message.getMaxMessageID();
		String MaxMessageIDmk3 = MaxMessageIDmk2.substring(2,8);
		System.out.println("切り取り" + MaxMessageIDmk3);
		int MaxMessageIDmk4 = 1 + Integer.parseInt(MaxMessageIDmk3);

		//String MaxMessageIDmk5 = String.valueOf(MaxMessageIDmk4);

		String MaxMessageIDmk5 = "";

		if(MaxMessageIDmk4 < 10){

			MaxMessageIDmk5 = "MS00000";

		}else if(MaxMessageIDmk4 < 100){

			MaxMessageIDmk5 = "MS0000";

		}else if(MaxMessageIDmk4 < 1000){

			MaxMessageIDmk5 = "MS000";

		}else if(MaxMessageIDmk4 < 10000){

			MaxMessageIDmk5 = "MS00";

		}else if(MaxMessageIDmk4 < 100000){

			MaxMessageIDmk5 = "MS0";

		}else if(MaxMessageIDmk4 < 1000000){

			MaxMessageIDmk5 = "MS";

		}

		//MaxMessageIDmk5がくさい→大丈夫だったよ！
		String MaxMessageIDmk6 = MaxMessageIDmk5 + String.valueOf(MaxMessageIDmk4);

		System.out.println("入れるメッセージID→" + MaxMessageIDmk6);

		//INSERT文を入れる
		System.out.println(groupId);


		String insertSql = "INSERT INTO メッセージ VALUES ('" + MaxMessageIDmk6 + "','" + userID + "','" + groupId + "','"+ messageIn +"','',SYSDATE,'')";

		//System.out.println("★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆メッセージID→" + insertSql);
		//System.out.println("★☆★☆★☆★☆★☆★☆見比べ用の入れるメッセージID→" + "INSERT INTO メッセージ VALUES ('MS000008','0000001','G0001','テストメッセ','',SYSDATE,'')");

		// DBのオープン
		dm.openDB();

		// INSERT文の実行 テストでは外します！
		if(messageIn == ""){

		}else{

		dm.insertSQL(insertSql);

		}

		// データベースのクローズ
		dm.closeDB();

	}

	public void chatStamp(String stampID,String userID,String groupId){

		//一番大きいメッセージIDを出すSQL
				String selectSql = "SELECT MAX(メッセージID) AS メッセージID FROM メッセージ";

				DBManager dm = new DBManager();

				groupChatBean message = new groupChatBean();

				try {
					// DBのオープン
					dm.openDB();

					// SELECT文の実行
					ResultSet rs = dm.selectSQL(selectSql);

					rs.next();

					//groupChatBean message = new groupChatBean();


					//MAXメッセージIDげっと
					message.setMaxMessageID(rs.getString("メッセージID"));

				} catch (SQLException e) {
					e.printStackTrace();
				} finally {
					// データベースのクロース
					dm.closeDB();
				}
				//ここまではおｋ
				//System.out.println(message.getMaxMessageID());

				//MAXメッセージIDに＋１する処理を書く予定地

				String MaxMessageIDmk2 = message.getMaxMessageID();
				String MaxMessageIDmk3 = MaxMessageIDmk2.substring(2,8);
				System.out.println("切り取り" + MaxMessageIDmk3);
				int MaxMessageIDmk4 = 1 + Integer.parseInt(MaxMessageIDmk3);

				//String MaxMessageIDmk5 = String.valueOf(MaxMessageIDmk4);

				String MaxMessageIDmk5 = "";

				if(MaxMessageIDmk4 < 10){

					MaxMessageIDmk5 = "MS00000";

				}else if(MaxMessageIDmk4 < 100){

					MaxMessageIDmk5 = "MS0000";

				}else if(MaxMessageIDmk4 < 1000){

					MaxMessageIDmk5 = "MS000";

				}else if(MaxMessageIDmk4 < 10000){

					MaxMessageIDmk5 = "MS00";

				}else if(MaxMessageIDmk4 < 100000){

					MaxMessageIDmk5 = "MS0";

				}else if(MaxMessageIDmk4 < 1000000){

					MaxMessageIDmk5 = "MS";

				}

				String MaxMessageIDmk6 = MaxMessageIDmk5 + String.valueOf(MaxMessageIDmk4);

				System.out.println("入れるメッセージID→" + MaxMessageIDmk6);

				//INSERT文を入れる
				System.out.println(stampID);
				String insertSql = "INSERT INTO メッセージ VALUES ('" + MaxMessageIDmk6 + "','" + userID + "','" + groupId + "','スタンプが送信されました','" + stampID + "',SYSDATE,'')";

				System.out.println("★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆スタンプINSERT文→" + insertSql);
				//System.out.println("★☆★☆★☆★☆★☆★☆見比べ用の入れるメッセージID→" + "INSERT INTO メッセージ VALUES ('MS000008','0000001','G0001','テストメッセ','',SYSDATE,'')");

				// DBのオープン
				dm.openDB();

				// INSERT文の実行 テストでは外します！
				System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!INSERT文をはずしてます");
				if(stampID != null){
					System.out.println("nullじゃないからin");
					dm.insertSQL(insertSql);
				}else{
					System.out.println("nullだからinしない");
				}


				// データベースのクローズ
				dm.closeDB();
	}
}
