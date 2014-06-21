package jp.ac.fjb.Sotuken.model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import jp.ac.fjb.Sotuken.bean.groupChatBean;
import jp.ac.fjb.Sotuken.bean.stampBean;
import jp.ac.fjb.Sotuken.util.DBManager;

public class groupChatModel {

	public ArrayList<groupChatBean> getGroupChat(String groupID){


		//チャットログをselect文で取得
		String selectSql = 	"SELECT A.グループID,A.ユーザID,A.グループ名,A.名前,A.ユーザアイコン,B.メッセージID,B.メッセージ内容,B.スタンプID,B.スタンプ画像,B.チャット画像 FROM (SELECT グループ管理.グループID,グループ管理.ユーザID,グループ名,ユーザ.名前,ユーザ.ユーザアイコン FROM グループ管理,グループ,ユーザ WHERE グループ管理.グループID = グループ.グループID AND グループ管理.ユーザID = ユーザ.ユーザID) A , (SELECT メッセージID,ユーザID,メッセージ内容,グループID,スタンプ.スタンプID,スタンプ.スタンプ画像,チャット画像 FROM メッセージ,スタンプ WHERE メッセージ.スタンプID = スタンプ.スタンプID(+)) B WHERE A.ユーザID = B.ユーザID AND A.グループID = B.グループID AND A.グループID = '" + groupID + "' ORDER BY メッセージID DESC";
		//SELECT文のc(selectSql);

		DBManager dm = new DBManager();

		ArrayList<groupChatBean> list = new ArrayList<groupChatBean>();

		try {

			//open D B
			dm.openDB();

			//SELECT文の実行
			ResultSet rs = dm.selectSQL(selectSql);

			while(rs.next()){
				//瓶詰処理
				groupChatBean select = new groupChatBean();
				select.setGroupName(rs.getString("グループ名"));
				select.setUserName(rs.getString("名前"));
				select.setUserGazou(rs.getString("ユーザアイコン"));
				select.setMessage(rs.getString("メッセージ内容"));
				select.setStampID(rs.getString("スタンプID"));
				select.setStampGazou(rs.getString("スタンプ画像"));
				select.setChatGazou(rs.getString("チャット画像"));
				//必要な値の瓶詰処理予定地

				list.add(select);
			}

		}  catch (SQLException e) {
			e.printStackTrace();
		} finally {
			// クローズ データベース
			dm.closeDB();
		}
		return list;

	}

	//スタンプ一覧取得
	public ArrayList<stampBean> getStampSelect(){

		//チャットログをselect文で取得
		String selectSql = 	"SELECT * FROM スタンプ";
		//SELECT文のc(selectSql);

		DBManager dm = new DBManager();

		ArrayList<stampBean> stampList = new ArrayList<stampBean>();

		try {

			//open D B
			dm.openDB();

			//SELECT文の実行
			ResultSet rs = dm.selectSQL(selectSql);

			while(rs.next()){
				//瓶詰処理
				stampBean select = new stampBean();
				select.setStampID(rs.getString("スタンプID"));
				select.setStampGazou(rs.getString("スタンプ画像"));
				//必要な値の瓶詰処理予定地

				stampList.add(select);
			}

		}  catch (SQLException e) {
			e.printStackTrace();
		} finally {
			// クローズ データベース
			dm.closeDB();
		}
		return stampList;

	}

}
