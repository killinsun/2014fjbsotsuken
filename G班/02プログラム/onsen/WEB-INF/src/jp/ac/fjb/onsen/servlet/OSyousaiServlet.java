package jp.ac.fjb.onsen.servlet;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import jp.ac.fjb.onsen.bean.OnsenBean;
import jp.ac.fjb.onsen.model.OSearchModel;
import jp.ac.fjb.onsen.model.OSyousaiModel;
import jp.ac.fjb.onsen.model.SSearchModel;

import sun.rmi.server.Dispatcher;

public class OSyousaiServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// TODO 自動生成されたメソッド・スタブ
		//文字コードの設定
		req.setCharacterEncoding("UTF-8");
        //セッションの取得
		HttpSession s = req.getSession();

		//入力パラメーターの取得
		String NoID = req.getParameter("OnsenID");

			//モデル呼び出し
			OSyousaiModel syousai = new OSyousaiModel();
			OnsenBean bean = syousai.getOnsen(NoID);

			s.setAttribute("ONSEN", bean);


		//画面遷移
		RequestDispatcher dispatcher = req.getRequestDispatcher("onsenSyousai.jsp");



		//フォワードの実行
		dispatcher.forward(req, resp);
	}
}