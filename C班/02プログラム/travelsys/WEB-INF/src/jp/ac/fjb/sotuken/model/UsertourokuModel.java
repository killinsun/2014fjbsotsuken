package jp.ac.fjb.sotuken.model;

import jp.ac.fjb.sotuken.bean.UserBean;
import jp.ac.fjb.sotuken.bean.userregisterFormBean;
import jp.ac.fjb.sotuken.util.DBManager;

public class UsertourokuModel {
	public int insertUser(userregisterFormBean user) {
	    int count = 0;
	    String seinen=user.getYear()+"-"+user.getMonth()+"-"+user.getDay();

	    // SQL文を組み立てる
	    String sql = "INSERT INTO ユーザ(ユーザID, パスワード, メールアドレス, 名前, フリガナ, 生年月日, 性別, 郵便番号, 住所, 電話番号,ユーザ種別ID) VALUES("
	                    + "'" + user.getLogin_id()   +  "', "
	                    + "'" + user.getLogin_pw() +  "', "
	                    + "'" + user.getEmail() +  "', "
	                    + "'" + user.getName1() +  "', "
	                    + "'" + user.getName2() +  "', "
	                    + "'" + seinen +  "', "
	                    + "'" + user.getSex() +  "' ,"
	                    + "'" + user.getPostcode() +  "', "
	                    + "'" + user.getAddress() +  "', "
	                    + "'" + user.getTel() +  "' ,"
	                    +"'1')";
	    System.out.println("INSERT文：" + sql);

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
