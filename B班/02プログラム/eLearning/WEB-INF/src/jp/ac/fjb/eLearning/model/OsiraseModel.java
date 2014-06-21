package jp.ac.fjb.eLearning.model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import jp.ac.fjb.eLearning.bean.OsiraseBean;
import jp.ac.fjb.eLearning.util.DBManager;

public class OsiraseModel {
	public ArrayList<OsiraseBean> getOsirase(String userId) {

		// SQL文を組み立てる
		String sql = "SELECT TO_CHAR(日付, 'YYYY/MM/DD') 日付,本文 from お知らせ表 where ユーザID='"+ userId + "'";


		System.out.println(sql);
		// DBアクセス部品の生成
		DBManager dm = new DBManager();

		// お知らせデータを格納するリスト
		ArrayList<OsiraseBean> listO = new ArrayList<OsiraseBean>();

		try {
			// DBのオープン
			dm.openDB();

			// SELECT文の実行
			ResultSet rs = dm.selectSQL(sql);



			while (rs.next()) {
				OsiraseBean o = new OsiraseBean();
				o.setHonbun(rs.getString("本文"));
				o.setHiduke(rs.getString("日付"));

				listO.add(o);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			// データベースのクロース
			dm.closeDB();
		}

		return listO;
	}
}
