package jp.ac.fjb.sotukenD.model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import jp.ac.fjb.sotukenD.bean.UserContactBean;
import jp.ac.fjb.sotukenD.util.DBManager;

public class ContactModel {
	public  ArrayList<UserContactBean> getUserList(){
	ArrayList<UserContactBean>list=new ArrayList<UserContactBean>();
	String sql ="SELECT ユーザID,氏名,電話番号 FROM ユーザー情報";

	System.out.print(sql);

	DBManager dm=new DBManager();

	try{
		dm.openDB();
		ResultSet rs=dm.selectSQL(sql);

		while(rs.next()){
			UserContactBean contactBean = new UserContactBean();
			contactBean.setContactUserId(rs.getString("ユーザID"));
			contactBean.setContactUserName(rs.getString("氏名"));
			contactBean.setContactUserTell(rs.getString("電話番号"));

			list.add(contactBean);


		}
	}catch(SQLException e){
		e.printStackTrace();
	}finally{
	 dm.closeDB();
	}
	return list;
	}
}
