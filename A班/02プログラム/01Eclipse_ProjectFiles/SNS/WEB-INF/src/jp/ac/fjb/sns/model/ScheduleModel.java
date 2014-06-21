package jp.ac.fjb.sns.model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import jp.ac.fjb.sns.bean.EventBean;
import jp.ac.fjb.sns.bean.ScheduleBean;
import jp.ac.fjb.sns.util.DBManager;

public class ScheduleModel {

	public ArrayList<ScheduleBean> getSchedule(String userId,String date) {

		// イベント一覧を格納するリスト
	    ArrayList<ScheduleBean> list = new ArrayList<ScheduleBean>();

		//SQL文
		String sql = "SELECT スケジュールID,日付,開始時間,終了時間,タイトル,内容 FROM スケジュール表 WHERE ユーザID = '" + userId + "'"
		+ "AND 日付 = '" + date + "'" ;

		// DBアクセス部品の生成
		DBManager dm = new DBManager();

		try {
			// DBのオープン
			dm.openDB();

			// SELECT文の実行
			ResultSet rs = dm.selectSQL(sql);

			while (rs.next()) {
				ScheduleBean schedule = new ScheduleBean();
				schedule.setScheduleId(rs.getString("スケジュールID"));
				schedule.setDate(rs.getString("日付"));
				schedule.setStartHour(rs.getString("開始時間"));
				schedule.setFinHour(rs.getString("終了時間"));
				schedule.setTitle(rs.getString("タイトル"));
				schedule.setContent(rs.getString("内容"));
				schedule.setTmpTitle(rs.getString("タイトル"));


				int startTime1 = Integer.parseInt(schedule.getStartHour().substring(0,2));
				System.out.println("開始時："+startTime1);
				int startTime2 = Integer.parseInt(schedule.getStartHour().substring(3,5));
				System.out.println("開始分："+startTime2);

				schedule.setTimeCount(((startTime1-6)*4)+startTime2/15);

				int endHour = Integer.parseInt(schedule.getFinHour().substring(0,2));
				System.out.println("終了時："+endHour);
				int endMinutes = Integer.parseInt(schedule.getFinHour().substring(3,5));
				System.out.println("終了分："+endMinutes);

				schedule.setEndTime(((endHour-6)*4)+endMinutes/15-1);

	            list.add(schedule);
	        }

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			// データベースのクローズ
			dm.closeDB();
		}
		return list;
	}

	//insert
	public int insertSchedule(String userId,String Date, ScheduleBean schedule){
		int count = 0;

		//SQL文
		String sql = "INSERT INTO スケジュール表(ユーザID,スケジュールID,日付,開始時間,終了時間,タイトル) VALUES("
				+ "'" + userId + "',"
				+ "'C' || lpad( スケジュールIDシーケンス.nextval, 4, '0' ), "
				+ "'" + Date + "', "
				+ "'" + schedule.getStartHour() + "', "
				+ "'" + schedule.getFinHour()+ "', "
				+ "'" + schedule.getTitle() + "' "
				+ ")";
		System.out.println("INSERT文:"+sql);

		// DBアクセス部品の生成
		DBManager dm = new DBManager();

		// DBのオープン
		dm.openDB();

		// SELECT文の実行
		count = dm.insertSQL(sql);

		// データベースのクロース
		dm.closeDB();

		return count;
	}



	private String lpad(String startHour, int i, char c) {
		// TODO 自動生成されたメソッド・スタブ
		return null;
	}

	//delete
		public int deleteSchedule(ScheduleBean schedule,String userId,String Date){
			int count = 0;

			//SQL文
			String sql = "insert into スケジュール表(ユーザID,スケジュールID,日付,開始時間,終了時間,タイトル) values("
					+ "'" + userId + "',"
					+ "'C' || lpad( スケジュールIDシーケンス.nextval, 4, '0' ), "
					+ "'" + Date + "', "
					+ "'" + schedule.getStartHour() + "', "
					+ "'" + schedule.getFinHour() + "', "
					+ "'" + schedule.getTitle() + "' "
					+ ")";
			System.out.println("INSERT文:"+sql);

			// DBアクセス部品の生成
			DBManager dm = new DBManager();

			// DBのオープン
			dm.openDB();

			// SELECT文の実行
			count = dm.insertSQL(sql);

			// データベースのクローズ
			dm.closeDB();

			return count;
	}

}