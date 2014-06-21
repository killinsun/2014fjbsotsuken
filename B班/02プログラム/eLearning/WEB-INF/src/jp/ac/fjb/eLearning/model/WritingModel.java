package jp.ac.fjb.eLearning.model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import jp.ac.fjb.eLearning.bean.WritingInputBean;
import jp.ac.fjb.eLearning.util.DBManager;


public class WritingModel {

	public ArrayList<WritingInputBean> getKaitouList(){

		//SQL文の組み立て
		String sql = "SELECT 問題文, 解答, 解説文 FROM 練習問題管理表";

		//DBアクセス部品の生成
		DBManager dm = new DBManager();

		//問題を格納するリスト
		ArrayList<WritingInputBean> list = new ArrayList<WritingInputBean>();

		try{
			//DBのオープン
			dm.openDB();

			//SELECT文の実行
			ResultSet rs = dm.selectSQL(sql);

			while (rs.next()) {
				WritingInputBean ques = new WritingInputBean();
	            ques.setMondai(rs.getString("問題文"));
	            ques.setKaitou(rs.getString("解答"));
	            ques.setKaisetsu(rs.getString("解説文"));

	            list.add(ques);
			}


		}catch (SQLException e) {
			e.printStackTrace();
		}finally{
			//データベースを閉じる
			dm.closeDB();
		}
		return list;

	}

}
