package jp.ac.fjb.Sotuken.servlet;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import jp.ac.fjb.Sotuken.bean.LoginBean;
import jp.ac.fjb.Sotuken.bean.MyPageFormBean;
import jp.ac.fjb.Sotuken.bean.TweetPostBean;
import jp.ac.fjb.Sotuken.bean.UserMailBean;
import jp.ac.fjb.Sotuken.model.MyPageModel;
import jp.ac.fjb.Sotuken.model.TweetPostModel;
import jp.ac.fjb.Sotuken.model.UserMailModel;


public class MyPageServlet extends HttpServlet{

	@Override

	public void doGet(HttpServletRequest reqp, HttpServletResponse respp) throws ServletException ,IOException {
		this.doPost(reqp, respp);

	};

	@Override
	public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException ,IOException {
		resp.setContentType("text/html; charset=UTF-8");
		req.setCharacterEncoding("UTF-8");


		HttpSession s = req.getSession();	//セッション

		String jspName = "";



		////////////////////////////////////////////////////////////////////////////
		//画面の入力値を取得

		String tweetContent   = req.getParameter("tweetContent");		//つぶやき
		String tweetImg		  = req.getParameter("tweetImg");					//つぶやき画像
		String userId 		  = ((LoginBean)s.getAttribute("LOGIN_USER")).getUserId();	//ユーザIDを取得
		////////////////////////////////////////////////////////////////////////////
		System.out.println("つぶやき内容:" + tweetContent);
		System.out.println("画像:" + tweetImg);
		System.out.println("ユーザID:" + userId);


		if(tweetContent != null || tweetImg != null){

			if(tweetContent != "" || tweetImg != ""){

//				////////////////////////////////////////////////////////////
//				String path = getServletContext().getRealPath("img/myPageImg");
//
//				DiskFileItemFactory factory = new DiskFileItemFactory();
//				ServletFileUpload upload = new ServletFileUpload(factory);
//
//				factory.setSizeThreshold(1024);
//				upload.setSizeMax(-1);
//				upload.setHeaderEncoding("UTF-8");
//
//				//アップロードされたファイル情報をFileItemオブジェクトとして取得
//				try {
//
//
//					//(4)ファイルデータ(FileItemオブジェクト)を取得し、
//					//   Listオブジェクトとして返す
//					List list = upload.parseRequest(req);
//
//					//(5)ファイルデータ(FileItemオブジェクト)を順に処理
//					Iterator iterator = list.iterator();
//					//現在時刻のミリ秒を取得
//					long now = System.currentTimeMillis();
//
//					while(iterator.hasNext()){
//						FileItem fItem = (FileItem)iterator.next();
//
//				        //(6)ファイルデータの場合、if内を実行
//				        if(!(fItem.isFormField())){
//				        	//(7)ファイルデータのファイル名(PATH名含む)を取得
//				        	String fileName = fItem.getName();
//				        	if((fileName != null) && (!fileName.equals(""))){
//				        		//(8)PATH名を除くファイル名のみを取得
//				        		fileName=(new File(fileName)).getName();
//				        		//(9)ファイルデータを指定されたファイルに書き出し
//				        		System.out.println("これがパス:" + path);
//				        		//後ほど、0000004のところは書き換える。
//				        		fItem.write(new File(path + "/"+ now +"0000004" + fileName));
//				        	}
//				        }
//					}
//
//				} catch (FileUploadException e) {
//						e.printStackTrace();
//				} catch (Exception e) {
//						e.printStackTrace();
//				}
//
//				////////////////////////////////////////////////////////////



				////////////////////////////////////////////////////////////////////////////
				TweetPostModel twPost = new TweetPostModel();
				//ArrayList<TweetPostBean> tpm = twPost.getTweetPost(tweetContent, tweetImg);
				TweetPostBean tpm = twPost.getTweetPost(tweetContent, tweetImg, userId);
				////////////////////////////////////////////////////////////////////////////

				s.setAttribute("POST_TWEET", tpm);


			}




		}else{

		}

		jspName = "004myPage.jsp";

		//SELECT文の実行(投稿後画面に再び一覧表示)
		MyPageModel model = new MyPageModel();
		ArrayList<MyPageFormBean> mpfb = model.getTweetList();

		s.setAttribute("TWEET_LIST", mpfb);

		//画面遷移
		RequestDispatcher dp = req.getRequestDispatcher(jspName);
		dp.forward(req, resp);
	}

}
