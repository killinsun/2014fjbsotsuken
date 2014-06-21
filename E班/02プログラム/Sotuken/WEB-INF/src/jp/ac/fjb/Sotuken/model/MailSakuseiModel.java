package jp.ac.fjb.Sotuken.model;

import java.sql.ResultSet;
import java.sql.SQLException;

import jp.ac.fjb.Sotuken.bean.MailSakuseiBean;
import jp.ac.fjb.Sotuken.bean.UserMailBean;
import jp.ac.fjb.Sotuken.util.DBManager;

public class MailSakuseiModel{

	public void insertMail(String SendAddress,String SubjectLine,String maillLine, String userId, String mt) {

		// DBアクセス部品の生成
		DBManager su = new DBManager();

		try{
			// DBのオープン
			su.openDB();

			//SELECT文
			String sql1 = "SELECT MAX(メールID) AS メールID FROM メール";
			String mtbox = "MT0";
			String mtbox2 = "MT1";


			//SELECT実行
			ResultSet rs1 = su.selectSQL(sql1);
			//System.out.println("SELECT文：" + rs1);

			//変数宣言
			int count = 0;
			int count2 = 0;

			int stringCount;
			int stringCount2;
			String mailmaxID, mailmaxID2, tmp ,tmp2, mailcharID = null;

			//mailIDの中に格納されている列数をカウントする
			while(rs1.next()){
				//メールIDを格納
				mailcharID = rs1.getString("メールID");
				count ++;
			}

			if(mailcharID == null){
				//メールIDの中にデータがない場合はmailmaxIDにM000001を代入
				mailmaxID = "M000001";
				mailmaxID2 = "M000001";


			}else{

				String mailNumber[] = mailcharID.split("M",0);
				String xx = mailNumber[1];
				count = Integer.parseInt(xx);
				tmp = Integer.toString(count + 1);
				tmp2 = Integer.toString(count + 2);
				//変数stringCountにメールIDのMを除いた最大桁数からtmpの文字列の長さを減算
				stringCount = 6 - tmp.length();
				stringCount2 = 6 - tmp2.length();


				//stringCountをzeroCounterに代入し、zeroCounterが0になるまでループ
				for(int zeroCounter = stringCount; zeroCounter > 0; zeroCounter--){
					tmp = "0"+ tmp;
				}
				for(int zeroCounter2 = stringCount2; zeroCounter2 > 0; zeroCounter2--){
					tmp2 = "0"+ tmp2;
				}


				//最後にMを先頭に付ける
				mailmaxID = "M"+ tmp;
				mailmaxID2 = "M"+ tmp2;
			}
			System.out.println("メールID:"+ mailmaxID);

			// INSERT文
			String sql2 = "INSERT INTO メール(メールID,ユーザID,送信アドレス,受信アドレス,件名," +
					"本文,添付,送信日時,保存日時,メール種別ID)"
					+ "VALUES ('" + mailmaxID + "','" + userId + "','" + SendAddress + "','" + userId + "'," +
							"'" + SubjectLine + "','" + maillLine + "','',SYSDATE,SYSDATE,'" + mtbox +"')";

			System.out.println("INSERT文：" + sql2);

			String sql3 = "INSERT INTO メール(メールID,ユーザID,送信アドレス,受信アドレス,件名," +
					"本文,添付,送信日時,保存日時,メール種別ID)"
					+ "VALUES ('" + mailmaxID2 + "','" + userId + "','" + SendAddress + "','" + userId + "'," +
							"'" + SubjectLine + "','" + maillLine + "','',SYSDATE,SYSDATE,'" + mtbox2 +"')";

			System.out.println("INSERT文：" + sql3);

			// INSERT文の実行
			count = su.insertSQL(sql2);

			count2 = su.insertSQL(sql3);





		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			// データベースのクロース
			su.closeDB();
		}

	}


}
