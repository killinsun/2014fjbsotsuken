package jp.ac.fjb.Sotuken.model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import jp.ac.fjb.Sotuken.bean.groupSelectBean;
import jp.ac.fjb.Sotuken.util.DBManager;

public class groupSelectModel {

	public ArrayList<groupSelectBean> getGroupSelect(String userID){



		//直したよ11/26 直すべき11/26
		String selectSql = 	"SELECT グループ.グループID,グループ.グループ名, グループ.グループ画像, メッセージ.メッセージID,メッセージ.メッセージ内容 FROM メッセージ, グループ, グループ管理,(SELECT グループID,MAX(メッセージID) メッセージID FROM メッセージ GROUP BY グループID) A WHERE グループ.グループID = A.グループID AND   メッセージ.メッセージID = A.メッセージID AND   グループ.グループID = A.グループID AND   グループ.グループID = グループ管理.グループID AND   グループ管理.ユーザID =" + userID + "ORDER BY メッセージID desc";

		//spl文の出力 コンソールを、ちゃんと見る事。
		System.out.println(selectSql);

		DBManager dm = new DBManager();

		ArrayList<groupSelectBean> list = new ArrayList<groupSelectBean>();

		try {

			//open D B
			dm.openDB();

			//SELECT文の実行
			ResultSet rs = dm.selectSQL(selectSql);

			while(rs.next()){
				//瓶詰処理
				groupSelectBean select = new groupSelectBean();
				select.setGroupID(rs.getString("グループID"));
				select.setGroupName(rs.getString("グループ名"));
				select.setGrouoImg(rs.getString("グループ画像"));
				select.setMessageID(rs.getString("メッセージID"));
				select.setMessage(rs.getString("メッセージ内容"));
				//五行封印 select.setSousinTime(rs.getString("送信時間")); 五行封印

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

}
