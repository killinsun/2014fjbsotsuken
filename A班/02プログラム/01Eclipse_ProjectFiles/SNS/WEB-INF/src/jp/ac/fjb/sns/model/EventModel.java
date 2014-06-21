package jp.ac.fjb.sns.model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import jp.ac.fjb.sns.bean.EventBean;
import jp.ac.fjb.sns.util.DBManager;

public class EventModel {

	public ArrayList<EventBean> getEvent(String date) {

		// イベント一覧を格納するリスト
	    ArrayList<EventBean> list = new ArrayList<EventBean>();

		//SQL文
		String sql = "SELECT イベントID,日付,開始時間,終了時間,タイトル,内容 FROM イベント表 WHERE 日付 = '" + date + "'";

		// DBアクセス部品の生成
		DBManager dm = new DBManager();

		try {
			// DBのオープン
			dm.openDB();

			// SELECT文の実行
			ResultSet rs = dm.selectSQL(sql);

			while (rs.next()) {
				EventBean event= new EventBean();
				event.setEventId(rs.getString("イベントID"));
				event.setDate(rs.getString("日付"));
				event.setStartHour(rs.getString("開始時間"));
				event.setFinHour(rs.getString("終了時間"));
				event.setTitle(rs.getString("タイトル"));
				event.setContent(rs.getString("内容"));
				event.setTempTitle(rs.getString("タイトル"));


				int startTime1 = Integer.parseInt(event.getStartHour().substring(0,2));
				System.out.println("開始時："+startTime1);
				int startTime2 = Integer.parseInt(event.getStartHour().substring(3,5));
				System.out.println("開始分："+startTime2);

				event.setTimeCount(((startTime1-6)*4)+startTime2/15);

				int endHour = Integer.parseInt(event.getFinHour().substring(0,2));
				System.out.println("終了時："+endHour);
				int endMinutes = Integer.parseInt(event.getFinHour().substring(3,5));
				System.out.println("終了分："+endMinutes);

				event.setEndTime(((endHour-6)*4)+endMinutes/15-1);

	            list.add(event);
	        }

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			// データベースのクローズ
			dm.closeDB();
		}
		return list;
	}

}
