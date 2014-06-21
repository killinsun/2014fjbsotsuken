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



public class MTourokuhenkouServlet extends HttpServlet {

	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {

		HttpSession s = req.getSession();		// セッション
		String jspName = "Tourokuhenkou.jsp";	// 遷移先JSP名

		String sei = req.getParameter("sei");
		String mei = req.getParameter("mei");
		String seibetu = req.getParameter("seibetu");
		String data = req.getParameter("data");
		String mail = req.getParameter("mail");
		String tel = req.getParameter("tel");
		String yubin = req.getParameter("yubin");
		String todouhuken = req.getParameter("todouhuken");
		String address = req.getParameter("address");
		String address2 = req.getParameter("address2");

		// 【ビューの呼び出し】
		RequestDispatcher dp = req.getRequestDispatcher(jspName);
		dp.forward(req, resp);
	}
}
