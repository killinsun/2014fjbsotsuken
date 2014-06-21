package jp.ac.fjb.sotuken.model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import jp.ac.fjb.sotuken.bean.BbsBean;
import jp.ac.fjb.sotuken.util.DBManager;

public class BbsModel {

	// ********************** //
	//  掲示板情報を取得する  //
	// ********************** //
	public ArrayList<BbsBean> getBbsList(){

		//掲示板格納用Bean
		BbsBean bbs;
		// 掲示板一覧データを格納するリスト
		ArrayList<BbsBean> list = new ArrayList<BbsBean>();

		//SQL文の作成
		String sql = "SELECT 県.県名,プラン.プランID,プラン.プラン名,掲示板.掲示板投稿ナンバー,掲示板.投稿者名,掲示板.投稿日時,掲示板.投稿者コメント,プラン.デフォルト宿泊先ID,掲示板.イメージ画像URL FROM 県,プラン,掲示板,観光地,宿泊先 WHERE プラン.プランID=掲示板.プランID AND プラン.観光地ID=観光地.観光地ID AND 観光地.県ID=県.県ID AND 宿泊先.宿泊先ID=プラン.デフォルト宿泊先ID ORDER BY 掲示板投稿ナンバー DESC";

		// DBアクセス部品の生成
		DBManager dm = new DBManager();

		try {
			// DBのオープン
			dm.openDB();

			// SELECT文の実行
			ResultSet rs = dm.selectSQL(sql);

			while (rs.next()) {
				bbs = new BbsBean();
				bbs.setBbsNo(rs.getString("掲示板投稿ナンバー"));
				bbs.setPressUserName(rs.getString("投稿者名"));
				bbs.setPlanPressSt(rs.getString("投稿者コメント"));
				bbs.setPressTime(rs.getString("投稿日時"));
				bbs.setKenName(rs.getString("県名"));
				bbs.setPlanName(rs.getString("プラン名"));
				bbs.setPlanId(rs.getString("プランID"));
				bbs.setHotel("デフォルト宿泊先ID");
				bbs.setBbsImage(rs.getString("イメージ画像URL"));

				list.add(bbs);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			// データベースのクロース
			dm.closeDB();
		}

				return list;
	}


	// ************************** //
	//  旅行プランを新規投稿する  //
	// ************************** //
	public void insertNewPlan(BbsBean newPlan, String loginId) {

		String selectSql = "SELECT planId.nextval AS NE FROM Dual";


		// DBアクセス部品の生成
		DBManager dm = new DBManager();
		String planId = "";

		try {
			// DBのオープン
			dm.openDB();

			ResultSet rs = dm.selectSQL(selectSql);
			rs.next();
			planId = rs.getString("NE");
			System.out.println("〓" + planId);

			// SQL文を組み立てる①(プラン表を登録)
			String sql = "INSERT INTO プラン(プランID, プラン名, 観光地ID, デフォルト宿泊先ID, デフォルト出発駅ID, 到着駅ID, 宿泊日数, デフォルト料金, イメージ画像URL, キーワード, コメント, 予約開始, 最大人数, 予約終了) VALUES("
					+ "'p' || lpad(" + planId + ", 4,'0'),"
					+ "'" + newPlan.getPlanName() +  "', "
					+ "'" + newPlan.getKankochi() +  "', "
					+ "'" + newPlan.getHotel() +  "', "
					+ "'" + newPlan.getGo() + "', "
					+ "'" + newPlan.getArrive() + "', "
					+ newPlan.getSyukuhakuDay() +  ", "
					+ newPlan.getPrice() +  ", "
					+ "'" + newPlan.getBbsImage() +  "', "
					+ "'" + newPlan.getKeyWord() +  "', "
					+ "'" + newPlan.getPlanPressSt() + "', "
					+ "'" + newPlan.getDateStart() + "',"
					+ "" + newPlan.getPeople() + ", "
					+ "'" + newPlan.getDateRemit()
					+  "')";
			System.out.println("INSERT文：" + sql);

			// SQL文を組み立てる①(掲示板表を登録)
			String sql2 = "INSERT INTO 掲示板(掲示板投稿ナンバー, プランID, ユーザID, 投稿者名, 投稿者コメント, 投稿日時, イメージ画像URL) VALUES("
					+ "'b' || lpad(bbsId.nextval, 6,'0'),"
					+ "'p' || lpad(" + planId + ", 4,'0'),"
					+ "'" + loginId +  "', "
					+ "'" + newPlan.getPressUserName() +  "', "
					+ "'" + newPlan.getPlanPressSt() +  "', "
					+ "default" + ", "
					+ "'" + newPlan.getBbsImage()
					+ "')";
			System.out.println("INSERT文：" + sql2);

			// INSERT文の実行
			dm.insertSQL(sql);
			dm.insertSQL(sql2);

		} catch (SQLException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}finally {
			// データベースのクロース
			dm.closeDB();
		}
	}

	// ***************************** //
	//  地域別掲示板情報を取得する   //
	// ***************************** //
	public ArrayList<BbsBean> getChiikiList(String chiiki){
		//掲示板格納用Bean
				BbsBean chiikibbs;
				// 掲示板一覧データを格納するリスト
				ArrayList<BbsBean> chiikiList = new ArrayList<BbsBean>();

				//SQL文の作成
				String sql = "SELECT 県.県名,プラン.プランID,プラン.プラン名,掲示板.掲示板投稿ナンバー,掲示板.投稿者名,掲示板.投稿日時,掲示板.投稿者コメント,掲示板.イメージ画像URL FROM 県,プラン,掲示板,観光地,地域 WHERE プラン.プランID=掲示板.プランID AND プラン.観光地ID=観光地.観光地ID AND 観光地.県ID=県.県ID AND 地域.地域ID=県.地域ID AND 地域.地域名='" + chiiki + "' ORDER BY 掲示板投稿ナンバー DESC";

				// DBアクセス部品の生成
				DBManager dm = new DBManager();

				try {
					// DBのオープン
					dm.openDB();

					// SELECT文の実行
					ResultSet rs = dm.selectSQL(sql);

					while (rs.next()) {
						chiikibbs = new BbsBean();
						chiikibbs.setBbsNo(rs.getString("掲示板投稿ナンバー"));
						chiikibbs.setPressUserName(rs.getString("投稿者名"));
						chiikibbs.setPlanPressSt(rs.getString("投稿者コメント"));
						chiikibbs.setPressTime(rs.getString("投稿日時"));
						chiikibbs.setKenName(rs.getString("県名"));
						chiikibbs.setPlanName(rs.getString("プラン名"));
						chiikibbs.setPlanId(rs.getString("プランID"));
						chiikibbs.setBbsImage(rs.getString("イメージ画像URL"));

						chiikiList.add(chiikibbs);
					}

				} catch (SQLException e) {
					e.printStackTrace();
				} finally {
					// データベースのクロース
					dm.closeDB();
				}

						return chiikiList;
	}

}
