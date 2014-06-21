package jp.ac.fjb.sotuken.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import jp.ac.fjb.sotuken.bean.CommentBean;
import jp.ac.fjb.sotuken.bean.UserBean;
import jp.ac.fjb.sotuken.model.CommentModel;

public class CommentServlet extends HttpServlet{

	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		cmtServletSet(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		cmtServletSet(req, resp);
	}

	public void cmtServletSet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		HttpSession s = req.getSession();	// セッション
		//セッションからBBSNOを取得
		String bbsNo = (String)s.getAttribute("BBS_NO");


		// 画面の入力値を取得
		req.setCharacterEncoding("UTF-8");
		String comName = req.getParameter("comName");
		String comMessa = req.getParameter("comMessage");
		String sendFlag = req.getParameter("starSend");

		// Beanに入力値を詰める
				CommentBean com = new CommentBean();

		//評価を送信するか判断
		if(sendFlag != null){
			if(sendFlag.equals("send")){
				String comStar = req.getParameter("comStar");
				com.setStar(comStar);
			}
		}
		com.setCommentUserName(comName);
		com.setCommentSt(comMessa);
		com.setCommentBbsNo(bbsNo);

		//データベースに登録するメソッドの呼び出し
		CommentModel cmModel = new CommentModel();

		//ユーザーIDを取得
		UserBean loginUser = (UserBean)s.getAttribute("LOGIN_USER");
		String loginId;

		if(loginUser == null){
			loginId = "u9999999";
		}else{
			loginId = loginUser.getUserId();
		}

			cmModel.insertComment(com, loginId);

		RequestDispatcher dp = req.getRequestDispatcher("/BbsServlet");
		dp.forward(req, resp);
	}

}
