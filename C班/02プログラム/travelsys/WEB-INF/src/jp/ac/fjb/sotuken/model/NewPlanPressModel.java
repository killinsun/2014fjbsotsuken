package jp.ac.fjb.sotuken.model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.servlet.http.HttpServlet;

import jp.ac.fjb.sotuken.bean.HotelBean;
import jp.ac.fjb.sotuken.bean.KankouchiBean;
import jp.ac.fjb.sotuken.bean.KenBean;
import jp.ac.fjb.sotuken.bean.StationBean;
import jp.ac.fjb.sotuken.util.DBManager;

public class NewPlanPressModel extends HttpServlet{

	//県名一覧を取得
	public ArrayList<KenBean> getKenList(){

		//掲示板格納用Bean
		KenBean ken ;
		// 掲示板一覧データを格納するリスト
		ArrayList<KenBean> list = new ArrayList<KenBean>();

		//SQL文の作成
		String sql = "SELECT 県.県ID,県.県名,県.地域ID,地域.地域名 FROM 県,地域 WHERE 県.地域ID=地域.地域ID";

		// DBアクセス部品の生成
		DBManager dm = new DBManager();

		try {
			// DBのオープン
			dm.openDB();

			// SELECT文の実行
			ResultSet rs = dm.selectSQL(sql);

			while (rs.next()) {
				ken = new KenBean();
				ken.setKenId(rs.getString("県ID"));
				ken.setKenName(rs.getString("県名"));
				ken.setChiikiId(rs.getString("地域ID"));
				ken.setChiikiName(rs.getString("地域名"));

				list.add(ken);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			// データベースのクロース
			dm.closeDB();
		}

				return list;
	}

	//観光地一覧を取得
		public ArrayList<KankouchiBean> getKankochiList(){

			//掲示板格納用Bean
			KankouchiBean kankochi;
			// 掲示板一覧データを格納するリスト
			ArrayList<KankouchiBean> list = new ArrayList<KankouchiBean>();

			//SQL文の作成
			String sql = "SELECT * FROM 観光地";

			// DBアクセス部品の生成
			DBManager dm = new DBManager();

			try {
				// DBのオープン
				dm.openDB();

				// SELECT文の実行
				ResultSet rs = dm.selectSQL(sql);

				while (rs.next()) {
					kankochi = new KankouchiBean();
					kankochi.setKankochiId(rs.getString("観光地ID"));
					kankochi.setKankochiName(rs.getString("観光地名"));
					kankochi.setKenId(rs.getString("県ID"));

					list.add(kankochi);
				}

			} catch (SQLException e) {
				e.printStackTrace();
			} finally {
				// データベースのクロース
				dm.closeDB();
			}

					return list;
		}

		public ArrayList<StationBean> getStationList(){

			//駅格納用Bean
			StationBean sta;
			// 駅データを格納するリスト
			ArrayList<StationBean> list = new ArrayList<StationBean>();

			//SQL文の作成
			String sql = "SELECT * FROM 駅 ";

			// DBアクセス部品の生成
			DBManager dm = new DBManager();

			try {
				// DBのオープン
				dm.openDB();

				// SELECT文の実行
				ResultSet rs = dm.selectSQL(sql);

				while (rs.next()) {
					sta = new StationBean();
					sta.setStationId(rs.getString("駅ID"));
					sta.setStationname(rs.getString("駅名"));
					sta.setStationhurigana(rs.getString("フリガナ"));

					list.add(sta);
				}

			} catch (SQLException e) {
				e.printStackTrace();
			} finally {
				// データベースのクロース
				dm.closeDB();
			}

					return list;
		}

		public ArrayList<HotelBean> getHotelList(){

			//宿泊先格納用Bean
			HotelBean hotel;
			// 掲示板一覧データを格納するリスト
			ArrayList<HotelBean> list = new ArrayList<HotelBean>();

			//SQL文の作成
			String sql = "SELECT * FROM 宿泊先";

			// DBアクセス部品の生成
			DBManager dm = new DBManager();

			try {
				// DBのオープン
				dm.openDB();

				// SELECT文の実行
				ResultSet rs = dm.selectSQL(sql);

				while (rs.next()) {
					hotel = new HotelBean();
					hotel.setHotelId(rs.getString("宿泊先ID"));
					hotel.setHotelName(rs.getString("宿泊先名"));
					hotel.setFurigana(rs.getString("フリガナ"));
					hotel.setAddress(rs.getString("住所"));
					hotel.setTel(rs.getString("電話番号"));
					hotel.setPostNum(rs.getString("郵便番号"));
					hotel.setMail(rs.getString("メールアドレス"));
					hotel.setKankochiId(rs.getString("観光地ID"));
					hotel.setKeyword(rs.getString("キーワード"));
					hotel.setPrice(rs.getString("料金"));
					hotel.setComment(rs.getString("コメント"));
					hotel.setImage(rs.getString("イメージ画像URL"));
					hotel.setCheckinStart(rs.getString("チェックイン時間"));
					hotel.setCheckinRemit(rs.getString("チェックイン終了時間"));

					list.add(hotel);
				}

			} catch (SQLException e) {
				e.printStackTrace();
			} finally {
				// データベースのクロース
				dm.closeDB();
			}

					return list;
		}

}
