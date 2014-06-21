package jp.ac.fjb.onsen.model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import jp.ac.fjb.onsen.bean.SyouhinBean;
import jp.ac.fjb.onsen.bean.UserBean;
import jp.ac.fjb.onsen.util.DBManager;



public class KounyuModel {

	// ***************************************** //
	//  IDとパスワードを元に、ユーザ情報を取得する
	// ***************************************** //
	public ArrayList setRireki(String id) {

		// ユーザ情報格納用
		ArrayList rlist = new ArrayList();
		// SQL文を組み立てる
		String sql = "select 商品名,単価,画像パス from 注文情報表 tz,注文明細表 tm,商品表 s where '" + id + "' = tz.ユーザID and tz.注文番号=tm.注文番号 and tm.商品番号= s.商品番号 ";
//		String sql = "SELECT ユーザID, 姓 FROM ユーザ表";
		System.out.println(sql);

		// DBアクセス部品の生成
		DBManager dm = new DBManager();

		try {

			// DBのオープン
			dm.openDB();

			// SELECT文の実行
			ResultSet rs = dm.selectSQL(sql);
			// データが取得できなかったらnullを返す
			while(rs.next())
			{
				SyouhinBean sb = new SyouhinBean();
				// 取得したユーザ情報をDAOに詰めてセッションに格納
				sb.setSyouhinName(rs.getString("商品名"));
				sb.setTanka(rs.getString("単価"));
				sb.setImagepass(rs.getString("画像パス"));
				rlist.add(sb);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			// データベースのクロース
			dm.closeDB();
		}

		// ユーザ情報を返す
		return rlist;
	}

}
