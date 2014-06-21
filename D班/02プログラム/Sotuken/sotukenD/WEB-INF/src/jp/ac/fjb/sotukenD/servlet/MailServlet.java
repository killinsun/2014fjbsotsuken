package jp.ac.fjb.sotukenD.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import jp.ac.fjb.sotukenD.bean.LoginFormBeans;
import jp.ac.fjb.sotukenD.bean.MailFormBeans;
import jp.ac.fjb.sotukenD.bean.MainFormBeans;
import jp.ac.fjb.sotukenD.model.MailModel;
import jp.ac.fjb.sotukenD.model.MainModel;

public class MailServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		HttpSession s = req.getSession();	// セッション

		MailModel model = new MailModel();

		LoginFormBeans user = (LoginFormBeans) s.getAttribute("LOGIN_USER");
		//String userId = "M001";
		String mailId = req.getParameter("mailId");
		//String mailId = "25";
		MailFormBeans mailB = model.getUser(user.getUserId(),mailId);

		s.setAttribute("USER_MAILJ", mailB);


		RequestDispatcher dp = req.getRequestDispatcher("/mail/mail.jsp");
		dp.forward(req, resp);
	}

}