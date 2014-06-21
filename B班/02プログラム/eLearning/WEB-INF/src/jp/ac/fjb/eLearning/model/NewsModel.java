package jp.ac.fjb.eLearning.model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import jp.ac.fjb.eLearning.bean.NewsBean;
import jp.ac.fjb.eLearning.util.DBManager;

public class NewsModel {
	public ArrayList<NewsBean> getNews() {

		// SQL文を組み立てる
		String sql = "SELECT TO_CHAR(日付, 'YYYY/MM/DD') 日付,本文 from 新着ニュース表 ORDER BY 日付 DESC";


		System.out.println(sql);
		// DBアクセス部品の生成
		DBManager dm = new DBManager();

		// お知らせデータを格納するリスト
		ArrayList<NewsBean> listN = new ArrayList<NewsBean>();

		try {
			// DBのオープン
			dm.openDB();

			// SELECT文の実行
			ResultSet rs = dm.selectSQL(sql);

			while (rs.next()) {
				NewsBean o = new NewsBean();
				o.setHonbun(rs.getString("本文"));
				o.setHiduke(rs.getString("日付"));

				listN.add(o);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			// データベースのクロース
			dm.closeDB();
		}

		return listN;
	}
}
