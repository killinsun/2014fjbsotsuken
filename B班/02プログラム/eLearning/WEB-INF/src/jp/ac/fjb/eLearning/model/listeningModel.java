package jp.ac.fjb.eLearning.model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import jp.ac.fjb.eLearning.bean.listeningFormBean;
import jp.ac.fjb.eLearning.util.DBManager;

public class listeningModel {

	public ArrayList<listeningFormBean> getlistening() {

		DBManager dm = new DBManager();

		String sql = "SELECT 練習問題管理表.解答,分野表.分野名,練習問題管理表.問題ID,練習問題管理表.教科ID,練習問題管理表.科目ID,練習問題管理表.分野ID,練習問題管理表.問題文,練習問題管理表.解説文,音声表.音声名 FROM 練習問題管理表,音声表,分野表 WHERE 練習問題管理表.分野ID=音声表.分野ID AND 練習問題管理表.教科ID=音声表.教科ID AND 練習問題管理表.科目ID=音声表.科目ID AND 練習問題管理表.問題ID=音声表.問題ID AND 分野表.科目ID = 練習問題管理表.科目ID AND 分野表.分野ID = 練習問題管理表.分野ID";
//		String sql2 = "SELECT 音声名 FROM 音声表 WHERE 教科ID='KYK0000003'";

		listeningFormBean l;

		System.out.print(sql);
//		System.out.print(sql2);

		ArrayList<listeningFormBean> list = new ArrayList<listeningFormBean>();

		try {

			dm.openDB();

			ResultSet rs = dm.selectSQL(sql);
//			ResultSet rs2 = dm.selectSQL(sql2);

			while (rs.next()) {
				l = new listeningFormBean();

				l.setTitle(rs.getString("分野名"));
				//l.setMondaiID(rs.getString("問題ID"));
				//l.setKyoukaID(rs.getString("教科ID"));
				//l.setKamokuID(rs.getString("科目ID"));
				l.setBunyaID(rs.getString("分野ID"));
				l.setQuestionText(rs.getString("問題文"));
				l.setAnswer(rs.getString("解答"));
				l.setAnswerText(rs.getString("解説文"));
				l.setMusicName(rs.getString("音声名"));

				list.add(l);

			}

//			while (rs2.next()) {
//
//				l.setMusicName(rs2.getString("音声名"));
//
//				list.add(l);
//
//			}

		} catch (SQLException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		} finally {
			dm.closeDB();
		}

		return list;

	}

}
