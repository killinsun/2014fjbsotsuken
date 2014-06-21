package jp.ac.fjb.onsen.model;

import java.sql.ResultSet;
import java.sql.SQLException;

import jp.ac.fjb.onsen.bean.OnsenBean;
import jp.ac.fjb.onsen.bean.SyouhinBean;
import jp.ac.fjb.onsen.bean.UserBean;
import jp.ac.fjb.onsen.util.DBManager;



public class HomeModel {

	// ***************************************** //
	//  商品を取得
	// ***************************************** //
	public SyouhinBean getSyouhin(String id) {

		// 商品情報格納用
		SyouhinBean sh = new SyouhinBean();

		// SQL文を組み立てる
		String sql = "SELECT * FROM 商品表 WHERE 商品番号 = '" + id + "'";
		System.out.println(sql);

		// DBアクセス部品の生成
		DBManager dm = new DBManager();

		try {

			// DBのオープン
			dm.openDB();
			// SELECT文の実行
			ResultSet rs = dm.selectSQL(sql);
			// データが取得できなかったらnullを返す
			if ( !rs.next() ) {
				return null;
			}
			// 取得したユーザ情報をDAOに詰めてセッションに格納
			sh.setSyouhinID(rs.getString("商品番号"));
			sh.setSyouhinName(rs.getString("商品名"));
			sh.setSyouhinzyouhou(rs.getString("商品情報"));
			sh.setTanka(rs.getString("単価"));
			sh.setImagepass(rs.getString("画像パス"));
			sh.setChiikicode(rs.getString("地域コード"));
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			// データベースのクロース
			dm.closeDB();
		}

		// ユーザ情報を返す
		return sh;
	}
	// ***************************************** //
	//  温泉を取得
	// ***************************************** //
	public OnsenBean getOnsen(String id) {

		// ユーザ情報格納用
		OnsenBean on = new OnsenBean();

		// SQL文を組み立てる
		String sql = "SELECT * FROM 温泉表 WHERE 温泉番号 = '" + id + "'";
		System.out.println(sql);

		// DBアクセス部品の生成
		DBManager dm = new DBManager();

		try {

			// DBのオープン
			dm.openDB();

			// SELECT文の実行
			ResultSet rs = dm.selectSQL(sql);

			// データが取得できなかったらnullを返す
			if ( !rs.next() ) {
				return null;
			}

			// 取得したユーザ情報をDAOに詰めてセッションに格納
			on.setOnsenID(rs.getString("温泉番号"));
			on.setOnsenName(rs.getString("温泉名"));
			on.setOnsenzyouhou(rs.getString("温泉情報"));
			on.setHeyasuu(rs.getString("部屋数"));
			on.setHigaeri(rs.getString("日帰り温泉"));
			on.setSyukuhaku(rs.getString("宿泊温泉"));
			on.setImagepass(rs.getString("画像パス"));
			on.setChiikicode(rs.getString("地域コード"));
			on.setCount(rs.getString("検索回数"));
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			// データベースのクロース
			dm.closeDB();
		}

		// ユーザ情報を返す
		return on;
	}

}
