package jp.ac.fjb.sotukenD.servlet;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import jp.ac.fjb.sotukenD.bean.MainFormBeans;
import jp.ac.fjb.sotukenD.model.MainModel;

public class MainServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {

		HttpSession s = req.getSession();	// セッション

		MainModel model = new MainModel();

		String userId = req.getParameter("userID");
		ArrayList<MainFormBeans> mailj = model.getUser(userId);

		s.setAttribute("USER_MAIL", mailj);

		RequestDispatcher dp = req.getRequestDispatcher("main.jsp");
		dp.forward(req, resp);

	}

}
