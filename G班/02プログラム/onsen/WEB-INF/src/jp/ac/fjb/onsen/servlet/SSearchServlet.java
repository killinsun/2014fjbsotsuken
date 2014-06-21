package jp.ac.fjb.onsen.servlet;

import java.io.IOException;
import java.util.ArrayList;


import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


import jp.ac.fjb.onsen.model.SSearchModel;


public class SSearchServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		//文字コードの指定
		req.setCharacterEncoding("UTF-8");

		HttpSession s = req.getSession();	//セッション


		//入力パラメーターの取得
		String searchKey = (String)req.getParameter("searchKey");
		String values[] = null;
		values = (String[])req.getParameterValues("area");
		String min = (String)req.getParameter("min");
		String max = (String)req.getParameter("max");

		//確認出力
		System.out.println("キーワード : "+ searchKey +" 最低額 : "+ min +" 最高額 : "+ max);

		//モデル呼び出し
		SSearchModel search = new SSearchModel();
		ArrayList slist = search.getSyouhin(searchKey, values, min, max, null);


		if(slist == null){

			//該当商品無しメッセージをセット
			s.setAttribute("NONE_ITEM", "商品が見つかりませんでした");

			//情報を出力
			System.out.println("商品が見つかりませんでした");

		} else {

			//該当商品無しメッセージを初期化
			s.setAttribute("NONE_ITEM", "");

			//商品情報をセッションにセット
			s.setAttribute("ITEM", slist);

		}

		//検索条件をセッションにセット
		s.setAttribute("SEARCHKEY", searchKey);
		s.setAttribute("AREA", values);
		s.setAttribute("MIN", min);
		s.setAttribute("MAX", max);
		System.out.println("検索条件セッションセット完了");

		//ビューの呼び出し
		RequestDispatcher dp = req.getRequestDispatcher("shopKensaku.jsp");
		dp.forward(req, resp);
	}
}