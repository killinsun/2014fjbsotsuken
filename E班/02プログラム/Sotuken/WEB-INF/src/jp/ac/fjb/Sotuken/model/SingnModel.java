package jp.ac.fjb.Sotuken.model;

import jp.ac.fjb.Sotuken.bean.SingnUpBean;
import jp.ac.fjb.Sotuken.util.DBManager;

public class SingnModel {

	public int insertUser(SingnUpBean user){
	int count =0;

	String sql ="INSERT INTO ユーザ(ユーザID,名前,フリガナ,性別ID,生年月日,メンバーID,パスワード," +
			"アドレス,郵便番号,出身地,部署ID, ユーザアイコン, 権限種別ID  )VALUES("
			+"lpad( seq1.nextval, 7, '0' )"+ ","
			+"'"+user.getName()+"',"
			+"'"+user.getKanaji()+"',"
			+"'"+user.getGender()+"',"
			+"'"+user.getBirthday()+"',"
			+"'"+user.getMemberId()+"',"
			+"'"+user.getPassWord()+"',"
			+"'"+user.getMailAddress()+"',"
			+"'"+user.getPostCode()+"',"
			+"'"+user.getShusshin()+"',"
			+"'"+user.getBusho() + "'"
			+", 'dumy.png', 'G1')";
	System.out.println("INSERT文:"+sql);

	// DBアクセス部品の生成
	DBManager dm = new DBManager();

			// DBのオープン
						dm.openDB();
			//INSERT文の実行
			count = dm.insertSQL(sql);
			//データベースのクローズ
			dm.closeDB();

		return count;
	}
}
