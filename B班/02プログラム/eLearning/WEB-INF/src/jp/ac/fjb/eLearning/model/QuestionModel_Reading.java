package jp.ac.fjb.eLearning.model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import jp.ac.fjb.eLearning.bean.QuestionInputBean;
import jp.ac.fjb.eLearning.util.DBManager;


public class QuestionModel_Reading {

	public ArrayList<QuestionInputBean> getKaitouList(String kyoukaId,String kamokuId,String bunyaId){

		//SQL文の組み立て
//		String sql = "SELECT 教科ID,科目ID,分野ID,問題文, 解答, 解説文 FROM 練習問題管理表" +
//				     " WHERE 教科ID = 'KYK0000003' AND " +
//				     	   " 科目ID = 'KMK0000003' AND" +
//				     	   " 分野ID = 'B000001' ORDER BY 教科ID,科目ID,分野ID,問題ID";

		//セッションから抜き取る方法
		String sql = "SELECT 教科ID,科目ID,分野ID,問題文, 解答, 解説文 FROM 練習問題管理表" +
			     " WHERE 教科ID = '" + kyoukaId  + "' AND " +
			     	   " 科目ID = '" + kamokuId  + "' AND" +
			     	   " 分野ID = '" + bunyaId  + "' ORDER BY 教科ID,科目ID,分野ID,問題ID";

		//DBアクセス部品の生成
		DBManager dm = new DBManager();

		//問題を格納するリスト
		ArrayList<QuestionInputBean> list = new ArrayList<QuestionInputBean>();

		try{
			//DBのオープン
			dm.openDB();

			//SELECT文の実行
			ResultSet rs = dm.selectSQL(sql);

			while (rs.next()) {
				QuestionInputBean ques = new QuestionInputBean();
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

	private void setKaitou() {
		// TODO 自動生成されたメソッド・スタブ

	}

}
