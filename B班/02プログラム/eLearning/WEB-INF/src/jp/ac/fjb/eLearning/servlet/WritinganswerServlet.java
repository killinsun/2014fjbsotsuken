package jp.ac.fjb.eLearning.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class WritinganswerServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// TODO 自動生成されたメソッド・スタブ

		RequestDispatcher dp = req.getRequestDispatcher("Writing answer.jsp");
		dp.forward(req, resp);
	}

}
