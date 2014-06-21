package jp.ac.fjb.sotuken.model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import jp.ac.fjb.sotuken.bean.HotelBean;
import jp.ac.fjb.sotuken.bean.HotelChangeBean;
import jp.ac.fjb.sotuken.bean.PlanDetailBean;
import jp.ac.fjb.sotuken.util.DBManager;

public class HotelChangeModel {

	// ***************************************** //
	//  プランキーワードからプラン情報を取得する
	// ***************************************** //



		public ArrayList<HotelBean> getPlan(String planName) {

			// プラン情報格納用
			ArrayList<HotelBean> list = new ArrayList<HotelBean>();

			// SQL文を組み立てる
			String sql="SELECT プラン.プラン名,宿泊先.イメージ画像URL,宿泊先.コメント,宿泊先.宿泊先名,宿泊先.チェックイン時間,宿泊先.チェックイン終了時間,プラン.宿泊日数,宿泊先.料金,プラン.デフォルト料金"
					  +" FROM プラン,宿泊先"+
					  " WHERE プラン.デフォルト宿泊先ID=宿泊先.宿泊先ID and プラン名 like '%" + planName + "%'";
			System.out.print(sql);


			// DBアクセス部品の生成
			DBManager dm = new DBManager();


			// ユーザ一覧データを格納するリスト

			try {

				// DBのオープン
				dm.openDB();

				// SELECT文の実行
				ResultSet rs = dm.selectSQL(sql);

				while(rs.next()){
					HotelBean hotel = new HotelBean();
					hotel.setImage(rs.getString("イメージ画像URL"));
					hotel.setComment(rs.getString("コメント"));
					hotel.setHotelName(rs.getString("宿泊先名"));
					hotel.setCheckinStart(rs.getString("チェックイン時間"));
					hotel.setCheckinRemit(rs.getString("チェックイン終了時間"));
					hotel.setStayDate(rs.getString("宿泊日数"));
					hotel.setPrice(rs.getString("料金"));
					hotel.setDefaultPrice(rs.getString("デフォルト料金"));

					list.add(hotel);

				}

			} catch (SQLException e) {
				e.printStackTrace();
			} finally {
				// データベースのクロース
				dm.closeDB();
			}
			System.out.println(list);
				return list;
		}

		public HotelBean getDefaultPlan(String planId) {

			// プラン情報格納用
//			ArrayList<HotelBean> list = new ArrayList<HotelBean>();
			HotelBean hotel = new HotelBean();

			// SQL文を組み立てる
			String sql="SELECT プラン.プラン名,宿泊先.イメージ画像URL,宿泊先.コメント,宿泊先.宿泊先名,宿泊先.チェックイン時間,宿泊先.チェックイン終了時間,プラン.宿泊日数,宿泊先.料金,プラン.デフォルト料金"
					  +" FROM プラン,宿泊先"+
					  " WHERE プラン.デフォルト宿泊先ID=宿泊先.宿泊先ID and プラン.プランID='" + planId +"'";
			System.out.print(sql);


			// DBアクセス部品の生成
			DBManager dm = new DBManager();


			// ユーザ一覧データを格納するリスト

			try {

				// DBのオープン
				dm.openDB();

				// SELECT文の実行
				ResultSet rs = dm.selectSQL(sql);

				// データが取得できなかったらnullを返す
				if ( !rs.next() ) {
					return null;
				}


				hotel.setImage(rs.getString("イメージ画像URL"));
				hotel.setComment(rs.getString("コメント"));
				hotel.setHotelName(rs.getString("宿泊先名"));
				hotel.setCheckinStart(rs.getString("チェックイン時間"));
				hotel.setCheckinRemit(rs.getString("チェックイン終了時間"));
				hotel.setStayDate(rs.getString("宿泊日数"));
				hotel.setPrice(rs.getString("料金"));
				hotel.setDefaultPrice(rs.getString("デフォルト料金"));

//				list.add(hotel);

			} catch (SQLException e) {
				e.printStackTrace();
			} finally {
				// データベースのクロース
				dm.closeDB();
			}
				return hotel;
		}


		public ArrayList<HotelBean> getHotelList(){

			// 掲示板一覧データを格納するリスト
			ArrayList<HotelBean> list = new ArrayList<HotelBean>();
			//宿泊先格納用Bean
			HotelBean hotel;

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


		public ArrayList<HotelChangeBean> getKen(String kenName ){


			// 掲示板一覧データを格納するリスト
			ArrayList<HotelChangeBean> list = new ArrayList<HotelChangeBean>();

			//SQL文の作成
			String sql ="SELECT 宿泊先.宿泊先名,宿泊先.イメージ画像URL,宿泊先.コメント,宿泊先.料金,宿泊先.チェックイン時間,宿泊先.チェックイン終了時間 " +
					    "FROM 宿泊先 " +
					    "WHERE 住所 Like '%"+kenName+"%'";

			// DBアクセス部品の生成
			DBManager dm = new DBManager();

			try {
				// DBのオープン
				dm.openDB();

				// SELECT文の実行
				ResultSet rs = dm.selectSQL(sql);

				while (rs.next()) {
					HotelChangeBean hotelC = new HotelChangeBean();
					hotelC.setHotelImgUrl(rs.getString("イメージ画像URL"));
					hotelC.setHotelComment(rs.getString("コメント"));
					hotelC.setHotelName(rs.getString("宿泊先名"));
					hotelC.setCheckinStart(rs.getString("チェックイン時間"));
					hotelC.setCheckinEnd(rs.getString("チェックイン終了時間"));
//					hotelC.setStayDate(rs.getString("宿泊日数"));
					hotelC.setStayFee(rs.getString("料金"));


					list.add(hotelC);
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
