package jp.ac.fjb.sotukenD.model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import jp.ac.fjb.sotukenD.bean.ScheduleForBean;
import jp.ac.fjb.sotukenD.util.DBManager;

public class ScheduleModel {

	public ArrayList<ScheduleForBean> getScheduleList() {
		ArrayList<ScheduleForBean> list = new ArrayList<ScheduleForBean>();

		String sql = "SELECT スケジュールID,件名,内容,開始年月日,終了年月日 FROM スケジュール ORDER BY スケジュールID ASC";

		System.out.println(sql);

		DBManager dm = new DBManager();

		try {
			// DBのオープン
			dm.openDB();

			// SELECT文の実行
			ResultSet rs = dm.selectSQL(sql);

			while (rs.next()) {
				ScheduleForBean schedule = new ScheduleForBean();
				schedule.setScheduleId(rs.getString("スケジュールID"));
				schedule.setEventName(rs.getString("件名"));
				schedule.setEventContent(rs.getString("内容"));
				schedule.setEventStart(rs.getString("開始年月日"));
				schedule.setEventEnd(rs.getString("終了年月日"));

				list.add(schedule);
			}



		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			// データベースのクロース
			dm.closeDB();
		}

		return list;
	}


	//  イベントを登録する
	public int insertSchedule(String eventStart,String eventEnd,String eventContent,String eventTitle) {
		int count = 0;

		// SQL文を組み立てる
		String sql = "INSERT INTO スケジュール VALUES(スケジュールIDシーケンス.nextval,"
						+ "'" + eventStart +  "', "
						+ eventEnd +  ", "
						+ "'" + eventContent +  "', "
						+ "'" + eventTitle +  "'"
						+ ")";
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


//  イベントを更新する
	public int updateEvent(String scheduleId,String eventStart,String eventEnd,String eventContent,String eventTitle) {
		int count = 0;

		// SQL文を組み立てる
		String sql = "UPDATE スケジュール "
				+ "SET 件名 = '" + eventTitle + "'" +
				",内容 = '" + eventContent + "'" +
				",開始年月日 = '" + eventStart + "'" +
				",終了年月日 = " + eventEnd  +
				 " WHERE スケジュールID = '" + scheduleId + "'";
		System.out.println("UPDATE文：" + sql);

		// DBアクセス部品の生成
		DBManager dm = new DBManager();

		// DBのオープン
		dm.openDB();

		// DELETE文の実行
		count = dm.updateSQL(sql);
		// データベースのクローズ
		dm.closeDB();

		return count;
	}

	//  イベントを削除する
	public int deleteEvent(String scheduleId) {
		int count = 0;

		// SQL文を組み立てる
		String sql = "DELETE FROM スケジュール "
						+ "WHERE スケジュールID = '" + scheduleId + "'";
		System.out.println("DELETE文：" + sql);

		// DBアクセス部品の生成
		DBManager dm = new DBManager();

		// DBのオープン
		dm.openDB();

		// DELETE文の実行
		count = dm.deleteSQL(sql);

		// データベースのクローズ
		dm.closeDB();

		return count;
	}

}
