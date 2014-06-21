package jp.ac.fjb.sns.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
public class UserListServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {

		// 遷移先JSPをユーザリスト画面に設定
		RequestDispatcher dp = req.getRequestDispatcher("A102UserList.jsp");
		dp.forward(req, resp);
	}
}
