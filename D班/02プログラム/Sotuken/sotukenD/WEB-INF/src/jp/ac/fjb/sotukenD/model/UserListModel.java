package jp.ac.fjb.sotukenD.model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import jp.ac.fjb.sotukenD.bean.UserEditBean;
import jp.ac.fjb.sotukenD.bean.UserListBean;
import jp.ac.fjb.sotukenD.bean.UserSignBean;
import jp.ac.fjb.sotukenD.util.DBManager;


public class UserListModel {
	//一覧として表示するユーザーの情報の取得
	public  ArrayList<UserListBean> getUserList(){

	ArrayList<UserListBean>list=new ArrayList<UserListBean>();
	String sql ="SELECT ユーザID,氏名 FROM ユーザー情報";

	System.out.print(sql);

	DBManager dm=new DBManager();

	try{
		dm.openDB();
		ResultSet rs=dm.selectSQL(sql);

		while(rs.next()){
			UserListBean listBean = new UserListBean();
			listBean.setListUserId (rs.getString("ユーザID"));
			listBean.setListUserName(rs.getString("氏名"));

			list.add(listBean);


		}
	}catch(SQLException e){
		e.printStackTrace();
	}finally{
	 dm.closeDB();
	}
	return list;
	}

    //削除するユーザーとその情報を指定
	public void delUserList(String userId){
		int count = 0;

		String sql ="DELETE FROM メール WHERE 受信ID = (SELECT メールアドレス FROM ユーザー情報 WHERE ユーザID = '"+userId+"')";
		String sql2 ="DELETE FROM シフト決定 WHERE ユーザID = '" + userId + "'";
		String sql3 ="DELETE FROM シフト希望 WHERE ユーザID = '" + userId + "'";
		String sql4 ="DELETE FROM ユーザー情報 WHERE ユーザID ='" + userId + "'";

		System.out.println(sql);
		System.out.println(sql2);
		System.out.println(sql3);
		System.out.println(sql4);
		// DBアクセス部品の生成
		DBManager dm = new DBManager();

		// DBのオープン
		dm.openDB();

		// DELETE文の実行
		count = dm.deleteSQL(sql);
		count = dm.deleteSQL(sql2);
		count = dm.deleteSQL(sql3);
		count = dm.deleteSQL(sql4);

		// データベースのクローズ
		dm.closeDB();
	}
	public void editUser(String userIde,UserEditBean userE){

	int count = 0;
	String sql="UPDATE ユーザー情報 SET ユーザID = "
				+"'"+userE.getEditUserIdE() + "',パスワード ="
				+"'"+userE.getEditUserPassE() + "',氏名 ="
				+"'"+userE.getEditUserNameE() + "',フリガナ ="
				+"'"+userE.getEditUserHuriE() + "',性別 ="
				+"'"+userE.getEditUserSexE() + "',生年月日 ="
				//性別はコンボボックスから数値を取得する
				+"'"+userE.getEditUserBirthE() + "',住所 ="
				//入社日は登録ボタンを押した時の年月日を取得する
				+"'"+userE.getEditUserHomeE() + "',メールアドレス ="
				+"'"+userE.getEditUserAddressE() + "',権限ID ="
				+"'"+userE.getEditUserKenE() + "'"
				+"WHERE ユーザID = '"+ userIde + "'";

	System.out.println("UPDATE文:"+sql);

	DBManager dm = new DBManager();
	dm.openDB();

	count=dm.insertSQL(sql);
	dm.closeDB();
	}
}
