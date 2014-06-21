package jp.ac.fjb.sotuken.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import jp.ac.fjb.sotuken.bean.UserBean;
import jp.ac.fjb.sotuken.model.LoginModel;

public class LogoutServlet extends HttpServlet {

	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {

		HttpSession s = req.getSession();	// セッション
		String jspName = "";				// 遷移先JSP名
			// メニュー画面に遷移

		jspName = "login.jsp";


		// 【ビューの呼び出し】
		RequestDispatcher dp = req.getRequestDispatcher(jspName);
		dp.forward(req, resp);
	}

}
