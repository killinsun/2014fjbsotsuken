package jp.ac.fjb.sns.model;

import java.sql.ResultSet;
import java.sql.SQLException;

import jp.ac.fjb.sns.bean.UserBean;
import jp.ac.fjb.sns.util.DBManager;

public class LoginModel {

	public UserBean getUser(String userId, String passWord ) {

		UserBean user = new UserBean();

		String sql = "SELECT * FROM ユーザ表, 部署表, レベル表, 役職表 WHERE ユーザ表.部署ID = 部署表.部署ID AND ユーザ表.レベルID = レベル表.レベルID AND ユーザ表.役職ID = 役職表.役職ID AND ユーザID = '" + userId + "' AND パスワード = '" + passWord  + "'";
		System.out.println(sql);


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
			user.setUserId(rs.getString("ユーザID"));
			user.setUserName(rs.getString("氏名"));
			user.setGender(rs.getString("性別"));
			user.setBirthDay(rs.getString("生年月日"));
			user.setBloodType(rs.getString("血液型"));
			user.setAddress(rs.getString("連絡先"));
			user.setMailAddress(rs.getString("EMAIL"));
			user.setLevelId(rs.getString("レベルID"));
			user.setLevelName(rs.getString("レベル名"));
			user.setSectionId(rs.getString("部署ID"));
			user.setSectionName(rs.getString("部署名"));
			user.setPositionId(rs.getString("役職ID"));
			user.setPositionName(rs.getString("役職名"));
			user.setLevelImg(rs.getString("レベルIMG"));
			user.setSectionImg(rs.getString("部署IMG"));
			user.setPositionImg(rs.getString("役職IMG"));
			user.setCarrier(rs.getString("入社年月日"));
			user.setFreeSpace(rs.getString("自由欄"));

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			// データベースのクローズ
			dm.closeDB();
		}

		return user;
	}

}
