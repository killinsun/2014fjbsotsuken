package jp.ac.fjb.onsen.servlet;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import jp.ac.fjb.onsen.bean.SyouhinBean;
import jp.ac.fjb.onsen.bean.UserBean;
import jp.ac.fjb.onsen.model.STopModel;
import jp.ac.fjb.onsen.model.LoginModel;



public class MKounyuServlet extends HttpServlet {

	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {

		HttpSession s = req.getSession();	// セッション
		String jspName = "Kounyu.jsp";// 遷移先JSP名
		UserBean loginUser = (UserBean) s.getAttribute("LOGIN_USER");
		STopModel sm = new STopModel();
		ArrayList<SyouhinBean> rlist =sm.getHistory(loginUser.getUserID());
		s.setAttribute("KOUNYU",rlist);
		// 【ビューの呼び出し】
		RequestDispatcher dp = req.getRequestDispatcher(jspName);
		dp.forward(req, resp);
	}
}
