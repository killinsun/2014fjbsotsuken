package jp.ac.fjb.eLearning.model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import jp.ac.fjb.eLearning.bean.MenteBean;
import jp.ac.fjb.eLearning.bean.NewsBean;
import jp.ac.fjb.eLearning.util.DBManager;

public class MenteModel {
	public ArrayList<MenteBean> getMente() {

		// SQL文を組み立てる
		String sql = "SELECT TO_CHAR(日付, 'YYYY/MM/DD') 日付,本文 from メンテナンス表 ORDER BY 日付 DESC";



		System.out.println(sql);
		// DBアクセス部品の生成
		DBManager dm = new DBManager();

		// お知らせデータを格納するリスト
		ArrayList<MenteBean> listMN = new ArrayList<MenteBean>();

		try {
			// DBのオープン
			dm.openDB();

			// SELECT文の実行
			ResultSet rs = dm.selectSQL(sql);

			while (rs.next()) {
				MenteBean o = new MenteBean();
				o.setHonbun(rs.getString("本文"));
				o.setHiduke(rs.getString("日付"));

				listMN.add(o);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			// データベースのクロース
			dm.closeDB();
		}

		return listMN;
	}
}
