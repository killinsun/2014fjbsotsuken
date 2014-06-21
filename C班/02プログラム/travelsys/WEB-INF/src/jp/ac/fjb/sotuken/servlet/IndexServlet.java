package jp.ac.fjb.sotuken.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class IndexServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {

		HttpSession s = req.getSession();			// セッション
		String planInfo = req.getParameter("planInfo");			//プラン情報を取得
		String planInfo2 = req.getParameter("planInfo2");			//プラン情報を取得

		//識別後、planIdのみを取得しセッションにセット
		s.setAttribute("PLAN_ID", planInfo);
		s.setAttribute("PLAN_NAME", planInfo2);
		System.out.println(planInfo);
		System.out.println(planInfo2);

		RequestDispatcher dp = req.getRequestDispatcher("SearchResultServlet");
		dp.forward(req, resp);
	}

}
