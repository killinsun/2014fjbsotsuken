package jp.ac.fjb.sns.model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import jp.ac.fjb.sns.bean.OutputSearchResultBean;
import jp.ac.fjb.sns.util.DBManager;

public class SearchModel {

	// ********************************** //
	// 			ユーザを検索する		  //
	// ********************************** //

	public ArrayList<OutputSearchResultBean> searchUser(String userName, String gender, String age, String section, String carrier, String[] lisence, String freeSpace) {

		// SQL文を組み立てる
		String sql = "SELECT ユーザ表.ユーザID, 氏名, 性別, 部署名, 部署IMG, TRUNC((SYSDATE-入社年月日)/365+1, 0) AS 在社歴, レベル名, レベルIMG FROM ユーザ表, 部署表, レベル表, 所持資格表 WHERE ユーザ表.部署ID = 部署表.部署ID AND ユーザ表.レベルID = レベル表.レベルID AND ユーザ表.ユーザID = 所持資格表.ユーザID AND TRUNC((SYSDATE-生年月日)/365+1, 0) >=" + age;

		String where = "";

		// 検索キーワード(ユーザ名)が空か判定
		if (!userName.equals("")) {
			where = " AND ユーザ表.氏名 LIKE '%" + userName + "%'";
		}

		// 検索キーワード(性別)が空か判定
		if (!gender.equals("")) {
			where = where + " AND ユーザ表.性別 = '" + gender + "'";
		}

		// 検索キーワード(部署)が空か判定
		if (!section.equals("")) {
			where = where + " AND ユーザ表.部署ID = '" + section + "'";
		}

		// 検索キーワード(在社歴)が空か判定
		if (!carrier.equals("")) {
			where = where + " AND TRUNC((SYSDATE-入社年月日)/365+1, 0) >=" + carrier;
		}

		// 検索キーワード(フリースペース)が空か判定
		if (!freeSpace.equals("")) {
			where = " AND ユーザ表.自由欄 LIKE '%" + freeSpace + "%'";
		}

		// 検索キーワード(所持資格)が空か判定
		if (lisence != null) {
			where = where + " AND 所持資格表.資格ID IN(";

			for (int i = 0; i<lisence.length; i++) {
				if (i<(lisence.length-1)) {
					where = where + "'" + lisence[i] + "',";
				} else {
					where = where + "'" + lisence[i] + "')";
				}
			}
		}

		// SELECT文を組み立てる
		sql = sql + where + " GROUP BY ユーザ表.ユーザID, 氏名, 性別, 部署名, 部署IMG, TRUNC((SYSDATE-入社年月日)/365+1, 0), レベル名, レベルIMG ORDER BY レベルIMG DESC";

		// 組み立てたSELECT文をコンソールに表示する
		System.out.println(sql);

		// ユーザ一覧データを格納するリスト
		ArrayList<OutputSearchResultBean> list = new ArrayList<OutputSearchResultBean>();

		// DBアクセス部品の生成
		DBManager dm = new DBManager();

		try {
			// DBのオープン
			dm.openDB();

			// SELECT文の実行
			ResultSet rs = dm.selectSQL(sql);

	        while (rs.next()) {
				// 取得したユーザ情報をOutputSearchResultBeanに詰めてセッションに格納
	        	OutputSearchResultBean output = new OutputSearchResultBean();
	        	output.setResultUserId(rs.getString("ユーザID"));
	        	output.setResultUserName(rs.getString("氏名"));
	        	output.setResultGender(rs.getString("性別"));
	        	output.setSectionName(rs.getString("部署名"));
	        	output.setResultSectionImg(rs.getString("部署IMG"));
	        	output.setResultCarrier(rs.getString("在社歴"));
	        	output.setLevelName(rs.getString("レベル名"));
	        	output.setResultLevelImg(rs.getString("レベルIMG"));

	        	list.add(output);
	        }

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			// データベースのクローズ
			dm.closeDB();
		}

		// ユーザ情報を返す
		return list;

	}
}
