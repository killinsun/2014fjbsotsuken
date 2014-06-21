package jp.ac.fjb.sotukenD.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class ForScheduleConServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// TODO 自動生成されたメソッド・スタブ

		String month = req.getParameter("x");
		String day = req.getParameter("y");

		RequestDispatcher dp = req.getRequestDispatcher("/Schedule/scheduleCon.jsp");
		dp.forward(req, resp);
	}

}
