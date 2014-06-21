package jp.ac.fjb.sotukenD.model;

import jp.ac.fjb.sotukenD.bean.UserSignBean;
import jp.ac.fjb.sotukenD.util.DBManager;

public class UserSignModel {
	public int signUser(UserSignBean user){
	int count = 0;

	String sql="INSERT INTO ユーザー情報(ユーザID,パスワード,メールアドレス,氏名,フリガナ,性別,入社日,住所,電話番号,権限ID,生年月日)VALUES("
				+"'"+user.getSignUserIdS() + "',"
				+"'"+user.getSignUserPassS() + "',"
				+"'"+user.getSignUserAddressS() + "',"
				+"'"+user.getSignUserNameS() + "',"
				+"'"+user.getSignUserHuriS() + "',"
				//性別はコンボボックスから数値を取得する
				+"'"+user.getSignUserSexS() + "',"
				//入社日は登録ボタンを押した時の年月日を取得する
				+"sysdate,"
				+"'"+user.getSignUserHomeS() + "',"
				+"'"+user.getSignUserTellS() + "',"
				//権限はコンボボックスから数値を取得する
				+"'"+user.getSignUserKenS() + "',"
				+"'"+user.getSignUserBirthYYS() + "-"
				+ user.getSignUserBirthMMS() + "-"
				+ user.getSignUserBirthDDS() + "'"
				+ ")";
	System.out.println("INSERT文:"+sql);

	DBManager dm = new DBManager();
	dm.openDB();

	count=dm.insertSQL(sql);
	dm.closeDB();

	return count;
	}

}
