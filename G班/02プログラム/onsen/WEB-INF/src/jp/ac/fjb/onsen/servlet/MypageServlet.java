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



public class MypageServlet extends HttpServlet {

	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {

		HttpSession s = req.getSession();	// セッション
		String jspName = "Mypage.jsp";// 遷移先JSP名
		// 【ビューの呼び出し】
		RequestDispatcher dp = req.getRequestDispatcher(jspName);
		dp.forward(req, resp);
	}
}
