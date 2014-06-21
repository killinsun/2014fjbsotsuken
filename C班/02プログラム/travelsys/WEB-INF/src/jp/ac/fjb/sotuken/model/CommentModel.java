package jp.ac.fjb.sotuken.model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import jp.ac.fjb.sotuken.bean.CommentBean;
import jp.ac.fjb.sotuken.util.DBManager;

public class CommentModel{

	// ************************ //
	//  コメント情報を取得する  //
	// ************************ //
	public ArrayList<CommentBean> getCommentList(){

		////コメント格納用Bean
		CommentBean cmt;
		// 掲示板一覧データを格納するリスト
		ArrayList<CommentBean> comlist = new ArrayList<CommentBean>();

		//SQL文の作成
		String sql = "SELECT コメントナンバー,掲示板投稿ナンバー,コメント投稿者名,評価,投稿日時,コメント FROM コメント ORDER BY コメントナンバー ASC";

		// DBアクセス部品の生成
		DBManager dm = new DBManager();

		try {
			// DBのオープン
			dm.openDB();

			// SELECT文の実行
			ResultSet rs = dm.selectSQL(sql);

			while (rs.next()) {
				cmt = new CommentBean();
				cmt.setCommentBbsNo(rs.getString("掲示板投稿ナンバー"));
				cmt.setCommentNo(rs.getString("コメントナンバー"));
				cmt.setCommentUserName(rs.getString("コメント投稿者名"));
				cmt.setStar(rs.getString("評価"));
				cmt.setCommentTime(rs.getString("投稿日時"));
				cmt.setCommentSt(rs.getString("コメント"));

				comlist.add(cmt);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			// データベースのクロース
			dm.closeDB();
		}

				return comlist;
	}

	// ***************************************** //
	//  ユーザを新規登録する
	// ***************************************** //
	public void insertComment(CommentBean com, String loginId) {
		// SQL文を組み立てる

				String sql = "INSERT INTO コメント(コメントナンバー, 掲示板投稿ナンバー, ユーザID, コメント投稿者名, 評価, コメント, 投稿日時) VALUES("
								+ "'z' || lpad(commentId.nextval, 6,'0'),"
								+ "'" + com.getCommentBbsNo() +  "', "
								+ "'" + loginId +  "', "
								+ "'" + com.getCommentUserName() +  "', "
								+ com.getStar() + ","
								+ "'" + com.getCommentSt() +  "',"
								+ "default"
								+ ")";
				System.out.println("INSERT文：" + sql);

				// DBアクセス部品の生成
				DBManager dm = new DBManager();

				// DBのオープン
				dm.openDB();

				// INSERT文の実行
				dm.insertSQL(sql);

				// データベースのクローズ
				dm.closeDB();
	}
}
