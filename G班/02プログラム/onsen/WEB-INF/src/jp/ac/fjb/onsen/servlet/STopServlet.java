package jp.ac.fjb.onsen.servlet;

import java.io.IOException;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Calendar;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import jp.ac.fjb.onsen.bean.SyouhinBean;
import jp.ac.fjb.onsen.bean.UserBean;
import jp.ac.fjb.onsen.model.STopModel;
import jp.ac.fjb.onsen.util.DBManager;


public class STopServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {

		STopModel model = new STopModel();
		HttpSession s = req.getSession();//セッションを取得
		UserBean user = (UserBean)s.getAttribute("LOGIN_USER");//どのユーザがログインているか判別
		ArrayList<SyouhinBean> olist = new ArrayList<SyouhinBean>();//おすすめを格納する
		ArrayList<SyouhinBean> hlist = new ArrayList<SyouhinBean>();//購入履歴を格納する


		//最終更新月を0にセット
		if(s.getAttribute("LAST_UPDATE") == null) {
			System.out.println("初回のアクセス");
			s.setAttribute("LAST_UPDATE", 0);
		}


		Calendar now = Calendar.getInstance();
		int old = new Integer((Integer)s.getAttribute("LAST_UPDATE")).intValue();//最終更新月を取得
		int nowDay = now.get(Calendar.MONTH) + 1;//現在の月を取得
		System.out.println("最終更新月は" + old + "月、今日は" + nowDay + "月");


		//最終更新月と現在の月が同じでないならばおすすめ商品を更新する
		if(old != nowDay) {
			System.out.println("おすすめ商品を更新");
			olist = model.getOsusume();
			System.out.println("最終更新日を更新");
			s.setAttribute("LAST_UPDATE", nowDay);
			System.out.println("おすすめ商品をセッションに格納");
			s.setAttribute("OSUSUME_ITEM", olist);
		}


		//ユーザがログインしていれば購入履歴を取得する
		if(user != null) {
			System.out.println("購入履歴を取得");
			hlist = model.getHistory(user.getUserID());
			s.setAttribute("HISTORY_ITEM", hlist);
		}


		//ビューの呼び出し
		RequestDispatcher dp = req.getRequestDispatcher("ShopTop.jsp");
		dp.forward(req, resp);

	}
}