package jp.ac.fjb.Sotuken.model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import jp.ac.fjb.Sotuken.bean.TweetPostBean;
import jp.ac.fjb.Sotuken.util.DBManager;

public class TweetPostModel {

//	public ArrayList<TweetPostBean> getTweetPost(String tweetContent, String tweetImg ){
	public TweetPostBean getTweetPost(String tweetContent, String tweetImg ,String userId){

		//DBアクセス部品の生成
		DBManager dm = new DBManager();

		ArrayList<TweetPostBean> tpb = new ArrayList<TweetPostBean>();





		try {

			//DBのオープン
			dm.openDB();

			String tweetID = "SELECT MAX(つぶやきID) AS つぶやきID FROM つぶやき WHERE つぶやきユーザID = '"+ userId +"'";

			ResultSet twid = dm.selectSQL(tweetID);


			//変数宣言
			int tmp ,count = 0;
			String tweetIdShow,tweetIdChar,maxTweetId = null;

			//countで中にデータがあるのか判定
			while(twid.next()){

				//つぶやきIDを格納
				maxTweetId = twid.getString("つぶやきID");
				//インクリメント
				count++;
			}

			System.out.println("なかみは" + maxTweetId);
			System.out.println("count"+ count);


			if(maxTweetId == null){
				//tweetIDの中にデータがない場合はtweetIdShowにT0000001を代入
				tweetIdShow = "T0000001";

			}else{

				String tweetIdNumber[] = maxTweetId.split("T",0);
				String xx = tweetIdNumber[1];
				tmp = Integer.parseInt(xx);
				tweetIdChar = Integer.toString(tmp + 1);
				//変数stringCountにつぶやきIDのTを除いた最大桁数からtmpの文字列の長さを減算
				count = 7 - tweetIdChar.length();


				//stringCountをzeroCounterに代入し、zeroCounterが0になるまでループ
				for(int zeroCounter = count; zeroCounter > 0; zeroCounter--){
					tweetIdChar = "0"+ tweetIdChar;
				}


				//最後にTを先頭に付ける
				tweetIdShow = "T"+ tweetIdChar;

			}
			System.out.println("つぶやきID:"+ tweetIdShow);


			String tweetImgName = null;
			String tweetContentShow = tweetContent;

			if(tweetImg != null || tweetImg != ""){
				System.out.println("突破1");
				if(tweetContentShow == null || tweetContentShow == ""){
					tweetContentShow = "　";
				}else{

					tweetImgName = "img/tweetImg/" + tweetIdShow + tweetImg;
				}
			}




			//INSERT文をshowTweetに格納する
			String showTweet = "INSERT INTO つぶやき VALUES ('"+ tweetIdShow +"' ,'"+ userId +"','" + tweetContentShow + "',SYSDATE,'"+ tweetImgName +"')";




			//INSERT文の実行
			dm.insertSQL(showTweet);


			//INSERT文を実行後にSELECT文を実行する
			//String selectSql = "SELECT つぶやき.つぶやきID,ユーザ.ユーザID,ユーザ.名前,ユーザ.ユーザアイコン,つぶやき.つぶやき,TO_CHAR(つぶやき.つぶやき日時,'YYYY-MM-DD HH24:MI:SS') AS 送信時間,つぶやき.つぶやき画像 FROM つぶやき,ユーザ WHERE つぶやき.つぶやきユーザID = ユーザ.ユーザID ORDER BY つぶやき.つぶやき日時 DESC";

			//ResultSet slcSql = dm.selectSQL(selectSql);


		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			//DBを閉じる
			dm.closeDB();
		}





		return null;


	}


}
