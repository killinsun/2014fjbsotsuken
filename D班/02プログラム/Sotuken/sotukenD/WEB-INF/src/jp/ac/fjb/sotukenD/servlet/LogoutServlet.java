package jp.ac.fjb.sotukenD.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import jp.ac.fjb.sotukenD.model.LoginModel;
import jp.ac.fjb.sotukenD.bean.LoginFormBeans;

public class LogoutServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {

		String jspName = "";				// 遷移先JSP名

	    resp.setContentType("text/html; charset=UTF-8");
	    PrintWriter out = resp.getWriter();

	    HttpSession session = req.getSession(true);
	    session.invalidate();
	    jspName = "LoginServlet";

		// 【ビューの呼び出し】
		RequestDispatcher dp = req.getRequestDispatcher(jspName);
		dp.forward(req, resp);

	}

}
