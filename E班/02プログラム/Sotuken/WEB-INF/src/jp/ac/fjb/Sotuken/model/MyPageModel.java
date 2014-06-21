package jp.ac.fjb.Sotuken.model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import jp.ac.fjb.Sotuken.bean.MyPageFormBean;
import jp.ac.fjb.Sotuken.util.DBManager;

public class MyPageModel {

	public ArrayList<MyPageFormBean> getTweetList(){



		//SQL文を組み立てる
		String sql = "SELECT つぶやき.つぶやきID,ユーザ.ユーザID,ユーザ.名前,ユーザ.ユーザアイコン,つぶやき.つぶやき,ユーザ.部署ID,部署.部署名,TO_CHAR(つぶやき.つぶやき日時,'YYYY-MM-DD HH24:MI:SS') AS 送信時間,つぶやき.つぶやき画像 FROM つぶやき,ユーザ,部署 WHERE つぶやき.つぶやきユーザID = ユーザ.ユーザID AND ユーザ.部署ID = 部署.部署ID ORDER BY つぶやき.つぶやき日時 DESC";


		//System.out.println(sql);

		//DBアクセス部品の生成
		DBManager dm = new DBManager();

		//ArrayList
		ArrayList<MyPageFormBean> mpfb = new ArrayList<MyPageFormBean>();

		try{
			//DBのオープン
			dm.openDB();

			//SELECT文の実行
			ResultSet rs = dm.selectSQL(sql);

			//取得したつぶやきの情報をBeanに詰めてセッションに格納

			int count = 0;
			while(rs.next()){
				//つぶやき情報格納用 Bean
				MyPageFormBean myPage = new MyPageFormBean();

				myPage.setTweetId(rs.getString("つぶやきID"));
				myPage.setUserId(rs.getString("ユーザID"));
				myPage.setUserName(rs.getString("名前"));
				myPage.setUserIco(rs.getString("ユーザアイコン"));
				myPage.setTweet(rs.getString("つぶやき"));
				myPage.setSendTime(rs.getString("送信時間"));
				myPage.setTweetImg(rs.getString("つぶやき画像"));
				myPage.setPostId(rs.getString("部署ID"));		//追加項目
				myPage.setPostName(rs.getString("部署名"));		//追加項目

				mpfb.add(myPage);
				count++;
			}

			//System.out.println("タイムラインの出力不調" + count);



		}catch(SQLException e){
			e.printStackTrace();
		}finally{
			//DBを閉じる
			dm.closeDB();
		}



		return mpfb;

	}

}
