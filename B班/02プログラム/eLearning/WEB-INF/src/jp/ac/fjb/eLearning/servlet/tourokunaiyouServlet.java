package jp.ac.fjb.eLearning.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class tourokunaiyouServlet extends HttpServlet {

	public void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {


		// 【ビューの呼び出し（ログインの次の画面に遷移）】
		RequestDispatcher dp = req.getRequestDispatcher("menu.jsp");
		dp.forward(req, resp);
	}

}