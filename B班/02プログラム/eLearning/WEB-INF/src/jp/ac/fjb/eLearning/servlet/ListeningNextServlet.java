package jp.ac.fjb.eLearning.servlet;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import jp.ac.fjb.eLearning.bean.listeningFormBean;
import jp.ac.fjb.eLearning.model.listeningModel;

public class ListeningNextServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// TODO 自動生成されたメソッド・スタブ
		//super.doGet(req, resp);
		HttpSession s = req.getSession();	// セッション

		String bunyaID = req.getParameter("bunyaId");

		s.setAttribute("BUNYA_ID", bunyaID);



		listeningModel model = new listeningModel();
		ArrayList<listeningFormBean> listening = model.getlistening();



		//if ( listening == null ) {
			 //ユーザを取得出来なかった場合、エラーメッセージをセット
			//s.setAttribute("ERROR_LOGIN", "失敗");

			 //ログイン画面に戻す
			//jspName = "Listening.jsp";

		//} else {
			// ユーザを取得できた場合、ユーザ情報をセッションにセット
			s.setAttribute("listening", listening);



		//}


		// 【ビューの呼び出し】
		RequestDispatcher dp = req.getRequestDispatcher("Listening_Lesson1.jsp");
		dp.forward(req, resp);
	}


	}
