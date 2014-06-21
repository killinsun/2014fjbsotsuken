package jp.ac.fjb.sotukenD.model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import jp.ac.fjb.sotukenD.bean.ShiftShowFormBean;
import jp.ac.fjb.sotukenD.util.DBManager;

public class shiftShowModel {

	// モデル
	public ArrayList<ShiftShowFormBean> getShiftFinsh(String date) {

		System.out.println(date);
		ArrayList<ShiftShowFormBean> list = new ArrayList<ShiftShowFormBean>();

		String sql = "SELECT ユーザー情報.ユーザID,氏名,年月日,決定開始時刻,決定終了時刻 FROM シフト決定 INNER JOIN ユーザー情報 ON ユーザー情報.ユーザID = シフト決定.ユーザID WHERE 年月日 = '"
				+ date + "'";

		System.out.print(sql);

		DBManager dm = new DBManager();

		try {
			dm.openDB();
			ResultSet rs = dm.selectSQL(sql);

			while (rs.next()) {
				ShiftShowFormBean user = new ShiftShowFormBean();
				user.setUserID(rs.getString("ユーザID"));
				user.setUserName(rs.getString("氏名"));
				user.setDate(rs.getString("年月日"));
				user.setStartTime(rs.getString("決定開始時刻"));
				user.setFinishTime(rs.getString("決定終了時刻"));
				checkStyle(user); // 背景色変更
				list.add(user);

			}

			if (list.size() == 0) {
				ShiftShowFormBean user = new ShiftShowFormBean();
				user.setUserID("0000");
				user.setUserName("未設定");
				user.setDate(date);
				user.setStartTime("");
				user.setFinishTime("");


				list.add(user);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			dm.closeDB();
		}

		return list;
	}

	// メモリ化
	private void checkStyle(ShiftShowFormBean bean) {
		int sHour = Integer.parseInt(bean.getStartTime().substring(0, 2));
		int sMin = Integer.parseInt(bean.getStartTime().substring(3, 5));
		int fHour = Integer.parseInt(bean.getFinishTime().substring(0, 2));
		int fMin = Integer.parseInt(bean.getFinishTime().substring(3, 5));

		int s = (sHour * 2) - 16; // 一時間２メモリ、配列に使う関係
		int f = (fHour * 2) - 16;
		if (sMin == 30) {
			s = s + 1;
		}
		if (fMin == 30) {
			f = f + 1;
		}

		for (int i = s; i < f; i++) {
			bean.getStyle()[i] = "style=\"background-color:#CCCCCC; \"";
			bean.getCv()[i] = "in";

		}

	}
}
