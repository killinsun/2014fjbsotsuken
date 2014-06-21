package jp.ac.fjb.sotuken.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import jp.ac.fjb.sotuken.bean.UkewatasiBean;

public class PlanChangeServlet  extends HttpServlet {
	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {

		HttpSession s = req.getSession();	// セッション
		String jspName = "";				// 遷移先JSP名

		// IDとパスワードを取得
		String date = req.getParameter("date");
		String ninzu = req.getParameter("ninzu");

		UkewatasiBean uk=new UkewatasiBean();
		uk.setDate(date);
		uk.setNinzu(ninzu);
		s.setAttribute("UKEWATASI", uk);
		RequestDispatcher dp = req.getRequestDispatcher("/planChange.jsp");
		dp.forward(req, resp);

	}

}
