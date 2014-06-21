package jp.ac.fjb.onsen.servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Calendar;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import jp.ac.fjb.onsen.bean.OnsenBean;
import jp.ac.fjb.onsen.bean.UserBean;
import jp.ac.fjb.onsen.model.OSearchModel;
import jp.ac.fjb.onsen.model.OSyousaiModel;
import jp.ac.fjb.onsen.model.SSearchModel;

import sun.rmi.server.Dispatcher;

public class OYoyakuServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// TODO 自動生成されたメソッド・スタブ
		//文字コードの設定
		req.setCharacterEncoding("UTF-8");

		HttpSession s = req.getSession();

		String jspName = "/OKakuninServlet";

		if(s.getAttribute("LOGIN_USER") == null){
			jspName = "Login.jsp";
		}

		//画面遷移
		RequestDispatcher dispatcher = req.getRequestDispatcher(jspName);

		//フォワードの実行
		dispatcher.forward(req, resp);
	}
}
