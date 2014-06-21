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
import jp.ac.fjb.onsen.model.SSearchModel;

import sun.rmi.server.Dispatcher;

public class OSearchServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// TODO 自動生成されたメソッド・スタブ
		//文字コードの設定
		req.setCharacterEncoding("UTF-8");
        //セッションの取得
		HttpSession s = req.getSession();

		//入力パラメーターの取得
			String OnsenKey = req.getParameter("searchKey");
			System.out.println("検索キーワード:"+ OnsenKey);
			String values[] = null;
			values = req.getParameterValues("area");
			String min = req.getParameter("min");
			String max = req.getParameter("max");
			String stay = req.getParameter("stay");
			String day = req.getParameter("day");

			//モデル呼び出し
			OSearchModel search = new OSearchModel();
			ArrayList<OnsenBean> Oslist = search.getOnsen(OnsenKey,values,min,max,stay,day);

			if(Oslist == null){

				//該当温泉無しメッセージをセット
				s.setAttribute("NONE_ONSEN", "温泉が見つかりませんでした");

				//情報を出力
				System.out.println("温泉が見つかりませんでした");

			} else {

				//該当温泉無しメッセージを初期化
				s.setAttribute("NONE_ONSEN", "");

				//温泉情報をセッションにセット
				s.setAttribute("ONSEN", Oslist);

			}


		//画面遷移
		RequestDispatcher dispatcher = req.getRequestDispatcher("onsenKensaku.jsp");



		//フォワードの実行
		dispatcher.forward(req, resp);
	}
}