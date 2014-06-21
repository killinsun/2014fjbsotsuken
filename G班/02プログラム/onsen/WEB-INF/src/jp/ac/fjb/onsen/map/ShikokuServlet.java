package jp.ac.fjb.onsen.map;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import jp.ac.fjb.onsen.bean.OnsenBean;
import jp.ac.fjb.onsen.bean.UserBean;
import jp.ac.fjb.onsen.model.LoginModel;
import jp.ac.fjb.onsen.model.OSearchModel;



public class ShikokuServlet extends HttpServlet {

	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		//文字コードの設定
		req.setCharacterEncoding("UTF-8");
        //セッションの取得
		HttpSession s = req.getSession();
		//モデル呼び出し
		OSearchModel search = new OSearchModel();
		ArrayList<OnsenBean> Oslist = search.getOnsenmap("四国");

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
