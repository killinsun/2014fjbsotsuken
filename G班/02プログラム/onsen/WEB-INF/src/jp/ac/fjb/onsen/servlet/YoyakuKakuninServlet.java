package jp.ac.fjb.onsen.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import sun.rmi.server.Dispatcher;

public class YoyakuKakuninServlet extends HttpServlet {

	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// TODO 自動生成されたメソッド・スタブ
		//文字コードの設定
		req.setCharacterEncoding("UTF-8");


		//画面遷移
		RequestDispatcher dispatcher = req.getRequestDispatcher("yoyakuKanryo.jsp");

		//フォワードの実行
		dispatcher.forward(req, resp);
	}
}