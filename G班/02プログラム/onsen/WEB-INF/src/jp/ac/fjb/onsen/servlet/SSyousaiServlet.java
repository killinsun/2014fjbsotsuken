package jp.ac.fjb.onsen.servlet;

import java.io.IOException;
import java.sql.ResultSet;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import jp.ac.fjb.onsen.bean.SyouhinBean;
import jp.ac.fjb.onsen.util.DBManager;


public class SSyousaiServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {

		HttpSession s = req.getSession();
		SyouhinBean syouhin = new SyouhinBean();
		DBManager dm = new DBManager();

		String i = (String)req.getParameter("syouhinID");
		System.out.println("選択された商品:" + i);

		try {
			dm.openDB();
			ResultSet rs = dm.selectSQL("select * from 商品表 where 商品番号='" + i + "'");
			rs.next();
			syouhin.setSyouhinName(rs.getString("商品名"));
			syouhin.setImagepass(rs.getString("画像パス"));
			syouhin.setSyouhinzyouhou(rs.getString("商品情報"));
			syouhin.setTanka(rs.getString("単価"));
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			dm.closeDB();
		}


//		if(accese.equals("ShopTop")) {
//			if(i < 3) {
//				slist = (ArrayList<SyouhinBean>)s.getAttribute("OSUSUME_ITEM");
//			} else if(i < 6) {
//				slist = (ArrayList<SyouhinBean>)s.getAttribute("HISTORY_ITEM");
//				i -= 3;
//			} else {
//				slist = null;
//			}
//		} else {
//			slist = (ArrayList<SyouhinBean>)s.getAttribute("ITEM");
//		}


		s.setAttribute("SELECT_ITEM", syouhin);


		//ビューの呼び出し
		RequestDispatcher dp = req.getRequestDispatcher("shopSyousai.jsp");
		dp.forward(req, resp);
	}
}