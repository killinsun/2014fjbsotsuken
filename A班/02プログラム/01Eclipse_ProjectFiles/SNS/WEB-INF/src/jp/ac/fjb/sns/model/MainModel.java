package jp.ac.fjb.sns.model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import jp.ac.fjb.sns.bean.OutputSearchResultBean;
import jp.ac.fjb.sns.bean.ChatBean;
import jp.ac.fjb.sns.bean.EventBean;
import jp.ac.fjb.sns.bean.RoomBean;
import jp.ac.fjb.sns.bean.UserBean;
import jp.ac.fjb.sns.util.DBManager;

public class MainModel {

	// ******************************* //
	// DBからルーム情報を取出す		   //
	// ******************************* //
	public ArrayList<RoomBean> viewRoom(String userId){

		//SQL文の組み立て
		String sql = "SELECT チャットルーム表.ルームID, ルーム名, 作成者ユーザID FROM チャットルーム表, 入室ルーム表 WHERE 入室ルーム表.ルームID = チャットルーム表.ルームID AND ユーザID = '" + userId + "'";
		String sql2 = "SELECT ルームID, COUNT(ユーザID) AS 人数 FROM 入室ルーム表 GROUP BY ルームID";

		// SQL文をコンソールに表示する
		System.out.println(sql);
		System.out.println(sql2);

		//DBアクセス部品の生成
		DBManager dm = new DBManager();
		ArrayList<RoomBean> list = new ArrayList<RoomBean>();
		ArrayList<RoomBean> list2 = new ArrayList<RoomBean>();
		try {
			// DBのオープン
			dm.openDB();

			// SELECT文の実行
			ResultSet rs = dm.selectSQL(sql);

			while (rs.next()) {
				RoomBean room = new RoomBean();
				room.setRoomId(rs.getString("ルームID"));
				room.setUserId(rs.getString("作成者ユーザID"));
				room.setRoomName(rs.getString("ルーム名"));
				list.add(room);
			}

			ResultSet rs2 = dm.selectSQL(sql2);

			while (rs2.next()) {
				RoomBean room2 = new RoomBean();
				room2.setRoomId(rs2.getString("ルームID"));
				room2.setCountId(rs2.getString("人数"));
				list2.add(room2);
			}

			for (int i = 0; i<list.size(); i++) {
				RoomBean room = (RoomBean)list.get(i);
				for (int j = 0; j<list2.size(); j++) {
					RoomBean room2 = (RoomBean)list2.get(j);
					if (room.getRoomId().equals(room2.getRoomId())) {
						room.setCountId(room2.getCountId());
						break;
					}
				}
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			// データベースのクローズ
			dm.closeDB();
		}

		return list;
	}


	// ******************************* //
	//イベント情報取出し			   //
	// ******************************* //
	public ArrayList<EventBean> event() {
		// SQL文の組み立て
		String sql ="SELECT * FROM イベント表";
		//Dbアクセス部品
		DBManager dm = new DBManager();
		ArrayList<EventBean> list = new ArrayList<EventBean>();
		try {
			// DBのオープン
			dm.openDB();

			// SELECT文の実行
			ResultSet rs = dm.selectSQL(sql);

			while (rs.next()) {
				EventBean event = new EventBean();
				event.setDate(rs.getString("日付"));
				event.setTitle(rs.getString("タイトル"));
				list.add(event);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			// データベースのクローズ
			dm.closeDB();
		}

		return list;
	}


	// ******************************* //
	// DBへ部屋名を格納				   //
	// ******************************* //
	public void insertRoom(String roomName, String userId) {
		// SQL文の組み立て
		String sql = "INSERT INTO チャットルーム表 VALUES('R' || lpad( ルームIDシーケンス.NEXTVAL, 3, '0' ),'"
				+ userId + "','" + roomName + "')";

		String sql2 = "SELECT ルーム名 FROM チャットルーム表 WHERE ルーム名 = '" + roomName + "'";

		// DBアクセス部品の生成
		DBManager dm = new DBManager();

		try {
			// DBのオープン
			dm.openDB();

			// SELECT文の実行
			ResultSet rs = dm.selectSQL(sql2);

			if (rs == null || !rs.next()) {
				// INSERT文の実行
				dm.insertSQL(sql);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			// データベースのクローズ
			dm.closeDB();
		}

	}


	// ******************************* //
	// DBから最新の部屋番号を取得	   //
	// ******************************* //
	public String createRoomNo(String userId) {
		// SQL文の組み立て
		String sql = "SELECT MAX(ルームID) ルームID FROM チャットルーム表 WHERE チャットルーム表.作成者ユーザID = '"+ userId + "'";

		// DBアクセス部品の生成
		DBManager dm = new DBManager();

		String maxRoomNo = null;

		try {
			// DBのオープン
			dm.openDB();

			// SELECT文の実行
			ResultSet rs = dm.selectSQL(sql);

			rs.next();
			maxRoomNo = rs.getString("ルームID");

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			// データベースのクローズ
			dm.closeDB();
		}

		return maxRoomNo;
	}


	// ******************************* //
	// 作成者のユーザを入室させる	   //
	// ******************************* //
	public void chatRoom(String maxRoomNo, String userId) {
		// SQL文の組み立て
		String sql = "INSERT INTO 入室ルーム表 VALUES('" + userId  + "', '" + maxRoomNo + "')";

		// DBアクセス部品の生成
		DBManager dm = new DBManager();

		// DBのオープン
		dm.openDB();

		// INSERT文の実行
		dm.insertSQL(sql);

		// データベースのクローズ
		dm.closeDB();
	}


	// ******************************* //
	// 選択したユーザを入室させる	   //
	// ******************************* //
	public void joinRoom(String roomId, ArrayList<OutputSearchResultBean> list) {

		// DBアクセス部品の生成
		DBManager dm = new DBManager();
		ArrayList<OutputSearchResultBean> list2 = new ArrayList<OutputSearchResultBean>();

		try {
			// DBのオープン
			dm.openDB();

			for (int i=0; i<list.size(); i++) {
				// SQL文の組み立て
				String sql = "INSERT INTO 入室ルーム表 VALUES('" + (list.get(i)).getResultUserId() +"', '" + roomId + "')";

				String sql2 = "SELECT * FROM 入室ルーム表 WHERE ルームID ='" + roomId + "' AND ユーザID = '" + (list.get(i)).getResultUserId() + "'";

				// SELECT文の実行
				ResultSet rs = dm.selectSQL(sql2);

				if(rs == null || !rs.next()){
					// INSERT文の実行
					dm.insertSQL(sql);
				}
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			// データベースのクローズ
			dm.closeDB();
		}
	}


	// ******************************* //
	//選択した部屋の発言内容を表示	   //
	// ******************************* //
	public ArrayList<ChatBean> chatlist(String progId){
	// SQL文の組み立て
		String sql = "SELECT 発言内容,ユーザ表.氏名 発言者 FROM 発言表,ユーザ表 "
				+ "WHERE 発言表.ユーザID = ユーザ表.ユーザID AND 発言表.ルームID='"
				+ progId + "' ORDER BY 発言ID ASC";
		DBManager dm = new DBManager();
		ArrayList<ChatBean> list = new ArrayList<ChatBean>();

		try {
			// DBのオープン
			dm.openDB();

			// SELECT文の実行
			ResultSet rs = dm.selectSQL(sql);

			while (rs.next()) {
				ChatBean chat = new ChatBean();
				chat.setChat(rs.getString("発言内容"));
				chat.setUserName(rs.getString("発言者"));
				list.add(chat);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			// データベースのクローズ
			dm.closeDB();
		}
		return list;
	}

	// ******************************* //
	//発言内容を発信				   //
	// ******************************* //
	public int insertChat(String chatText, Object object, String userId) {
		int count = 0;
		String sql = "INSERT INTO 発言表 VALUES('H' || LPAD( ルームIDシーケンス.NEXTVAL, 3, '0' ),'"+object+"','"+userId+"','"+chatText+"','')";
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

