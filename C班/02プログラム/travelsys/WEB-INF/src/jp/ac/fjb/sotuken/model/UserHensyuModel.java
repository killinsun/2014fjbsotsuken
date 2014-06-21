package jp.ac.fjb.sotuken.model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import jp.ac.fjb.sotuken.bean.HenkouBean;
import jp.ac.fjb.sotuken.bean.UserBean;
import jp.ac.fjb.sotuken.util.DBManager;

public class UserHensyuModel {

	// ***************************************** //
	//  IDとパスワードを元に、ユーザ情報を取得する
	// ***************************************** //
	int count =0;
	public int  henkouUser(String hid, String hpass,String hmailaddress, String hname, String hhurigana , String hyear , String hmonth , String hday, String hsex,String hyubin,String haddress,String htell) throws SQLException {

		String seinengappi=hyear+"-"+hmonth+"-"+hday;
		// ユーザ情報格納用
		HenkouBean huser = new HenkouBean();

		// SQL文を組み立てる
		String sql = "update ユーザ set パスワード='" +hpass+"',名前='"+hname+"',フリガナ='"+hhurigana+"',メールアドレス='"+hmailaddress+"',生年月日='"+seinengappi+"',性別='"+hsex+"',郵便番号='"+hyubin+"',住所='"+haddress+"',電話番号='"+htell +"'where ユーザID='"+hid+"'";
		System.out.println(sql);

		// DBアクセス部品の生成
		DBManager dm = new DBManager();

		try {

			// DBのオープン
			dm.openDB();

			// SELECT文の実行
			count = dm.updateSQL(sql);





		} finally {
			// データベースのクロース
			dm.closeDB();
		}

		// ユーザ情報を返す
		return count;
	}

}
