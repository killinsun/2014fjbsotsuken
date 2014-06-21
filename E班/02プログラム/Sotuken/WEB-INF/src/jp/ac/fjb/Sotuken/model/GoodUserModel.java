package jp.ac.fjb.Sotuken.model;

import java.sql.ResultSet;
import java.sql.SQLException;

import jp.ac.fjb.Sotuken.bean.TweetPostBean;
import jp.ac.fjb.Sotuken.util.DBManager;

public class GoodUserModel {

	public TweetPostBean getGoodUserId(String tweetId,String userId ,String goodUserId){


		//DBアクセス部品の生成
		DBManager dm = new DBManager();


			TweetPostBean gduid = new TweetPostBean();

			try {


			//DBのオープン
			dm.openDB();

			//INSERT文をshowTweetに格納する
			String goodUser = "INSERT INTO つぶやき VALUES ()";


//			//sql文
//			String goodUser = "SELECT Goodユーザ.つぶやきID,Goodユーザ.つぶやきユーザID,Goodユーザ.GoodユーザID FROM Goodユーザ,つぶやき WHERE Goodユーザ.つぶやきID = つぶやき.つぶやきID AND Goodユーザ.つぶやきユーザID = つぶやき.つぶやきユーザID";

			//SELECT文の実行
			ResultSet guid = dm.selectSQL(goodUser);

			//データが取得できなかったらnull;

				if(!guid.next()){
					return null;
				}


				int count = 0;

//				while(guid.next()){
//					//Goodユーザ情報格納用 Bean
//					MyPageFormBean goodUId = new MyPageFormBean();
//
//					goodUId.setTweetId(guid.getString("つぶやきID"));
//					goodUId.setTweetId(guid.getString("つぶやきユーザID"));
//					goodUId.setTweetId(guid.getString("GoodユーザID"));
//
//					gduid.add(goodUId);
//					count++;
//				}

//				System.out.println("GoodUserModel" + count);







			} catch (SQLException e) {
				// TODO 自動生成された catch ブロック
				e.printStackTrace();
			} finally {
				//DBを閉じる
				dm.closeDB();
			}



		return null;


	}

}
