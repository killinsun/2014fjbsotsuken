package jp.ac.fjb.onsen.servlet;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import jp.ac.fjb.onsen.bean.UserBean;
import jp.ac.fjb.onsen.model.LoginModel;
import jp.ac.fjb.onsen.model.TourokuhenkouModel;



public class MTourokucommitServlet extends HttpServlet {

	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {

		req.setCharacterEncoding("UTF-8");
		HttpSession s = req.getSession();		// セッション
		String jspName = "MypageServlet";	// 遷移先JSP名
		UserBean user = (UserBean)s.getAttribute("LOGIN_USER");

		String sei = (String)req.getParameter("sei");
		String mei = (String)req.getParameter("mei");
		String mail = (String)req.getParameter("mail");
		String tel = (String)req.getParameter("tel");
		String yubin = (String)req.getParameter("yubin");
		String todouhuken = (String)req.getParameter("todouhuken");
		String address = (String)req.getParameter("address");
		String address2 = (String)req.getParameter("address2");

		TourokuhenkouModel tm = new TourokuhenkouModel();
		user = tm.setUser(sei, mei, tel, mail, yubin, todouhuken, address, address2, user.getUserID());
		s.setAttribute("LOGIN_USER", user);
		s.setAttribute("LOGIN_USERsei", user.getSei());

		// 【ビューの呼び出し】
		RequestDispatcher dp = req.getRequestDispatcher(jspName);
		dp.forward(req, resp);
	}
}
