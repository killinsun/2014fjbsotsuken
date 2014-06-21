package jp.ac.fjb.sns.model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import jp.ac.fjb.sns.bean.PostBean;
import jp.ac.fjb.sns.util.DBManager;

public class AdviceModel {

	public ArrayList<PostBean> getPost() {

		// SQL文を組み立てる
		String sql = "SELECT 投稿表.投稿NoID,項目,投稿内容, COUNT(返答表.返答NoID) 返答数 FROM 投稿表,投稿属性表, 返答表 WHERE 投稿表.項目ID=投稿属性表.項目ID AND 投稿表.投稿NoID = 返答表.投稿NoID(+) GROUP BY 投稿表.投稿NoID,項目,投稿内容 ORDER BY 投稿NoID DESC";

		System.out.println(sql);

		// DBアクセス部品の生成
		DBManager dm = new DBManager();

		ArrayList<PostBean> list = new ArrayList<PostBean>();

		try {
			// DBのオープン
			dm.openDB();

			// SELECT文の実行
			ResultSet rs = dm.selectSQL(sql);

			while (rs.next()) {
				PostBean post = new PostBean();

				post.setPostId(rs.getString("投稿NoID"));
				post.setItem(rs.getString("項目"));
				post.setContent(rs.getString("投稿内容"));
				post.setItemId(rs.getString("項目"));
				post.setCountRes(rs.getString("返答数"));
				list.add(post);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			// データベースのクローズ
			dm.closeDB();
		}

		return list;

	}


	public int insertContent(String itemId, String content) {
		int count = 0;

		// SQL文を組み立てる
		String sql = "INSERT INTO 投稿表 " +
				"VALUES('Q' || lpad( 投稿NoIDシーケンス.nextval, 3, '0' ), '"+ itemId + "', '" +
				"" + content + "', '0')";

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

	public ArrayList<PostBean> getRes(String contentId){

		// SQL文を組み立てる
		String sql = "SELECT 返答NoID,項目,返答内容 FROM 返答表,投稿属性表 WHERE 返答表.項目ID=投稿属性表.項目ID and 投稿NoID='" + contentId + "' ORDER BY 返答NoID ASC";

		System.out.println(sql);

		// DBアクセス部品の生成
		DBManager dm = new DBManager();

		ArrayList<PostBean> list = new ArrayList<PostBean>();

		try {
			// DBのオープン
			dm.openDB();

			// SELECT文の実行
			ResultSet rs = dm.selectSQL(sql);

			while (rs.next()) {
				PostBean post = new PostBean();

				post.setPostId(rs.getString("返答NoID"));
				post.setItem(rs.getString("項目"));
				post.setContent(rs.getString("返答内容"));
				list.add(post);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			// データベースのクローズ
			dm.closeDB();
		}

		return list;

	}



	public int insertRes(String itemId, String item, String content) {
		int count = 0;

		// SQL文を組み立てる
		String sql = "INSERT INTO 返答表 " +
				"VALUES('Q' || lpad( 投稿NoIDシーケンス.nextval, 3, '0' ), '"+ itemId + "', '" +
				"" + item + "', '" + content + "')";

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

}
