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

public class SSortServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		//文字コードセット
		req.setCharacterEncoding("UTF-8");
		//セッション取得
		HttpSession s = req.getSession();

		//ソート条件を取得
		String sort = (String)req.getParameter("sortID");

		//検索条件を取得
		String key = (String)s.getAttribute("SEARCHKEY");
		String area[] = (String[])s.getAttribute("AREA");
		String min = (String)s.getAttribute("MIN");
		String max = (String)s.getAttribute("MAX");

		//確認出力
		System.out.println("キーワード : "+ key +" 最低額 : "+ min +" 最高額 : "+ max);
		System.out.println("ソートID : "+ sort);

		//モデル呼び出し
		SSearchModel search = new SSearchModel();
		ArrayList slist = (ArrayList)search.getSyouhin(key, area, min, max, sort);

		//取得情報検査
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

		//ビューの呼び出し
		RequestDispatcher dp = req.getRequestDispatcher("shopKensaku.jsp");
		dp.forward(req, resp);
	}
}
